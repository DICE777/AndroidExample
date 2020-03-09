package com.example.androidexample;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidexample.Service.MyService;

/*
 * Service : 안드로이드의 4대 컴포넌트 중 하나
 * 화면 없이 동작함
 * 보통 Activity 에서 호출되어 시작함
 *
 * 1. 사용할 Service (*.java)를 만든다
 * 2. AndroidManifest.xml 에 Service 를 등록한다.
 * 3. Service를 시작하도록 호출한다.
 * */

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        Button startButton = findViewById(R.id.button_start_service);
        Button finishButton = findViewById(R.id.button_finish_service);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 서비스 시작하기
                Log.d("test", "activity - service 시작 버튼 클릭");
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 제어권자
                        MyService.class); // 이동할 컴포넌트
                startService(intent); // 서비스 시작
            }
        });

        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("test", "activity - service 종료 버튼 클릭");
                Intent intent = new Intent(
                        getApplicationContext(),
                        MyService.class);
                stopService(intent);
            }
        });
    } // end of onCreate
} // end of class
