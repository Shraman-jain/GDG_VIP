package com.mohit.vip;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class form extends AppCompatActivity {

    SeekBar sb;
    Spinner spn;
    EditText nameEt,mobEt,emailEt,collegeEt,otherEt,linkEt,fbEt,gitEt,resumeEt,whyEt,shareEt,anyEt,refEt;
    RadioButton rb1,rb2,rb3;
    CheckBox roCB,desCB,marCB,wriCB,proCB,manCB,pyCB,jsCB,reactCB,angCB,hcCB,phpCB,njCB,sqlCB,cshCB,goCB,othCB,wdCB,appCB,sdCB,mlCB,bccCB,ccCB,doCB,qcCB,cpCB,pdCB,csCB,consentCB;
    TextView t;
    Button b1;
    int age = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        nameEt = (EditText)findViewById(R.id.nameet);
        mobEt = (EditText)findViewById(R.id.mobileet);
        emailEt = (EditText)findViewById(R.id.emailet);
        collegeEt = (EditText)findViewById(R.id.collegeet);
        otherEt = (EditText)findViewById(R.id.otheret);
        linkEt = (EditText)findViewById(R.id.linket);
        fbEt = (EditText)findViewById(R.id.fbet);
        gitEt = (EditText)findViewById(R.id.gitet);
        resumeEt = (EditText)findViewById(R.id.resumeet);
        whyEt = (EditText)findViewById(R.id.whyet);
        shareEt = (EditText)findViewById(R.id.shareet);
        anyEt = (EditText)findViewById(R.id.anyet);
        refEt = (EditText)findViewById(R.id.refet);
        rb1 = (RadioButton)findViewById(R.id.malerb);
        rb2 = (RadioButton)findViewById(R.id.femalerb);
        rb3 = (RadioButton)findViewById(R.id.otherrb);
        roCB = (CheckBox)findViewById(R.id.rocb);
        desCB = (CheckBox)findViewById(R.id.descb);
        marCB = (CheckBox)findViewById(R.id.marcb);
        wriCB = (CheckBox)findViewById(R.id.wricb);
        proCB = (CheckBox)findViewById(R.id.procb);
        manCB = (CheckBox)findViewById(R.id.mancb);
        pyCB = (CheckBox)findViewById(R.id.pycb);
        jsCB = (CheckBox)findViewById(R.id.jscb);
        reactCB = (CheckBox)findViewById(R.id.reactcb);
        angCB = (CheckBox)findViewById(R.id.angcb);
        hcCB = (CheckBox)findViewById(R.id.hccb);
        phpCB = (CheckBox)findViewById(R.id.phpcb);
        njCB = (CheckBox)findViewById(R.id.njscb);
        sqlCB = (CheckBox)findViewById(R.id.sqlcb);
        cshCB = (CheckBox)findViewById(R.id.cshcb);
        goCB = (CheckBox)findViewById(R.id.gocb);
        othCB = (CheckBox)findViewById(R.id.othcb);
        wdCB = (CheckBox)findViewById(R.id.wdcb);
        appCB = (CheckBox)findViewById(R.id.appcb);
        sdCB = (CheckBox)findViewById(R.id.sdcb);
        mlCB = (CheckBox)findViewById(R.id.mlcb);
        bccCB = (CheckBox)findViewById(R.id.bcccb);
        ccCB = (CheckBox)findViewById(R.id.cccb);
        doCB = (CheckBox)findViewById(R.id.dopcb);
        qcCB = (CheckBox)findViewById(R.id.qccb);
        cpCB = (CheckBox)findViewById(R.id.cpcb);
        pdCB = (CheckBox)findViewById(R.id.pdcb);
        csCB = (CheckBox)findViewById(R.id.cscb);
        b1 = (Button)findViewById(R.id.submit);
        consentCB = (CheckBox)findViewById(R.id.consentcb);
        sb = (SeekBar)findViewById(R.id.agesb);
        t = (TextView)findViewById(R.id.displayage);
        spn = (Spinner)findViewById(R.id.yearspn);
        otherEt.setEnabled(false);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                int min = 1;
                if(i<min){

                    age=min;
                }else{

                    age = i;
                }
                t.setText(Integer.toString(age));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getItemAtPosition(i).equals("Select Year"))
                {

                }
                else {

                    String item = adapterView.getItemAtPosition(i).toString();

                    Toast.makeText(adapterView.getContext(),"Selected : "+item, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        othCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              otherEt.setEnabled(true);

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = nameEt.getText().toString();
                String mobile = mobEt.getText().toString();
                String email = emailEt.getText().toString();
                String gender = null;
                if(rb1.isChecked()){ gender = "Male";}
                if(rb2.isChecked()){ gender = "Female";}
                if(rb3.isChecked()){ gender = "Other";}
                int age = sb.getProgress();
                String college = collegeEt.getText().toString();
                String year = spn.getSelectedItem().toString();
                String area = "";
                if (roCB.isChecked()){ area = area + "Reaching Out (Companies / Colleges)" + "  " ;}
                if (desCB.isChecked()){ area = area + "Designing "+ "  ";}
                if (marCB.isChecked()){ area = area + "Marketing"+ "  ";}
                if (wriCB.isChecked()){ area = area + "Writing" + "  ";}
                if (proCB.isChecked()){ area = area + "Programming" + "  ";}
                if (manCB.isChecked()){ area = area + "Management"+ "  ";}
                String tech = "";
                String othertech = otherEt.getText().toString();
                if (pyCB.isChecked()){ tech = tech + "Python"+ "  ";}
                if (jsCB.isChecked()){ tech = tech + "JavaScript"+ "  ";}
                if (reactCB.isChecked()){ tech = tech + "React"+ "  ";}
                if (angCB.isChecked()){ tech = tech + "Angular"+ "  ";}
                if (hcCB.isChecked()){ tech = tech + "HTML + CSS"+ "  ";}
                if (phpCB.isChecked()){ tech = tech + "PHP"+ "  ";}
                if (njCB.isChecked()){ tech = tech + "Node Js"+ "  ";}
                if (sqlCB.isChecked()){ tech = tech + "SQL / NoSQL"+ "  ";}
                if (cshCB.isChecked()){ tech = tech + "c#"+ "  ";}
                if (goCB.isChecked()){ tech = tech + "Go"+ "  ";}
                if (othCB.isChecked()){ tech = tech +  othertech + "  ";}
                String working = "";
                if (wdCB.isChecked()){ working = working + "Web Development"+ "  ";}
                if (appCB.isChecked()){ working = working + "App Development"+ "  ";}
                if (sdCB.isChecked()){ working = working + "Software Development"+ "  ";}
                if (mlCB.isChecked()){ working = working + "Data Science / ML / DL"+ "  ";}
                if (bccCB.isChecked()){ working = working + "Blockchain"+ "  ";}
                if (ccCB.isChecked()){ working = working + "Cloud Computing"+ "  ";}
                if (doCB.isChecked()){ working = working + "DevOpd"+ "  ";}
                if (qcCB.isChecked()){ working = working + "Quantum Computing"+ "  ";}
                if (cpCB.isChecked()){ working = working + "Competitive Programming"+ "  ";}
                if (pdCB.isChecked()){ working = working + "Product Development"+ "  ";}
                if (cshCB.isChecked()){ working = working + "Cyber Security"+ "  ";}
                String link = linkEt.getText().toString();
                String fb  = fbEt.getText().toString();
                String git = gitEt.getText().toString();
                String resume = resumeEt.getText().toString();
                String why = whyEt.getText().toString();
                String share = shareEt.getText().toString();
                String any = anyEt.getText().toString();
                String ref = refEt.getText().toString();

                in response = new in(name,mobile,email,gender,age,college,year,area,tech,working,link,fb,git,resume,why,share,any,ref);

                if (name.length()==0 || email.length()==0  || gender.length()==0 || college.length()==0 || area.length()==0 || tech.length()==0 || working.length()==0 || why.length()==0 || share.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Fill Mandatory Fields ! ", Toast.LENGTH_LONG).show();
                }else if (mobile.length()!=10)
                {
                    Toast.makeText(getApplicationContext(),"Mobile Number is of wrong length !", Toast.LENGTH_LONG).show();
                }
                else if (year == "Select Year")
                {
                    Toast.makeText(getApplicationContext(),"Please Select Year Of Study !", Toast.LENGTH_LONG).show();
                }
                else if (consentCB.isChecked() == false)
                {
                    Toast.makeText(getApplicationContext(),"Please Accept Terms and Conditions !", Toast.LENGTH_LONG).show();
                }
                else
                    {
                        Intent i = new Intent(form.this,input.class);
                        i.putExtra("resp",response);
                        startActivity(i);
                    }



            }
        });


    }

}
