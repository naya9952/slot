import java.util.Random;

public class SlotRandom {
	Random random = new Random();
	protected int rd_num1= random.nextInt(8) + 1;
	protected int rd_num2= random.nextInt(8) + 1;
	protected int rd_num3= random.nextInt(8) + 1;
	protected int mult;
	
	public int random() {
		System.out.println("���Ըӽ� :  "+rd_num1 +"  "+rd_num2 +"  " +rd_num3);
		if(rd_num1 != rd_num2 && rd_num2 != rd_num3 && rd_num1 != rd_num3){
			System.out.println("���Ըӽ� : �ΤФ�");
			mult = 0;
		}
		else if(rd_num1 == rd_num2 && rd_num2 != rd_num3 || rd_num1 == rd_num3 && rd_num1 != rd_num2 
				|| rd_num2 == rd_num3 && rd_num1 != rd_num3){
			System.out.println("���Ըӽ� : �ڡ������մϴ�. �ΰ��� ���ڰ� ��ġ�մϴ�!!�ڡ�");
			mult = 2;
		}
		else if(rd_num1 == rd_num2 && rd_num1 == rd_num3){
			System.out.println("���Ըӽ� : �ڡ������մϴ�. �����Դϴ�!!�ڡ�");
			mult = 1000;
		}
		System.out.println("���Ըӽ� : ���� �ݾ��� " + mult + "�� �Ǿ����ϴ�.");
		return mult;
	}

}
