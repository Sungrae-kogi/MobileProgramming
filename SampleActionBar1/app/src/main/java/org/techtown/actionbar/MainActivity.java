package org.techtown.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView)findViewById(R.id.textView);
    }

    //옵션 메뉴를 구성하기 위해 호출되는 메소드
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);

        return true;
    }

    //옵션메뉴를 선택하면 호출
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //사용자가 선택한 메뉴의 id값을 추출
        int id = item.getItemId();
        //id 값으로 분기한다.
        switch(id){
            case R.id.item1:
                text1.setText("1번 메뉴");
                break;
            case R.id.item2:
                text1.setText("2번 메뉴");
                break;
            case R.id.item3:
                text1.setText("3번 메뉴");
                break;
            case R.id.item4:
                text1.setText("4번 메뉴");
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}