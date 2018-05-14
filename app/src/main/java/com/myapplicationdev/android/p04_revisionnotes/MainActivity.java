package com.myapplicationdev.android.p04_revisionnotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etInput;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    RadioButton rb5;
    Button insertBtn;
    Button showBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput = (EditText)this.findViewById(R.id.editTextNote);

        rb1 = (RadioButton)this.findViewById(R.id.radio1);
        rb2 = (RadioButton)this.findViewById(R.id.radio2);
        rb3 = (RadioButton)this.findViewById(R.id.radio3);
        rb4 = (RadioButton)this.findViewById(R.id.radio4);
        rb5 = (RadioButton)this.findViewById(R.id.radio5);

        insertBtn = (Button)this.findViewById(R.id.buttonInsertNote);
        showBtn = (Button)this.findViewById(R.id.buttonShowList);

        insertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInput.getText();
                String noteInput = etInput.getText().toString();

                DBHelper db = new DBHelper(MainActivity.this);
                if (rb1.isActivated()) {
                    db.insertNote(noteInput, 1);
                }
                else if(rb2.isActivated()){
                    db.insertNote(noteInput, 2);
                }
                else if(rb3.isActivated()){
                    db.insertNote(noteInput, 3);
                }
                else if(rb4.isActivated()){
                    db.insertNote(noteInput, 4);
                }
                else{
                    db.insertNote(noteInput, 5);

                }
            }
        });



    }
}
