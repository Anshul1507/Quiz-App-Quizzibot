package quizzibot.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("username");

        TextView username = findViewById(R.id.welcome);
        username.setText("Welcome " + " ,\" " + name + "\"");

        Button play_btn = findViewById(R.id.play_button);
        play_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent category = new Intent(rules.this, category.class);
                startActivity(category);
                rules.this.finish();

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
