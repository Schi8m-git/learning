public class Game{
	public static void main(String[] args){
		
		Wizard wizard = new Wizard();
		Unit[] units = 
		{new Bird(),
		 new Bird(),
		 new Bird(),
		 new Wizard(),
		 new Wizard()
		};
		for (int i = 0; i<units.length;i++){
			units[i].move();
		}
	}
}