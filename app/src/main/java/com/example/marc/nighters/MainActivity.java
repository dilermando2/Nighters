package com.example.marc.nighters;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText login;
    EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        login = (EditText)findViewById(R.id.editText6);
        senha = (EditText)findViewById(R.id.editText7);
    }

    public void HomePage(View view) {


        //Intent secondActivity = new Intent(this, HomePage.class);
        //startActivity(secondActivity);
    }

    public Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg){
            super.handleMessage(msg);

            float valida = msg.getData().getFloat("auth");
            if(valida == 1){
                //silence is golden
            }else{
                //silence is golden
            }

        }
    };

}