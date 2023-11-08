package com.example.clase5;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button greetButton = (Button) findViewById(R.id.greet);

        CheckBox showTimeCheckBox = (CheckBox) findViewById(R.id.dateCheckbox);

        greetButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                EditText entryEditText = (EditText) findViewById(R.id.entry);
                String enteredValue = entryEditText.getText().toString().trim();
                if ("".equals(enteredValue)) {
                    //showAlertDialog();
                    showToast();
                    return;
                }

                String salutation = "HOLA ";

                RadioGroup greetingType = (RadioGroup) findViewById(R.id.greetingRadioGroup);
                if (R.id.rdsr == greetingType.getCheckedRadioButtonId()) {
                    salutation = salutation + "SR. ";
                }
                if (R.id.rdsra == greetingType.getCheckedRadioButtonId()) {
                    salutation = salutation + "SRA. ";
                }
                salutation = salutation + enteredValue + " ";

                if (showTimeCheckBox.isChecked()) {
                    DatePicker date = (DatePicker) findViewById(R.id.datePicker);
                    salutation = salutation + date.getDayOfMonth() + "/" + (date.getMonth() + 1) + "/" + date.getYear();

                    TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker);
                    salutation = salutation + " " + timePicker.getHour() + ":" + timePicker.getMinute();
                }

                //Para mostrar en la misma pantalla
                /*TextView out = (TextView) findViewById(R.id.out);
                out.setText(salutation);*/


                Intent intent = new Intent(MainActivity.this, SalutationActivity.class);
                intent.putExtra("salutation", salutation);
                startActivity(intent);
            }
        });

        showTimeCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                int visibility = b ? View.VISIBLE : View.GONE;
                View view = findViewById(R.id.datePicker);
                view.setVisibility(visibility);
                view = findViewById(R.id.timePicker);
                view.setVisibility(visibility);
            }
        });
    }

    private void showToast() {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "No se coloco el nombre";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    private void showAlertDialog() {
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setMessage("No ingreso un nombre");
        alert.setPositiveButton("OK", null);
        alert.show();
    }


}