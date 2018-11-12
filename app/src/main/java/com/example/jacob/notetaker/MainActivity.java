package com.example.jacob.notetaker;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Long> notes;
    private Context context;
    private LinearLayout listLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notes = new ArrayList<>();
        context = this;
        listLayout = findViewById(R.id.list_layout);



        findViewById(R.id.add_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notes.add(System.currentTimeMillis());
                listLayout.addView(getDefaultTextView(notes.get(notes.size()-1).toString()));
                Log.i(getLocalClassName(),notes.toString());
            }
        });
    }

    private TextView getDefaultTextView(String text) {

/*                    <TextView
        android:text="My Favorite Note"
        android:textSize="24sp"
        android:padding="10dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />*/


        TextView textView = new TextView((context));
        textView.setTextSize(24);
        textView.setPadding(10,10,10,10);
        textView.setText(text);
        return textView;

    }

}
