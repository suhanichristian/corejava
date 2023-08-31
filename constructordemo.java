package core;
//Constructor-> is special member function of class 
//which has same name as class name
//-> called automatically when object is created
//-> have no return type
//-> 3 types
//->1.Default 2.Parameterized 3.Copy(object cloning)

class cons{
	   int l,b;
	   cons() {
		   System.out.println("default cons");
	   }
	   cons(int l, int b){
		   this.l = l;
           this.b = b;
		   System.out.println("l = " +l+ "b = "+b);
		   System.out.println("area of rectangle = "+(l*b));
	   }
	   cons(double per){
	   System.out.println("para");
	   }
	   cons(String name){
		   System.out.println("para "+name);    
	   }
	   cons(double per,int i){
		   System.out.println("para with int : "+per+"i = "+i);
	   }
	   public void area() {
		   System.out.println("area of rectangle = "+(l*b));
	   }
}
class rectangle{
	int l,b;
	rectangle(cons c){
		this.l = c.l;
		this.b = c.b;
	}
	public void area() {
		System.out.println("area of rectangle = "+(l*b));
	}
}
public class constructordemo {
	public static void main(String[] args) {
	cons c = new cons(2,3);
	c.area();
	rectangle r = new rectangle(c);
	r.area();
	}
}

