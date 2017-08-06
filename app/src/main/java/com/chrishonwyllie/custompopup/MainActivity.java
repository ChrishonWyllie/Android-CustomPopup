package com.chrishonwyllie.custompopup;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    Context mContext;
    Button showdialogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        showdialogButton= (Button) findViewById(R.id.showdialogbutton);
        showdialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCustomPopup();
                
            }
        });


    }

    private void showCustomPopup() {
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View promptView = layoutInflater.inflate(R.layout.dialog_popup_generic_twobuttons, null);

        final AlertDialog alertD = new AlertDialog.Builder(this).create();

        TextView titleLabel = (TextView) promptView.findViewById(R.id.dialogpopup_titlelabel);
        Button firstButton = (Button) promptView.findViewById(R.id.dialogpopup_first_button);
        Button secondButton = (Button) promptView.findViewById(R.id.dialogpopup_second_button);
        Button cancelButton = (Button) promptView.findViewById(R.id.dialogpopup_cancel_button);

        firstButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Perform some custom function that you'd like

                alertD.dismiss();
            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Perform some other custom function that you'd like

                alertD.dismiss();

            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertD.dismiss();
            }
        });

        alertD.setView(promptView);

        alertD.show();
    }
}
