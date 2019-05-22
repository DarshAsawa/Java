class vehicle{
public static void type(String type){
System.out.println("The vehicle is of the type: "+type);
}
}

class bike extends vehicle{
public static void speed(int kmph){
System.out.println("The speed of the bike is: "+kmph+" kmph");
}
}

public class Inheritance_oops extends bike{
public static void main(String args[]){
bike obj=new bike();
obj.type("BIKE");
obj.speed(68); 
}
}
