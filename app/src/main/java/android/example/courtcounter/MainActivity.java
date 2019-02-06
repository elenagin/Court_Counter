package android.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pointsLeftTeam = 0;
    int pointsRightTeam = 0;
    int foulsLeftTeam = 0;
    int foulsRightTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pointsLeftButton1(View view) {
        pointsLeftTeam = pointsLeftTeam + 6;
        displayLeftScore();
    }

    public void pointsLeftButton2(View view) {
        pointsLeftTeam = pointsLeftTeam + 3;
        displayLeftScore();
    }

    public void pointsLeftButton3(View view) {
        pointsLeftTeam = pointsLeftTeam + 2;
        displayLeftScore();
    }

    public void pointsRightButton1(View view) {
        pointsRightTeam = pointsRightTeam + 6;
        displayRightScore();
    }

    public void pointsRightButton2(View view) {
        pointsRightTeam = pointsRightTeam + 3;
        displayRightScore();
    }

    public void pointsRightButton3(View view) {
        pointsRightTeam = pointsRightTeam + 2;
        displayRightScore();
    }

    public void foulsLeft(View view) {
        foulsLeftTeam = foulsLeftTeam + 1;
        displayLeftFouls();
    }

    public void foulsRight(View view) {
        foulsRightTeam = foulsRightTeam + 1;
        displayRightFouls();
    }


    private void displayLeftScore() {
        TextView scoreView = findViewById(R.id.pointsLeftSide);
        scoreView.setText(String.valueOf(pointsLeftTeam));
    }

    private void displayRightScore() {
        TextView scoreView = findViewById(R.id.pointsRightSide);
        scoreView.setText(String.valueOf(pointsRightTeam));
    }

    private void displayLeftFouls() {
        TextView scoreView = findViewById(R.id.foulsLeftSide);
        scoreView.setText(String.valueOf(foulsLeftTeam));
    }

    private void displayRightFouls() {
        TextView scoreView = findViewById(R.id.foulsRightSide);
        scoreView.setText(String.valueOf(foulsRightTeam));
    }

    public void resetButton(View view) {
        pointsLeftTeam = 0;
        pointsRightTeam = 0;
        foulsLeftTeam = 0;
        foulsRightTeam = 0;
        displayLeftScore();
        displayRightScore();
        displayLeftFouls();
        displayRightFouls();
    }

}