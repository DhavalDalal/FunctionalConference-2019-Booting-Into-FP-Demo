import java.util.function.*;

class _5d_Simulate_Lazy_Evaluation {
  public static int loop() {
    System.out.println("Inside Loop...");
    return loop();
  }
  
  public static int first(int x, int y) {
    System.out.println("Inside First...");
    return x;
  }
  
  public static void main(String[] args) {
    System.out.println(first(10, 20));
    System.out.println("Done!");
  }
}
