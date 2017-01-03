
public class Fish extends Animal{

	Fish(){
		System.out.println("Constructor Fish");
	}
	public void show(){
		// we can easily call a parent method in child class if both have different method name
		//animalMethod();
		// using super keyword for calling same method of parent call and this help in bye passing overriding
		super.show();
		System.out.println("Show Method of Fish");
	}
	//We are doing overloading when we initialize parameter after creating same method in a class
	public void show(int a){
		System.out.println("Method of fish " +a);
	}
	public void fishMethod(){
		System.out.println("This is only fish method");
	}
}
