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
			System.out.println("���Ըӽ� : ������ �� �� �ֽ��ϴ�.");
		}
		else
		{
			System.out.println("���Ըӽ� : ������ �� �� �����ϴ�.");
		}
		return able_game;	
	}
	
	public void rule() {
		System.out.println("���Ըӽ� : ��Ģ�� �˷��ݴϴ�.");
	}

	public int insert(int readyMoney) {
		System.out.println("���Ըӽ� : ������ �����մϴ�.");
		returnMoney =slot_random.random() * readyMoney;
		return returnMoney;
	}
	 
}
