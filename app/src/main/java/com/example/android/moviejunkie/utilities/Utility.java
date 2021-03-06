package com.example.android.moviejunkie.utilities;

import android.content.Context;
import android.util.DisplayMetrics;

public class Utility {

    /**
     * This method calculates the correct number of columns that should be displayed in the Grid Layout
     * of the RecyclerView according to the device screen size
     * @param context
     * @return returns number fo columns to display according to screen size
     */
    @SuppressWarnings("JavaDoc")
    public static int calculateNoOfColumns(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
        return (int) (dpWidth / Constants.GRID_IMAGE_WIDTH);
    }
}
