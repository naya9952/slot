

public class SlotMachine {
	public SlotRandom slot_random;
	protected int insertMoney;
	public int random;
	public boolean able_game;
	public SlotMachine() {
		this.able_game = true;
	}
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
	
	 
}
