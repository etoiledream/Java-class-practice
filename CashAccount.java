package BankSystem;
/**
 * 
 * @author 王嘉祥 16130120131 752097910@qq.com
 * BankSystem program
 */
public class CashAccount extends BankAccount {

	public CashAccount(String n, double iniBan) {
		super(n, iniBan);
		// TODO 自动生成的构造函数存根
		System.out.println("this is cashAccount:");
	}
	//重写getBalance方法
	@Override
	public double getBalance(){
		System.out.println("cash balance:");
		return balance;
	}

}
