import java.util.*;
public class polidrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ori=n;

        int rev=0;

        while( n != 0){
            rev=rev*10+n%10;
            n /= 10;
        }

        if(ori == rev){
            System.out.print("polidrome");
        }else{
            System.out.print("not polidrome");
        }
    }
    
}
