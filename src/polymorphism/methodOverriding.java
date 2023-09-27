package polymorphism;
class user{
	String name;
	int age;
	user(String n, int a){
		this.name=n;
		this.age=a;
	}
	public void display() {
		System.out.println("name :"+name);
		System.out.println("age :"+age);
	}
}
class Mainprogrammer extends user{
	String companyName;
	Mainprogrammer(String n, int a,String c){
		super(n,a);
		this.companyName=c;
	}
public void display() {
	System.out.println("name :"+name);
	System.out.println("age :"+age);
	System.out.println("company name :"+companyName);
}
}
public class methodOverriding {

	public static void main(String[] args) {
		Mainprogrammer obj= new Mainprogrammer("chandana", 23, "shimakh");
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
