package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOpenDialogCenter = findViewById(R.id.btn_open_dialog_center);
        Button btnOpenDialogBottom = findViewById(R.id.btn_open_dialog_bottom);

        btnOpenDialogCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFeedBack(Gravity.CENTER);
            }
        });
        btnOpenDialogBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFeedBack(Gravity.BOTTOM);
            }
        });
    }
    private void openFeedBack(int gravity) {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_dialog_feedback);

        Window window = dialog.getWindow();
        if(window == null) {
            return;
        }
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        WindowManager.LayoutParams windowAttributes = window.getAttributes();
        windowAttributes.gravity = gravity;
        window.setAttributes(windowAttributes);

        if(Gravity.BOTTOM == gravity) {
            dialog.setCancelable(true);
        } else {
            dialog.setCancelable(false);
        }

        EditText edtFeedBack = dialog.findViewById(R.id.edt_feedback);
        Button btnNoThank = dialog.findViewById(R.id.btn_no_thank);
        Button btnSend = dialog.findViewById(R.id.btn_send);

        btnNoThank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Send FeedBack", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();
    }
}