public class Director {

	public static void main(String[] args) {
		
		Director director = new Director();
		director.start();
	}
	
	void start(){
		System.out.println("Director : �ó������� �����մϴ�.");
		SlotRandom slot_random = new SlotRandom();
		
		System.out.println("Director : ���Ըӽ��� �����մϴ�.");
		SlotMachine slot = new SlotMachine(slot_random);
	
		System.out.println("Director : ī���븦 �����մϴ�.");
		Cajino cajino = new Cajino();

		System.out.println("Director : �ڼ����� �����մϴ�.");
		Human ParkSeongMin = new Human(slot);	

		
		ParkSeongMin.enter(cajino);
		//�����Ŵ
		ParkSeongMin.check();
		//���� ���ɿ��� üũ
		ParkSeongMin.ask_rule();
		//���� ���� ���
		ParkSeongMin.insert_money();
		//�Ա�
		ParkSeongMin.play();
		//����������
		ParkSeongMin.take_out();
		//���
	}

}
