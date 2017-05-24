public class Main {

	public static void main(String[] args) {
		
		Main director = new Main();
		director.startScenario();
	}
	
	void startScenario(){
		System.out.println("Director : 시나리오를 시작합니다.");
		SlotRandom slot_random = new SlotRandom();
		
		System.out.println("Director : 슬롯머신을 생성합니다.");
		SlotMachine slot = new SlotMachine(slot_random);
	
		System.out.println("Director : 박성민을 생성합니다.");
		Human ParkSeongMin = new Human(slot);	
		
		ParkSeongMin.enter();
		//입장시킴
		ParkSeongMin.check();
		//게임 가능여부 체크
		ParkSeongMin.ask_rule();
		//게임 설명 듣기
		ParkSeongMin.insert_money();
		//입출
		ParkSeongMin.take_out();
		//출금
	}

}
