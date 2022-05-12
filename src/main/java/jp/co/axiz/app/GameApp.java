package jp.co.axiz.app;

public abstract class GameApp implements App {
	
	//item
	private String item;
	
	public String getItem() {
		return this.item;
	}
	
	public String setItem(String item) {
		return this.item = item;
	}
	
	//playTime
	private int playTime;
	
	public int getTime() {
		return this.playTime;
	}
	
	public int setTime(int time) {
		return this.playTime = time;
	}
	
	//GameApp
	public GameApp() {
	}

	public GameApp(String item) {
		this.item = item;
	}
	
	protected abstract String play();
	
	public String start(String name) {
		return name + "さんと" + item + "でゲームを開始します。" + play();
	}
	
}
