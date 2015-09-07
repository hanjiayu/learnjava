package java0906;

public class RandomStr {

	/**
	 * @param args
	 */
	//生成一个随机的6位字母
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		for(int j=0;j<6;j++){
		int i =(int) (Math.random()*26+97);
		char c = (char) i;
		s = s+c;
		}
		System.out.println(s);
	}

}
