
public class PriceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 0;
		double cost = 0;
		double tax = 0.08;
		double tip = 0.18;
		
		for (int i=1;i<=10;i++) {
			price=i;
			cost = (price + (price*tax) + (price*tip));
			
			System.out.println("The cost is:"+cost);
		}
		
	}

}
