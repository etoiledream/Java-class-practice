package BankSystem;

/**
 * 
 * @author 王嘉祥 16130120131 752097910@qq.com
 * BankSystem program
 */

//检查账户金额异常
public class CheckingAccount extends IllegalArgumentException{ 
	CheckingAccount(){}
	CheckingAccount(String s){
		super(s);
		
	}
	
}
//检查存款异常
class CheckingDeposit extends CheckingAccount{
	CheckingDeposit(String s){
		super(s);
	}
}
//检查取款异常
class CheckingWithdraw extends CheckingAccount{
	CheckingWithdraw(String s){
		super(s);
	}
}