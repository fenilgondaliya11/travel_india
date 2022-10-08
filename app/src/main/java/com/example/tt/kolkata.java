package com.example.tt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kolkata extends AppCompatActivity {
    Button explore, button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolkata);
        explore = findViewById(R.id.button);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                golink("https://www.google.com/maps/place/Kolkata,+West+Bengal/@22.6759958,88.3297288,10z/data=!3m1!4b1!4m5!3m4!1s0x39f882db4908f667:0x43e330e68f6c2cbc!8m2!3d22.572646!4d88.363895");
            }
        });

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                golink("https://www.booking.com/city/in/agra.en.html?aid=1610687;label=agra-UgfdytvMtspXvSaeYMhL*QS541122358284:pl:ta:p1:p2:ac:ap:neg:fi:tiaud-1110454565467:kwd-1110005709:lp1007759:li:dec:dm:ppccp=UmFuZG9tSVYkc2RlIyh9YfpWGnRw6lOGgfEoJVv7zYo;ws=&gclid=Cj0KCQjwnP-ZBhDiARIsAH3FSReHcd0oyCFjw5sYcDiT8OqniIhPWpKu28uXI94nV4yjhshH7MpPn1saApY5EALw_wcB");
            }
        });

    }

    private void golink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}



