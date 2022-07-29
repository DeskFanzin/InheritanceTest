public class shape {
  protected String color;
  protected boolean filled;

  public shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getArea() {
    return 0;
  }

  public double getPerimeter() {
    return 0;
  }

  public String toString() {
    return "A shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
  }
}