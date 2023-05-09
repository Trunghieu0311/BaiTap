package com.example.helloeveryone.custom_backview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class LatoItalicTextView extends AppCompatTextView {
    public LatoItalicTextView(@NonNull Context context) {
        super(context);
        setFontsTextView();
    }

    public LatoItalicTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFontsTextView();
    }

    public LatoItalicTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextView();

    }
    private void setFontsTextView() {
        Typeface typeface = Utils.getLatoItalicTypeface(getContext());
        setTypeface(typeface);
    }
}
