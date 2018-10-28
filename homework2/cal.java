package homework2;

import java.util.Calendar;

/**
 * 
 * @author 王嘉祥 16130120131 752097910@qq.com
 *
 */
public class cal {
	
	private static int getDay(int year, int month){
		int[] days = {31, 28, 31, 30, 31, 30, 31
				, 31, 30, 31, 30, 31};
		if(((year%4 == 0&&year%100 != 0)||year%400 == 0)&&month == 1)
			return 29;
		else
			return days[month];
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Calendar c = Calendar.getInstance();
		
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		/*test code:
		 * 
		 * int month = 4; int year = 2025;
		 * 
		 */		
		
		int days = getDay(year, month-1);
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month-1);//从0开始，0表示一月
		c.set(Calendar.DAY_OF_MONTH, 0);
		System.out.println("SU"+"\t"+"MO"+"\t"+"TU"+"\t"
		+"WE"+"\t"+"TH"+"\t"+"FR"+"\t"+"SA");
		int count = 1;
		while(count <= days){
			c.add(Calendar.DAY_OF_MONTH, 1);
			//day代表周几
			@SuppressWarnings("deprecation")
			int day = c.getTime().getDay();
			if(count == 1)
				for(int i = 0; i < day; i++)
					System.out.print("\t");
			if(day == 0)
				System.out.println();
			System.out.print(c.getTime().getDate()+"\t");
			count++;
		}
		
		

	}

}
