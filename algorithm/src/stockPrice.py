def solution(prices):
    Stack = []
    answer = [0] * len(prices)
    
    for i in range(len(prices)) :
        while len(Stack) > 0 and Stack[-1][1] > prices[i] :
            idx,_ = Stack.pop()
            answer[idx] = i-idx
        Stack.append([i,prices[i]])
   
    for i,s in Stack :
        answer[i] = len(prices) - i - 1
        
    return answer

prices = [3,2,4,1,0]
print("초별 주식가격 : ",prices)
print("초별 가격이 몇 초 동안 유지되는가 : ",solution(prices))