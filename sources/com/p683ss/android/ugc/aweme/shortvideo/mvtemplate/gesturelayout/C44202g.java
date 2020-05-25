package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.g */
public final class C44202g implements TypeEvaluator<Rect> {

    /* renamed from: a */
    private Rect f111967a;

    public C44202g(Rect rect) {
        this.f111967a = rect;
    }

    /* renamed from: a */
    public final Rect evaluate(float f, Rect rect, Rect rect2) {
        if (rect == null) {
            C52711k.m112234a();
        }
        int i = rect.left;
        if (rect2 == null) {
            C52711k.m112234a();
        }
        int i2 = i + ((int) (((float) (rect2.left - rect.left)) * f));
        int i3 = rect.top + ((int) (((float) (rect2.top - rect.top)) * f));
        int i4 = rect.right + ((int) (((float) (rect2.right - rect.right)) * f));
        int i5 = rect.bottom + ((int) (((float) (rect2.bottom - rect.bottom)) * f));
        if (this.f111967a == null) {
            return new Rect(i2, i3, i4, i5);
        }
        Rect rect3 = this.f111967a;
        if (rect3 == null) {
            C52711k.m112234a();
        }
        rect3.set(i2, i3, i4, i5);
        return this.f111967a;
    }
}
