package jp.co.axiz.app;

/**
 * ダーツゲームアプリを表すクラス
 */
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
