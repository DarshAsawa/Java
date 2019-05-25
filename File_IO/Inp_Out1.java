import java.io.*;
public class Inp_Out1{
public static void main(String args[]) throws IOException{
FileInputStream obj_inp=null;
FileOutputStream obj_out=null;
try{
obj_inp=new FileInputStream("Input.txt");
obj_out=new FileOutputStream("output.txt");
 int c;
 while((c=obj_inp.read())!=-1){
 obj_out.write(c);
 }
 } finally{			/*The finally keyword is used in association 
 with a try/catch block and guarantees that a section of code will be 
 executed, even if an exception is thrown.*/
 if(obj_inp!=null)
 {
 obj_inp.close();
 }
 if(obj_out!=null){
 obj_out.close();
 }
 }
 }
 }
 