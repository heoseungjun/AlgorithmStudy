from collections import deque
import math
def solution(board):
    W,H = len(board[0]),len(board)
    dx,dy = [0,0,-1,1],[-1,1,0,0]
    Q = deque()
    V = [[10e9 for _ in range(W)] for _ in range(H)]

    for i in range(H) :
        for j in range(W) :
            if board[i][j] == "R" :
                Q.append([i,j,0])
                V[i][j] = 0
                break
         
    while Q :
        y,x,dist = Q.popleft()
        
        if board[y][x] == "G" :
            return dist
        
        for i in range(4) :
            ny,nx = y,x
            while 0 <= nx+dx[i] < W and 0 <= ny+dy[i] < H and board[ny+dy[i]][nx+dx[i]] != "D" :
                nx += dx[i]
                ny += dy[i]
            
            if V[ny][nx] > dist :
                V[ny][nx] = dist + 1
                Q.append([ny,nx,dist + 1])

    return -1

board = ["...D..R", ".D.G...", "....D.D", "D....D.", "..D...."]
print("[주어진 보드]\n")
for i in range(len(board)) :
    print(board[i])

print("\n\"G\"로 이동하기 위한 최소 횟수(이동 불가 하다면 -1) : ",solution(board))