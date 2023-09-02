package core;
//encapsulation->to wrapping up data into single unit

class User {
	private int id;
	private String name;
	
	User(){
		
	}
	User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void showData() {
		System.out.println("id : " + id + " name : " + name);
	}
	@Override
	public String toString() {
		return "id : "+id+"name : "+name;
	}
}

public class encapsulation {
  public static void main(String[] args) {
		User u = new User(1, "java");
		System.out.println(u);
//		u.setId(13);
//		u.id = 14;
//		System.out.println(u.getId());
//		System.out.println(u.getName());
	}
}
