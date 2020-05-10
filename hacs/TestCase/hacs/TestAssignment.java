/**
 * Title:        TestAssignment
 * @author swarnalatha
 * @version 1.0
 */

package hacs;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import org.junit.Test;

public class TestAssignment {
	Assignment ass1 = new Assignment();

	@Test
	public void testSetDueDate() {
		Date theDueDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(theDueDate);
		calendar.add(Calendar.DATE, 1);
		int output = ass1.setDueDate(theDueDate);
		assertEquals(1, output);
		}
	
	@Test
	public void testSetAssSpec() {
		int output = ass1.setAssSpec("Software Engineering");
		assertEquals(1, output);
		}
	
	@Test
	public void testIsOverDue() {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date = null;
			try{
				date = dateFormat.parse("09/10/2019");
			}catch (ParseException e){
				e.printStackTrace();
			}
			ass1.setDueDate(date);
			assertTrue(ass1.isOverDue());
			
		}
	
	@Test
	public void testIsOverDueFalse() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = dateFormat.parse("09/11/2019");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ass1.setDueDate(date);
		assertFalse(ass1.isOverDue());	
	}
	
		
	@Test
	public void testGetSolution() {
		ass1 = new Assignment();
		Solution solution = ass1.getSugSolution();
		assertEquals(solution.getClass().getName(), "hacs.Solution");
		}
	
	@Test
	public void testGetDueDateString() {
		String output = " ";
		if(ass1.getDueDateString() != null){
			output = "a";
		}
		assertEquals("a", output);
		}
	
	@Test
	public void testAddSolution() {
		ass1 = new Assignment();
		Solution solution = new Solution();
		Solution output = ass1.addSolution();
		assertEquals(solution.getClass(), output.getClass());
	}
	

}
