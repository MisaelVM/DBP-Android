package com.example.edward.carteraclientes.BaseDatos;

import com.example.edward.carteraclientes.BaseDatos.FeedReaderClient;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/*public class DatosOpenHelper extends SQLiteOpenHelper {
    public DatosOpenHelper(Context context) {
        super(context, "DATOS", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NOT EXISTS CLIENTE (");
        sql.append("NOMBRE VARCHAR(250), ");
        sql.append("DIRECCION VARCHAR(250), ");
        sql.append("EMAIL VARCHAR(200), ");
        sql.append("TELEFONO VARCHAR(20))");

        sqLiteDatabase.execSQL(sql.toString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int il) {

    }
}*/

public class DatosOpenHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "DATOS";

    /*public static class FeedEntry implements BaseColumns {
        private FeedEntry() {}

        public static final String TABLE_NAME = "CLIENTE";
        public static final String COLUMN_NAME = "NOMBRE";
        public static final String COLUMN_ADDRESS = "DIRECCION";
        public static final String COLUMN_EMAIL = "EMAIL";
        public static final String COLUMN_MOBILE = "TELEFONO";
    }*/

    private static final String SQL_CREATE_ENTRIES  =
            "CREATE TABLE IF NOT EXISTS " + FeedReaderClient.FeedEntry.TABLE_NAME + " (" +
            FeedReaderClient.FeedEntry.COLUMN_NAME + " VARCHAR(250), " +
            FeedReaderClient.FeedEntry.COLUMN_ADDRESS + " VARCHAR(250), " +
            FeedReaderClient.FeedEntry.COLUMN_EMAIL + " VARCHAR(200), " +
            FeedReaderClient.FeedEntry.COLUMN_MOBILE + " VARCHAR(20))";

    public DatosOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int il) {

    }
}