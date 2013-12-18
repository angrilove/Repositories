/**
 * 
 */
package smse.util;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;

public class RandomGraphics {

	Random random = new Random();
	private String checkCode;
	private int width = 65;
	private int height = 25;
	private int imageType = BufferedImage.TYPE_INT_RGB;
	private int charLength = 4;
	private final String character = "0ABC1DEF2GHI3JKL4MNO5PQR6ST7UV8WX9YZ";

	public String buildImage(OutputStream out) {
		BufferedImage image = new BufferedImage(this.width, this.height, this.imageType);
		Graphics g = image.getGraphics();
		Graphics2D g2d = (Graphics2D) g;
		g.setColor(this.getColor(200, 250));
		g.fillRect(0, 0, this.width, this.height);
		g.setFont(new Font("Times New Roman", Font.BOLD, 17));
		g.setColor(new Color(0, 0, 0));
		
		for (int i = 0; i < 100; i++) {
			int x1 = random.nextInt(this.width);
			int y1 = random.nextInt(this.height);
			int x2 = random.nextInt(this.width - 3);
			int y2 = random.nextInt(this.height - 3);
			BasicStroke bs = new BasicStroke(2f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

			Line2D line = new Line2D.Double(x1, y1, x2, y2);
			g2d.setStroke(bs);
			g2d.draw(line);
			g.setColor(getColor(180, 222));
		}
		StringBuffer codeStr = new StringBuffer();
		for (int i = 0; i < this.charLength; i++) {
			char c = character.charAt(random.nextInt(36));
			codeStr.append(c);
			Color color = new Color(20 + random.nextInt(110),
					20 + random.nextInt(110), 20 + random.nextInt(110));
			g.setColor(color);
			g.drawString(String.valueOf(c), 15 * i + 2, 20);
		}
		this.checkCode = codeStr.toString();

		g.dispose();
		try {
			ImageIO.write(image, "JPEG", out);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this.checkCode;
	}
	
	private Color getColor(int fc, int bc) {
		if (fc > 255) {
			fc = 255;
		}
		if (bc > 255) {
			bc = 255;
		}
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}
	
	public int getCharLength() {
		return charLength;
	}

	public void setCharLength(int charLength) {
		this.charLength = charLength;
	}

	public String getCheckCode() {
		return checkCode;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getImageType() {
		return imageType;
	}
	
	public void setImageType(int imageType) {
		this.imageType = imageType;
	}
	
}
