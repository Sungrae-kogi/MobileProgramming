package org.techtown.sampleorientation2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            showToast("방향 : ORIENTATION_LANDSCAPE");    //가로 방향으로 전환할 때의 처리
        }
        else if (newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            showToast("방향 : ORIENTATION_PORTRAIT");     //세로 방향으로 전환할 때의 처리
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        showToast("onStart() 실행");
    }

    @Override
    protected void onStop() {
        super.onStop();

        showToast("onStop() 실행");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        showToast("onDestroy() 실행");
    }

    public void showToast(String data){
        Toast.makeText(this,data, Toast.LENGTH_LONG).show();
    }
}