package com.example.isabelapuiu.learnnewlanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

//        ArrayList<String> familyWords = new ArrayList<>();
//        familyWords.add("Mother");
//        familyWords.add("Father");
//        familyWords.add("Sister");
//
//        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, familyWords);
//
//        ListView familyList = (ListView) findViewById(R.id.familyListView);
//        familyList.setAdapter(itemsAdapter);

//        TextView testTextView = (TextView) findViewById(R.id.testTextView) ;
//        testTextView.setText("PPPPPPPPPHelllllllllllllllooooo");



        populateFeaturesFromWebService();




    }

    public void populateFeaturesFromWebService( ) {

        //Create LinearLayout programatically
        LinearLayout scrollDownLinearLayout = (LinearLayout) findViewById(R.id.familyLinearLayout);
        scrollDownLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        LinearLayout.LayoutParams scrollDownLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        scrollDownLayoutParams.setMargins(0, 5, 0, 0);
        scrollDownLinearLayout.setPadding(0,2,0,0);
        scrollDownLinearLayout.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.BOTTOM);

        //Create TextView programatically
        TextView scrollDownTextView = new TextView(this);
        scrollDownTextView.setGravity(Gravity.CENTER);
        scrollDownTextView.setBackgroundColor(getResources().getColor(R.color.category_vegetables));
        scrollDownTextView.setText("Scroll to compare plans");
        scrollDownTextView.setTextColor(getResources().getColor(R.color.primary_dark_color));
        scrollDownTextView.setPadding(60,12,60,12);
       // scrollDownTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_arrow_for_select_plan, 0, R.drawable.ic_arrow_for_select_plan, 0);

//        scrollDownTextView.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
//        scrollDownTextView.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);

        scrollDownLinearLayout.addView(scrollDownTextView);
//                populare din json

    }
}
