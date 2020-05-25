package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.graphics.Rect;
import android.support.p030v4.view.C1056u;
import android.view.View;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.h */
public abstract class C44203h {

    /* renamed from: a */
    public static final C44204a f111968a = new C44204a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.h$a */
    public static final class C44204a {
        private C44204a() {
        }

        public /* synthetic */ C44204a(C52707g gVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract View mo90115c(Object obj);

    /* renamed from: b */
    public final Rect mo90114b(Object obj) {
        View c = mo90115c(null);
        if (c == null || !C1056u.m3018B(c)) {
            return null;
        }
        Rect rect = new Rect();
        c.getGlobalVisibleRect(rect);
        return rect;
    }

    /* renamed from: a */
    public final Rect mo90113a(Object obj) {
        View c = mo90115c(null);
        if (c == null || !C1056u.m3018B(c)) {
            return null;
        }
        int[] iArr = new int[2];
        c.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, (int) (((float) i) + (((float) c.getWidth()) * c.getScaleX())), (int) (((float) i2) + (((float) c.getHeight()) * c.getScaleY())));
    }
}
