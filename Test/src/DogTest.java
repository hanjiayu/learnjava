
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
		System.out.println("正在执行jump的方法");
	}
	public void run(){
		this.jump();            
		System.out.println("正在执行run方法");
	}
}

