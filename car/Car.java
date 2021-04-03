public class Car{
	public static void main(String[] args){
		String car = "Детали для машины: ";
		
		car = getWheels(car);
		car = getMotor(car);
		car = getSteeringWheel(car);
		car = getPedals(car);
		System.out.println(car);

	}
	public static String getWheels(String str){
		String wheels = "Колеса, ";
		str = str + wheels;
		return str;
	}
	public static String getMotor(String str){
 		String motor = "Мотор, ";
 		str = str + motor;
 		return str;
	}
	public static String getSteeringWheel(String str){
		String steeringWheel = "Руль, ";
		str = str + steeringWheel;
		return str;
	}
	public static String getPedals(String str){
		String pedals = "Педали.";
		str = str + pedals;
		return str;
	}
}