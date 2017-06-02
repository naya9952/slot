public class Director {
	public int slot_num;
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
		Human ParkSeongMin = new Human(cajino);	
		
		ParkSeongMin.enter();
		//입장시킴
		slot_num =ParkSeongMin.check();
		ParkSeongMin = new Human(slot[slot_num-1]);
		//게임 가능여부 체크
		ParkSeongMin.ask_rule(slot_num-1);
		//게임 설명 듣기
		ParkSeongMin.insert_money();
		//입금
		ParkSeongMin.play();
		//레버돌리기
		ParkSeongMin.take_out();
		//출금
	}

}
