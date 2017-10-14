package com.salveelit.nchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactos=(ListView)findViewById(R.id.Lcontactos);


        String[] valores =new String[]{"SHO","El"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,valores);
        contactos.setAdapter(adapter);
        contactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String select =(String) parent.getItemAtPosition(position);

                Intent intent =new Intent(MainActivity.this,Chat.class);
                startActivity(intent);
            }
        });

        //Intent intent=new Intent(this,Servicio_Entrada.class);
        //startService(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
