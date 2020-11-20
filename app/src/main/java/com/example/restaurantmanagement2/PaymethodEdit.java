package com.example.restaurantmanagement2;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import javax.xml.datatype.Duration;

public class PaymethodEdit extends AppCompatActivity {

    Button btn_kakao,btn_naver,btn_card,btn_direct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paymethodedit);

        btn_kakao = (Button)findViewById(R.id.btn_kakao);
        btn_naver = (Button)findViewById(R.id.btn_naver);
        btn_card = (Button)findViewById(R.id.btn_card);
        btn_direct = (Button)findViewById(R.id.btn_direct);

        btn_kakao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"변경되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
