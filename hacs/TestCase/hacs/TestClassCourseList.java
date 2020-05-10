/**
 * Title: TestClassCourseList
 * @author swarnalatha
 * @version 1.0
 */


package hacs;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClassCourseList {
	ClassCourseList CourseList = new ClassCourseList();

	@Test
	public void testInitializeFromFile() {
		
		 int output = CourseList.initializeFromFile("CourseInfo.txt");
		 assertEquals(1, output);
		
	}
	
	@Test
	public void testFindCourseByCourseName() {
		CourseList = new ClassCourseList();
		Course courseReturned = CourseList.findCourseByCourseName("CSE870");
		assertNotNull(courseReturned);  
	}
	

}
