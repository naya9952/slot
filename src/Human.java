import java.util.Scanner;
public class Human {
	public Cajino cajino;
	public SlotMachine[] slot;
	public Scanner input = new Scanner(System.in);
	protected int readyMoney = 100000;
	protected int investMoney;
	public boolean check_money= true;
	public int slot_num;
	
	public Human(Cajino cajino){
		this.cajino = cajino;
	}
	
	public Human(SlotMachine[] slot){
		this.slot = slot;
	}

	public Human(SlotMachine slotMachine) {
		// TODO Auto-generated constructor stub
	}

	public int check() {
		System.out.println("박성민 : 슬롯머신의 자리가 비여있는지 알아봅니다.");
		slot_num= cajino.check();
		return slot_num;
	}
	
	public void ask_rule(int i) {
		System.out.println("박성민 : 슬롯머신의 규칙을 물어봅니다");
		slot[i].rule();	
	}
	
	public void insert_money() {
		while(check_money)
		{
			System.out.println("박성민 : 얼마를 투입하시겠습니까? : ");
			investMoney = input.nextInt();
			if(investMoney > readyMoney )
			{
				System.out.println("박성민 : 배팅금액이 소지 금액보다 많습니다.");
				investMoney = 0;
			}
			else
			{	
				check_money = false;
				readyMoney = readyMoney - investMoney;
				System.out.println("박성민 : 슬롯머신에 " +this.investMoney+"원 투입합니다.");
				slot[0].insert(this.investMoney);
			}
		}	
	}
	
	public void take_out() {
		readyMoney = slot[0].output_Money() + readyMoney;
		System.out.println("박성민 : 총 " + readyMoney + "원을 소지하였습니다.");
		slot[0].change();
	}
	
	public void enter() {
		System.out.println("박성민 : 카지노에 놀러갑니다.");
		cajino.hello();
	}
	
	public void play() {
		System.out.println("박성민 : 게임 레버를 당깁니다.");
		slot[0].game_go();				
	}
	
}
