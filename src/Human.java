import java.util.Scanner;
public class Human {
	public Cajino cajino;
	public SlotMachine slot;
	public Scanner input = new Scanner(System.in);
	protected int readyMoney = 100000;
	protected int investMoney;
	public boolean check_money= true;
	
	public Human(SlotMachine slot){
		this.slot = slot;
	}

	public void check() {
		System.out.println("박성민 : 슬롯머신의 자리가 비여있는지 알아봅니다.");
		if(slot.check() == true){
			System.out.println("박성민 : 슬롯머신에 앉습니다.");
			slot.change();
		}
		else {
			System.out.println("박성민 : 사용자가 이미 있습니다.");
		}
	}
	
	public void ask_rule() {
		System.out.println("박성민 : 슬롯머신의 규칙을 물어봅니다");
		slot.rule();	
	}
	
	public void insert_money() {
		while(check_money)
		{
			System.out.println("얼마를 투입하시겠습니까? : ");
			investMoney = input.nextInt();
			if(investMoney > readyMoney )
			{
				System.out.println("배팅금액이 소지 금액보다 많습니다.");
				investMoney = 0;
			}
			else
			{	
				check_money = false;
				readyMoney = readyMoney - investMoney;
				System.out.println("박성민 : 슬롯머신에 " +this.investMoney+"원 투입합니다.");
				slot.insert(this.investMoney);
			}
		}	
	}
	
	public void take_out() {
		investMoney =slot.endGame();
		readyMoney = investMoney + readyMoney;
		System.out.println("박성민 : 총 " + readyMoney + "원을 소지하였습니다.");
	}
	
	public void enter(Cajino cajino) {
		System.out.println("박성민 : 카지노에 놀러갑니다.");
	}
	
	public void play() {
		System.out.println("박성민 : 게임 레버를 당깁니다.");
		slot.game_go();				
	}
	
}
