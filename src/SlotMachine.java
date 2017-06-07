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
		System.out.println("���Ըӽ� : ��Ģ�� �˷��ݴϴ�.");
		}
	
	public void insert(int insertCoin) {
		returnMoney = insertCoin + returnMoney;
		System.out.println("���Ըӽ� : ���� �ݾ�" + returnMoney +"��");
	}

	public void game_go(int much_coin) {
		if(returnMoney ==0)
		{
			System.out.println("���Ըӽ� : ���Ե� �ݾ��� �����ϴ�.");	
		}
		else if ( much_coin > returnMoney)
		{
			System.out.println("���Ըӽ� : ���� �ݾ��� ���� �ݾ׺��� �����ϴ�.");	
		}
		else{
			System.out.println("���Ըӽ� : ������ �����մϴ�.");
			returnMoney = (returnMoney - much_coin) + (slot_random.random() * much_coin);
			System.out.println("���Ըӽ� : �ܿ� �ݾ� " + returnMoney +"��");	
		}
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
