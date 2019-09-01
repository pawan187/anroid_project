package com.example.add_item;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class add_item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
    }

    public void show_item(View view) {
        Intent intent = new Intent(add_item.this, show_item.class);
        ///item name
        EditText et1 = (EditText)findViewById(R.id.itemname_input);
        String s1 =  et1.getText().toString();
        intent.putExtra("itemname",s1);
        /// description
        EditText et2 = (EditText)findViewById(R.id.description_input);
        String s2 =  et2.getText().toString();
        intent.putExtra("description",s2);
        //location
        EditText et3 = (EditText)findViewById(R.id.location_input);
        String s3 =  et3.getText().toString();
        intent.putExtra("location",s3);
        ///owner
        EditText et4 = (EditText)findViewById(R.id.owner_input);
        String s4 =  et4.getText().toString();
        intent.putExtra("owner",s4);
//        /availability
        EditText et5 = (EditText)findViewById(R.id.available_input);
        String s5 =  et5.getText().toString();
        intent.putExtra("name",s5);

//            item_database dbHandler = new item_database(this, null, null, 1);
//            item item = new item(s1, s2, s3, s4, s5);
//            dbHandler.addHandler(item);

        startActivity(intent);
    }
}
