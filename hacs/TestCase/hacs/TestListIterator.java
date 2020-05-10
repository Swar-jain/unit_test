/**
 * Title:  TestListIterator
 * @author swarnalatha
 * @version 1.0
 */

package hacs;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestListIterator {
	ListIterator iterator;
	
 
	@Test
	public void testListIterator() {
		ArrayList<Object> list = new ArrayList<Object>();
		@SuppressWarnings("unused")
		ListIterator iterator = new ListIterator(list);
	}
	
	@Test
	public void testHasNext() {
		ArrayList<Object> courseList = new ArrayList<>();
		Course course = new Course("CSE870", 0);
		Course course1 = new Course("CSE880", 0);
		courseList.add(course);
		courseList.add(course1);
		iterator = new ListIterator(courseList);
		assertTrue(iterator.hasNext());
	}
	
	@Test
	public void testNext() {
		ArrayList<Object> courseList = new ArrayList<>();
		Course course = new Course("CSE870", 0);
		Course course1 = new Course("CSE880", 0);
		courseList.add(course);
		courseList.add(course1);
		iterator = new ListIterator(courseList);
		Object returned = (Course) iterator.next();
		assertEquals(returned, course);
	}
	
	@Test
	public void removeTest() {
		ArrayList<Object> courseList = new ArrayList<>();
		Course course = new Course("CSE870", 0);
		Course course1 = new Course("CSE880", 0);
		courseList.add(course);
		courseList.add(course1);
		iterator = new ListIterator(courseList);
		iterator.currentNumber = 0;
		iterator.remove();
	}
}
