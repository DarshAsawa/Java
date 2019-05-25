import java.util.Scanner;

import java.io.*;
public class Complete_IO {

   public static void main(String args[]) throws IOException {
      //THESE TWO USED FOR READING AND WRITING..
	  FileReader in = null;
	
	  
	  FileWriter out = null;
	  
	  //INPUT FILE
	  //FILE EXISTENCE IS CHECKED.
	   	  
	  Scanner scn=new Scanner(System.in);
	  
	  System.out.println("Enter the file name(w/ location) from which you want to take the input: ");
      String Input_name=scn.next();
	  
	  File Input_File=null;
	  
	   
	 
	  try {
         Input_File=new File(Input_name);
		 
		 if(Input_File.createNewFile()){
			 System.out.println("File you mentioned didnt exist so creating new file.");
			 System.out.println("Enter data into the file :");
			
				 BufferedReader obj1 = new BufferedReader(new InputStreamReader(System.in));

      //read a line from the console
      String lineFromInput = obj1.readLine();

      //create an print writer for writing to a file
    FileOutputStream out1 = new FileOutputStream(Input_name);
		byte b1[]=lineFromInput.getBytes();
		out1.write(b1);
			
      //close the file (VERY IMPORTANT!)
      out1.close();
			 
		 }
else {
System.out.println("Input file exists");

}
		 in = new FileReader(Input_name);


		 //OUTPUT FILE 
		 System.out.println("Enter the file name(w/ location) in which you want to give the output: ");
	  String Output_name=scn.next();
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