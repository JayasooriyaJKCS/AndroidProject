package lk.sliit.mad.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    numberClass NC = new numberClass();

    int Token = 1;
    TextView totPoints;
    EditText betPoints;
    EditText betMoves;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        betPoints = (EditText) findViewById(R.id.betPoint);
        betMoves = (EditText) findViewById(R.id.betMoves);
        totPoints = (TextView) findViewById(R.id.totPoints);
        genRandom();
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
    }

    void genRandom()
    {
        Random rand = new Random();
        NC.Token = rand.nextInt(9) + 1;
    }

    public void btn1(View view)
    {
        genRandom();

        int points = Integer.parseInt(betPoints.getText().toString());
        int moves = Integer.parseInt(betMoves.getText().toString());
        NC.betPoints = points;
        NC.betMoves = moves;

        NC.moveCount++;

        if(NC.Token == 1)
        {
            NC.totalPoints++;
            Toast.makeText(this, "You guessed right", Toast.LENGTH_SHORT).show();


        }

        if(NC.moveCount == moves)
        {
            Intent newInt = new Intent(this,gameOver.class);
            startActivity(newInt);
        }

        if(NC.totalPoints == points)
        {
            Intent newInt2 = new Intent(this, win.class);
            startActivity(newInt2);
        }

        totPoints.setText("Total Points: "+NC.totalPoints);
    }

    public void btn2(View view)
    {
        genRandom();

        int points = Integer.parseInt(betPoints.getText().toString());
        int moves = Integer.parseInt(betMoves.getText().toString());
        NC.betPoints = points;
        NC.betMoves = moves;

        NC.moveCount++;

        if(NC.Token == 2)
        {
            NC.totalPoints++;
            totPoints.setText("Total Points: "+NC.totalPoints);
            Toast.makeText(this, "You guessed right", Toast.LENGTH_SHORT).show();

        }

        if(NC.moveCount == NC.betMoves)
        {
            Intent newInt = new Intent(this,gameOver.class);
            startActivity(newInt);
        }

        if(NC.totalPoints >= NC.betPoints)
        {
            Intent newInt2 = new Intent(this, win.class);
            startActivity(newInt2);
        }
    }

    public void btn3(View view)
    {
        genRandom();

        int points = Integer.parseInt(betPoints.getText().toString());
        int moves = Integer.parseInt(betMoves.getText().toString());
        NC.betPoints = points;
        NC.betMoves = moves;

        NC.moveCount++;

        if(NC.Token == 3)
        {
            NC.totalPoints++;
            totPoints.setText("Total Points: "+NC.totalPoints);
            Toast.makeText(this, "You guessed right", Toast.LENGTH_SHORT).show();

        }

        if(NC.moveCount == NC.betMoves)
        {
            Intent newInt = new Intent(this,gameOver.class);
            startActivity(newInt);
        }

        if(NC.totalPoints >= NC.betPoints)
        {
            Intent newInt2 = new Intent(this, win.class);
            startActivity(newInt2);
        }
    }

    public void btn4(View view)
    {
        genRandom();

        int points = Integer.parseInt(betPoints.getText().toString());
        int moves = Integer.parseInt(betMoves.getText().toString());
        NC.betPoints = points;
        NC.betMoves = moves;

        NC.moveCount++;

        if(NC.Token == 4)
        {
            NC.totalPoints++;
            totPoints.setText("Total Points: "+NC.totalPoints);
            Toast.makeText(this, "You guessed right", Toast.LENGTH_SHORT).show();

        }

        if(NC.moveCount == NC.betMoves)
        {
            Intent newInt = new Intent(this,gameOver.class);
            startActivity(newInt);
        }

        if(NC.totalPoints >= NC.betPoints)
        {
            Intent newInt2 = new Intent(this, win.class);
            startActivity(newInt2);
        }
    }

    public void btn5(View view)
    {
        genRandom();

        int points = Integer.parseInt(betPoints.getText().toString());
        int moves = Integer.parseInt(betMoves.getText().toString());
        NC.betPoints = points;
        NC.betMoves = moves;

        NC.moveCount++;

        if(NC.Token == 5)
        {
            NC.totalPoints++;
            totPoints.setText("Total Points: "+NC.totalPoints);
            Toast.makeText(this, "You guessed right", Toast.LENGTH_SHORT).show();

        }

        if(NC.moveCount == NC.betMoves)
        {
            Intent newInt = new Intent(this,gameOver.class);
            startActivity(newInt);
        }

        if(NC.totalPoints >= NC.betPoints)
        {
            Intent newInt2 = new Intent(this, win.class);
            startActivity(newInt2);
        }
    }

    public void btn6(View view)
    {
        genRandom();

        int points = Integer.parseInt(betPoints.getText().toString());
        int moves = Integer.parseInt(betMoves.getText().toString());
        NC.betPoints = points;
        NC.betMoves = moves;

        NC.moveCount++;

        if(NC.Token == 6)
        {
            NC.totalPoints++;
            totPoints.setText("Total Points: "+NC.totalPoints);
            Toast.makeText(this, "You guessed right", Toast.LENGTH_SHORT).show();

        }

        if(NC.moveCount == NC.betMoves)
        {
            Intent newInt = new Intent(this,gameOver.class);
            startActivity(newInt);
        }

        if(NC.totalPoints >= NC.betPoints)
        {
            Intent newInt2 = new Intent(this, win.class);
            startActivity(newInt2);
        }
    }

    public void btn7(View view)
    {
        genRandom();

        int points = Integer.parseInt(betPoints.getText().toString());
        int moves = Integer.parseInt(betMoves.getText().toString());
        NC.betPoints = points;
        NC.betMoves = moves;

        NC.moveCount++;

        if(NC.Token == 7)
        {
            NC.totalPoints++;
            totPoints.setText("Total Points: "+NC.totalPoints);
            Toast.makeText(this, "You guessed right", Toast.LENGTH_SHORT).show();

            if(NC.moveCount == NC.betMoves)
            {
                Intent newInt = new Intent(this,gameOver.class);
                startActivity(newInt);
            }

            if(NC.totalPoints >= NC.betPoints)
            {
            Intent newInt2 = new Intent(this, win.class);
            startActivity(newInt2);
            }
        }


    }

    public void btn8(View view)
    {
        genRandom();

        int points = Integer.parseInt(betPoints.getText().toString());
        int moves = Integer.parseInt(betMoves.getText().toString());
        NC.betPoints = points;
        NC.betMoves = moves;

        NC.moveCount++;

        if(NC.Token == 8)
        {
            NC.totalPoints++;
            totPoints.setText("Total Points: "+NC.totalPoints);
            Toast.makeText(this, "You guessed right", Toast.LENGTH_SHORT).show();

        }

        if(NC.moveCount == NC.betMoves)
        {
            Intent newInt = new Intent(this,gameOver.class);
            startActivity(newInt);
        }

        if(NC.totalPoints >= NC.betPoints)
        {
            Intent newInt2 = new Intent(this, win.class);
            startActivity(newInt2);
        }
    }

    public void btn9(View view)
    {
        genRandom();

        int points = Integer.parseInt(betPoints.getText().toString());
        int moves = Integer.parseInt(betMoves.getText().toString());
        NC.betPoints = points;
        NC.betMoves = moves;

        NC.moveCount++;

        if(NC.Token == 9)
        {
            NC.totalPoints++;
            totPoints.setText("Total Points: "+NC.totalPoints);
            Toast.makeText(this, "You guessed right", Toast.LENGTH_SHORT).show();

        }

        if(NC.moveCount == NC.betMoves)
        {
            Intent newInt = new Intent(this,gameOver.class);
            startActivity(newInt);
        }

        if(NC.totalPoints >= NC.betPoints)
        {
            Intent newInt2 = new Intent(this, win.class);
            startActivity(newInt2);
        }
    }
}
