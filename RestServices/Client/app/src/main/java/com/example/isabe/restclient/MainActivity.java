package com.example.isabe.restclient;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL = "http://192.168.0.100:8080/user";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button set = (Button) findViewById(R.id.setbutton);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        Button get = (Button) findViewById(R.id.getbutton);
        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new GetUser().execute();
            }
        });

        Button delete = (Button) findViewById(R.id.deletebutton);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private class GetUser extends AsyncTask<Void,Void,RestServiceResponse>{

        @Override
        protected RestServiceResponse doInBackground(Void... voids) {

            URL url=null;
            try {
                url = new URL(BASE_URL);
            } catch (MalformedURLException e) {
                return new RestServiceResponse(true,null,"Invalid url " +BASE_URL);
            }

            HttpURLConnection conn = null;
            try {
                conn = (HttpURLConnection) url.openConnection();

            } catch (IOException e) {
                return new RestServiceResponse(true,null,"Unable to open connection " +BASE_URL);
            }

            int status;
            try {
                status = conn.getResponseCode();
            } catch (IOException e) {
                return new RestServiceResponse(true,null,"Communication error " +BASE_URL);

            }

            if(status!=200)
                return new RestServiceResponse(true,null,"Communication error " +BASE_URL);



            InputStream in = null;
            try {
                in = conn.getInputStream();
            } catch (IOException e) {
                return new RestServiceResponse(true,null,"Communication error " +BASE_URL);

            }

            InputStreamReader isw = new InputStreamReader(in);

            StringBuffer stringBuffer = new StringBuffer();

            int data = 0;
            try {
                data = isw.read();
                while (data != -1) {
                    char current = (char) data;
                    data = isw.read();

                    stringBuffer.append(current);
                }
            } catch (IOException e) {
                return new RestServiceResponse(true,null,"Communication error " +BASE_URL);

            }



            return new RestServiceResponse(false,stringBuffer.toString(),null);
        }

        @Override
        protected void onPostExecute(RestServiceResponse s) {
            super.onPostExecute(s);

            if(s.errorEncountered)
            {
                Toast.makeText(MainActivity.this, s.getReturnError(), Toast.LENGTH_SHORT).show();
                return;
            }

            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(s.getReturnMessage());
        }
    }
}
