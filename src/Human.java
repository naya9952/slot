import java.util.Scanner;
public class Human {
	public Cajino cajino;
	public SlotMachine slot;
	public Scanner input = new Scanner(System.in);
	protected int readyMoney = 100000;
	protected int investMoney;
	public boolean check_money= true;
	
	public Human(SlotMachine slot){
		this.slot = slot;
	}

	public void check() {
		System.out.println("�ڼ��� : ���Ըӽ��� �ڸ��� ���ִ��� �˾ƺ��ϴ�.");
		if(slot.check() == true){
			System.out.println("�ڼ��� : ���Ըӽſ� �ɽ��ϴ�.");
			slot.change();
		}
		else {
			System.out.println("�ڼ��� : ����ڰ� �̹� �ֽ��ϴ�.");
		}
	}
	
	public void ask_rule() {
		System.out.println("�ڼ��� : ���Ըӽ��� ��Ģ�� ����ϴ�");
		slot.rule();	
	}
	
	public void insert_money() {
		while(check_money)
		{
			System.out.println("�󸶸� �����Ͻðڽ��ϱ�? : ");
			investMoney = input.nextInt();
			if(investMoney > readyMoney )
			{
				System.out.println("���ñݾ��� ���� �ݾ׺��� �����ϴ�.");
				investMoney = 0;
			}
			else
			{	
				check_money = false;
				readyMoney = readyMoney - investMoney;
				System.out.println("�ڼ��� : ���Ըӽſ� " +this.investMoney+"�� �����մϴ�.");
				slot.insert(this.investMoney);
			}
		}	
	}
	
	public void take_out() {
		investMoney =slot.endGame();
		readyMoney = investMoney + readyMoney;
		System.out.println("�ڼ��� : �� " + readyMoney + "���� �����Ͽ����ϴ�.");
	}
	
	public void enter(Cajino cajino) {
		System.out.println("�ڼ��� : ī���뿡 ����ϴ�.");
	}
	
	public void play() {
		System.out.println("�ڼ��� : ���� ������ ���ϴ�.");
		slot.game_go();				
	}
	
}
