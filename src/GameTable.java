public class GameTable {
    //this class prints the game table and checks the winning player

        //instantiating 2-d array object
        char[][] table=new char[3][3];
        //constructor builds the table
        public GameTable(){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    table[i][j]='-';
                }
            }
        }
        //this is type of getter that takes the row and col and print the character to that position
        public void setTable(int row,int col,char pattern){
            table[row][col]=pattern;
        }
        //this function prints table
        public void drawTable(){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(table[i][j]);
                }
                System.out.println();
            }
        }
        //this function checks wheather the table is full or not
        boolean check=false;
        public boolean boardIsFull() {
            boolean finished=false;
            for(int i = 0; i < 3 && finished==false ; i++) {
                for(int j = 0; j < 3; j++) {
                    if(table[i][j] == '-') {
                        check=false;
                        finished=true;
                        break;
                    }
                    else {
                        check=true;
                    }
                }
            }
            return check;
        }
        //this function check the winner of the game
        public char playerWon(){
            char returningChar = '-';
            for(int i = 0; i < 3; i++) {
                if(table[i][0] == table[i][1] && table[i][1] == table[i][2] && table[i][0] != '-') {
                    returningChar=table[i][0];
                }
            }

            for(int j = 0; j < 3; j++) {
                if(table[0][j] == table[1][j] && table[1][j] == table[2][j] && table[0][j] != '-') {
                    returningChar= table[0][j];
                }
            }

            if(table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[0][0] != '-') {
                returningChar= table[0][0];
            }
            if(table[2][0] == table[1][1] && table[1][1] ==  table[0][2] && table[2][0] != '-') {
                returningChar= table[2][0];
            }
            if(check==true){
                returningChar=' ';
            }
            return returningChar;
        }

    }

