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
				System.out.print("카지노 : ");
				System.out.print(num+1);
				System.out.println("번째 슬롯머신으로 가세요.");
			}	
		}
		if(slot[0].able_game ==false && slot[1].able_game ==false && slot[2].able_game ==false)
		{
			System.out.println("카지노 : 지금은 게임을 할 수 없습니다.");	
			System.exit(0);
		}

		return num;		
	}

	public void hello() {
		System.out.println("카지노 : 어서오세요.");
	}

}
