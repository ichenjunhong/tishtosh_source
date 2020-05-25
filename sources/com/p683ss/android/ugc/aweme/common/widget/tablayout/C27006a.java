package com.p683ss.android.ugc.aweme.common.widget.tablayout;

import android.support.p030v4.view.p042b.C1022a;
import android.support.p030v4.view.p042b.C1023b;
import android.support.p030v4.view.p042b.C1024c;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.a */
final class C27006a {

    /* renamed from: a */
    static final Interpolator f71310a = new LinearInterpolator();

    /* renamed from: b */
    static final Interpolator f71311b = new C1023b();

    /* renamed from: c */
    static final Interpolator f71312c = new C1022a();

    /* renamed from: d */
    static final Interpolator f71313d = new C1024c();

    /* renamed from: e */
    static final Interpolator f71314e = new DecelerateInterpolator();

    /* renamed from: a */
    static int m65222a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
