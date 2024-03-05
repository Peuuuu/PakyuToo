Years_in_Service = int(input("Number of years in service:"))
print("Office available: IT / ACCT / HR")
offices = input("Office:").upper()

print (f"""
__________________________________________
Office: {offices}
Years of Service : {Years_in_Service} """)

#more than 10 years in service
if Years_in_Service >= 10:
    if offices == "IT":
        print("Bonus:10,000")
    if offices == "ACCT":
        print("Bonus:12,000")
    if offices == "HR":
        print("Bonus:15,000")

#less tha 10 years in service
if Years_in_Service < 10:
    if offices == "IT":
        print("Bonus:5,000")
    if offices == "ACCT":
        print("Bonus: 6,000")
    if offices == "HR":
        print("Bonus:7,500")
