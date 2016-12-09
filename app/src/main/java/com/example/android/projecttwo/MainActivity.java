package com.example.android.projecttwo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreGoalTeamA = 0;
    int scoreShootTeamA = 0;
    int scorePenaltyTeamA = 0;
    int scoreCornerTeamA = 0;
    int scoreFreeTeamA = 0;

    int scoreGoalTeamB = 0;
    int scoreShootTeamB = 0;
    int scorePenaltyTeamB = 0;
    int scoreCornerTeamB = 0;
    int scoreFreeTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the goal score for Team A by 1 point.
     */
    public void addOneScoreGoalForTeamA(View v) {
        scoreGoalTeamA = scoreGoalTeamA + 1;
        displayForTeamAGoal(scoreGoalTeamA);
    }

    /**
     * Increase the shoot score for Team A by 1 points.
     */
    public void addOneScoreShootForTeamA(View v) {
        scoreShootTeamA = scoreShootTeamA + 1;
        displayForTeamAShoot(scoreShootTeamA);
    }

    /**
     * Increase the penalty score for Team A by 1 points.
     */
    public void addOneScorePenaltyForTeamA(View v) {
        scorePenaltyTeamA = scorePenaltyTeamA + 1;
        displayForTeamAPenalty(scorePenaltyTeamA);
    }

    /**
     * Increase the corner score for Team A by 1 points.
     */
    public void addOneScoreCornerForTeamA(View v) {
        scoreCornerTeamA = scoreCornerTeamA + 1;
        displayForTeamACorner(scoreCornerTeamA);
    }

    /**
     * Increase the free score for Team A by 1 points.
     */
    public void addOneScoreFreeForTeamA(View v) {
        scoreFreeTeamA = scoreFreeTeamA + 1;
        displayForTeamAFree(scoreFreeTeamA);
    }

    /**
     * Increase the goal score for Team B by 1 point.
     */
    public void addOneScoreGoalForTeamB(View v) {
        scoreGoalTeamB = scoreGoalTeamB + 1;
        displayForTeamBGoal(scoreGoalTeamB);
    }

    /**
     * Increase the shoot score for Team B by 1 points.
     */
    public void addOneScoreShootForTeamB(View v) {
        scoreShootTeamB = scoreShootTeamB + 1;
        displayForTeamBshoot(scoreShootTeamB);
    }

    /**
     * Increase the penalty score for Team B by 1 points.
     */
    public void addOneScorePenaltyForTeamB(View v) {
        scorePenaltyTeamB = scorePenaltyTeamB + 1;
        displayForTeamBPenalty(scorePenaltyTeamB);
    }

    /**
     * Increase the corner score for Team B by 1 points.
     */
    public void addOneScoreCornerForTeamB(View v) {
        scoreCornerTeamB = scoreCornerTeamB + 1;
        displayForTeamBCorner(scoreCornerTeamB);
    }

    /**
     * Increase the free score for Team B by 1 points.
     */
    public void addOneScoreFreeForTeamB(View v) {
        scoreFreeTeamB = scoreFreeTeamB + 1;
        displayForTeamBFree(scoreFreeTeamB);
    }

    /**
     * Resets the score for both teams back to 0 point.
     */
    public void resetAllScore(View v) {
        scoreGoalTeamA = 0;
        scoreShootTeamA = 0;
        scorePenaltyTeamA = 0;
        scoreCornerTeamA = 0;
        scoreFreeTeamA = 0;

        scoreGoalTeamB = 0;
        scoreShootTeamB = 0;
        scorePenaltyTeamB = 0;
        scoreCornerTeamB = 0;
        scoreFreeTeamB = 0;

        displayForTeamAGoal(scoreGoalTeamA);
        displayForTeamAShoot(scoreShootTeamA);
        displayForTeamAPenalty(scorePenaltyTeamA);
        displayForTeamACorner(scoreCornerTeamA);
        displayForTeamAFree(scoreFreeTeamA);

        displayForTeamBGoal(scoreGoalTeamB);
        displayForTeamBshoot(scoreShootTeamB);
        displayForTeamBPenalty(scorePenaltyTeamB);
        displayForTeamBCorner(scoreCornerTeamB);
        displayForTeamBFree(scoreFreeTeamB);
    }

    /**
     * Displays the goal score for Team A.
     */
    public void displayForTeamAGoal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.show_team_a_goal_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the shoot score for Team A.
     */
    public void displayForTeamAShoot(int shoot) {
        TextView scoreView = (TextView) findViewById(R.id.show_team_a_shoot_score);
        scoreView.setText(String.valueOf(shoot));
    }

    /**
     * Displays the penalty score for Team A.
     */
    public void displayForTeamAPenalty(int penalty) {
        TextView scoreView = (TextView) findViewById(R.id.show_team_a_penalty_score);
        scoreView.setText(String.valueOf(penalty));
    }

    /**
     * Displays the corner score for Team A.
     */
    public void displayForTeamACorner(int corner) {
        TextView scoreView = (TextView) findViewById(R.id.show_team_a_corner_score);
        scoreView.setText(String.valueOf(corner));
    }

    /**
     * Displays the free score for Team A.
     */
    public void displayForTeamAFree(int free) {
        TextView scoreView = (TextView) findViewById(R.id.show_team_a_free_score);
        scoreView.setText(String.valueOf(free));
    }


    /**
     * Displays the goal score for Team B.
     */
    public void displayForTeamBGoal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.show_team_b_goal_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the shoot score for Team B.
     */
    public void displayForTeamBshoot(int shoot) {
        TextView scoreView = (TextView) findViewById(R.id.show_team_b_shoot_score);
        scoreView.setText(String.valueOf(shoot));
    }

    /**
     * Displays the penalty score for Team B.
     */
    public void displayForTeamBPenalty(int penalty) {
        TextView scoreView = (TextView) findViewById(R.id.show_team_b_penalty_score);
        scoreView.setText(String.valueOf(penalty));
    }

    /**
     * Displays the corner score for Team B.
     */
    public void displayForTeamBCorner(int corner) {
        TextView scoreView = (TextView) findViewById(R.id.show_team_b_corner_score);
        scoreView.setText(String.valueOf(corner));
    }

    /**
     * Displays the free score for Team B.
     */
    public void displayForTeamBFree(int free) {
        TextView scoreView = (TextView) findViewById(R.id.show_team_b_free_score);
        scoreView.setText(String.valueOf(free));
    }

}