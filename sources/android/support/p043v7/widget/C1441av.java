package android.support.p043v7.widget;

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
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

/* renamed from: android.support.v7.widget.av */
public abstract class C1441av extends C1338k {

    /* renamed from: a */
    RecyclerView f5185a;

    /* renamed from: b */
    private Scroller f5186b;

    /* renamed from: c */
    private final C1340m f5187c = new C1340m() {

        /* renamed from: a */
        boolean f5188a;

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f5188a) {
                this.f5188a = false;
                C1441av.this.mo5633a();
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f5188a = true;
            }
        }
    };

    /* renamed from: a */
    public abstract int mo5497a(C1332i iVar, int i, int i2);

    /* renamed from: a */
    public abstract View mo5498a(C1332i iVar);

    /* renamed from: a */
    public abstract int[] mo5499a(C1332i iVar, View view);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5633a() {
        if (this.f5185a != null) {
            C1332i layoutManager = this.f5185a.getLayoutManager();
            if (layoutManager != null) {
                View a = mo5498a(layoutManager);
                if (a != null) {
                    int[] a2 = mo5499a(layoutManager, a);
                    if (!(a2[0] == 0 && a2[1] == 0)) {
                        this.f5185a.mo4795a(a2[0], a2[1]);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1415af mo5530b(C1332i iVar) {
        if (!(iVar instanceof C1348b)) {
            return null;
        }
        return new C1415af(this.f5185a.getContext()) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final float mo5490a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo5110a(View view, C1349s sVar, C1347a aVar) {
                if (C1441av.this.f5185a != null) {
                    int[] a = C1441av.this.mo5499a(C1441av.this.f5185a.getLayoutManager(), view);
                    int i = a[0];
                    int i2 = a[1];
                    int a2 = mo5491a(Math.max(Math.abs(i), Math.abs(i2)));
                    if (a2 > 0) {
                        aVar.mo5113a(i, i2, a2, this.f5105b);
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo5634a(RecyclerView recyclerView) throws IllegalStateException {
        if (this.f5185a != recyclerView) {
            if (this.f5185a != null) {
                this.f5185a.mo4818b(this.f5187c);
                this.f5185a.setOnFlingListener(null);
            }
            this.f5185a = recyclerView;
            if (this.f5185a != null) {
                if (this.f5185a.getOnFlingListener() == null) {
                    this.f5185a.mo4801a(this.f5187c);
                    this.f5185a.setOnFlingListener(this);
                    this.f5186b = new Scroller(this.f5185a.getContext(), new DecelerateInterpolator());
                    mo5633a();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
    }

    /* renamed from: b */
    public final int[] mo5635b(int i, int i2) {
        this.f5186b.fling(0, 0, i, i2, DynamicTabYellowPointVersion.DEFAULT, Integer.MAX_VALUE, DynamicTabYellowPointVersion.DEFAULT, Integer.MAX_VALUE);
        return new int[]{this.f5186b.getFinalX(), this.f5186b.getFinalY()};
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5078a(int r5, int r6) {
        /*
            r4 = this;
            android.support.v7.widget.RecyclerView r0 = r4.f5185a
            android.support.v7.widget.RecyclerView$i r0 = r0.getLayoutManager()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.support.v7.widget.RecyclerView r2 = r4.f5185a
            android.support.v7.widget.RecyclerView$a r2 = r2.getAdapter()
            if (r2 != 0) goto L_0x0013
            return r1
        L_0x0013:
            android.support.v7.widget.RecyclerView r2 = r4.f5185a
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
            android.support.v7.widget.af r2 = r4.mo5530b(r0)
            if (r2 != 0) goto L_0x0033
            goto L_0x002a
        L_0x0033:
            int r5 = r4.mo5497a(r0, r5, r6)
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.C1441av.mo5078a(int, int):boolean");
    }
}
