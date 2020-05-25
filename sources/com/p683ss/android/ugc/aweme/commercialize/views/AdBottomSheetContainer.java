package com.p683ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0497a;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer */
public final class AdBottomSheetContainer extends CoordinatorLayout {

    /* renamed from: h */
    BottomSheetBehavior<AdBottomSheetContainer> f69891h;

    /* renamed from: i */
    private boolean f69892i;

    /* renamed from: j */
    private C26546b f69893j;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer$a */
    public static final class C26545a extends C0497a {

        /* renamed from: a */
        final /* synthetic */ BottomSheetBehavior f69894a;

        /* renamed from: b */
        final /* synthetic */ AdBottomSheetContainer f69895b;

        C26545a(BottomSheetBehavior bottomSheetBehavior, AdBottomSheetContainer adBottomSheetContainer) {
            this.f69894a = bottomSheetBehavior;
            this.f69895b = adBottomSheetContainer;
        }

        /* renamed from: a */
        public final void mo1315a(View view, float f) {
            C52711k.m112240b(view, "bottomSheet");
            C26546b callback = this.f69895b.getCallback();
            if (callback != null) {
                callback.mo54239d();
            }
        }

        /* renamed from: a */
        public final void mo1316a(View view, int i) {
            C52711k.m112240b(view, "bottomSheet");
            if (i != 1) {
                switch (i) {
                    case 3:
                        C26546b callback = this.f69895b.getCallback();
                        if (callback != null) {
                            callback.mo54236a();
                        }
                        return;
                    case 4:
                        C26546b callback2 = this.f69895b.getCallback();
                        if (callback2 != null) {
                            callback2.mo54237b();
                            return;
                        }
                        break;
                }
                return;
            }
            if (!this.f69895b.getHideable()) {
                this.f69894a.mo1301b(3);
            }
            C26546b callback3 = this.f69895b.getCallback();
            if (callback3 != null) {
                callback3.mo54238c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer$b */
    public interface C26546b {
        /* renamed from: a */
        void mo54236a();

        /* renamed from: b */
        void mo54237b();

        /* renamed from: c */
        void mo54238c();

        /* renamed from: d */
        void mo54239d();
    }

    public AdBottomSheetContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdBottomSheetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final BottomSheetBehavior<AdBottomSheetContainer> getBehavior() {
        return this.f69891h;
    }

    public final C26546b getCallback() {
        return this.f69893j;
    }

    public final boolean getHideable() {
        return this.f69892i;
    }

    /* renamed from: a */
    public final boolean mo54229a() {
        if (this.f69891h.f1640k == 3) {
            return true;
        }
        return false;
    }

    public final void setCallback(C26546b bVar) {
        this.f69893j = bVar;
    }

    public final void setHideable(boolean z) {
        this.f69892i = z;
    }

    public final void setBehavior(BottomSheetBehavior<AdBottomSheetContainer> bottomSheetBehavior) {
        C52711k.m112240b(bottomSheetBehavior, "<set-?>");
        this.f69891h = bottomSheetBehavior;
    }

    public AdBottomSheetContainer(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f69892i = true;
        BottomSheetBehavior<AdBottomSheetContainer> bottomSheetBehavior = new BottomSheetBehavior<>();
        bottomSheetBehavior.f1646q = new C26545a(bottomSheetBehavior, this);
        this.f69892i = true;
        bottomSheetBehavior.mo1296a(0);
        this.f69891h = bottomSheetBehavior;
    }

    public /* synthetic */ AdBottomSheetContainer(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
