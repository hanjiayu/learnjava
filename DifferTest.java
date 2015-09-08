public class DifferTest{
	public static void main(String args[]){
	//多态的使用1.父类型，子对象。 2.方法必须父类和子类都有。 3.类的继承
		Fruit f = new Apple();
		f.eat();
		//f.ea();//子类没有，所以不能调用
		System.out.println(f.color);//属性的时候只能是父类的
		Fruit f1= new LiuLian();
		f1.eat();
	}
}
class Fruit{
	String color = "pink";
	String type;
	public void eat(){
		System.out.println("水果可以吃");
	}
	public void eat(int i){
		System.out.println("!!!");
	}
	public void beauty(){
		System.out.println("水果能美容");
	}
}
class Apple extends Fruit{
	//String color="red";
	String name;
	public void eat(){
		System.out.println("苹果可以吃");
	}
	public void ea(){
		System.out.println("jlaj");
	}
}
class LiuLian extends Fruit{
	public void eat(){
		System.out.println("榴莲可以吃");
	}
	public void beauty(){
		System.out.println("榴莲美容");
	}
}
