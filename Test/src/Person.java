//������һ��Person��
 class Per {
	public Per(String name,int age){
		this.name = name;
		this.age = age;
	};//������
	private String name;
	private int age;
	public static void say(String content){
		System.out.println(content);
	}
	public  String toString(){
		return "����:"+name+" ����:"+age;
	}
}
public class Person{
	public static void main(String  args[]){
		Per p = new Per("С��",20);//���ù�����
		System.out.println(p.toString());
	}
}
