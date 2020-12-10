package com.thirdware.tennisplayer;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class PlayerCodeLinkedHashSet {
	private LinkedHashSet<TennisPlayer> playerLinkedHashSet = new LinkedHashSet<TennisPlayer>();

	// Get Player List
	public Set<TennisPlayer> getPlayerLinkedHashSet() {
		return playerLinkedHashSet;
	}

	// To check if Player List is empty
	public boolean isPlayerList() {
		return playerLinkedHashSet.isEmpty();
	}

	// Add players to List
	public void addPlayerSet(TennisPlayer tennisPlayer) {
		playerLinkedHashSet.add(tennisPlayer);
	}

	// Print Players to List
	public void printPlayerSet() {
		if (!isPlayerList()) {
			System.out.println("========================PLAYERDETAILS===========================");
			for (TennisPlayer tennisPlayer : playerLinkedHashSet) {
				System.out.println(tennisPlayer.toString());
			}System.out.println("===============================================================");
		}
	}

	// Delete Player from List with specific Player Code
	public void deletePlayer(int playerCode) {
		boolean error = false;
		if (!isPlayerList()) {
			for (TennisPlayer tennisPlayer : playerLinkedHashSet) {
				if (tennisPlayer.getPlayerCode() == playerCode) {
					nullifyLastFoughtCode(tennisPlayer.getPlayerCode());
					playerLinkedHashSet.remove(tennisPlayer);
					System.out.println("Player with code: " + playerCode + " deleted");
					error = true;
					break;
				}
			}
			try {
				if (error != true)
					throw new PlayerNotFoundException("Player not found in the list");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	// Nullifying the Player code in last fought after deletion
	private void nullifyLastFoughtCode(int playerCode) {
		for (TennisPlayer tp : playerLinkedHashSet) {
			if (tp.getCareerDetail().getLastFought() == playerCode) {
				tp.getCareerDetail().setLastFought(0);
			}
		}
	}

	public void getPlayerDetailsToPlayMatch(int playerCode) {
		System.out.println("Player Data Before Match: ");
		TennisPlayer player1 = getPlayerOne(playerCode);
		TennisPlayer player2 = getplayerTwo(playerCode);
		try {
			if (player1 != null) {
				playTennisMatch(player1, player2);
			} else {
				throw new PlayerNotFoundException("Player not found in the list");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// Method To Play Tennis Match between two Players
	private void playTennisMatch(TennisPlayer player1, TennisPlayer player2) {
		if (player1.playMatch() == 1) {
			System.out.println("Player with code: " + player1.getPlayerCode() + " Wins");
			PlayerCareer.updatePlayerAfterMatch(player1, player2);
		} else {
			System.out.println("Player with code: " + player2.getPlayerCode() + " Wins");
			PlayerCareer.updatePlayerAfterMatch(player2, player1);
		}
		System.out.println("Player Details After Match: ");
		System.out.println(player1.toString() + "\n" + player2.toString());

	}

	// Get Player One using playerCode from user
	private TennisPlayer getPlayerOne(int playerCode) {
		for (TennisPlayer tennisPlayer : playerLinkedHashSet) {
			if (tennisPlayer.getPlayerCode() == playerCode) {
				System.out.println("Player1: " + tennisPlayer.toString());
				return tennisPlayer;
			}
		}
		return null;
	}

	// Get player two using random number generator
	private TennisPlayer getplayerTwo(int playerCode1) {
		Random random = new Random();
		boolean quit = false;
		while (!quit) {
			int index = 0;
			int choice = random.nextInt(playerLinkedHashSet.size());
			for (TennisPlayer tennisPlayer : playerLinkedHashSet) {
				if (index == choice && tennisPlayer.getPlayerCode() != playerCode1) {
					System.out.println("Player2: " + tennisPlayer.toString());
					return tennisPlayer;
				} else {
					index++;
				}
			}
		}
		return null;
	}
}
