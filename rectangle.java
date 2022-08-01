public class rectangle extends shape {
  private double width;
  private double height;

  public rectangle(String color, boolean filled, double width, double height) {
    super(color, filled);
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getArea() {
    return width * height;
  }

  public double getPerimeter() {
    return 2 * (width + height);
  }

  public String toString() {
    return "A rectangle with width of " + getWidth() + " and height of " + getHeight() + ", " + getColor() + " and "
        + (isFilled() ? "filled" : "not filled");
  }
}
