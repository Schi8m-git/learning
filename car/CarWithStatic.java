public class CarWithStatic	{
	static String car = "Детали машины: ";
	public static void main(String[] args){
		getWheels();
		getMotor();
		getSteeringWheel();
		getPedals();
		System.out.println(car);
	}	
	public static void getWheels(){
		String wheels = "Колеса, ";
		car = car + wheels;
	}
	public static void getMotor(){
 		String motor = "Мотор, ";
 		car = car + motor;
	}
	public static void getSteeringWheel(){
		String steeringWheel = "Руль, ";
		car = car + steeringWheel;
	}
	public static void getPedals(){
		String pedals = "Педали.";
		car = car + pedals;
	}		
}