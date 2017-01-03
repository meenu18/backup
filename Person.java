
public class Person {
	int age;
	String name;
	
	public Person()
	{
		System.out.println("I will be automatically executed");
	}
	
	
	public Person (int id, String name, int rollno)
	{
		System.out.println("Id is "+id);
		System.out.println("Name is "+name );
		System.out.println("rollno "+ rollno);
	}
	
	public void showPerson()
	{
		System.out.println("Age is " +age);
		System .out.println("Name is "+name);
	}

}
