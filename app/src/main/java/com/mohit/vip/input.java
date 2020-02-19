package com.mohit.vip;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class input extends AppCompatActivity {

    ResponseAdapter res;
    Button b1,b2;
    RecyclerView resRCV;
    ArrayList<in> iList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        b1 = (Button)findViewById(R.id.wapas);
        b2 = (Button)findViewById(R.id.submit);

        iList = new ArrayList<in>();
        in gf = (in) getIntent().getSerializableExtra("resp");
        iList.add(gf);
        res = new ResponseAdapter(this, iList);
        resRCV = (RecyclerView) findViewById(R.id.recycler);
        resRCV.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        resRCV.setAdapter(res);
        res.notifyDataSetChanged();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(input.this,form.class);
                startActivity(i);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent j = new Intent(input.this,SuccessSpalsh.class);
                startActivity(j);

            }
        });

    }

}
