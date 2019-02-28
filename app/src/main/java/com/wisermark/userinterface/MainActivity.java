package com.wisermark.userinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int quantity =0;
    TextView quantityTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quantityTV =findViewById(R.id.quantity_text_view);
    }

    public void increase(View view){
        quantity++;
        quantityTV.setText("" + quantity);
    }
}
