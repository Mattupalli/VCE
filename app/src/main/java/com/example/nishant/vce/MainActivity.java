package com.example.nishant.vce;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button b1,b2;


    public void init()
    {
        b1= (Button)findViewById(R.id.button);
        b2= (Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,NextActivity.class);
                startActivity(i);



            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i2 = new Intent(MainActivity.this,faculty_login.class);
                startActivity(i2);
            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
