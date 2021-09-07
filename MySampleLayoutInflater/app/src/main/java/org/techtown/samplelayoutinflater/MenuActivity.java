package org.techtown.samplelayoutinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MenuActivity extends AppCompatActivity {
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        container = findViewById(R.id.container);

        //activity_menu에 있는 button2
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                LayoutInflater inflater = (LayoutInflater)
                        getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                /*inflater 기능 사용을 위해서 LayoutInflater의 getSystemService(Context.LAYOUT_INFLATER_SERVICE)
                  를이용해 inflater 객체를 생성한 뒤 사용
                  ex) inflater.inflate ->inflater객체의 inflate 메서드 인자로는(resource,root,attachToRoot) 3 가지
                  resource -> View를 만들고 싶은 레이아웃 파일의 id  ex) R.layout.exam
                  root     -> attachToRoot가 True일 경우 생성된 View가 추가될 부모 뷰를 가리킴
                  attachToRoot -> true 일 경우 생성될 View를 root에 추가
                */
                inflater.inflate(R.layout.sub1, container, true);
                CheckBox checkBox = container.findViewById(R.id.checkBox);
                checkBox.setText("로딩되었습니다.");
            }
        });
    }
}