class _3_Pass_And_Return_A_Function {
  public static double expensiveSquare(double x) {
    try { Thread.sleep(1000);  } 
    catch (InterruptedException e) { } // gulp
    return x * x;
  }
  
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    System.out.println(expensiveSquare(2.0));
    long timeTaken = System.currentTimeMillis() - startTime;
    System.out.println(String.format("Took %d (ms)", timeTaken));
    System.out.println("Done!");
  }
}