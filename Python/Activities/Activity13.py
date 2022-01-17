

def calSum(myList):
    sum = 0
    for item in myList:
        sum= sum+item
    return sum  

list1 = [1,2,3,4,5,6,7,8,9]
total = calSum(list1)

print("Sum of list:"+str(total))
