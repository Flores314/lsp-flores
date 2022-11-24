package org.howard.edu.assignment7;
/**
 * Jonathan Flores
 * @author jonhi
 *
 */
import java.util.*;

public class AverageGradeContext {
	
	private Strategy strategy;
	
	public void setAverageGradeStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int compute(List<Integer> grades) throws EmptyListException {
		int average = this.strategy.compute(grades);
		return average;
	}

}
