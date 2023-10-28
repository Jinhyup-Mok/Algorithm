tmp = str(input()).split(' ')
n = int(tmp[0])
w = int(tmp[1])
L = int(tmp[2])

bridge = [0 for i in range(w)]

truck = str(input()).split(' ')
time = 0

while truck != [] or sum(bridge) != 0:
    bridge.pop(0)

    if truck != []:
        next_value = int(truck[0]) 
        if (sum(bridge) + next_value) <= L:
            bridge.append(next_value)
            truck.pop(0)
        else:
            bridge.append(0)
    else:
        bridge.append(0)
    time += 1

print(time)