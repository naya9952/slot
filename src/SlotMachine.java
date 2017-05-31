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
	
	public void insert(int insertCoin) {
		returnMoney = insertCoin;
		System.out.println("슬롯머신 : 투입 금액" + returnMoney +"원");
	}

	public void game_go() {
		System.out.println("슬롯머신 : 배팅을 시작합니다.");
		returnMoney =slot_random.random() * returnMoney;
		System.out.println("슬롯머신 : 잔여 금액 " + returnMoney +"원");	
	}
	
	public int output_Money() {	
		if(returnMoney ==0)
		{
		System.out.println("슬롯머신 : 출금 가능한 금액이 없습니다.");
		}
		else{
		System.out.println("박성민 : " + returnMoney + "원을 출금하였습니다.");	
		}
		return returnMoney;
	}

	public void change() {
		able_game = false;
	}

	
}
