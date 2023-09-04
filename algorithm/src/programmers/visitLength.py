def solution(dirs):
    answer = 0
    direct = {'U':[0,1], 'D':[0,-1], 'L':[-1,0], 'R':[1,0]}
    V = []
    nx,ny = 0,0
    
    for d in dirs :
        cx,cy = nx,ny
        nx += direct[d][0]
        ny += direct[d][1]
        
        if nx<-5 or nx>5 or ny<-5 or ny>5 :
            nx -= direct[d][0]
            ny -= direct[d][1]
            continue
        if [nx,ny,cx,cy] in V :
            continue
        if [cx,cy,nx,ny] not in V :
            answer += 1
        
        V.append([cx,cy,nx,ny])
    
    return answer

dirs = "ULURRDLLU"
print("-5<=x<=5, -5<=y<=5를 만족하는 좌표평면이 있습니다.")
print("좌표평면의 [0,0]부터 시작해 \"",dirs,"\" 명령대로 움직였을 때 처음 방문하는 좌표의 수 : ",solution(dirs))