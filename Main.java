public class Main {

  public static void showinfo(shape s) {
    System.out.println(s.toString());
  }

  public static void main(String[] args) {
    circle c = new circle("blue", true, 7);
    showinfo(c);
    square sq = new square("blue", false, 5);
    showinfo(sq);

    rectangle r = new rectangle("black", true, 3, 6);
    showinfo(r);

    shape s = new shape("green", true);
    showinfo(s);

  }

}
