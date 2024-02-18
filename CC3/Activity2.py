name = input("Enter your name:")
borrowed = float(input("Amount to be borrowed:"))
Days_to_pay = int(input("Days to pay:"))

#computation of interest

interest = 0.06
Computed_interest = borrowed * interest
Total_amount = Computed_interest + borrowed
Daily_pay = Total_amount / Days_to_pay

print(f"""
---------------------------------------
Name : {name.title()}
Amount to be borrowed: {borrowed}
Interest : {Computed_interest}
Total amount: {Total_amount}
Days to pay: {Days_to_pay}
Daily pay: {Daily_pay}
---------------------------------------
       """)
