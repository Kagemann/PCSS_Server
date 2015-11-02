package com.company;



/**
 * Created by kristianhjensen on 02/11/2015.
 */
public class Player {
    private String playerName;
    private float playerNumber;
    private Building[] buildings;
    //private Road[] road;
    private int [] resources = new int[5];
    private int knights;
    private int points;
    private static int turn;
    //private devCard[];
    private boolean hasToDiscard;
    private boolean hasWon;


    /**
     * Constructor for the player classes, this constructor contains all information needed to generate
     * a new player object for the game.
     */

    Player (String playerName, int playerNumber){
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        points = 0;
        //buildings = 0;
        //road = 0;
        knights = 0;
        turn = 0;
        //devCard = 0;
        hasToDiscard = false;
    }

    public void drawCard() {
        // TODO
        //check
    }


}