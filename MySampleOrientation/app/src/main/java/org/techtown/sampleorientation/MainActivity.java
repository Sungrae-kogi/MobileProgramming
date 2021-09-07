package org.techtown.sampleorientation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {    //실행될때 savedInstanceState가 인자로 전달됨
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate 호출됨.");

        editText = findViewById(R.id.editTextTextPersonName);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //사용자가 editText에다가 입력한것을 .getText().toString()이용해서 가져와 대입
                name = editText.getText().toString();
                showToast("입력된 값을 변수에 저장했습니다 : "+name);
            }
        });

        //이전에 저장되있던savedInstanceState 값이 null이 아니라면 즉, 존재한다면
        if (savedInstanceState != null){
            name = savedInstanceState.getString("name");
            showToast("값을 복원했습니다 :"+name);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        showToast("onStart 호출됨.");
    }

    @Override
    protected void onStop() {
        super.onStop();

        showToast("onStop 호출됨.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        showToast("onDestroy 호출됨.");
    }

    public void showToast(String data){
        Toast.makeText(this,data,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putString("name",name);
    }
}