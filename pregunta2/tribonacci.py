n = int(input())
lis = [0,1,1]
f = lambda _ : lis.append(sum(lis[-3:]))
ans = any(map(f, range(n)))
print(lis[:n])