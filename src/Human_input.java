import java.util.Scanner;

public class Human_input {
	
public boolean check_money;
public int input_coin;
public Scanner input = new Scanner(System.in);

	public int money(int readyMoney) {
		check_money = true;
		while(check_money)
		{
			System.out.println("박성민 : 얼마를 투입하시겠습니까? : ");
			input_coin = input.nextInt();
			if(input_coin > readyMoney )
			{
				System.out.println("박성민 : 배팅금액이 소지 금액보다 많습니다.");
				input_coin = 0;
			}
			else
			{	
				check_money = false;
			}
		}
		return input_coin;	
	}
}
