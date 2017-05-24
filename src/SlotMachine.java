public class SlotMachine {
	public SlotRandom slot_random;
	protected int returnMoney;
	public int random;
	public boolean able_game = true;
	
	public SlotMachine(SlotRandom slot_random){
		this.slot_random = slot_random;
	}
	
	public int startRandom(){
		
		return random;
	}

	public boolean check() {
		if (able_game == true)
		{
			System.out.println("슬롯머신 : 게임을 할 수 있습니다.");
		}
		else
		{
			System.out.println("슬롯머신 : 게임을 할 수 없습니다.");
		}
		return able_game;	
	}
	
	public void rule() {
		System.out.println("슬롯머신 : 규칙을 알려줍니다.");
	}

	public int insert(int readyMoney) {
		System.out.println("슬롯머신 : 배팅을 시작합니다.");
		returnMoney =slot_random.random() * readyMoney;
		return returnMoney;
	}
	 
}
