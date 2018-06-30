package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreForR_madrid = 0;
    int scoreForL_pool = 0;

    int foulCountRmadrid = 0;
    int y_cardCountRmadrid = 0;
    int r_cardCountRmadrid = 0;

    int foulCountLpool = 0;
    int y_cardCountLpool = 0;
    int r_cardCountLpool = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForRmadrid(scoreForR_madrid);
        displayForLpool(scoreForL_pool);

        displayFoulForRmadrid(foulCountRmadrid);
        displayY_CardForRmadrid(y_cardCountRmadrid);
        displayR_CardForRmadrid(r_cardCountRmadrid);

    }

    /**
     * Displays the given score for Real Madrid.
     */
    public void displayForRmadrid(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_for_madrid);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Liverpool.
     */
    public void displayForLpool(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_for_lpool);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Real Madrid.
     */
    public void displayFoulForRmadrid(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_count_rmd);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given yellow card for Real Madrid.
     */
    public void displayY_CardForRmadrid(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_card_count_rmd);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red card for Real Madrid.
     */
    public void displayR_CardForRmadrid(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_card_count_rmd);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display fouls for R.Madrid when clicked.
     */
    public void rMadridFoul(View view) {
        foulCountRmadrid = foulCountRmadrid + 1;
        displayFoulForRmadrid(foulCountRmadrid);
    }

    /**
     * Display Yellow cards for R.Madrid when clicked.
     */
    public void rMadridYCard(View view) {
        y_cardCountRmadrid = y_cardCountRmadrid + 1;
        displayY_CardForRmadrid(y_cardCountRmadrid);
    }

    /**
     * Display Red cards for R.Madrid when clicked.
     */
    public void rMadridRCard(View view) {
        r_cardCountRmadrid = r_cardCountRmadrid + 1;
        displayR_CardForRmadrid(r_cardCountRmadrid);
    }

    /**
     * Display scoreline for R.Madrid when clicked.
     */
    public void rMadridGoal(View view) {
        scoreForR_madrid = scoreForR_madrid + 1;
        displayForRmadrid(scoreForR_madrid);
    }

    /**
     * Display scoreline for L.Pool when clicked.
     */
    public void lPoolGoal(View view) {
        scoreForL_pool = scoreForL_pool + 1;
        displayForLpool(scoreForL_pool);
    }

    /**
     * Displays the given foul for Liverpool.
     */
    public void displayFoulForLpool(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_count_lvp);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display fouls for L.Pool when clicked.
     */
    public void lPoolFoul(View view) {
        foulCountLpool = foulCountLpool + 1;
        displayFoulForLpool(foulCountLpool);
    }

    /**
     * Displays the given Yellow card for Liverpool.
     */
    public void displayYcardForLpool(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_card_count_lvp);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display Yellow card for L.Pool when clicked.
     */
    public void lPoolYcard(View view) {
        y_cardCountLpool = y_cardCountLpool + 1;
        displayYcardForLpool(y_cardCountLpool);
    }

    /**
     * Displays the given Red card for Liverpool.
     */
    public void displayRcardForLpool(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_card_count_lvp);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display Red card for L.Pool when clicked.
     */
    public void lPoolRcard(View view) {
        r_cardCountLpool = r_cardCountLpool + 1;
        displayRcardForLpool(r_cardCountLpool);
    }

    /**
     * Resets all game parameters when clicked.
     */
    public void resetForBothTeams(View view) {
        scoreForR_madrid = 0;
        scoreForL_pool = 0;

        foulCountRmadrid = 0;
        y_cardCountRmadrid = 0;
        r_cardCountRmadrid = 0;

        foulCountLpool = 0;
        y_cardCountLpool = 0;
        r_cardCountLpool = 0;

        displayForRmadrid(scoreForR_madrid);
        displayForLpool(scoreForL_pool);

        displayFoulForRmadrid(foulCountRmadrid);
        displayY_CardForRmadrid(y_cardCountRmadrid);
        displayR_CardForRmadrid(r_cardCountRmadrid);

        displayFoulForLpool(foulCountLpool);
        displayYcardForLpool(y_cardCountLpool);
        displayRcardForLpool(r_cardCountLpool);

    }

}
