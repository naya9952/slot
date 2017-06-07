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
		
		System.out.println("Director : �ó������� �����մϴ�.");
		
		System.out.println("Director : ī���븦 �����մϴ�.");
		Cajino cajino;
		
		System.out.println("Director : ���Ըӽ��� �����մϴ�.");
		SlotRandom slot_random = new SlotRandom();
		SlotMachine [] slot = new SlotMachine[3];
		for(int i =0; i<3; i++)
		{
			slot[i] = new SlotMachine(slot_random);
			slot[i].able_game= false;
		}
		slot[1].able_game = true;
		
		cajino = new Cajino(slot);
		
		System.out.println("Director : �ڼ����� �����մϴ�.");
		Human ParkSeongMin = new Human(cajino, slot);	
		Human_input input = new Human_input();
		
		
		ParkSeongMin.enter();
		//�����Ŵ
		slot_num =ParkSeongMin.check();

		//���� ���ɿ��� üũ
		ParkSeongMin.ask_rule(slot_num);
		//���� ���� ���	
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
				System.out.println("���Ըӽ� : �߸� �����Ͽ����ϴ�. ");
			}
		
		}//while(state)
	}//void start()

}
