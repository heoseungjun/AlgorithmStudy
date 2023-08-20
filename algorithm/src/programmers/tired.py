from itertools import permutations
def solution(k, dungeons):
    answer = 0
    for order in permutations(dungeons,len(dungeons)) :
        tmp = k; tired = 0
        for i in range(len(dungeons)) :
            if order[i][0] <= tmp :
                tmp -= order[i][1]
                tired += 1
        answer = max(answer,tired)
        
    return answer

k = 80
dungeons = [[80,20],[50,40],[30,10]]

print("주어진 피로도 : ",k)
print("던전별 최소 필요 피로도 & 소모 피로도 : ",dungeons)
print("탐색 가능한 던전 수의 최댓값 : ",solution(k,dungeons))