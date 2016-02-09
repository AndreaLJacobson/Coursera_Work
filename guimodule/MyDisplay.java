package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet{
	public void setup()
	{
		size(500,500);
		background(200,200,200);
		
	}
	
	public void draw()
	{
		fill(255,0,0);
		ellipse(250, 250, width/3, height/3);
		//left eye
		fill(255,255,255);
		ellipse(225, 225, width/10, height/10);
		fill(0,0,0);
		ellipse(230, 230, width/20, height/20);
		//right eye
		fill(255,255,255);
		ellipse(275, 225, width/10, height/10);
		fill(0,0,0);
		ellipse(270, 220, width/20, height/20);
		//mouth
		fill(0,0,0);
		arc(250, 275, 75, 75, 0, PI, CHORD);
	}
}
