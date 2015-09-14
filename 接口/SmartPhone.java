
public class SmartPhone extends Telphone implements IPlayGame {

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("具有了玩游戏的功能");
	}
	public void message(){
		System.out.println("通过语音发短信");
	}
	public void call(){
		System.out.println("通过语音打电话");
	}

}
