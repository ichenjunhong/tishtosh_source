package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.p020a.p021a.C0339h;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;

public abstract class ConstraintHelper extends View {

    /* renamed from: a */
    protected int[] f792a = new int[32];

    /* renamed from: b */
    protected int f793b;

    /* renamed from: c */
    protected Context f794c;

    /* renamed from: d */
    protected C0339h f795d;

    /* renamed from: e */
    protected boolean f796e;

    /* renamed from: f */
    private String f797f;

    /* renamed from: b */
    public void mo640b(ConstraintLayout constraintLayout) {
    }

    public void onDraw(Canvas canvas) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f792a, this.f793b);
    }

    /* renamed from: a */
    public final void mo637a() {
        if (this.f795d != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).f856al = this.f795d;
            }
        }
    }

    public ConstraintHelper(Context context) {
        super(context);
        this.f794c = context;
        mo639a((AttributeSet) null);
    }

    public void setReferencedIds(int[] iArr) {
        this.f793b = 0;
        for (int tag : iArr) {
            setTag(tag, null);
        }
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m696a(str.substring(i));
                    return;
                } else {
                    m696a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo638a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f797f);
        }
        if (this.f795d != null) {
            this.f795d.mo753x();
            for (int i = 0; i < this.f793b; i++) {
                View findViewById = constraintLayout.findViewById(this.f792a[i]);
                if (findViewById != null) {
                    this.f795d.mo752a(constraintLayout.mo646a(findViewById));
                }
            }
        }
    }

    /* renamed from: a */
    private void m696a(String str) {
        Object obj;
        if (str != null && this.f794c != null) {
            String trim = str.trim();
            int i = 0;
            try {
                i = R$id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
            }
            if (i == 0) {
                i = this.f794c.getResources().getIdentifier(trim, "id", this.f794c.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
                if (trim instanceof String) {
                    String str2 = trim;
                    if (constraintLayout.f800c != null && constraintLayout.f800c.containsKey(str2)) {
                        obj = constraintLayout.f800c.get(str2);
                        if (obj != null && (obj instanceof Integer)) {
                            i = ((Integer) obj).intValue();
                        }
                    }
                }
                obj = null;
                i = ((Integer) obj).intValue();
            }
            if (i != 0) {
                setTag(i, null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo639a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16843039, 16843040, 16843071, 16843072, R.attr.c4, R.attr.c5, R.attr.e_, R.attr.hz, R.attr.i0, R.attr.qi, R.attr.qj, R.attr.qk, R.attr.ql, R.attr.qm, R.attr.qn, R.attr.qo, R.attr.qp, R.attr.qq, R.attr.qr, R.attr.qs, R.attr.qt, R.attr.qu, R.attr.qv, R.attr.qw, R.attr.qx, R.attr.qy, R.attr.qz, R.attr.r0, R.attr.r1, R.attr.r2, R.attr.r3, R.attr.r4, R.attr.r5, R.attr.r6, R.attr.r7, R.attr.r8, R.attr.r9, R.attr.r_, R.attr.ra, R.attr.rb, R.attr.rc, R.attr.rd, R.attr.re, R.attr.rf, R.attr.rg, R.attr.rh, R.attr.ri, R.attr.rj, R.attr.rk, R.attr.rl, R.attr.rn, R.attr.ro, R.attr.rp, R.attr.rq, R.attr.rr, R.attr.rs, R.attr.rt, R.attr.ru, R.attr.ry});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    this.f797f = obtainStyledAttributes.getString(index);
                    setIds(this.f797f);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f796e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f794c = context;
        mo639a(attributeSet);
    }

    public void setTag(int i, Object obj) {
        if (this.f793b + 1 > this.f792a.length) {
            this.f792a = Arrays.copyOf(this.f792a, this.f792a.length * 2);
        }
        this.f792a[this.f793b] = i;
        this.f793b++;
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f794c = context;
        mo639a(attributeSet);
    }
}
