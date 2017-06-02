public class Director {
	public int slot_num;
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
		Human ParkSeongMin = new Human(cajino);	
		
		ParkSeongMin.enter();
		//�����Ŵ
		slot_num =ParkSeongMin.check();
		ParkSeongMin = new Human(slot[slot_num-1]);
		//���� ���ɿ��� üũ
		ParkSeongMin.ask_rule(slot_num-1);
		//���� ���� ���
		ParkSeongMin.insert_money();
		//�Ա�
		ParkSeongMin.play();
		//����������
		ParkSeongMin.take_out();
		//���
	}

}
