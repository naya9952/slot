import java.util.Scanner;
public class Menu {
public static int select;
public Scanner input = new Scanner(System.in);

	public int view() {
		System.out.println("-----슬롯머신-----");
		System.out.println("1. insert coin ");
		System.out.println("2. play");
		System.out.println("3. exit ");
		System.out.println("슬롯머신 : 번호를 선택하세요... ");
		select = input.nextInt();
		switch(select){
		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			return 3;
		default: 		
			return 4;
		}
	}
	
	
}
