/**
 * GraphModel is a java class that will represent
 * the model for the Graph scene.
 * 
 * @author The FIRE Benders
 * UTSA CS 3443.003 - Lab 5
 * Spring 2022
 */

package application.model;

import java.util.*;

public class GraphModel 
{
	// store chart data
	private static SortedMap<String, Integer> data = new TreeMap<String, Integer>();
	private static SortedMap<String, Integer> target = new TreeMap<String, Integer>();
	
	// store static variables
	private static int age = 21;
	private static int maxAge = 65;
	private static int spending = 75000;
	private static int savings = 6000;
	private static int contributions = 6000;
	private static boolean error = false;
	
	/**
	 * Constructor required for all model classes
	 * 
	 * @param nothing
	 * @return nothing
	 */
	public GraphModel( )
	{
		// nothing
	}
	
	/**
	 * convertToInteger() takes the string from the input
	 * and converts it into an integer
	 * 
	 * @param input of an integer in string format
	 * @return quantity of items represented as an integer
	 * @throws NumberFormatException if string is not integer
	 */
	public int convertToInteger( String string ) throws NumberFormatException
	{
		String formatted = "";
		
		for( int i = 0; i < string.length(); i++ )
		{
			if( Character.isDigit(string.charAt(i)) == true || string.charAt(i) == '-' )
			{
				formatted += string.charAt(i);
			}
			else
			{
				// force error
				Integer.parseInt( string );
			}
		}
		
		return Integer.parseInt( formatted );
	}
	
	/**
	 * setError() stores the error boolean value in model
	 * 
	 * @param errorInput, boolean input of error present or not
	 * @return nothing, void
	 */
	public void setError( boolean errorInput )
	{
		error = errorInput;
	}
	
	/**
	 * isError() check if error is present based on stored model value and
	 * return the boolean value to the controller
	 * 
	 * @param nothing
	 * @return error, stored boolean of error present or not
	 */
	public boolean isError( )
	{
		return error;
	}
	
	/**
	 * setAge() will ensure the input is in correct format
	 * and store the data received from the controller in the model
	 * 
	 * @param ageInput, input of age represented as a String
	 * @return nothing, void
	 * @throws NoSuchElementException, input is negative
	 * @throws NumberFormatException, input is not an integer
	 * @throws StringIndexOutOfBoundsException, input is blank
	 */
	public void setAge( String ageInput )
			throws NoSuchElementException, NumberFormatException, StringIndexOutOfBoundsException
	{
		try
		{
			// empty input
			if( ageInput.length() == 0 )
			{
				throw new StringIndexOutOfBoundsException( "ERROR: blank input, please enter a valid integer" );
			}
			
			// negative input
			if( convertToInteger( ageInput ) < 0 )
			{
				throw new NoSuchElementException( "ERROR: input cannot be negative" );
			}
			
			age = convertToInteger( ageInput );
		}
		catch( NoSuchElementException e )
		{
			throw new NoSuchElementException( "ERROR: input cannot be negative" );
		}
		catch( NumberFormatException e )
		{
			throw new NumberFormatException( "ERROR: input is not a valid integer" );
		}
		catch( StringIndexOutOfBoundsException e )
		{
			throw new StringIndexOutOfBoundsException( "ERROR: blank input, please enter a valid integer" );
		}
	}
	
	/**
	 * setSpending() will ensure the input is in correct format
	 * and store the data received from the controller in the model
	 * 
	 * @param spendingInput, input of retirement spending represented as a String
	 * @return nothing, void
	 * @throws NoSuchElementException, input is negative
	 * @throws NumberFormatException, input is not an integer
	 * @throws StringIndexOutOfBoundsException, input is blank
	 */
	public void setSpending( String spendingInput )
			throws NoSuchElementException, NumberFormatException, StringIndexOutOfBoundsException
	{
		try
		{
			// empty input
			if( spendingInput.length() == 0 )
			{
				throw new StringIndexOutOfBoundsException( "ERROR: blank input, please enter a valid integer" );
			}
			
			// negative input
			if( convertToInteger( spendingInput ) < 0 )
			{
				throw new NoSuchElementException( "ERROR: input cannot be negative" );
			}
			
			spending = convertToInteger( spendingInput );
		}
		catch( NoSuchElementException e )
		{
			throw new NoSuchElementException( "ERROR: input cannot be negative" );
		}
		catch( NumberFormatException e )
		{
			throw new NumberFormatException( "ERROR: input is not a valid integer" );
		}
		catch( StringIndexOutOfBoundsException e )
		{
			throw new StringIndexOutOfBoundsException( "ERROR: blank input, please enter a valid integer" );
		}
	}
	
	/**
	 * setSavings() will ensure the input is in correct format
	 * and store the data received from the controller in the model
	 * 
	 * @param savingsInput, input of savings portfolio represented as a String
	 * @return nothing, void
	 * @throws NoSuchElementException, input is negative
	 * @throws NumberFormatException, input is not an integer
	 * @throws StringIndexOutOfBoundsException, input is blank
	 */
	public void setSavings( String savingsInput )
			throws NoSuchElementException, NumberFormatException, StringIndexOutOfBoundsException
	{
		try
		{
			// empty input
			if( savingsInput.length() == 0 )
			{
				throw new StringIndexOutOfBoundsException( "ERROR: blank input, please enter a valid integer" );
			}
			
			// negative input
			if( convertToInteger( savingsInput ) < 0 )
			{
				throw new NoSuchElementException( "ERROR: input cannot be negative" );
			}
			
			savings = convertToInteger( savingsInput );
		}
		catch( NoSuchElementException e )
		{
			throw new NoSuchElementException( "ERROR: input cannot be negative" );
		}
		catch( NumberFormatException e )
		{
			throw new NumberFormatException( "ERROR: input is not a valid integer" );
		}
		catch( StringIndexOutOfBoundsException e )
		{
			throw new StringIndexOutOfBoundsException( "ERROR: blank input, please enter a valid integer" );
		}
	}
	
	/**
	 * setContributions() will ensure the input is in correct format
	 * and store the data received from the controller in the model
	 * 
	 * @param contributionsInput, input of portfolio contributions represented as a String
	 * @return nothing, void
	 * @throws NoSuchElementException, input is negative
	 * @throws NumberFormatException, input is not an integer
	 * @throws StringIndexOutOfBoundsException, input is blank
	 */
	public void setContributions( String contributionsInput )
			throws NoSuchElementException, NumberFormatException, StringIndexOutOfBoundsException
	{
		try
		{
			// empty input
			if( contributionsInput.length() == 0 )
			{
				throw new StringIndexOutOfBoundsException( "ERROR: blank input, please enter a valid integer" );
			}
			
			// negative input
			if( convertToInteger( contributionsInput ) < 0 )
			{
				throw new NoSuchElementException( "ERROR: input cannot be negative" );
			}
			
			contributions = convertToInteger( contributionsInput );
		}
		catch( NoSuchElementException e )
		{
			throw new NoSuchElementException( "ERROR: input cannot be negative" );
		}
		catch( NumberFormatException e )
		{
			throw new NumberFormatException( "ERROR: input is not a valid integer" );
		}
		catch( StringIndexOutOfBoundsException e )
		{
			throw new StringIndexOutOfBoundsException( "ERROR: blank input, please enter a valid integer" );
		}
	}
	
	/**
	 * getPortfolioData() will calculate the growth of the portfolio
	 * and return the data to the controller to be displayed in the line chart
	 * 
	 * @param nothing
	 * @return a SortedMap of Strings, Integers containing portfolio data
	 */
	public SortedMap<String, Integer> getPortfolioData( )
	{
		int goal = getFIREGoal();
		int portfolio = savings;
		int ageTracker = age;
		
		while( portfolio < goal )
		{
			if( ageTracker > 65 )
			{
				break;
			}
			
			// assume yearly market return of 7%
			portfolio = (int)(portfolio * 1.07 + contributions);
			data.put( Integer.toString(ageTracker++), portfolio );
		}
		
		// add five more years
		for( int i = 0; i < 5; i++ )
		{
			// assume yearly market return of 7%
			portfolio = (int)(portfolio * 1.07 + contributions);
			data.put( Integer.toString(ageTracker++), portfolio );
		}
		
		maxAge = ageTracker;
		
		return data;
	}
	
	/**
	 * getGoalData() will aggregate the FIRE goal data that will be returned
	 * to the controller to simulate the goal line in the line chart
	 * 
	 * @param nothing
	 * @return a SortedMap of Strings, Integers containing FIRE goal data
	 */
	public SortedMap<String, Integer> getGoalData( )
	{
		int goal = getFIREGoal();
		int ageTracker = age;
		
		for( int i = age; i < maxAge; i++ )
		{
			target.put( Integer.toString(ageTracker++), goal );
		}
		
		return target;
	}
	
	/**
	 * getFIREGoal() will calculate and return the FIRE goal
	 * aka the number of money best suited for FIRE
	 * 
	 * @param nothing
	 * @return FIRE goal, represented as an integer
	 */
	public int getFIREGoal( )
	{
		// assumption is 4% withdrawal rate so divide by 0.04
		return spending * 25;
	}
	
	/**
	 * getAge() will return the stored data of age
	 * 
	 * @param nothing
	 * @return age, represented as an integer
	 */
	public int getAge( )
	{
		return age;
	}
	
	/**
	 * getFIREAge() will calculate and return the FIRE age
	 * 
	 * @param nothing
	 * @return FIRE age, represented as an integer
	 */
	public int getFIREAge( )
	{
		int goal = getFIREGoal();
		int portfolio = savings;
		int ageTracker = age;
		
		while( portfolio < goal )
		{
			// assume yearly market return of 7%
			portfolio = (int)(portfolio * 1.07 + contributions);
			ageTracker++;
		}
		
		return ageTracker - 1;
	}
	
	/**
	 * willFIRE() will calculate the growth of the portfolio
	 * and determine whether FIRE goal will be reached before age of 65
	 * which is usually the standard retirement age
	 * 
	 * @param nothing
	 * @return boolean that determine whether FIRE goal is reachable
	 */
	public boolean willFIRE( )
	{
		int goal = getFIREGoal();
		int portfolio = savings;
		int ageTracker = age;
		
		while( portfolio < goal )
		{
			// surpassed standard retirement age
			if( ageTracker > 65 )
			{
				return false;
			}
			
			// assume yearly market return of 7%
			portfolio = (int)(portfolio * 1.07 + contributions);
			ageTracker++;
		}
		
		return true;
	}
}