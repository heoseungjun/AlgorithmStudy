def solution(order):
    answer = 0; idx = 0; box = 1
    stack = []
    
    for box in range(1, len(order)+1) :
        if box == order[idx] :
            answer += 1; idx += 1
            if len(stack) > 0 :
                while stack[len(stack)-1] == order[idx] :
                    answer += 1; idx += 1
                    stack.pop()
                    if len(stack) == 0 : break
                
        elif box != order[idx] :
            stack.append(box)
        
    return answer
order = [4,3,1,2,5]
print("택배기사가 원하는 택배상자 순서 : ",order)
print("1~n번 박스까지 차례로 나올 때 옮길 수 있는 박스 수 : ",solution(order))