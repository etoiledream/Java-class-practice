package homework1;
/**
 * 
 * @author 王嘉祥 16130120131 752097910@qq.com
 *
 */
public class SumOfArgs {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//num为存储命令行中数字的临时变量，sum将所有数字求和
		int num, sum = 0;
		
		//将args遍历
		for(String x:args){	
			
			//当字符只有在0到9才进行以下操作
			if(x.charAt(0) >= 48 && x.charAt(0) <= 57){	
				
				//将字符转换成int型
				num = Integer.parseInt(x);
				sum += num;				
				
			}
					}
		System.out.println(sum);

	}

}
