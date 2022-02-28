import java.util.Scanner;

public class isPrime1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int i=1; i*i<=n; i++){
            if(n%i==0)
                count++;
        }if(count==1)
            System.out.println("The given number is prime");
        else
            System.out.println("The given number is not prime");

    }
}
