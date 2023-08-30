from collections import deque
def solution(s):
    answer = 0
    Q = deque(s)
    
    for i in range(len(s)) :
        Q.append(Q.popleft())
        Stack = []
        for j in range(len(Q)) :
            if len(Stack) < 1 :
                Stack.append(Q[j])
            else :
                if Stack[-1] == "[" and Q[j] == "]" :
                    Stack.pop()
                elif Stack[-1] == "{" and Q[j] == "}" :
                    Stack.pop()
                elif Stack[-1] == "(" and Q[j] == ")" :
                    Stack.pop()
                else : 
                    Stack.append(Q[j])
                                 
        if len(Stack) == 0 :
            answer += 1
        
    return answer

s = "[](){}"
print("주어진 괄호 : ",s)
print(s,"가 원상태로 돌아올 때까지 왼쪽으로 회전시켰을 때 올바른 괄호의 수 : ",solution(s),"개")