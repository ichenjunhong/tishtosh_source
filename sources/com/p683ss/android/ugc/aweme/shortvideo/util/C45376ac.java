package com.p683ss.android.ugc.aweme.shortvideo.util;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ac */
public final class C45376ac {
    /* renamed from: a */
    public static boolean m98926a(float f, float f2, float f3) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (!Float.isNaN(f) || !Float.isNaN(f2)) {
                return false;
            }
            return true;
        } else if (Math.abs(f2 - f) < f3) {
            return true;
        } else {
            return false;
        }
    }
}
