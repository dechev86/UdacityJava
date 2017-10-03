

public class CarMilage {

	public static void main(String[] args) {
		int gasCost = 0;
		int totalCost = 0;
		int car1=15000;
		int car1mpg=10;
		int car2=30000;
		int car2mpg=50;
		int milesDriven = 50000;
		 
		
		System.out.println("Car 1 total cost is:"+(car1+((milesDriven/car1mpg)*4)));
		System.out.println("Car 2 total cost is:"+(car2+((milesDriven/car2mpg)*4)));
		

	}

}
