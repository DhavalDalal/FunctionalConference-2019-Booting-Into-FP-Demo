class _9_Currying {
  static String merge(String x, Integer y) {
    return x + y.toString();
  }
  
  public static void main(String[] args) {
    System.out.println(merge("Test#", 1));
    System.out.println("Done!");
  }
}