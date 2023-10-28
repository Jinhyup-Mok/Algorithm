cnt = int(input())
tmp = str(input()).split(' ')
tree = [int(node) for node in tmp]
remove = int(input())

tree[remove] = -9

def check_removed(idx):
    if idx == -1 or idx == -9:
        return idx
    else:
        idx = tree[idx] 
        return check_removed(idx)

for idx in range(cnt):
    if check_removed(idx) == -9:
        tree[idx] = -9

leaf_cnt = 0

for idx in range(cnt):
    if tree[idx] != -9 and idx not in tree:
        leaf_cnt += 1

print(leaf_cnt)