import java.util.stream.*;

class _6a_Lazy_List_And_Parallelization {
  public static String capitalize(String s) {
    // try { Thread.sleep(1000); }
    // catch (Exception e) { }
    return s.toUpperCase();
  }
  
  public static String capitalizeWordsLessThanSize4(String sentence) {
    String [] words = sentence.split(" ");
    StringBuilder result = new StringBuilder();

    for (var word : words) {
      if (word.length() < 4) {
        result.append(capitalize(word));
        result.append(" ");
      }
    }
    return result.toString().trim();
  }
  
  public static void main(String[] args) {
    String sentence = "all mimsy were the borogoves and the momeraths";
    System.out.println(capitalizeWordsLessThanSize4(sentence)); // ALL THE AND THE
    System.out.println("Done!");
  }
}