from collections import deque
import sys
input = sys.stdin.readline
N,M = map(int,input().split())
S = []

dx = [0,0,-1,1]
dy = [-1,1,0,0]
minute = 0

for i in range(N) :
	S.append(list(map(int,input().split())))

while True : 
	zero_arr = []
	one_arr = []
	zeroV = [[0 for _ in range(M)] for _ in range(N)]
	oneV = [[0 for _ in range(M)] for _ in range(N)]
	island = 0
	minute += 1
	
	for i in range(N) :
		for j in range(M) :
			if S[i][j] == 0:
				zero_arr.append([i,j])	
			
	for zy,zx in zero_arr :
		zeroV[zy][zx] = 1
		for b in range(4) :
			ny = zy + dy[b]
			nx = zx + dx[b]
			if ny < 0 or nx < 0 or ny >= N or nx >= M :
				continue
			if zeroV[ny][nx] or S[ny][nx] == 0 :
				continue
			zeroV[ny][nx] = 1
			S[ny][nx] = 0
	
	for a in range(N) :
		for b in range(M) :
			oneQ = deque()
			if oneV[a][b] or S[a][b] == 0 :
				continue
			oneQ.append([a,b])
			oneV[a][b] = 1

			while oneQ :
				oy,ox = oneQ.popleft()
				for b in range(4) :
					ny = oy + dy[b]
					nx = ox + dx[b]
					if ny < 0 or nx < 0 or ny >= N or nx >= M :
						continue
					if oneV[ny][nx] or S[ㄴny][nx] == 0 :
						continue
					oneV[ny][nx] = 1
					oneQ.append([ny,nx])
			island += 1
	
	cnt = 1
	for sand in S :
		if 1 in sand :
			cnt = 0
			break
				
	if cnt == 1 :
		minute = -1
		break
	elif island > 1 :
		break
	
print(minute)