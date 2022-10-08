package com.example.tt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class agra extends AppCompatActivity {

    Button explore;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agra);

        explore = findViewById(R.id.button);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                golink("https://www.google.com/maps/place/Agra,+Uttar+Pradesh/@27.1761745,77.9800129,12z/data=!3m1!4b1!4m5!3m4!1s0x39740d857c2f41d9:0x784aef38a9523b42!8m2!3d27.1766701!4d78.0080745");
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                golink("https://www.booking.com/luxury/city/in/agra.en-gb.html?aid=1135788&label=agra-KeovIOyhiswSMcstGpnF7wS88962456156%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-1472163438%3Alp1007759%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YcX_GyndjDE1AGi2KmfjYHk&sid=e4d4225b27b9595a1b5ab54ff756a461&keep_landing=1&gclid=Cj0KCQjwnP-ZBhDiARIsAH3FSRepVqIMZPCPZsvftjkzNbebK7-hjERbaWSgXLZgJXz1l9UX0qJKxdwaArPSEALw_wcB&");
            }
        });
    }

    private void golink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
