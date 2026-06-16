import java.util.*;
public class armsstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ori=n;
        int sum=0;

        while(n != 0){
            int digit=n%10;
            sum += digit*digit*digit;
            n /= 10;
        }
        if(ori == sum){
            System.out.print("armstrong");
        }else{
            System.out.print("not armstrong");
        }

    }
    
}
