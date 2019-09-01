package com.example.add_item;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;
public class item_database extends SQLiteOpenHelper{
        //information of database
        private static final int DATABASE_VERSION = 1;
        private static final String DATABASE_NAME = "itemDB.db";
        public static final String TABLE_NAME = "items";
        public static final String COLUMN_ID = "item_id";
        public static final String COLUMN_NAME = "item_name";
        public static final String COLUMN_DESCRIPTION = "item_description";
        public static final String COLUMN_LOCATION = "item_location";
        public static final String COLUMN_OWNER_ID = "owner_id";

    //initialize the database
        public item_database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, DATABASE_NAME, factory, DATABASE_VERSION);
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            String CREATE_TABLE = String.format("CREATE TABLE%s(%sINTEGER PRIMARY KEY AUTOINCREMENT,%sTEXT,%sTEXT,%sTEXT,%sINTEGER FOREIGN KEY,)", TABLE_NAME, COLUMN_ID, COLUMN_NAME, COLUMN_DESCRIPTION, COLUMN_LOCATION, COLUMN_OWNER_ID);
            db.execSQL(CREATE_TABLE);
        }@Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {}
        public String loadHandler() {
            String result = "";
            String query = String.format("Select*FROM%s", TABLE_NAME);
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor cursor = db.rawQuery(query, null);
            while (cursor.moveToNext()) {
                int result_0 = cursor.getInt(0);
                String result_1 = cursor.getString(1);
                result += String.valueOf(result_0) + " " + result_1 +
                        System.getProperty("line.separator");
            }
            cursor.close();
            db.close();
            return result;
        }
        public void addHandler(item item) {
            ContentValues values = new ContentValues();
            values.put(COLUMN_NAME, item.getName());
            values.put(COLUMN_DESCRIPTION, item.getDescription());
            values.put(COLUMN_OWNER_ID, item.getOwnerID());
            values.put(COLUMN_LOCATION, item.getLocation());
            SQLiteDatabase db = this.getWritableDatabase();
            db.insert(TABLE_NAME, null, values);
            db.close();
        }
        public item findHandler(String studentname) {
            return null;
        }
        public boolean deleteHandler(int ID) {
            return true;
        }
        public boolean updateHandler(int ID, String name) {
            return false;
        }
}
