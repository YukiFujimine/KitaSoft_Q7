import java.util.*;
public class Q7_5{
	 public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		CoinCase calc=new CoinCase();
		int num=10;
		for(int i=0;i<num;i++){
			System.out.print("硬貨の種類を入力してください>");
			int type=scan.nextInt();
			System.out.print("硬貨の枚数を入力してください>");
			int count=scan.nextInt();
			calc.AddCoins(type,count);
			System.out.println();
		}
		System.out.println("500円は"+calc.GetCount(500)+"枚");
		System.out.println("100円は"+calc.GetCount(100)+"枚");
		System.out.println("50円は"+calc.GetCount(50)+"枚");
		System.out.println("10円は"+calc.GetCount(10)+"枚");
		System.out.println("5円は"+calc.GetCount(5)+"枚");
		System.out.println("1円は"+calc.GetCount(1)+"枚");
		System.out.println("総額は"+(calc.GetAmount())+"円");
	}
}
