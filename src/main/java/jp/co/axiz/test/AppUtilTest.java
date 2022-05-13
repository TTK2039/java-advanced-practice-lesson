package jp.co.axiz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.util.AppUtil;

public class AppUtilTest {
	//Appオブジェクト
	App obj = null;
	
	@Test
	public void isGameApptest1() {
		boolean result = AppUtil.isGameApp(obj =  new CardGameApp());
		boolean expected = true;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void isGameApptest2() {
		boolean result = AppUtil.isGameApp(obj =  new DartsGameApp());
		boolean expected = true;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void isGameApptest3() {
		boolean result = AppUtil.isGameApp(obj =  new ClockApp());
		boolean expected = false;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void isCardGameApptest1() {
		boolean result = AppUtil.isCardGameApp(obj =  new CardGameApp());
		boolean expected = true;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void isCardGameApptest2() {
		boolean result = AppUtil.isCardGameApp(obj =  new DartsGameApp());
		boolean expected = false;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void isCardGameApptest3() {
		boolean result = AppUtil.isCardGameApp(obj =  new ClockApp());
		boolean expected = false;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void isDartsGameApptest1() {
		boolean result = AppUtil.isDartsGameApp(obj =  new CardGameApp());
		boolean expected = false;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void isDartsGameApptest2() {
		boolean result = AppUtil.isDartsGameApp(obj =  new DartsGameApp());
		boolean expected = true;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void isDartsGameApptest3() {
		boolean result = AppUtil.isDartsGameApp(obj =  new ClockApp());
		boolean expected = false;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void isClockApptest1() {
		boolean result = AppUtil.isClockApp(obj =  new CardGameApp());
		boolean expected = false;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void isClockApptest2() {
		boolean result = AppUtil.isClockApp(obj =  new DartsGameApp());
		boolean expected = false;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void isClockApptest3() {
		boolean result = AppUtil.isClockApp(obj =  new ClockApp());
		boolean expected = true;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void getAppNametest1() {
		String result = AppUtil.getAppName(obj = new CardGameApp());
		String expected = "ゲーム：カード";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void getAppNametest2() {
		String result = AppUtil.getAppName(obj = new DartsGameApp());
		String expected = "ゲーム：ダーツ";
		
		assertEquals(expected, result);
	}
	
	@Test
	public void getAppName() {
		String result = AppUtil.getAppName(obj = new ClockApp());
		String expected = "時計";
		
		assertEquals(expected, result);
	}
	
}















