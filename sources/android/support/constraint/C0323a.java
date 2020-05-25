package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.constraint.p020a.p021a.C0325a;
import android.util.AttributeSet;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.constraint.a */
public final class C0323a extends ConstraintHelper {

    /* renamed from: f */
    private int f898f;

    /* renamed from: g */
    private int f899g;

    /* renamed from: h */
    private C0325a f900h;

    public final int getType() {
        return this.f898f;
    }

    public C0323a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public final void setType(int i) {
        boolean z;
        this.f898f = i;
        this.f899g = i;
        if (VERSION.SDK_INT >= 17) {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f898f == 5) {
                    this.f899g = 1;
                } else if (this.f898f == 6) {
                    this.f899g = 0;
                }
            } else if (this.f898f == 5) {
                this.f899g = 0;
            } else if (this.f898f == 6) {
                this.f899g = 1;
            }
        } else if (this.f898f == 5) {
            this.f899g = 0;
        } else if (this.f898f == 6) {
            this.f899g = 1;
        }
        this.f900h.f912a = this.f899g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo639a(AttributeSet attributeSet) {
        super.mo639a(attributeSet);
        this.f900h = new C0325a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16843039, 16843040, 16843071, 16843072, R.attr.c4, R.attr.c5, R.attr.e_, R.attr.hz, R.attr.i0, R.attr.qi, R.attr.qj, R.attr.qk, R.attr.ql, R.attr.qm, R.attr.qn, R.attr.qo, R.attr.qp, R.attr.qq, R.attr.qr, R.attr.qs, R.attr.qt, R.attr.qu, R.attr.qv, R.attr.qw, R.attr.qx, R.attr.qy, R.attr.qz, R.attr.r0, R.attr.r1, R.attr.r2, R.attr.r3, R.attr.r4, R.attr.r5, R.attr.r6, R.attr.r7, R.attr.r8, R.attr.r9, R.attr.r_, R.attr.ra, R.attr.rb, R.attr.rc, R.attr.rd, R.attr.re, R.attr.rf, R.attr.rg, R.attr.rh, R.attr.ri, R.attr.rj, R.attr.rk, R.attr.rl, R.attr.rn, R.attr.ro, R.attr.rp, R.attr.rq, R.attr.rr, R.attr.rs, R.attr.rt, R.attr.ru, R.attr.ry});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 5) {
                    this.f900h.f914b = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.f795d = this.f900h;
        mo637a();
    }
}
