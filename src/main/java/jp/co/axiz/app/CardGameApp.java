package jp.co.axiz.app;

public class CardGameApp extends GameApp {
	
	public CardGameApp () {
	
	}
	
	public CardGameApp(String item) {
		super(item);
		setTime(10);
	}
	
	@Override
	protected String play() {
		return "ババ抜きを行います。";
	}
	
//	public String start(String name) {
//		String start;
//		start = (name + "さんと" + item + "でゲームを開始します。ババ抜きを行います。" );
//		return start;
//		
//	}

}
