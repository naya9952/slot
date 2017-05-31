import java.util.Random;

public class SlotRandom {
	Random random = new Random();
	protected int rd_num1= random.nextInt(8) + 1;
	protected int rd_num2= random.nextInt(8) + 1;
	protected int rd_num3= random.nextInt(8) + 1;
	protected int mult;
	
	public int random() {
		System.out.println("슬롯머신 : 1번 "+rd_num1 +"  2번 "+rd_num2 +"  3번 " +rd_num3);
		if(rd_num1 != rd_num2 && rd_num2 != rd_num3 && rd_num1 != rd_num3){
			System.out.println("슬롯머신 : 꽝");
			mult = 0;
		}
		else if(rd_num1 == rd_num2 && rd_num2 != rd_num3 || rd_num1 == rd_num3 && rd_num1 != rd_num2 
				|| rd_num2 == rd_num3 && rd_num1 != rd_num3){
			System.out.println("슬롯머신 : 두개의 숫자가 일치합니다");
			mult = 2;
		}
		else if(rd_num1 == rd_num2 && rd_num1 == rd_num3){
			System.out.println("슬롯머신 : 축하합니다 당첨입니다!!");
			mult = 1000;
		}
		System.out.println("슬롯머신 : 배팅 금액의 " + mult + "배 되었습니다.");
		return mult;
	}

}
