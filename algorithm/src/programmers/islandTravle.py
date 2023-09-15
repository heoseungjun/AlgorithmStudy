def solution(maps):
    answer = []
    N,M = len(maps),len(maps[0])
    direct = [[0,1],[1,0],[0,-1],[-1,0]]
    V = [[0]*M for _ in range(N)]
    
    for y in range(N) :
        for x in range(M) :
            if maps[y][x] != "X" and not V[y][x]:
                answer.append(bfs(maps,y,x,N,M,V,direct))
                        
    if len(answer) : return sorted(answer)         
    else : return [-1]

def bfs(maps,y,x,N,M,V,direct) :
    V[y][x] = 1
    Q = [(y,x)]
    tmp = 0
    while Q :
        ny,nx = Q.pop()
        tmp += int(maps[ny][nx])
        for d in direct :
            a,b = d
            cy,cx = ny,nx
            if -1<cx+a<M and -1<cy+b<N and maps[cy+b][cx+a]!="X" and not V[cy+b][cx+a]:
                cy += b; cx += a
                V[cy][cx] = 1
                Q.append((cy,cx))
    return tmp

maps = ["X591X","X1X5X","X231X", "1XXX1"]

for i in range(len(maps)) :
    print(maps[i])

print("\n무인도와 무인도에서 얻을 수 있는 식량 : ",solution(maps))