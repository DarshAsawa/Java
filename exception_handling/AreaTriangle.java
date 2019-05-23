import java.util.Scanner;
import java.lang.*;
class Areatriangle{
public static void main(String args[]){

int a,b,c;
Scanner input=new Scanner(System.in);
System.out.println("Enter the value for first side : ");
a=input.nextInt();
System.out.println("Enter the value for second side :");
b=input.nextInt();
System.out.println("Enter the value for third side : ");
c=input.nextInt();
double s=(a+b+c)*0.5;
double ar=s*(s-a)*(s-b)*(s-c);

if((a>=b+c)||(b>=a+c)||(c>=a+b))
{
try{ throw new ArithmeticException();}

catch(ArithmeticException e){
System.out.println("Forming this triangle is not possible");}
}
else {
System.out.println("Area of the triangle is: "+Math.pow(ar,0.5));
}
}
}
