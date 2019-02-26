package quizzibot.com.myapplication;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toast makeToast;
    private long double_back_exit;

    private Button start_btn, about_us_btn, exit_btn;
    private EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exit_btn = findViewById(R.id.exit_button);
        exit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        about_us_btn = findViewById(R.id.aboutus_button);
        about_us_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent about_us = new Intent(MainActivity.this, about_us.class);
                startActivity(about_us);
                MainActivity.this.finish();
            }
        });

        username = findViewById(R.id.username_edittext);

        start_btn = findViewById(R.id.button_start);
        start_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String name = username.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("username", name);
                Intent rules = new Intent(MainActivity.this, rules.class);
                rules.putExtras(bundle);
                startActivity(rules);
                MainActivity.this.finish();
            }
        });
    }

    public void onBackPressed() {
        if (double_back_exit + 2000 > System.currentTimeMillis()) {
            makeToast.cancel();
            super.onBackPressed();
            return;
        } else {
            makeToast = Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT);
            makeToast.show();
        }
        double_back_exit = System.currentTimeMillis();
    }
}
