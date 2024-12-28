a = int(input())
b = int(input())
c = int(input())

maior1 = (a+b+abs(a-b))/2

if maior1>c:
    print(maior1," eh o maior")
else:
    print(c," eh o maior")
