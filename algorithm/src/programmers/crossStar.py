def solution(line):
    stars = []
    answer = []
    x_max = y_max = -int(1e15)
    x_min = y_min = int(1e15)
    
    # 교점 구하기
    for i in range(len(line)) :
        a,b,e = line[i]
        for j in range(i+1, len(line)) :
            c,d,f = line[j]
            if(a*d - b*c != 0) :
                x = (b*f - e*d) / (a*d - b*c)
                y = (e*c - a*f) / (a*d - b*c)
                
            # 교점 중 정수 쌍만 구하기
            if(x % 1.0 == 0 and y % 1.0 == 0) :
                x = int(x)
                y = int(y)
                stars.append([x,y])
                # 교점이 있는 x와 y의 최소 범위 ~ 최대 범위 구하기
                if(x_min > x) : x_min = x
                if(y_min > y) : y_min = y
                if(x_max < x) : x_max = x
                if(y_max < y) : y_max = y
    
    # 해당 범위만큼 점 찍기
    x_len = x_max - x_min + 1
    y_len = y_max - y_min + 1
    coord = [['.'] * x_len for _ in range(y_len)]
    
    # 교점에 해당하는 점은 별로 바꾸기
    for star_x, star_y in stars :
        nx = star_x + abs(x_min) if x_min < 0 else star_x - x_min
        ny = star_y + abs(y_min) if y_min < 0 else star_y - y_min
        coord[ny][nx] = "*"
        
    for result in coord : answer.append(''.join(result))
    # answer을 거꾸로 리턴
    return answer[::-1]

line = [[2, -1, 4], [-2, -1, 4], [0, -1, 1], [5, -8, -12], [5, 8, 12]]
print("교점에 별 찍기 수행 결과 : ",solution(line))