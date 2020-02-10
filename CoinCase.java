public class CoinCase{
	String Type;

	int coinC500=0;
	int coinC100=0;
	int coinC50=0;
	int coinC10=0;
	int coinC5=0;
	int coinC1=0;

	CoinCase(){
	}
	void AddCoins(int type,int count){
		switch(type){
			case 500:
				coinC500+=count;
				break;
			case 100:
				coinC100+=count;
				break;
			case 50:
				coinC50+=count;
				break;
			case 10:
				coinC10+=count;
				break;
			case 5:
				coinC5+=count;
				break;
			case 1:
				coinC1+=count;
				break;
		}
		}

	 int GetCount(int type){
		switch(type){
			case 500:
				return coinC500;
			case 100:
				return coinC100;
			case 50:
				return coinC50;
			case 10:
				return coinC10;
			case 5:
				return coinC5;
			case 1:
				return coinC1;
			}
		return 0;
		}
		public int GetAmount(){
			return(500*coinC500+100*coinC100+50*coinC50+10*coinC10+5*coinC5+1*coinC1);
	}
}
