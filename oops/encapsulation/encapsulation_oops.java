import java.util.Scanner;

class encapsulation{
	private String Name;
	private int age;
	public String getName(){
		return Name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String x){
		Name=x;
	}
	public void setAge(int y){
		age=y;
	}
}
public class encapsulation_oops{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
			
		encapsulation obj=new encapsulation();
		String name;
		int age;
		int n;
		int i=1;
		//lets put a while loop in this..
		while(i<=2){
			
		System.out.println("Enter your name : ");
		name=scn.next();
		System.out.println("Enter your age : ");
		age=scn.nextInt();
		obj.setName(name);
		obj.setAge(age);
		System.out.println("Let's verify the entered details..");
		System.out.println("You have entered your : ");
		System.out.println("Name : "+obj.getName()+"	Age : "+obj.getAge());
		System.out.println("Is the data correct? press 1 to confirm and 0 to re-enter");
		n=scn.nextInt();
		if(n==1){
			break;
		}
		else if(n==0){
			System.out.println("re enter the details");
		}
		else{
			System.out.println("Wrong input..");
			break;
		}
		
		
		
		}
	}
}