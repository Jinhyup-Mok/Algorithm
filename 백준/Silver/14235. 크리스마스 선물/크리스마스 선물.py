from queue import PriorityQueue

cnt = int(input())

gift = PriorityQueue()

for i in range(cnt):
    tmp = str(input()).split(' ')
    if tmp[0] == '0':
        if gift.empty():
            print(-1)
        else:
            print(gift.get() * -1)
    else:
        for j in range(int(tmp[0])):
            gift.put(int(tmp[j + 1]) * -1)