package app;

public class GameApp {
	
	public String item;
	
	public GameApp() {
		
	}
	
	public GameApp(String item) {
		this.item = item;
	}
	
	public String start(String name) {
		String start;
		start = (name + "さんと" + this.item + "でゲームを開始します" );
		return start;
	}

}