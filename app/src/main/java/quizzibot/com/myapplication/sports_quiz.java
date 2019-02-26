package quizzibot.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class sports_quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_quiz);
    }

    public void submit_Sports(View view) {
        int Ans1, Ans2, Ans3, Ans4, Ans5, Ans6, Ans7, Ans8, Ans9, Ans10, correct, wrong;

        RadioButton questionOneAnswerOne = findViewById(R.id.sq1_r3);

        if (questionOneAnswerOne.isChecked()) {
            Ans1 = 1;
        } else {
            Ans1 = 0;
        }

        RadioButton questionTwoAnswer = findViewById(R.id.sq2_r1);

        if (questionTwoAnswer.isChecked()) {
            Ans2 = 1;
        } else {
            Ans2 = 0;
        }

        RadioButton questionThreeAnswer = findViewById(R.id.sq3_r2);

        if (questionThreeAnswer.isChecked()) {
            Ans3 = 1;
        } else {
            Ans3 = 0;
        }

        RadioButton questionFourAnswer = findViewById(R.id.sq4_r3);

        if (questionFourAnswer.isChecked()) {
            Ans4 = 1;
        } else {
            Ans4 = 0;
        }
        RadioButton questionFiveAnswer = findViewById(R.id.sq5_r3);

        if (questionFiveAnswer.isChecked()) {
            Ans5 = 1;
        } else {
            Ans5 = 0;
        }
        RadioButton questionSixAnswer = findViewById(R.id.sq6_r3);

        if (questionSixAnswer.isChecked()) {
            Ans6 = 1;
        } else {
            Ans6 = 0;
        }
        RadioButton questionSevenAnswer = findViewById(R.id.sq7_r2);

        if (questionSevenAnswer.isChecked()) {
            Ans7 = 1;
        } else {
            Ans7 = 0;
        }
        RadioButton questionEightAnswer = findViewById(R.id.sq8_r3);

        if (questionEightAnswer.isChecked()) {
            Ans8 = 1;
        } else {
            Ans8 = 0;
        }
        CheckBox questionNineAnswer1 = findViewById(R.id.sq9_r2);
        CheckBox questionNineAnswer2 = findViewById(R.id.sq9_r4);
        CheckBox questionNineAnswer3 = findViewById(R.id.sq9_r1);
        CheckBox questionNineAnswer4 = findViewById(R.id.sq9_r3);
        if (questionNineAnswer1.isChecked() && questionNineAnswer2.isChecked() && !questionNineAnswer3.isChecked() && !questionNineAnswer4.isChecked()) {
            Ans9 = 1;
        } else {
            Ans9 = 0;
        }

        EditText questionTenAnswer = findViewById(R.id.sq10_edittext);

        if (questionTenAnswer.getText().toString().toLowerCase().equals("true")) {
            Ans10 = 1;
        } else {
            Ans10 = 0;
        }

        correct = Ans1 + Ans2 + Ans3 + Ans4 + Ans5 + Ans6 + Ans7 + Ans8 + Ans9 + Ans10;

        wrong = 10 - correct;

        final int correctsports = correct;
        final int wrongsports = wrong;
        Toast toast = Toast.makeText(getApplicationContext(), "You got " + correct + " out of 10 questions right!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        Button submit = findViewById(R.id.results_button_sports);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sports_submit = new Intent(sports_quiz.this, Results.class);
                sports_submit.putExtra("passValue", 3);
                sports_submit.putExtra("correctSports", correctsports);
                sports_submit.putExtra("wrongSports", wrongsports);
                startActivity(sports_submit);
                sports_quiz.this.finish();
            }
        });
    }

    public void reset(View view) {
        CheckBox checkBox;
        RadioGroup radioGroup;
        EditText editText;

        radioGroup = findViewById(R.id.sq1_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.sq2_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.sq3_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.sq4_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.sq5_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.sq6_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.sq7_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.sq8_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        checkBox = findViewById(R.id.sq9_r1);
        checkBox.setChecked(false);
        checkBox = findViewById(R.id.sq9_r2);
        checkBox.setChecked(false);
        checkBox = findViewById(R.id.sq9_r3);
        checkBox.setChecked(false);
        checkBox = findViewById(R.id.sq9_r4);
        checkBox.setChecked(false);

        editText = findViewById(R.id.sq10_edittext);
        editText.setText("");

    }

    public void onBackPressed() {
        Intent BackpressedIntent = new Intent();
        BackpressedIntent.setClass(getApplicationContext(), category.class);
        BackpressedIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(BackpressedIntent);
        finish();

    }
}