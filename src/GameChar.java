import java.util.Scanner;
public class GameChar {
    //instance variable
    private String playerOne;
    private String playerTwo;
    private char playerOneChar;
    private char playerTwoChar;
    //constructor to take the name and character of the player
    public GameChar() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter player 1 name :");
        this.playerOne = in.nextLine();
        System.out.println("Enter player 2 name :");
        this.playerTwo = in.nextLine();
        System.out.println("let's play the game-tic tac toe");
        System.out.println(playerOne + " : choose your character 'x' or 'o' :");
        this.playerOneChar = in.next().charAt(0);
        System.out.println(playerTwo + " : choose your character 'x' or 'o' :");
        this.playerTwoChar = in.next().charAt(0);
    }
    //appropriate getters for tha name and characters
    public String getPlayerOne(){
        return playerOne;
    }
    public String getPlayerTwo(){
        return playerTwo;
    }
    public char getPlayerOneChar(){
        return playerOneChar;
    }
    public char getPlayerTwoChar(){
        return playerTwoChar;
    }
}


