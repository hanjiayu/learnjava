package java0906;

public class ReferenceArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] student = new Person[2];
		Person xiaoming = new Person();
		xiaoming.age = 5;
		xiaoming.height=171.2;
		Person xiaohong = new Person();
		xiaohong.age=6;
		xiaohong.height = 171.1;
		student[0]=xiaoming;
		student[1]=xiaohong;
		xiaoming.info();
		xiaohong.info();
	}

}
class Person{
	int age;
	double height;
	public void info(){
	System.out.println("我的年龄是:"+age+"我的身高是："+height);
}
}
