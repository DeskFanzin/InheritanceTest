public class circle extends shape {
  private double radius;

  public circle(String color, boolean filled, double radius) {
    super(color, filled);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  public String toString() {
    return "A circle with radius of " + getRadius() + ", " + getColor() + " and "
        + (isFilled() ? "filled" : "not filled");
  }

}