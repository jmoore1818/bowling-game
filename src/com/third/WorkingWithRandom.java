package com.third;

public class WorkingWithRandom {
	
	public static void main(String[] args) {
		boolean doWeHaveAllTheNotebooks = true;
		
		doWeHaveAllTheNotebooks = false;
		
		String whatHappened = notebook(doWeHaveAllTheNotebooks);
		
		System.out.println(whatHappened);
		System.out.println(notebook(true));
		System.out.println();
		String doThisNext = whatHappened + ": Do you know where the books are?";
						
				System.out.println(doThisNext);
	}
	
	
	public static String notebook(boolean isLost){
		
		String whatToDoNow = null;
		
		if (isLost) {
			
			whatToDoNow = "Good, we have all the books.";
	
		} else {
			
			whatToDoNow = "Ask the students";
			
		}
		
		return whatToDoNow;
		

	}}
	
