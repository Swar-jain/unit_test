package hacs;

import java.util.*;
/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0 use <e> notation
 * @author swarnalatha
 * @version 3.0
 */


public class Solution {
	String theAuthor = "";
	String solutionFileName = "";
	Date theSubmitData = new Date();
	int theGrade;
	boolean reported = false;

	public Solution() {
	}

	
	@Override
	public String toString() {
		String string;
		string = theAuthor + "  " + solutionFileName + " Grade=" + getGradeInt() + "  ";
		if (isReported())
			string += "reported";
		else
			string += "not reported";

		return (string);
	}

	
	String getGradeString() {
		if (isReported())
			return "" + theGrade;
		else
			return "-1";
	}

	int getGradeInt() {
		return theGrade;
	}

	
	public void setReported(boolean reported) {
		this.reported = reported;
	}

	public boolean isReported() {
		return reported;
	}
}