public class Cajino {
	public boolean able_game = true;

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
		// TODO Auto-generated method stub
		return 0;
	}

}
