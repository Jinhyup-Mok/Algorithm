a = int(input())
b = list(map(int, input()))
anw = 0
b_ = b.reverse()

for i in range(len(b)):
    print(a*b[i])
    anw += a*b[i] * 10**i
print(anw)
