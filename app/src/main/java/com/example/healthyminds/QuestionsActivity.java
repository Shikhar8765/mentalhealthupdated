package com.example.healthyminds;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionsActivity extends AppCompatActivity {

    DatePicker datePicker;
    TextView textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        textView = (TextView) findViewById(R.id.tvdate);
        datePicker = (DatePicker) findViewById(R.id.date);
        button = (Button) findViewById(R.id.changeDate);

        textView.setText("Current date" + getCurrentDate());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("Current date" + getCurrentDate());

            }
        });
    }

    private String getCurrentDate() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((datePicker.getMonth()+1)+"/");
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append(datePicker.getYear());

        return stringBuilder.toString();


    }

    public void submitAnsView (View view){
        int score = answers();
        String total = String.valueOf(score);
        int tottal = Integer.valueOf(score);
        Toast.makeText(this, "Your score is: " + total ,  Toast.LENGTH_SHORT).show();

        if (tottal<5){
            Intent intent = new Intent(getApplicationContext(),MeditateActivity.class);
            startActivity(intent);
        }

        else if (tottal<2){
            Intent in = new Intent(getApplicationContext(),MemberActivity.class);
            startActivity(in);

        }
        else{
            Toast.makeText(this, "Dont worry be happy", Toast.LENGTH_SHORT).show();
        }
    }

    public int answers(){
        RadioGroup radioGroup;
        int points = 0;
        int ans1 = R.id.qn1;
        radioGroup = (RadioGroup) findViewById(R.id.groupOne);
        int value = radioGroup.getCheckedRadioButtonId();

        int ans2 = R.id.qn2;
        radioGroup = (RadioGroup) findViewById(R.id.grouTwo);
        int value2 = radioGroup.getCheckedRadioButtonId();

        int ans3 = R.id.qn3;
        radioGroup = (RadioGroup) findViewById(R.id.grouThree);
        int value3 = radioGroup.getCheckedRadioButtonId();

        int ans4 = R.id.qn4;
        radioGroup = (RadioGroup) findViewById(R.id.groupFour);
        int value4 = radioGroup.getCheckedRadioButtonId();

        int ans5 = R.id.qns5;
        radioGroup = (RadioGroup) findViewById(R.id.grouFive);
        int value5 = radioGroup.getCheckedRadioButtonId();


        int ans6 = R.id.qn6;
        radioGroup = (RadioGroup) findViewById(R.id.grouSix);
        int value6 = radioGroup.getCheckedRadioButtonId();


        int ans7 = R.id.qn7;
        radioGroup = (RadioGroup) findViewById(R.id.grouSeven);
        int value7 = radioGroup.getCheckedRadioButtonId();


        int ans8 = R.id.qn8;
        radioGroup = (RadioGroup) findViewById(R.id.grouEight);
        int value8 = radioGroup.getCheckedRadioButtonId();


        int ans9 = R.id.qn9;
        radioGroup = (RadioGroup) findViewById(R.id.grouNine);
        int value9 = radioGroup.getCheckedRadioButtonId();


        int ans0 = R.id.qn10;
        radioGroup = (RadioGroup) findViewById(R.id.grouTen);
        int value0 = radioGroup.getCheckedRadioButtonId();




        if(ans1 == value){
            points += 1;
        }


        if(ans2 == value2){
            points+=1;
        }

        if (ans3 == value3){
            points+=1;
        }

        if (ans4 == value4){
            points+=1;
        }

        if (ans5 == value5){
            points+=1;
        }

        if (ans6 == value6){
            points+=1;
        }
        if (ans7 == value7){
            points+=1;
        }

        if (ans8 == value8){
            points+=1;
        }

       if (ans9 == value9){
            points+=1;
        }

       if (ans0 == value0){
            points+=1;
        }

            return  points;

     }
}