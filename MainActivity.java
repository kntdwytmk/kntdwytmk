package net.kntdwytmk.formapss;


import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextInputEditText textNama = (TextInputEditText)findViewById(R.id.textNama);
        final TextInputEditText textEmail = (TextInputEditText)findViewById(R.id.textEmail);
        final TextInputEditText textPhone = (TextInputEditText)findViewById(R.id.textPhone);
        final TextInputEditText textPassword = (TextInputEditText)findViewById(R.id.textPassword);


        Button btnSave = (Button)findViewById(R.id.button);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(getPackageName()+" Nama", textNama.getText().toString());
                Log.d(getPackageName()+" Email", textEmail.getText().toString());
                Log.d(getPackageName()+" Phone", textPhone.getText().toString());
                Log.d(getPackageName()+" Password", textPassword.getText().toString());
            }
        });


    }
}