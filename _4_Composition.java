import java.util.function.*;

class _4_Composition {
  public static double square(double x) {
    return x * x;
  }
  
  public static double twice(double x) {
    return 2 * x;
  }
  
  public static double squareAndThenTwice(double x) {
    return twice(square(x));
  }

  public static double squareComposeTwice(double x) {
    return square(twice(x));
  }
  
  public static void main(String[] args) {
    System.out.println(squareAndThenTwice(3)); // 18
    System.out.println(squareComposeTwice(3)); // 36
    System.out.println("Done!");
  }
}