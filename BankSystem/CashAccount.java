package BankSystem;
/**
 * 
 * @author ������ 16130120131 752097910@qq.com
 * BankSystem program
 */
public class CashAccount extends BankAccount {

	public CashAccount(String n, double iniBan) {
		super(n, iniBan);
		// TODO �Զ����ɵĹ��캯�����
		System.out.println("this is cashAccount:");
	}
	//��дgetBalance����
	@Override
	public double getBalance(){
		System.out.println("cash balance:");
		return balance;
	}

}
