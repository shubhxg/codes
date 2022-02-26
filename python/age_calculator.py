import time
while True:
    print("THIS IS AN AGE CALCULATOR PROGRAM")
    time.sleep(1)
    name = input("ENTER YOUR NAME : ")
    print("HELLO " + name.upper())
    time.sleep(2)
    year = int(input("ENTER YOUR BIRTH YEAR : "))
    age = 2020 - year
    print("Ok... calculating age.... hmm....")
    time.sleep(1)
    print("It should be umm...")
    time.sleep(2)
    print("THIS IS YOUR AGE : " + str(age))
    c = input("Do you want to quit ? : ")
    if c == "y":
        break
    else:
        continue
