package com.example.user.sampleactivities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //일단 선언만, onCreate에서 생성하여 사용
    //여기서 Button 할당할 수도 있지만 정적임
    Button btn;
    EditText inputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //호출 테스트
        Toast.makeText(MainActivity.this,"Main의 onCreate() 호출", Toast.LENGTH_LONG).show();

        inputTextView = (EditText)findViewById(R.id.inputText);


        btn = (Button)findViewById(R.id.naverBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //네이버 웹 브라우저 띄우기
                //ACTION_VIEW: Intent 의 상수, 보여주겠다
                //URI: URL을 포함하는 큰 개념
                //parse : 내가 준 스트링을 실제 uri로 변환한다
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(intent);
            }
        });
        btn = (Button) findViewById(R.id.nextBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = inputTextView.getText().toString();

                //버튼 클릭시 다음 액티비티로 이동
                //Intent 생성!
                Intent intent = new Intent(MainActivity.this, NextActivity.class);

                //intent 생성 후 데이터를 싣는다
                intent.putExtra("짐1",message);


                //이 함수를 호출해야 intent의 값을 기반으로 액티비티 이동
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "Main의 onStart() 호출", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "Main의 onResume() 호출", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this,"Main의 onRestart() 호출", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "Main의 onPause() 호출", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this,"Main의 onStop() 호출", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "Main의 onDestroy() 호출", Toast.LENGTH_LONG).show();
    }


}