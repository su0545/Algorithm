import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        
        System.out.println(N*(N+1)/2);
    }
}