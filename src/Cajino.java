public class Cajino {
	public SlotMachine[] slot;
	public int num;
	public static int max = 3;
	public Cajino(SlotMachine[] slot) {
		this.slot = slot;
	}

	public int check() {
		for(int i= 0; i<max; i++){
			if (slot[i].able_game == true)
			{
				num = i+1;
				System.out.println("ī���� : "+num+"��° ���Ըӽ����� ������.");
			}
			else
			{
				System.out.println("ī���� : ������ ������ �� �� �����ϴ�.");	
			}
		}
		return num;		
	}

	public void hello() {
		System.out.println("ī���� : �������.");
	}

}
