public class Menu {
public static int select =3;
	public int menu_play(){
		
		
	return select;	
	}
	public int view() {
		System.out.println("-----½½·Ô¸Ó½Å-----");
		System.out.println("1. insert coin ");
		System.out.println("2. play");
		System.out.println("3. exit ");

		switch(select){
		case 1:
			return 1;

		case 2:
			return 1;
		case 3:
			return 3;
		default: 
			return 1;
		}
	}
	
	
}
