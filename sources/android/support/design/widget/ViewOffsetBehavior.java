package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.util.AttributeSet;
import android.view.View;

class ViewOffsetBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    private C0571r f1873a;

    /* renamed from: b */
    private int f1874b;

    /* renamed from: c */
    private int f1875c;

    public ViewOffsetBehavior() {
    }

    /* renamed from: b */
    public int mo1223b() {
        if (this.f1873a != null) {
            return this.f1873a.f2067d;
        }
        return 0;
    }

    /* renamed from: a */
    public boolean mo1222a(int i) {
        if (this.f1873a != null) {
            return this.f1873a.mo1772a(i);
        }
        this.f1874b = i;
        return false;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1456b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo1325a((View) v, i);
    }

    /* renamed from: a */
    public boolean mo934a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo1456b(coordinatorLayout, v, i);
        if (this.f1873a == null) {
            this.f1873a = new C0571r(v);
        }
        C0571r rVar = this.f1873a;
        rVar.f2065b = rVar.f2064a.getTop();
        rVar.f2066c = rVar.f2064a.getLeft();
        rVar.mo1771a();
        if (this.f1874b != 0) {
            this.f1873a.mo1772a(this.f1874b);
            this.f1874b = 0;
        }
        if (this.f1875c != 0) {
            C0571r rVar2 = this.f1873a;
            int i2 = this.f1875c;
            if (rVar2.f2068e != i2) {
                rVar2.f2068e = i2;
                rVar2.mo1771a();
            }
            this.f1875c = 0;
        }
        return true;
    }
}
