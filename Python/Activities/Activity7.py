totalcount = int(input("Enter total list count "))
mylist = []

for i in range(1,totalcount+1):
    num = int(input("enter element num "+str(i)+" : "))
    mylist.append(num)

print("My list : "+str(mylist))

sum = 0;
for eachEle in mylist:
    sum= sum + eachEle

print("Sum of element in List :"+str(sum))