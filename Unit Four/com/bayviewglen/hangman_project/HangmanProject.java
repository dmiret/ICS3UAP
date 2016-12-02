package com.bayviewglen.hangman_project;

import java.util.Scanner;

public class HangmanProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Constants
		final String ACCEPTEDCHAR_WITHSPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ";
		final String ACCEPTEDCHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		final String NUMBERCHOICE = "12";
		final int SPACES = 30;
		final int TOTALGUESSES = 7;
		final int TOTALROUNDS = 10;
		final int PLUSONE = 1;
		final int Zero = 0;
		final int One = 1;
		final int Two = 2;
		int guesses = 0;
		int player1IsGuesserNum = 0;
		int player1Score = 0;
		int player2Score = 0;
		int spaces = 0;
		boolean gameIsDone = false;
		boolean guessRoundOver = false;
		boolean numPreChosen = false;
		boolean correctAnswer = false;
		boolean validPhrase = false;
		boolean validSolution = false;
		boolean validAnswer = false;
		boolean player1IsGuesser = false;
		boolean validCharacter = false;
		boolean validNumber = false;
		boolean twoHasBeenUsed = false;
		String allLetters = "A B C D E F G H I J L M N O P Q R S T W X Y Z 0 1 2 3 4 5 6 7 8 9";
		String CHOSENCHAR = "";
		String phrase = "";
		String encodedPhrase = "";
		String phraseMaker = "";
		String guesser = "";
		String guessed = "";
		String solution = "";
		String numberChoice = "";

		// Welcome to the game of Hangman
		System.out.print("Please write player 1's name:");
		String player1 = input.nextLine();

		System.out.print("Please write player 2's name:");
		String player2 = input.nextLine();

		System.out.println(player1 + " and " + player2 + " lets play a little competitive game of hangman.");

		// testing if the game is done
		while (!gameIsDone) {
			int i = 0;

			// checking for the number of half-rounds
			while (i < TOTALROUNDS) {

				// Setting which player is guesser and which one is the phrase maker
				while (!player1IsGuesser) {
					if (player1IsGuesserNum % 2 == 1) {
						phraseMaker = player1;
						guesser = player2;
						player1IsGuesserNum++;
					} else {
						phraseMaker = player2;
						guesser = player1;
						player1IsGuesserNum++;
					}
					player1IsGuesser = true;
				}
				player1IsGuesser = false;
				// getting phrase
				System.out.println();
				System.out.print(phraseMaker + ", please write down a phrase for " + guesser + " to guess:");

				// Testing if given phrase is valid
				while (!validPhrase) {
					validPhrase = true;
					phrase = input.nextLine().toUpperCase();
					for (int i1 = 0; i1 < phrase.length() && validPhrase; i1++) {
						if (ACCEPTEDCHAR_WITHSPACE.indexOf(phrase.charAt(i1)) == -1) {
							validPhrase = false;
							System.out.printf(phraseMaker
									+ ", that phrase is not using the avaliable character, please only use alpha-numeric characters%n (A-Z & 0-9, Spaces are allowed in the phrase)");
						}
						if (phrase.length() == 0) {
							validPhrase = false;
							System.out.printf(phraseMaker
									+ ", that phrase is not using the avaliable character, please only use alpha-numeric characters%n (A-Z & 0-9, Spaces are allowed in the phrase)");
						}
					}
				}
				validPhrase = false;
				// inserting the spaces
				for (spaces = 0; spaces <= SPACES; spaces++)
					System.out.println("");

				// part 2 guessing the word
				// reseting the variables for each round
				guessRoundOver = false;
				guessRoundOver = false;
				correctAnswer = false;
				twoHasBeenUsed = false;
				guesses = 0;
				allLetters = "A B C D E F G H I J L M N O P Q R S T W X Y Z 0 1 2 3 4 5 6 7 8 9";
				encodedPhrase = "";

				while (!guessRoundOver) {

					// encoding the Phrase
					while (!twoHasBeenUsed) {
						for (int i2 = 0; i2 < phrase.length(); i2++) {
							if (phrase.charAt(i2) != ' ') {
								encodedPhrase += "-";
							} else {
								encodedPhrase += "/";
							}
							twoHasBeenUsed = true;
						}
					}
					// testing if you are on the seventh guess
					validSolution = false;
					while (!validSolution) {

						if (guesses == TOTALGUESSES) {
							System.out.println(encodedPhrase);
							System.out.printf(String.valueOf(guesser) + " this is your " + guesses
									+ "th guess, you must enter your solution now:");

							solution = input.nextLine().toUpperCase();
							if (solution.equals(phrase)) {
								System.out.println("you are correct");
								guessRoundOver = true;
								correctAnswer = true;
								break;
							} else {
								System.out.println("what a shame");
								guessRoundOver = true;
								break;
							}
						}

						// output to console whether to output 1 or 2 (or enter
						// to see the phrase again)
						if (guesses != TOTALGUESSES) {
							System.out.println(encodedPhrase);
							System.out.printf(guesser + " you have used " + guesses + "/" + TOTALGUESSES
									+ " would you like to (1) solve for the solution or (2) choose a character from the phrase%nor press enter to view the phrase again:");

							// test if 1 or 2;
							validNumber = false;
							while (!validNumber) {
								validNumber = true;
								numberChoice = input.nextLine();
								for (int i5 = 0; i5 < numberChoice.length() && validNumber; i5++) {
									if (numberChoice.length() != 1
											|| NUMBERCHOICE.indexOf(numberChoice.charAt(i5)) == -1) {
										validNumber = false;
										System.out.println(guesser
												+ " please only enter (1) to solve for the solution or (2) choose a character from the phrase:");
									}
								}
							}
						}
						// input 1 response and checking if answer is valid
						if ("1".equals(numberChoice)) {
							System.out.println("please guess your solution:");
							validAnswer = false;
							while (!validAnswer) {
								validAnswer = true;
								solution = input.nextLine().toUpperCase();
								for (int i3 = 0; i3 < solution.length() && validAnswer; i3++) {
									if (ACCEPTEDCHAR_WITHSPACE.indexOf(solution.charAt(i3)) == -1) {
										validAnswer = false;
										System.out.println(guesser
												+ ", please enter a valid solution using alpha-numeric numbers only (spaces are allowed):");
									}
								}
							}

							// guessing the phrase right or wrong
							if (solution.equals(phrase)) {
								System.out.println(
										"Congratulations " + guesser + " you have guessed the phrase correct.");

								validSolution = true;
								guessRoundOver = true;
								correctAnswer = true;

							} else {
								guesses++;
								validSolution = false;

								System.out.println(guesser + " you are unfourtunately incorrect, try again.");
								System.out.println("");

							}
						}

						// checking if the letter given is a viable option to
						// guess (as well as the output for inputing number 2)
						if ("2".equals(numberChoice)) {
							validSolution = true;

							System.out.printf("Your unused characters %n" + allLetters
									+ "%nplease enter a single character from the list above %n");
							// test if character has been used before
							validCharacter = false;
							numPreChosen = false;
							while (!validCharacter) {
								validCharacter = true;
								guessed = input.nextLine().toUpperCase();
								if (CHOSENCHAR.indexOf(guessed) == -1) {
									numPreChosen = true;
								}
								// character in the accepted characters
								for (int i4 = 0; i4 < guessed.length() && validCharacter; i4++) {
									if (ACCEPTEDCHAR.indexOf(guessed.charAt(i4)) == -1) {
										validCharacter = false;
										System.out.println(guesser
												+ ", please only enter a single valid character that is alpha numberic (A-Z,0-9, but spaces are not allowed):");
										// amount of characters (greater than 1)
									} else if (guessed.length() != 1) {
										validCharacter = false;
										System.out.print(String.valueOf(guesser)
												+ ", plesase input a single valid character that is alpha numberic (A-Z,0-9, but spaces are not allowed): ");
										// character has already been chosen
									} else if (!numPreChosen) {
										validCharacter = false;
										System.out.printf("Unused Characters%n" + allLetters + "%n");

										System.out.println(String.valueOf(guesser) + " you have already guessed "
												+ guessed + ", please choose a different character");
									}
								}
							}
							// given number 2 checking if the character is in
							// the phrase, or not and replacing it
							CHOSENCHAR = String.valueOf(CHOSENCHAR) + guessed;
							allLetters = allLetters.replaceAll(guessed, "_");
							if (phrase.indexOf(guessed) != -1) {
								System.out.println(String.valueOf(guesser) + ", the character '" + guessed
										+ "' is in the phrase.");
								for (int i6 = 0; i6 < phrase.length(); i6++) {
									if (phrase.substring(i6, i6 + PLUSONE).equals(guessed)) {
										encodedPhrase = encodedPhrase.substring(0, i6) + guessed
												+ encodedPhrase.substring(i6 + PLUSONE);

									}
								}
							} else {
								System.out.println(String.valueOf(guesser) + ", the character '" + guessed
										+ "' is not in the phrase.");
							}
							guesses++;

						}
					}
				}
				// increasing index counter, and giving points to each player
				i++;
				if (correctAnswer && player1IsGuesserNum % 2 == 0) {
					player1Score += 1 + (TOTALGUESSES - guesses);
				} else if (correctAnswer) {
					player2Score += 1 + (TOTALGUESSES - guesses);
				}

				// Outputting scores
				System.out.println("Scores");
				System.out.println("-----------------");
				System.out.printf(player1 + ": " + player2Score + "%n");
				System.out.printf(player2 + ": " + player1Score + "%n");

				// testing if the game is done
				if (i >= TOTALROUNDS && player1Score > player2Score || player1Score < player2Score) {
					gameIsDone = true;
				} else {
					gameIsDone = false;
				}
			}
		}

		// saying who has won the game
		if (player1Score > player2Score) {
			System.out
					.println("Congratulations " + player2 + " you are the winner of the competitive game of hangman!");
		} else {
			System.out
					.println("Congratulations " + player1 + " you are the winner of the competitive game of hangman!");

		}
		input.close();
	}
}
