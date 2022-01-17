list1 = [1,2,3,4,5,6,7,8,9]
list2 = [10,11,12,13,14,15,16,17,18,19]

mylist=[]

for i in list1:
    if i%2==0:
        pass
    else:
        mylist.append(i)

for j in list2:
    if j%2==0:
        mylist.append(j)
    else:
        pass

print(mylist)