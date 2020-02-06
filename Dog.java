public class Dog{
	private String Name;
	int Age;
	String Type;

	public Dog(String type){
		this.Type=type;
	}

	public void SetName(String nm){
		this.Name=nm;
	}
	public void SetAge(int age){
		this.Age=age;
	}
	public void ShowProfile(){
		System.out.println("名前は、"+this.Name+"。年齢は"+this.Age+"歳です。");
		System.out.println("犬種は"+this.Type+"です。");
	}
}
