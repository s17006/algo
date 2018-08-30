#1行目の何列まであるのかをここで取る
n = int(input())

#for i in range(1,n+1):
#a = str(i)
#l = input().split(",")
#print(l)
lista = [input().split(",") for i in range(1,n+1)]
count = 1
men = 1
man = 1
hokaidou = []
for i in lista:
    if ('北海道' in i) and ('男' in i):
        i.append(count)
        i.append(men)
        count += 1
        men += 1
        hokaidou.append(i)
        a = [1 if x == '北海道' else x for in i]
        print(a)
    if ('北海道' in i) and ('女' in i):
        i.append(count)
        i.append(man)
        count += 1
        man += 1
        hokaidou.append(i)
