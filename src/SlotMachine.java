public class SlotMachine {
	public SlotRandom slot_random;
	protected int returnMoney =0;
	public int random;
	public boolean able_game = true;
	
	public SlotMachine(SlotRandom slot_random){
		this.slot_random = slot_random;
	}
	
	public int startRandom(){
		return random;
	}
	
	public void rule() {
		System.out.println("슬롯머신 : 규칙을 알려줍니다.");
		}
	
	public void insert(int insertCoin) {
		returnMoney = insertCoin + returnMoney;
		System.out.println("슬롯머신 : 투입 금액" + returnMoney +"원");
	}

	public void game_go(int much_coin) {
		if(returnMoney ==0)
		{
			System.out.println("슬롯머신 : 투입된 금액이 없습니다.");	
		}
		else if ( much_coin > returnMoney)
		{
			System.out.println("슬롯머신 : 배팅 금액이 투입 금액보다 많습니다.");	
		}
		else{
			System.out.println("슬롯머신 : 배팅을 시작합니다.");
			returnMoney = (returnMoney - much_coin) + (slot_random.random() * much_coin);
			System.out.println("슬롯머신 : 잔여 금액 " + returnMoney +"원");	
		}
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
		if(able_game == true)
		{
			able_game = false;
		}
		else
		{
			able_game = true;
		}
	}

	
}
