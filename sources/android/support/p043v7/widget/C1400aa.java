package android.support.p043v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1339l;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: android.support.v7.widget.aa */
final class C1400aa extends C1331h implements C1339l {

    /* renamed from: t */
    private static final int[] f5033t = {16842919};

    /* renamed from: u */
    private static final int[] f5034u = new int[0];

    /* renamed from: A */
    private int f5035A;

    /* renamed from: B */
    private final int[] f5036B = new int[2];

    /* renamed from: C */
    private final int[] f5037C = new int[2];

    /* renamed from: D */
    private final Runnable f5038D = new Runnable() {
        public final void run() {
            C1400aa aaVar = C1400aa.this;
            switch (aaVar.f5058s) {
                case 1:
                    aaVar.f5057r.cancel();
                    break;
                case 2:
                    break;
                default:
                    return;
            }
            aaVar.f5058s = 3;
            aaVar.f5057r.setFloatValues(new float[]{((Float) aaVar.f5057r.getAnimatedValue()).floatValue(), 0.0f});
            aaVar.f5057r.setDuration(500);
            aaVar.f5057r.start();
        }
    };

    /* renamed from: E */
    private final C1340m f5039E = new C1340m() {
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            boolean z2;
            C1400aa aaVar = C1400aa.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = aaVar.f5053n.computeVerticalScrollRange();
            int i3 = aaVar.f5052m;
            if (computeVerticalScrollRange - i3 <= 0 || aaVar.f5052m < aaVar.f5040a) {
                z = false;
            } else {
                z = true;
            }
            aaVar.f5054o = z;
            int computeHorizontalScrollRange = aaVar.f5053n.computeHorizontalScrollRange();
            int i4 = aaVar.f5051l;
            if (computeHorizontalScrollRange - i4 <= 0 || aaVar.f5051l < aaVar.f5040a) {
                z2 = false;
            } else {
                z2 = true;
            }
            aaVar.f5055p = z2;
            if (aaVar.f5054o || aaVar.f5055p) {
                if (aaVar.f5054o) {
                    float f = (float) i3;
                    aaVar.f5046g = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                    aaVar.f5045f = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (aaVar.f5055p) {
                    float f2 = (float) computeHorizontalScrollOffset;
                    float f3 = (float) i4;
                    aaVar.f5049j = (int) ((f3 * (f2 + (f3 / 2.0f))) / ((float) computeHorizontalScrollRange));
                    aaVar.f5048i = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                if (aaVar.f5056q == 0 || aaVar.f5056q == 1) {
                    aaVar.mo5470a(1);
                }
                return;
            }
            if (aaVar.f5056q != 0) {
                aaVar.mo5470a(0);
            }
        }
    };

    /* renamed from: a */
    final int f5040a;

    /* renamed from: b */
    public final StateListDrawable f5041b;

    /* renamed from: c */
    public final Drawable f5042c;

    /* renamed from: d */
    public final StateListDrawable f5043d;

    /* renamed from: e */
    public final Drawable f5044e;

    /* renamed from: f */
    int f5045f;

    /* renamed from: g */
    int f5046g;

    /* renamed from: h */
    float f5047h;

    /* renamed from: i */
    int f5048i;

    /* renamed from: j */
    int f5049j;

    /* renamed from: k */
    float f5050k;

    /* renamed from: l */
    int f5051l;

    /* renamed from: m */
    int f5052m;

    /* renamed from: n */
    RecyclerView f5053n;

    /* renamed from: o */
    boolean f5054o;

    /* renamed from: p */
    boolean f5055p;

    /* renamed from: q */
    int f5056q;

    /* renamed from: r */
    final ValueAnimator f5057r = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: s */
    int f5058s = 0;

    /* renamed from: v */
    private final int f5059v;

    /* renamed from: w */
    private final int f5060w;

    /* renamed from: x */
    private final int f5061x;

    /* renamed from: y */
    private final int f5062y;

    /* renamed from: z */
    private final int f5063z;

    /* renamed from: android.support.v7.widget.aa$a */
    class C1403a extends AnimatorListenerAdapter {

        /* renamed from: b */
        private boolean f5067b;

        public final void onAnimationCancel(Animator animator) {
            this.f5067b = true;
        }

        C1403a() {
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f5067b) {
                this.f5067b = false;
            } else if (((Float) C1400aa.this.f5057r.getAnimatedValue()).floatValue() == 0.0f) {
                C1400aa.this.f5058s = 0;
                C1400aa.this.mo5470a(0);
            } else {
                C1400aa.this.f5058s = 2;
                C1400aa.this.mo5469a();
            }
        }
    }

    /* renamed from: android.support.v7.widget.aa$b */
    class C1404b implements AnimatorUpdateListener {
        C1404b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1400aa.this.f5041b.setAlpha(floatValue);
            C1400aa.this.f5042c.setAlpha(floatValue);
            C1400aa.this.mo5469a();
        }
    }

    /* renamed from: a */
    public final void mo5079a(boolean z) {
    }

    /* renamed from: d */
    private void m4846d() {
        this.f5053n.removeCallbacks(this.f5038D);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5469a() {
        this.f5053n.invalidate();
    }

    /* renamed from: b */
    private boolean m4843b() {
        if (C1056u.m3055f(this.f5053n) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m4845c() {
        int i = this.f5058s;
        if (i != 0) {
            if (i == 3) {
                this.f5057r.cancel();
            } else {
                return;
            }
        }
        this.f5058s = 1;
        this.f5057r.setFloatValues(new float[]{((Float) this.f5057r.getAnimatedValue()).floatValue(), 1.0f});
        this.f5057r.setDuration(500);
        this.f5057r.setStartDelay(0);
        this.f5057r.start();
    }

    /* renamed from: b */
    private void m4842b(int i) {
        m4846d();
        this.f5053n.postDelayed(this.f5038D, (long) i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5470a(int i) {
        if (i == 2 && this.f5056q != 2) {
            this.f5041b.setState(f5033t);
            m4846d();
        }
        if (i == 0) {
            mo5469a();
        } else {
            m4845c();
        }
        if (this.f5056q == 2 && i != 2) {
            this.f5041b.setState(f5034u);
            m4842b(1200);
        } else if (i == 1) {
            m4842b(1500);
        }
        this.f5056q = i;
    }

    /* renamed from: a */
    private boolean m4841a(float f, float f2) {
        if (!m4843b() ? f >= ((float) (this.f5051l - this.f5060w)) : f <= ((float) (this.f5060w / 2))) {
            if (f2 >= ((float) (this.f5046g - (this.f5045f / 2))) && f2 <= ((float) (this.f5046g + (this.f5045f / 2)))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m4844b(float f, float f2) {
        if (f2 < ((float) (this.f5052m - this.f5062y)) || f < ((float) (this.f5049j - (this.f5048i / 2))) || f > ((float) (this.f5049j + (this.f5048i / 2)))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo5080a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f5056q == 1) {
            boolean a = m4841a(motionEvent.getX(), motionEvent.getY());
            boolean b = m4844b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!a && !b) {
                return false;
            }
            if (b) {
                this.f5035A = 1;
                this.f5050k = (float) ((int) motionEvent.getX());
            } else if (a) {
                this.f5035A = 2;
                this.f5047h = (float) ((int) motionEvent.getY());
            }
            mo5470a(2);
        } else if (this.f5056q != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo5081b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f5056q != 0) {
            if (motionEvent.getAction() == 0) {
                boolean a = m4841a(motionEvent.getX(), motionEvent.getY());
                boolean b = m4844b(motionEvent.getX(), motionEvent.getY());
                if (a || b) {
                    if (b) {
                        this.f5035A = 1;
                        this.f5050k = (float) ((int) motionEvent.getX());
                    } else if (a) {
                        this.f5035A = 2;
                        this.f5047h = (float) ((int) motionEvent.getY());
                    }
                    mo5470a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f5056q == 2) {
                this.f5047h = 0.0f;
                this.f5050k = 0.0f;
                mo5470a(1);
                this.f5035A = 0;
            } else {
                if (motionEvent.getAction() == 2 && this.f5056q == 2) {
                    m4845c();
                    if (this.f5035A == 1) {
                        float x = motionEvent.getX();
                        this.f5037C[0] = this.f5059v;
                        this.f5037C[1] = this.f5051l - this.f5059v;
                        int[] iArr = this.f5037C;
                        float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                        if (Math.abs(((float) this.f5049j) - max) >= 2.0f) {
                            int a2 = m4840a(this.f5050k, max, iArr, this.f5053n.computeHorizontalScrollRange(), this.f5053n.computeHorizontalScrollOffset(), this.f5051l);
                            if (a2 != 0) {
                                this.f5053n.scrollBy(a2, 0);
                            }
                            this.f5050k = max;
                        }
                    }
                    if (this.f5035A == 2) {
                        float y = motionEvent.getY();
                        this.f5036B[0] = this.f5059v;
                        this.f5036B[1] = this.f5052m - this.f5059v;
                        int[] iArr2 = this.f5036B;
                        float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y));
                        if (Math.abs(((float) this.f5046g) - max2) >= 2.0f) {
                            int a3 = m4840a(this.f5047h, max2, iArr2, this.f5053n.computeVerticalScrollRange(), this.f5053n.computeVerticalScrollOffset(), this.f5052m);
                            if (a3 != 0) {
                                this.f5053n.scrollBy(0, a3);
                            }
                            this.f5047h = max2;
                        }
                    }
                }
            }
        }
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        if (this.f5051l == this.f5053n.getWidth() && this.f5052m == this.f5053n.getHeight()) {
            if (this.f5058s != 0) {
                if (this.f5054o) {
                    int i = this.f5051l - this.f5060w;
                    int i2 = this.f5046g - (this.f5045f / 2);
                    this.f5041b.setBounds(0, 0, this.f5060w, this.f5045f);
                    this.f5042c.setBounds(0, 0, this.f5061x, this.f5052m);
                    if (m4843b()) {
                        this.f5042c.draw(canvas);
                        canvas.translate((float) this.f5060w, (float) i2);
                        canvas.scale(-1.0f, 1.0f);
                        this.f5041b.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate((float) (-this.f5060w), (float) (-i2));
                    } else {
                        canvas.translate((float) i, 0.0f);
                        this.f5042c.draw(canvas);
                        canvas.translate(0.0f, (float) i2);
                        this.f5041b.draw(canvas);
                        canvas.translate((float) (-i), (float) (-i2));
                    }
                }
                if (this.f5055p) {
                    int i3 = this.f5052m - this.f5062y;
                    int i4 = this.f5049j - (this.f5048i / 2);
                    this.f5043d.setBounds(0, 0, this.f5048i, this.f5062y);
                    this.f5044e.setBounds(0, 0, this.f5051l, this.f5063z);
                    canvas.translate(0.0f, (float) i3);
                    this.f5044e.draw(canvas);
                    canvas.translate((float) i4, 0.0f);
                    this.f5043d.draw(canvas);
                    canvas.translate((float) (-i4), (float) (-i3));
                }
            }
            return;
        }
        this.f5051l = this.f5053n.getWidth();
        this.f5052m = this.f5053n.getHeight();
        mo5470a(0);
    }

    /* renamed from: a */
    private static int m4840a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    C1400aa(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f5041b = stateListDrawable;
        this.f5042c = drawable;
        this.f5043d = stateListDrawable2;
        this.f5044e = drawable2;
        this.f5060w = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f5061x = Math.max(i, drawable.getIntrinsicWidth());
        this.f5062y = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f5063z = Math.max(i, drawable2.getIntrinsicWidth());
        this.f5040a = i2;
        this.f5059v = i3;
        this.f5041b.setAlpha(NormalGiftView.ALPHA_255);
        this.f5042c.setAlpha(NormalGiftView.ALPHA_255);
        this.f5057r.addListener(new C1403a());
        this.f5057r.addUpdateListener(new C1404b());
        if (this.f5053n != recyclerView) {
            if (this.f5053n != null) {
                this.f5053n.mo4815b((C1331h) this);
                this.f5053n.mo4817b((C1339l) this);
                this.f5053n.mo4818b(this.f5039E);
                m4846d();
            }
            this.f5053n = recyclerView;
            if (this.f5053n != null) {
                this.f5053n.mo4798a((C1331h) this);
                this.f5053n.mo4800a((C1339l) this);
                this.f5053n.mo4801a(this.f5039E);
            }
        }
    }
}
