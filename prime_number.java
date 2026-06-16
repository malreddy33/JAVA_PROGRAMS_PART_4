import java.util.*;
public class prime_number {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count =0;

        for(int i=1;i<=n;i++){
            if(n%i == 0){
                count =count+1;
            }
            if(count > 2){
                break;
            }
        }

        if(count ==2){
            System.out.print(" a prime number");
        }else{
            System.out.print("not a prime number");
        }
    }
    
}
