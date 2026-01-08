package tasks;

public class Employee extends Person1{

	
	    int id;
	    double salary;

	    Employee(String n, int a, int i, double s) {
	        super(n, a);
	        id = i;
	        salary = s;
	    }

	    void show() {
	        System.out.println(name + " " + age + " " + id + " " + salary);
	    }

	    public static void main(String[] args) {
	        Employee e = new Employee("Pooja", 22, 101, 30000);
	        e.show();
	    }
	}



