from itertools import product
def solution(word):
    num = 1
    alpha = ["A","E","I","O","U"]
    dictionary = []
    for i in range(5) :
        for order in product(alpha,repeat=num) :
            dictionary.append(''.join(order))
        num += 1
        
    dictionary.sort()
    
    answer = dictionary.index(word) + 1
    
    return answer

word = "AAAIE"
print("모음 사전에서 "+word+"는 "+str(solution(word))+"번째 단어입니다.")