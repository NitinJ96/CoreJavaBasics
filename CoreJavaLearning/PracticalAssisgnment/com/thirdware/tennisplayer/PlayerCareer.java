package com.thirdware.tennisplayer;

public class PlayerCareer {
	private int matchesPlayed;
	private int matchesWon;
	private int currentRanking;
	private int bestRanking;
	private String preferredCourt;
	private int lastFought;

	public PlayerCareer(int matchesPlayed, int matchesWon, int currentRanking, int bestRanking, String preferredCourt,
			int lastFought) {
		super();
		this.matchesPlayed = matchesPlayed;
		this.matchesWon = matchesWon;
		this.currentRanking = currentRanking;
		this.bestRanking = bestRanking;
		this.preferredCourt = preferredCourt;
		this.lastFought = lastFought;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public int getMatchesWon() {
		return matchesWon;
	}

	public int getCurrentRanking() {
		return currentRanking;
	}

	public int getBestRanking() {
		return bestRanking;
	}

	public String getPreferredCourt() {
		return preferredCourt;
	}

	public int getLastFought() {
		return lastFought;
	}
	
	public void updatePlayerCareer(TennisPlayer tennisPlayer) {
		if(tennisPlayer.playMatch(tennisPlayer.getPlayerCode()) == 1) {
			this.currentRanking--;
		}else {
			this.currentRanking++;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentRanking;
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
		PlayerCareer other = (PlayerCareer) obj;
		if (currentRanking != other.currentRanking)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\n\tPlayerCareer: \n\tMatchesPlayed: " + matchesPlayed + "\n\tMatchesWon: " + matchesWon + "\n\tCurrentRanking: "
				+ currentRanking + "\n\tBestRanking: " + bestRanking + "\n\tPreferredCourt: " + preferredCourt
				+ "\n\tLastFought: " + lastFought;
	}	
}
