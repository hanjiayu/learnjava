//�Զ��幹����
public class ConstructorTest {
	public String name;
	public int count;
	public ConstructorTest(String name,int count){
		this.name = name;
		this.count = count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorTest cs = new ConstructorTest("С��",90);
		System.out.println(cs.name);
		System.out.println(cs.count);
	}

}
