package com.third;

public class Bowling {

	public static void main (String[] args){
		
		int score = 0;
		int pins = 10;
		int frames = 10;
		int throwsPerFrame = 2;
		int pinsRemaining = 10;
		int pinsKnockedDown = 0;
		 
		for (frames = 1; frames <= 10; frames++){
			pinsKnockedDown = (int) (Math.random() * 11);
			score += pinsKnockedDown;
			pinsRemaining = pins - pinsKnockedDown;
			pinsKnockedDown = (int) (Math.random() * (pinsRemaining +1));
			score += pinsKnockedDown;
			System.out.println(score);
	
			}
			
			
	}

	}


