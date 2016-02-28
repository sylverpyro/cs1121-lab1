// Michael S. Benson
// CS 1121 Section 10

import java.awt.*;
public class lab1 extends Animator {
    public void draw (int x, int y, Graphics g) {

	// draw a black 40x40 circle
	g.setColor(Color.black);
	g.fillOval(x-20,y-40,40,40);

	// draw a white line across the middle of the circle
	g.setColor(Color.white);
	g.drawLine(x-20,y-20,x+20,y-20);

    } // end of draw method

} // end of lab1 class

