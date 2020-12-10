package com.thirdware.tennisplayer;

public class PlayerCareer {
	private int matchesPlayed;
	private int matchesWon;
	private int currentRanking;
	private int bestRanking;
	private String preferredCourt;
	private int lastFought;

	public void setLastFought(int lastFought) {
		this.lastFought = lastFought;
	}

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

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}

	public void setCurrentRanking(int currentRanking) {
		this.currentRanking = currentRanking;
	}

	public void setBestRanking(int bestRanking) {
		this.bestRanking = bestRanking;
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
	
	public static void updatePlayerAfterMatch(TennisPlayer winningPlayer, TennisPlayer losingPlayer) {
		//Updating for winning Player
		if(winningPlayer.getCareerDetail().getCurrentRanking()!=1) {
			winningPlayer.getCareerDetail().setCurrentRanking(winningPlayer.getCareerDetail().getCurrentRanking()-1);
		}
		winningPlayer.getCareerDetail().setMatchesPlayed(winningPlayer.getCareerDetail().getMatchesPlayed()+1);
		winningPlayer.getCareerDetail().setMatchesWon(winningPlayer.getCareerDetail().getMatchesWon()+1);
		winningPlayer.getCareerDetail().setLastFought(losingPlayer.getPlayerCode());
		if(winningPlayer.getCareerDetail().getCurrentRanking()<winningPlayer.getCareerDetail().getBestRanking()) {
			winningPlayer.getCareerDetail().setBestRanking(winningPlayer.getCareerDetail().getCurrentRanking());
		}
		
		//Updating for Losing Player
		losingPlayer.getCareerDetail().setCurrentRanking(losingPlayer.getCareerDetail().getCurrentRanking()+1);
		losingPlayer.getCareerDetail().setMatchesPlayed(losingPlayer.getCareerDetail().getMatchesPlayed()+1);
		losingPlayer.getCareerDetail().setLastFought(winningPlayer.getPlayerCode());
	}

	@Override
	public String toString() {
		return "\n\tMatchesPlayed: " + matchesPlayed + "\n\tMatchesWon: " + matchesWon + "\n\tCurrentRanking: "
				+ currentRanking + "\n\tBestRanking: " + bestRanking + "\n\tPreferredCourt: " + preferredCourt
				+ "\n\tLastFought: " + lastFought;
	}
}
