package com.shipon.anusolislam;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.buttonID);
        textView = findViewById(R.id.textViewID);
        //button.setOnClickListener(this);
        button.setOnClickListener(v -> {



            DatePicker datePicker = new DatePicker(this);
            int currentDate = datePicker.getDayOfMonth();
            int currentMonth = (datePicker.getMonth()) + 1;
            int currentYear = datePicker.getYear();
            datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                            textView.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                        }
                    }, currentYear, currentMonth, currentDate);
           // datePickerDialog.show();

            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
          //  intent.putExtra("key"," Shipon sarker sagor life is not sohoj");
            startActivityForResult(intent,1);
         


        });
    }//-  oncreate end method -----------------

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==1){
            String value = data.getStringExtra("name");
            textView.setText(value);

        }

    }
}//-----------   public class -----------------------