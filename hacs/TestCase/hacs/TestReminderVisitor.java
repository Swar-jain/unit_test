/**
 * Title:  TestReminderVisitor
 * @author swarnalatha
 * @version 1.0
 */

package hacs;


import java.util.Date;

import org.junit.Test;

public class TestReminderVisitor {
	Reminder reminder ;
	ReminderVisitor Visitor = new ReminderVisitor();
	Facade facade = new Facade();
	
	@Test
	public void testReminderVisitor() {
		
		@SuppressWarnings("unused")
		ReminderVisitor reminderV = new ReminderVisitor(reminder);
	}
    
	@Test
	public void testVisitFacade() {
		ClassCourseList courseList = new ClassCourseList();
		Course course = new Course("CSE870", 0);
		courseList.add(course);
		facade.theCourseList = courseList;
		Visitor.visitFacade(facade);
		
	}
	
	@Test
	public void testVisitCourse() {
		ClassCourseList courseList = new ClassCourseList();
		Course course = new Course("CSE870", 0);
		courseList.add(course);
		Visitor.visitCourse(course);
		
	}
	
	
	@Test
	public void testVisitAssignment() {
		ClassCourseList courseList = new ClassCourseList();
		Course course = new Course("CSE870", 0);
		courseList.add(course);
		Assignment ass1 = new Assignment();
		Date theDueDate = new Date(2323223232L);
		ass1.setDueDate(theDueDate);
		course.assignmentList.add(ass1);
		Visitor.visitAssignment(ass1);
		
	}
}
