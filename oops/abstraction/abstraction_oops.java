abstract class hello{
	//declaration of a method is given.. abstract method cannot have a body..
public abstract void display(int x);

}
public class abstraction_oops extends hello{
	//overriding the abstract method 'display'..
	public void display(int x){
		System.out.println("the number u entered is: "+x );
	}
	public static void main(String args[]){
		abstraction_oops obj=new abstraction_oops();
		obj.display(5);
	}
}
