package com.thirdware.tennisplayer;

import java.util.Random;

public class TennisPlayer {
	private int playerCode;
	private String playerName;
	private PlayerCareer careerDetail;

	public TennisPlayer(int playerCode, String playerName, int matchesPlayed, int matchesWon, int currentRanking,
			int bestRanking, String preferredCourt, int lastFought) {
		super();
		
		//If playerCode and lastFought Player Code is equal, Throws error
		try {
			if (playerCode != lastFought) {
				this.playerCode = playerCode;
				this.playerName = playerName;
				this.careerDetail = new PlayerCareer(matchesPlayed, matchesWon, currentRanking, bestRanking,
						preferredCourt, lastFought);
			} else {
				throw new PlayerInputError("Player Code and LastFought Player Code cannot be same, Please enter valid Data");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
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
	
	public void playTennisMatch() {
		
	}
	
	public int playMatch() {
		Random random = new Random();
		int choice = random.nextInt(2);
		if (choice == 0)
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
		return "\nTennisPlayer: \n\tPlayerCode:" + playerCode + "\n\tPlayerName: " + playerName + "\nCareerDetail: "
				+ careerDetail.toString();
	}

}
