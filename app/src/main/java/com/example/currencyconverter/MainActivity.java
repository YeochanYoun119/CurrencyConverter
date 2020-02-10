package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        String str = myTextField.getText().toString();
/*        int a = Integer.parseInt(str);
        a *= 0.77;*/
        goToActivity2(str);
    }

    public void goToActivity2(String a){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", a);
        startActivity(intent);
    }
}
