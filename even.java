import java.util.Scanner;

public class even{

    public static int Findeven(int n ){
        if(n%2==0){
            System.out.println("this is even");
        }else{
            System.out.println("this is odd number.");
        }return n;
    }
    public void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        Findeven(n);

    
    }
}