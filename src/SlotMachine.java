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
	
	public void insert(int insertCoin) {
		returnMoney = insertCoin;
		System.out.println("���Ըӽ� : ���� �ݾ�" + returnMoney +"��");
	}

	public void game_go() {
		System.out.println("���Ըӽ� : ������ �����մϴ�.");
		returnMoney =slot_random.random() * returnMoney;
		System.out.println("���Ըӽ� : �ܿ� �ݾ� " + returnMoney +"��");	
	}
	
	public int output_Money() {	
		if(returnMoney ==0)
		{
		System.out.println("���Ըӽ� : ��� ������ �ݾ��� �����ϴ�.");
		}
		else{
		System.out.println("�ڼ��� : " + returnMoney + "���� ����Ͽ����ϴ�.");	
		}
		return returnMoney;
	}

	public void change() {
		able_game = false;
	}

	
}
