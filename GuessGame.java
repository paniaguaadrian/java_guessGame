/**
 * GuessGame
 */
public class GuessGame {
  // GuessGame has three instance variables for the three Player objects.
  static Player p1;
  static Player p2;
  static Player p3;

  public static void startGame() {
    // Create three Player objects and assign them to
    // the three Player instance variables.
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    // Declare three variables to hold the three
    // guesess the Players make
    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;

    // Declare three variables to hold a true or false
    // based on the player's answer
    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    // Create a target number that the players should guess
    int targetNumber = (int) (Math.random() * 10);
    System.out.println("I'm thiking of a number between 0 and 9...");

    while (true) {
      System.out.println("Number to guess is " + targetNumber);

      // Call each player's guess method
      p1.guess();
      p2.guess();
      p3.guess();

      // Get each player's guess (the result of their guess() method running)
      // by accessing the number variable of each player
      guessp1 = p1.number;
      System.out.println("Player one guessed " + guessp1);

      guessp2 = p2.number;
      System.out.println("Player two guessed " + guessp2);

      guessp3 = p3.number;
      System.out.println("Player three guessed " + guessp3);

      // Check if the player's guess to see if it matches the target number.
      // If a player is right, then set p1isRight to true.
      if (guessp1 == targetNumber) {
        p1isRight = true;
      }

      if (guessp2 == targetNumber) {
        p2isRight = true;
      }

      if (guessp3 == targetNumber) {
        p3isRight = true;
      }

      if (p1isRight || p2isRight || p3isRight) {
        System.out.println("We have a winner!");
        System.out.println("Player one got it right? " + p1isRight);
        System.out.println("Player two got it right? " + p2isRight);
        System.out.println("Player three got it right? " + p3isRight);
        System.err.println("Game is over");
        break; // Game over so break out the loop
      } else {
        // We must keep going because nobody got it right
        System.out.println("Players will have to try again!");
      }
    }
  }

}