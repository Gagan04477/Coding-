
public class twoSum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int len = arr.length;
        int n = 3;
        for (int i = 0; i < len; i++) {
            for (int j = i+1 ; j < len; j++) {
                int sum = arr[i] + arr[j];
                if (j == len) {
                     i++;
                }
                 
                if (sum == n) {
                    System.out.println("The sum is found in  " +i+" " + j);
                }
            }

        }
    }
}
