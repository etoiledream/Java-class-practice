package BankSystem;
import java.util.ArrayList;
/**
 * 
 * @author  752097910@qq.com
 * BankSystem program
 */
public class BankAccount {
	public String name;
	protected double balance;
	static int accNum = 0;//账户总数量
	public ArrayList<String> record = new ArrayList<>();
	
	public BankAccount(String n, double iniBan) throws CheckingAccount {
		//构造函数，参数为账户姓名与账户初始余额
		//创建一个账户，总数量加一
		name = n;
		if(iniBan < 0)
			throw new CheckingAccount("Error:balance can't constructed with a negative amount!");
		balance = iniBan;
		accNum++;
	}
	public void deposit(double money) throws CheckingDeposit{
		//存款函数，将金额money加入到余额balance中
		//异常判断，存款金额不可为负值
		if(money < 0)
			throw new CheckingDeposit("Error:a negative amount is deposited!");
		
		balance += money;
		//调用transRec函数存储存款记录
		transRec("deposit " + money);
	}
	public void withdraw(double money) throws CheckingWithdraw {
		//取款函数，如果余额充足，从余额减去要取走的金额money；否则报错，提示余额量
		if(balance > money){
			balance -= money;
			//调用transRec函数存储取款记录
			transRec("withdraw " + money);
		}			
		else{
			throw new CheckingWithdraw("Error:account is overdrawn!");
		}
		//不用异常处理时可使用以下代码
		//	System.out.println("balance is not enough!"
		//			+ "Please withdraw less than "+balance);
	}
	public double getBalance() {
		//返回当前账户余额
		return balance;
	}
	public void transRec(String info) {
		//存储存取款交易记录于列表record中		
		record.add(info);
	}
	public void printTrans() {
		int num = record.size();
		if(num < 6){
			//如果记录小于6，直接打印；否则只打印最近的6条记录
			for(int i = num-1; i >= 0; i--)
				System.out.println(i+":"+record.get(i));
		}
		else{
			for(int i = num-1; i >= num-6; i--)
				System.out.println(i+":"+record.get(i));
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//关于异常处理的测试代码
		
		try{
			BankAccount Tom = new BankAccount("Tom", 1000);
			
			//CheckingAccount 初始化异常处理测试
			//BankAccount John = new BankAccount("John", -1000);
			
			Tom.deposit(500);
			
			//CheckingAccount子类CheckingDeposit 存款异常处理测试
			//Tom.deposit(-100);
			
			//CheckingAccount子类CheckingWithdraw 取款金额异常处理测试
			Tom.withdraw(1600);
		}catch(CheckingDeposit e){
			e.printStackTrace();
		}catch(CheckingWithdraw e){
			e.printStackTrace();
		}catch(CheckingAccount e){
			e.printStackTrace();
		}finally{
			System.out.println("test finished!");
		}
		
			
	
		
		
		
		
/*		
		// 普通测试代码
		
		//BankAccount类第一个账户
		BankAccount person1 = new BankAccount("person1", 1000);
		person1.deposit(1000);//1存款	
		person1.withdraw(1300);//1取款
		person1.withdraw(900);//1取款
		person1.deposit(200);//1存款
		person1.withdraw(300);//1取款
		person1.withdraw(100);//1取款
		person1.deposit(700);//1存款
		person1.deposit(10);//1存款
		person1.printTrans();//打印1交易记录
		//打印1余额
		System.out.println("balance is "+ person1.getBalance());
		
		//BankAccount类型第2个账户
		System.out.println();
		BankAccount person2 = new BankAccount("person2", 100);
		person2.withdraw(50);//2取款
		person2.printTrans();//打印2交易记录
		
		//CashAccount类型账户3
		System.out.println();
		CashAccount person3 = new CashAccount("person3", 1500);
		person3.deposit(500);//3存款
		//查询3余额
		System.out.println(person3.getBalance());
		
		//CreditAccount类型账户4
		System.out.println();
		CreditAccount person4 = new CreditAccount("person4", 200);
		person4.borrow(100);//4借款
		person4.borrow(110);//4借款
		person4.repay(100);//4还款
		person4.borrow(50);//4借款
		person4.decideCredit();//4信誉分
		person4.printTrans();//4交易记录
				
		//打印总账户数量
		System.out.println();
		System.out.println("the number of account is: "+accNum);
*/
	}

}
