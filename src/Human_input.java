import java.util.Scanner;

public class Human_input {
	
public boolean check_money;
public int input_coin;
public Scanner input = new Scanner(System.in);

	public int money(int readyMoney) {
		check_money = true;
		while(check_money)
		{
			System.out.println("�ڼ��� : �󸶸� �����Ͻðڽ��ϱ�? : ");
			input_coin = input.nextInt();
			if(input_coin > readyMoney )
			{
				System.out.println("�ڼ��� : ���ñݾ��� ���� �ݾ׺��� �����ϴ�.");
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
