n=int(input("enter the number: "));
ori = n;
rev=0;

while n != 0:
    rev=rev*10+n%10;
    n //= 10;
    
    
if ori == rev:
    print("polidrome")
else:
    print("not polidrome")