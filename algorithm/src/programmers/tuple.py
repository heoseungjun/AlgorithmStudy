def solution(s):
    answer = []
    arr = s.split("},{")

    arr[0] = arr[0].replace("{{","")
    arr[len(arr)-1] = arr[len(arr)-1].replace("}}","")
    arr.sort(key = lambda x:len(x))
    
    for i in range(len(arr)) :
        new = arr[i].split(",")
        for j in range(len(new)) :
            if int(new[j]) not in answer :
                answer.append(int(new[j]))
        
    return answer

s = "{{2},{2,1},{2,1,3},{2,1,3,4}}"

print("주어진 튜플 : ",s)
print("최종 리스트 : ",solution(s))