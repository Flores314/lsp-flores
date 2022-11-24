package org.howard.edu.assignment7;
/**
 * Jonathan Flores
 * @author jonhi
 *
 */

import java.util.List;

public class AverageGrade implements Strategy {
	
	@Override
	/**
	 * This method calculates the average grade from a list of grades.
	 * It throws an exeption if the list is empty.
	 */
	
	public int compute(List<Integer> grades) throws EmptyListException {
		
		if (grades.size() == 0) {
			throw new EmptyListException("The list does not contain any values.");
		}
		
		int total = 0;
		for (int val: grades) {
			total += val;
		}
		int average = total / grades.size();
		return average;
	}

}
