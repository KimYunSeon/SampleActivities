package com.example.user.sampleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class NextActivity extends AppCompatActivity {

    Button finishBtn;

    TextView outputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        //Toast.makeText(NextActivity.this,"Next의 onCreate() 호출", Toast.LENGTH_LONG).show();

        Intent receiveIntent = getIntent();
        String message = receiveIntent.getStringExtra("짐1");

        outputTextView = (TextView)findViewById(R.id.outputView);

        outputTextView.setText(message);

        finishBtn = (Button) findViewById(R.id.finishBtn);

        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //액티비티를 종료
                finish();
            }
        });
    }



    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(NextActivity.this, "Next의 onStart() 호출", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(NextActivity.this, "Next의 onResume() 호출", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(NextActivity.this,"Next의 onRestart() 호출", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(NextActivity.this, "Next의 onPause() 호출", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(NextActivity.this,"Next의 onStop() 호출", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(NextActivity.this, "Next의 onDestroy() 호출", Toast.LENGTH_LONG).show();
    }

}
