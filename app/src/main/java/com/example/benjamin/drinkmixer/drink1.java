package com.example.benjamin.drinkmixer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class drink1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink1);

        final Button rum_make = (Button) findViewById(R.id.rum_make);
        rum_make.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent make1intent = new Intent(drink1.this, make_drink1.class);
                startActivity(make1intent);
            }
        });
    }
public void rum_make(View view) {
    Intent rumintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.1.7:8000"));
    startActivity(rumintent);
}
}
