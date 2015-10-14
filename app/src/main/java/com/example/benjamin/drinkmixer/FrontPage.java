package com.example.benjamin.drinkmixer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FrontPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        final Button drink1 = (Button) findViewById(R.id.drink1);
        drink1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent drink1intent = new Intent(FrontPage.this, drink1.class);
                startActivity(drink1intent);
            }
        });

        final Button drink2 = (Button) findViewById(R.id.drink2);
        drink2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent drink2intent = new Intent(FrontPage.this, drink2.class);
                startActivity(drink2intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_front_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
