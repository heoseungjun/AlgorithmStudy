def solution(rows, columns, queries):
    answer = []
    # 행렬 만들기
    matrix = []
    num = 1
    for row in range(rows) :
        list = []
        for col in range(columns) :
            list.append(num)
            num += 1
        matrix.append(list)
    
    # 행렬 회전
    for i in range (0,len(queries)) :
        x1 = queries[i][0]-1
        y1 = queries[i][1]-1
        
        first = matrix[x1][y1]
        min_val = 10000
        width = queries[i][3]-y1
        height = queries[i][2]-x1
        until = width*height - (width-2)*(height-2) + 1
        for j in range(1, until) :
            if(j < height) :
                matrix[x1][y1] = matrix[x1+1][y1]
                x1 += 1
            elif(j >= height and j < height+width-1) :
                matrix[x1][y1] = matrix[x1][y1+1]
                y1 += 1
            elif(j >= height+width-1 and j < height*2+width-2) :
                matrix[x1][y1] = matrix[x1-1][y1]
                x1 -= 1
            elif(j >= height*2+width-2 and j < until-1) :
                matrix[x1][y1] = matrix[x1][y1-1]
                y1 -= 1
            elif(j==until-1) : matrix[x1][y1] = first
            min_val = min(min_val,matrix[x1][y1])
        answer.append(min_val)
    return answer

rows = 6
columns = 6
queries = [[2,2,5,4],[3,3,6,6],[5,1,6,3]]
result = solution(rows,columns,queries)
print(rows,"행 ",columns,"열 행렬")
print("회전 구간 : ",queries)
print("회전 시 위치가 바뀐 숫자들 중 가장 작은 숫자들의 집합 : ",result)