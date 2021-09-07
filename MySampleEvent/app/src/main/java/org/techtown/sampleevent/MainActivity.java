package org.techtown.sampleevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    GestureDetector detector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        View view = findViewById(R.id.view);

        //파라미터로 OnTouchListener 객체를 전달하는데 전달 과정에서 , new 연산자를 이용해서
        //객체를 생성하면서 전달
        view.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent){
                int action = motionEvent.getAction();

                float curX = motionEvent.getX();
                float curY = motionEvent.getY();

                if(action == MotionEvent.ACTION_DOWN){
                    println("손가락 눌림 :"+curX+", "+curY);
                }else if(action == MotionEvent.ACTION_MOVE){
                    println("손가락 움직임 :"+curX+", "+curY);
                }else if(action == MotionEvent.ACTION_UP){
                    println("손가락 뗌 :"+curX+", "+curY);
                }
                return true;
            }
        });

        detector = new GestureDetector(this, new GestureDetector.OnGestureListener(){

            @Override
            public boolean onDown(MotionEvent motionEvent){
                println("onDown() 호출됨.");
                return true;
            }

            @Override
            public void onShowPress(MotionEvent motionEvent){
                println("onShowPress() 호출됨.");
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent){
                println("onSingleTapUp() 호출됨.");
                return true;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1,
                                    float v, float v1){
                println("onScroll() 호출됨: "+v+", "+v1);
                return true;
            }

            @Override
            public void onLongPress(MotionEvent motionEvent){
                println("onLongPress() 호출됨.");
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1,
                                   float v, float v1){
                println("onFling() 호출됨: "+v+", "+v1);

                return true;
            }
        });

        View view2 = findViewById(R.id.view2);

        view2.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent){
                detector.onTouchEvent(motionEvent);
                return true;
            }
        });

    }

    public void println(String data){
        textView.append(data+"\n");
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            Toast.makeText(this,"시스템 [BACK] 버튼이 눌렸습니다.",
                    Toast.LENGTH_LONG).show();

            return true;
        }
        return false;
    }
}