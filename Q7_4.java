public class Q7_4{
	public static void main(String[] args){
		Dog dog1=new Dog("シーズー");
		Dog dog2=new Dog("ポメラニアン");
		dog1.SetName("レオ");
		dog1.SetAge(3);
		dog2.SetName("サンディー");
		dog2.SetAge(8);
		dog1.ShowProfile();
		dog2.ShowProfile();
	}
}
