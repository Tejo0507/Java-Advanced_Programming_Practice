def addition(n): 
    return n + n 

numbers = (1, 2, 3, 4) 
results = map(addition, numbers) 

print(results)

for result in results:
    print(result, end = " ")
