import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GOLTester {
	public static void main(String[] args) {

	}
	
	@Test
	public void blinkerTest() {
	  int[][] boardUp = {{0,0,0,0,0},{0,0,1,0,0}, {0,0,1,0,0}, {0,0,1,0,0}, {0,0,0,0,0} };
	  int[][] boardSide = {{0,0,0,0,0},{0,0,0,0,0}, {0,1,1,1,0}, {0,0,0,0,0}, {0,0,0,0,0} };
	  TorusGameOfLife blinker = new TorusGameOfLife(boardUp) ;
	  //assertEquals(boardUp, blinker.getBoard());
	  blinker.oneStep();
	  assertArrayEquals(boardSide, blinker.getBoard());
	  blinker.oneStep();
	  assertArrayEquals(boardUp, blinker.getBoard());
    blinker.evolution(1);
    assertArrayEquals(boardSide, blinker.getBoard());
    blinker.evolution(2);
    assertArrayEquals(boardSide, blinker.getBoard());
	}
	
	@Test
	public void gliderTest(){
	  int[][] startPosition = {{0,0,0,0,0},{0,0,1,0,0},{0,0,0,1,0},{0,1,1,1,0},{0,0,0,0,0}};
	  TorusGameOfLife glider = new TorusGameOfLife(startPosition) ;
	  int[][] step8 = {{1,0,0,1,1},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,1},{1,0,0,0,0}};
	  glider.evolution(8);
    assertArrayEquals(step8, glider.getBoard());
    glider.evolution(12);
    assertArrayEquals(startPosition, glider.getBoard());
	}
}