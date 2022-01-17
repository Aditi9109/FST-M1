totalcount = int(input("Enter total list count "))
mylist = []

for i in range(1,totalcount+1):
    num = int(input("enter element num "+str(i)+" : "))
    mylist.append(num)

print("My list : "+str(mylist))

if mylist[0]==mylist[-1]:
    print('True')
else:
    print('False')
