package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;

/* renamed from: com.facebook.imageutils.d */
public final class C14255d {

    /* renamed from: a */
    public final Pair<Integer, Integer> f37163a;

    /* renamed from: b */
    public final ColorSpace f37164b;

    public C14255d(int i, int i2, ColorSpace colorSpace) {
        Pair<Integer, Integer> pair;
        if (i == -1 || i2 == -1) {
            pair = null;
        } else {
            pair = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        }
        this.f37163a = pair;
        this.f37164b = colorSpace;
    }
}
