package org.howard.edu.assignment7;
/**
 * Jonathan Flores
 * @author jonhi
 *
 */
import java.util.Collections;
import java.util.List;

public class AverageGradeDropTwoLowest implements Strategy {
	
	@Override
	/**
	 * This method calculates the average grade from a list of grades with the lowest two grades dropped.
	 * It throws an exception if the list is empty.
	 */
	public int compute(List<Integer> grades) throws EmptyListException {
		if(grades.size() == 0) {
			throw new EmptyListException("The list does not contain any values");
	}

	
	int total = 0;
	int avg;
	Collections.sort(grades);

	if(grades.size() > 2) {
		
		for (int i=2; i < grades.size(); i++) {
			total += grades.get(i);
		}
		
		avg = total / (grades.size() - 2);
	}
	
	else {
		for (int i=0; i<grades.size(); i++) {
			total += grades.get(i);
		}
		avg = total / grades.size();
	}
	
	return avg;

	}
}
