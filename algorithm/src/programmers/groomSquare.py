# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
import sys
input = sys.stdin.readline
N = int(input())
ans = 1
time_table = []

for i in range(N) :
	s,e = map(int,input().split())
	time_table.append([s,e])
	
time_table.sort(key=lambda x:x[1])

cur = time_table[0]
for i in range(1,N) :
	if cur[1] + 1 <= time_table[i][0] :
		cur = time_table[i]
		ans += 1

print(ans)