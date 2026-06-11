import java.util.*;
public class palodrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ori=n;

        int rev=0,rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }

        if(ori==rev){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }


        
    }
    
}
