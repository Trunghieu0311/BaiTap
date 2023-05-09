package com.example.helloeveryone.custom_backview;

import android.content.Context;
import android.graphics.Typeface;

public class Utils {

    private static Typeface allerBDTypeface;
    private static Typeface amaticScRegularTypeface;
    private static Typeface latoItalicTypeface;
    private static Typeface opItalicTypeface;
    private static Typeface opRegularTypeface;

    public static Typeface getAllerBDTypeface(Context context) {
        if (allerBDTypeface == null) {
            allerBDTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Aller_Bd.ttf");
        }
        return allerBDTypeface;
    }

    public static Typeface getAmaticScRegularTypeface(Context context) {
        if (amaticScRegularTypeface == null) {
            amaticScRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/AmaticSC-Regular.ttf");
        }
        return amaticScRegularTypeface;
    }

    public static Typeface getLatoItalicTypeface(Context context) {
        if (latoItalicTypeface == null) {
            latoItalicTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Lato-Italic.ttf");
        }
        return latoItalicTypeface;
    }

    public static Typeface getOpItalicTypeface(Context context) {
        if (opItalicTypeface == null) {
            opItalicTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Italic.ttf");
        }
        return opItalicTypeface;
    }

    public static Typeface getOpRegularTypeface(Context context) {
        if (opRegularTypeface == null) {
            opRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Regular.ttf");
        }
        return opRegularTypeface;
    }
}
