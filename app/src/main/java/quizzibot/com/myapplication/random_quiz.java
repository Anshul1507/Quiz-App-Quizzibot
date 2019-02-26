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
import android.widget.TextView;
import android.widget.Toast;

public class random_quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_quiz);

    }

    public void submit_Random(View view) {
        int Ans1, Ans2, Ans3, Ans4, Ans5, Ans6, Ans7, Ans8, Ans9, Ans10, correct, wrong;

        RadioButton questionOneAnswerOne = findViewById(R.id.rq1_r1);

        if (questionOneAnswerOne.isChecked()) {
            Ans1 = 1;
        } else {
            Ans1 = 0;
        }

        RadioButton questionTwoAnswer = findViewById(R.id.rq2_r3);

        if (questionTwoAnswer.isChecked()) {
            Ans2 = 1;
        } else {
            Ans2 = 0;
        }

        RadioButton questionThreeAnswer = findViewById(R.id.rq3_r1);

        if (questionThreeAnswer.isChecked()) {
            Ans3 = 1;
        } else {
            Ans3 = 0;
        }

        RadioButton questionFourAnswer = findViewById(R.id.rq4_r3);

        if (questionFourAnswer.isChecked()) {
            Ans4 = 1;
        } else {
            Ans4 = 0;
        }
        RadioButton questionFiveAnswer = findViewById(R.id.rq5_r4);

        if (questionFiveAnswer.isChecked()) {
            Ans5 = 1;
        } else {
            Ans5 = 0;
        }
        RadioButton questionSixAnswer = findViewById(R.id.rq6_r4);

        if (questionSixAnswer.isChecked()) {
            Ans6 = 1;
        } else {
            Ans6 = 0;
        }
        RadioButton questionSevenAnswer = findViewById(R.id.rq7_r4);

        if (questionSevenAnswer.isChecked()) {
            Ans7 = 1;
        } else {
            Ans7 = 0;
        }
        RadioButton questionEightAnswer = findViewById(R.id.rq8_r3);

        if (questionEightAnswer.isChecked()) {
            Ans8 = 1;
        } else {
            Ans8 = 0;
        }
        CheckBox questionNineAnswer1 = findViewById(R.id.rq9_r2);
        CheckBox questionNineAnswer2 = findViewById(R.id.rq9_r3);
        CheckBox questionNineAnswer3 = findViewById(R.id.rq9_r4);
        CheckBox questionNineAnswer4 = findViewById(R.id.rq9_r1);
        if (questionNineAnswer1.isChecked() &&questionNineAnswer2.isChecked() && !questionNineAnswer3.isChecked() &&!questionNineAnswer4.isChecked()) {
            Ans9 = 1;
        } else {
            Ans9 = 0;
        }

        EditText questionTenAnswer = findViewById(R.id.rq10_edittext);

        if (questionTenAnswer.getText().toString().toLowerCase().equals("true")) {
            Ans10 = 1;
        } else {
            Ans10 = 0;
        }

        correct = Ans1 + Ans2 + Ans3 + Ans4 + Ans5 + Ans6 + Ans7 + Ans8 + Ans9 + Ans10;

        wrong = 10 - correct;

        final int correctRandom = correct;
        final int wrongRandom = wrong;
        Toast toast = Toast.makeText(getApplicationContext(), "You got " + correct + " out of 10 questions right!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        Button submit = findViewById(R.id.results_button_random);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent random_submit = new Intent(random_quiz.this, Results.class);
                random_submit.putExtra("passValue", 1);
                random_submit.putExtra("correctRandom", correctRandom);
                random_submit.putExtra("wrongRandom", wrongRandom);
                startActivity(random_submit);
                random_quiz.this.finish();
            }
        });
    }

    public void reset(View view) {
        CheckBox checkBox;
        RadioGroup radioGroup;
        EditText editText;

        radioGroup = findViewById(R.id.rq1_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.rq2_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.rq3_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.rq4_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.rq5_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.rq6_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.rq7_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.rq8_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        checkBox = findViewById(R.id.rq9_r1);
        checkBox.setChecked(false);
        checkBox = findViewById(R.id.rq9_r2);
        checkBox.setChecked(false);
        checkBox = findViewById(R.id.rq9_r3);
        checkBox.setChecked(false);
        checkBox = findViewById(R.id.rq9_r4);
        checkBox.setChecked(false);

        editText = findViewById(R.id.rq10_edittext);
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