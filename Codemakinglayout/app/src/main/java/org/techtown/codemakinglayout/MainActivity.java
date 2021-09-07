package org.techtown.codemakinglayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //mainLayout이라고 직접 자바코드로 레이아웃을 생성
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        //레이아웃 안에 추가될 뷰들에 설정할 파라미터를 생성한거
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);

        Button button1 = new Button(this);
        button1.setText("Button1");
        button1.setLayoutParams(params);
        mainLayout.addView(button1);
        //버튼에 파라미터 설정하고 레이아웃에 추가

        //원래 R.layout.activity_main이 있어야 하는데 지우고 직접만든 레이아웃으로 띄워보기
        setContentView(mainLayout);


    }
}