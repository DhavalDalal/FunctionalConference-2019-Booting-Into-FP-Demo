import java.util.function.*;

class _2_Return_A_Function_From_A_Function {
  public static double square(double x) {
    return x * x;
  }
  
  public static double cube(double x) {
    return x * x * x;
  }
  
  public static void main(String[] args) {
    System.out.println(square(2.0));
    System.out.println(cube(2.0));
    System.out.println("Done!");
  }
}