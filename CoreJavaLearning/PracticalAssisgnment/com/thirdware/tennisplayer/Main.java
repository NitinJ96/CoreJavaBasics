package com.thirdware.tennisplayer;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static TennisPlayer tennisPlayer;
	private static PlayerCodeLinkedHashSet playerCodeSet = new PlayerCodeLinkedHashSet();
	private static PlayerRankingList playerRankingList = new PlayerRankingList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				addPlayer();
				break;
			case 2:
				deletePlayer();
				break;
			case 3:
				sortPlayerList();
				break;
			case 6:
				printPlayerDetails();
				break;
			case 7:
				quit = true;
				break;
			}
		}
		try {
			return; 
		}finally {
			System.out.println("Finally");
		}
//		System.out.println("Thanks for using the Application");
	}

	private static void printInstructions() {
		System.out.println("Press");
		System.out.println("\t 0 - To print choice options");
		System.out.println("\t 1 - To add TennisPlayer");
		System.out.println("\t 2 - To delete player");
//		System.out.println("\t 3 - To implement taxation on salary");
//		System.out.println("\t 4 - To print All Employee Details");
//		System.out.println("\t 5 - To remove Employee details");
		System.out.println("\t 6 - To print Player details");
		System.out.println("\t 7 - To quit the application");
	}
	
	private static void addPlayer() {
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
		System.out.print("Choose the player preferred Court: Grass/Synthetic/Clay/Others");
		String preferredCourt = scanner.nextLine();
		
		tennisPlayer = new TennisPlayer(playerCode, playerName, matchesPlayed, matchesWon, currentRanking, bestRanking, preferredCourt, lastFought);
		playerCodeSet.addPlayerSet(tennisPlayer);
		
		playerRankingList.addPlayer(tennisPlayer);
		
	}
	
	public static void printPlayerDetails() {
		playerCodeSet.printPlayerSet();
	}
	
	public static void deletePlayer() {
		System.out.print("Enter the Player Code to remove player from list: ");
		int playerCode = scanner.nextInt();
		playerCodeSet.deletePlayer(playerCode);
	}
	
	public static void sortPlayerList() {
		playerRankingList.printPlayerSet();
	}
	
	Set hashSet = new HashSet();
	

}
