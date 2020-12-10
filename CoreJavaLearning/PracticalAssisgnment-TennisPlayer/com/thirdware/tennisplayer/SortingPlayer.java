package com.thirdware.tennisplayer;

import java.util.Comparator;

public class SortingPlayer {

}

class sortByCurrentRanking implements Comparator<TennisPlayer> {
	//To sort by currentRanking
	@Override
	public int compare(TennisPlayer player1, TennisPlayer player2) {
		return player1.getCareerDetail().getCurrentRanking() - player2.getCareerDetail().getCurrentRanking();
	}
}

class sortByPlayerName implements Comparator<TennisPlayer>{
	//If current Ranking is same, compares using Name
	@Override
	public int compare(TennisPlayer player1, TennisPlayer player2) {
		// TODO Auto-generated method stub
		return player1.getPlayerName().compareTo(player2.getPlayerName());
	}
	
}