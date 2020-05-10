/**
 * Title:  TestPerson
 * @author swarnalatha
 * @version 1.0
 */

package hacs;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPerson {
	Course course = new Course("CSE870", 0);
	Person thePerson = new Student();
	ClassCourseList theCourseList = new ClassCourseList();
	
	

	@Test
	public void testAddCourse() {
		theCourseList.initializeFromFile("CourseInfo.txt");
	    thePerson.courseList = theCourseList;
	    System.out.println(thePerson.courseList);
	    boolean output = thePerson.courseList.add(course);
	    assertEquals(true, output);
		
	}

	@Test
	public void testGetCourseList() {
		theCourseList.initializeFromFile("CourseInfo.txt");
	    thePerson.courseList = theCourseList;
	    System.out.println(thePerson.courseList);
	    ClassCourseList output = thePerson.getCourseList();
	    assertEquals(thePerson.courseList, output);
		
	}
	
	@Test
	public void TestMenu() {
		Student student = new Student();
		Course course = new Course("CSE880", 1);
		Course course1 = new Course("CSE870", 0);
		student.currentCourse = course;
		Instructor inst1 = new Instructor();
		inst1.currentCourse = course1;
		student.theCourseMenu = new HighLevelCourseMenu();
		inst1.theCourseMenu = new LowLevelCourseMenu();
		Assignment assignment = new Assignment();
		student.currentCourse.assignmentList.add(assignment);
		assertTrue(student.showMenu());
	}
	
	
}
