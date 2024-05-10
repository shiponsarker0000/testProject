package com.shipon.anusolislam;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.sql.Time;

public class MainActivity2 extends AppCompatActivity {
    TimePicker timePickerID;
    Button buttonID;
    TextView textViewID;
    TimePickerDialog timePickerDialog;

    EditText editText;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        timePickerID = findViewById(R.id.timePickerID);
        timePickerID.setIs24HourView(true);
        buttonID = findViewById(R.id.buttonID);
        textViewID = findViewById(R.id.textViewID);
        textViewID = findViewById(R.id.textViewID);
        editText = findViewById(R.id.editTextID);
        button2 = findViewById(R.id.button2ID);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = editText.getText().toString();
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                    intent.putExtra("name",value);
                    setResult(1,intent);
                    finish();







            }
        });








        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
          String string =  bundle.getString("key");
          textViewID.setText(""+string);
        }

        buttonID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                String time = timePickerID.getCurrentHour()+":"+timePickerID.getCurrentMinute();
//                textViewID.setText(time);
                TimePicker timePicker = new TimePicker(MainActivity2.this);
                int currentHour = timePicker.getCurrentHour();
                int currentMinite = timePicker.getCurrentMinute();

                timePickerDialog = new TimePickerDialog(MainActivity2.this,

                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                                textViewID.setText(hourOfDay+":"+minute);

                            }
                        },currentHour,currentMinite,true);

                timePickerDialog.show();



            }
        });



    }//================== ---------------










}