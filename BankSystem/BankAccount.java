package BankSystem;
import java.util.ArrayList;
/**
 * 
 * @author ������ 16130120131 752097910@qq.com
 * BankSystem program
 */
public class BankAccount {
	public String name;
	protected double balance;
	static int accNum = 0;//�˻�������
	public ArrayList<String> record = new ArrayList<>();
	
	public BankAccount(String n, double iniBan) throws CheckingAccount {
		//���캯��������Ϊ�˻��������˻���ʼ���
		//����һ���˻�����������һ
		name = n;
		if(iniBan < 0)
			throw new CheckingAccount("Error:balance can't constructed with a negative amount!");
		balance = iniBan;
		accNum++;
	}
	public void deposit(double money) throws CheckingDeposit{
		//�����������money���뵽���balance��
		//�쳣�жϣ�������Ϊ��ֵ
		if(money < 0)
			throw new CheckingDeposit("Error:a negative amount is deposited!");
		
		balance += money;
		//����transRec�����洢����¼
		transRec("deposit " + money);
	}
	public void withdraw(double money) throws CheckingWithdraw {
		//ȡ�������������㣬������ȥҪȡ�ߵĽ��money�����򱨴���ʾ�����
		if(balance > money){
			balance -= money;
			//����transRec�����洢ȡ���¼
			transRec("withdraw " + money);
		}			
		else{
			throw new CheckingWithdraw("Error:account is overdrawn!");
		}
		//�����쳣����ʱ��ʹ�����´���
		//	System.out.println("balance is not enough!"
		//			+ "Please withdraw less than "+balance);
	}
	public double getBalance() {
		//���ص�ǰ�˻����
		return balance;
	}
	public void transRec(String info) {
		//�洢��ȡ��׼�¼���б�record��		
		record.add(info);
	}
	public void printTrans() {
		int num = record.size();
		if(num < 6){
			//�����¼С��6��ֱ�Ӵ�ӡ������ֻ��ӡ�����6����¼
			for(int i = num-1; i >= 0; i--)
				System.out.println(i+":"+record.get(i));
		}
		else{
			for(int i = num-1; i >= num-6; i--)
				System.out.println(i+":"+record.get(i));
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		//�����쳣����Ĳ��Դ���
		
		try{
			BankAccount Tom = new BankAccount("Tom", 1000);
			
			//CheckingAccount ��ʼ���쳣�������
			//BankAccount John = new BankAccount("John", -1000);
			
			Tom.deposit(500);
			
			//CheckingAccount����CheckingDeposit ����쳣�������
			//Tom.deposit(-100);
			
			//CheckingAccount����CheckingWithdraw ȡ�����쳣�������
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
		// ��ͨ���Դ���
		
		//BankAccount���һ���˻�
		BankAccount person1 = new BankAccount("person1", 1000);
		person1.deposit(1000);//1���	
		person1.withdraw(1300);//1ȡ��
		person1.withdraw(900);//1ȡ��
		person1.deposit(200);//1���
		person1.withdraw(300);//1ȡ��
		person1.withdraw(100);//1ȡ��
		person1.deposit(700);//1���
		person1.deposit(10);//1���
		person1.printTrans();//��ӡ1���׼�¼
		//��ӡ1���
		System.out.println("balance is "+ person1.getBalance());
		
		//BankAccount���͵�2���˻�
		System.out.println();
		BankAccount person2 = new BankAccount("person2", 100);
		person2.withdraw(50);//2ȡ��
		person2.printTrans();//��ӡ2���׼�¼
		
		//CashAccount�����˻�3
		System.out.println();
		CashAccount person3 = new CashAccount("person3", 1500);
		person3.deposit(500);//3���
		//��ѯ3���
		System.out.println(person3.getBalance());
		
		//CreditAccount�����˻�4
		System.out.println();
		CreditAccount person4 = new CreditAccount("person4", 200);
		person4.borrow(100);//4���
		person4.borrow(110);//4���
		person4.repay(100);//4����
		person4.borrow(50);//4���
		person4.decideCredit();//4������
		person4.printTrans();//4���׼�¼
				
		//��ӡ���˻�����
		System.out.println();
		System.out.println("the number of account is: "+accNum);
*/
	}

}
