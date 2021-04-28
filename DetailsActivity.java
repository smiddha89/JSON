package com.example.pc.json_employeedetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView tv1,tv2, tv3, tv4, tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tv1 = (TextView)findViewById(R.id.tvID);
        tv2 = (TextView)findViewById(R.id.tvName);
        tv3 = (TextView)findViewById(R.id.tvDesig);
        tv4 = (TextView)findViewById(R.id.tvSalary);
        tv5 = (TextView)findViewById(R.id.tvHobies);

        Employee em = (Employee) getIntent().getExtras().get("emp");

        int id = em.getId();

        String name = em.getName();

        double salary = em.getSalary();

        String designation = em.getDesignation();

        String[] hobbies = em.getHobies();

        tv1.setText(String.valueOf(id));

        tv2.setText(name);

        tv3.setText(String.valueOf(salary));

        tv4.setText(designation);

        tv5.setText("");

        for(int i=0;i<hobbies.length;i++)
        {
            tv5.append(hobbies[i] +"\n");
        }
    }
}