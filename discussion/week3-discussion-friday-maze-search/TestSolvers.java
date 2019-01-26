package cse12pa3student;

//A version of TestSolvers.java with 2 tests for the
//DFS and BFS solutions to the maze we came up with
//in discussion. Also included are some additional
//comments to help demystify some of the helper methods
//in this class that are used to test mazes.


/*
 * Write your JUnit tests here
 * Use the formatMaze() method to get nicer JUnit output
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSolvers {


	/* Helper method to compare two mazes */
	//Solves Maze startMaze using your solve method and compares to expected
	public void checkMaze(SearchWorklist wl, Maze startMaze, String[] expected) {
		Square s = MazeSolver.solve(startMaze, wl);
		if(expected == null) { assertNull(s); }
		else {
			/* showSolution will return your solution as a String[] by
			   working backwards from Finish to Start using previous pointers*/
			String actualStr = formatMaze(startMaze.showSolution());
			String expectedStr = formatMaze(expected);
			assertEquals(expectedStr, actualStr);
		}
	}
	

	/* Helper method to format String[] output as String */
	public String formatMaze(String[] arr) {
		String result = "";
		for (String s: arr)
			result += "\n"+s;
		return (result+"\n");
	}

	
	
	/* Worklist Tests */
	
	@Test
	public void testStackWorklist() {
		Square s1 = new Square(0,0, false);
		Square s2 = new Square(1,0, false);
		Square s3 = new Square(1,1, false);
		SearchWorklist swl = new StackWorklist();
		
		swl.add(s1);
		swl.add(s2);
		assertEquals(false, swl.isEmpty());
		
		swl.remove(); 
		swl.remove();
		assertEquals(true, swl.isEmpty());
		
		//Ensure stack behavior
		swl.add(s1);
		swl.add(s2);
		swl.add(s3);
		assertEquals(s3, swl.remove());
	}
	

	@Test
	public void testQueueWorklist() {
		Square s1 = new Square(0,0, false);
		Square s2 = new Square(1,0, false);
		Square s3 = new Square(1,1, false);
		SearchWorklist qwl = new QueueWorklist();
		
		qwl.add(s1);
		qwl.add(s2);
		assertEquals(false, qwl.isEmpty());
		
		qwl.remove(); 
		qwl.remove();
		assertEquals(true, qwl.isEmpty());
		
		//Ensure queue behavior
		qwl.add(s1);
		qwl.add(s2);
		qwl.add(s3);
		assertEquals(s1, qwl.remove());
	}	
	
	
	// # = wall
	// _ = empty space
	// S = Start
	// F = Finish
	// * = solution path
	
	@Test
	public void testClassExample() {
		Maze m = new Maze(new String[]{
				"#_#_",
				"____",
				"_##S",
				"F___"
			});
		String[] stackExpected = {
				"#_#_",
				"****",
				"*##S",
				"F___"
			};
		
		/* call checkMaze to solve Maze m (using a stack) with your solve method
		   and assert that the solution you get matches stackExpected */
		checkMaze(new StackWorklist(), m, stackExpected);
	}
	
	@Test
	public void testFailingOrder() {
		String[] expected = {
				"#_#_",
				"****",
				"*##S",
				"F___"
			};
		String[] actualAndWrong= {
				"#_#_",
				"____",
				"_##S",
				"F***"
			};
		assertEquals(formatMaze(expected), formatMaze(actualAndWrong));
	}
	
  // Test our DFS solution to the maze from discussion
	@Test
	public void testDiscussionDFS() {
		Maze m = new Maze(new String[]{
				"#_##",
				"__S_",
				"_#__",
				"F___"
			});
		String[] stackExpected = {
				"#_##",
				"**S_",
				"*#__",
				"F___"
			};
		
		/* call checkMaze to solve Maze m (using a stack) with your solve method
		   and assert that the solution you get matches stackExpected */
		checkMaze(new StackWorklist(), m, stackExpected);
	}
	
  // Test our BFS solution to the maze from discussion
	@Test
	public void testDiscussionBFS() {
		Maze m = new Maze(new String[]{
				"#_##",
				"__S_",
				"_#__",
				"F___"
			});
		String[] queueExpected = {
				"#_##",
				"__S_",
				"_#*_",
				"F**_"
			};
		
		/* call checkMaze to solve Maze m (using a queue) with your solve method
		   and assert that the solution you get matches queueExpected */
		checkMaze(new QueueWorklist(), m, queueExpected);
	}
}
