import java.util.Random;

public class SlotRandom {
	Random random = new Random();
	
	protected int rd_num= random.nextInt(9) + 1;
	protected int mult;
	public int random() {
		if(rd_num >= 1 && rd_num <=5 )
		{
			mult = 0;
		}
		else if(rd_num >= 6 && rd_num <=8 )
		{
			mult = 1;
		}
		else if(rd_num >= 9 && rd_num <=10 )
		{
			mult = 2;
		}
		System.out.println("슬롯머신 : 배팅 금액의 " + mult + "배 되었습니다.");
		

		return mult;
	}

}
