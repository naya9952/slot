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
		System.out.println("박성민 : 슬롯머신의 자리가 비여있는지 알아봅니다.");
		if(slot.check() == true){
			System.out.println("박성민 : 슬롯머신에 앉습니다.");
		}
		else {
			System.out.println("박성민 : 사용자가 이미 있습니다.");
		}
	}
	
	public void ask_rule() {
		System.out.println("박성민 : 슬롯머신의 규칙을 물어봅니다");
		slot.rule();	
	}
	
	public int insert_money() {
		System.out.println("박성민 : 슬롯머신에 돈을 투입합니다.");
		this.readyMoney = slot.insert(this.readyMoney);
		return this.readyMoney;
	}
	
	public void take_out() {
		System.out.println("박성민 : "+ this.readyMoney+"원을 출금합니다.");		
	}
	
	public void enter() {
		System.out.println("박성민 : 카지노에 놀러갑니다.");
	}
}
