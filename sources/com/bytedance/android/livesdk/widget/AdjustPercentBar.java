package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;

public class AdjustPercentBar extends View {

    /* renamed from: L */
    static Drawable f22912L;

    /* renamed from: M */
    static Drawable f22913M;

    /* renamed from: A */
    String f22914A;

    /* renamed from: B */
    float f22915B;

    /* renamed from: C */
    boolean f22916C;

    /* renamed from: D */
    boolean f22917D;

    /* renamed from: E */
    Context f22918E;

    /* renamed from: F */
    boolean f22919F;

    /* renamed from: G */
    Rect f22920G;

    /* renamed from: H */
    public String f22921H;

    /* renamed from: I */
    public int f22922I;

    /* renamed from: J */
    boolean f22923J;

    /* renamed from: K */
    boolean f22924K;

    /* renamed from: N */
    boolean f22925N;

    /* renamed from: O */
    ValueAnimator f22926O;

    /* renamed from: P */
    boolean f22927P;

    /* renamed from: Q */
    public int f22928Q;

    /* renamed from: R */
    public String f22929R;

    /* renamed from: S */
    public ValueAnimator f22930S;

    /* renamed from: T */
    public float f22931T;

    /* renamed from: U */
    public Handler f22932U;

    /* renamed from: V */
    public Runnable f22933V;

    /* renamed from: W */
    private C8452b f22934W;

    /* renamed from: a */
    int f22935a;

    /* renamed from: aa */
    private int f22936aa;

    /* renamed from: ab */
    private float f22937ab;

    /* renamed from: ac */
    private float f22938ac;

    /* renamed from: ad */
    private float f22939ad;

    /* renamed from: ae */
    private float f22940ae;

    /* renamed from: af */
    private int f22941af;

    /* renamed from: ag */
    private int f22942ag;

    /* renamed from: ah */
    private int f22943ah;

    /* renamed from: ai */
    private int f22944ai;

    /* renamed from: aj */
    private Runnable f22945aj;

    /* renamed from: ak */
    private int f22946ak;

    /* renamed from: al */
    private boolean f22947al;

    /* renamed from: b */
    int f22948b;

    /* renamed from: c */
    int f22949c;

    /* renamed from: d */
    int f22950d;

    /* renamed from: e */
    int f22951e;

    /* renamed from: f */
    int f22952f;

    /* renamed from: g */
    int f22953g;

    /* renamed from: h */
    int f22954h;

    /* renamed from: i */
    int f22955i;

    /* renamed from: j */
    int f22956j;

    /* renamed from: k */
    int f22957k;

    /* renamed from: l */
    int f22958l;

    /* renamed from: m */
    int f22959m;

    /* renamed from: n */
    int f22960n;

    /* renamed from: o */
    int f22961o;

    /* renamed from: p */
    float f22962p;

    /* renamed from: q */
    int f22963q;

    /* renamed from: r */
    int f22964r;

    /* renamed from: s */
    Paint f22965s;

    /* renamed from: t */
    Paint f22966t;

    /* renamed from: u */
    Paint f22967u;

    /* renamed from: v */
    Paint f22968v;

    /* renamed from: w */
    Paint f22969w;

    /* renamed from: x */
    Paint f22970x;

    /* renamed from: y */
    int f22971y;

    /* renamed from: z */
    int f22972z;

    /* renamed from: com.bytedance.android.livesdk.widget.AdjustPercentBar$a */
    class C8449a implements Runnable {
        public final void run() {
            if (AdjustPercentBar.this.f22927P) {
                if (AdjustPercentBar.this.f22926O != null) {
                    AdjustPercentBar.this.f22926O.removeAllListeners();
                    AdjustPercentBar.this.f22926O.cancel();
                }
                AdjustPercentBar.this.f22970x.setShadowLayer(0.0f, 0.0f, 0.0f, AdjustPercentBar.this.f22958l);
                AdjustPercentBar.this.f22926O = ValueAnimator.ofFloat(new float[]{1.0f});
                AdjustPercentBar.this.f22926O.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        AdjustPercentBar.this.setTextAlpha((int) ((1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 255.0f));
                        AdjustPercentBar.this.invalidate();
                    }
                });
                AdjustPercentBar.this.f22926O.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                    }
                });
                AdjustPercentBar.this.f22926O.setDuration(300);
                AdjustPercentBar.this.f22926O.start();
                AdjustPercentBar.this.f22927P = false;
            }
        }

        private C8449a() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.AdjustPercentBar$b */
    public interface C8452b {
        /* renamed from: a */
        void mo8569a(int i);
    }

    public int getPercent() {
        return this.f22971y;
    }

    /* renamed from: b */
    private boolean m16654b() {
        if (this.f22944ai == 0 && (this.f22922I == 0 || this.f22922I == 100)) {
            return false;
        }
        return true;
    }

    public void buildDrawingCache() {
        if (VERSION.SDK_INT >= 23 || ((long) getWidth()) * ((long) getHeight()) * 4 < 838860800) {
            super.buildDrawingCache();
        }
    }

    /* renamed from: a */
    private void m16651a() {
        this.f22960n = this.f22935a / 2;
        this.f22961o = C3922z.m9899a(32.0f);
        this.f22962p = (((float) this.f22935a) - (this.f22940ae * 2.0f)) / ((float) this.f22942ag);
        this.f22919F = true;
        invalidate();
    }

    /* renamed from: c */
    private void m16655c() {
        float f;
        removeCallbacks(this.f22945aj);
        if (!this.f22927P && !TextUtils.isEmpty(this.f22914A)) {
            if (this.f22926O != null) {
                this.f22926O.removeAllListeners();
                this.f22926O.cancel();
            }
            Paint paint = this.f22970x;
            if (this.f22925N) {
                f = 0.0f;
            } else {
                f = 3.0f;
            }
            paint.setShadowLayer((float) C3922z.m9899a(f), 0.0f, 0.0f, this.f22958l);
            setTextAlpha(NormalGiftView.ALPHA_255);
            this.f22927P = true;
            invalidate();
        }
    }

    public void setIsTwoWayMode(boolean z) {
        this.f22947al = z;
    }

    public void setLevelAdjustBarTitle(String str) {
        this.f22921H = str;
    }

    public void setTextInCenter(boolean z) {
        this.f22924K = z;
    }

    public AdjustPercentBar(Context context) {
        this(context, null);
    }

    public void setOnLevelChangeListener(final C8452b bVar) {
        this.f22934W = new C8452b() {
            /* renamed from: a */
            public final void mo8569a(int i) {
                AdjustPercentBar.this.f22932U.removeCallbacks(AdjustPercentBar.this.f22933V);
                if (AdjustPercentBar.this.f22929R != null && i == AdjustPercentBar.this.f22922I) {
                    AdjustPercentBar.this.f22932U.postDelayed(AdjustPercentBar.this.f22933V, 100);
                } else if (AdjustPercentBar.this.f22930S != null) {
                    AdjustPercentBar.this.f22930S.cancel();
                    AdjustPercentBar.this.f22930S = null;
                }
                bVar.mo8569a(i);
            }
        };
    }

    public void setPercent(int i) {
        this.f22971y = i;
        invalidate();
    }

    public void setTextAlpha(int i) {
        this.f22946ak = i;
        this.f22970x.setAlpha(i);
        this.f22969w.setAlpha(i);
    }

    /* renamed from: a */
    private int m16650a(int i) {
        int i2;
        if (this.f22941af > 1) {
            i = m16653b(i);
        }
        if (i > this.f22942ag) {
            i2 = this.f22943ah;
        } else if (i <= 0) {
            i2 = this.f22944ai;
        } else {
            i2 = i + this.f22944ai;
        }
        if (!m16654b() || i2 < this.f22922I - 2 || i2 > this.f22922I + 2) {
            return i2;
        }
        return this.f22922I;
    }

    /* renamed from: b */
    private int m16653b(int i) {
        if (((float) (i % this.f22941af)) >= ((float) this.f22941af) / 2.0f) {
            return ((i / this.f22941af) + 1) * this.f22941af;
        }
        return (i / this.f22941af) * this.f22941af;
    }

    public void buildDrawingCache(boolean z) {
        if (VERSION.SDK_INT >= 23 || ((long) getWidth()) * ((long) getHeight()) * 4 < 838860800) {
            super.buildDrawingCache(z);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        String str;
        Paint paint;
        int i;
        Drawable drawable;
        super.onDraw(canvas);
        if (this.f22919F) {
            int i2 = this.f22971y - this.f22944ai;
            float f = (((float) i2) * this.f22962p) + this.f22940ae;
            float f2 = this.f22940ae + (((float) (this.f22922I - this.f22944ai)) * this.f22962p);
            canvas.drawLine(this.f22940ae, (float) this.f22961o, ((float) this.f22935a) - this.f22940ae, (float) this.f22961o, this.f22966t);
            if (this.f22923J) {
                canvas.drawLine(this.f22940ae, (float) this.f22961o, f, (float) this.f22961o, this.f22965s);
            } else {
                canvas.drawLine(f, (float) this.f22961o, f2, (float) this.f22961o, this.f22965s);
            }
            Paint paint2 = this.f22967u;
            int i3 = NormalGiftView.ALPHA_255;
            paint2.setAlpha(NormalGiftView.ALPHA_255);
            this.f22968v.setAlpha(NormalGiftView.ALPHA_255);
            this.f22970x.setAlpha(NormalGiftView.ALPHA_255);
            this.f22969w.setAlpha(NormalGiftView.ALPHA_255);
            canvas.drawCircle(f, (float) this.f22961o, this.f22938ac, this.f22967u);
            if (this.f22922I >= this.f22944ai && this.f22922I <= this.f22943ah && m16654b()) {
                canvas.drawCircle(f2, (float) this.f22961o, (float) this.f22951e, this.f22968v);
            }
            int i4 = this.f22928Q;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f22971y;
            }
            if (this.f22931T == 0.0f) {
                str = String.valueOf(i4);
            } else if (this.f22929R == null) {
                str = "";
            } else {
                str = this.f22929R;
            }
            if (TextUtils.isEmpty(this.f22921H) || TextUtils.isEmpty(str)) {
                this.f22914A = str;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f22921H);
                sb.append(" ");
                sb.append(str);
                this.f22914A = sb.toString();
            }
            if (!TextUtils.isEmpty(this.f22914A)) {
                if (this.f22924K) {
                    paint = this.f22970x;
                } else {
                    paint = this.f22969w;
                }
                this.f22969w.getTextBounds(this.f22914A, 0, this.f22914A.length(), this.f22920G);
                int width = this.f22920G.width();
                int a = C3922z.m9899a(14.0f);
                if (this.f22924K) {
                    i = this.f22960n;
                } else {
                    i = (int) f;
                }
                int a2 = (i - (width / 2)) - C3922z.m9899a(1.0f);
                int i5 = this.f22961o - a;
                if (this.f22925N) {
                    drawable = f22913M;
                } else {
                    drawable = f22912L;
                }
                if (!this.f22924K && drawable != null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int max = Math.max(width, intrinsicWidth);
                    if (this.f22931T == 1.0f) {
                        i3 = this.f22946ak;
                        max += intrinsicWidth;
                    } else if (this.f22931T > 0.0f) {
                        float f3 = (float) intrinsicWidth;
                        max = (int) (((float) ((int) ((((float) (max - intrinsicWidth)) * this.f22931T) + f3))) + (f3 * this.f22931T));
                    } else {
                        i3 = this.f22946ak;
                    }
                    float f4 = ((float) i) - (((float) max) / 2.0f);
                    float a3 = (float) (this.f22961o - C3922z.m9899a(57.0f));
                    drawable.setAlpha(i3);
                    drawable.setBounds(0, 0, max, drawable.getIntrinsicHeight());
                    canvas.save();
                    canvas.translate(f4, a3);
                    drawable.draw(canvas);
                    canvas.restore();
                }
                if (this.f22931T <= 0.0f || this.f22931T >= 1.0f) {
                    canvas.drawText(this.f22914A, (float) a2, (float) i5, paint);
                    return;
                }
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (this.f22931T * 255.0f));
                canvas.drawText(this.f22914A, (float) a2, (float) i5, paint);
                paint.setAlpha(alpha);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f22917D) {
            return true;
        }
        boolean z = false;
        if (motionEvent.getAction() == 0 && (motionEvent.getX() < this.f22940ae - ((float) this.f22952f) || motionEvent.getX() > ((float) C3922z.m9910c()) - (this.f22940ae - ((float) this.f22952f)))) {
            return false;
        }
        if (motionEvent.getAction() == 0 && Math.abs(motionEvent.getY() - ((float) this.f22961o)) > ((float) (this.f22948b - this.f22961o))) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                m16655c();
                this.f22972z = this.f22971y;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                double abs = (double) Math.abs(x - (this.f22940ae + (((float) (this.f22971y - this.f22944ai)) * this.f22962p)));
                double d = (double) this.f22950d;
                Double.isNaN(d);
                if (abs <= d * 2.5d) {
                    double abs2 = (double) Math.abs(y - ((float) this.f22961o));
                    double d2 = (double) this.f22950d;
                    Double.isNaN(d2);
                    if (abs2 <= d2 * 2.5d) {
                        z = true;
                    }
                }
                this.f22916C = !z;
                this.f22915B = motionEvent.getX();
                int a = m16650a((int) ((this.f22915B - this.f22940ae) / this.f22962p));
                if (this.f22971y != a) {
                    this.f22971y = a;
                    this.f22972z = a;
                    if (this.f22934W != null) {
                        this.f22934W.mo8569a(this.f22971y);
                    }
                    invalidate();
                    break;
                }
                break;
            case 1:
                float x2 = motionEvent.getX();
                if (this.f22916C && Math.abs(x2 - this.f22915B) <= ((float) C3922z.m9899a(3.0f))) {
                    final int a2 = m16650a((int) ((x2 - this.f22940ae) / this.f22962p));
                    if (this.f22934W != null) {
                        this.f22971y = a2;
                        this.f22934W.mo8569a(a2);
                    }
                    final int i = this.f22971y;
                    this.f22917D = false;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.setTarget(this);
                    ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            AdjustPercentBar.this.f22971y = (int) (((float) i) + (((float) (a2 - i)) * floatValue));
                            AdjustPercentBar.this.invalidate();
                        }
                    });
                    ofFloat.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            AdjustPercentBar.this.f22917D = true;
                            super.onAnimationEnd(animator);
                        }
                    });
                    ofFloat.setDuration(50);
                    ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat.start();
                    break;
                }
            case 2:
                m16655c();
                int a3 = m16650a((this.f22972z - this.f22944ai) + ((int) ((motionEvent.getX() - this.f22915B) / this.f22962p)));
                if (!(this.f22934W == null || this.f22971y == a3)) {
                    this.f22971y = a3;
                    this.f22934W.mo8569a(this.f22971y);
                }
                invalidate();
                break;
        }
        return true;
    }

    public AdjustPercentBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdjustPercentBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22949c = C3922z.m9899a(4.0f);
        this.f22950d = C3922z.m9899a(9.0f);
        this.f22951e = C3922z.m9899a(2.0f);
        this.f22952f = C3922z.m9899a(10.0f);
        this.f22953g = 1;
        this.f22917D = true;
        this.f22919F = false;
        this.f22920G = new Rect();
        this.f22921H = null;
        this.f22936aa = 0;
        this.f22937ab = 0.0f;
        this.f22938ac = 0.0f;
        this.f22939ad = 0.0f;
        this.f22940ae = (float) C3922z.m9899a(40.0f);
        this.f22923J = true;
        this.f22924K = false;
        this.f22927P = true;
        this.f22928Q = DynamicTabYellowPointVersion.DEFAULT;
        this.f22945aj = new C8449a();
        this.f22946ak = 0;
        this.f22931T = 0.1f;
        this.f22932U = new Handler(Looper.getMainLooper());
        this.f22933V = new Runnable() {
            public final void run() {
            }
        };
        this.f22918E = context;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a82, R.attr.a86, R.attr.a8l, R.attr.a8m, R.attr.a92, R.attr.a93, R.attr.a96});
            String string = obtainStyledAttributes.getString(4);
            if (string == null) {
                string = "";
            }
            this.f22921H = string;
            this.f22936aa = obtainStyledAttributes.getColor(5, -16777216);
            this.f22937ab = obtainStyledAttributes.getDimension(6, (float) C3922z.m9899a(14.0f));
            this.f22940ae = obtainStyledAttributes.getDimension(0, (float) C3922z.m9899a(40.0f));
            this.f22938ac = obtainStyledAttributes.getDimension(2, (float) this.f22950d);
            this.f22939ad = obtainStyledAttributes.getDimension(1, (float) this.f22949c);
            this.f22941af = obtainStyledAttributes.getInt(3, this.f22953g);
            obtainStyledAttributes.recycle();
            setLayerType(1, null);
            this.f22954h = C3922z.m9909b((int) R.color.alt);
            this.f22955i = 1040187391;
            this.f22956j = C3922z.m9909b((int) R.color.a9m);
            this.f22957k = C3922z.m9909b((int) R.color.agu);
            this.f22958l = 1073741824;
            this.f22959m = C3922z.m9909b((int) R.color.a8w);
            this.f22963q = C3922z.m9900a("#ff4e33", C3922z.m9909b((int) R.color.alt));
            this.f22964r = C3922z.m9909b((int) R.color.alt);
            this.f22965s = new Paint();
            this.f22965s.setStyle(Style.FILL);
            this.f22965s.setStrokeWidth(this.f22939ad);
            this.f22965s.setStrokeCap(Cap.ROUND);
            this.f22965s.setAntiAlias(true);
            this.f22966t = new Paint();
            this.f22966t.setStyle(Style.FILL);
            this.f22966t.setStrokeWidth(this.f22939ad);
            this.f22966t.setStrokeCap(Cap.ROUND);
            this.f22966t.setAntiAlias(true);
            this.f22967u = new Paint();
            this.f22967u.setStyle(Style.FILL);
            this.f22967u.setAntiAlias(true);
            this.f22968v = new Paint();
            this.f22968v.setStyle(Style.FILL);
            this.f22968v.setAntiAlias(true);
            this.f22969w = new Paint();
            this.f22969w.setTextSize(this.f22937ab);
            this.f22969w.setAntiAlias(true);
            this.f22970x = new Paint();
            this.f22970x.setTextSize(this.f22937ab);
            this.f22970x.setAntiAlias(true);
            this.f22965s.setColor(this.f22954h);
            this.f22965s.setShadowLayer((float) C3922z.m9899a(1.0f), 0.0f, 0.0f, this.f22958l);
            this.f22966t.setColor(this.f22955i);
            this.f22966t.setShadowLayer((float) C3922z.m9899a(1.0f), 0.0f, 0.0f, this.f22958l);
            this.f22967u.setColor(this.f22963q);
            this.f22967u.setShadowLayer((float) C3922z.m9899a(3.0f), 0.0f, 0.0f, this.f22958l);
            this.f22968v.setColor(this.f22954h);
            this.f22969w.setColor(this.f22964r);
            this.f22970x.setColor(this.f22954h);
            setTextAlpha(this.f22946ak);
            this.f22925N = false;
            if (this.f22925N && f22913M == null) {
                f22913M = getResources().getDrawable(R.drawable.bm5);
            }
            if (!this.f22925N && f22912L == null) {
                f22912L = getResources().getDrawable(R.drawable.bm5);
            }
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo14664a(int i, int i2, int i3, boolean z) {
        m16652a(i, i2, 0, null, z);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f22948b != getMeasuredHeight() || this.f22935a != getMeasuredWidth()) {
            this.f22935a = getMeasuredWidth();
            this.f22948b = getMeasuredHeight();
            m16651a();
        }
    }

    /* renamed from: a */
    private void m16652a(int i, int i2, int i3, String str, boolean z) {
        this.f22943ah = i;
        this.f22944ai = i2;
        if (i3 > this.f22943ah || i3 < this.f22944ai) {
            this.f22922I = this.f22943ah;
        } else {
            this.f22922I = i3;
        }
        this.f22942ag = this.f22943ah - this.f22944ai;
        this.f22923J = z;
        if (this.f22935a > 0 && this.f22948b > 0) {
            m16651a();
        }
        invalidate();
        this.f22929R = null;
        if (this.f22930S != null) {
            this.f22930S.cancel();
            this.f22930S = null;
        }
        this.f22931T = 0.0f;
    }
}
