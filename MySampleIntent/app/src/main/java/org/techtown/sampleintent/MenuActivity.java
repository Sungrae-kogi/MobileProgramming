package org.techtown.sampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //새로운 Intent 객체를 생성 명칭은 intent로
                Intent intent = new Intent();

                //intent 객체에 데이터를 넣는 방법인 putExtra()
                intent.putExtra("name","mike");
                //각 액티비티간 이동을 위해선 intent객체로 이동 이때, 이전액티비티에서 다음으로 정보를 넘기고 싶다면 putExtra사용
                setResult(RESULT_OK, intent);
                finish();       //현재 액티비티 없애기
            }
        });
    }
}