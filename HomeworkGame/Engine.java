import java.util.Scanner;
import java.lang.Math;
import java.lang.Object;

public class Engine{


	/**
	* Создаёт юнитов, генерирует им имя и создаёт отдельные 
	* массивы как для каждого класса юнитов, так и для всех сразу.
	*/
	
	public static void createHeroes(int[] numbersOfUnits, int numberOfMoves){
		int arrayLength = numbersOfUnits[0]+numbersOfUnits[1]+numbersOfUnits[2]+numbersOfUnits[3];
		Unit[] units = new Unit[arrayLength];
		Unit[] warr = new Unit[numbersOfUnits[0]];
		Unit[] wizz = new Unit[numbersOfUnits[1]];
		Unit[] birds = new Unit[numbersOfUnits[2]];
		Unit[] ikars = new Unit[numbersOfUnits[3]];

		for (int i = 0; i<numbersOfUnits[0];i++){
			warr[i] = new Warrior();
			warr[i].name = "Warrior"+(i+1);
			units[Unit.count] = warr[i];
			Unit.count++;
		}
		for (int i = 0; i<numbersOfUnits[1];i++){
			wizz[i] = new Wizard();
			wizz[i].name = "Wizzard"+(i+1);
			units[Unit.count] = wizz[i];
			Unit.count++;
		}
		for (int i = 0; i<numbersOfUnits[2];i++){
			birds[i] = new Bird();
			birds[i].name = "Bird"+(i+1);
			units[Unit.count] = birds[i];
			Unit.count++;
		}
		for (int i = 0; i<numbersOfUnits[3];i++){
			ikars[i] = new Ikar();
			ikars[i].name = "Ikar"+(i+1);
			units[Unit.count] = ikars[i];
			Unit.count++;
		}


		for (int i = 0;i<units.length;i++){
			units[i].createStats();
			units[i].attackRange = (((units[i].speed*arrayLength)/100)<1)? 1: (units[i].speed*arrayLength)/100;
			units[i].damage = (1-units[i].speed/100)*(units[i].attackPower);
			System.out.println(units[i].toString());
		}
		gamesMove(units, numberOfMoves);
	}


	public static void gamesMove(Unit[] units, int numberOfMoves){
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i<=numberOfMoves;i++){
			System.out.println("\n Ход №"+i);
			for (int k = 0; k<units.length;k++){

				if (units[k].health>0){
				int targetNumber = k+1;	
				for(int z = 0; z<units[k].attackRange;z++){
					if (targetNumber>=units.length){
						targetNumber = 0;
					}

					while (
						(units[targetNumber].status==Unit.LONG_DEAD)|
						(targetNumber==k)|
						(units[targetNumber].status==Unit.DEAD)
						){
						targetNumber++;
						if ((targetNumber)>=units.length){
						targetNumber = 0;
						}
					}

					if ((units[targetNumber] instanceof FlyingUnit)&(units[k] instanceof HickingUnit)){
						units[targetNumber].health -= (units[k].damage/2);
						units[targetNumber].checkStatus();

						if(units[targetNumber].status==Unit.ALIVE){
							System.out.println(units[k].name+
								" нанес "+(units[k].damage/2)+
								" урона "+units[targetNumber].name+
								", теперь у него "+
							units[targetNumber].health+" хп. Наземный -->> Летающий");
						} else if(units[targetNumber].status==Unit.DEAD){
							System.out.println(units[k].name+
								" нанес "+units[k].damage+
								" урона "+units[targetNumber].name+
								" и убил его. Наземный -->> Летающий");
						}
					} else{
						units[targetNumber].health -= units[k].damage;
						units[targetNumber].checkStatus();
						if(units[targetNumber].status==Unit.ALIVE){
							System.out.println(units[k].name+
								" нанес "+units[k].damage+
								" урона "+units[targetNumber].name+
								" , теперь у него "+
							units[targetNumber].health+" хп.");
						} else if(units[targetNumber].status==Unit.DEAD){
							System.out.println(units[k].name+
								" нанес "+units[k].damage+
								" урона "+units[targetNumber].name+
								" и убил его.");
						}
					}
						
						targetNumber++;
						boolean isOnlyOneAlive = scanAlives(units);
						if (isOnlyOneAlive){
							break;
						}
					}
				}
			}
			for (int g=0;g<units.length;g++){
				System.out.println(units[g].toString());
			}
			if (scanAlives(units)){
				break;
			}
		}	
	}


	public static boolean scanAlives(Unit[] units){
		int deadCounter = 0;
		int aliveCounter = 0;
		String winnerName = "";
		for (int i = 0; i<units.length; i++){
			if ((units[i].status=="dead")|(units[i].status=="longdead")){
				deadCounter += 1;
			} else {
				aliveCounter += 1;
			}
		}

		if (aliveCounter<=1){
			for (int j = 0; j<units.length; j++){
				if (units[j].status=="alive"){
					winnerName = units[j].name;
				}
			}
			System.out.println("Последний выживший "+ winnerName);
			return true;
		} else {
			return false;
		}
	}	
}