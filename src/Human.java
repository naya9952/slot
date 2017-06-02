import java.util.Scanner;
public class Human {
	public Cajino cajino;
	public SlotMachine[] slot;
	public Scanner input = new Scanner(System.in);
	protected int readyMoney = 100000;
	protected int investMoney;
	public boolean check_money= true;
	public int slot_num;
	
	public Human(Cajino cajino){
		this.cajino = cajino;
	}
	
	public Human(SlotMachine[] slot){
		this.slot = slot;
	}

	public Human(SlotMachine slotMachine) {
		// TODO Auto-generated constructor stub
	}

	public int check() {
		System.out.println("�ڼ��� : ���Ըӽ��� �ڸ��� ���ִ��� �˾ƺ��ϴ�.");
		slot_num= cajino.check();
		return slot_num;
	}
	
	public void ask_rule(int i) {
		System.out.println("�ڼ��� : ���Ըӽ��� ��Ģ�� ����ϴ�");
		slot[i].rule();	
	}
	
	public void insert_money() {
		while(check_money)
		{
			System.out.println("�ڼ��� : �󸶸� �����Ͻðڽ��ϱ�? : ");
			investMoney = input.nextInt();
			if(investMoney > readyMoney )
			{
				System.out.println("�ڼ��� : ���ñݾ��� ���� �ݾ׺��� �����ϴ�.");
				investMoney = 0;
			}
			else
			{	
				check_money = false;
				readyMoney = readyMoney - investMoney;
				System.out.println("�ڼ��� : ���Ըӽſ� " +this.investMoney+"�� �����մϴ�.");
				slot[0].insert(this.investMoney);
			}
		}	
	}
	
	public void take_out() {
		readyMoney = slot[0].output_Money() + readyMoney;
		System.out.println("�ڼ��� : �� " + readyMoney + "���� �����Ͽ����ϴ�.");
		slot[0].change();
	}
	
	public void enter() {
		System.out.println("�ڼ��� : ī���뿡 ����ϴ�.");
		cajino.hello();
	}
	
	public void play() {
		System.out.println("�ڼ��� : ���� ������ ���ϴ�.");
		slot[0].game_go();				
	}
	
}
