package com.joonheelee.dr_friend;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
    }

    public void warning(View V){
        Toast.makeText(Profile.this, "데모 버전 : 수정 불가", Toast.LENGTH_SHORT).show();
    }

}
