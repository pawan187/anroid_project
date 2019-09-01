package com.example.add_item;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class show_item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_item);

        Intent intent = getIntent();
        /// item name
        String str1 = intent.getStringExtra("itemname");
        TextView t1 = (TextView) findViewById(R.id.show_itemname);
        t1.setText(str1);
        //// description
        String str2 = intent.getStringExtra("description");
        TextView t2 = (TextView) findViewById(R.id.show_description);
        t2.setText(str2);
        ///// location
        String str3 = intent.getStringExtra("location");
        TextView t3 = (TextView) findViewById(R.id.show_location);
        t3.setText(str3);
        ///// owner
        String str4 = intent.getStringExtra("owner");
        TextView t4 = (TextView) findViewById(R.id.show_owner);
        t4.setText(str4);
        ////availabilty
        String str5 = intent.getStringExtra("availabilty");
        TextView t5 = (TextView) findViewById(R.id.show_availability);
        t5.setText(str5);
//        item_database dbHandler = new item_database(this, null, null, 1);
//        String item = dbHandler.loadHandler();
//        TextView show_itemname = (TextView) findViewById(R.id.show_itemname);
//        show_itemname.setText(item);
    }
}
