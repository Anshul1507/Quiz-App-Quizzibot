package quizzibot.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class tech_quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_quiz);
    }

    public void submit_tech(View view) {
        int Ans1, Ans2, Ans3, Ans4, Ans5, Ans6, Ans7, Ans8, Ans9, Ans10, correct, wrong;

        RadioButton questionOneAnswerOne = findViewById(R.id.tq1_r2);

        if (questionOneAnswerOne.isChecked()) {
            Ans1 = 1;
        } else {
            Ans1 = 0;
        }

        RadioButton questionTwoAnswer = findViewById(R.id.tq2_r2);

        if (questionTwoAnswer.isChecked()) {
            Ans2 = 1;
        } else {
            Ans2 = 0;
        }

        RadioButton questionThreeAnswer = findViewById(R.id.tq3_r2);

        if (questionThreeAnswer.isChecked()) {
            Ans3 = 1;
        } else {
            Ans3 = 0;
        }

        RadioButton questionFourAnswer = findViewById(R.id.tq4_r3);

        if (questionFourAnswer.isChecked()) {
            Ans4 = 1;
        } else {
            Ans4 = 0;
        }
        RadioButton questionFiveAnswer = findViewById(R.id.tq5_r1);

        if (questionFiveAnswer.isChecked()) {
            Ans5 = 1;
        } else {
            Ans5 = 0;
        }
        RadioButton questionSixAnswer = findViewById(R.id.tq6_r4);

        if (questionSixAnswer.isChecked()) {
            Ans6 = 1;
        } else {
            Ans6 = 0;
        }
        RadioButton questionSevenAnswer = findViewById(R.id.tq7_r1);

        if (questionSevenAnswer.isChecked()) {
            Ans7 = 1;
        } else {
            Ans7 = 0;
        }
        RadioButton questionEightAnswer = findViewById(R.id.tq1_r1);

        if (questionEightAnswer.isChecked()) {
            Ans8 = 1;
        } else {
            Ans8 = 0;
        }
        CheckBox questionNineAnswer1 = findViewById(R.id.tq9_r1);
        CheckBox questionNineAnswer2 = findViewById(R.id.tq9_r2);
        CheckBox questionNineAnswer3 = findViewById(R.id.tq9_r3);
        CheckBox questionNineAnswer4 = findViewById(R.id.tq9_r4);
        if (questionNineAnswer1.isChecked() && questionNineAnswer2.isChecked() &&!questionNineAnswer3.isChecked() &&!questionNineAnswer4.isChecked()) {
            Ans9 = 1;
        } else {
            Ans9 = 0;
        }

        EditText questionTenAnswer = findViewById(R.id.tq10_edittext);

        if (questionTenAnswer.getText().toString().toLowerCase().equals("false")) {
            Ans10 = 1;
        } else {
            Ans10 = 0;
        }

        correct = Ans1 + Ans2 + Ans3 + Ans4 + Ans5 + Ans6 + Ans7 + Ans8 + Ans9 + Ans10;

        wrong = 10 - correct;

        final int correcttech = correct;
        final int wrongtech = wrong;
        Toast toast = Toast.makeText(getApplicationContext(), "You got " + correct + " out of 10 questions right!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        Button submit = findViewById(R.id.results_button_tech);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tech_submit = new Intent(tech_quiz.this, Results.class);
                tech_submit.putExtra("passValue", 4);
                tech_submit.putExtra("correctTech", correcttech);
                tech_submit.putExtra("wrongTech", wrongtech);
                startActivity(tech_submit);
                tech_quiz.this.finish();
            }
        });
    }

    public void reset(View view) {
        CheckBox checkBox;
        RadioGroup radioGroup;
        EditText editText;

        radioGroup = findViewById(R.id.tq1_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.tq2_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.tq3_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.tq4_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.tq5_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.tq6_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.tq7_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        radioGroup = findViewById(R.id.tq8_Radio);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(1)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(2)).setChecked(false);
        ((RadioButton) radioGroup.getChildAt(3)).setChecked(false);

        checkBox = findViewById(R.id.tq9_r1);
        checkBox.setChecked(false);
        checkBox = findViewById(R.id.tq9_r2);
        checkBox.setChecked(false);
        checkBox = findViewById(R.id.tq9_r3);
        checkBox.setChecked(false);
        checkBox = findViewById(R.id.tq9_r4);
        checkBox.setChecked(false);

        editText = findViewById(R.id.tq10_edittext);
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