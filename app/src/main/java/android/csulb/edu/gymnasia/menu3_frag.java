package android.csulb.edu.gymnasia;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

/**
 * Created by Mayankkasturia on 11/13/2015.
 */
public class menu3_frag extends android.support.v4.app.Fragment {

    private Context context;
    private int duration = Toast.LENGTH_SHORT;
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.menu3_layout, container, false);

        final Calculator CalObject = new Calculator();

        final EditText Centimeter = (EditText)rootview.findViewById(R.id.cm);
        final EditText Weight = (EditText)rootview.findViewById(R.id.weight);
        final EditText Age = (EditText)rootview.findViewById(R.id.age);
        final Button Calculate = (Button)rootview.findViewById(R.id.calculate);
        final RadioButton Male = (RadioButton)rootview.findViewById(R.id.male);
        final RadioButton Female = (RadioButton)rootview.findViewById(R.id.female);
        final TextView Result = (TextView)rootview.findViewById(R.id.result);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Height;
                double weight;
                int age;
                if(Centimeter.getText().length() == 0 && Weight.getText().length() == 0 && Age.getText().length() == 0){
                    Toast.makeText(getContext(), "Fill the columns in order to obtain nutrition", duration).show();
                    return;
                }
                if (Centimeter.getText().length() == 0) {
                    Toast.makeText(getContext(), "Height can't be empty", duration).show();
                    return;
                }//toast
                else
                {
                    Height = Double.parseDouble(Centimeter.getText().toString());
                }



               if (Weight.getText().length() == 0) {
                    Toast.makeText(getContext(), "weight can't be empty", duration).show();
                    return;
                }//toast
                else {
                   weight = Double.parseDouble(Weight.getText().toString());
               }

                if (Age.getText().length() == 0) {
                    Toast.makeText(getContext(), "Age can't be empty", duration).show();
                    return;
                }//toast
                else{
                    age = Integer.parseInt(Age.getText().toString());
                }

                double result;



                if (Male.isChecked()) {
                    result = CalObject.Male_Cal_Calculator(age, Height, weight);


                    Result.setText(String.valueOf(result)+" Calories per day");
                }




                if (Female.isChecked()) {
                    result = CalObject.Female_Cal_Calculator(age, Height, weight);
                    Result.setText(String.valueOf(result)+" Calories per day");

                }

            }
        });



        return rootview;
    }}