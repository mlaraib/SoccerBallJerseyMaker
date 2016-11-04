package com.sofittech.soccerballjerseymaker;

import android.content.Intent;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button next;
    EditText number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name= (EditText) findViewById(R.id.username);
        number= (EditText) findViewById(R.id.shirtnumber);



//Test 1
//        name.setOnKeyListener(new View.OnKeyListener() {
//
//            @Override
//            public boolean onKey(View v , int keyCode , KeyEvent event) {
//
//                EditText number = (EditText) findViewById(R.id.shirtnumber);
//
//                // TODO Auto-generated method stub
//                if (keyCode == event.KEYCODE_ENTER) {
//
//                    Selection.setSelection((Editable) number.getText(), name.getSelectionStart());
//                    number.requestFocus();
//                }
//
//                return true;
//            }
//        });




        name.setOnKeyListener(new View.OnKeyListener() {

            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER))
                {
                    // Perform action on Enter key press
                    name.clearFocus();
                    number.requestFocus();
                    return true;
                }
                return false;
            }
        });

        number.setOnKeyListener(new View.OnKeyListener() {

            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER))
                {
                    // Perform action on Enter key press
                    // check for username - password correctness here
                    return true;
                }
                return false;
            }
        });


        next= (Button) findViewById(R.id.btnNext);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (MainActivity.this.name.getText().toString().equals(BuildConfig.FLAVOR) || MainActivity.this.number.getText().toString().equals(BuildConfig.FLAVOR)) {
                    Toast.makeText(MainActivity.this, "Please fill both fields", Toast.LENGTH_SHORT).show();
                    return;
                }else
                {
                    Intent myintent = new Intent(MainActivity.this, DashbordActivity.class);
                    myintent.putExtra("name", MainActivity.this.name.getText().toString());
                    myintent.putExtra("number", MainActivity.this.number.getText().toString());
                    MainActivity.this.startActivity(myintent);
                }
            }
        });


    }
}
