from collections import Counter

def solution(clothes):
    
    clo_dict = Counter(category for clothe, category in clothes)
    comb = 1
    
    for v in clo_dict.values():
        comb *= (v + 1)
    
    return comb-1