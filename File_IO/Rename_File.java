import java.io.*;
import java.util.Scanner;

public class Rename_File{
public static void main(String args[]) throws IOException{
Scanner scn=new Scanner(System.in);

	String change;
	System.out.println("Enter the file name with its proper path whose"+ 
	" name you wanna change ");
	change=scn.next();
	File exsFile=new File(change);
	System.out.println("Enter the new name for the file with its location.");
	String newname=scn.next();
	
	File newFile=new File(newname);
	
	boolean Flag=exsFile.renameTo(newFile);
	 
	if(Flag){
		System.out.println("file name Successfully changed.");
	}
	else{
		System.out.println("File name can't be changed.");
	}
	

}
}
