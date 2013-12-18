package com.loton;

/* 
 图片采集的代码 
 */
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class ShotImage {
	private Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	@SuppressWarnings("unused")
	private String imageFormat = "jpg";
	@SuppressWarnings("unused")
	private int Num = 0;
	BufferedImage screenshot;

	public synchronized BufferedImage snapShot() {
		try {
			screenshot = (new Robot()).createScreenCapture(new Rectangle(0, 0,
					(int) dimension.getWidth(), (int) dimension.getHeight()));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return screenshot;
	}
}
