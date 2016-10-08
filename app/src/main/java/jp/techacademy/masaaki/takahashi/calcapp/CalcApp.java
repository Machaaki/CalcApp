package jp.techacademy.masaaki.takahashi.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

public class CalcApp extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText01;
    EditText mEditText02;
    Button button01;
    Button button02;
    Button button03;
    Button button04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_app);

        //ボタン取得
        Button button01 = (Button) findViewById(R.id.button01);
        Button button02 = (Button) findViewById(R.id.button02);
        Button button03 = (Button) findViewById(R.id.button03);
        Button button04 = (Button) findViewById(R.id.button04);

        //リスナー登録
        button01.setOnClickListener(this);
        button02.setOnClickListener(this);
        button03.setOnClickListener(this);
        button04.setOnClickListener(this);

        //エディットの取得
        mEditText01 = (EditText) findViewById(R.id.editText01);
        mEditText01.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        mEditText02 = (EditText) findViewById(R.id.editText02);
        mEditText02.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);

    }

    @Override
        public void onClick(View v) {
            Intent intent = new Intent(this, SecondActivity.class);
            button01 = (Button) findViewById( R.id.button01 );
            button02 = (Button) findViewById( R.id.button02 );
            button03 = (Button) findViewById( R.id.button03 );
            button04 = (Button) findViewById( R.id.button04 );


        if (mEditText01.getText().toString().equals("")){
            Toast.makeText(this, "数字が未入力です", Toast.LENGTH_SHORT).show(); return;
        }
        if (mEditText02.getText().toString().equals("")){
            Toast.makeText(this, "数字が未入力です", Toast.LENGTH_SHORT).show(); return;
        }
            if (v.getId()==R.id.button01) {
                double a = Double.valueOf(mEditText01.getText().toString());
                double b = Double.valueOf(mEditText02.getText().toString());
                double c = a + b;
                intent.putExtra("value", c);
                startActivity(intent);
            }

        
            if (v.getId()==R.id.button02) {
                double a = Double.valueOf(mEditText01.getText().toString());
                double b = Double.valueOf(mEditText02.getText().toString());
                double c = a - b;
                intent.putExtra("value", c);
                startActivity(intent);
            }
            if (v.getId()==R.id.button03) {
                double a = Double.valueOf(mEditText01.getText().toString());
                double b = Double.valueOf(mEditText02.getText().toString());
                double c = a * b;
                intent.putExtra("value", c);
                startActivity(intent);
            }
            if (v.getId()==R.id.button04) {
                double a = Double.valueOf(mEditText01.getText().toString());
                double b = Double.valueOf(mEditText02.getText().toString());
                double c = a / b;
                intent.putExtra("value", c);
                startActivity(intent);
            }

            }
    }


