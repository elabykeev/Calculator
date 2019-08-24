package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private lessonModel lesson1;

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] numberIds = new int[]{
                R.id.zero,
                R.id.one,
                R.id.two,
                R.id.three,
                R.id.four,
                R.id.five,
                R.id.six,
                R.id.seven,
                R.id.eight,
                R.id.nine
        };
        int[] actionsIds = new int[]{
                R.id.pius,
                R.id.minus,
                R.id.multiply,
                R.id.division,
        };

        text = findViewById(R.id.text);

        lesson1 = new lessonModel();

        View.OnClickListener numberButtonClicListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lesson1.onNumPressed(view.getId());
                text.setText(lesson1.getText());

            }
        };

        View.OnClickListener actionButtonOnclikListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lesson1.onActionPessed(view.getId());
                text.setText(lesson1.getText());

            }
        };

        for (int i = 0; i < numberIds.length; i++) {
            findViewById(numberIds[i]).setOnClickListener(numberButtonClicListener);

        }
        for (int i = 0; i < actionsIds.length; i++) {

            findViewById(actionsIds[i]).setOnClickListener(actionButtonOnclikListener);
        }
    }
}
