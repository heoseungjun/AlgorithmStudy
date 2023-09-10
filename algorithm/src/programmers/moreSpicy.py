import heapq
def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)
    while scoville[0] < K :
        if len(scoville) < 2 : return -1
        new = heapq.heappop(scoville) + heapq.heappop(scoville) * 2
        heapq.heappush(scoville,new)
        answer += 1
        
    return answer

scoville = [1,2,3,9,10,12]
K = 7
print("섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)")
print("음식의 스코빌 지수 : ",scoville)
print("만들어야 하는 스코빌 지수 : ",K)
print("모든 음식의 스코빌 지수를 ",K,"이상으로 만들기 위한 횟수 : ",solution(scoville,K))