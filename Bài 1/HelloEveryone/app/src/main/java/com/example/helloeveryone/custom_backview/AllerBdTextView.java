package com.example.helloeveryone.custom_backview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class AllerBdTextView extends AppCompatTextView {
    public AllerBdTextView(@NonNull Context context) {
        super(context);
        setFontsTextView();
    }

    public AllerBdTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFontsTextView();
    }

    public AllerBdTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextView();

    }
    private void setFontsTextView() {
        Typeface typeface = Utils.getAllerBDTypeface(getContext());
        setTypeface(typeface);
    }
}
