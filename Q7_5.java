import java.util*;
public class Q7_5{
	pablic static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		CoinCase calc=new CoinCase();
		int num=10;
		for(int i=0;i<num;i++){
			System.out.print("硬貨の種類を入力してください>");
			int type=scan.nextInt();
			System.out.print("硬貨の枚数を入力してください>");
			int count=scan.nextInt();
			calc.AddCoins(type,count);
		}
		System.out.println("500円は"+calc.GetCount(500)+"枚");
		System.out.println("100円は"+calc.GetCount(100));
		System.out.println(calc.GetCount(50));
		System.out.println(calc.GetCount(10));
		System.out.println(calc.GetCount(5));
		System.out.println(calc.GetCount(1));

	}
}
