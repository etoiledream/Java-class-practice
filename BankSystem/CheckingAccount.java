package BankSystem;

/**
 * 
 * @author ������ 16130120131 752097910@qq.com
 * BankSystem program
 */

//����˻�����쳣
public class CheckingAccount extends IllegalArgumentException{ 
	CheckingAccount(){}
	CheckingAccount(String s){
		super(s);
		
	}
	
}
//������쳣
class CheckingDeposit extends CheckingAccount{
	CheckingDeposit(String s){
		super(s);
	}
}
//���ȡ���쳣
class CheckingWithdraw extends CheckingAccount{
	CheckingWithdraw(String s){
		super(s);
	}
}