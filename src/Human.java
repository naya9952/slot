public class Human {
	public Cajino cajino;
	public SlotMachine[] slot;
	protected int readyMoney = 100000;
	protected int investMoney;
	Human_input input_ = new Human_input();

	public Human(Cajino cajino){
		this.cajino = cajino;
	}
	
	public Human(SlotMachine[] slot){
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
	
	public void insert_money(int slot_num) {
		investMoney =input_.money(readyMoney);
		readyMoney = readyMoney - investMoney;
		System.out.println("�ڼ��� : ���Ըӽſ� " +this.investMoney+"�� �����մϴ�.");
		slot[slot_num].insert(this.investMoney);		
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
	
	public void play(int slot_num) {
		System.out.println("�ڼ��� : ���� ������ ���ϴ�.");
		slot[slot_num].game_go();				
	}
	
}
