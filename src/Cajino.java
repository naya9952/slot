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
				num = i;
				System.out.print("ī���� : ");
				System.out.print(num+1);
				System.out.println("��° ���Ըӽ����� ������.");
			}	
		}
		if(slot[0].able_game ==false && slot[1].able_game ==false && slot[2].able_game ==false)
		{
			System.out.println("ī���� : ������ ������ �� �� �����ϴ�.");	
			System.exit(0);
		}

		return num;		
	}

	public void hello() {
		System.out.println("ī���� : �������.");
	}

}
