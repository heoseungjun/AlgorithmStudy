from itertools import permutations
def solution(numbers):
    answer = 0
    case = set()
    
    for i in range(1,len(numbers)+1) :
        cur = ""
        for j in permutations(numbers,i) :
            str = "".join(j)
            case.add(int(str))
        
    lst = list(case)
    print(lst)
    for i in range(len(lst)) :
        if net(lst[i]) : answer += 1
    
    return answer

def net(cur) :
    cnt = 0
    if cur < 2 : 
        return False
    
    for i in range(2,cur) :
        if cur % i == 0 : return False
    
    return True

numbers = "17"
print("\""+numbers+"\""+"에서 가능한 수 조합과 해당 조합에서 소수 개수 : ")
print(solution(numbers),"개")