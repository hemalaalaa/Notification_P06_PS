package com.example.a16022706.notification_p06_ps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {

    EditText etName;
    EditText etDesc;
    Button addTaskBtn;
    Button cancel;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        etName = (EditText) this.findViewById(R.id.editTextName);
        etDesc = (EditText) this.findViewById(R.id.editTextDesc);
        addTaskBtn = (Button) this.findViewById(R.id.btnAdd);
        cancel = (Button) this.findViewById(R.id.btnCancel);

        addTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etName.getText().toString();
                String desc = etDesc.getText().toString();


            }


        });
    }


}
