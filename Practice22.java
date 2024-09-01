class Employee{
	int empid;
	String name;
	double salary;
	Employee(int empid, String name, double salary){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	void view() {
		System.out.println("Name: "+name+"\nEmpID: "+empid+"\nSalary: "+salary);
	}
}
public class Practice22 {
	public static void main(String[] args) {
		Employee e1=new Employee(101,"SteJ",500000);
		e1.view();
	}
}