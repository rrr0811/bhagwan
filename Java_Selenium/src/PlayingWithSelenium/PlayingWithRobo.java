package PlayingWithSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class PlayingWithRobo {
	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_NUM_LOCK);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_NUM_LOCK);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_SCROLL_LOCK);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_SCROLL_LOCK);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_NUM_LOCK);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_NUM_LOCK);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_SCROLL_LOCK);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_SCROLL_LOCK);
	}
}
