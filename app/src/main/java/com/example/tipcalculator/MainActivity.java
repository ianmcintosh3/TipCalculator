package com.example.tipcalculator;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tip15();
        tip18();
        tip20();
        tip25();
    }

    private void tip15(){
        Button button15 = findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText billAmount = findViewById(R.id.amount);
                TextView total = findViewById(R.id.tipTotal);
                String amountToDisplay = billAmount.getText().toString();
                double amount = Double.parseDouble(amountToDisplay);
                double tip = (amount * 0.15);
                Resources res = getResources();
                String displayString = res.getString(R.string.tip, tip);
                String displayString2 = res.getString(R.string.total,
                        ((amount + tip)));
                String result = displayString + "\n" + displayString2;
                total.setText(result);

            }

        });
    }
    private void tip18() {
        Button button18 = findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText billAmount = findViewById(R.id.amount);
                TextView total = findViewById(R.id.tipTotal);
                String amountToDisplay = billAmount.getText().toString();
                double amount = Double.parseDouble(amountToDisplay);
                double tip = amount * .18;
                Resources res = getResources();
                String displayString = res.getString(R.string.tip, tip);
                String displayString2 = res.getString(R.string.total,
                        ((amount + tip)));
                String result = displayString + "\n" + displayString2;
                total.setText(result);

            }
        });
    }
    private void tip20(){
       Button button20 = findViewById(R.id.button20);
       button20.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
           EditText billAmount = findViewById(R.id.amount);
           TextView total = findViewById(R.id.tipTotal);
           String amountToDisplay = billAmount.getText().toString();
           double amount = Double.parseDouble(amountToDisplay);
           double tip = amount * .20;
           Resources res = getResources();
           String displayString = res.getString(R.string.tip, tip);
           String displayString2 = res.getString(R.string.total, (amount + tip));
           String result = displayString + "\n" + displayString2;
           total.setText(result);

            }
            });
        }
    private void tip25(){
        Button button25 = findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText billAmount = findViewById(R.id.amount);
                TextView total = findViewById(R.id.tipTotal);
                String amountDisplay = billAmount.getText().toString();
                double amount = Double.parseDouble(amountDisplay);
                double tip = amount * .25;
                Resources res = getResources();
                String displayString = res.getString(R.string.tip, tip);
                String displayString2 = res.getString(R.string.total, (amount + tip));
                String result = displayString + "\n" + displayString2;
                total.setText(result);

            }
        });
    }
    }