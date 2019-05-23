//program showing method overloading and method overriding.
class polymorphism{
	//constructor overloading...
public polymorphism(){	
System.out.println("This is the default constructor of polymorphism class");
}
public polymorphism(String Name){
	System.out.println("This is the parameterized constructor.. and ur name is "+Name);
}
//method overloading..
	public static int sum(int x,int y ){
		return x+y;
	}
	public static int sum(int x,int y,int z){
		return x+y+z;
		
	}
	
}
public class polymorphism_oops extends polymorphism{
	//method overridiing.
	public static int sum(int x,int y){
		return x-y+y+y;
	}
	
	public static void main(String args[]){
		polymorphism obj=new polymorphism();
		polymorphism obj1=new polymorphism("Darsh");
		polymorphism_oops ob=new polymorphism_oops();
		System.out.println("2 parameter 'sum' method from super class. Output is : "+obj.sum(2,5));
		System.out.println("3 parameter 'sum' method from super class. Output is : "+obj.sum(4,5,6));
		System.out.println("2 parameter 'sum' method from this class. Output is : "+this.sum(2,5));
	}
}

	