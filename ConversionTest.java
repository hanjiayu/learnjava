
public class ConversionTest {
	public static void main(String args[]){
		double d = 13.4;
		long l = (long)d;
		System.out.println(l);
		int in = 5;
		//boolean b =(boolean)in;
		//不可转换的类型
		Object obj = "Hello";
		String objStr = (String )obj;
		System.out.println(objStr);
		Object objPri = new Integer(5);
		String str = (String )objPri;
		//引发异常
	}
}
