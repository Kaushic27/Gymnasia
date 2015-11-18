package android.csulb.edu.gymnasia;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Mayankkasturia on 11/13/2015.
 */
public class menu4_frag extends android.support.v4.app.Fragment {

    private Context context;
    private int duration = Toast.LENGTH_SHORT;
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.menu4_layout, container, false);

        TextView Introduction = (TextView)rootview.findViewById(R.id.textView1);
        TextView Breakfast = (TextView)rootview.findViewById(R.id.textView2);
        TextView Lunch = (TextView)rootview.findViewById(R.id.textView3);
        TextView EventingMeal = (TextView)rootview.findViewById(R.id.textView4);
        TextView Snacks = (TextView)rootview.findViewById(R.id.textView5);
        TextView Dinner = (TextView)rootview.findViewById(R.id.textView6);

        Introduction.setText("This is am example of how to prepare your own volume diet.You do not have to follow this diet;" +
                "it's just a simple example of how to combine foods to gain muscle mass.");

        Breakfast.setText("Breakfast");


        Lunch.setText("Lunch");


        EventingMeal.setText("Eventing Meal");


        Snacks.setText("Snacks");


        Dinner.setText("Dinner");

        return rootview;
    }}