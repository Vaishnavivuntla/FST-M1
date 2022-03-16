numbers = list(input("Enter a sequence of space separated values: ").split(" "))
print('list: ', numbers)
sum = 0
for number in numbers:
  sum += int(number)
print(sum)