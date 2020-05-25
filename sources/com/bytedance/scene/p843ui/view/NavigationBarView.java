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
import android.view.View;
import android.view.View.MeasureSpec;

/* renamed from: com.bytedance.scene.ui.view.NavigationBarView */
public final class NavigationBarView extends View {

    /* renamed from: a */
    public C1018ac f33980a;

    /* renamed from: b */
    public final Runnable f33981b = new Runnable() {
        public final void run() {
            NavigationBarView.this.requestLayout();
        }
    };

    /* renamed from: c */
    private boolean f33982c = true;

    /* renamed from: d */
    private Drawable f33983d;

    public final Drawable getNavigationBarBackgroundDrawable() {
        return this.f33983d;
    }

    /* renamed from: a */
    private void m26103a() {
        C1056u.m3032a((View) this, (C1051p) new C1051p() {
            /* renamed from: a */
            public final C1018ac mo1130a(View view, C1018ac acVar) {
                if (NavigationBarView.this.getVisibility() == 8) {
                    NavigationBarView.this.f33980a = null;
                    return acVar;
                }
                if (!new C1018ac(acVar).equals(NavigationBarView.this.f33980a)) {
                    NavigationBarView.this.f33980a = new C1018ac(acVar);
                    NavigationBarView.this.post(NavigationBarView.this.f33981b);
                }
                return new C1018ac(acVar).mo3185a(acVar.mo3184a(), acVar.mo3186b(), acVar.mo3187c(), 0);
            }
        });
        if (VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843858});
            try {
                this.f33983d = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final void setNavigationBarBackground(Drawable drawable) {
        this.f33983d = drawable;
        invalidate();
    }

    public final void setNavigationBarBackgroundColor(int i) {
        this.f33983d = new ColorDrawable(i);
        invalidate();
    }

    public NavigationBarView(Context context) {
        super(context);
        m26103a();
    }

    public final void setNavigationBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0726c.m2091a(getContext(), i);
        } else {
            drawable = null;
        }
        this.f33983d = drawable;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f33982c && this.f33983d != null) {
            if (VERSION.SDK_INT < 21 || this.f33980a == null) {
                i = 0;
            } else {
                i = this.f33980a.mo3188d();
            }
            if (i > 0) {
                this.f33983d.setBounds(0, getHeight() - i, getWidth(), getHeight());
                this.f33983d.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private static int m26102a(int i, int i2) {
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
    private void m26104b(int i, int i2) {
        setMeasuredDimension(m26102a(getSuggestedMinimumWidth(), i), m26102a(getSuggestedMinimumHeight(), i2));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f33980a != null) {
            m26104b(i, MeasureSpec.makeMeasureSpec(this.f33980a.mo3188d(), 1073741824));
        } else {
            m26104b(i, i2);
        }
    }

    public NavigationBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26103a();
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26103a();
    }
}
