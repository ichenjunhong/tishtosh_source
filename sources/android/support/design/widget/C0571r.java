package android.support.design.widget;

import android.support.p030v4.view.C1056u;
import android.view.View;

/* renamed from: android.support.design.widget.r */
final class C0571r {

    /* renamed from: a */
    final View f2064a;

    /* renamed from: b */
    public int f2065b;

    /* renamed from: c */
    public int f2066c;

    /* renamed from: d */
    public int f2067d;

    /* renamed from: e */
    public int f2068e;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1771a() {
        C1056u.m3058g(this.f2064a, this.f2067d - (this.f2064a.getTop() - this.f2065b));
        C1056u.m3060h(this.f2064a, this.f2068e - (this.f2064a.getLeft() - this.f2066c));
    }

    public C0571r(View view) {
        this.f2064a = view;
    }

    /* renamed from: a */
    public final boolean mo1772a(int i) {
        if (this.f2067d == i) {
            return false;
        }
        this.f2067d = i;
        mo1771a();
        return true;
    }
}
