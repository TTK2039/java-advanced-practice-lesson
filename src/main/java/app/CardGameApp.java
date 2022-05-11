package app;

public class CardGameApp extends GameApp {
	
	public CardGameApp () {
	
	}
	
	public CardGameApp(String item) {
		super(item);
	}
	
	@Override
	public String play() {
		return "ババ抜きを行います。";
	}
	
//	public String start(String name) {
//		String start;
//		start = (name + "さんと" + item + "でゲームを開始します。ババ抜きを行います。" );
//		return start;
//		
//	}

}
