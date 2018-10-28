package homework1;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ������ 16130120131 752097910@qq.com
 *
 */

class Course {
	//�γ�����cName �γ�����̲��б�book
	private String cName;
	private List<String> book = new ArrayList<String>();
	Course(String cou){
		//���캯��
		this.cName = cou;
		Book e = new Book(cou);
		book = e.getBook();
	}
	String getCouName(){
		//��ȡ�γ����� ����String���ͱ���
		return this.cName;
	}
	List<String> getBookOfCou(){
		//��ȡ�ÿγ�����̲� ����List<String>���ͱ���
		return this.book;
	}
}

class Book {
	//List<String>���ʹ洢�̲�
	private List<String> book = new ArrayList<String>();
	
	//һ�ſγ̵Ľ̲� ���캯��
	Book(String c){
		
		//���ݲ�ͬ�γ̴洢��ͬ���鼮
		switch(c){
		case "Java":
			book.add("Thinking in Java");book.add("java 8");
			break;
		case "WebEngineering":
			book.add("Web Engineering");
			break;
		case "C++":
			book.add("C++ Primer");
			break;
			//���ɼ��������µ�ѡ��
		default:
			book.add("other books");
			break;
		}
				
	}
	//��ȡһ�ſγ̵��鼮�б�
	List<String> getBook(){
		return this.book;
	}
	
}

//Student�࣬SIDΪѧ�ţ�List<Course> course�洢��ѧ��ѡ�Ŀγ�
class Student {
	private String sID;
	private List<Course> course = new ArrayList<Course>();
	
	Student(){
		System.out.println("haven't students!");
	}
	
	//ֻ��ѧ�ţ�û��ѡ��
	Student(String stuNum){
		this.sID = stuNum;
		System.out.println(sID + " hasn't course");
	}
	
	//����Ϊ�ַ�������Ĺ��캯��
	Student(String[] s){
		//ֻ��ѧ��
		if(s.length == 1){
			this.sID = s[0];
			System.out.println(sID + " hasn't course");
		}//ͬʱ�ṩѧ����γ�
		else{
			this.sID = s[0];
			//temp����洢���пγ̵��ַ�������s�����ȥ��һ��Ԫ�أ�����ǰ��һλ
			String[] temp = new String[s.length-1];
			for(int i = 0; i < s.length-1; i++)
				temp[i] = s[i+1];
			//ÿһ���γ�����һ���γ̶��󣬲������course�б�������
			for(String x:temp){
				Course c = new Course(x);
				course.add(c);
			}
			
			//��һ�ſγ̴�ӡ
			System.out.print(sID + " select " + course.get(0).getCouName() 
			+ " with books ");
			//��һ�ſγ̵����н̲�
			for(int i = 0; i < course.get(0).getBookOfCou().size(); i++){
				System.out.print(course.get(0).getBookOfCou().get(i));
				if(i != course.get(0).getBookOfCou().size()-1)
					System.out.print(",");
			}
			if(course.size() > 1){
				//�ӵڶ��ſγ̿�ʼ��ӡ
				for(int j = 1; j < course.size(); j++){
					System.out.print(";and " + course.get(j).getCouName() + " with books ");
					for(int k = 0; k < course.get(j).getBookOfCou().size(); k++)
						System.out.print(course.get(j).getBookOfCou().get(k));
				}
			}
			
			System.out.println();
			
		}
	}
	
	//����Ϊѧ����γ̵�Student��
	Student(String stuNum, String... couName) {
		this.sID = stuNum;
		for(String x:couName){
			Course c = new Course(x);
			course.add(c);
		}
		//��һ�ſγ̴�ӡ
		System.out.print(sID + " select " + course.get(0).getCouName() 
		+ " with books ");
		//��ӡ��һ�ſγ̵����н̲�
		for(int i = 0; i < course.get(0).getBookOfCou().size(); i++){
			System.out.print(course.get(0).getBookOfCou().get(i));
			if(i != course.get(0).getBookOfCou().size()-1)
				System.out.print(",");
		}
		if(course.size() > 1){
			//�ӵڶ��ſγ̿�ʼ��ӡ
			for(int j = 1; j < course.size(); j++){
				System.out.print(";and " + course.get(j).getCouName() + " with books ");
				for(int k = 0; k < course.get(j).getBookOfCou().size(); k++)
					System.out.print(course.get(j).getBookOfCou().get(k));
			}
		}
		
		System.out.println();
		
			
	}
	
	String getID(){
		return this.sID;
	}
	List<Course> getCou(){
		return this.course;
	}
	
}
public class CSS {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Student stu0 = new Student(args);
		
		
		/*
		 * ���Դ���
		String[] arg = new String[]{"1613","Java","C++"};
		Student stu = new Student(arg);
		Student stu1 = new Student("1613");
		Student stu3= new Student("1613","WebEngineering");
		Student stu2 = new Student("1613","Java","c");
		*/

	}

	

}
