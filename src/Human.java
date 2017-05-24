

public class Human {
	public SlotMachine slot;
	protected int readyMoney;
	public int sendMoney(int readyMoney){
		return this.readyMoney;
	}
	public Human(SlotMachine slot){
		this.slot = slot;
	}

	public void check() {
		if(slot.check() == true){
			System.out.println("박성민 : 슬롯머신에 앉습니다.");
		}
		else {
			System.out.println("박성민 : 사용자가 이미 있습니다.");
		}
	}
	
	public void ask_rule() {
		System.out.println("슬롯머신 : 규칙을 알려줍니다.");
	}
	public void insert_money() {
		System.out.println("박성민 : 슬롯머신에 돈을 투입합니다.");
		
	}
}
