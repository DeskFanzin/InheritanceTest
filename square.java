public class square extends rectangle {

  public square(String color, boolean filled, double side) {
    super(color, filled, side, side);
  }

  public String toString() {
    return "A square with side of " + getWidth() + ", " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
  }
}
