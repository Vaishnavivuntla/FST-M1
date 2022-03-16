# Given tuple
t = input("Enter numbers with space seperator: ")
num_tuple = tuple(int(x) for x in t.split())
#num_tuple = (10, 20, 33, 46, 55)
print("Given list is ", num_tuple)
print("Elements that are divisible by 5:")
for num in num_tuple:
    if (num % 5 == 0):
        print(num)