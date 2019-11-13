import java.util.*;

class User {
  private final String id;
  private int miles;
    
  User(String id) {
    this.id = id;
  }
  
  public int addPointsUsing(int miles) {
    this.miles += miles;
    // Convert miles to points and 
    // return that (for now hard-coded).
    return 200;
  }
}

class UserRepository {
  public User findBy(String id) {
    if (null == id || id.isEmpty()) {
      System.out.println("No User Found");
      return null;
    } else {
      System.out.println("Found user with " + id);
      return new User(id);
    }
  }
}

class _10_SequencingOperations {
  public static void main(String[] args) {
    String frequentFlyerId = "123456789";
    // String frequentFlyerId = null;
    UserRepository userRepository = new UserRepository();
    User user = userRepository.findBy(frequentFlyerId);
    String targetPage = null;
    int miles = 7000;
    if (user != null) {
      int newPoints = user.addPointsUsing(miles);
      System.out.println("New Points = " + newPoints);
      targetPage = "http://tierPage";
    } else {
      targetPage = "http://loginPage";
    }
    System.out.println("Going to => " + targetPage);
    System.out.println("Done!");
  }
}