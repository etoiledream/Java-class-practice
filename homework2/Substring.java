package homework2;
/**
 * 
 * @author ������ 16130120131 752097910@qq.com
 *
 */
public class Substring {
	private String strResult;
	Substring(String s, int begin, int len){
		this.strResult = s.substring(begin, begin+len);
		System.out.println(this.strResult);
		
	}
	Substring(String[] s){
		try{
			//�ַ�����������λԪ�أ���һλ��Ŀ���ַ���
			//�ڶ���λΪ��ʼ�������ȡ���ȣ���ҪInteger.parseInt����ת��Ϊint��
			int b = Integer.parseInt(s[1]);
			int l = Integer.parseInt(s[2]);
			this.strResult =  s[0].substring(b, b+l);
			System.out.println(this.strResult);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
				
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Substring str0 = new Substring(args);
		//Substring str = new Substring("hellojava",1,4);

	}

}
