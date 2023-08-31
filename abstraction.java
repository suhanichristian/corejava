package core;

//abstraction-> hiding internal details and showing 
//				only essential information to user
//			->abstract and non-abstract both functions are allowed
//			->if function is abstract than class also should be abstract
//			->object of abstract class is not possible/don't create
//			->abstract class should be inherited	
abstract class Member{
	int id;
	String name;
	abstract public void setId(int id);//abstract function
	abstract public void setName(String name);//method declaration
	public static void run() {
		System.out.println("run methods");
	}
}
class Teacher extends Member{

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		System.out.println("id : "+id);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		System.out.println("name : "+name);
	}
	
}
class Student1 extends Member{

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		System.out.println("id : "+id);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		System.out.println("name : "+name);
	}
	
}
public class abstraction {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.setId(12);
		t1.setName("java");
		t1.run();
		Teacher.run();
		Student1 s = new Student1();
		s.setId(10);
		s.setName("python");
	}
}