package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WheelPicker extends View implements Runnable {

    /* renamed from: a */
    private static final String f23243a = "WheelPicker";

    /* renamed from: A */
    private int f23244A;

    /* renamed from: B */
    private int f23245B;

    /* renamed from: C */
    private int f23246C;

    /* renamed from: D */
    private int f23247D;

    /* renamed from: E */
    private int f23248E;

    /* renamed from: F */
    private int f23249F;

    /* renamed from: G */
    private int f23250G;

    /* renamed from: H */
    private int f23251H;

    /* renamed from: I */
    private int f23252I;

    /* renamed from: J */
    private int f23253J;

    /* renamed from: K */
    private int f23254K;

    /* renamed from: L */
    private int f23255L;

    /* renamed from: M */
    private int f23256M;

    /* renamed from: N */
    private int f23257N;

    /* renamed from: O */
    private int f23258O;

    /* renamed from: P */
    private int f23259P;

    /* renamed from: Q */
    private int f23260Q;

    /* renamed from: R */
    private int f23261R;

    /* renamed from: S */
    private int f23262S;

    /* renamed from: T */
    private int f23263T;

    /* renamed from: U */
    private int f23264U;

    /* renamed from: V */
    private int f23265V;

    /* renamed from: W */
    private int f23266W;

    /* renamed from: aa */
    private boolean f23267aa;

    /* renamed from: ab */
    private boolean f23268ab;

    /* renamed from: ac */
    private boolean f23269ac;

    /* renamed from: ad */
    private boolean f23270ad;

    /* renamed from: ae */
    private boolean f23271ae;

    /* renamed from: af */
    private boolean f23272af;

    /* renamed from: ag */
    private boolean f23273ag;

    /* renamed from: ah */
    private boolean f23274ah;

    /* renamed from: ai */
    private String f23275ai;

    /* renamed from: aj */
    private boolean f23276aj;

    /* renamed from: b */
    private final Handler f23277b;

    /* renamed from: c */
    private Paint f23278c;

    /* renamed from: d */
    private Scroller f23279d;

    /* renamed from: e */
    private VelocityTracker f23280e;

    /* renamed from: f */
    private boolean f23281f;

    /* renamed from: g */
    private C8486a f23282g;

    /* renamed from: h */
    private C8487b f23283h;

    /* renamed from: i */
    private Rect f23284i;

    /* renamed from: j */
    private Rect f23285j;

    /* renamed from: k */
    private Rect f23286k;

    /* renamed from: l */
    private Rect f23287l;

    /* renamed from: m */
    private Camera f23288m;

    /* renamed from: n */
    private Matrix f23289n;

    /* renamed from: o */
    private Matrix f23290o;

    /* renamed from: p */
    private List f23291p;

    /* renamed from: q */
    private String f23292q;

    /* renamed from: r */
    private int f23293r;

    /* renamed from: s */
    private int f23294s;

    /* renamed from: t */
    private int f23295t;

    /* renamed from: u */
    private int f23296u;

    /* renamed from: v */
    private int f23297v;

    /* renamed from: w */
    private int f23298w;

    /* renamed from: x */
    private int f23299x;

    /* renamed from: y */
    private int f23300y;

    /* renamed from: z */
    private int f23301z;

    /* renamed from: com.bytedance.android.livesdk.widget.WheelPicker$a */
    public interface C8486a {
    }

    /* renamed from: com.bytedance.android.livesdk.widget.WheelPicker$b */
    public interface C8487b {
    }

    public int getCurrentItemPosition() {
        return this.f23253J;
    }

    public int getCurtainColor() {
        return this.f23246C;
    }

    public List getData() {
        return this.f23291p;
    }

    public int getIndicatorColor() {
        return this.f23245B;
    }

    public int getIndicatorSize() {
        return this.f23244A;
    }

    public int getItemAlign() {
        return this.f23248E;
    }

    public int getItemSpace() {
        return this.f23247D;
    }

    public int getItemTextColor() {
        return this.f23298w;
    }

    public int getItemTextSize() {
        return this.f23300y;
    }

    public String getMaximumWidthText() {
        return this.f23292q;
    }

    public int getMaximumWidthTextPosition() {
        return this.f23263T;
    }

    public int getSelectedItemPosition() {
        return this.f23252I;
    }

    public int getSelectedItemTextColor() {
        return this.f23299x;
    }

    public int getVisibleItemCount() {
        return this.f23293r;
    }

    public Typeface getTypeface() {
        if (this.f23278c != null) {
            return this.f23278c.getTypeface();
        }
        return null;
    }

    /* renamed from: a */
    private void m16747a() {
        if (this.f23293r >= 2) {
            if (this.f23293r % 2 == 0) {
                this.f23293r++;
            }
            this.f23294s = this.f23293r + 2;
            this.f23295t = this.f23294s / 2;
            return;
        }
        throw new ArithmeticException("Wheel's visible item count can not be less than 2!");
    }

    /* renamed from: c */
    private void m16751c() {
        switch (this.f23248E) {
            case 1:
                this.f23278c.setTextAlign(Align.LEFT);
                return;
            case 2:
                this.f23278c.setTextAlign(Align.RIGHT);
                return;
            default:
                this.f23278c.setTextAlign(Align.CENTER);
                return;
        }
    }

    /* renamed from: d */
    private void m16752d() {
        switch (this.f23248E) {
            case 1:
                this.f23260Q = this.f23284i.left;
                break;
            case 2:
                this.f23260Q = this.f23284i.right;
                break;
            default:
                this.f23260Q = this.f23258O;
                break;
        }
        this.f23261R = (int) (((float) this.f23259P) - ((this.f23278c.ascent() + this.f23278c.descent()) / 2.0f));
    }

    /* renamed from: e */
    private void m16753e() {
        int i;
        int i2 = this.f23252I * this.f23249F;
        if (this.f23271ae) {
            i = DynamicTabYellowPointVersion.DEFAULT;
        } else {
            i = ((-this.f23249F) * (this.f23291p.size() - 1)) + i2;
        }
        this.f23254K = i;
        if (this.f23271ae) {
            i2 = Integer.MAX_VALUE;
        }
        this.f23255L = i2;
    }

    /* renamed from: f */
    private void m16754f() {
        if (this.f23268ab) {
            int i = this.f23244A / 2;
            int i2 = this.f23259P + this.f23250G;
            int i3 = this.f23259P - this.f23250G;
            this.f23285j.set(this.f23284i.left, i2 - i, this.f23284i.right, i2 + i);
            this.f23286k.set(this.f23284i.left, i3 - i, this.f23284i.right, i3 + i);
        }
    }

    /* renamed from: g */
    private void m16755g() {
        if (this.f23269ac || this.f23299x != -1) {
            this.f23287l.set(this.f23284i.left, this.f23259P - this.f23250G, this.f23284i.right, this.f23259P + this.f23250G);
        }
    }

    public void run() {
        if (this.f23291p != null && this.f23291p.size() != 0) {
            if (this.f23279d.isFinished() && !this.f23274ah) {
                if (this.f23249F != 0) {
                    int size = (((-this.f23262S) / this.f23249F) + this.f23252I) % this.f23291p.size();
                    if (size < 0) {
                        size += this.f23291p.size();
                    }
                    this.f23253J = size;
                    if (this.f23282g != null && this.f23281f) {
                        this.f23291p.get(size);
                    }
                } else {
                    return;
                }
            }
            if (this.f23279d.computeScrollOffset()) {
                this.f23262S = this.f23279d.getCurrY();
                postInvalidate();
                this.f23277b.postDelayed(this, 16);
            }
        }
    }

    /* renamed from: b */
    private void m16750b() {
        this.f23296u = 0;
        this.f23297v = 0;
        if (this.f23267aa) {
            this.f23296u = (int) this.f23278c.measureText(String.valueOf(this.f23291p.get(0)));
        } else if (m16748a(this.f23263T)) {
            this.f23296u = (int) this.f23278c.measureText(String.valueOf(this.f23291p.get(this.f23263T)));
        } else if (!TextUtils.isEmpty(this.f23292q)) {
            this.f23296u = (int) this.f23278c.measureText(this.f23292q);
        } else {
            for (Object valueOf : this.f23291p) {
                this.f23296u = Math.max(this.f23296u, (int) this.f23278c.measureText(String.valueOf(valueOf)));
            }
        }
        FontMetrics fontMetrics = this.f23278c.getFontMetrics();
        this.f23297v = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    public void setOnItemSelectedListener(C8486a aVar) {
        this.f23282g = aVar;
    }

    public void setOnWheelChangeListener(C8487b bVar) {
        this.f23283h = bVar;
    }

    public void setSelectItemTextSize(int i) {
        this.f23301z = i;
    }

    public WheelPicker(Context context) {
        this(context, null);
    }

    public void setAtmospheric(boolean z) {
        this.f23270ad = z;
        invalidate();
    }

    public void setCurtainColor(int i) {
        this.f23246C = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f23245B = i;
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f23298w = i;
        invalidate();
    }

    public void setSelectedItemPosition(int i) {
        mo14896a(i, true);
    }

    public void setCurtain(boolean z) {
        this.f23269ac = z;
        m16755g();
        invalidate();
    }

    public void setCurved(boolean z) {
        this.f23272af = z;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z) {
        this.f23271ae = z;
        m16753e();
        invalidate();
    }

    public void setIndicator(boolean z) {
        this.f23268ab = z;
        m16754f();
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f23244A = i;
        m16754f();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f23248E = i;
        m16751c();
        m16752d();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f23247D = i;
        requestLayout();
        invalidate();
    }

    public void setSameWidth(boolean z) {
        this.f23267aa = z;
        m16750b();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemTextColor(int i) {
        this.f23299x = i;
        m16755g();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f23293r = i;
        m16747a();
        requestLayout();
    }

    /* renamed from: a */
    private boolean m16748a(int i) {
        if (i < 0 || i >= this.f23291p.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private int m16749b(int i) {
        if (Math.abs(i) <= this.f23250G) {
            return -i;
        }
        if (this.f23262S < 0) {
            return (-this.f23249F) - i;
        }
        return this.f23249F - i;
    }

    public void setItemTextSize(int i) {
        this.f23300y = i;
        this.f23278c.setTextSize((float) this.f23300y);
        m16750b();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        if (str != null) {
            this.f23292q = str;
            m16750b();
            requestLayout();
            invalidate();
            return;
        }
        throw new NullPointerException("Maximum width text can not be null!");
    }

    public void setTypeface(Typeface typeface) {
        if (this.f23278c != null) {
            this.f23278c.setTypeface(typeface);
        }
        m16750b();
        requestLayout();
        invalidate();
    }

    public void setData(List list) {
        if (list != null) {
            this.f23291p = list;
            if (this.f23252I > list.size() - 1 || this.f23253J > list.size() - 1) {
                this.f23253J = list.size() - 1;
            }
            this.f23252I = this.f23253J;
            this.f23262S = 0;
            m16750b();
            m16753e();
            requestLayout();
            invalidate();
            return;
        }
        throw new NullPointerException("WheelPicker's data can not be null!");
    }

    public void setMaximumWidthTextPosition(int i) {
        if (m16748a(i)) {
            this.f23263T = i;
            m16750b();
            requestLayout();
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("Maximum width text Position must in [0, ");
        sb.append(this.f23291p.size());
        sb.append("), but current is ");
        sb.append(i);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f23281f = true;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (this.f23280e == null) {
                    this.f23280e = VelocityTracker.obtain();
                } else {
                    this.f23280e.clear();
                }
                this.f23280e.addMovement(motionEvent);
                if (!this.f23279d.isFinished()) {
                    this.f23279d.abortAnimation();
                    this.f23274ah = true;
                }
                this.f23264U = (int) motionEvent.getY();
                this.f23265V = this.f23264U;
                break;
            case 1:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (!this.f23273ag || this.f23274ah) {
                    this.f23280e.addMovement(motionEvent);
                    if (VERSION.SDK_INT >= 4) {
                        this.f23280e.computeCurrentVelocity(1000, (float) this.f23257N);
                    } else {
                        this.f23280e.computeCurrentVelocity(1000);
                    }
                    this.f23274ah = false;
                    int yVelocity = (int) this.f23280e.getYVelocity();
                    if (Math.abs(yVelocity) > this.f23256M) {
                        this.f23279d.fling(0, this.f23262S, 0, yVelocity, 0, 0, this.f23254K, this.f23255L);
                        this.f23279d.setFinalY(this.f23279d.getFinalY() + m16749b(this.f23279d.getFinalY() % this.f23249F));
                    } else {
                        this.f23279d.startScroll(0, this.f23262S, 0, m16749b(this.f23262S % this.f23249F));
                    }
                    if (!this.f23271ae) {
                        if (this.f23279d.getFinalY() > this.f23255L) {
                            this.f23279d.setFinalY(this.f23255L);
                        } else if (this.f23279d.getFinalY() < this.f23254K) {
                            this.f23279d.setFinalY(this.f23254K);
                        }
                    }
                    this.f23277b.post(this);
                    if (this.f23280e != null) {
                        this.f23280e.recycle();
                        this.f23280e = null;
                        break;
                    }
                }
                break;
            case 2:
                if (Math.abs(((float) this.f23265V) - motionEvent.getY()) >= ((float) this.f23266W)) {
                    this.f23273ag = false;
                    this.f23280e.addMovement(motionEvent);
                    float y = motionEvent.getY() - ((float) this.f23264U);
                    if (Math.abs(y) >= 1.0f) {
                        this.f23262S = (int) (((float) this.f23262S) + y);
                        this.f23264U = (int) motionEvent.getY();
                        invalidate();
                        break;
                    }
                } else {
                    this.f23273ag = true;
                    break;
                }
                break;
            case 3:
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (this.f23280e != null) {
                    this.f23280e.recycle();
                    this.f23280e = null;
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
        int i5 = ((-this.f23262S) / this.f23249F) - this.f23295t;
        int i6 = this.f23252I + i5;
        int i7 = -this.f23295t;
        while (i6 < this.f23252I + i5 + this.f23294s) {
            String str = "";
            if (this.f23271ae) {
                int size = i6 % this.f23291p.size();
                if (size < 0) {
                    size += this.f23291p.size();
                }
                str = String.valueOf(this.f23291p.get(size));
            } else if (m16748a(i6)) {
                str = String.valueOf(this.f23291p.get(i6));
            }
            this.f23278c.setColor(this.f23298w);
            this.f23278c.setTextSize((float) this.f23300y);
            this.f23278c.setStyle(Style.FILL);
            int i8 = this.f23261R + (this.f23249F * i7) + (this.f23262S % this.f23249F);
            if (this.f23272af) {
                float abs = (((float) ((this.f23261R - Math.abs(this.f23261R - i8)) - this.f23284i.top)) * 1.0f) / ((float) (this.f23261R - this.f23284i.top));
                if (i8 > this.f23261R) {
                    i4 = 1;
                } else if (i8 < this.f23261R) {
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
                double d2 = (double) this.f23251H;
                Double.isNaN(d2);
                i3 = (int) (sin * d2);
                int i9 = this.f23258O;
                switch (this.f23248E) {
                    case 1:
                        i9 = this.f23284i.left;
                        break;
                    case 2:
                        i9 = this.f23284i.right;
                        break;
                }
                int i10 = this.f23259P - i3;
                this.f23288m.save();
                this.f23288m.rotateX(f);
                this.f23288m.getMatrix(this.f23289n);
                this.f23288m.restore();
                float f2 = (float) (-i9);
                float f3 = (float) (-i10);
                this.f23289n.preTranslate(f2, f3);
                float f4 = (float) i9;
                float f5 = (float) i10;
                this.f23289n.postTranslate(f4, f5);
                this.f23288m.save();
                Camera camera = this.f23288m;
                float f6 = f4;
                double d3 = (double) this.f23251H;
                double cos = Math.cos(Math.toRadians(d));
                i2 = i5;
                i = i6;
                double d4 = (double) this.f23251H;
                Double.isNaN(d4);
                double d5 = cos * d4;
                Double.isNaN(d3);
                camera.translate(0.0f, 0.0f, (float) ((int) (d3 - d5)));
                this.f23288m.getMatrix(this.f23290o);
                this.f23288m.restore();
                this.f23290o.preTranslate(f2, f3);
                this.f23290o.postTranslate(f6, f5);
                this.f23289n.postConcat(this.f23290o);
            } else {
                i2 = i5;
                i = i6;
                i3 = 0;
            }
            if (this.f23270ad) {
                int abs2 = (int) (((((float) (this.f23261R - Math.abs(this.f23261R - i8))) * 1.0f) / ((float) this.f23261R)) * 255.0f);
                if (abs2 < 0) {
                    abs2 = 0;
                }
                this.f23278c.setAlpha(abs2);
            }
            if (this.f23272af) {
                i8 = this.f23261R - i3;
            }
            if (this.f23299x != -1) {
                canvas.save();
                if (this.f23272af) {
                    canvas2 = canvas;
                    canvas2.concat(this.f23289n);
                } else {
                    canvas2 = canvas;
                }
                if (i8 < this.f23287l.bottom) {
                    RectF rectF = new RectF(this.f23287l);
                    rectF.bottom = rectF.top;
                    rectF.top = 0.0f;
                    canvas2.clipRect(rectF);
                } else {
                    RectF rectF2 = new RectF(this.f23287l);
                    rectF2.top = rectF2.bottom;
                    rectF2.bottom = (float) getBottom();
                    canvas2.clipRect(rectF2);
                }
                canvas2.clipRect(this.f23287l, Op.DIFFERENCE);
                float f7 = (float) i8;
                canvas2.drawText(str, (float) this.f23260Q, f7, this.f23278c);
                canvas.restore();
                this.f23278c.setColor(this.f23299x);
                this.f23278c.setTextSize((float) this.f23301z);
                canvas.save();
                if (this.f23272af) {
                    canvas2.concat(this.f23289n);
                }
                canvas2.clipRect(this.f23287l);
                i8 = (int) (f7 + (((this.f23278c.descent() - this.f23278c.ascent()) / 2.0f) - ((float) (this.f23297v / 2))));
            } else {
                canvas2 = canvas;
                canvas.save();
                canvas2.clipRect(this.f23284i);
                if (this.f23272af) {
                    canvas2.concat(this.f23289n);
                }
            }
            canvas2.drawText(str, (float) this.f23260Q, (float) i8, this.f23278c);
            canvas.restore();
            if (this.f23276aj) {
                canvas.save();
                canvas2.clipRect(this.f23284i);
                this.f23278c.setColor(-1166541);
                int i11 = this.f23259P + (this.f23249F * i7);
                float f8 = (float) i11;
                canvas.drawLine((float) this.f23284i.left, f8, (float) this.f23284i.right, f8, this.f23278c);
                this.f23278c.setColor(-13421586);
                this.f23278c.setStyle(Style.STROKE);
                int i12 = i11 - this.f23250G;
                canvas.drawRect((float) this.f23284i.left, (float) i12, (float) this.f23284i.right, (float) (i12 + this.f23249F), this.f23278c);
                canvas.restore();
            }
            i6 = i + 1;
            i7++;
            i5 = i2;
        }
        if (this.f23269ac) {
            this.f23278c.setColor(this.f23246C);
            this.f23278c.setStyle(Style.FILL);
            canvas2.drawRect(this.f23287l, this.f23278c);
        }
        if (this.f23268ab) {
            this.f23278c.setColor(this.f23245B);
            this.f23278c.setStyle(Style.FILL);
            canvas2.drawRect(this.f23285j, this.f23278c);
            canvas2.drawRect(this.f23286k, this.f23278c);
        }
        if (this.f23276aj) {
            this.f23278c.setColor(1144254003);
            this.f23278c.setStyle(Style.FILL);
            canvas.drawRect(0.0f, 0.0f, (float) getPaddingLeft(), (float) getHeight(), this.f23278c);
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getPaddingTop(), this.f23278c);
            canvas.drawRect((float) (getWidth() - getPaddingRight()), 0.0f, (float) getWidth(), (float) getHeight(), this.f23278c);
            canvas.drawRect(0.0f, (float) (getHeight() - getPaddingBottom()), (float) getWidth(), (float) getHeight(), this.f23278c);
        }
    }

    /* renamed from: a */
    public final void mo14896a(int i, boolean z) {
        this.f23281f = false;
        if (!z || !this.f23279d.isFinished()) {
            if (!this.f23279d.isFinished()) {
                this.f23279d.abortAnimation();
            }
            int max = Math.max(Math.min(i, this.f23291p.size() - 1), 0);
            this.f23252I = max;
            this.f23253J = max;
            this.f23262S = 0;
            m16753e();
            requestLayout();
            invalidate();
            return;
        }
        int size = getData().size();
        int i2 = i - this.f23253J;
        if (i2 != 0) {
            if (this.f23271ae && Math.abs(i2) > size / 2) {
                if (i2 > 0) {
                    size = -size;
                }
                i2 += size;
            }
            this.f23279d.startScroll(0, this.f23279d.getCurrY(), 0, (-i2) * this.f23249F);
            this.f23277b.post(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int i3 = this.f23296u;
        int i4 = (this.f23297v * this.f23293r) + (this.f23247D * (this.f23293r - 1));
        if (this.f23272af) {
            double d = (double) (i4 * 2);
            Double.isNaN(d);
            i4 = (int) (d / 3.141592653589793d);
        }
        setMeasuredDimension(m16746a(mode, size, i3 + getPaddingLeft() + getPaddingRight()), m16746a(mode2, size2, i4 + getPaddingTop() + getPaddingBottom()));
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23277b = new Handler();
        this.f23256M = 50;
        this.f23257N = 8000;
        this.f23266W = 8;
        this.f23276aj = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a98, R.attr.a99, R.attr.a_u, R.attr.a_v, R.attr.a_w, R.attr.a_x, R.attr.a_y, R.attr.a_z, R.attr.aa0, R.attr.aa1, R.attr.aa2, R.attr.aa4, R.attr.aa5, R.attr.aa6, R.attr.aa7, R.attr.aa8, R.attr.aa9, R.attr.aa_, R.attr.aaa, R.attr.aab, R.attr.aac});
        int resourceId = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId == 0) {
            this.f23291p = new ArrayList();
        } else {
            this.f23291p = Arrays.asList(getResources().getStringArray(resourceId));
        }
        this.f23293r = obtainStyledAttributes.getInt(20, 7);
        this.f23252I = obtainStyledAttributes.getInt(17, 0);
        this.f23267aa = obtainStyledAttributes.getBoolean(16, false);
        this.f23263T = obtainStyledAttributes.getInt(15, -1);
        this.f23292q = obtainStyledAttributes.getString(14);
        this.f23299x = obtainStyledAttributes.getColor(18, -1);
        this.f23298w = obtainStyledAttributes.getColor(12, -7829368);
        this.f23271ae = obtainStyledAttributes.getBoolean(6, false);
        this.f23268ab = obtainStyledAttributes.getBoolean(8, false);
        this.f23245B = obtainStyledAttributes.getColor(9, -2105377);
        this.f23269ac = obtainStyledAttributes.getBoolean(3, false);
        this.f23246C = obtainStyledAttributes.getColor(4, -1996488705);
        this.f23270ad = obtainStyledAttributes.getBoolean(2, false);
        this.f23272af = obtainStyledAttributes.getBoolean(5, false);
        this.f23248E = obtainStyledAttributes.getInt(1, 0);
        this.f23275ai = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        m16747a();
        this.f23278c = new Paint(69);
        this.f23278c.setTextSize((float) this.f23300y);
        if (this.f23275ai != null) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), this.f23275ai));
        }
        m16751c();
        m16750b();
        this.f23279d = new Scroller(getContext());
        if (VERSION.SDK_INT >= 4) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            this.f23256M = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f23257N = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f23266W = viewConfiguration.getScaledTouchSlop();
        }
        this.f23284i = new Rect();
        this.f23285j = new Rect();
        this.f23286k = new Rect();
        this.f23287l = new Rect();
        this.f23288m = new Camera();
        this.f23289n = new Matrix();
        this.f23290o = new Matrix();
    }

    /* renamed from: a */
    private static int m16746a(int i, int i2, int i3) {
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
        this.f23284i.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f23258O = this.f23284i.centerX();
        this.f23259P = this.f23284i.centerY();
        m16752d();
        this.f23251H = this.f23284i.height() / 2;
        this.f23249F = this.f23284i.height() / this.f23293r;
        this.f23250G = this.f23249F / 2;
        m16753e();
        m16754f();
        m16755g();
    }
}
