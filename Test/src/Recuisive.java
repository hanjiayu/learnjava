//f(0)=£¬f(1)=4,f(n+2)=2*f(n+1)+f(n)
//Çóf(10);
public class Recuisive {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		System.out.println(t.fn(2));
	}

}
class Test{
	public int fn(int n){
		if(n==0){
			return 1;
		}
		else if(n==1){
			return 4;
		}
		else{
		return 2 * fn(n-1)+fn(n-2);
	}
}
}
