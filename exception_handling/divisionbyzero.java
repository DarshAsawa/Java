import java.util.Scanner;

public class divisionbyzero{
public static void main(String args[]) {
	Scanner obj=new Scanner(System.in);
	int a,b;
	System.out.println("Enter two values: ");
	try{
		a=obj.nextInt();
		b=obj.nextInt();
		int c=a/b;
		System.out.println("value of c is "+c);
	}catch(ArithmeticException e){
		e.printStackTrace();
	}

}
}
