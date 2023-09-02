package core;
//streams
//1.in->user input
//2.out->print stream
//3.err->error msg

class abc{

          public void run() {
        	  System.out.println("hello run method");
        	  
          }
       
}

public class first {
     public static void main(String[] args) {
		System.out.println("hello java");
		abc obj = new abc();
		obj.run();
	}

}
