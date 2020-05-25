package android.support.p043v7.widget;

import android.graphics.PointF;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1346r.C1347a;
import android.support.p043v7.widget.RecyclerView.C1346r.C1348b;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: android.support.v7.widget.al */
public final class C1425al extends C1441av {

    /* renamed from: b */
    private C1422ak f5122b;

    /* renamed from: c */
    private C1422ak f5123c;

    /* renamed from: c */
    private C1422ak m4946c(C1332i iVar) {
        if (this.f5122b == null || this.f5122b.f5119a != iVar) {
            this.f5122b = C1422ak.m4899b(iVar);
        }
        return this.f5122b;
    }

    /* renamed from: d */
    private C1422ak m4947d(C1332i iVar) {
        if (this.f5123c == null || this.f5123c.f5119a != iVar) {
            this.f5123c = C1422ak.m4897a(iVar);
        }
        return this.f5123c;
    }

    /* renamed from: a */
    public final View mo5498a(C1332i iVar) {
        if (iVar.mo4745f()) {
            return m4944a(iVar, m4946c(iVar));
        }
        if (iVar.mo4742e()) {
            return m4944a(iVar, m4947d(iVar));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C1415af mo5530b(C1332i iVar) {
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
            /* renamed from: b */
            public final int mo5495b(int i) {
                return Math.min(100, super.mo5495b(i));
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo5110a(View view, C1349s sVar, C1347a aVar) {
                int[] a = C1425al.this.mo5499a(C1425al.this.f5185a.getLayoutManager(), view);
                int i = a[0];
                int i2 = a[1];
                int a2 = mo5491a(Math.max(Math.abs(i), Math.abs(i2)));
                if (a2 > 0) {
                    aVar.mo5113a(i, i2, a2, this.f5105b);
                }
            }
        };
    }

    /* renamed from: b */
    private static View m4945b(C1332i iVar, C1422ak akVar) {
        int s = iVar.mo5062s();
        View view = null;
        if (s == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < s; i2++) {
            View g = iVar.mo5050g(i2);
            int a = akVar.mo5516a(g);
            if (a < i) {
                view = g;
                i = a;
            }
        }
        return view;
    }

    /* renamed from: a */
    private static View m4944a(C1332i iVar, C1422ak akVar) {
        int i;
        int s = iVar.mo5062s();
        View view = null;
        if (s == 0) {
            return null;
        }
        if (iVar.mo5058o()) {
            i = akVar.mo5518b() + (akVar.mo5524e() / 2);
        } else {
            i = akVar.mo5522d() / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < s; i3++) {
            View g = iVar.mo5050g(i3);
            int abs = Math.abs((akVar.mo5516a(g) + (akVar.mo5525e(g) / 2)) - i);
            if (abs < i2) {
                view = g;
                i2 = abs;
            }
        }
        return view;
    }

    /* renamed from: a */
    public final int[] mo5499a(C1332i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.mo4742e()) {
            iArr[0] = m4943a(iVar, view, m4947d(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.mo4745f()) {
            iArr[1] = m4943a(iVar, view, m4946c(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: a */
    private static int m4943a(C1332i iVar, View view, C1422ak akVar) {
        int i;
        int a = akVar.mo5516a(view) + (akVar.mo5525e(view) / 2);
        if (iVar.mo5058o()) {
            i = akVar.mo5518b() + (akVar.mo5524e() / 2);
        } else {
            i = akVar.mo5522d() / 2;
        }
        return a - i;
    }

    /* renamed from: a */
    public final int mo5497a(C1332i iVar, int i, int i2) {
        boolean z;
        int A = iVar.mo5013A();
        if (A == 0) {
            return -1;
        }
        View view = null;
        if (iVar.mo4745f()) {
            view = m4945b(iVar, m4946c(iVar));
        } else if (iVar.mo4742e()) {
            view = m4945b(iVar, m4947d(iVar));
        }
        if (view == null) {
            return -1;
        }
        int c = C1332i.m4418c(view);
        if (c == -1) {
            return -1;
        }
        boolean z2 = false;
        if (!iVar.mo4742e() ? i2 <= 0 : i <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (iVar instanceof C1348b) {
            PointF d = ((C1348b) iVar).mo4738d(A - 1);
            if (d != null && (d.x < 0.0f || d.y < 0.0f)) {
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                c--;
            }
            return c;
        }
        if (z) {
            c++;
        }
        return c;
    }
}
