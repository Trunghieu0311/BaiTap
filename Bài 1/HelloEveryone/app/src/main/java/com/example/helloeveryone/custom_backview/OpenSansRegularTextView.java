package com.example.helloeveryone.custom_backview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class OpenSansRegularTextView extends AppCompatTextView {
    public OpenSansRegularTextView(@NonNull Context context) {
        super(context);
        setFontsTextView();
    }

    public OpenSansRegularTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFontsTextView();
    }

    public OpenSansRegularTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextView();

    }
    private void setFontsTextView() {
        Typeface typeface = Utils.getOpRegularTypeface(getContext());
        setTypeface(typeface);
    }
}
