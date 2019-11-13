class _5a_Eager_Evaluation {
  public static int first(int x, int y) {
    System.out.println("Inside First...");
    return x;
  }

  public static void main(String[] args) {
    System.out.println(first(10, 20));     // 10
    System.out.println("Done!");
  }
}