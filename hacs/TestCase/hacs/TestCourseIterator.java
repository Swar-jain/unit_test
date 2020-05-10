/**
 * Title:  TestCourseIterator
 * @author swarnalatha
 * @version 1.0
 */

package hacs;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestCourseIterator {
	
	CourseIterator courseIterator;
	
	@Test
	public void testConstructor(){
		courseIterator = new CourseIterator();
	}
	
	@Test
	public void testhasNext() {
		ClassCourseList courseList = new ClassCourseList();
		Course course = new Course("CSE870", 0);
		courseList.add(course);
		courseIterator = new CourseIterator(courseList);
		Assert.assertTrue(courseIterator.hasNext());
		}
	
	@Test
	public void testRemove() {
		ClassCourseList courseList = new ClassCourseList();
		Course course = new Course("CSE870", 0);
		courseList.add(course);
		courseIterator = new CourseIterator(courseList);
		courseIterator.currentCourseNumber = 0;
		courseIterator.remove();
		}
	
	@Test
	public void testNext() {
		ClassCourseList courseList = new ClassCourseList();
		Course course = new Course("CSE870", 0);
		courseList.add(course);
		courseIterator = new CourseIterator(courseList);
		Course output = (Course) courseIterator.next();
		assertEquals(output, course);
	}
}
