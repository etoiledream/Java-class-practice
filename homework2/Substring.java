package homework2;
/**
 * 
 * @author 王嘉祥 16130120131 752097910@qq.com
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
			//字符串数组有三位元素，第一位是目标字符串
			//第二三位为起始索引与截取长度，需要Integer.parseInt将其转换为int型
			int b = Integer.parseInt(s[1]);
			int l = Integer.parseInt(s[2]);
			this.strResult =  s[0].substring(b, b+l);
			System.out.println(this.strResult);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
				
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Substring str0 = new Substring(args);
		//Substring str = new Substring("hellojava",1,4);

	}

}
