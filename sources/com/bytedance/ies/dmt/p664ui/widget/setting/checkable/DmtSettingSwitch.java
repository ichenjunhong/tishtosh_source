package com.bytedance.ies.dmt.p664ui.widget.setting.checkable;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch */
public class DmtSettingSwitch extends View {

    /* renamed from: d */
    private static final int[] f28769d = {R.attr.a47};

    /* renamed from: l */
    private static final Property<DmtSettingSwitch, Float> f28770l = new Property<DmtSettingSwitch, Float>(Float.class, "thumbPos") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf(((DmtSettingSwitch) obj).f28771a);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ((DmtSettingSwitch) obj).setThumbPosition(((Float) obj2).floatValue());
        }
    };

    /* renamed from: a */
    public float f28771a;

    /* renamed from: b */
    public boolean f28772b;

    /* renamed from: c */
    ObjectAnimator f28773c;

    /* renamed from: e */
    private Drawable f28774e;

    /* renamed from: f */
    private int f28775f;

    /* renamed from: g */
    private int f28776g;

    /* renamed from: h */
    private int f28777h;

    /* renamed from: i */
    private Rect f28778i;

    /* renamed from: j */
    private RectF f28779j;

    /* renamed from: k */
    private ColorStateList f28780k;

    /* renamed from: m */
    private Paint f28781m;

    /* renamed from: n */
    private int f28782n;

    /* renamed from: o */
    private C10733a f28783o;

    /* renamed from: p */
    private int f28784p;

    /* renamed from: q */
    private VelocityTracker f28785q;

    /* renamed from: r */
    private int f28786r;

    /* renamed from: s */
    private float f28787s;

    /* renamed from: t */
    private float f28788t;

    /* renamed from: u */
    private boolean f28789u;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch$a */
    public interface C10733a {
    }

    public Drawable getThumbDrawable() {
        return this.f28774e;
    }

    public Rect getThumbRect() {
        return this.f28778i;
    }

    public int getTrackPadding() {
        return this.f28776g;
    }

    public int getTrackRadius() {
        return this.f28777h;
    }

    public ColorStateList getTrackTintList() {
        return this.f28780k;
    }

    private int getThumbScrollRange() {
        return getMeasuredWidth() - this.f28775f;
    }

    private boolean getTargetCheckedState() {
        if (this.f28771a > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f;
        if (C1056u.m3055f(this) == 1) {
            f = 1.0f - this.f28771a;
        } else {
            f = this.f28771a;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    public void setEnableTouch(boolean z) {
        this.f28789u = z;
    }

    public void setOnCheckedChangeListener(C10733a aVar) {
        this.f28783o = aVar;
    }

    public void setThumbDrawable(Drawable drawable) {
        this.f28774e = drawable;
    }

    public void setThumbRect(Rect rect) {
        this.f28778i = rect;
    }

    public void setTrackPadding(int i) {
        this.f28776g = i;
    }

    public void setTrackRadius(int i) {
        this.f28777h = i;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f28780k = colorStateList;
    }

    public DmtSettingSwitch(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    public void setThumbPosition(float f) {
        this.f28771a = f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f28772b) {
            mergeDrawableStates(onCreateDrawableState, f28769d);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int[] drawableState = getDrawableState();
        if (this.f28780k != null) {
            this.f28781m.setColor(this.f28780k.getColorForState(drawableState, -65536));
        }
        this.f28779j.left = 0.0f;
        this.f28779j.right = (float) getMeasuredWidth();
        this.f28779j.top = (float) this.f28776g;
        this.f28779j.bottom = (float) (getMeasuredHeight() - this.f28776g);
        canvas.drawRoundRect(this.f28779j, (float) this.f28777h, (float) this.f28777h, this.f28781m);
        this.f28778i.left = getThumbOffset();
        this.f28778i.right = this.f28778i.left + this.f28775f;
        if (this.f28774e != null) {
            this.f28774e.setBounds(this.f28778i);
            this.f28774e.setState(drawableState);
            this.f28774e.draw(canvas);
        }
    }

    public void setChecked(boolean z) {
        if (this.f28772b != z) {
            this.f28772b = z;
        }
        refreshDrawableState();
        float f = 0.0f;
        if (getWindowToken() == null || !C1056u.m3079y(this)) {
            if (this.f28773c != null) {
                this.f28773c.cancel();
            }
            if (z) {
                f = 1.0f;
            }
            setThumbPosition(f);
            return;
        }
        if (z) {
            f = 1.0f;
        }
        this.f28773c = ObjectAnimator.ofFloat(this, f28770l, new float[]{f});
        this.f28773c.setDuration(250);
        if (VERSION.SDK_INT >= 18) {
            this.f28773c.setAutoCancel(true);
        }
        this.f28773c.start();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float f;
        if (!this.f28789u) {
            return false;
        }
        this.f28785q.addMovement(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (isEnabled()) {
                    this.f28786r = 1;
                    this.f28787s = x;
                    this.f28788t = y;
                    break;
                }
                break;
            case 1:
            case 3:
                if (this.f28786r != 2) {
                    this.f28786r = 0;
                    this.f28785q.clear();
                    break;
                } else {
                    this.f28786r = 0;
                    if (motionEvent.getAction() != 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z3 = this.f28772b;
                    if (z) {
                        this.f28785q.computeCurrentVelocity(1000);
                        float xVelocity = this.f28785q.getXVelocity();
                        if (Math.abs(xVelocity) <= ((float) this.f28784p)) {
                            z2 = getTargetCheckedState();
                        } else if (C1056u.m3055f(this) != 1 ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = z3;
                    }
                    if (z2 != z3) {
                        playSoundEffect(0);
                    }
                    setChecked(z2);
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    super.onTouchEvent(obtain);
                    obtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                break;
            case 2:
                switch (this.f28786r) {
                    case 1:
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x2 - this.f28787s) > ((float) this.f28782n) || Math.abs(y2 - this.f28788t) > ((float) this.f28782n)) {
                            this.f28786r = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f28787s = x2;
                            this.f28788t = y2;
                            return true;
                        }
                    case 2:
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f2 = x3 - this.f28787s;
                        if (thumbScrollRange != 0) {
                            f = f2 / ((float) thumbScrollRange);
                        } else if (f2 > 0.0f) {
                            f = 1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (C1056u.m3055f(this) == 1) {
                            f = -f;
                        }
                        float f3 = f + this.f28771a;
                        if (f3 < 0.0f) {
                            f3 = 0.0f;
                        } else if (f3 > 1.0f) {
                            f3 = 1.0f;
                        }
                        if (f3 != this.f28771a) {
                            this.f28787s = x3;
                            setThumbPosition(f3);
                        }
                        return true;
                }
                break;
        }
        return true;
    }

    public DmtSettingSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f28774e == null) {
            super.onMeasure(i, i2);
            return;
        }
        int intrinsicWidth = this.f28774e.getIntrinsicWidth();
        int intrinsicHeight = this.f28774e.getIntrinsicHeight();
        this.f28778i.left = 0;
        this.f28778i.top = 0;
        this.f28778i.right = intrinsicWidth;
        this.f28775f = intrinsicWidth;
        this.f28778i.bottom = intrinsicHeight;
        this.f28774e.setBounds(this.f28778i);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            setMeasuredDimension(size, intrinsicHeight);
        } else {
            setMeasuredDimension(intrinsicWidth * 2, intrinsicHeight);
        }
    }

    public DmtSettingSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28781m = new Paint();
        this.f28785q = VelocityTracker.obtain();
        this.f28789u = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a6j, R.attr.a7m, R.attr.a7n, R.attr.a7o});
        this.f28774e = obtainStyledAttributes.getDrawable(0);
        this.f28780k = obtainStyledAttributes.getColorStateList(3);
        this.f28776g = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f28777h = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        obtainStyledAttributes.recycle();
        this.f28781m.setAntiAlias(true);
        this.f28778i = new Rect();
        this.f28779j = new RectF();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f28782n = viewConfiguration.getScaledTouchSlop();
        this.f28784p = viewConfiguration.getScaledMinimumFlingVelocity();
    }
}
