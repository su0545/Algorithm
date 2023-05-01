import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String N =sc.next();  
        int sum = 0;
        int[ ] num = new int[4];
        
        for ( int i =0; i < N.length(); i++) {
            num[i] = N.charAt(i) - '0';
            sum += num[i];
        }
        System.out.println(sum);
 
	}
}