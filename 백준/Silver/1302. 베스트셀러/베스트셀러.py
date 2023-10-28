cnt = int(input())

hash = {}

for i in range(cnt):
    tmp = str(input())
    if tmp not in hash:
        hash[tmp] = 0
    hash[tmp] += 1

hash = dict(sorted(hash.items()))
print(list(hash.keys())[list(hash.values()).index(max(hash.values()))])