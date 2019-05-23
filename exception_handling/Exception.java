class Exc0{
public static void main(String args[]){
try{
int d,a;
d=0;
a=42/0;
System.out.println("This method will not be printed");
}
catch(ArithmeticException e){
System.out.println("Error");}
}
}
