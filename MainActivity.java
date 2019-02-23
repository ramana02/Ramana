package com.example.ramana;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    EditText e3,e4,e5,e6,e7,e8;
    EditText e9,e10,e11,e12,e13,e14,e15;
    EditText e16,e17,e18,e19,e20;
    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);
        e5=(EditText)findViewById(R.id.editText5);
        e6=(EditText)findViewById(R.id.editText6);
        e7=(EditText)findViewById(R.id.editText7);
        e8=(EditText)findViewById(R.id.editText8);
        e9=(EditText)findViewById(R.id.editText9);
        e10=(EditText)findViewById(R.id.editText10);
        e11=(EditText)findViewById(R.id.editText11);
        e12=(EditText)findViewById(R.id.editText12);
        e13=(EditText)findViewById(R.id.editText13);
        e14=(EditText)findViewById(R.id.editText14);
        e15=(EditText)findViewById(R.id.editText15);
        e16=(EditText)findViewById(R.id.editText16);
        e17=(EditText)findViewById(R.id.editText17);
        e18=(EditText)findViewById(R.id.editText18);
        e19=(EditText)findViewById(R.id.editText19);
        e20=(EditText)findViewById(R.id.editText20);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);


        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double m = Double.parseDouble(e3.getText().toString());
                double in = m * 39.37;
                double f = m * 3.280;
                double y = m * 1.094;
                double mi = m / 1609.344;
                double nm = m / 1852;
                e3.setText("" + m);
                e4.setText("" + in);
                e5.setText("" + f);
                e6.setText("" + y);
                e7.setText("" + mi);
                e8.setText("" + nm);

            }
        });







        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e3.setText("" );
                e4.setText("" );
                e5.setText("" );
                e6.setText("" );
                e7.setText("");
                e8.setText("");

            }
        });




        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double k =Double.parseDouble(e9.getText().toString());
                double o= k*35.274;
                double p= k*2.205;
                double tp= k*2.67;
                double s= k/6.35;
                double st= k/907.185;
                double lt= k/1016.047;
                e9.setText(""+k);
                e10.setText(""+o);
                e11.setText(""+p);
                e12.setText(""+tp);
                e13.setText(""+s);
                e14.setText(""+st);
                e15.setText(""+lt);
            }
        });





        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e9.setText("" );
                e10.setText("" );
                e11.setText("" );
                e12.setText("" );
                e13.setText("");
                e14.setText("");
                e15.setText("");

            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double li =Double.parseDouble(e16.getText().toString());
                double fo= li*33.814;
                double q= li*1.057;
                double g= li/3.785;
                double ig= li/4.546;
                e16.setText(""+li);
                e17.setText(""+fo);
                e18.setText(""+q);
                e19.setText(""+g);
                e20.setText(""+ig);
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e16.setText("" );
                e17.setText("" );
                e18.setText("" );
                e19.setText("" );
                e20.setText("");


            }
        });





    }


    }




