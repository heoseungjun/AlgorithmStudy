def solution(cards):
    answer = 0
    for i in range(len(cards)-1) :
        arr = cards.copy()
        tmp = 1
        for j in range(i,i+2) :
            cnt = 0
            while True :
                if arr[j] == 0 : break
                num = arr[j] - 1
                arr[j] = 0
                j = num
                cnt += 1
            tmp *= cnt
        answer = max(answer,tmp)
    return answer

cards = [8,6,3,7,2,5,1,4]
print("1번 상자 그룹 X 2번 상자 그룹의 최댓값 : ",solution(cards))