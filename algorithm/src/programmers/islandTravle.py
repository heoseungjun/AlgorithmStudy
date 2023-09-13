def solution(maps):
    answer = []
    N,M = len(maps),len(maps[0])
    direct = [[0,1],[1,0],[0,-1],[-1,0]]
    V = [[0 for _ in range(M)] for _ in range(N)]
    
    for y in range(N) :
        for x in range(M) :
            if maps[y][x] != "X" :
                if V[y][x] == 1 : continue
                V[y][x] = 1
                nx,ny = x,y
                tmp = int(maps[y][x])
                for k in range(4) :
                    cx,cy = nx+direct[k][0],ny+direct[k][1]
                    while 0<=cx<M and 0<=cy<N and maps[cy][cx]!="X" and V[cy][cx]==0:
                        nx,ny = cx,cy
                        cx += direct[k][0]
                        cy += direct[k][1]
                        V[ny][nx] = 1
                        tmp += int(maps[ny][nx])
                        print(ny,nx)
                answer.append(tmp)
                        
    if len(answer) == 0 : return [-1]           
    else : 
        answer.sort()
        return answer