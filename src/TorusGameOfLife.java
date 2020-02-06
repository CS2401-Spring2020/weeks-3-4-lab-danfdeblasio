public class TorusGameOfLife extends GameOfLife{
  
  /* Constructors */
  //Default constructor
  TorusGameOfLife(){}
  
  //Constructor that takes a size as input (this will be the number of rows as well as the number of columns of your board and previous)
  TorusGameOfLife(int inSize){
    super(inSize);
  }
  
  //Constructor that take a 2D array as an input (its size will be the size of the board and previous; its content is to be copied into previous)
  TorusGameOfLife(int[][] inBoard) {
    super(inBoard); 
  }
  
  // Takes two indices (representing a row index and a column index). Computes the number of neighbors the corresponding cell on the board has.
  public int neighbors(int i, int j) {
    int rtn = 0;

    int ip1 = (i + 1) % size;
    int jp1 = (j + 1) % size;
    int im1 = (size + i - 1) % size;
    int jm1 = (size + j - 1) % size;
    
    
    rtn += previousBoard[im1][jm1];     // up left
    rtn += previousBoard[im1][j];       // up
    rtn += previousBoard[im1][jp1];     // up right
    rtn += previousBoard[i][jp1];       // right
    rtn += previousBoard[ip1][jp1];     // down right
    rtn += previousBoard[ip1][j];       // down 
    rtn += previousBoard[ip1][jm1];     // down left
    rtn += previousBoard[i][jm1];       // left
    
    
    return rtn;
  }// end neighbors
  
}
