package com.igorlemosvicente.galinaciazinhatingidazinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textChick;
    Button buttonSpawnChick;
    int sumChicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciando
        textChick = findViewById(R.id.textChick);
        buttonSpawnChick = findViewById(R.id.buttonSpawnChick);

        buttonSpawnChick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textChick.setText("Você já conseguiu " + (++sumChicks) + " pintos.");
            }
        });
    }
}
