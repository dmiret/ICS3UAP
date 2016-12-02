package com.bayviewglen.hangman_project;

public class Desgin {

	public static void main(String[] args) {
		/*if(guessNumber.equals("1")){
			System.out.println(guesser+", please enter your solution to the phrase:");
			while(!validSolution){
				validSolution =true;
				solution = input.nextLine().toUpperCase();
				for(int i3 = 0;i3<solution.length();i3++){
					if(ACCEPTEDCHAR_WITHSPACE.indexOf(solution.charAt(i3))==-1){
						validSolution = false;
						System.out.println(guesser+", please enter a valid solution using alpha-numeric numbers only (spaces are allowed):");
						solution = input.nextLine().toUpperCase();
					}
				}	
			}
				if(!solution.toUpperCase().equals(phrase.toUpperCase())){
					System.out.println(guesser+", unfortunately you are incorrect.");
					System.out.println("");
					guesses++;
				}
				if(solution.toUpperCase().equals(phrase.toUpperCase())){
					System.out.println(guesser+", congratulations you are correct, for this round...");
					if(guesser==player1){
						player1Score = TOTALGUESSES-guesses+1;
					}
					if(guesser==player2){
						player2Score = TOTALGUESSES-guesses+1;
					}
					System.out.println(player1+":"+player1Score);
					System.out.println(player2+":"+player2Score);
				roundOver=true;
				}
		}
		if(guessNumber.equals("2")){
			System.out.println("NO");
			}
		
		/*//while(!roundOver){
		for(int i2 = 0;i2<phrase.length();i2++){
			if(phrase.charAt(i2)==' '){
				System.out.print("/");
			}else{
				System.out.print("_ ");
			}
		}
		System.out.println("");*/

	}

}
