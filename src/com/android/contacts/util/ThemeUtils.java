package com.android.contacts.util;

import android.content.res.Resources.Theme;
import android.util.TypedValue;

/**
 * Provides static functions to more easily resolve attributes of the current theme
 */
public class ThemeUtils {
    /**
     * Resolves the given attribute id of the theme to a ressource id
     */
    public static int getAttribute(Theme theme, int attrId) {
        final TypedValue outValue = new TypedValue();
        theme.resolveAttribute(attrId, outValue, true);
        return outValue.resourceId;
    }

    /**
     * Returns the ressource id of the background used for buttons to show pressed and focused state
     */
    public static int getSelectableItemBackground(Theme theme) {
        return getAttribute(theme, android.R.attr.selectableItemBackground);
    }
}