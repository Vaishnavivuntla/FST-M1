# Given list of numbers
numList = list(input("Enter a list of number with space seperator: ").split(" "))
print('list: ', numList)
print("Given list is ", numList)
firstElement = numList[0]
lastElement = numList[-1]
if (firstElement == lastElement):
    print(True)
else:
    print(False)