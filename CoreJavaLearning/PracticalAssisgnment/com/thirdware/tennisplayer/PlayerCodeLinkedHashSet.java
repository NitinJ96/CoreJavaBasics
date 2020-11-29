package com.thirdware.tennisplayer;

import java.util.LinkedHashSet;
import java.util.Set;

public class PlayerCodeLinkedHashSet {
	Set<TennisPlayer> playerLinkedHashSet = new LinkedHashSet<TennisPlayer>();

	public void addPlayerSet(TennisPlayer tennisPlayer) {
		playerLinkedHashSet.add(tennisPlayer);
	}

	public void printPlayerSet() {
		if (!playerLinkedHashSet.isEmpty()) {
			for (TennisPlayer tennisPlayer : playerLinkedHashSet) {
				System.out.println(tennisPlayer.toString());
			}
		} else {
			System.out.println("The player List is Empty");
		}
	}

	public void deletePlayer(int playerCode) {
		if (!playerLinkedHashSet.isEmpty()) {
			try {
				for (TennisPlayer tennisPlayer : playerLinkedHashSet) {
					if (tennisPlayer.getPlayerCode() == playerCode) {
						playerLinkedHashSet.remove(tennisPlayer);
						System.out.println("Player with code: " + playerCode + " deleted");
					} 
				}throw new PlayerNotFoundException("Player not found in the list");
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("Player list is Empty");
		}
	}
	
}
