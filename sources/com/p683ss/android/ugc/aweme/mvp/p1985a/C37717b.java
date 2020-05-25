package com.p683ss.android.ugc.aweme.mvp.p1985a;

import com.p683ss.android.ugc.aweme.mvp.p1985a.C37718c;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37719d;

/* renamed from: com.ss.android.ugc.aweme.mvp.a.b */
public class C37717b<M extends C37718c, V extends C37719d> {

    /* renamed from: a */
    protected final String f96122a = getClass().getSimpleName();

    /* renamed from: b */
    protected M f96123b;

    /* renamed from: c */
    protected V f96124c;

    /* renamed from: c */
    public final void mo77195c() {
        if (this.f96123b != null) {
            this.f96123b.onDestroy();
        }
        this.f96123b = null;
        this.f96124c = null;
    }

    public C37717b(M m, V v) {
        if (m == null) {
            throw new NullPointerException("Model can not null");
        } else if (v != null) {
            this.f96123b = m;
            this.f96124c = v;
        } else {
            throw new NullPointerException("View can not null");
        }
    }
}
