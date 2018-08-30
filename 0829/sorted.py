n = int(input())
print(n)


lists = [input().split(",") for i in range(n)]
print(sorted(lists,key = lambda x: (x[0],x[1],x[2]),reverse = True))

