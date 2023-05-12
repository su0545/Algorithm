import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
        
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int sum = 1;
        
        System.out.print("1 ");
        for (int i = 1; i <=N; i++) {
            System.out.print(2 * sum + " ");
            sum = 2 * sum;
        }
    }
}
    
    
		
		