package org.howard.edu.lsp.midterm.problem1;
import java.util.HashMap;

/**
 * Jonathan Flores
 * @author jonhi
 *
 */

public class VotingMachine 
{
	// YOU must decide upon an appropriate data representation to associate a name with respective votes.  Create whatever you like.
	private HashMap<String, Integer> voteCount = new HashMap<String, Integer>();
	
	public void addCandidate(String name) 
	{
		// Add a candidate to the list, initialize number of votes to 0
		if (!this.voteCount.containsKey(name))
		{
			this.voteCount.put(name,  0);
		}
	} 

	public void castVotes(String name, int votes) 
	{
		// Cast votes to the candidate with the given name
		if (this.voteCount.containsKey(name))
		{
			Integer currentCount = voteCount.get(name);
			this.voteCount.put(name, currentCount + votes);
		}
	}

	public int getVotes(String name) throws UnknownCandidateException 
	{
		// Return the number of votes for a given candidate.  Throws
		// UnknownCandidateException if name not present.  Make this a 
		// checked exception.
		
		if (this.voteCount.containsKey(name)) 
		{
			Integer candidateCount = this.voteCount.get(name);
			return candidateCount;
		}
		else
		{
			throw new UnknownCandidateException("Error: Candidate does not exist.");
		}
	}

	public int sum() 
	{
		// Return the total number of votes for all candidates.
		Integer totalCount = 0;
		for (String names: this.voteCount.keySet())
		{
			totalCount += this.voteCount.get(names);
		}
		
		return totalCount;
	}
}
