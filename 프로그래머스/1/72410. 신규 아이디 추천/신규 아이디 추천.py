import re
def solution(new_id):
    answer = ''
    
    id = new_id.lower() # 소문자
    
    id = re.split('[~!@#$%^&*()=+{}:?,<>/\[\]]', id) # 특수문자 제거
    id = ''.join(id) # ''구분자를 기준으로 id배열에 있는 원소들을 합친다!
    
    while ".." in id: # 두번이상 연속된 부분을 하나의 마침표로 치환
        id = id.replace('..','.')
        
    # 내 코드
    # if id[0] == '.': id = id[1:]
    # if len(id) and id[-1] == '.': id = id[:-1]
    # 더 깔끔한 코드
    if id.startswith('.'): id = id[1:]
    if id.endswith('.'): id = id[:-1]
    
    if not len(id): id += 'a' # 아이디의 길이가 최소 3자이상이기 때문에 a 3개 대입!!
    
    if len(id) > 15: id = id[:15]
    
    if id.endswith('.'): id = id[:-1]
    
    if len(id) <= 2: 
        while len(id) < 3: id += id[-1]
        
    return id