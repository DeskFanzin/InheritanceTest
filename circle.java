public class circle extends shape {
  private double radius;

  public circle(double radius) {
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
    return "A circle with radius of " + getRadius() + " and " + (isFilled() ? "filled" : "not filled");
  }

}