package BankSystem;
/**
 * 
 * @author 王嘉祥 16130120131 752097910@qq.com
 * BankSystem program
 */
public class CreditAccount extends BankAccount{

	private int credit = 0;//信誉积分
	
	private double borrowed = 0;//已借金额
	
		public CreditAccount(String n, double availAccount) {//此处availAccount为形参
		super(n, availAccount);
		// TODO 自动生成的构造函数存根
		System.out.println("this is creditAccount:");
	}
	private double availAccount = balance;//可借贷金额数目
	public void borrow(double money){
		//借款函数
		//如果借款金额加已借金额大于最高可借金额，扣除信誉分
		//否则更新已借金额，加上money
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
		//偿还函数
		//更新已借金额，减去money。如果已借金额为0，说明全部还款，信誉分加一
		borrowed -= money;
		transRec("repay " + money);
		if(borrowed <= 0)
			credit++;
	}
	public void decideCredit(){
		//查询信誉，大于等于0则信誉良好，否则不好
		if(credit >= 0)
			System.out.println("have a good credit!"+credit);
		else
			System.out.println("have a bad credit!"+credit);
		
	}
	public double getBorrowed(){
		return borrowed;
	}

}
