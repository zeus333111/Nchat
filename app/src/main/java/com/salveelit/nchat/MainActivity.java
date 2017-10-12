package com.salveelit.nchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    ListView contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactos=(ListView)findViewById(R.id.Lcontactos);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String select =(String) parent.getItemAtPosition(position);
        
    }
}
