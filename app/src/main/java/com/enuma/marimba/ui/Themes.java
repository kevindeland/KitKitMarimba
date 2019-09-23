package com.enuma.marimba.ui;

import android.util.Log;
import android.view.View;

import com.enuma.marimba.R;

/**
 * marimba
 * <p>
 * Created by kevindeland on 9/23/19.
 */

public class Themes {

    public static Theme ORIGINAL;
    public static Theme RAINBOW;

    private static int currentTheme = 0;

    static {

        ORIGINAL = new Theme(R.drawable.tools_marimba_image_bg, R.drawable.tools_marimba_image_frame,
                new int[]{R.drawable.tools_marimba_image_stick_1_effect, R.drawable.tools_marimba_image_stick_2_effect,
                        R.drawable.tools_marimba_image_stick_3_effect, R.drawable.tools_marimba_image_stick_4_effect,
                        R.drawable.tools_marimba_image_stick_5_effect, R.drawable.tools_marimba_image_stick_6_effect,
                        R.drawable.tools_marimba_image_stick_7_effect, R.drawable.tools_marimba_image_stick_8_effect},
                new int[]{R.drawable.tools_marimba_image_stick_1_body, R.drawable.tools_marimba_image_stick_2_body,
                        R.drawable.tools_marimba_image_stick_3_body, R.drawable.tools_marimba_image_stick_4_body,
                        R.drawable.tools_marimba_image_stick_5_body, R.drawable.tools_marimba_image_stick_6_body,
                        R.drawable.tools_marimba_image_stick_7_body, R.drawable.tools_marimba_image_stick_8_body},
                R.drawable.selector_theme_original
        );

        RAINBOW = new Theme(R.drawable.rainbow_marimba_image_bg, R.drawable.rainbow_marimba_image_frame,
                new int[]{R.drawable.rainbow_marimba_image_stick_1_effect, R.drawable.rainbow_marimba_image_stick_2_effect,
                        R.drawable.rainbow_marimba_image_stick_3_effect, R.drawable.rainbow_marimba_image_stick_4_effect,
                        R.drawable.rainbow_marimba_image_stick_5_effect, R.drawable.rainbow_marimba_image_stick_6_effect,
                        R.drawable.rainbow_marimba_image_stick_7_effect, R.drawable.rainbow_marimba_image_stick_8_effect},
                new int[]{R.drawable.rainbow_marimba_image_stick_1_body, R.drawable.rainbow_marimba_image_stick_2_body,
                        R.drawable.rainbow_marimba_image_stick_3_body, R.drawable.rainbow_marimba_image_stick_4_body,
                        R.drawable.rainbow_marimba_image_stick_5_body, R.drawable.rainbow_marimba_image_stick_6_body,
                        R.drawable.rainbow_marimba_image_stick_7_body, R.drawable.rainbow_marimba_image_stick_8_body},
                R.drawable.selector_theme_rainbow
        );

    }

    public static Theme[] THEMES = {ORIGINAL, RAINBOW};

    public static Theme cycleTheme() {
        return THEMES[currentTheme++ % THEMES.length];
    }

    public static Theme peekNext() {
        return THEMES[currentTheme % THEMES.length ];
    }


}
