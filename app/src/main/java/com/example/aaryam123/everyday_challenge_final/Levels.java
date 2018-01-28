package com.example.aaryam123.everyday_challenge_final;

/**
 * Created by alexa on 1/27/2018.
 */

public class Levels {
    public final static int TOTAL_LEVELS = 9;

    private int currLevel;
     // personal max level
    // set number of challenges for levelChallenges array
    private int levelChallenges[] = {4,5,6,7,8,9,10,11,12};
    private int doneActivites[] = {0,0,0,0,0,0,0,0,0};

    Levels (int level) {
        currLevel = level;
    }

    // call when one is done with challenge at a level (1, 2, ... )
    public void doneChallenge() {
        if (currLevel > TOTAL_LEVELS)
            throw new IllegalArgumentException("Level accessed is too high");

        if (doneActivites[currLevel-1] >= levelChallenges[currLevel-1]) {
            currLevel++;
        }
        doneActivites[(currLevel-1)%levelChallenges.length]++;
    }


    public int getCurrLevel() {
        return currLevel;
    }

}
