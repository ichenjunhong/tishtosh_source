package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.WheelPicker */
public class WheelPicker extends View implements Runnable {

    /* renamed from: a */
    private static final String f102621a = "WheelPicker";

    /* renamed from: A */
    private int f102622A;

    /* renamed from: B */
    private int f102623B;

    /* renamed from: C */
    private int f102624C;

    /* renamed from: D */
    private int f102625D;

    /* renamed from: E */
    private int f102626E;

    /* renamed from: F */
    private int f102627F;

    /* renamed from: G */
    private int f102628G;

    /* renamed from: H */
    private int f102629H;

    /* renamed from: I */
    private int f102630I;

    /* renamed from: J */
    private int f102631J;

    /* renamed from: K */
    private int f102632K;

    /* renamed from: L */
    private int f102633L;

    /* renamed from: M */
    private int f102634M;

    /* renamed from: N */
    private int f102635N;

    /* renamed from: O */
    private int f102636O;

    /* renamed from: P */
    private int f102637P;

    /* renamed from: Q */
    private int f102638Q;

    /* renamed from: R */
    private int f102639R;

    /* renamed from: S */
    private int f102640S;

    /* renamed from: T */
    private int f102641T;

    /* renamed from: U */
    private int f102642U;

    /* renamed from: V */
    private boolean f102643V;

    /* renamed from: W */
    private boolean f102644W;

    /* renamed from: aa */
    private boolean f102645aa;

    /* renamed from: ab */
    private boolean f102646ab;

    /* renamed from: ac */
    private boolean f102647ac;

    /* renamed from: ad */
    private boolean f102648ad;

    /* renamed from: ae */
    private boolean f102649ae;

    /* renamed from: af */
    private boolean f102650af;

    /* renamed from: ag */
    private boolean f102651ag;

    /* renamed from: b */
    private final Handler f102652b;

    /* renamed from: c */
    private Paint f102653c;

    /* renamed from: d */
    private Scroller f102654d;

    /* renamed from: e */
    private VelocityTracker f102655e;

    /* renamed from: f */
    private C40198a f102656f;

    /* renamed from: g */
    private C40199b f102657g;

    /* renamed from: h */
    private Rect f102658h;

    /* renamed from: i */
    private Rect f102659i;

    /* renamed from: j */
    private Rect f102660j;

    /* renamed from: k */
    private Rect f102661k;

    /* renamed from: l */
    private Camera f102662l;

    /* renamed from: m */
    private Matrix f102663m;

    /* renamed from: n */
    private Matrix f102664n;

    /* renamed from: o */
    private List f102665o;

    /* renamed from: p */
    private String f102666p;

    /* renamed from: q */
    private int f102667q;

    /* renamed from: r */
    private int f102668r;

    /* renamed from: s */
    private int f102669s;

    /* renamed from: t */
    private int f102670t;

    /* renamed from: u */
    private int f102671u;

    /* renamed from: v */
    private int f102672v;

    /* renamed from: w */
    private int f102673w;

    /* renamed from: x */
    private int f102674x;

    /* renamed from: y */
    private int f102675y;

    /* renamed from: z */
    private int f102676z;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.WheelPicker$a */
    public interface C40198a {
        /* renamed from: a */
        void mo82440a(WheelPicker wheelPicker, Object obj, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.WheelPicker$b */
    public interface C40199b {
    }

    public int getCurrentItemPosition() {
        return this.f102629H;
    }

    public int getCurtainColor() {
        return this.f102622A;
    }

    public List getData() {
        return this.f102665o;
    }

    public int getIndicatorColor() {
        return this.f102676z;
    }

    public int getIndicatorSize() {
        return this.f102675y;
    }

    public int getItemAlign() {
        return this.f102624C;
    }

    public int getItemSpace() {
        return this.f102623B;
    }

    public int getItemTextColor() {
        return this.f102672v;
    }

    public int getItemTextSize() {
        return this.f102674x;
    }

    public String getMaximumWidthText() {
        return this.f102666p;
    }

    public int getMaximumWidthTextPosition() {
        return this.f102639R;
    }

    public int getSelectedItemPosition() {
        return this.f102628G;
    }

    public int getSelectedItemTextColor() {
        return this.f102673w;
    }

    public int getVisibleItemCount() {
        return this.f102667q;
    }

    public Typeface getTypeface() {
        if (this.f102653c != null) {
            return this.f102653c.getTypeface();
        }
        return null;
    }

    /* renamed from: a */
    private void m89415a() {
        if (this.f102667q >= 2) {
            if (this.f102667q % 2 == 0) {
                this.f102667q++;
            }
            this.f102668r = this.f102667q + 2;
            this.f102669s = this.f102668r / 2;
            return;
        }
        throw new ArithmeticException("Wheel's visible item count can not be less than 2!");
    }

    /* renamed from: c */
    private void m89419c() {
        switch (this.f102624C) {
            case 1:
                this.f102653c.setTextAlign(Align.LEFT);
                return;
            case 2:
                this.f102653c.setTextAlign(Align.RIGHT);
                return;
            default:
                this.f102653c.setTextAlign(Align.CENTER);
                return;
        }
    }

    /* renamed from: d */
    private void m89420d() {
        switch (this.f102624C) {
            case 1:
                this.f102636O = this.f102658h.left;
                break;
            case 2:
                this.f102636O = this.f102658h.right;
                break;
            default:
                this.f102636O = this.f102634M;
                break;
        }
        this.f102637P = (int) (((float) this.f102635N) - ((this.f102653c.ascent() + this.f102653c.descent()) / 2.0f));
    }

    /* renamed from: e */
    private void m89421e() {
        int i;
        int i2 = this.f102628G * this.f102625D;
        if (this.f102647ac) {
            i = DynamicTabYellowPointVersion.DEFAULT;
        } else {
            i = ((-this.f102625D) * (this.f102665o.size() - 1)) + i2;
        }
        this.f102630I = i;
        if (this.f102647ac) {
            i2 = Integer.MAX_VALUE;
        }
        this.f102631J = i2;
    }

    /* renamed from: f */
    private void m89422f() {
        if (this.f102644W) {
            int i = this.f102675y / 2;
            int i2 = this.f102635N + this.f102626E;
            int i3 = this.f102635N - this.f102626E;
            this.f102659i.set(this.f102658h.left, i2 - i, this.f102658h.right, i2 + i);
            this.f102660j.set(this.f102658h.left, i3 - i, this.f102658h.right, i3 + i);
        }
    }

    /* renamed from: g */
    private void m89423g() {
        if (this.f102645aa || this.f102673w != -1) {
            this.f102661k.set(this.f102658h.left, this.f102635N - this.f102626E, this.f102658h.right, this.f102635N + this.f102626E);
        }
    }

    public void run() {
        if (this.f102665o != null && this.f102665o.size() != 0) {
            if (this.f102654d.isFinished() && !this.f102650af) {
                if (this.f102625D != 0) {
                    int size = (((-this.f102638Q) / this.f102625D) + this.f102628G) % this.f102665o.size();
                    if (size < 0) {
                        size += this.f102665o.size();
                    }
                    this.f102629H = size;
                    if (this.f102656f != null) {
                        this.f102656f.mo82440a(this, this.f102665o.get(size), size);
                    }
                } else {
                    return;
                }
            }
            if (this.f102654d.computeScrollOffset()) {
                this.f102638Q = this.f102654d.getCurrY();
                postInvalidate();
                this.f102652b.postDelayed(this, 16);
            }
        }
    }

    /* renamed from: b */
    private void m89418b() {
        this.f102671u = 0;
        this.f102670t = this.f102671u;
        if (this.f102643V) {
            this.f102670t = (int) this.f102653c.measureText(String.valueOf(this.f102665o.get(0)));
        } else if (m89416a(this.f102639R)) {
            this.f102670t = (int) this.f102653c.measureText(String.valueOf(this.f102665o.get(this.f102639R)));
        } else if (!TextUtils.isEmpty(this.f102666p)) {
            this.f102670t = (int) this.f102653c.measureText(this.f102666p);
        } else {
            for (Object valueOf : this.f102665o) {
                this.f102670t = Math.max(this.f102670t, (int) this.f102653c.measureText(String.valueOf(valueOf)));
            }
        }
        FontMetrics fontMetrics = this.f102653c.getFontMetrics();
        this.f102671u = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    public void setDebug(boolean z) {
        this.f102651ag = z;
    }

    public void setOnItemSelectedListener(C40198a aVar) {
        this.f102656f = aVar;
    }

    public void setOnWheelChangeListener(C40199b bVar) {
        this.f102657g = bVar;
    }

    public WheelPicker(Context context) {
        this(context, null);
    }

    public void setAtmospheric(boolean z) {
        this.f102646ab = z;
        invalidate();
    }

    public void setCurtainColor(int i) {
        this.f102622A = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f102676z = i;
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f102672v = i;
        invalidate();
    }

    public void setCurtain(boolean z) {
        this.f102645aa = z;
        m89423g();
        invalidate();
    }

    public void setCurved(boolean z) {
        this.f102648ad = z;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z) {
        this.f102647ac = z;
        m89421e();
        invalidate();
    }

    public void setIndicator(boolean z) {
        this.f102644W = z;
        m89422f();
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f102675y = i;
        m89422f();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f102624C = i;
        m89419c();
        m89420d();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f102623B = i;
        requestLayout();
        invalidate();
    }

    public void setSameWidth(boolean z) {
        this.f102643V = z;
        m89418b();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemTextColor(int i) {
        this.f102673w = i;
        m89423g();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f102667q = i;
        m89415a();
        requestLayout();
    }

    /* renamed from: a */
    private boolean m89416a(int i) {
        if (i < 0 || i >= this.f102665o.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private int m89417b(int i) {
        if (Math.abs(i) <= this.f102626E) {
            return -i;
        }
        if (this.f102638Q < 0) {
            return (-this.f102625D) - i;
        }
        return this.f102625D - i;
    }

    public void setItemTextSize(int i) {
        this.f102674x = i;
        this.f102653c.setTextSize((float) this.f102674x);
        m89418b();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        if (str != null) {
            this.f102666p = str;
            m89418b();
            requestLayout();
            invalidate();
            return;
        }
        throw new NullPointerException("Maximum width text can not be null!");
    }

    public void setTypeface(Typeface typeface) {
        if (this.f102653c != null) {
            this.f102653c.setTypeface(typeface);
        }
        m89418b();
        requestLayout();
        invalidate();
    }

    public void setData(List list) {
        if (list != null) {
            this.f102665o = list;
            if (this.f102628G > list.size() - 1 || this.f102629H > list.size() - 1) {
                this.f102629H = list.size() - 1;
            }
            this.f102628G = this.f102629H;
            this.f102638Q = 0;
            m89418b();
            m89421e();
            requestLayout();
            invalidate();
            return;
        }
        throw new NullPointerException("WheelPicker's data can not be null!");
    }

    public void setMaximumWidthTextPosition(int i) {
        if (m89416a(i)) {
            this.f102639R = i;
            m89418b();
            requestLayout();
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("Maximum width text Position must in [0, ");
        sb.append(this.f102665o.size());
        sb.append("), but current is ");
        sb.append(i);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public void setSelectedItemPosition(int i) {
        int max = Math.max(Math.min(i, this.f102665o.size() - 1), 0);
        this.f102628G = max;
        this.f102629H = max;
        this.f102638Q = 0;
        m89421e();
        requestLayout();
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (this.f102655e == null) {
                    this.f102655e = VelocityTracker.obtain();
                } else {
                    this.f102655e.clear();
                }
                this.f102655e.addMovement(motionEvent);
                if (!this.f102654d.isFinished()) {
                    this.f102654d.abortAnimation();
                    this.f102650af = true;
                }
                this.f102640S = (int) motionEvent.getY();
                this.f102641T = this.f102640S;
                break;
            case 1:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (!this.f102649ae) {
                    this.f102655e.addMovement(motionEvent);
                    if (VERSION.SDK_INT >= 4) {
                        this.f102655e.computeCurrentVelocity(1000, (float) this.f102633L);
                    } else {
                        this.f102655e.computeCurrentVelocity(1000);
                    }
                    this.f102650af = false;
                    int yVelocity = (int) this.f102655e.getYVelocity();
                    if (Math.abs(yVelocity) > this.f102632K) {
                        this.f102654d.fling(0, this.f102638Q, 0, yVelocity, 0, 0, this.f102630I, this.f102631J);
                        this.f102654d.setFinalY(this.f102654d.getFinalY() + m89417b(this.f102654d.getFinalY() % this.f102625D));
                    } else {
                        this.f102654d.startScroll(0, this.f102638Q, 0, m89417b(this.f102638Q % this.f102625D));
                    }
                    if (!this.f102647ac) {
                        if (this.f102654d.getFinalY() > this.f102631J) {
                            this.f102654d.setFinalY(this.f102631J);
                        } else if (this.f102654d.getFinalY() < this.f102630I) {
                            this.f102654d.setFinalY(this.f102630I);
                        }
                    }
                    this.f102652b.post(this);
                    if (this.f102655e != null) {
                        this.f102655e.recycle();
                        this.f102655e = null;
                        break;
                    }
                }
                break;
            case 2:
                if (Math.abs(((float) this.f102641T) - motionEvent.getY()) >= ((float) this.f102642U)) {
                    this.f102649ae = false;
                    this.f102655e.addMovement(motionEvent);
                    float y = motionEvent.getY() - ((float) this.f102640S);
                    if (Math.abs(y) >= 1.0f) {
                        this.f102638Q = (int) (((float) this.f102638Q) + y);
                        this.f102640S = (int) motionEvent.getY();
                        invalidate();
                        break;
                    }
                } else {
                    this.f102649ae = true;
                    break;
                }
                break;
            case 3:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (this.f102655e != null) {
                    this.f102655e.recycle();
                    this.f102655e = null;
                    break;
                }
                break;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        Canvas canvas2 = canvas;
        if (this.f102665o != null && !this.f102665o.isEmpty()) {
            int i5 = ((-this.f102638Q) / this.f102625D) - this.f102669s;
            int i6 = this.f102628G + i5;
            int i7 = -this.f102669s;
            while (i6 < this.f102628G + i5 + this.f102668r) {
                String str = "";
                if (this.f102647ac) {
                    int size = i6 % this.f102665o.size();
                    if (size < 0) {
                        size += this.f102665o.size();
                    }
                    str = String.valueOf(this.f102665o.get(size));
                } else if (m89416a(i6)) {
                    str = String.valueOf(this.f102665o.get(i6));
                }
                this.f102653c.setColor(this.f102672v);
                this.f102653c.setStyle(Style.FILL);
                int i8 = this.f102637P + (this.f102625D * i7) + (this.f102638Q % this.f102625D);
                if (this.f102648ad) {
                    float abs = (((float) ((this.f102637P - Math.abs(this.f102637P - i8)) - this.f102658h.top)) * 1.0f) / ((float) (this.f102637P - this.f102658h.top));
                    if (i8 > this.f102637P) {
                        i4 = 1;
                    } else if (i8 < this.f102637P) {
                        i4 = -1;
                    } else {
                        i4 = 0;
                    }
                    float f = (-(1.0f - abs)) * 90.0f * ((float) i4);
                    if (f < -90.0f) {
                        f = -90.0f;
                    }
                    if (f > 90.0f) {
                        f = 90.0f;
                    }
                    double d = (double) ((int) f);
                    double sin = Math.sin(Math.toRadians(d));
                    double d2 = (double) this.f102627F;
                    Double.isNaN(d2);
                    int i9 = (int) (sin * d2);
                    int i10 = this.f102634M;
                    switch (this.f102624C) {
                        case 1:
                            i10 = this.f102658h.left;
                            break;
                        case 2:
                            i10 = this.f102658h.right;
                            break;
                    }
                    int i11 = this.f102635N - i9;
                    this.f102662l.save();
                    this.f102662l.rotateX(f);
                    this.f102662l.getMatrix(this.f102663m);
                    this.f102662l.restore();
                    float f2 = (float) (-i10);
                    float f3 = (float) (-i11);
                    this.f102663m.preTranslate(f2, f3);
                    float f4 = (float) i10;
                    float f5 = (float) i11;
                    this.f102663m.postTranslate(f4, f5);
                    this.f102662l.save();
                    Camera camera = this.f102662l;
                    i3 = i9;
                    double d3 = (double) this.f102627F;
                    double cos = Math.cos(Math.toRadians(d));
                    i2 = i5;
                    i = i6;
                    double d4 = (double) this.f102627F;
                    Double.isNaN(d4);
                    double d5 = cos * d4;
                    Double.isNaN(d3);
                    camera.translate(0.0f, 0.0f, (float) ((int) (d3 - d5)));
                    this.f102662l.getMatrix(this.f102664n);
                    this.f102662l.restore();
                    this.f102664n.preTranslate(f2, f3);
                    this.f102664n.postTranslate(f4, f5);
                    this.f102663m.postConcat(this.f102664n);
                } else {
                    i2 = i5;
                    i = i6;
                    i3 = 0;
                }
                if (this.f102646ab) {
                    int abs2 = (int) (((((float) (this.f102637P - Math.abs(this.f102637P - i8))) * 1.0f) / ((float) this.f102637P)) * 255.0f);
                    if (abs2 < 0) {
                        abs2 = 0;
                    }
                    this.f102653c.setAlpha(abs2);
                }
                if (this.f102648ad) {
                    i8 = this.f102637P - i3;
                }
                if (this.f102673w != -1) {
                    canvas.save();
                    if (this.f102648ad) {
                        canvas2 = canvas;
                        canvas2.concat(this.f102663m);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.clipRect(this.f102661k, Op.DIFFERENCE);
                    canvas2.drawText(str, (float) this.f102636O, (float) i8, this.f102653c);
                    canvas.restore();
                    this.f102653c.setColor(this.f102673w);
                    canvas.save();
                    if (this.f102648ad) {
                        canvas2.concat(this.f102663m);
                    }
                    canvas2.clipRect(this.f102661k);
                } else {
                    canvas2 = canvas;
                    canvas.save();
                    canvas2.clipRect(this.f102658h);
                    if (this.f102648ad) {
                        canvas2.concat(this.f102663m);
                    }
                }
                canvas2.drawText(str, (float) this.f102636O, (float) i8, this.f102653c);
                canvas.restore();
                if (this.f102651ag) {
                    canvas.save();
                    canvas2.clipRect(this.f102658h);
                    this.f102653c.setColor(-1166541);
                    int i12 = this.f102635N + (this.f102625D * i7);
                    float f6 = (float) i12;
                    canvas.drawLine((float) this.f102658h.left, f6, (float) this.f102658h.right, f6, this.f102653c);
                    this.f102653c.setColor(-13421586);
                    this.f102653c.setStyle(Style.STROKE);
                    int i13 = i12 - this.f102626E;
                    canvas.drawRect((float) this.f102658h.left, (float) i13, (float) this.f102658h.right, (float) (i13 + this.f102625D), this.f102653c);
                    canvas.restore();
                }
                i6 = i + 1;
                i7++;
                i5 = i2;
            }
            if (this.f102645aa) {
                this.f102653c.setColor(this.f102622A);
                this.f102653c.setStyle(Style.FILL);
                canvas2.drawRect(this.f102661k, this.f102653c);
            }
            if (this.f102644W) {
                this.f102653c.setColor(this.f102676z);
                this.f102653c.setStyle(Style.FILL);
                canvas2.drawRect(this.f102659i, this.f102653c);
                canvas2.drawRect(this.f102660j, this.f102653c);
            }
            if (this.f102651ag) {
                this.f102653c.setColor(1144254003);
                this.f102653c.setStyle(Style.FILL);
                canvas.drawRect(0.0f, 0.0f, (float) getPaddingLeft(), (float) getHeight(), this.f102653c);
                canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getPaddingTop(), this.f102653c);
                canvas.drawRect((float) (getWidth() - getPaddingRight()), 0.0f, (float) getWidth(), (float) getHeight(), this.f102653c);
                canvas.drawRect(0.0f, (float) (getHeight() - getPaddingBottom()), (float) getWidth(), (float) getHeight(), this.f102653c);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int i3 = this.f102670t;
        int i4 = (this.f102671u * this.f102667q) + (this.f102623B * (this.f102667q - 1));
        if (this.f102648ad) {
            double d = (double) (i4 * 2);
            Double.isNaN(d);
            i4 = (int) (d / 3.141592653589793d);
        }
        setMeasuredDimension(m89414a(mode, size, i3 + getPaddingLeft() + getPaddingRight()), m89414a(mode2, size2, i4 + getPaddingTop() + getPaddingBottom()));
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f102652b = new Handler();
        this.f102632K = 50;
        this.f102633L = 8000;
        this.f102642U = 8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a_u, R.attr.a_v, R.attr.a_w, R.attr.a_x, R.attr.a_y, R.attr.a_z, R.attr.aa0, R.attr.aa1, R.attr.aa2, R.attr.aa3, R.attr.aa4, R.attr.aa5, R.attr.aa6, R.attr.aa7, R.attr.aa8, R.attr.aa9, R.attr.aa_, R.attr.aaa, R.attr.aac});
        int resourceId = obtainStyledAttributes.getResourceId(5, 0);
        Resources resources = getResources();
        if (resourceId == 0) {
            resourceId = R.array.a;
        }
        this.f102665o = Arrays.asList(resources.getStringArray(resourceId));
        this.f102674x = obtainStyledAttributes.getDimensionPixelSize(12, getResources().getDimensionPixelSize(R.dimen.c));
        this.f102667q = obtainStyledAttributes.getInt(18, 7);
        this.f102628G = obtainStyledAttributes.getInt(16, 0);
        this.f102643V = obtainStyledAttributes.getBoolean(15, false);
        this.f102639R = obtainStyledAttributes.getInt(14, -1);
        this.f102666p = obtainStyledAttributes.getString(13);
        this.f102673w = obtainStyledAttributes.getColor(17, -1);
        this.f102672v = obtainStyledAttributes.getColor(11, -7829368);
        this.f102623B = obtainStyledAttributes.getDimensionPixelSize(10, getResources().getDimensionPixelSize(R.dimen.b));
        this.f102647ac = obtainStyledAttributes.getBoolean(4, false);
        this.f102644W = obtainStyledAttributes.getBoolean(6, false);
        this.f102676z = obtainStyledAttributes.getColor(7, -1166541);
        this.f102675y = obtainStyledAttributes.getDimensionPixelSize(8, getResources().getDimensionPixelSize(R.dimen.a));
        this.f102645aa = obtainStyledAttributes.getBoolean(1, false);
        this.f102622A = obtainStyledAttributes.getColor(2, -1996488705);
        this.f102646ab = obtainStyledAttributes.getBoolean(0, false);
        this.f102648ad = obtainStyledAttributes.getBoolean(3, false);
        this.f102624C = obtainStyledAttributes.getInt(9, 0);
        obtainStyledAttributes.recycle();
        m89415a();
        this.f102653c = new Paint(69);
        this.f102653c.setTextSize((float) this.f102674x);
        m89419c();
        m89418b();
        this.f102654d = new Scroller(getContext());
        if (VERSION.SDK_INT >= 4) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            this.f102632K = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f102633L = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f102642U = viewConfiguration.getScaledTouchSlop();
        }
        this.f102658h = new Rect();
        this.f102659i = new Rect();
        this.f102660j = new Rect();
        this.f102661k = new Rect();
        this.f102662l = new Camera();
        this.f102663m = new Matrix();
        this.f102664n = new Matrix();
    }

    /* renamed from: a */
    private static int m89414a(int i, int i2, int i3) {
        if (i == 1073741824) {
            return i2;
        }
        if (i == Integer.MIN_VALUE) {
            return Math.min(i3, i2);
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f102658h.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f102634M = this.f102658h.centerX();
        this.f102635N = this.f102658h.centerY();
        m89420d();
        this.f102627F = this.f102658h.height() / 2;
        this.f102625D = this.f102658h.height() / this.f102667q;
        this.f102626E = this.f102625D / 2;
        m89421e();
        m89422f();
        m89423g();
    }
}
