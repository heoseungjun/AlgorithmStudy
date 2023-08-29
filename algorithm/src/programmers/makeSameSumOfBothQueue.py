from collections import deque
def solution(queue1, queue2):
    total = sum(queue1) + sum(queue2)
    if total % 2 : return -1
    
    answer = 0
    Q1,Q2 = deque(queue1),deque(queue2)
    S1,S2 = sum(Q1),sum(Q2)
    total_div = total // 2
    
    for _ in range(len(queue1)*3) :    
        if S1 < S2 :
            S1 += Q2[0]
            S2 -= Q2[0]
            Q1.append(Q2.popleft())
            answer += 1
            
        elif S1 > S2:
            S1 -= Q1[0]
            S2 += Q1[0]
            Q2.append(Q1.popleft())
            answer += 1
            
        else :
            return answer

    return -1

queue1 = [1,2,1,2]
queue2 = [1,10,1,2]

print("queue1 : ",queue1,"queue2 : ",queue2)
print("두 큐의 합을 서로 같게 만드는 작업의 최소 횟수 : ",solution(queue1,queue2),"회")