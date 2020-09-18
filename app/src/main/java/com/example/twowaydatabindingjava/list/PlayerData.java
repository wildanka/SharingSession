package com.example.twowaydatabindingjava.list;

public class PlayerData {
    private String playerName;
    private String playerNumber;

    public PlayerData(String playerName, String playerNumber) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }
}
