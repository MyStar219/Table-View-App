package com.example.star.test1;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    LinearLayout lyContainer;
    String[] arrayHead = {"CONVENE THE CMT:", "ACTIVATE:", "REFER:"};
    String[] arrayTitle = {"to assess the need for acrisis to be declared and for functional support teams to be put on notice",
            " the CMT’s management of the incident (refer to section 1 on reverse page)",
            " the incident to the control of the Sector Head if it is not deemed to warrant CMT management, with an agreement to maintain consultations with the CEO or alternate to continue monitoring the incident"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//hide title
        setContentView(R.layout.activity_main);
        lyContainer = (LinearLayout)findViewById(R.id.lyContainer);
        presentData();
    }
    void presentData() {
        for(int i = 0; i < arrayTitle.length; i ++) {
            String strHead =arrayHead[i];
            String strTitle = arrayTitle[i];

            LayoutInflater inflater = LayoutInflater.from(this);
            View viewTitle = inflater.inflate(R.layout.cell_title, null);

            TextView tvTitle = (TextView) viewTitle.findViewById(R.id.tvTitle);
            tvTitle.setText(Html.fromHtml("<b>"+strHead+"</b>"+strTitle));

            lyContainer.addView(viewTitle);

        }
    }

}
