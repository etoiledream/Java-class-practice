package BankSystem;
/**
 * 
 * @author ������ 16130120131 752097910@qq.com
 * BankSystem program
 */
public class CreditAccount extends BankAccount{

	private int credit = 0;//��������
	
	private double borrowed = 0;//�ѽ���
	
		public CreditAccount(String n, double availAccount) {//�˴�availAccountΪ�β�
		super(n, availAccount);
		// TODO �Զ����ɵĹ��캯�����
		System.out.println("this is creditAccount:");
	}
	private double availAccount = balance;//�ɽ�������Ŀ
	public void borrow(double money){
		//����
		//����������ѽ��������߿ɽ���۳�������
		//��������ѽ������money
		if((borrowed+money)>availAccount){
			System.out.println("you can't borrow money!");
			credit--;
		}			
		else{
			borrowed += money;
			System.out.println("succeed!");
			transRec("borrow " + money);
		}
				
		
	}
	public void repay(int money){
		//��������
		//�����ѽ����ȥmoney������ѽ���Ϊ0��˵��ȫ����������ּ�һ
		borrowed -= money;
		transRec("repay " + money);
		if(borrowed <= 0)
			credit++;
	}
	public void decideCredit(){
		//��ѯ���������ڵ���0���������ã����򲻺�
		if(credit >= 0)
			System.out.println("have a good credit!"+credit);
		else
			System.out.println("have a bad credit!"+credit);
		
	}
	public double getBorrowed(){
		return borrowed;
	}

}
