package quizzibot.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class category extends AppCompatActivity {
    private ImageButton random, gk, sports, tech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        random = findViewById(R.id.random_btn);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent random_quiz = new Intent(category.this, random_quiz.class);
                startActivity(random_quiz);
                category.this.finish();
            }
        });

        gk = findViewById(R.id.gk_btn);
        gk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent random_quiz = new Intent(category.this, gk_quiz.class);
                startActivity(random_quiz);
                category.this.finish();
            }
        });
        sports = findViewById(R.id.sport_btn);
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent random_quiz = new Intent(category.this, sports_quiz.class);
                startActivity(random_quiz);
                category.this.finish();
            }
        });
        tech = findViewById(R.id.tech_btn);
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent random_quiz = new Intent(category.this, tech_quiz.class);
                startActivity(random_quiz);
                category.this.finish();
            }
        });
    }

    public void onBackPressed() {
        Intent BackpressedIntent = new Intent();
        BackpressedIntent.setClass(getApplicationContext(), MainActivity.class);
        BackpressedIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(BackpressedIntent);
        finish();
    }
}



