public class Main {

	public static void main(String[] args) {
		
		Main director = new Main();
		director.startScenario();
	}
	
	void startScenario(){
		System.out.println("Director : �ó������� �����մϴ�.");
		SlotRandom slot_random = new SlotRandom();
		
		System.out.println("Director : ���Ըӽ��� �����մϴ�.");
		SlotMachine slot = new SlotMachine(slot_random);
	
		System.out.println("Director : �ڼ����� �����մϴ�.");
		Human ParkSeongMin = new Human(slot);	
		
		ParkSeongMin.enter();
		//�����Ŵ
		ParkSeongMin.check();
		//���� ���ɿ��� üũ
		ParkSeongMin.ask_rule();
		//���� ���� ���
		ParkSeongMin.insert_money();
		//����
		ParkSeongMin.take_out();
		//���
	}

}
