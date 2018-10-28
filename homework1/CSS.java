package homework1;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author 752097910@qq.com
 *
 */

class Course {
	//课程名称cName 课程所需教材列表book
	private String cName;
	private List<String> book = new ArrayList<String>();
	Course(String cou){
		//构造函数
		this.cName = cou;
		Book e = new Book(cou);
		book = e.getBook();
	}
	String getCouName(){
		//获取课程名称 返回String类型变量
		return this.cName;
	}
	List<String> getBookOfCou(){
		//获取该课程所需教材 返回List<String>类型变量
		return this.book;
	}
}

class Book {
	//List<String>类型存储教材
	private List<String> book = new ArrayList<String>();
	
	//一门课程的教材 构造函数
	Book(String c){
		
		//根据不同课程存储不同的书籍
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
			//还可继续增加新的选项
		default:
			book.add("other books");
			break;
		}
				
	}
	//获取一门课程的书籍列表
	List<String> getBook(){
		return this.book;
	}
	
}

//Student类，SID为学号，List<Course> course存储该学生选的课程
class Student {
	private String sID;
	private List<Course> course = new ArrayList<Course>();
	
	Student(){
		System.out.println("haven't students!");
	}
	
	//只有学号，没有选课
	Student(String stuNum){
		this.sID = stuNum;
		System.out.println(sID + " hasn't course");
	}
	
	//参数为字符串数组的构造函数
	Student(String[] s){
		//只有学号
		if(s.length == 1){
			this.sID = s[0];
			System.out.println(sID + " hasn't course");
		}//同时提供学号与课程
		else{
			this.sID = s[0];
			//temp数组存储所有课程的字符串，即s数组除去第一个元素，其余前移一位
			String[] temp = new String[s.length-1];
			for(int i = 0; i < s.length-1; i++)
				temp[i] = s[i+1];
			//每一个课程生成一个课程对象，并添加在course列表数组中
			for(String x:temp){
				Course c = new Course(x);
				course.add(c);
			}
			
			//第一门课程打印
			System.out.print(sID + " select " + course.get(0).getCouName() 
			+ " with books ");
			//第一门课程的所有教材
			for(int i = 0; i < course.get(0).getBookOfCou().size(); i++){
				System.out.print(course.get(0).getBookOfCou().get(i));
				if(i != course.get(0).getBookOfCou().size()-1)
					System.out.print(",");
			}
			if(course.size() > 1){
				//从第二门课程开始打印
				for(int j = 1; j < course.size(); j++){
					System.out.print(";and " + course.get(j).getCouName() + " with books ");
					for(int k = 0; k < course.get(j).getBookOfCou().size(); k++)
						System.out.print(course.get(j).getBookOfCou().get(k));
				}
			}
			
			System.out.println();
			
		}
	}
	
	//参数为学号与课程的Student类
	Student(String stuNum, String... couName) {
		this.sID = stuNum;
		for(String x:couName){
			Course c = new Course(x);
			course.add(c);
		}
		//第一门课程打印
		System.out.print(sID + " select " + course.get(0).getCouName() 
		+ " with books ");
		//打印第一门课程的所有教材
		for(int i = 0; i < course.get(0).getBookOfCou().size(); i++){
			System.out.print(course.get(0).getBookOfCou().get(i));
			if(i != course.get(0).getBookOfCou().size()-1)
				System.out.print(",");
		}
		if(course.size() > 1){
			//从第二门课程开始打印
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
		// TODO 自动生成的方法存根
		Student stu0 = new Student(args);
		
		
		/*
		 * 测试代码
		String[] arg = new String[]{"1613","Java","C++"};
		Student stu = new Student(arg);
		Student stu1 = new Student("1613");
		Student stu3= new Student("1613","WebEngineering");
		Student stu2 = new Student("1613","Java","c");
		*/

	}

	

}
