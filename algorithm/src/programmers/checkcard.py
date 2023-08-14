# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
from collections import deque
import sys
input = sys.stdin.readline
N,M = map(int,input().split())
wait = deque()

for _ in range(M) :
	deal = input().split()
	money = int(deal[1])
	
	if deal[0] == "deposit" :
		N += money
		while len(wait) > 0 and N >= wait[0]:
			N -= wait[0]
			wait.popleft()
				
	elif deal[0] == "pay" :
		if N >= money : N -= money
			
	else :
		if len(wait) == 0 and N >= money : N -= money
		else : wait.append(money)
		
print(N)
