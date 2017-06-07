public class Director {
	public int slot_num;
	public boolean state = true;
	public int swch;
	public int money;
	public static void main(String[] args) {
		Director director = new Director();
		director.start();
	}
	
	void start(){
		
		System.out.println("Director : 시나리오를 시작합니다.");
		
		System.out.println("Director : 카지노를 생성합니다.");
		Cajino cajino;
		
		System.out.println("Director : 슬롯머신을 생성합니다.");
		SlotRandom slot_random = new SlotRandom();
		SlotMachine [] slot = new SlotMachine[3];
		for(int i =0; i<3; i++)
		{
			slot[i] = new SlotMachine(slot_random);
			slot[i].able_game= false;
		}
		slot[1].able_game = true;
		
		cajino = new Cajino(slot);
		
		System.out.println("Director : 박성민을 생성합니다.");
		Human ParkSeongMin = new Human(cajino, slot);	
		Human_input input = new Human_input();
		
		
		ParkSeongMin.enter();
		//입장시킴
		slot_num =ParkSeongMin.check();

		//게임 가능여부 체크
		ParkSeongMin.ask_rule(slot_num);
		//게임 설명 듣기	
		Menu menu = new Menu();
		
		while(state)
		{
			swch = menu.view();
			if (swch ==1)
			{
				money =input.money();
				ParkSeongMin.insert_money(slot_num, money);
			}
			else if(swch ==2)
			{
				ParkSeongMin.play(slot_num);
			}
			else if(swch ==3)
			{
				ParkSeongMin.take_out(slot_num);
				state = false;
			}
			else if(swch ==4)
			{
				System.out.println("슬롯머신 : 잘못 선택하였습니다. ");
			}
		
		}//while(state)
	}//void start()

}
