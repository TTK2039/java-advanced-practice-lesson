package jp.co.axiz.util;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.app.GameApp;

public class AppUtil {
	
	public static boolean isGameApp(App obj) {
		if(obj instanceof GameApp) {
			return true;
		}else {
		return false;
		}
	}
	
	public static boolean isCardGameApp(App obj) {
		if(obj instanceof CardGameApp) {
			return true;
		}else {
		return false;
		}
	}
	
	public static boolean isDartsGameApp(App obj) {
		if(obj instanceof DartsGameApp) {
			return true;
		}else {
		return false;
		}
	}
	
	public static boolean isClockApp(App obj) {
		if(obj instanceof ClockApp) {
			return true;
		}else {
		return false;
		}
	}
	
	public static String getAppName(App obj) {
		if(obj instanceof CardGameApp) {
			return "ゲーム：カード";
		}else if (obj instanceof DartsGameApp) {
			return "ゲーム：ダーツ";
		}else if(obj instanceof ClockApp) {
			return "時計";
		}else {
			return "処理の失敗";
		}
	}
	
}
