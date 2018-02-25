package com.example.abhi.demolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create an array list of motoversion objects
        ArrayList<MotoVersion> motoVersions = new ArrayList<>();
        motoVersions.add(new MotoVersion("motoG","4.0.2",R.drawable.donut));
        motoVersions.add(new MotoVersion("Eclair", "2.0-2.1", R.drawable.eclair));
        motoVersions.add(new MotoVersion("Froyo", "2.2-2.2.3", R.drawable.froyo));
        motoVersions.add(new MotoVersion("GingerBread", "2.3-2.3.7", R.drawable.gingerbread));
        motoVersions.add(new MotoVersion("Honeycomb", "3.0-3.2.6", R.drawable.honeycomb));
        motoVersions.add(new MotoVersion("Ice Cream Sandwich", "4.0-4.0.4", R.drawable.icecream));
        motoVersions.add(new MotoVersion("Jelly Bean", "4.1-4.3.1", R.drawable.jellybean));
        motoVersions.add(new MotoVersion("KitKat", "4.4-4.4.4", R.drawable.kitkat));
        motoVersions.add(new MotoVersion("Lollipop", "5.0-5.1.1", R.drawable.lollipop));
        motoVersions.add(new MotoVersion("Marshmallow", "6.0-6.0.1", R.drawable.marshmallow));

       //call the adapter
        MotoVersionAdapter setNewAdapter =new MotoVersionAdapter(this,motoVersions);
        ListView listView=(ListView)findViewById(R.id.list_view_motoversions);
        listView.setAdapter(setNewAdapter);

    }
}
