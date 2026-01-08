package tasks;

public class Person {
	int age=18;
	String name;
	//Default constructor
	Person(){
		age=18;
			
	}
	//parameterized constructor
	Person(String a,int b){
		this.age=b;
		this.name=a;
		
	}
	//display method
	void display() {
		System.out.println("name="+this.name);
		System.out.println("age="+this.age);
	}

	public static void main(String[] args) {
		Person p=new Person("pooja",18);
		
		p.display();
		
		
	}

}
