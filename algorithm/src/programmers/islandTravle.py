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
            if -1<nx+a<M and -1<ny+b<N and maps[ny+b][nx+a]!="X" and not V[ny+b][nx+a]:
                ny += b; nx += a
                V[ny][nx] = 1
                Q.append((ny,nx))
    return tmp