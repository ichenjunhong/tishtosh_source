package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.al */
public final class C35196al {

    /* renamed from: a */
    public static final C35196al f90481a = new C35196al();

    /* renamed from: b */
    private static final int f90482b = C11010c.m22280a().getResources().getDimensionPixelSize(R.dimen.ik);

    /* renamed from: c */
    private static final int f90483c = C11010c.m22280a().getResources().getDimensionPixelSize(R.dimen.im);

    /* renamed from: d */
    private static final int f90484d = C11010c.m22280a().getResources().getDimensionPixelSize(R.dimen.il);

    private C35196al() {
    }

    /* renamed from: a */
    public static final Integer[] m79551a(SimpleDraweeView simpleDraweeView, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = f / f2;
        if (f7 <= 0.5625f) {
            f4 = (float) f90482b;
            f3 = (float) f90484d;
        } else if (f7 <= 0.5625f || f7 > 0.75f) {
            if (f7 > 0.75f && f7 <= 1.0f) {
                f5 = (float) f90483c;
                f6 = f5 / f7;
                if (f6 > ((float) f90484d)) {
                    f6 = (float) f90484d;
                }
            } else if (f7 > 1.0f && f7 < 1.3333334f) {
                f3 = (float) f90483c;
                f4 = f3 / f7;
                if (f4 > ((float) f90484d)) {
                    f3 = (float) f90484d;
                }
            } else if (f7 < 1.3333334f || f7 >= 1.7777778f) {
                f4 = (float) f90484d;
                f3 = (float) f90482b;
            } else {
                f5 = (float) f90484d;
                f6 = f7 * f5;
                if (f6 > ((float) f90483c)) {
                    f6 = (float) f90483c;
                }
            }
            float f8 = f5;
            f3 = f6;
            f4 = f8;
        } else {
            f3 = (float) f90484d;
            f4 = f7 * f3;
            if (f4 > ((float) f90483c)) {
                f4 = (float) f90483c;
            }
        }
        if (simpleDraweeView != null) {
            C13833a aVar = (C13833a) simpleDraweeView.getHierarchy();
            C52711k.m112236a((Object) aVar, "imageView.hierarchy");
            aVar.mo25898a(C13818b.f36067g);
        }
        return new Integer[]{Integer.valueOf((int) f4), Integer.valueOf((int) f3)};
    }
}
