
class even implements Runnable{
    public void run(){
    	  System.out.println("Even numbers:");
        for(int i=0;i<11;i+=2) {
            System.out.println(i);
		
        }
    }
}

class odd implements Runnable{
    public void run(){
        System.out.println("Odd numbers:");
        for(int i=1;i<=11;i+=2) {
           System.out.println(i);
        }
    }
}
public class Prog2 {

    public static void main(String[] args) {
        even r = new even();
        Thread t = new Thread(r);
       odd r2 = new odd();
        Thread t2 = new Thread(r2);
      
        t.start();
    
        t2.start();
    }
}

