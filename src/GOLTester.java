import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

class GOLTester {
	public static void main(String[] args) {
	}
	
	@Test
	public void squareSmallTest() {
	  int[][] squareArr = {{1,1},{1,1}};
	  GameOfLife square = new GameOfLife(squareArr) ;
	  //assertEquals(boardUp, blinker.getBoard());
	  square.oneStep();
	  assertArrayEquals(squareArr, square.getBoard());
	  for(int i=0; i<100; i += 10) {
		  square.evolution(i);
		  assertArrayEquals(squareArr, square.getBoard());
	  }
	}
	
	@Test
  public void squareSmallTorusTest() {
    int[][] squareArr = {{1,1},{1,1}};
    TorusGameOfLife square = new TorusGameOfLife(squareArr) ;

    int[][] squareArrAfter = {{1,1},{1,1}};
    //assertEquals(boardUp, blinker.getBoard());
    square.oneStep();
    assertArrayEquals(squareArrAfter, square.getBoard());
    for(int i=0; i<100; i += 10) {
      square.evolution(i);
      assertArrayEquals(squareArrAfter, square.getBoard());
    }
  }
	
  @Test
  public void small2b2TorusTest() {
    int[][] squareArr = {{1,0},{1,1}};
    TorusGameOfLife square = new TorusGameOfLife(squareArr) ;

    int[][] squareArrAfter = {{1,1},{1,1}};
    //assertEquals(boardUp, blinker.getBoard());
    square.oneStep();
    assertArrayEquals(squareArrAfter, square.getBoard());
    for(int i=0; i<100; i += 10) {
      square.evolution(i);
      assertArrayEquals(squareArrAfter, square.getBoard());
    }
  }
  
  @Test
  public void small2b2TorusTest2() {
    int[][] squareArr = {{1,0},{0,1}};
    TorusGameOfLife square = new TorusGameOfLife(squareArr) ;

    int[][] squareArrAfter = {{0,0},{0,0}};
    //assertEquals(boardUp, blinker.getBoard());
    square.oneStep();
    assertArrayEquals(squareArrAfter, square.getBoard());
    for(int i=0; i<100; i += 10) {
      square.evolution(i);
      assertArrayEquals(squareArrAfter, square.getBoard());
    }
  }
  
  @Test
  public void small2b2TorusTest3() {
    int[][] squareArr = {{0,0},{0,1}};
    TorusGameOfLife square = new TorusGameOfLife(squareArr) ;

    int[][] squareArrAfter = {{0,0},{0,0}};
    //assertEquals(boardUp, blinker.getBoard());
    square.oneStep();
    assertArrayEquals(squareArrAfter, square.getBoard());
    for(int i=0; i<100; i += 10) {
      square.evolution(i);
      assertArrayEquals(squareArrAfter, square.getBoard());
    }
  }
  
  @Test
  public void small1b1TorusTest1() {
    int[][] squareArr = {{0}};
    TorusGameOfLife square = new TorusGameOfLife(squareArr) ;

    int[][] squareArrAfter = {{0}};
    //assertEquals(boardUp, blinker.getBoard());
    square.oneStep();
    assertArrayEquals(squareArrAfter, square.getBoard());
    for(int i=0; i<100; i += 10) {
      square.evolution(i);
      assertArrayEquals(squareArrAfter, square.getBoard());
    }
  }
  
  @Test
  public void small1b1TorusTest2() {
    int[][] squareArr = {{1}};
    TorusGameOfLife square = new TorusGameOfLife(squareArr) ;

    int[][] squareArrAfter = {{0}};
    //assertEquals(boardUp, blinker.getBoard());
    square.oneStep();
    assertArrayEquals(squareArrAfter, square.getBoard());
    for(int i=0; i<100; i += 10) {
      square.evolution(i);
      assertArrayEquals(squareArrAfter, square.getBoard());
    }
  }
	
	@Test
	public void squareTest() {
	  int[][] squareArr = {{0,0,0,0},{0,1,1,0,}, {0,1,1,0}, {0,0,0,0}};
	  GameOfLife square = new GameOfLife(squareArr) ;
	  //assertEquals(boardUp, blinker.getBoard());
	  square.oneStep();
	  assertArrayEquals(squareArr, square.getBoard());
	  for(int i=0; i<100; i += 10) {
		  square.evolution(i);
		  assertArrayEquals(squareArr, square.getBoard());
	  }
	}
	
	@Test
	public void squareTorusTest() {
	  int[][] squareArr = {{0,0,0,0},{0,1,1,0,}, {0,1,1,0}, {0,0,0,0}};
	  TorusGameOfLife square = new TorusGameOfLife(squareArr) ;
	  //assertEquals(boardUp, blinker.getBoard());
	  square.oneStep();
	  assertArrayEquals(squareArr, square.getBoard());
	  for(int i=0; i<100; i += 10) {
		  square.evolution(i);
		  assertArrayEquals(squareArr, square.getBoard());
	  }
	}
	
	@Test
	public void blinkerTest() {
	  int[][] boardUp = {{0,0,0,0,0},{0,0,1,0,0}, {0,0,1,0,0}, {0,0,1,0,0}, {0,0,0,0,0} };
	  int[][] boardSide = {{0,0,0,0,0},{0,0,0,0,0}, {0,1,1,1,0}, {0,0,0,0,0}, {0,0,0,0,0} };
	  GameOfLife blinker = new GameOfLife(boardUp) ;
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
	public void blinkerTorusTest() {
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
	public void gliderTorusTest(){
	  int[][] startPosition = {{0,0,0,0,0},{0,0,1,0,0},{0,0,0,1,0},{0,1,1,1,0},{0,0,0,0,0}};
	  TorusGameOfLife glider = new TorusGameOfLife(startPosition) ;
	  int[][] step8 = {{1,0,0,1,1},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,1},{1,0,0,0,0}};
	  glider.evolution(8);
	  assertArrayEquals(step8, glider.getBoard());
	  glider.evolution(12);
	  assertArrayEquals(startPosition, glider.getBoard());
	}
	
	@Test
	public void toadTest(){
	  int[][] startPosition = {{0,0,0,0,0,0},
			  				   {0,0,0,0,0,0},
			  				   {0,0,1,1,1,0},
			  				   {0,1,1,1,0,0},
			  				   {0,0,0,0,0,0},
			  				   {0,0,0,0,0,0}};
	  GameOfLife toad = new GameOfLife(startPosition) ;
	  int[][] openPosition = {{0,0,0,0,0,0},
						      {0,0,0,1,0,0},
						      {0,1,0,0,1,0},
						      {0,1,0,0,1,0},
						      {0,0,1,0,0,0},
						      {0,0,0,0,0,0}};
	  for(int i=1; i<100; i += 2) {
		  toad.evolution(1);
		  assertArrayEquals(openPosition, toad.getBoard());
		  toad.evolution(i);
		  assertArrayEquals(startPosition, toad.getBoard());
	  }
	}
	
	@Test
	public void toadTorusTest(){
	  int[][] startPosition = 
		  
		  					  {{1,0,0,0,1,1},
			  				   {0,0,0,0,0,0},
			  				   {0,0,0,0,0,0},
			  				   {0,0,0,0,0,0},
			  				   {0,0,0,0,0,0},
			  				   {1,1,0,0,0,1}};
	  TorusGameOfLife toad = new TorusGameOfLife(startPosition) ;
	  int[][] openPosition = 
	  
	                         {{0,1,0,0,1,0},
							  {0,0,0,0,0,1},
							  {0,0,0,0,0,0},
							  {0,0,0,0,0,0},
							  {1,0,0,0,0,0},
							  {0,1,0,0,1,0}
							  };
	  for(int i=1; i<100; i += 2) {
		  toad.evolution(1);
		  assertArrayEquals(openPosition, toad.getBoard());
		  toad.printCurrentBoard();
		  toad.evolution(i);
		  assertArrayEquals(startPosition, toad.getBoard());
	  }
	}
	
	@Test
	public void beaconTest(){
	  int[][] startPosition = {{0,0,0,0,0,0},
			  				   {0,1,1,0,0,0},
			  				   {0,1,1,0,0,0},
			  				   {0,0,0,1,1,0},
			  				   {0,0,0,1,1,0},
			  				   {0,0,0,0,0,0}};
	  GameOfLife beacon = new GameOfLife(startPosition) ;
	  int[][] openPosition = {{0,0,0,0,0,0},
						      {0,1,1,0,0,0},
						      {0,1,0,0,0,0},
						      {0,0,0,0,1,0},
						      {0,0,0,1,1,0},
						      {0,0,0,0,0,0}};
	  	for(int i=1; i<100; i += 2) {
		  beacon.evolution(1);
		  assertArrayEquals(openPosition, beacon.getBoard());
		  beacon.evolution(i);
		  assertArrayEquals(startPosition, beacon.getBoard());
	  	}
	}
	  
  @Test
  public void beaconTorusTest(){
    int[][] startPosition = {{1,1,0,0,0,0},
                   {1,1,0,0,0,0},
                   {0,0,0,0,0,0},
                   {0,0,0,0,0,0},
                   {0,0,0,0,1,1},
                   {0,0,0,0,1,1}};
    TorusGameOfLife beacon = new TorusGameOfLife(startPosition) ;
    int[][] openPosition = {{0,1,0,0,0,0},
                  {1,1,0,0,0,0},
                  {0,0,0,0,0,0},
                  {0,0,0,0,0,0},
                  {0,0,0,0,1,1},
                  {0,0,0,0,1,0}};
    for(int i=1; i<100; i += 2) {
      beacon.evolution(1);
      assertArrayEquals(openPosition, beacon.getBoard());
      beacon.evolution(i);
      assertArrayEquals(startPosition, beacon.getBoard());
    }
  }

  @Test
  public void p31oscillatorTest(){
    int[][] startPosition = {           //<   >
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0 },
        { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1 },
        { 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // ^
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // \/
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1 },
        { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1 },
        { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
    };
    GameOfLife p31 = new GameOfLife(startPosition) ;
    for(int i=1; i<100; i += 1) {
      p31.evolution(31);
      assertArrayEquals(startPosition, p31.getBoard());
    }
  }
  
  @Test
  public void p31oscillatorTorusTest(){
    int[][] startPosition = {           //<   >
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1 },
        { 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // ^
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // \/
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1 },
        { 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
    };
    TorusGameOfLife p31 = new TorusGameOfLife(startPosition) ;
    for(int i=1; i<100; i += 1) {
      p31.evolution(31);
      assertArrayEquals(startPosition, p31.getBoard());
    }
  }
}