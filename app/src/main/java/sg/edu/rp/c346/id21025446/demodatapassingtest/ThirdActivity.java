package sg.edu.rp.c346.id21025446.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswer = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value", ' ');
        tvAnswer.setText("Character value received is: " + value);

    }
}