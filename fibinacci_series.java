import java.util.*;
public class fibinacci_series {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int first=0, second=1;

        System.out.print(first +" "+second+" ");
        for(int i=2;i<=n;i++){

            int next=first+second;
            first=second;
            second=next;

            System.out.print(second+" ");
        }

    }
    
}
