public class Cajino {
	public boolean able_game = true;

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
		// TODO Auto-generated method stub
		return 0;
	}

}
