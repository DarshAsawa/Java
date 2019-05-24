
import java.io.*;
public class Inp_Out {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("C:\\Users\\dasaw\\Documents\\Java_git\\File_IO\\Input.txt");
         out = new FileWriter("C:\\Users\\dasaw\\Documents\\Java_git\\File_IO\\output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
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