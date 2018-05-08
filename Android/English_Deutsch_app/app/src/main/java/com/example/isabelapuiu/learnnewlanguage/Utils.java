package com.example.isabelapuiu.learnnewlanguage;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

public class Utils {


    public static String getFeaturesFromLocalJson(Context context) {
        String json;
        try {
            InputStream is = context.getAssets().open("Features.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");

        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
