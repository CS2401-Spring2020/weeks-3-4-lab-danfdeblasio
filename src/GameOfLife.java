public class GameOfLife {
  
  /* Elements */
  public int size;
  public int[][] board;
  public int[][] previousBoard;
  
  /* Constructors */
  //Default constructor
  GameOfLife(){}
  
  //Constructor that takes a size as input (this will be the number of rows as well as the number of columns of your board and previous)
  GameOfLife(int inSize){
    size = inSize;
    board = new int[size][size];
    previousBoard = new int[size][size];
  }
  
  //Constructor that take a 2D array as an input (its size will be the size of the board and previous; its content is to be copied into previous)
  GameOfLife(int[][] inBoard) {
    // Check that the input is a square. 
    if(inBoard.length != inBoard[0].length) {
      System.err.println("The board given is not is square, it is " + inBoard.length + " by " + inBoard[0].length);
    }
    
    size = inBoard.length;
    board = new int[size][size];
    previousBoard = new int[size][size];
    
    for(int i=0; i<size; i++) {
      for(int j=0; j<size; j++) {
        previousBoard[i][j] = inBoard[i][j];
      }
    }
    
  }// end 2D in constructor
  
  /* Methods */
  
  //returns the current board
  public int[][] getBoard(){
    return board.clone();
  }
  
  // (1) Takes no parameter and is a void method, (1) It consists in transforming the current board into its next shape (board at next time stamp).
  public void oneStep() {
    
    for(int i=0; i<size; i++) {
      for(int j=0; j<size; j++) {
        int numNeighbors = neighbors(i,j);
        
        if(previousBoard[i][j] == 1) {             // was alive last round
          if(numNeighbors<2) board[i][j] = 0;      // under population
          else if(numNeighbors>3) board[i][j] = 0; // over population
          else board[i][j] = 1;
        }else {                                    // wasn't alive last time
          if(numNeighbors == 3) board[i][j] = 1;   //reproduction
          else board[i][j] = 0;
        }
        
        
      }
    }
    
    for(int i=0; i<size; i++) {
      for(int j=0; j<size; j++) {
        previousBoard[i][j] = board[i][j];
      }
    }
  }// end oneStep
  
  // Takes two indices (representing a row index and a column index). Computes the number of neighbors the corresponding cell on the board has.
  public int neighbors(int i, int j) {
    int rtn = 0;
    boolean firstColumn = (j==0);
    boolean lastColumn = (j==size-1);
    boolean firstRow = (i==0);
    boolean lastRow = (i==size-1);

    if(!firstRow && !firstColumn) rtn += previousBoard[i-1][j-1];     // up left
    if(!firstRow)                 rtn += previousBoard[i-1][j];       // up
    if(!firstRow && !lastColumn)  rtn += previousBoard[i-1][j+1];     // up right
    if(!lastColumn)               rtn += previousBoard[i][j+1];       // right
    if(!lastRow && !lastColumn)   rtn += previousBoard[i+1][j+1];     // down right
    if(!lastRow)                  rtn += previousBoard[i+1][j];       // down 
    if(!lastRow && !firstColumn)  rtn += previousBoard[i+1][j-1];     // down left
    if(!firstColumn)              rtn += previousBoard[i][j-1];       // left
    
    
    return rtn;
  }// end neighbors
  
  //Takes an integer n, which represents the number of evolution steps we need to conduct. Transforms the board into the board after n steps of evolution (i.e., n successive calls to oneStep).
  public void evolution(int n) {
    for(int i=0; i<n; i++) oneStep();
  }
  
  //Prints the current board 
  public void printCurrentBoard() { printBoard(board); }
  //Prints the previous board
  public void printPreviousBoard() { printBoard(previousBoard); }
  
  //Prints any given board, static so it can be called by any element
  public static void printBoard(int[][] inBoard) {
    System.out.print("[");
    for(int i=0; i<inBoard.length; i++) {
      if(i!=0) System.out.print(" ");
      System.out.print("[");
      for(int j=0; j<inBoard[0].length; j++) {
        System.out.print((inBoard[i][j]==1)?"X":" ");
      }
      System.out.print("]");
      if(i<inBoard[0].length-1) System.out.print("\n");
    }
    System.out.println("]");
  }// end printBoard
  
}
