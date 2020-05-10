/**
 * Title:  TestStudent
 * @author swarnalatha
 * @version 1.0
 */
package hacs;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStudent {
	
   Person thePerson;
	
	@Test
	public void CreateCourseMenuTest() {
		thePerson = new Student();
		Course course = new Course("CSE870", 0);
		CourseMenu returned = thePerson.createCourseMenu(course, 1);
		CourseMenu courseMenu = new LowLevelCourseMenu();
		assertEquals(courseMenu.getClass(), returned.getClass());
	}
	
	@Test
	public void showMenuTest() {
		thePerson = new Student();
		Course course = new Course("CSE880", 1);
		thePerson.currentCourse = course;
		thePerson.theCourseMenu = new HighLevelCourseMenu();
		Assignment assignment = new Assignment();
		thePerson.currentCourse.assignmentList.add(assignment);
		assertTrue(thePerson.showMenu());
	}

}
