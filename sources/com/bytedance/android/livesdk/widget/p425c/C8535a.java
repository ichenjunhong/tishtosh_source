package com.bytedance.android.livesdk.widget.p425c;

import android.graphics.PointF;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1346r.C1347a;
import android.support.p043v7.widget.RecyclerView.C1346r.C1348b;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.DisplayMetrics;
import android.view.View;
import com.bytedance.android.live.uikit.p257c.C4206c;

/* renamed from: com.bytedance.android.livesdk.widget.c.a */
public class C8535a extends C8540c {

    /* renamed from: a */
    private int f23413a = 1;

    /* renamed from: c */
    private int f23414c = 1;

    /* renamed from: d */
    private C8537b f23415d;

    /* renamed from: e */
    private C8537b f23416e;

    /* renamed from: b */
    private int m16807b() {
        return this.f23413a * this.f23414c;
    }

    /* renamed from: c */
    private int m16809c(int i) {
        return i / m16807b();
    }

    /* renamed from: a */
    public final C8535a mo14964a(int i) {
        if (this.f23413a > 0) {
            this.f23413a = i;
            return this;
        }
        throw new IllegalArgumentException("row must be greater than zero");
    }

    /* renamed from: b */
    public final C8535a mo14967b(int i) {
        if (this.f23414c > 0) {
            this.f23414c = 4;
            return this;
        }
        throw new IllegalArgumentException("column must be greater than zero");
    }

    /* renamed from: c */
    private C8537b m16810c(C1332i iVar) {
        if (this.f23415d == null || this.f23415d.f23418a != iVar) {
            this.f23415d = C8537b.m16823b(iVar);
        }
        return this.f23415d;
    }

    /* renamed from: d */
    private C8537b m16811d(C1332i iVar) {
        if (this.f23416e == null || this.f23416e.f23418a != iVar) {
            this.f23416e = C8537b.m16822a(iVar);
        }
        return this.f23416e;
    }

    /* renamed from: a */
    public View mo13505a(C1332i iVar) {
        if (iVar.mo4745f()) {
            return m16806a(iVar, m16810c(iVar));
        }
        if (iVar.mo4742e()) {
            return m16806a(iVar, m16811d(iVar));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C1415af mo14966b(C1332i iVar) {
        if (!(iVar instanceof C1348b)) {
            return null;
        }
        return new C1415af(this.f23422b.getContext()) {
            /* renamed from: c */
            public final PointF mo5111c(int i) {
                return null;
            }

            /* renamed from: a */
            public final float mo5490a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* renamed from: b */
            public final int mo5495b(int i) {
                return Math.min(100, super.mo5495b(i));
            }

            /* renamed from: a */
            public final void mo5110a(View view, C1349s sVar, C1347a aVar) {
                int[] a = C8535a.this.mo14965a(C8535a.this.f23422b.getLayoutManager(), view);
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
    private static View m16808b(C1332i iVar, C8537b bVar) {
        int s = iVar.mo5062s();
        View view = null;
        if (s == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < s; i2++) {
            View g = iVar.mo5050g(i2);
            int a = bVar.mo14969a(g);
            if (a < i) {
                view = g;
                i = a;
            }
        }
        return view;
    }

    /* renamed from: a */
    public final int[] mo14965a(C1332i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.mo4742e()) {
            iArr[0] = m16805a(iVar, view, m16811d(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.mo4745f()) {
            iArr[1] = m16805a(iVar, view, m16810c(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: a */
    private static View m16806a(C1332i iVar, C8537b bVar) {
        int i;
        int s = iVar.mo5062s();
        View view = null;
        if (s == 0) {
            return null;
        }
        if (iVar.mo5058o()) {
            i = bVar.mo14968a() + (bVar.mo14972c() / 2);
        } else {
            i = bVar.mo14970b() / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < s; i3++) {
            View g = iVar.mo5050g(i3);
            int abs = Math.abs((bVar.mo14969a(g) + (bVar.mo14973c(g) / 2)) - i);
            if (abs < i2) {
                view = g;
                i2 = abs;
            }
        }
        return view;
    }

    /* renamed from: a */
    private int m16805a(C1332i iVar, View view, C8537b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean a = C4206c.m10426a(this.f23422b.getContext());
        if (iVar.mo4742e()) {
            int width = this.f23422b.getWidth() / this.f23414c;
            int c = C1332i.m4418c(view);
            int c2 = m16809c(c) * m16807b();
            if (a) {
                i3 = ((m16807b() - (c - c2)) / this.f23413a) * width;
            } else {
                i3 = ((c - c2) / this.f23413a) * width;
            }
            if (a) {
                i4 = bVar.mo14971b(view);
            } else {
                i4 = bVar.mo14969a(view);
            }
            int i5 = i4 - i3;
            if (i5 > 5 || i5 < -5) {
                return i5;
            }
            return 0;
        }
        int height = this.f23422b.getHeight() / this.f23413a;
        int c3 = C1332i.m4418c(view);
        int c4 = m16809c(c3) * m16807b();
        if (a) {
            i = ((m16807b() - (c3 - c4)) / this.f23414c) * height;
        } else {
            i = ((c3 - c4) / this.f23414c) * height;
        }
        if (a) {
            i2 = bVar.mo14971b(view);
        } else {
            i2 = bVar.mo14969a(view);
        }
        int i6 = i2 - i;
        if (i6 > 5 || i6 < -5) {
            return i6;
        }
        return 0;
    }

    /* renamed from: a */
    public int mo13504a(C1332i iVar, int i, int i2) {
        boolean z;
        int A = iVar.mo5013A();
        if (A == 0) {
            return -1;
        }
        View view = null;
        if (iVar.mo4745f()) {
            view = m16808b(iVar, m16810c(iVar));
        } else if (iVar.mo4742e()) {
            view = m16808b(iVar, m16811d(iVar));
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
        int c2 = m16809c(c) * m16807b();
        if (z2) {
            if (z) {
                c2 -= m16807b();
            }
            return c2;
        } else if (z) {
            return c2 + m16807b();
        } else {
            return (c2 + m16807b()) - 1;
        }
    }
}
