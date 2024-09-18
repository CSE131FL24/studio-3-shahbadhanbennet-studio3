package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		System.out.println("what number do you want to find all prime numbers up to");
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt();
		int[] numberArray = new int[n-1];
		int count = 2;
		int currentNum =2;
		boolean[] ifnotPrime = new boolean[n-1];
		for (int i=0; i < n-1; i++) {
			numberArray[i] = count;
			count++;
			System.out.println(numberArray[i]);
			System.out.println(ifnotPrime[i]);
			
		}// fill up array
		for (int j = 0; j<n-1;j++ ) {
			for (int i=currentNum-2; i<n-1; i+=currentNum) {
				ifnotPrime[i] = true;
				if (i== currentNum-2) {
					ifnotPrime[i] = false;
					
					
				}
	//			currentNum = currentNum + 1;
	//			if (ifnotPrime[currentNum-2] == true)
	//			{
	//				currentNum = currentNum + 1;
	//			}
				
			}
			currentNum++;
		}
//		
//		for (int i=currentNum-2; i < n-1; i+=currentNum) {
//			if (i == currentNum-2);
//				ifPrime[
// }
				       
		
		
		
		
		
	}
}
		
		
		
		




