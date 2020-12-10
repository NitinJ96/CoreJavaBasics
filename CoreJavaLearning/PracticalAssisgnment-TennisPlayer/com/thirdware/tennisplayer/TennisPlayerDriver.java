package com.thirdware.tennisplayer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TennisPlayerDriver {

	private static Scanner scanner = new Scanner(System.in);
	private static TennisPlayer tennisPlayer;
	private static PlayerCodeLinkedHashSet playerCodeSet = new PlayerCodeLinkedHashSet();
	private static PlayerRankingList playerRankingList = new PlayerRankingList();
	private static int count = 0;

	public static void main(String[] args) throws InputMismatchException, Exception {
		boolean quit = false;
		int choice;
		printInstructions();
		while (!quit) {
			System.out.print("\nEnter the Choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				printPlayerDetails();
				break;
			case 2:
				playMatch();
				break;
			case 3:
				addPlayer();
				break;
			case 4:
				printAllTennisPlayers();
				break;
			case 5:
				deletePlayer();
				break;
			case 6:
				sortPlayerList();
				break;
			case 7:
				quit = true;
				break;
			}
		}
		System.out.println("Thanks for using the Application");
	}

	private static void printInstructions() {
		System.out.println("Press");
		System.out.println("\t 0 - To print choice options");
		System.out.println("\t 1 - To add and print prebuilt Tennis players List");
		System.out.println("\t 2 - To play Match between 2 Player");
		System.out.println("\t 3 - To add TennisPlayer dynamically");
		System.out.println("\t 4 - To print all Tennis players List");
		System.out.println("\t 5 - To delete player based on playerCode");
		System.out.println("\t 6 - To sort Player details based on Current Ranking");
		System.out.println("\t 7 - To quit the application");
	}

	private static void addPlayer() throws InputMismatchException, Exception {
		try {
			System.out.println();
			System.out.print("Enter the PlayerCode: ");
			int playerCode = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter the PlayerName: ");
			String playerName = scanner.nextLine();
			System.out.print("Enter the number of Matches Played: ");
			int matchesPlayed = scanner.nextInt();
			System.out.print("Enter the number of Matches won: ");
			int matchesWon = scanner.nextInt();
			System.out.print("Enter the Player Current Ranking: ");
			int currentRanking = scanner.nextInt();
			System.out.print("Enter the Player best Ranking: ");
			int bestRanking = scanner.nextInt();
			System.out.print("Enter the last fought PlayerCode: ");
			int lastFought = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Choose the player preferred Court: Grass/Synthetic/Clay/Others: ");
			String preferredCourt = scanner.nextLine();

			tennisPlayer = new TennisPlayer(playerCode, playerName, matchesPlayed, matchesWon, currentRanking,
					bestRanking, preferredCourt, lastFought);
			playerCodeSet.addPlayerSet(tennisPlayer);
			playerRankingList.addPlayer(tennisPlayer);
		} catch (InputMismatchException e) {
			System.out.println("Error " + e + ": Enter the Valid Input");
			scanner.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error Occuring, Try Again");
		}

	}

	public static void printPlayerDetails() {
		if (count == 0) {
			playerCodeSet.addPlayerSet(new TennisPlayer(125, "Novak Djokovic", 12, 11, 1, 1, "Grass", 263));
			playerCodeSet.addPlayerSet(new TennisPlayer(326, "Daniil Medvedev", 10, 8, 4, 2, "Synthetic", 635));
			playerCodeSet.addPlayerSet(new TennisPlayer(263, "Roger Federer", 15, 10, 5, 1, "Clay", 398));
			playerCodeSet.addPlayerSet(new TennisPlayer(562, "Alexander Zverev", 13, 8, 7, 3, "Others", 754));
			playerCodeSet.addPlayerSet(new TennisPlayer(635, "Domnic Thiem", 11, 9, 2, 2, "Synthetic", 125));
			playerCodeSet.addPlayerSet(new TennisPlayer(154, "Rafael Nadal", 13, 11, 2, 1, "Synthetic", 562));
			playerCodeSet.addPlayerSet(new TennisPlayer(265, "Stefanos Tsitsipas", 17, 11, 6, 1, "Clay", 263));
			playerCodeSet.addPlayerSet(new TennisPlayer(754, "Andrey Rublev", 12, 7, 8, 6, "Grass", 154));
			playerCodeSet.addPlayerSet(new TennisPlayer(398, "Diego Schwartzman", 16, 7, 9, 5, "Others", 485));
			playerCodeSet.addPlayerSet(new TennisPlayer(485, "Matteo Berrettini", 14, 7, 10, 8, "Grass", 326));
			playerCodeSet.printPlayerSet();
			playerRankingList.addStaticPlayers(playerCodeSet.getPlayerLinkedHashSet());
			count++;
		} else {
			System.out.println("Static data can be Entered only Once!");
		}

	}

	public static void printAllTennisPlayers() {
		if (!playerCodeSet.isPlayerList())
			playerCodeSet.printPlayerSet();
		else
			System.out.println("Player List Empty, Kindly Enter Data");

	}

	public static void deletePlayer() {
		if (!playerCodeSet.isPlayerList()) {
			System.out.print("Enter the Player Code to remove player from list: ");
			int playerCode = scanner.nextInt();
			playerCodeSet.deletePlayer(playerCode);
		} else
			System.out.println("Player List Empty, Kindly Enter Data");

	}

	public static void sortPlayerList() {
		playerRankingList.printPlayerSet();
	}

	public static void playMatch() {
		if (!playerCodeSet.isPlayerList()) {
			System.out.print("Enter the Code of First Player: ");
			int playerCode = scanner.nextInt();
			playerCodeSet.getPlayerDetailsToPlayMatch(playerCode);
		} else
			System.out.println("Player List Empty, Kindly Enter Data");

	}

}
