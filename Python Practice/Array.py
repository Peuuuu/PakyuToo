# List Count   1         2        3      4       5         6        7  = LENGTH
Arrayko = ["Josephine","Faye","Audrey","Paz","Jazzmine","Faye","Josephine"]
print(Arrayko)

print("List Count: " + str(len(Arrayko)))
# Output=7

print("Count of Faye inside the Array:" + str(Arrayko.count("Faye")))
# format: list.count(value)
# Output: 2

#using the method "Append"
print("Append the word Ganda at the end of the Array:")
Arrayko.append("Ganda")
print(Arrayko)

print("Insert Jazzie at the third Index")
Arrayko.insert(3,"Jazzie") #start at zero
print(Arrayko)

print("remove Josephine on  your Array:")
Arrayko.remove("Josephine")
print(Arrayko)

print("Remove item on second index on you Array using Pop()")
Arrayko.pop(2)
print(Arrayko)

print("remove using del")
del Arrayko[2]
print(Arrayko)

