package hacs;

import java.util.Iterator;

/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author swarnalatha
 * @version 3.0
 * 
 */

@SuppressWarnings("rawtypes")
public class CourseIterator implements Iterator
{
  ClassCourseList theCourseList;
  int currentCourseNumber=-1;


  public CourseIterator()
  {
	  
  }

  
  
  public CourseIterator(ClassCourseList courseList)
  {
    this.theCourseList=courseList;
  }

  public boolean hasNext()
  {
	  if (currentCourseNumber>=theCourseList.size()-1)
		  return false;
	  else
		  return true;
  }

 
  public Object next()
  {
	  if (hasNext()==true)
	  {
		  currentCourseNumber ++;
		  return theCourseList.get(currentCourseNumber);
	  }
	  else
	  {
		  return null;
	  }
  }

  public void remove()
  {
	  theCourseList.remove(currentCourseNumber);
  }

// the next Course that fits the given CourseName
  public Object next(String CourseName)
  {
	  Course theCourse;
	  theCourse=(Course)next();
	  while(theCourse!=null)
	  {
		  if(CourseName.compareTo(theCourse.toString())==0)
		  {
			  return theCourse;
		  }
		  theCourse=(Course)next();
	 }
	 return null;
  }


}