package com.example.tt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class newdelhi extends AppCompatActivity {
    Button explore, button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newdelhi);

        explore = findViewById(R.id.button);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                golink("https://www.google.com/maps/place/New+Delhi,+Delhi/data=!4m2!3m1!1s0x390cfd5b347eb62d:0x52c2b7494e204dce?utm_source=mstt_1&entry=gps&g_ep=CAESBzExLjMwLjMYACD___________8BKgA%3D");
            }
        });

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                golink("https://www.booking.com/city/in/new-delhi.html?label=in-new-delhi-yP3M7eShHSkgiSR8ab4QigS541200135265%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-299694789053%3Alp1007759%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YfpWGnRw6lOGgfEoJVv7zYo;gclid=Cj0KCQjwnP-ZBhDiARIsAH3FSRcqBFFWZXFKb9zUz0Ua_X9vgs-0CpZYDGnMptQjOcdpHir1MjV8Sv0aAvzfEALw_wcB;ws=;aid=1610687");
            }
        });


    }

    private void golink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}



