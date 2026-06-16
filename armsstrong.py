n=int(input("enter the number: "));
ori = n;
sum=0;

while n != 0:
    digit = n%10;
    sum += digit*digit*digit;
    n //= 10;
    
if ori == sum:
    print("armstrong number ")
else:
    print("not armstrong number")