
public class Overload {
	public void test(){
		System.out.println("�޲���");
	}
	public void test(String... name){
		System.out.println("�в���");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload ol = new Overload();
		ol.test();
		ol.test("Hello","122fhj");
	}

}
