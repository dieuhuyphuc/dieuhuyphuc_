package com.huyphuc.dieuhuyphuc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText edName;
    EditText editText;
    EditText edEmal;
    Button btsend;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        edName = findViewById(R.id.edName);
        editText = findViewById(R.id.edtext);
        edEmal = findViewById(R.id.edEmail);
        btsend = findViewById(R.id.btSend);
        spinner = findViewById(R.id.spinner);

        btsend.setOnClickListener(this);

        String[] gripe = {"Male", "Female", "Unknown"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,
                gripe);
        this.spinner.setAdapter(adapter);

    }

    private void CheckAllFields() {
        if (edName.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Field Name cant not be null", Toast.LENGTH_LONG).show();

        }
        if (edEmal.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Field Emal cant not be null", Toast.LENGTH_LONG).show();

        }
        if (editText.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Field description cant not be null", Toast.LENGTH_LONG).show();


        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btSend:
                CheckAllFields();
        }
    }
}
