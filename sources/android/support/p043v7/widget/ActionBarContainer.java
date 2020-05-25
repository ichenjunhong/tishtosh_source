package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.ActionBarContainer */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    Drawable f4323a;

    /* renamed from: b */
    Drawable f4324b;

    /* renamed from: c */
    Drawable f4325c;

    /* renamed from: d */
    boolean f4326d;

    /* renamed from: e */
    boolean f4327e;

    /* renamed from: f */
    private boolean f4328f;

    /* renamed from: g */
    private View f4329g;

    /* renamed from: h */
    private View f4330h;

    /* renamed from: i */
    private View f4331i;

    /* renamed from: j */
    private int f4332j;

    public View getTabContainer() {
        return this.f4329g;
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f4323a != null) {
            this.f4323a.jumpToCurrentState();
        }
        if (this.f4324b != null) {
            this.f4324b.jumpToCurrentState();
        }
        if (this.f4325c != null) {
            this.f4325c.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f4330h = findViewById(R.id.a4);
        this.f4331i = findViewById(R.id.ad);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4323a != null && this.f4323a.isStateful()) {
            this.f4323a.setState(getDrawableState());
        }
        if (this.f4324b != null && this.f4324b.isStateful()) {
            this.f4324b.setState(getDrawableState());
        }
        if (this.f4325c != null && this.f4325c.isStateful()) {
            this.f4325c.setState(getDrawableState());
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f4328f || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setTransitioning(boolean z) {
        int i;
        this.f4328f = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    /* renamed from: a */
    private static boolean m3977a(View view) {
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static int m3978b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public void setTabContainer(C1436at atVar) {
        if (this.f4329g != null) {
            removeView(this.f4329g);
        }
        this.f4329g = atVar;
        if (atVar != null) {
            addView(atVar);
            ViewGroup.LayoutParams layoutParams = atVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            atVar.setAllowCollapse(false);
        }
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f4323a != null) {
            this.f4323a.setVisible(z, false);
        }
        if (this.f4324b != null) {
            this.f4324b.setVisible(z, false);
        }
        if (this.f4325c != null) {
            this.f4325c.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if ((drawable != this.f4323a || this.f4326d) && ((drawable != this.f4324b || !this.f4327e) && ((drawable != this.f4325c || !this.f4326d) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        if (this.f4323a != null) {
            this.f4323a.setCallback(null);
            unscheduleDrawable(this.f4323a);
        }
        this.f4323a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4330h != null) {
                this.f4323a.setBounds(this.f4330h.getLeft(), this.f4330h.getTop(), this.f4330h.getRight(), this.f4330h.getBottom());
            }
        }
        boolean z = false;
        if (!this.f4326d ? this.f4323a == null && this.f4324b == null : this.f4325c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        if (this.f4325c != null) {
            this.f4325c.setCallback(null);
            unscheduleDrawable(this.f4325c);
        }
        this.f4325c = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4326d && this.f4325c != null) {
                this.f4325c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f4326d ? this.f4323a == null && this.f4324b == null : this.f4325c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        if (this.f4324b != null) {
            this.f4324b.setCallback(null);
            unscheduleDrawable(this.f4324b);
        }
        this.f4324b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4327e && this.f4324b != null) {
                this.f4324b.setBounds(this.f4329g.getLeft(), this.f4329g.getTop(), this.f4329g.getRight(), this.f4329g.getBottom());
            }
        }
        boolean z = false;
        if (!this.f4326d ? this.f4323a == null && this.f4324b == null : this.f4325c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f4330h == null && MeasureSpec.getMode(i2) == Integer.MIN_VALUE && this.f4332j >= 0) {
            i2 = MeasureSpec.makeMeasureSpec(Math.min(this.f4332j, MeasureSpec.getSize(i2)), DynamicTabYellowPointVersion.DEFAULT);
        }
        super.onMeasure(i, i2);
        if (this.f4330h != null) {
            int mode = MeasureSpec.getMode(i2);
            if (!(this.f4329g == null || this.f4329g.getVisibility() == 8 || mode == 1073741824)) {
                if (!m3977a(this.f4330h)) {
                    i3 = m3978b(this.f4330h);
                } else if (!m3977a(this.f4331i)) {
                    i3 = m3978b(this.f4331i);
                } else {
                    i3 = 0;
                }
                if (mode == Integer.MIN_VALUE) {
                    i4 = MeasureSpec.getSize(i2);
                } else {
                    i4 = Integer.MAX_VALUE;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m3978b(this.f4329g), i4));
            }
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1056u.m3030a((View) this, (Drawable) new C1449b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bt, R.attr.bw, R.attr.bx, R.attr.i5, R.attr.i6, R.attr.i7, R.attr.i8, R.attr.i9, R.attr.i_, R.attr.j8, R.attr.js, R.attr.jt, R.attr.k_, R.attr.n0, R.attr.n7, R.attr.nh, R.attr.ni, R.attr.nl, R.attr.oc, R.attr.po, R.attr.t8, R.attr.un, R.attr.vs, R.attr.wa, R.attr.wb, R.attr.a3v, R.attr.a3y, R.attr.a6u, R.attr.a76});
        boolean z = false;
        this.f4323a = obtainStyledAttributes.getDrawable(0);
        this.f4324b = obtainStyledAttributes.getDrawable(2);
        this.f4332j = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.cr0) {
            this.f4326d = true;
            this.f4325c = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f4326d ? this.f4323a == null && this.f4324b == null : this.f4325c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f4329g;
        boolean z3 = true;
        boolean z4 = false;
        if (view == null || view.getVisibility() == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (!this.f4326d) {
            if (this.f4323a != null) {
                if (this.f4330h.getVisibility() == 0) {
                    this.f4323a.setBounds(this.f4330h.getLeft(), this.f4330h.getTop(), this.f4330h.getRight(), this.f4330h.getBottom());
                } else if (this.f4331i == null || this.f4331i.getVisibility() != 0) {
                    this.f4323a.setBounds(0, 0, 0, 0);
                } else {
                    this.f4323a.setBounds(this.f4331i.getLeft(), this.f4331i.getTop(), this.f4331i.getRight(), this.f4331i.getBottom());
                }
                z4 = true;
            }
            this.f4327e = z2;
            if (!z2 || this.f4324b == null) {
                z3 = z4;
            } else {
                this.f4324b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        } else if (this.f4325c != null) {
            this.f4325c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            z3 = false;
        }
        if (z3) {
            invalidate();
        }
    }
}
