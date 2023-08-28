def solution(n, k):
    answer = 0; idx = 0
    change = ""
    num = []
    
    while n > 0 :
        mod = n % k
        change += str(mod)
        n = n//k
    change = change[::-1]
    
    for i in range(len(change)) :
        if change[i] == "0" :
            num.append(int(change[idx:i]))
            idx = i
        if i == len(change)-1 :
            num.append(int(change[idx:]))
    
    for i in range(len(num)) :
        check = 0
        if num[i] < 3 :
            if num[i] == 2 : answer += 1
            continue
        for j in range(2,int(num[i]**(1/2))+1) :
            if num[i] % j == 0 :
                check = 1
                break
        if check == 0 :
            answer += 1
        
    return answer

n = 437674
k = 3
print(n,"을",k,"진수로 변환했을 때 찾을 수 있는 소수 개수 : ",solution(n,k))