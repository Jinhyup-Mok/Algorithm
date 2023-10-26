# 첫번째 풀이
def solution(id_list, report, k):
    answer = []
    answer = [0 for i in range(len(id_list))]
    report = list(set(report))
    cnt = [0 for i in range(len(id_list))]
    
    reports = {x:[] for x in id_list}
    
    for i in report:
        a = i.split(" ")
        reports[a[0]].append(a[1])
        cnt[id_list.index(a[1])] += 1
    
    ban = []
    for i in range(len(cnt)):
        if cnt[i] >= k: ban.append(id_list[i])
            
    
    for i in range(len(ban)):
        for k, v in reports.items():
            if ban[i] in reports[k]:
                answer[id_list.index(k)] += 1
            
        
    return answer

# 두번째 풀이
def solution(id_list, report, k):
    answer = [0] * len(id_list)    
    reports = {x : 0 for x in id_list}

    for r in set(report):
        reports[r.split()[1]] += 1

    for r in set(report):
        if reports[r.split()[1]] >= k:
            answer[id_list.index(r.split()[0])] += 1

    return answer