package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.C1063y;
import android.support.p030v4.view.C1067z;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.a */
abstract class C1383a extends ViewGroup {

    /* renamed from: a */
    protected final C1384a f4962a;

    /* renamed from: b */
    protected final Context f4963b;

    /* renamed from: c */
    protected ActionMenuView f4964c;

    /* renamed from: d */
    protected ActionMenuPresenter f4965d;

    /* renamed from: e */
    protected int f4966e;

    /* renamed from: f */
    protected C1063y f4967f;

    /* renamed from: g */
    private boolean f4968g;

    /* renamed from: h */
    private boolean f4969h;

    /* renamed from: android.support.v7.widget.a$a */
    protected class C1384a implements C1067z {

        /* renamed from: a */
        int f4970a;

        /* renamed from: c */
        private boolean f4972c;

        /* renamed from: c */
        public final void mo3182c(View view) {
            this.f4972c = true;
        }

        protected C1384a() {
        }

        /* renamed from: a */
        public final void mo3180a(View view) {
            C1383a.super.setVisibility(0);
            this.f4972c = false;
        }

        /* renamed from: b */
        public final void mo3181b(View view) {
            if (!this.f4972c) {
                C1383a.this.f4967f = null;
                C1383a.super.setVisibility(this.f4970a);
            }
        }

        /* renamed from: a */
        public final C1384a mo5438a(C1063y yVar, int i) {
            C1383a.this.f4967f = yVar;
            this.f4970a = i;
            return this;
        }
    }

    /* renamed from: a */
    protected static int m4787a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int getContentHeight() {
        return this.f4966e;
    }

    public int getAnimatedVisibility() {
        if (this.f4967f != null) {
            return this.f4962a.f4970a;
        }
        return getVisibility();
    }

    /* renamed from: a */
    public boolean mo4348a() {
        if (this.f4965d != null) {
            return this.f4965d.mo4415d();
        }
        return false;
    }

    C1383a(Context context) {
        this(context, null);
    }

    public void setContentHeight(int i) {
        this.f4966e = i;
        requestLayout();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4968g = false;
        }
        if (!this.f4968g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4968g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4968g = false;
        }
        return true;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f4967f != null) {
                this.f4967f.mo3251b();
            }
            super.setVisibility(i);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4969h = false;
        }
        if (!this.f4969h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4969h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4969h = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, new int[]{R.attr.bt, R.attr.bw, R.attr.bx, R.attr.i5, R.attr.i6, R.attr.i7, R.attr.i8, R.attr.i9, R.attr.i_, R.attr.j8, R.attr.js, R.attr.jt, R.attr.k_, R.attr.n0, R.attr.n7, R.attr.nh, R.attr.ni, R.attr.nl, R.attr.oc, R.attr.po, R.attr.t8, R.attr.un, R.attr.vs, R.attr.wa, R.attr.wb, R.attr.a3v, R.attr.a3y, R.attr.a6u, R.attr.a76}, R.attr.f, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        if (this.f4965d != null) {
            this.f4965d.mo4412a(configuration);
        }
    }

    C1383a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public C1063y mo4346a(int i, long j) {
        if (this.f4967f != null) {
            this.f4967f.mo3251b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C1063y a = C1056u.m3067m(this).mo3244a(1.0f);
            a.mo3245a(j);
            a.mo3247a((C1067z) this.f4962a.mo5438a(a, i));
            return a;
        }
        C1063y a2 = C1056u.m3067m(this).mo3244a(0.0f);
        a2.mo3245a(j);
        a2.mo3247a((C1067z) this.f4962a.mo5438a(a2, i));
        return a2;
    }

    C1383a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4962a = new C1384a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.c, typedValue, true) || typedValue.resourceId == 0) {
            this.f4963b = context;
        } else {
            this.f4963b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: a */
    protected static int m4788a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, DynamicTabYellowPointVersion.DEFAULT), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    /* renamed from: a */
    protected static int m4789a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }
}
