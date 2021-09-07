package org.techtown.sampleintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU=101;
    EditText editText;

    //onActivityResult는 새로 띄운 메뉴 액티비티가 응답을 보내오면 , 그 응답을 처리하는 역할
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode ==REQUEST_CODE_MENU){
            Toast.makeText(getApplicationContext(),
                    "onActivityResult 메서드 호출됨. 요청 코드 : " +requestCode +
                    ", 결과 코드 : " + resultCode, Toast.LENGTH_LONG).show();

            //두 번째 인자인 resultCode값이 보통 RESULT_OK라면 정상 처리되었음을 알릴 수 있다.
            if (resultCode == RESULT_OK){
                String name = data.getStringExtra("name");
                Toast.makeText(getApplicationContext(), "응답으로 전달된 name : "+name,
                        Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //생성한 editText 객체를 Id값을 이용해 참조를 해옴
        editText = findViewById(R.id.editText);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                /* ** editText의 getText함수는 String 클래스 타입을 리턴하지 않고,
                Editable 인터페이스 타입을 리턴합니다, 그래서 String 타입으로 텍스트를
                이용하고자 한다면 Editable 인터페이스가 제공하는 toString() 함수를 호출항
                String 타입으로 변환해야 합니다.
                */
                String data = editText.getText().toString();
            }
        });




        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Intent객체의 생성 인자 1=위치한 액티비티 -> 2=이동할 액티비티
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);

                try{
                    startActivity(intent, REQUEST_CODE_MENU);
                } catch(ActivityNotFoundException){

                }

            }
        });
    }
}