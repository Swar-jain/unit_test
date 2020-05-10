/**
 * Title:  TestFacade
 * @author swarnalatha
 * @version 1.0
 */

package hacs;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFacade {
	Facade facade = new Facade();
	UserInfoItem studentObj = new UserInfoItem();
	UserInfoItem instructorObj = new UserInfoItem();
	Course course = new Course("CSE870", 0);
	Person person;
	Assignment ass1 = new Assignment();
	Solution solution = new Solution();

	@Test
	public void testLogin() {
		@SuppressWarnings("unused")
		Login login = new Login();
		facade = new Facade();
		studentObj.strUserName = "pepe";
		assertTrue(facade.login(studentObj)); 
	}

	@Test
	public void testCreateUser() {
		studentObj.strUserName = "pepe";
		studentObj.UserType = UserInfoItem.USER_TYPE.Student;
		int output = facade.createUser(studentObj);
		assertEquals(1, output );
	}
	
	@Test
	public void testAttachCourseToUser() {
		studentObj.strUserName = "pepe";
		studentObj.UserType = UserInfoItem.USER_TYPE.Student;
		facade.createUser(studentObj);
		facade.createCourseList();
		int output = facade.attachCourseToUser();
		assertEquals(1, output);
	}
	
	@Test
	public void testSelectCourse() {
		studentObj.strUserName = "pepe";
		studentObj.UserType = UserInfoItem.USER_TYPE.Student;
		facade.createUser(studentObj);
		facade.createCourseList();
		facade.selectCourse();
	}
	
	@Test
	public void testRemind() {
		studentObj.strUserName = "pepe";
		studentObj.UserType = UserInfoItem.USER_TYPE.Student;
		facade.createUser(studentObj);
		facade.createCourseList();
		facade.attachCourseToUser();
		facade.addAssignment(course);
		
		int output = facade.remind();
		assertEquals(1, output);
	}
	
	@Test
	public void testCreateCourseList() {
		facade.createCourseList();
	}
	
	@Test
	public void testSubmitSolution() {
		facade.submitSolution(ass1, solution);
	}
	
	@Test
	public void testReportSolutions(){
		facade.reportSolutions(ass1);
	}
	
	@Test
	public void testGradeSolution(){
		facade.gradeSolution(solution);
	}
	
	@Test
	public void testViewAssignment(){
		studentObj.strUserName = "pepe";
		studentObj.UserType = UserInfoItem.USER_TYPE.Student;
		facade.createUser(studentObj);
		facade.createCourseList();
		facade.attachCourseToUser();
		facade.addAssignment(course);
		facade.viewAssignment(ass1);
	}
	
}
