package android.support.p043v7.widget;

import android.graphics.PointF;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1346r.C1348b;
import android.view.View;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

/* renamed from: android.support.v7.widget.ag */
public final class C1416ag extends C1441av {

    /* renamed from: b */
    private C1422ak f5110b;

    /* renamed from: c */
    private C1422ak f5111c;

    /* renamed from: c */
    private C1422ak m4881c(C1332i iVar) {
        if (this.f5110b == null || this.f5110b.f5119a != iVar) {
            this.f5110b = C1422ak.m4899b(iVar);
        }
        return this.f5110b;
    }

    /* renamed from: d */
    private C1422ak m4882d(C1332i iVar) {
        if (this.f5111c == null || this.f5111c.f5119a != iVar) {
            this.f5111c = C1422ak.m4897a(iVar);
        }
        return this.f5111c;
    }

    /* renamed from: a */
    public final View mo5498a(C1332i iVar) {
        if (iVar.mo4745f()) {
            return m4879a(iVar, m4881c(iVar));
        }
        if (iVar.mo4742e()) {
            return m4879a(iVar, m4882d(iVar));
        }
        return null;
    }

    /* renamed from: b */
    private static float m4880b(C1332i iVar, C1422ak akVar) {
        int s = iVar.mo5062s();
        if (s == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MAX_VALUE;
        View view2 = null;
        int i2 = DynamicTabYellowPointVersion.DEFAULT;
        for (int i3 = 0; i3 < s; i3++) {
            View g = iVar.mo5050g(i3);
            int c = C1332i.m4418c(g);
            if (c != -1) {
                if (c < i) {
                    view = g;
                    i = c;
                }
                if (c > i2) {
                    view2 = g;
                    i2 = c;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(akVar.mo5519b(view), akVar.mo5519b(view2)) - Math.min(akVar.mo5516a(view), akVar.mo5516a(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }

    /* renamed from: a */
    private static View m4879a(C1332i iVar, C1422ak akVar) {
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
            iArr[0] = m4878a(iVar, view, m4882d(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.mo4745f()) {
            iArr[1] = m4878a(iVar, view, m4881c(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: a */
    private static int m4878a(C1332i iVar, View view, C1422ak akVar) {
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
        int i3;
        int i4;
        if (!(iVar instanceof C1348b)) {
            return -1;
        }
        int A = iVar.mo5013A();
        if (A == 0) {
            return -1;
        }
        View a = mo5498a(iVar);
        if (a == null) {
            return -1;
        }
        int c = C1332i.m4418c(a);
        if (c == -1) {
            return -1;
        }
        int i5 = A - 1;
        PointF d = ((C1348b) iVar).mo4738d(i5);
        if (d == null) {
            return -1;
        }
        if (iVar.mo4742e()) {
            i3 = m4877a(iVar, m4882d(iVar), i, 0);
            if (d.x < 0.0f) {
                i3 = -i3;
            }
        } else {
            i3 = 0;
        }
        if (iVar.mo4745f()) {
            i4 = m4877a(iVar, m4881c(iVar), 0, i2);
            if (d.y < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (iVar.mo4745f()) {
            i3 = i4;
        }
        if (i3 == 0) {
            return -1;
        }
        int i6 = c + i3;
        if (i6 < 0) {
            i6 = 0;
        }
        if (i6 >= A) {
            i6 = i5;
        }
        return i6;
    }

    /* renamed from: a */
    private int m4877a(C1332i iVar, C1422ak akVar, int i, int i2) {
        int i3;
        int[] b = mo5635b(i, i2);
        float b2 = m4880b(iVar, akVar);
        if (b2 <= 0.0f) {
            return 0;
        }
        if (Math.abs(b[0]) > Math.abs(b[1])) {
            i3 = b[0];
        } else {
            i3 = b[1];
        }
        return Math.round(((float) i3) / b2);
    }
}
