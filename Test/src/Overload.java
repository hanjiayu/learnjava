
public class Overload {
	public void test(){
		System.out.println("无参数");
	}
	public void test(String... name){
		System.out.println("有参数");
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
