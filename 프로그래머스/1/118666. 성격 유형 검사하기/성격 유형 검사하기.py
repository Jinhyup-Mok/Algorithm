def solution(survey, choices):
    answer = ''
    score = [-9,-3,-2,-1,0,1,2,3]
    personality = {'R':0, 'T':0, 'C':0, 'F':0, 'J':0, 'M':0, 'A':0, 'N':0}
    surveys = {x:0 for x in survey}
    
    for i in range(len(choices)):
        surveys[survey[i]] += score[choices[i]]
        
    for k, v in surveys.items():
        if v >= 0: personality[k[1]] += v
        else: personality[k[0]] += v
        
    keys = list(personality.keys())
    
    p = 0
    while p < len(personality):
        if abs(personality[keys[p]]) >= abs(personality[keys[p+1]]):
            answer += keys[p]
        else :
            answer += keys[p+1]
            
        p += 2
        
        
        
    
            
    return answer