package com.example.harsh.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ToastDemo extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_demo);

        findViewById(R.id.btnShowToast).setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnShowToast:
                showToast();
                break;
        }

    }

    private void showToast(){
        int toastDuration;
        RadioButton rbShort = findViewById(R.id.radioButton);
        if(rbShort.isChecked()){
            toastDuration = Toast.LENGTH_SHORT;
        }else{
            toastDuration = Toast.LENGTH_LONG;
        }

        Toast toast = Toast.makeText(this, "This is a demo toast", toastDuration);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
}
