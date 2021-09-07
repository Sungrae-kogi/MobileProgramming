package org.techtown.samplecallintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               String data = editText.getData().toString(); //toString을 쓰는 이유는 getData()로 가져온 형식이 다른 형이라서 변환을 하기위함

               Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
           }
        });

        findViewById(R.id.cmd_send).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                Bundle bundle = new Bundle();
                bundle.putString(BundleKey.SHARE_NAME, "parkho");
                bundle.putInt(BundleKey.SHARE_NUMBER, 100);
                bundle.putBoolean(BundleKey.SHARE_BUNDLE, true);

                Intent intent = new Intent();
                intent.setComponent(new ComponentName("org.techtown.samplecallintent","org.techtown.samplecallintent.MenuActivity"));
                intent.putExtra("Bundle",bundle);
            }
        });
    }


}