
import java.util.Scanner;

public class prime{
     public static boolean isprime(int n){

        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
     }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        
        if(isprime(n)){
            System.out.println("this is prime number.");

        }else{
            System.out.println("this is not a prime number");
        }
        scanner.close();
    }
}

    
        

