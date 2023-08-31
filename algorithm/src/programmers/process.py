from collections import deque
def solution(priorities, location):
    answer = 0
    num = [i for i in range(len(priorities))]
    
    I,Q = deque(num), deque(priorities)
    
    while Q :
        max_val = max(Q)
        cur = Q.popleft()
        idx = I.popleft()
        if cur != max_val :
            Q.append(cur)
            I.append(idx)
        else :
            answer += 1
            if idx == location :
                return answer

priorities = [2, 1, 3, 2]
location = 2

print("큐의 각 원소들의 우선순위 : ",priorities)
print("큐의 ",location,"번 인덱스의 값이 실행되는 순서 : ",solution(priorities,location),"번째")