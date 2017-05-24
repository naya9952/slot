public class Human {
	public SlotMachine slot;
	protected int readyMoney = 10000;
	public int sendMoney(int readyMoney){
		return this.readyMoney;
	}
	public Human(SlotMachine slot){
		this.slot = slot;
	}

	public void check() {
		System.out.println("�ڼ��� : ���Ըӽ��� �ڸ��� ���ִ��� �˾ƺ��ϴ�.");
		if(slot.check() == true){
			System.out.println("�ڼ��� : ���Ըӽſ� �ɽ��ϴ�.");
		}
		else {
			System.out.println("�ڼ��� : ����ڰ� �̹� �ֽ��ϴ�.");
		}
	}
	
	public void ask_rule() {
		System.out.println("�ڼ��� : ���Ըӽ��� ��Ģ�� ����ϴ�");
		slot.rule();	
	}
	
	public int insert_money() {
		System.out.println("�ڼ��� : ���Ըӽſ� ���� �����մϴ�.");
		this.readyMoney = slot.insert(this.readyMoney);
		return this.readyMoney;
	}
	
	public void take_out() {
		System.out.println("�ڼ��� : "+ this.readyMoney+"���� ����մϴ�.");		
	}
	
	public void enter() {
		System.out.println("�ڼ��� : ī���뿡 ����ϴ�.");
	}
}
