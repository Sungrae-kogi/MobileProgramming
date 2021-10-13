package org.techtown.resultlauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("Second 액티비티");

        Intent inIntent = getIntent();
        final int hapValue = inIntent.getIntExtra("Num1",0)
                +inIntent.getIntExtra("Num2",0);

        Button btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent outIntent = new Intent(getApplicationContext(),
                        MainActivity.class);
                outIntent.putExtra("Hap",hapValue);
                setResult(RESULT_OK,outIntent);
                finish();
            }
        });

        Button button_call = findViewById(R.id.button_call);
        button_call.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01020337013"));
                startActivity(callIntent);
            }
        });
    }
}