package com.example.android.footballstatistic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Variable and Constant for both teams
     *
     */
    int home_score, home_fouls, home_yellowCard, home_redCard, away_score, away_fouls, away_yellowCards, away_redCards = 0;
    final int addOne = 1;

    /* Method for Home Team which is calculate the
     * Score, Fouls, Yellow Card, and Red Card
     *
     */
    public void home_clickGoal(View v) {
        home_score = home_score + addOne;
        home_displayScore(home_score);
    }

    public void home_clickFouls(View v) {
        home_fouls = home_fouls + addOne;
        home_displayFouls(home_fouls);
    }

    public void home_clickYellowCard(View v) {
        home_yellowCard = home_yellowCard + addOne;
        home_displayYellowCards(home_yellowCard);
    }

    public void home_clickRedCard(View v) {
        home_redCard = home_redCard + addOne;
        home_displayRedCards(home_redCard);
    }

    /* Method for Away Team which is calculate the
     * Score, Fouls, Yellow Card, and Red Card
     *
     */
    public void away_clickGoal(View v) {
        away_score = away_score + addOne;
        away_displayScore(away_score);
    }

    public void away_clickFouls(View v) {
        away_fouls = away_fouls + addOne;
        away_displayFouls(away_fouls);
    }

    public void away_clickYellowCard(View v) {
        away_yellowCards = away_yellowCards + addOne;
        away_displayYellowCards(away_yellowCards);
    }

    public void away_clickRedCard(View v) {
        away_redCards = away_redCards + addOne;
        away_displayRedCards(away_redCards);
    }

    /* Method used to reset for both teams
     *
     */
    public void reset(View v) {
        home_score = 0;
        home_fouls = 0;
        home_yellowCard = 0;
        home_redCard = 0;
        away_score = 0;
        away_fouls = 0;
        away_yellowCards = 0;
        away_redCards = 0;
        home_displayScore(home_score);
        home_displayFouls(home_fouls);
        home_displayYellowCards(home_yellowCard);
        home_displayRedCards(home_redCard);
        away_displayScore(away_score);
        away_displayFouls(away_fouls);
        away_displayYellowCards(away_yellowCards);
        away_displayRedCards(away_redCards);
    }

    /* Function for displaying the calculated number for
     * Home Team
     *
     */
    private void home_displayScore(int valScore) {
        TextView varScore = findViewById(R.id.home_score);
        varScore.setText(String.valueOf(valScore));
    }

    private void home_displayFouls(int valFouls) {
        TextView varFouls = findViewById(R.id.home_fouls);
        varFouls.setText(String.valueOf(valFouls));
    }

    private void home_displayYellowCards(int valYellowCards) {
        TextView varYellowCards = findViewById(R.id.home_yellowCards);
        varYellowCards.setText(String.valueOf(valYellowCards));
    }

    private void home_displayRedCards(int valRedCards) {
        TextView varRedCards = findViewById(R.id.home_redCards);
        varRedCards.setText(String.valueOf(valRedCards));
    }

    /* Function for displaying the calculated number for
     * Away Team
     *
     */
    private void away_displayScore(int valScore) {
        TextView varScore = findViewById(R.id.away_score);
        varScore.setText(String.valueOf(valScore));
    }

    private void away_displayFouls(int valFouls) {
        TextView varFouls = findViewById(R.id.away_fouls);
        varFouls.setText(String.valueOf(valFouls));
    }

    private void away_displayYellowCards(int valYellowCards) {
        TextView varYellowCards = findViewById(R.id.away_yellowCards);
        varYellowCards.setText(String.valueOf(valYellowCards));
    }

    private void away_displayRedCards(int valRedCards) {
        TextView varRedCards = findViewById(R.id.away_redCards);
        varRedCards.setText(String.valueOf(valRedCards));
    }
}
