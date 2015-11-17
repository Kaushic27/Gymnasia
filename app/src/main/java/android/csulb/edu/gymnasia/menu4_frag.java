package android.csulb.edu.gymnasia;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        return rootview;
    }}