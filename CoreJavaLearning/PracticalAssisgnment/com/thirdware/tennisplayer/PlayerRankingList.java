package com.thirdware.tennisplayer;

import java.util.ArrayList;
import java.util.Collections;


public class PlayerRankingList {
	
	ArrayList<TennisPlayer> playerRankingList = new ArrayList<>();
	
	public void addPlayer(TennisPlayer tennisPlayer) {
		playerRankingList.add(tennisPlayer);
	}
	
	public void printPlayerSet() {
		if(!playerRankingList.isEmpty()) {
			sortByName();
			for (TennisPlayer tennisPlayer : playerRankingList) {
				System.out.println(tennisPlayer.toString());
			}
		}else {
			System.out.println("Player List is Empty");
		}
	}
	
	public void sortByName() {
		Collections.sort(playerRankingList, new TennisPlayer());
	}
}
