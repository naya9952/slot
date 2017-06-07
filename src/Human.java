public class Human {
	public Cajino cajino;
	public SlotMachine[] slot;
	protected int readyMoney = 100000;
	protected int investMoney;
	public int setGame;
	Human_input input = new Human_input();

	public Human(Cajino cajino, SlotMachine[] slot){
		this.cajino = cajino;
		this.slot = slot;
	}
	
	public int check() {
		int slot_num;
		System.out.println("�ڼ��� : ���Ըӽ��� �ڸ��� ���ִ��� �˾ƺ��ϴ�.");
		slot_num= cajino.check();
		return slot_num;
	}
	
	public void ask_rule(int slot_num) {
		System.out.println("�ڼ��� : ���Ըӽ��� ��Ģ�� ����ϴ�");
		slot[slot_num].rule();	
	}
	
	public void insert_money(int slot_num, int insert_coin) {
		if(insert_coin > readyMoney)
		{
			System.out.println("�ڼ��� : �������� �����մϴ�.");	
		}
		else
		{
		investMoney = insert_coin;
		readyMoney = readyMoney - investMoney;
		System.out.println("�ڼ��� : ���Ըӽſ� " +this.investMoney+"�� �����մϴ�.");
		slot[slot_num].insert(this.investMoney);
		}
	}
	
	public void take_out(int slot_num) {
		readyMoney = slot[slot_num].output_Money() + readyMoney;
		System.out.println("�ڼ��� : �� " + readyMoney + "���� �����Ͽ����ϴ�.");
		slot[slot_num].change();
	}
	
	public void enter() {
		System.out.println("�ڼ��� : ī���뿡 ����ϴ�.");
		cajino.hello();
	}
	
	public void play(int slot_num, int much_coin) {
		System.out.println("�ڼ��� : ���� ������ ���ϴ�.");
		slot[slot_num].game_go(much_coin);				
	}
	
}
