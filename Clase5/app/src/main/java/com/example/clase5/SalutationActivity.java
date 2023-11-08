package com.example.clase5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SalutationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salutation);
        String salutation = getIntent().getExtras().getString("salutation");
        TextView out = (TextView) findViewById(R.id.out);
        out.setText(salutation);

        Button regresar = (Button) findViewById(R.id.regresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regresarIntent = new Intent(SalutationActivity.this, MainActivity.class);
                startActivity(regresarIntent);
            }
        });
    }
}
