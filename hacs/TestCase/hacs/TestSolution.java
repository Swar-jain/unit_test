/**
 * Title:  TestSolution
 * @author swarnalatha
 * @version 1.0
 */
package hacs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSolution {
   Solution solution;
   
   @Test
   public void testToString(){
	   solution = new Solution();
	   solution.solutionFileName = "Sol";
	   solution.theAuthor = "Voldemort";
	   solution.theGrade = 10;
	   solution.toString();
	   
   }
   
   @Test
   public void testGetGradeString(){
	   solution = new Solution();
	   solution.solutionFileName = "Sol";
	   solution.theAuthor = "Voldemort";
	   solution.theGrade = 10;
	   solution.getGradeString();
	   
   }
   
   @Test
   public void testGetGradeInt(){
	   solution = new Solution();
	   solution.solutionFileName = "Sol";
	   solution.theAuthor = "Voldemort";
	   solution.theGrade = 10;
	   int output = solution.getGradeInt();
	   assertEquals(10,output);
	   
   }
   
   @Test
   public void testSetReported(){
	   solution = new Solution();
	   solution.solutionFileName = "Sol";
	   solution.theAuthor = "Voldemort";
	   solution.theGrade = 10;
	   solution.setReported(solution.reported);
	   
	   
   }
}
