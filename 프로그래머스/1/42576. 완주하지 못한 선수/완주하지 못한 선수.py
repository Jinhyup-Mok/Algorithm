from collections import Counter

def solution(participant, completion):   
    return list(Counter(participant)-Counter(completion))[0]
 
    
#    for key in completion:
#        participant_dict[key] -= 1
#
 #   for key, values in participant_dict.items():
  #      if values != 0:
   #         return key * values
        
        