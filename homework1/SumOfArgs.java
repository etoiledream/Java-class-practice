package homework1;
/**
 * 
 * @author ������ 16130120131 752097910@qq.com
 *
 */
public class SumOfArgs {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		//numΪ�洢�����������ֵ���ʱ������sum�������������
		int num, sum = 0;
		
		//��args����
		for(String x:args){	
			
			//���ַ�ֻ����0��9�Ž������²���
			if(x.charAt(0) >= 48 && x.charAt(0) <= 57){	
				
				//���ַ�ת����int��
				num = Integer.parseInt(x);
				sum += num;				
				
			}
					}
		System.out.println(sum);

	}

}
