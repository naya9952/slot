import java.util.Scanner;

public class Human_input {
	

public int input_coin;
public Scanner input = new Scanner(System.in);
public int set;
	public int money() {
		System.out.println("�ڼ��� : �󸶸� �����Ͻðڽ��ϱ�? : ");
		input_coin = input.nextInt();	
		return input_coin;	
	}

	public int how_much() {
		System.out.println("�ڼ��� : ��¥�� ���� �Ͻðڽ��ϱ�? : ");
		input_coin = input.nextInt();	
		return input_coin;
	}
}
