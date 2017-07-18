package com.example.taruc.lab3_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private TextView textView;
    private RadioGroup radioGroupGender;
    private CheckBox checkBoxSmoker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner)findViewById(R.id.spinnerAge);
        radioGroupGender = (RadioGroup)findViewById(R.id.radioGroupGender);
        checkBoxSmoker = (CheckBox)findViewById(R.id.checkBoxSmoker);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.age, android.R.layout.simple_spinner_item); //system resoruces.layout
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    public void onoClick(View view){
        double premium = 0;
        int gender = radioGroupGender.getCheckedRadioButtonId();
        int age = spinner.getSelectedItemPosition();

        switch (age) {
            case 0:
                premium += 50;
                if(gender == R.id.radioButtonMale){
                    premium += 0;
                }

                if(checkBoxSmoker.isChecked() == true){
                    premium  += 0;
                }
                break;
            case 1:
                premium += 55;
                if(gender == R.id.radioButtonMale){
                    premium += 0;
                }

                if(checkBoxSmoker.isChecked() == true){
                    premium += 0;
                }
                break;
            case 2:
                premium += 60;
                if(gender == R.id.radioButtonMale){
                    premium += 50;
                }

                if(checkBoxSmoker.isChecked() == true){
                    premium += 0;
                }
                break;
            case 3:
                premium += 70;
                if(gender == R.id.radioButtonMale){
                    premium += 100;
                }

                if(checkBoxSmoker.isChecked() == true){
                    premium += 100;
                }
                break;
            case 4:
                premium += 120;
                if(gender == R.id.radioButtonMale){
                    premium += 100;
                }

                if(checkBoxSmoker.isChecked() == true){
                    premium += 150;
                }
                break;
            case 5:
                premium += 160;
                if(gender == R.id.radioButtonMale){
                    premium += 50;
                }

                if(checkBoxSmoker.isChecked() == true){
                    premium += 150;
                }
                break;
            case 6:
                premium += 200;
                if(gender == R.id.radioButtonMale){
                    premium += 0;
                }

                if(checkBoxSmoker.isChecked() == true){
                    premium += 250;
                }
                break;
            case 7:
                premium += 250;
                if(gender == R.id.radioButtonMale){
                    premium += 0;
                }

                if(checkBoxSmoker.isChecked() == true){
                    premium += 250;
                }
                break;
        }

        Toast.makeText(this, "RM" + premium, Toast.LENGTH_SHORT).show();
    }

    public void onReset(View view){
        spinner.setSelection(0);
        checkBoxSmoker.setChecked(false);
        radioGroupGender.clearCheck();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(id == R.id.spinnerAge){ // 1st if determine which spinner
            if(position == 0){

            }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
