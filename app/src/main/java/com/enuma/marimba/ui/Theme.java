package com.enuma.marimba.ui;

/**
 * marimba
 * <p>
 * Created by kevindeland on 9/23/19.
 */

public class Theme {
    // Background
    public int _backgroundResId;
    // Frame
    public int _frameResId;

    // Effects
    public int[] _barEffectIds;

    // Bodies
    public int[] _barBodyIds;

    public Theme(int background, int frame, int[] effects, int[] bodies) {
        this._backgroundResId = background;
        this._frameResId = frame;
        this._barEffectIds = effects;
        this._barBodyIds = bodies;
    }


}
