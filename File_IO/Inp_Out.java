import java.util.Scanner;

import java.io.*;
public class Inp_Out {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;
	  Scanner scn=new Scanner(System.in);
	  System.out.println("Enter the file name(w/ location) from which you want to take the input: ");
      String Input_name=scn.next();
	  System.out.println("Enter the file name(w/ location) in which you want to give the output: ");
	  String Output_name=scn.next();
	  
	  try {
         in = new FileReader(Input_name);
         out = new FileWriter(Output_name);
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
		 System.out.println("File Data Successfully Transfered");
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}