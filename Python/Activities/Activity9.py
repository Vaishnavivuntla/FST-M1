# Given lists
listOne = list(input("Enter a First list of numbers with space seperator: ").split(" "))
listTwo = list(input("Enter a second list numbers with space seperator: ").split(" "))
print('list1: ', listOne)
print('list2: ', listTwo)
thirdList = []
for num in listOne:
    if (int(num) % 2 != 0):
        thirdList.append(num)
for num in listTwo:
    if (int(num) % 2 == 0):
        thirdList.append(num)
print("result List is:")
print(thirdList)