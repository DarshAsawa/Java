import java.util.Scanner;
/*
Factorial of a number,
eg. 5! is 5*4*3*2*1 = 120
*/
public class Factorial {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter the desired number: ");
		n=scan.nextInt();

		System.out.println(n+"!= "+factorial_num(n));
		scan.close();
	}

	public static long factorial_num(int i){
		if (i<0){
			System.out.println("Factorial of any number below 0 is not possible");
		}
		long num_fac = 1;
		for (int j = i; j>=1; j--){
			num_fac *= j;
		}
		return num_fac;
	}


}