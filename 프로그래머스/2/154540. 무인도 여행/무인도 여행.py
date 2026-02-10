import sys
sys.setrecursionlimit(10**6)

def solution(maps):
    R = len(maps)
    C = len(maps[0])
    parent = [i for i in range(R * C)]
    food = [0] * (R * C)
    
    for r in range(R):
        for c in range(C):
            if maps[r][c] != 'X':
                food[r * C + c] = int(maps[r][c])

    def find(x):
        if parent[x] != x:
            parent[x] = find(parent[x])
        return parent[x]

    def union(a, b):
        rootA = find(a)
        rootB = find(b)
        if rootA != rootB:
            if rootA < rootB:
                parent[rootB] = rootA
                food[rootA] += food[rootB]
            else:
                parent[rootA] = rootB
                food[rootB] += food[rootA]

    dr, dc = [0, 0, 1, -1], [1, -1, 0, 0]
    for r in range(R):
        for c in range(C):
            if maps[r][c] == 'X': continue
            
            for i in range(4):
                nr, nc = r + dr[i], c + dc[i]
                if 0 <= nr < R and 0 <= nc < C and maps[nr][nc] != 'X':
                    union(r * C + c, nr * C + nc)

    answer = []
    for i in range(R * C):
        if maps[i // C][i % C] != 'X' and parent[i] == i:
            answer.append(food[i])
            
    return sorted(answer) if answer else [-1]