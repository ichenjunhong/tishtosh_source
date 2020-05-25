package com.p683ss.android.ugc.aweme.photo;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.photo.LocalViewPagerBottomSheetBehavior */
public final class LocalViewPagerBottomSheetBehavior<V extends View> extends ViewPagerBottomSheetBehavior<V> {

    /* renamed from: n */
    public static final C38649a f98310n = new C38649a(null);

    /* renamed from: o */
    private Integer f98311o;

    /* renamed from: com.ss.android.ugc.aweme.photo.LocalViewPagerBottomSheetBehavior$a */
    public static final class C38649a {
        private C38649a() {
        }

        public /* synthetic */ C38649a(C52707g gVar) {
            this();
        }
    }

    public LocalViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attributeSet");
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo1372a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        C52711k.m112240b(coordinatorLayout, "coordinatorLayout");
        C52711k.m112240b(v, "child");
        C52711k.m112240b(view, "target");
        C52711k.m112240b(iArr, "consumed");
        if (Integer.valueOf(view.getId()) == this.f98311o) {
            super.mo1372a(coordinatorLayout, v, view, i, i2, iArr);
        }
    }
}
