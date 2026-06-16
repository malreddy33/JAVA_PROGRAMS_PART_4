n=int(input("enter the number: "));
first=0;
second=1;

print(first ,second ,end=" ")

for i in range(2,n+1):
    next=first+second;
    first=second;
    second=next;
    
    
    print(next ,end=" ")


