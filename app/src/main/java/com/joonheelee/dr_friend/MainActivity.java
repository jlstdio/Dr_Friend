package com.joonheelee.dr_friend;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.joonheelee.dr_friend.workout.Bike;
import com.joonheelee.dr_friend.workout.Treadmill;
import com.joonheelee.dr_friend.workout.Walking;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    TextView weight;
    TextView height;
    TextView fat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = (TextView)findViewById(R.id.weight);
        height = (TextView)findViewById(R.id.height);
        fat = (TextView)findViewById(R.id.fat);

        weight.setText("70kg");
        height.setText("176cm");
        fat.setText("20%");


    }

    public void login(View V){
        startActivity(new Intent(this, Login.class));
    }

    public void walking(View V){
        startActivity(new Intent(this, Walking.class));
    }

    public void treadmill(View V){
        startActivity(new Intent(this, Treadmill.class));
    }

    public void bike(View V){ startActivity(new Intent(this, Bike.class)); }

    public void profile(View V){ startActivity(new Intent(this, Profile.class)); }
}
