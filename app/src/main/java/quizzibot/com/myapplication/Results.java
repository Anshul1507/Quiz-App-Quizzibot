package quizzibot.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Results extends AppCompatActivity {
    private TextView correct_ans, incorrect_ans, title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        correct_ans = findViewById(R.id.Correct_Answers);
        incorrect_ans = findViewById(R.id.Incorrect_Answers);
        title = findViewById(R.id.title_text);

        int value = getIntent().getExtras().getInt("passValue");
        int correct, wrong;
        if (value == 1) {

            title.setText("Random Quiz Results");
            correct = getIntent().getExtras().getInt("correctRandom");
            wrong = getIntent().getExtras().getInt("wrongRandom");
            correct_ans.setText("Correct Answers : " + correct);
            incorrect_ans.setText("Incorrect Answers : " + wrong);
        } else if (value == 2) {
            title.setText("GK Quiz Results");
            correct = getIntent().getExtras().getInt("correctGk");
            wrong = getIntent().getExtras().getInt("wrongGk");
            correct_ans.setText("Correct Answers : " + correct);
            incorrect_ans.setText("Incorrect Answers : " + wrong);
        } else if (value == 3) {
            title.setText("Sports Quiz Results");
            correct = getIntent().getExtras().getInt("correctSports");
            wrong = getIntent().getExtras().getInt("wrongSports");
            correct_ans.setText("Correct Answers : " + correct);
            incorrect_ans.setText("Incorrect Answers : " + wrong);
        } else if (value == 4) {
            title.setText("Tech Quiz Results");
            correct = getIntent().getExtras().getInt("correctTech");
            wrong = getIntent().getExtras().getInt("wrongTech");
            correct_ans.setText("Correct Answers : " + correct);
            incorrect_ans.setText("Incorrect Answers : " + wrong);
        }

    }

    public void retake_quiz(View view) {
        Intent retake_quiz = new Intent(Results.this, MainActivity.class);
        startActivity(retake_quiz);
        this.finish();
    }

    public void onBackPressed() {
        Intent BackpressedIntent = new Intent();
        BackpressedIntent.setClass(getApplicationContext(), category.class);
        BackpressedIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(BackpressedIntent);
        finish();

    }
}
