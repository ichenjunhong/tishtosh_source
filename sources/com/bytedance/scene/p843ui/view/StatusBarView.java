package com.bytedance.scene.p843ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.view.C1018ac;
import android.support.p030v4.view.C1051p;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.scene.ui.view.StatusBarView */
public final class StatusBarView extends View {

    /* renamed from: c */
    private static final int[] f33986c = {R.attr.fy};

    /* renamed from: a */
    public C1018ac f33987a;

    /* renamed from: b */
    public final Runnable f33988b = new Runnable() {
        public final void run() {
            StatusBarView.this.requestLayout();
        }
    };

    /* renamed from: d */
    private boolean f33989d = true;

    /* renamed from: e */
    private Drawable f33990e;

    public final Drawable getStatusBarBackgroundDrawable() {
        return this.f33990e;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m26107a() {
        C1056u.m3032a((View) this, (C1051p) new C1051p() {
            /* renamed from: a */
            public final C1018ac mo1130a(View view, C1018ac acVar) {
                if (StatusBarView.this.getVisibility() == 8) {
                    StatusBarView.this.f33987a = null;
                    return acVar;
                }
                if (!new C1018ac(acVar).equals(StatusBarView.this.f33987a)) {
                    StatusBarView.this.f33987a = new C1018ac(acVar);
                    StatusBarView.this.post(StatusBarView.this.f33988b);
                }
                return new C1018ac(acVar).mo3185a(acVar.mo3184a(), 0, acVar.mo3187c(), acVar.mo3188d());
            }
        });
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(f33986c);
        try {
            this.f33990e = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            C1056u.m3048c((View) this, TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setStatusBarBackground(Drawable drawable) {
        this.f33990e = drawable;
        invalidate();
    }

    public final void setStatusBarBackgroundColor(int i) {
        this.f33990e = new ColorDrawable(i);
        invalidate();
    }

    public StatusBarView(Context context) {
        super(context);
        m26107a();
    }

    public final void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0726c.m2091a(getContext(), i);
        } else {
            drawable = null;
        }
        this.f33990e = drawable;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f33989d && this.f33990e != null) {
            if (VERSION.SDK_INT < 21 || this.f33987a == null) {
                i = 0;
            } else {
                i = this.f33987a.mo3186b();
            }
            if (i > 0) {
                this.f33990e.setBounds(0, 0, getWidth(), i);
                this.f33990e.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private static int m26106a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0 || mode != 1073741824) {
            return i;
        }
        return size;
    }

    /* renamed from: b */
    private void m26108b(int i, int i2) {
        setMeasuredDimension(m26106a(getSuggestedMinimumWidth(), i), m26106a(getSuggestedMinimumHeight(), i2));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f33987a != null) {
            m26108b(i, MeasureSpec.makeMeasureSpec(this.f33987a.mo3186b(), 1073741824));
        } else {
            m26108b(i, i2);
        }
    }

    public StatusBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26107a();
    }

    public StatusBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26107a();
    }
}
