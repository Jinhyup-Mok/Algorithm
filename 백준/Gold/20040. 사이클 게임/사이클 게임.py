import sys
sys.setrecursionlimit(200000)

input = sys.stdin.readline

tmp = str(input()).split(' ')

cnt = int(tmp[0])
line = int(tmp[1])

cycle = [i for i in range(cnt)]

def parent_find(idx):
    if idx == cycle[idx]:
        return idx
    else:
        cycle[idx] = parent_find(cycle[idx])
        return cycle[idx]

def union(node1, node2):
    node1_parent = parent_find(node1)
    node2_parent = parent_find(node2)
    if node1_parent > node2_parent:
        node1_parent, node2_parent = node2_parent, node1_parent

    if node1_parent == node2_parent:
        return True
    else:
        cycle[node2_parent] = node1_parent
        return False
         
rt = 0

for i in range(line):
    tmp = str(input()).split(' ')
    node1 = int(tmp[0])
    node2 = int(tmp[1])
    if union(node1, node2):
        rt = i + 1
        break

print(rt)