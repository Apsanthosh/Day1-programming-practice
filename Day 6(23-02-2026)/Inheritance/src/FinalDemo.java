// A final class cannot be inherited
final class MathConstants {

    public static final double PI = 3.14159;

    public void showMessage() {
        System.out.println("This is a final class. It cannot be extended.");
    }
}
// UNCOMMENT this class to see the compiler error

/*
class AdvancedMath extends MathConstants {

    void display() {
        System.out.println("Trying to extend MathConstants...");
    }
}
*/
class Game {

    int score = 100;

    // final method → cannot be overridden
    public final void showScore() {
        System.out.println("Final Score: " + score);
    }
}
class ChessGame extends Game {

    // UNCOMMENT this to see the compiler error

    /*
    @Override
    public void showScore() {
        System.out.println("Trying to override score...");
    }
    */
}
public class FinalDemo {

    public static void main(String[] args) {

        // Using final class
        MathConstants constants = new MathConstants();
        constants.showMessage();
        System.out.println("PI Value: " + MathConstants.PI);

        System.out.println("------------------");

        // Using Game class
        ChessGame chess = new ChessGame();
        chess.showScore(); // Allowed because we did NOT override it
    }
}