
public class DogTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.run();
	}
}
class Dog{
	public   void jump(){
		System.out.println("����ִ��jump�ķ���");
	}
	public void run(){
		this.jump();            
		System.out.println("����ִ��run����");
	}
}

