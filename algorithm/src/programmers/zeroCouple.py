# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
import sys
input = sys.stdin.readline
N = int(input())
people = list(map(int,input().split()))
print(sum(people))

