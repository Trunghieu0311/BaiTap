package com.example.helloeveryone.custom_backview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class OpenSansItalicTextView extends AppCompatTextView {
    public OpenSansItalicTextView(@NonNull Context context) {
        super(context);
        setFontsTextView();
    }

    public OpenSansItalicTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFontsTextView();
    }

    public OpenSansItalicTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextView();

    }
    private void setFontsTextView() {
        Typeface typeface = Utils.getOpItalicTypeface(getContext());
        setTypeface(typeface);
    }
}
