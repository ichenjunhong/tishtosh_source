package com.p683ss.ttm.utils;

/* renamed from: com.ss.ttm.utils.AVUtils */
public class AVUtils {

    /* renamed from: com.ss.ttm.utils.AVUtils$ScaleInfo */
    public static class ScaleInfo {

        /* renamed from: h */
        public int f128643h;

        /* renamed from: w */
        public int f128644w;

        /* renamed from: x */
        public int f128645x;

        /* renamed from: y */
        public int f128646y;
    }

    public static final ScaleInfo getScaleInfoFromSize(float f, float f2, float f3, float f4) {
        ScaleInfo scaleInfo = new ScaleInfo();
        float f5 = f / f2;
        scaleInfo.f128644w = (int) f3;
        scaleInfo.f128643h = (int) (f3 / f5);
        if (((float) scaleInfo.f128643h) < f4) {
            scaleInfo.f128643h = (int) f4;
            scaleInfo.f128644w = (int) (f5 * f4);
        }
        scaleInfo.f128646y = ((int) (((float) scaleInfo.f128643h) - f4)) >> 1;
        scaleInfo.f128645x = ((int) (((float) scaleInfo.f128644w) - f3)) >> 1;
        if (((float) scaleInfo.f128643h) > f4) {
            scaleInfo.f128646y = 0 - scaleInfo.f128646y;
        }
        if (((float) scaleInfo.f128644w) > f3) {
            scaleInfo.f128645x = 0 - scaleInfo.f128645x;
        }
        return scaleInfo;
    }
}
