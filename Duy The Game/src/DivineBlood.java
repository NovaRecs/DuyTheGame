import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class DivineBlood extends GameObject{

	private BufferedImage DivineBlood_image;
	
	public DivineBlood(int x, int y, ID id, SpriteSheetLvl1 ss) {
		super(x, y, id, ss);
		DivineBlood_image = ss.grabImage(19, 2, 32, 32);
	}
	
	public void tick() {
		
	}

	public void render(Graphics g) {
		g.drawImage(DivineBlood_image, x, y, null);
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}

}
