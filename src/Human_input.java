import java.util.Scanner;

public class Human_input {
	

public int input_coin;
public Scanner input = new Scanner(System.in);
public int set;
	public int money() {
		System.out.println("박성민 : 얼마를 투입하시겠습니까? : ");
		input_coin = input.nextInt();	
		return input_coin;	
	}

	public int how_much() {
		System.out.println("박성민 : 얼마짜리 배팅 하시겠습니까? : ");
		input_coin = input.nextInt();	
		return input_coin;
	}
}
