def solution(n):
    if(n==1) : return [1]

    arr = [[0]*i for i in range(1,n+1)]
    direct = row = col = 0
    
    for num in range(1,int(n*(n+1)/2)+1) :
        if(direct % 3 == 0) :
            arr[row][col] = num
            row += 1
            if(row == n-1 or arr[row+1][col] != 0) :
                direct += 1
                
        elif(direct % 3 == 1) :
            arr[row][col] = num
            col += 1
            if(col == n-1 or arr[row][col+1] != 0) :
                direct += 1
                
        else :
            arr[row][col] = num
            row -= 1; col -= 1
            if(arr[row][col] != 0) :
                row += 2; col += 1; direct += 1
                 
    return sum(arr,[])

n = 5
print("n = ",n,"일 때 삼각 달팽이(1차원 배열) : ",solution(n))