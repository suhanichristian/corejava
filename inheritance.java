package core;

//inheritance-> to access property of one class to another class
//5 types->1.Single 2.Multilevel 3.Multiple 4.Hierarchical 5.Hybrid
//multiple and hybrid not supported by java (ambiguity)
//1.Single
class p{
		p(){
			System.out.println("parent cons");
		}
		public void parentmethod() {
			System.out.println("parent method");
		}
}
class C extends p{
		public void childmethod() {
			System.out.println("child method");
		}
}
	
	//2.Multilivel
class GC extends C{
	public void GCmethod() {
		System.out.println("grand child method");
	}
}
class p1{
	
}
class C1 extends p1{
	
}
class C2 extends p1{
	
}
public class inheritance {
			public static void main(String[] args) {
				C c= new C();
				c.parentmethod();
				c.childmethod();
				GC g= new GC();
				g.parentmethod();
				g.childmethod();
				g.GCmethod();
			}
}
