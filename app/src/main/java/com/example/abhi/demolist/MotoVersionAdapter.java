package com.example.abhi.demolist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by abhi on 25/2/18.
 */



    public class MotoVersionAdapter extends ArrayAdapter<MotoVersion> {
        public MotoVersionAdapter(Activity context, ArrayList<MotoVersion> motoVersions){
            //initialize adapter's internal storage for the context  and the list
            super(context, 0, motoVersions);
        }
        @Override
        public View getView(int position, View  convertView, ViewGroup parent){
            View listItemView = convertView;
            if(listItemView==null)
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            MotoVersion currentMotoVersion =getItem(position);
            TextView nameTextView =(TextView)listItemView.findViewById(R.id.version_name);
            nameTextView.setText(currentMotoVersion.getVersionName());
            TextView numberTextView =(TextView)listItemView.findViewById(R.id.version_number);
            numberTextView.setText(currentMotoVersion.getVersionNumber());
            ImageView versionIcon =(ImageView)listItemView.findViewById(R.id.list_icon);
            versionIcon.setImageResource(currentMotoVersion.getmImageResourceId());
            return listItemView;
        }
    }



