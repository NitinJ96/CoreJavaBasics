package com.thirdware.tennisplayer;

import java.util.Comparator;
import java.util.Random;

public class TennisPlayer implements Comparator<TennisPlayer> {
	private int playerCode;
	private String playerName;
	private PlayerCareer careerDetail;
	
	public TennisPlayer() {
		
	}

	public TennisPlayer(int playerCode, String playerName, int matchesPlayed, int matchesWon, int currentRanking, int bestRanking, String preferredCourt,
			int lastFought) {
		super();
		this.playerCode = playerCode;
		this.playerName = playerName;
		this.careerDetail = new PlayerCareer(matchesPlayed, matchesWon, currentRanking, bestRanking, preferredCourt, lastFought);
	}

	public int getPlayerCode() {
		return playerCode;
	}

	public String getPlayerName() {
		return playerName;
	}

	public PlayerCareer getCareerDetail() {
		return careerDetail;
	}
	
	public int playMatch(int playerCode) {
		Random random = new Random();
		int choice = random.nextInt(2);
		if(choice == 0)
			return 1;
		else
			return -1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + playerCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TennisPlayer other = (TennisPlayer) obj;
		if (playerCode != other.playerCode)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TennisPlayer: \n PlayerCode:" + playerCode + "\n PlayerName: " + playerName + "\n CareerDetail: "
				+ careerDetail.toString();
	}

	@Override
	public int compare(TennisPlayer player1, TennisPlayer player2) {
		// TODO Auto-generated method stub
		if(player1.getCareerDetail().getCurrentRanking() == player2.getCareerDetail().getCurrentRanking()) {
			return player1.getPlayerName().compareTo(player2.getPlayerName());
		}
		return player1.getCareerDetail().getCurrentRanking() - player2.getCareerDetail().getCurrentRanking();
	}
	
}
