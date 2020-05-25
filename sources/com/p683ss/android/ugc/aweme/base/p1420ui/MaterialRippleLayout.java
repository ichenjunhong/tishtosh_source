package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.MaterialRippleLayout */
public class MaterialRippleLayout extends RelativeLayout {

    /* renamed from: A */
    private int f62965A;

    /* renamed from: B */
    private GestureDetector f62966B;

    /* renamed from: C */
    private C23632a f62967C;

    /* renamed from: D */
    private C23633b f62968D;

    /* renamed from: E */
    private SimpleOnGestureListener f62969E;

    /* renamed from: F */
    private Property<MaterialRippleLayout, Integer> f62970F;

    /* renamed from: a */
    public boolean f62971a;

    /* renamed from: b */
    int f62972b;

    /* renamed from: c */
    public int f62973c;

    /* renamed from: d */
    public boolean f62974d;

    /* renamed from: e */
    public boolean f62975e;

    /* renamed from: f */
    public boolean f62976f;

    /* renamed from: g */
    public View f62977g;

    /* renamed from: h */
    ObjectAnimator f62978h;

    /* renamed from: i */
    boolean f62979i;

    /* renamed from: j */
    public boolean f62980j;

    /* renamed from: k */
    public boolean f62981k;

    /* renamed from: l */
    Property<MaterialRippleLayout, Float> f62982l;

    /* renamed from: m */
    private final Paint f62983m;

    /* renamed from: n */
    private final Rect f62984n;

    /* renamed from: o */
    private int f62985o;

    /* renamed from: p */
    private boolean f62986p;

    /* renamed from: q */
    private int f62987q;

    /* renamed from: r */
    private int f62988r;

    /* renamed from: s */
    private Drawable f62989s;

    /* renamed from: t */
    private float f62990t;

    /* renamed from: u */
    private float f62991u;

    /* renamed from: v */
    private AdapterView f62992v;

    /* renamed from: w */
    private AnimatorSet f62993w;

    /* renamed from: x */
    private Point f62994x;

    /* renamed from: y */
    private Point f62995y;

    /* renamed from: z */
    private int f62996z;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.MaterialRippleLayout$a */
    class C23632a implements Runnable {
        public final void run() {
            if (!MaterialRippleLayout.this.f62981k) {
                if (MaterialRippleLayout.this.getParent() instanceof AdapterView) {
                    if (!MaterialRippleLayout.this.f62977g.performClick()) {
                        m57949a((AdapterView) MaterialRippleLayout.this.getParent());
                    }
                } else if (MaterialRippleLayout.this.f62976f) {
                    m57949a(MaterialRippleLayout.this.mo49013b());
                } else {
                    MaterialRippleLayout.this.f62977g.performClick();
                }
            }
        }

        private C23632a() {
        }

        /* renamed from: a */
        private void m57949a(AdapterView adapterView) {
            long j;
            int positionForView = adapterView.getPositionForView(MaterialRippleLayout.this);
            if (adapterView.getAdapter() != null) {
                j = adapterView.getAdapter().getItemId(positionForView);
            } else {
                j = 0;
            }
            if (positionForView != -1) {
                adapterView.performItemClick(MaterialRippleLayout.this, positionForView, j);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.MaterialRippleLayout$b */
    final class C23633b implements Runnable {

        /* renamed from: b */
        private final MotionEvent f63005b;

        public final void run() {
            MaterialRippleLayout.this.f62980j = false;
            MaterialRippleLayout.this.f62977g.setLongClickable(false);
            MaterialRippleLayout.this.f62977g.onTouchEvent(this.f63005b);
            MaterialRippleLayout.this.f62977g.setPressed(true);
            if (MaterialRippleLayout.this.f62971a) {
                MaterialRippleLayout materialRippleLayout = MaterialRippleLayout.this;
                if (!materialRippleLayout.f62979i) {
                    if (materialRippleLayout.f62978h != null) {
                        materialRippleLayout.f62978h.cancel();
                    }
                    float sqrt = (float) (Math.sqrt(Math.pow((double) materialRippleLayout.getWidth(), 2.0d) + Math.pow((double) materialRippleLayout.getHeight(), 2.0d)) * 1.2000000476837158d);
                    materialRippleLayout.f62978h = ObjectAnimator.ofFloat(materialRippleLayout, materialRippleLayout.f62982l, new float[]{(float) materialRippleLayout.f62972b, sqrt}).setDuration(2500);
                    materialRippleLayout.f62978h.setInterpolator(new LinearInterpolator());
                    materialRippleLayout.f62978h.start();
                }
            }
        }

        public C23633b(MotionEvent motionEvent) {
            this.f63005b = motionEvent;
        }
    }

    public <T extends View> T getChildView() {
        return this.f62977g;
    }

    public float getRadius() {
        return this.f62991u;
    }

    public boolean isInEditMode() {
        return true;
    }

    public int getRippleAlpha() {
        return this.f62983m.getAlpha();
    }

    /* renamed from: a */
    public final void mo49010a() {
        if (this.f62968D != null) {
            removeCallbacks(this.f62968D);
            this.f62980j = false;
        }
    }

    /* renamed from: c */
    private void mo85676c() {
        if (this.f62993w != null) {
            this.f62993w.cancel();
            this.f62993w.removeAllListeners();
        }
        if (this.f62978h != null) {
            this.f62978h.cancel();
        }
    }

    /* renamed from: d */
    private void m57945d() {
        if (VERSION.SDK_INT <= 17) {
            if (this.f62990t != 0.0f) {
                this.f62996z = getLayerType();
                setLayerType(1, null);
                return;
            }
            setLayerType(this.f62996z, null);
        }
    }

    /* renamed from: b */
    public final AdapterView mo49013b() {
        if (this.f62992v != null) {
            return this.f62992v;
        }
        ViewParent parent = getParent();
        while (!(parent instanceof AdapterView)) {
            try {
                parent = parent.getParent();
            } catch (NullPointerException unused) {
                throw new RuntimeException("Could not find a parent AdapterView");
            }
        }
        this.f62992v = (AdapterView) parent;
        return this.f62992v;
    }

    private float getEndRadius() {
        int i;
        int i2;
        int width = getWidth();
        int height = getHeight();
        int i3 = height / 2;
        if (width / 2 > this.f62994x.x) {
            i = width - this.f62994x.x;
        } else {
            i = this.f62994x.x;
        }
        float f = (float) i;
        if (i3 > this.f62994x.y) {
            i2 = height - this.f62994x.y;
        } else {
            i2 = this.f62994x.y;
        }
        return ((float) Math.sqrt(Math.pow((double) f, 2.0d) + Math.pow((double) ((float) i2), 2.0d))) * 1.2f;
    }

    public void setRippleDelayClick(boolean z) {
        this.f62974d = z;
    }

    public void setRippleDiameter(int i) {
        this.f62972b = i;
    }

    public void setRippleDuration(int i) {
        this.f62987q = i;
    }

    public void setRippleFadeDuration(int i) {
        this.f62988r = i;
    }

    public void setRippleHover(boolean z) {
        this.f62971a = z;
    }

    public void setRippleInAdapter(boolean z) {
        this.f62976f = z;
    }

    public void setRippleOverlay(boolean z) {
        this.f62986p = z;
    }

    public void setRipplePersistent(boolean z) {
        this.f62975e = z;
    }

    public MaterialRippleLayout(Context context) {
        this(context, null, 0);
    }

    public void setRadius(float f) {
        this.f62991u = f;
        invalidate();
    }

    public void setRippleRoundedCorners(int i) {
        this.f62990t = (float) i;
        m57945d();
    }

    public void setRippleAlpha(Integer num) {
        this.f62983m.setAlpha(num.intValue());
        invalidate();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!m57943a(this.f62977g, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        return false;
    }

    public void setDefaultRippleAlpha(float f) {
        this.f62973c = (int) (f * 255.0f);
        this.f62983m.setAlpha(this.f62973c);
        invalidate();
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        if (this.f62977g != null) {
            this.f62977g.setOnClickListener(onClickListener);
            return;
        }
        throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        if (this.f62977g != null) {
            this.f62977g.setOnLongClickListener(onLongClickListener);
            return;
        }
        throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
    }

    public void setRippleBackground(int i) {
        this.f62989s = new ColorDrawable(i);
        this.f62989s.setBounds(this.f62984n);
        invalidate();
    }

    public void setRippleColor(int i) {
        this.f62985o = i;
        this.f62983m.setColor(i);
        this.f62983m.setAlpha(this.f62973c);
        invalidate();
    }

    /* renamed from: a */
    public final void mo49011a(final Runnable runnable) {
        if (!this.f62979i) {
            float endRadius = getEndRadius();
            mo85676c();
            this.f62993w = new AnimatorSet();
            this.f62993w.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    if (!MaterialRippleLayout.this.f62975e) {
                        MaterialRippleLayout.this.setRadius(0.0f);
                        MaterialRippleLayout.this.setRippleAlpha(Integer.valueOf(MaterialRippleLayout.this.f62973c));
                    }
                    if (runnable != null && MaterialRippleLayout.this.f62974d) {
                        runnable.run();
                    }
                    MaterialRippleLayout.this.f62977g.setPressed(false);
                }
            });
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.f62982l, new float[]{this.f62991u, endRadius});
            ofFloat.setDuration((long) this.f62987q);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, this.f62970F, new int[]{this.f62973c, 0});
            ofInt.setDuration((long) this.f62988r);
            ofInt.setInterpolator(new AccelerateInterpolator());
            ofInt.setStartDelay((long) ((this.f62987q - this.f62988r) - 50));
            if (this.f62975e) {
                this.f62993w.play(ofFloat);
            } else if (getRadius() > endRadius) {
                ofInt.setStartDelay(0);
                this.f62993w.play(ofInt);
            } else {
                this.f62993w.playTogether(new Animator[]{ofFloat, ofInt});
            }
            this.f62993w.start();
        }
    }

    public void draw(Canvas canvas) {
        boolean z;
        boolean z2 = false;
        if (this.f62976f) {
            int positionForView = mo49013b().getPositionForView(this);
            if (positionForView != this.f62965A) {
                z = true;
            } else {
                z = false;
            }
            this.f62965A = positionForView;
            if (z) {
                mo49010a();
                mo85676c();
                this.f62977g.setPressed(false);
                setRadius(0.0f);
            }
            z2 = z;
        }
        if (this.f62986p) {
            if (!z2) {
                this.f62989s.draw(canvas);
            }
            super.draw(canvas);
            if (!z2) {
                if (this.f62990t != 0.0f) {
                    Path path = new Path();
                    path.addRoundRect(new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight()), this.f62990t, this.f62990t, Direction.CW);
                    canvas.clipPath(path);
                }
                canvas.drawCircle((float) this.f62994x.x, (float) this.f62994x.y, this.f62991u, this.f62983m);
            }
        } else {
            if (!z2) {
                this.f62989s.draw(canvas);
                canvas.drawCircle((float) this.f62994x.x, (float) this.f62994x.y, this.f62991u, this.f62983m);
            }
            super.draw(canvas);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!isEnabled() || !this.f62977g.isEnabled()) {
            return onTouchEvent;
        }
        boolean contains = this.f62984n.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (contains) {
            this.f62995y.set(this.f62994x.x, this.f62994x.y);
            this.f62994x.set((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f62966B.onTouchEvent(motionEvent) || this.f62981k) {
            return true;
        }
        boolean z = false;
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (this.f62976f) {
                    this.f62965A = mo49013b().getPositionForView(this);
                }
                this.f62979i = false;
                this.f62968D = new C23633b(motionEvent);
                ViewParent parent = getParent();
                while (true) {
                    if (parent != null && (parent instanceof ViewGroup)) {
                        if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                            z = true;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                if (!z) {
                    this.f62968D.run();
                    break;
                } else {
                    mo49010a();
                    this.f62980j = true;
                    postDelayed(this.f62968D, (long) ViewConfiguration.getTapTimeout());
                    break;
                }
            case 1:
                this.f62967C = new C23632a();
                if (this.f62980j) {
                    this.f62977g.setPressed(true);
                    postDelayed(new Runnable() {
                        public final void run() {
                            MaterialRippleLayout.this.f62977g.setPressed(false);
                        }
                    }, (long) ViewConfiguration.getPressedStateDuration());
                }
                if (contains) {
                    mo49011a(this.f62967C);
                } else if (!this.f62971a) {
                    setRadius(0.0f);
                }
                if (!this.f62974d && contains) {
                    this.f62967C.run();
                }
                mo49010a();
                break;
            case 2:
                if (this.f62971a) {
                    if (contains && !this.f62979i) {
                        invalidate();
                    } else if (!contains) {
                        mo49011a(null);
                    }
                }
                if (!contains) {
                    mo49010a();
                    if (this.f62978h != null) {
                        this.f62978h.cancel();
                    }
                    this.f62977g.onTouchEvent(motionEvent);
                    this.f62979i = true;
                    break;
                }
                break;
            case 3:
                if (this.f62976f) {
                    this.f62994x.set(this.f62995y.x, this.f62995y.y);
                    this.f62995y = new Point();
                }
                this.f62977g.onTouchEvent(motionEvent);
                if (!this.f62971a) {
                    this.f62977g.setPressed(false);
                } else if (!this.f62980j) {
                    mo49011a(null);
                }
                mo49010a();
                break;
        }
        return true;
    }

    public MaterialRippleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            this.f62977g = view;
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("MaterialRippleLayout can host only one child");
    }

    /* renamed from: a */
    private boolean m57943a(View view, int i, int i2) {
        loop0:
        while (true) {
            int i3 = 0;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                while (i3 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i3);
                    Rect rect = new Rect();
                    childAt.getHitRect(rect);
                    if (rect.contains(i, i2)) {
                        i -= rect.left;
                        i2 -= rect.top;
                        view = childAt;
                    } else {
                        i3++;
                    }
                }
                break loop0;
            } else if (view != this.f62977g) {
                if (!view.isEnabled() || (!view.isClickable() && !view.isLongClickable() && !view.isFocusableInTouchMode())) {
                    return false;
                }
                return true;
            }
        }
        return view.isFocusableInTouchMode();
    }

    public MaterialRippleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62983m = new Paint(1);
        this.f62984n = new Rect();
        this.f62994x = new Point();
        this.f62995y = new Point();
        this.f62969E = new SimpleOnGestureListener() {
            public final boolean onDown(MotionEvent motionEvent) {
                MaterialRippleLayout.this.f62981k = false;
                return super.onDown(motionEvent);
            }

            public final void onLongPress(MotionEvent motionEvent) {
                MaterialRippleLayout.this.f62981k = MaterialRippleLayout.this.f62977g.performLongClick();
                if (MaterialRippleLayout.this.f62981k) {
                    if (MaterialRippleLayout.this.f62971a) {
                        MaterialRippleLayout.this.mo49011a(null);
                    }
                    MaterialRippleLayout.this.mo49010a();
                }
            }
        };
        this.f62982l = new Property<MaterialRippleLayout, Float>(Float.class, "radius") {
            public final /* synthetic */ Object get(Object obj) {
                return Float.valueOf(((MaterialRippleLayout) obj).getRadius());
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                ((MaterialRippleLayout) obj).setRadius(((Float) obj2).floatValue());
            }
        };
        this.f62970F = new Property<MaterialRippleLayout, Integer>(Integer.class, "rippleAlpha") {
            public final /* synthetic */ Object get(Object obj) {
                return Integer.valueOf(((MaterialRippleLayout) obj).getRippleAlpha());
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                ((MaterialRippleLayout) obj).setRippleAlpha((Integer) obj2);
            }
        };
        setWillNotDraw(false);
        this.f62966B = new GestureDetector(context, this.f62969E);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.u4, R.attr.u5, R.attr.u6, R.attr.u7, R.attr.u8, R.attr.u9, R.attr.u_, R.attr.ua, R.attr.ub, R.attr.uc, R.attr.ud, R.attr.ue});
        this.f62985o = obtainStyledAttributes.getColor(2, -1);
        this.f62972b = obtainStyledAttributes.getDimensionPixelSize(4, (int) TypedValue.applyDimension(1, 35.0f, getResources().getDisplayMetrics()));
        this.f62986p = obtainStyledAttributes.getBoolean(9, false);
        this.f62971a = obtainStyledAttributes.getBoolean(7, true);
        this.f62987q = obtainStyledAttributes.getInt(5, 350);
        this.f62973c = (int) (obtainStyledAttributes.getFloat(0, 0.2f) * 255.0f);
        this.f62974d = obtainStyledAttributes.getBoolean(3, true);
        this.f62988r = obtainStyledAttributes.getInteger(6, 75);
        this.f62989s = new ColorDrawable(obtainStyledAttributes.getColor(1, 0));
        this.f62975e = obtainStyledAttributes.getBoolean(10, false);
        this.f62976f = obtainStyledAttributes.getBoolean(8, false);
        this.f62990t = (float) obtainStyledAttributes.getDimensionPixelSize(11, 0);
        obtainStyledAttributes.recycle();
        this.f62983m.setColor(this.f62985o);
        this.f62983m.setAlpha(this.f62973c);
        m57945d();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f62984n.set(0, 0, i, i2);
        this.f62989s.setBounds(this.f62984n);
    }
}
