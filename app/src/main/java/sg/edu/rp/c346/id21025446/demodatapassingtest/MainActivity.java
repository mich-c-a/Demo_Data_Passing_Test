package sg.edu.rp.c346.id21025446.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //event handling step 1
    Button btnPassInteger;
    Button btnPassChar;
    TextView tvPassDoub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //event handling step 2
        btnPassInteger = findViewById(R.id.buttonPassInteger);
        btnPassChar = findViewById(R.id.buttonPassChar);
        tvPassDoub = findViewById(R.id.textViewdouble);

        //event handling step 3
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
                intent2.putExtra("value", 'a');
                startActivity(intent2);
            }
        });

        tvPassDoub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, FourthActivity.class);
                intent3.putExtra("value",99.99);
                startActivity(intent3);
            }
        });
    }
}