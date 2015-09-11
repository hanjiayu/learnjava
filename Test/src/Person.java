//定义了一个Person类
 class Per {
	public Per(String name,int age){
		this.name = name;
		this.age = age;
	};//构造器
	private String name;
	private int age;
	public static void say(String content){
		System.out.println(content);
	}
	public  String toString(){
		return "名字:"+name+" 年龄:"+age;
	}
}
public class Person{
	public static void main(String  args[]){
		Per p = new Per("小红",20);//调用构造器
		System.out.println(p.toString());
	}
}
