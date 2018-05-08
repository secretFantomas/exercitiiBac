package com.example.isabelapuiu.learnnewlanguage;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private Activity thisActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        thisActivity=this;

        //read features from local json
        String json = Utils.getFeaturesFromLocalJson(thisActivity);
        Type listType = new TypeToken<ArrayList<FeaturesFromJSON>>(){}.getType();
        ArrayList<FeaturesFromJSON> featuresFromJsonList = new Gson().fromJson(json, listType);
        featuresFromJsonList.get(0).getClass();

        populateFeaturesFromJson();


        //read json from webservice



    }

    public void populateFeaturesFromJson(){

        LinearLayout scrollDownLinearLayout = new LinearLayout(thisActivity);
        scrollDownLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


        LinearLayout.LayoutParams  scrollDownLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

//        scrollDownLayoutParams.setMargins(0, 5, 0, 0);
//        scrollDownLayoutParams.gravity(Gravity.CENTER);
//        scrollDownLinearLayout.gravity(Gravity.CENTER | Gravity.BOTTOM);
//
//
//        android:layout_alignParentBottom="true"
//        android:gravity=
//        android:paddingTop="2px">
//
//                    <com.dyve.counting.widget.DVTextView
//        android:id="@+id/textScrollToComparePlans"
//        android:layout_width="match_parent"
//        android:layout_height="wrap_content"
//        android:layout_alignParentStart="true"
//        android:layout_alignParentTop="true"
//        android:background="@color/plan_price_bg_color"
//        android:drawableLeft="@drawable/ic_arrow_for_select_plan"
//        android:drawableRight="@drawable/ic_arrow_for_select_plan"
//        android:gravity="center"
//        android:paddingBottom="12dp"
//        android:paddingLeft="60dp"
//        android:paddingRight="60dp"
//        android:paddingTop="12dp"
//        android:text="@string/scroll_to_compare_plans"
//        android:textAlignment="center"
//        android:textColor="@color/black" />
//                </LinearLayout>
    }
}
