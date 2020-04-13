package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
	int move = 0;
	MovingMorph(int x, int y) {
		super(x, y);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(collectX(), collectY(), collectwidth(), collectheight());
	}
	public void update() {
		setX((int)(collectX()+Math.cos(move)));
		move++;
	}
	
}

