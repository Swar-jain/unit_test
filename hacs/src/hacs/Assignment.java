package hacs;

/**
 * Title:        HACS
 * Description:  CSE870 Homework 3:  Implementing Design Patterns
 * Copyright:    Copyright (c) 2002
 * Company:      Department of Computer Science and Engineering, Michigan State University
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 * @author swarnalatha
 * @version 3.0
 */

import java.util.*;
import java.text.DateFormat;

public class Assignment {

  protected String assName;
  protected String strAssignmentFilename;
  protected Date dueDate=new Date();
  protected String assSpec;
  protected SolutionList theSolutionList=new SolutionList();
  protected Solution suggestSolution=new Solution();

  public Assignment() {
	  
  }
  
  public Assignment(String name) {
	  this.assName = name;
  }

public int setDueDate(Date theDueDate){
	  this.dueDate = theDueDate;
	  return 1;
  }

  public int setAssSpec(String theSpec){
	  this.assSpec = theSpec;
	  return 1;
  }
  
  public boolean isOverDue(){
	  Date today;
	  today = new Date();
	  if (today.after(this.dueDate)) {
		  return true;
	  }
	  else {
		  return false;
	  }
  }

  public Solution addSolution(){
	  Solution mySolution = new Solution();
	  return mySolution;
  }

  public int addSolution(Solution theSolution)
  {
	  theSolutionList.add(theSolution);
	  return 1;
  }

  public void submitSolution(){
	  
  }

  public void getSolutionList(){
	  
  }

  
  public Solution getSolution(String studentname)
  {
	  SolutionIterator Iterator=(SolutionIterator)theSolutionList.iterator();
	  return (Solution)Iterator.next(studentname);
  }

  public Solution getSugSolution(){
	  return suggestSolution;
  }

  public SolutionIterator getSolutionIterator()
  {
	  SolutionIterator theSolutionIterator=new SolutionIterator(theSolutionList);
	  return theSolutionIterator;
  }

  public String toString()
  {
	  return assName;
  }


  public String getDueDateString()
  {
	  DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.SHORT);
	  return  dateFormat.format(dueDate);
  }
 
  
  public int accept(NodeVisitor visitor)
  {
	  visitor.visitAssignment(this);
	  return 1;
  }
}