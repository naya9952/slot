
public class Director {
	public static void main(String[] args) {
		Director director = new Director();
		director.start();
	}
	
	void start(){
		System.out.println("Director : �ó������� �����մϴ�.");
		
		System.out.println("Director : ī���븦 �����մϴ�.");
		Cajino cajino = new Cajino();
		
		System.out.println("Director : ���Ըӽ��� �����մϴ�.");
		SlotRandom slot_random = new SlotRandom();
		SlotMachine slot = new SlotMachine(slot_random);
		
		System.out.println("Director : �ڼ����� �����մϴ�.");
		Human ParkSeongMin = new Human(cajino);	
		
		ParkSeongMin.enter();
		//�����Ŵ
		ParkSeongMin.check();
		ParkSeongMin = new Human(slot);
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
