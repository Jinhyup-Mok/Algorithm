from collections import defaultdict

def solution(data, ext, val_ext, sort_by):
    answer = []
    val_data = []
    
    data_dict = defaultdict(list)
    sort_idx = {"code": 0, "date": 1, "maximum": 2, "remain": 3}
    
    for code, date, maximum, remain in data:
        data_dict["code"].append(code)
        data_dict["date"].append(date)
        data_dict["maximum"].append(maximum)        
        data_dict["remain"].append(remain)
        
    

    val_data.append(data_dict.get(ext))
    
    print(data_dict)
    print(val_data)
    
    for vd in range(len(val_data[0])):
        if val_data[0][vd] < val_ext:
            row = [
                data_dict["code"][vd],
                data_dict["date"][vd],
                data_dict["maximum"][vd],
                data_dict["remain"][vd]
            ]
            answer.append(row)
        
    answer.sort(key=lambda x: x[sort_idx[sort_by]])
    
    return answer