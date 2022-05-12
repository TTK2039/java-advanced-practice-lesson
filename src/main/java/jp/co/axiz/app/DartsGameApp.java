package jp.co.axiz.app;

public class DartsGameApp extends GameApp {
	public DartsGameApp() {
		
	}
	
	public DartsGameApp(String s) {
		super(s);
		setTime(5);
	}
	@Override
	protected String play () {
		return "10回投げて合計点を競います。";
	}
}
