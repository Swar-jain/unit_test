/**
 * Title:  TestSolutionIterator
 * @author swarnalatha
 * @version 1.0
 */


package hacs;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSolutionIterator {
  SolutionIterator iterator;
	
	@Test
	public void constructorTest() {
		iterator = new SolutionIterator();
		SolutionList solutionList = new SolutionList();
		iterator = new SolutionIterator(solutionList);
	}
	
	@Test
	public void MoveToHeadTest() {
		iterator = new SolutionIterator();
		iterator.moveToHead();
		assertEquals(new Integer(iterator.currentSolutionNumber), new Integer(-1));
	}

	@Test
	public void hasNextTest() {
		SolutionList solutionList = new SolutionList();
		Solution solution = new Solution();
		solutionList.add(solution);
		iterator = new SolutionIterator(solutionList);
		assertTrue(iterator.hasNext());
	}
	
	@Test
	public void removeTest() {
		SolutionList solutionList = new SolutionList();
		Solution solution = new Solution();
		solutionList.add(solution);
		iterator = new SolutionIterator(solutionList);
		iterator.currentSolutionNumber = 0;
		iterator.remove();
	}
	
	@Test
	public void nextTest() {
		SolutionList solList = new SolutionList();
		Solution solution = new Solution();
		solList.add(solution);
		iterator = new SolutionIterator(solList);
		Solution output = (Solution) iterator.next();
		assertEquals(output, solution);
	}
	
}
