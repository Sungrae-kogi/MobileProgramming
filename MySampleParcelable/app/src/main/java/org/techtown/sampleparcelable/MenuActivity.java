package org.techtown.sampleparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//MenuActivitiy에선 전달받은 activity를 처리할 코드가 필요함
public class MenuActivity extends AppCompatActivity {

    TextView textView;
    public static final String KEY_SIMPLE_DATA ="data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //인텐트객체를 우선 생성
                Intent intent = new Intent();
                intent.putExtra("name","mike");
                //호출한 액티비티에서 startActivityForResult로 호출했으므로, 종료시 requestCode와 함께, onActivityResult메소드가 호출
                //종료한 액티비티를 호출한 액티비티로 결과를 반환하기위함,
                setResult(RESULT_OK, intent);   //resultCode와 result Intent를 지정할 수 있음,

                finish();
            }
        });

        Intent intent = getIntent();
        processIntent(intent);
    }

    private void processIntent(Intent intent){
        //intent를 getIntent()메소드로 가져왔을때 그 값이 존재한다면,
        if (intent !=null){
            Bundle bundle = intent.getExtras();
            SimpleData data = bundle.getParcelable(KEY_SIMPLE_DATA);
            if(intent !=null){
                textView.setText("전달 받은 데이터\nNumber :"+data.number + "\nMessage : "+data.message);
            }
        }
    }
}