package org.techtown.samplelayoutinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "버튼이 눌렸습니다.", Toast.LENGTH_LONG).show();
            }
        });

        /*앱이 실행되는시점에 메모리에 객체화 하는 Inflation과정
        메모리에 Inflation 하기 이전에 객체를 참조하고자 한다면 에러 */
        setContentView(R.layout.activity_main);
    }
}