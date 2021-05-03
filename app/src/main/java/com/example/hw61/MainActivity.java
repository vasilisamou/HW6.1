package com.example.hw61;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= findViewById(R.id.button );
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog= new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialog ) ;

                EditText editText1= dialog.findViewById(R.id.editText_1);
                EditText editText2= dialog.findViewById(R.id.editText_2);
                Button btn_dialog= dialog.findViewById(R.id.btn_dialog );
                btn_dialog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String myText= editText1.getText().toString()+" "+editText2.getText().toString();
                        Toast.makeText(MainActivity.this, myText, Toast.LENGTH_LONG).show();
                        dialog.cancel();
                    }
                });

                dialog.show();

            }
        });
    }
}