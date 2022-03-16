def calculate_sum(numbers):
	sum = 0
	for number in numbers:
		sum += number
	return sum
numList = list(int(num) for num in input("Enter the list items separated by space ").strip().split())
print("list is: ", numList)
result = calculate_sum(numList)
print("The sum of all the elements is: " + str(result))