package com.bytedance.android.livesdk.widget.p425c;

import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1338k;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1346r.C1347a;
import android.support.p043v7.widget.RecyclerView.C1346r.C1348b;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* renamed from: com.bytedance.android.livesdk.widget.c.c */
public abstract class C8540c extends C1338k {

    /* renamed from: a */
    private Scroller f23421a;

    /* renamed from: b */
    protected RecyclerView f23422b;

    /* renamed from: c */
    private final C1340m f23423c = new C1340m() {

        /* renamed from: a */
        boolean f23424a;

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f23424a) {
                C8540c.this.mo14974a();
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f23424a = true;
            }
        }
    };

    /* renamed from: a */
    public abstract int mo13504a(C1332i iVar, int i, int i2);

    /* renamed from: a */
    public abstract View mo13505a(C1332i iVar);

    /* renamed from: a */
    public abstract int[] mo14965a(C1332i iVar, View view);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14974a() {
        if (this.f23422b != null) {
            C1332i layoutManager = this.f23422b.getLayoutManager();
            if (layoutManager != null) {
                View a = mo13505a(layoutManager);
                if (a != null) {
                    int[] a2 = mo14965a(layoutManager, a);
                    if (!(a2[0] == 0 && a2[1] == 0)) {
                        this.f23422b.mo4795a(a2[0], a2[1]);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1415af mo14966b(C1332i iVar) {
        if (!(iVar instanceof C1348b)) {
            return null;
        }
        return new C1415af(this.f23422b.getContext()) {
            /* renamed from: a */
            public final float mo5490a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* renamed from: a */
            public final void mo5110a(View view, C1349s sVar, C1347a aVar) {
                int[] a = C8540c.this.mo14965a(C8540c.this.f23422b.getLayoutManager(), view);
                int i = a[0];
                int i2 = a[1];
                int a2 = mo5491a(Math.max(Math.abs(i), Math.abs(i2)));
                if (a2 > 0) {
                    aVar.mo5113a(i, i2, a2, this.f5105b);
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo14975a(RecyclerView recyclerView) throws IllegalStateException {
        if (this.f23422b != recyclerView) {
            if (this.f23422b != null) {
                this.f23422b.mo4818b(this.f23423c);
                this.f23422b.setOnFlingListener(null);
            }
            this.f23422b = recyclerView;
            if (this.f23422b != null) {
                if (this.f23422b.getOnFlingListener() == null) {
                    this.f23422b.mo4801a(this.f23423c);
                    this.f23422b.setOnFlingListener(this);
                    this.f23421a = new Scroller(this.f23422b.getContext(), new DecelerateInterpolator());
                    mo14974a();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5078a(int r5, int r6) {
        /*
            r4 = this;
            android.support.v7.widget.RecyclerView r0 = r4.f23422b
            android.support.v7.widget.RecyclerView$i r0 = r0.getLayoutManager()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.support.v7.widget.RecyclerView r2 = r4.f23422b
            android.support.v7.widget.RecyclerView$a r2 = r2.getAdapter()
            if (r2 != 0) goto L_0x0013
            return r1
        L_0x0013:
            android.support.v7.widget.RecyclerView r2 = r4.f23422b
            int r2 = r2.getMinFlingVelocity()
            int r3 = java.lang.Math.abs(r6)
            if (r3 > r2) goto L_0x0025
            int r3 = java.lang.Math.abs(r5)
            if (r3 <= r2) goto L_0x0044
        L_0x0025:
            boolean r2 = r0 instanceof android.support.p043v7.widget.RecyclerView.C1346r.C1348b
            r3 = 1
            if (r2 != 0) goto L_0x002c
        L_0x002a:
            r5 = 0
            goto L_0x0041
        L_0x002c:
            android.support.v7.widget.af r2 = r4.mo14966b(r0)
            if (r2 != 0) goto L_0x0033
            goto L_0x002a
        L_0x0033:
            int r5 = r4.mo13504a(r0, r5, r6)
            r6 = -1
            if (r5 != r6) goto L_0x003b
            goto L_0x002a
        L_0x003b:
            r2.f4778g = r5
            r0.mo5022a(r2)
            r5 = 1
        L_0x0041:
            if (r5 == 0) goto L_0x0044
            return r3
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.p425c.C8540c.mo5078a(int, int):boolean");
    }
}
