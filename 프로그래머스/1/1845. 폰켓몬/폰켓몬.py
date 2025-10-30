from collections import Counter

def solution(nums):
    
    max_nums = len(nums)/2
    pkm = len(list(Counter(nums)))
    
    
    return max_nums if pkm > max_nums else pkm