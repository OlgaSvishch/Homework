package com.example.user.dz13;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        Button button = (Button) findViewById(R.id.button);

        Resources resources = getResources();

        String textview1 = resources.getString(R.string.TextView1);
        textView1.setText(textview1);

        textView2.setText("TextView2");

        View.OnClickListener slushatBut = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText("Нажата кнопка");
            }
        };

        button.setOnClickListener(slushatBut);
    }

}
