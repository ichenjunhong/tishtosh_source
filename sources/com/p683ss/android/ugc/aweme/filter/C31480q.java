package com.p683ss.android.ugc.aweme.filter;

import android.support.p043v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31631c;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43905g;
import com.p683ss.android.ugc.tools.view.p2508a.C50207b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.q */
public final class C31480q {

    /* renamed from: a */
    public FrameLayout f82370a;

    /* renamed from: b */
    public FrameLayout f82371b;

    /* renamed from: c */
    public C43905g f82372c;

    /* renamed from: d */
    public C50207b f82373d;

    /* renamed from: e */
    public C31407aj f82374e;

    /* renamed from: f */
    public boolean f82375f;

    /* renamed from: g */
    public boolean f82376g;

    /* renamed from: h */
    public AVETParameter f82377h;

    /* renamed from: i */
    public boolean f82378i;

    /* renamed from: j */
    public C31631c f82379j;

    /* renamed from: k */
    public final AppCompatActivity f82380k;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f82380k, (java.lang.Object) ((com.p683ss.android.ugc.aweme.filter.C31480q) r2).f82380k) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.filter.C31480q
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.filter.q r2 = (com.p683ss.android.ugc.aweme.filter.C31480q) r2
            android.support.v7.app.AppCompatActivity r0 = r1.f82380k
            android.support.v7.app.AppCompatActivity r2 = r2.f82380k
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.C31480q.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        AppCompatActivity appCompatActivity = this.f82380k;
        if (appCompatActivity != null) {
            return appCompatActivity.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterParams(activity=");
        sb.append(this.f82380k);
        sb.append(")");
        return sb.toString();
    }

    public C31480q(AppCompatActivity appCompatActivity) {
        C52711k.m112240b(appCompatActivity, "activity");
        this.f82380k = appCompatActivity;
    }
}
