import processing.core.PApplet;

public class Sketch extends PApplet {
	
  // Called once at the beginning of execution. Size Is Set
  public void settings() {

	// Size Of House Picture
    size(400, 400);
  }

  // Called once at the beginning of execution. Background Of House Is Set
  public void setup() {
    background(51, 153, 255);
  }

  // Drawing The House
  public void draw() {
	  
	  // Sun
    fill(255, 255, 0);
    ellipse(width/8, height/8, width/5, height/5);

    // Hill
    fill(0, 153, 0);
    ellipse((float) (width/1.21), (float) (height/1.14), width/2, height/2);

    // Hill
    fill(0, 153, 0);
    ellipse(width/4, (float) (height/1.08), width/2, height/2);

    // Hill
    fill(0, 153, 0);
    ellipse((float) (width/13.33), (float) (height/1.05), width/2, height/2);

    // Hill
    fill(0, 153, 0);
    ellipse((float) (width/1.08), (float) (height/1.05), width/2, height/2);

    // Grass
    fill(102, 255, 102);
    rect(0, (float) (height/1.18), width/1, height/1);

    // Cloud
    fill(255, 255, 255);
    ellipse((float) (width/1.66), (float) (height/13.33), (float) (width/2.86), height/10);

    // Cloud
    fill(255, 255, 255);
    ellipse((float) (width/1.38), height/10, (float) (width/2.86), height/10);

    // Cloud
    fill(255, 255, 255);
    ellipse((float) (width/2.11), (float) (height/10.81), (float) (width/2.86), height/10);

    // House Bricks
    fill(255, 204, 51);
    rect(width/4, (float) (height/2.58), width/2, height/2);

    // Door
    fill(153, 102, 0);
    rect((float) (width/2.29), (float) (height/1.43), width/8, (float) (height/5.33));

    // Window
    fill(255, 255, 255);
    rect((float) (width/3.57), (float) (height/1.43), width/8, height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/3.74), (float) (height/1.43), (float) (width/6.66), height/80);

    // Window
    fill(255, 255, 255);
    rect((float) (width/1.68), (float) (height/1.43), width/8, height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/1.72), (float) (height/1.43), (float) (width/6.66), height/80);

    // Window
    fill(255, 255, 255);
    rect((float) (width/3.57), height/2, (float) (width/5.33), height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/3.74), height/2, (float) (width/4.70), height/80);

    // Window
    fill(255, 255, 255);
    rect((float) (width/1.88), height/2, (float) (width/5.33), height/8);

    // Window Roof
    fill(51, 0, 0);
    rect((float) (width/1.92), height/2, (float) (width/4.71), height/80);

    // Door Handle
    fill(255, 204, 0);
    ellipse((float) (width/1.86), (float) (height/1.27), width/40, height/40);

    // House Chimny
    fill(255, 204, 51);
    rect((float) (width/1.60), height/5, width/16, (float) (height/5.71));

    // Chimny Exit
    fill(51, 0, 0);
    rect((float) (width/1.63), height/5, (float) (width/11.4), height/80);

    // House Roof
    fill(51, 0, 0);
    triangle(width/2, (float) (height/5.33), (float) (width/1.23), (float) (height/2.29), (float) (width/5.33), (float) (height/2.29));

    // Tree Leaves
    fill(0, 102, 0);
    ellipse((float) (width/6.15), (float) (height/1.82), width/4, height/4);

    // Tree Trunk
    fill(102, 51, 0);
    rect((float) (width/7.27), (float) (height/1.48), width/20, height/4);

    // Bush
    fill(0, 102, 0);
    ellipse((float) (width/1.27), (float) (height/1.21), (float) (width/6.66), (float) (height/6.66));

    // Bush
    fill(0, 102, 0);
    ellipse((float) (width/1.18), (float) (height/1.14), (float) (width/6.66), (float) (height/6.66));

    // Bush
    fill(0, 102, 0);
    ellipse((float) (width/1.33), (float) (height/1.14), (float) (width/6.66), (float) (height/6.66));
  }
  
  // define other methods down here.
}