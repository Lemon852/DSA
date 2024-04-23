// We have 9x9 sudoku or a two dimensional array
// of  characters partially filled with numbers and blank spaces are represented by '.',
// we will create a logic to solve that problem using backtracking
public class sudokuSolver{

    public static boolean isSafe(char[][] board, int row, int col, int num){
        // row and column
        for(int i =0; i<board.length; i++){
            if(board[i][col]==(char)(num+'0')){
                return false;
            }
            if(board[row][i]==(char)(num+'0')){
                return false;
            }
        }
            //grid
        int srow = (row/3)*3;
        int scol = (col/3)*3;
        for(int a=srow; a<srow+3; a++){
            for(int b=scol; b<scol+3; b++){
                if(board[a][b] == (char)(num+'0')){
                    return false;
                }
            }
        }
    
        return true;
    }
    public static boolean solveSudoku(char[][] board, int row, int col){
        if(row == board.length){
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if(col!= board.length-1){
            ncol = col+1;
            nrow = row;
        }else{
            nrow = row+1;
            ncol = 0;
        }

        if(board[row][col]!='.'){
            if(solveSudoku(board, nrow, ncol)){
                return true;
            }
        }else{
            for(int i =1; i<=9; i++){
                if(isSafe(board, row, col, i)){
                    board[row][col] = (char)(i+'0');
                    if(solveSudoku(board, nrow, ncol)){
                        return true;
                    }else{
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        if(solveSudoku(board, 0,0)){
            System.out.println("Solved!:");
            System.out.println("_________________________");
            for(int i =0; i<board.length; i++){
                for(int j =0; j<9; j++){
                    System.out.print(board[i][j]+"|");
                    if(j==8){
                        System.out.println();
                    }


                }
            }

        }else{
            System.err.println("Not solved");
        }

    }
}