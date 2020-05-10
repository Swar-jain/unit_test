/**
 * Title:  TestInstructor
 * @author swarnalatha
 * @version 1.0
 */

package hacs;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestInstructor {
	

	Person person = new Instructor();;
	
	@Test
	public void CreateCourseMenuTest() {
		
		Course course = new Course("CSE870", 0);
		CourseMenu returned = person.createCourseMenu(course, 1);
		CourseMenu courseMenu = new LowLevelCourseMenu();
		assertEquals(courseMenu.getClass(), returned.getClass());
	}
	
	@Test
	public void TestMenu() {
		Course course = new Course("CSE880", 1);
		person.currentCourse = course;
		person.theCourseMenu = new HighLevelCourseMenu();
		Assignment assignment = new Assignment();
		person.currentCourse.assignmentList.add(assignment);
		assertTrue(person.showMenu());
	}

}
