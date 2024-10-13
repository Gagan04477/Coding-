import java.util.Scanner;

public class nNumber {
    public void main(String args[]){
        System.out.println("Enter the number of values:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        for(int i = 0;i<n;i++){
            if(i%2==0){
                System.out.println(i);
            }
            
        }
    }
    
}
