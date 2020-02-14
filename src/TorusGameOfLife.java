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
    
    // if the board is a 1x1 then there are no neighbors
    if(ip1 == i && jp1 == j && im1 == i && jm1 ==j) return 0; 
    
    // in the following, if the previous column is the same as the next column 
    //(i.e. if it is a 2x2 board) only include the new actual location the first time. 
                                rtn += previousBoard[im1][jm1];     // up left
                                rtn += previousBoard[im1][j];       // up
    if(jp1!=jm1)                rtn += previousBoard[im1][jp1];     // up right (could be the same as up left)
                                rtn += previousBoard[i][jp1];       // right
    if(ip1 != im1)              rtn += previousBoard[ip1][jp1];     // down right (could be the same as up right)
    if(ip1 != im1)              rtn += previousBoard[ip1][j];       // down (could be the same as up)
    if(ip1 != im1 && jp1!=jm1)  rtn += previousBoard[ip1][jm1];     // down left (could be the same as down right, up right, up left)
    if(jp1!=jm1)                rtn += previousBoard[i][jm1];       // left (could be the same as right)
    
    
    return rtn;
  }// end neighbors
  
}
