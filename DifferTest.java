public class DifferTest{
	public static void main(String args[]){
	//��̬��ʹ��1.�����ͣ��Ӷ��� 2.�������븸������඼�С� 3.��ļ̳�
		Fruit f = new Apple();
		f.eat();
		//f.ea();//����û�У����Բ��ܵ���
		System.out.println(f.color);//���Ե�ʱ��ֻ���Ǹ����
		Fruit f1= new LiuLian();
		f1.eat();
	}
}
class Fruit{
	String color = "pink";
	String type;
	public void eat(){
		System.out.println("ˮ�����Գ�");
	}
	public void eat(int i){
		System.out.println("!!!");
	}
	public void beauty(){
		System.out.println("ˮ��������");
	}
}
class Apple extends Fruit{
	//String color="red";
	String name;
	public void eat(){
		System.out.println("ƻ�����Գ�");
	}
	public void ea(){
		System.out.println("jlaj");
	}
}
class LiuLian extends Fruit{
	public void eat(){
		System.out.println("�������Գ�");
	}
	public void beauty(){
		System.out.println("��������");
	}
}
