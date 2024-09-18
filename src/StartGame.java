import java.util.Scanner;
public class StartGame {
    //this class represent the start of the game

        Scanner in=new Scanner(System.in);
        //intantiating the objects of the gametable and gamechar
        GameTable st=new GameTable();
        GameChar playerObj=new GameChar();
        //this function starts the game
        public void letsPlay() {
            int row=0;
            int col=0;
            char charTic='-';
            boolean player1 = true;
            boolean endGame=false;
            while (endGame != true) {
                st.drawTable();
                //toggle the player turns
                if(player1) {
                    System.out.println(playerObj.getPlayerOne() + "'s Turn :");
                } else {
                    System.out.println(playerObj.getPlayerTwo() + "'s Turn :");
                }
                if(player1) {
                    charTic = playerObj.getPlayerOneChar();
                } else {
                    charTic = playerObj.getPlayerTwoChar();
                }
                //takes the inputs andd print the character 'x' or 'o'
                while(true){
                    System.out.println("choose row :");
                    row = in.nextInt();
                    System.out.println("choose col :");
                    col = in.nextInt();
                    //if wrong value are input than again ask for the row and column
                    if (row < 0 || col < 0 || row > 2 || col > 2) {
                        System.out.println("enter valid row and column index");
                    } else if (st.table[row][col] != '-') {
                        System.out.println("someone has already made a move");
                    } else {
                        break;
                    }
                }
                //displays the name of the winner
                st.setTable(row,col,charTic);
                if(st.playerWon() == playerObj.getPlayerOneChar()) {
                    System.out.println("Winner - " + playerObj.getPlayerOne());
                    endGame = true;
                } else if(st.playerWon() == playerObj.getPlayerTwoChar()) {
                    System.out.println("Winner - " + playerObj.getPlayerTwo());
                    endGame = true;
                }
                else {
                    if(st.boardIsFull()) {
                        System.out.println("It's a tie!");
                        endGame = true;
                    } else {
                        player1 = !player1;
                    }
                }
            }
            st.drawTable();
        }
    }


