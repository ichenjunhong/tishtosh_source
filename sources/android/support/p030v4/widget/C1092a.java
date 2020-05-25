package android.support.p030v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.p030v4.view.C1056u;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.a */
public abstract class C1092a implements OnTouchListener {

    /* renamed from: r */
    private static final int f3453r = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    final C1093a f3454a = new C1093a();

    /* renamed from: b */
    final View f3455b;

    /* renamed from: c */
    boolean f3456c;

    /* renamed from: d */
    boolean f3457d;

    /* renamed from: e */
    boolean f3458e;

    /* renamed from: f */
    public boolean f3459f;

    /* renamed from: g */
    public boolean f3460g;

    /* renamed from: h */
    private final Interpolator f3461h = new AccelerateInterpolator();

    /* renamed from: i */
    private Runnable f3462i;

    /* renamed from: j */
    private float[] f3463j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f3464k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l */
    private int f3465l;

    /* renamed from: m */
    private int f3466m;

    /* renamed from: n */
    private float[] f3467n = {0.0f, 0.0f};

    /* renamed from: o */
    private float[] f3468o = {0.0f, 0.0f};

    /* renamed from: p */
    private float[] f3469p = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: q */
    private boolean f3470q;

    /* renamed from: android.support.v4.widget.a$a */
    static class C1093a {

        /* renamed from: a */
        public int f3471a;

        /* renamed from: b */
        public int f3472b;

        /* renamed from: c */
        float f3473c;

        /* renamed from: d */
        float f3474d;

        /* renamed from: e */
        long f3475e = Long.MIN_VALUE;

        /* renamed from: f */
        long f3476f;

        /* renamed from: g */
        public int f3477g;

        /* renamed from: h */
        public int f3478h;

        /* renamed from: i */
        long f3479i = -1;

        /* renamed from: j */
        float f3480j;

        /* renamed from: k */
        int f3481k;

        C1093a() {
        }

        /* renamed from: b */
        public final int mo3491b() {
            return (int) (this.f3473c / Math.abs(this.f3473c));
        }

        /* renamed from: c */
        public final int mo3492c() {
            return (int) (this.f3474d / Math.abs(this.f3474d));
        }

        /* renamed from: a */
        public final void mo3490a() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3481k = C1092a.m3185a((int) (currentAnimationTimeMillis - this.f3475e), 0, this.f3472b);
            this.f3480j = mo3489a(currentAnimationTimeMillis);
            this.f3479i = currentAnimationTimeMillis;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public float mo3489a(long j) {
            if (j < this.f3475e) {
                return 0.0f;
            }
            if (this.f3479i < 0 || j < this.f3479i) {
                return C1092a.m3182a(((float) (j - this.f3475e)) / ((float) this.f3471a), 0.0f, 1.0f) * 0.5f;
            }
            return (1.0f - this.f3480j) + (this.f3480j * C1092a.m3182a(((float) (j - this.f3479i)) / ((float) this.f3481k), 0.0f, 1.0f));
        }
    }

    /* renamed from: android.support.v4.widget.a$b */
    class C1094b implements Runnable {
        public final void run() {
            boolean z;
            if (C1092a.this.f3458e) {
                if (C1092a.this.f3456c) {
                    C1092a.this.f3456c = false;
                    C1093a aVar = C1092a.this.f3454a;
                    aVar.f3475e = AnimationUtils.currentAnimationTimeMillis();
                    aVar.f3479i = -1;
                    aVar.f3476f = aVar.f3475e;
                    aVar.f3480j = 0.5f;
                    aVar.f3477g = 0;
                    aVar.f3478h = 0;
                }
                C1093a aVar2 = C1092a.this.f3454a;
                if (aVar2.f3479i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= aVar2.f3479i + ((long) aVar2.f3481k)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z || !C1092a.this.mo3486a()) {
                    C1092a.this.f3458e = false;
                    return;
                }
                if (C1092a.this.f3457d) {
                    C1092a.this.f3457d = false;
                    C1092a aVar3 = C1092a.this;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar3.f3455b.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar2.f3476f != 0) {
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    float a = aVar2.mo3489a(currentAnimationTimeMillis);
                    float f = (-4.0f * a * a) + (a * 4.0f);
                    long j = currentAnimationTimeMillis - aVar2.f3476f;
                    aVar2.f3476f = currentAnimationTimeMillis;
                    float f2 = ((float) j) * f;
                    aVar2.f3477g = (int) (aVar2.f3473c * f2);
                    aVar2.f3478h = (int) (f2 * aVar2.f3474d);
                    C1092a.this.mo3485a(aVar2.f3477g, aVar2.f3478h);
                    C1056u.m3034a(C1092a.this.f3455b, (Runnable) this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }

        C1094b() {
        }
    }

    /* renamed from: a */
    static float m3182a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    static int m3185a(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: a */
    public abstract void mo3485a(int i, int i2);

    /* renamed from: a */
    public abstract boolean mo3487a(int i);

    /* renamed from: b */
    private void m3186b() {
        if (this.f3456c) {
            this.f3458e = false;
        } else {
            this.f3454a.mo3490a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo3486a() {
        C1093a aVar = this.f3454a;
        int c = aVar.mo3492c();
        int b = aVar.mo3491b();
        if (c == 0 || !mo3487a(c)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C1092a mo3484a(boolean z) {
        if (this.f3459f && !z) {
            m3186b();
        }
        this.f3459f = z;
        return this;
    }

    public C1092a(View view) {
        this.f3455b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((displayMetrics.density * 1575.0f) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float f = ((float) i) / 1000.0f;
        this.f3469p[0] = f;
        this.f3469p[1] = f;
        float f2 = ((float) i2) / 1000.0f;
        this.f3468o[0] = f2;
        this.f3468o[1] = f2;
        this.f3465l = 1;
        this.f3464k[0] = Float.MAX_VALUE;
        this.f3464k[1] = Float.MAX_VALUE;
        this.f3463j[0] = 0.2f;
        this.f3463j[1] = 0.2f;
        this.f3467n[0] = 0.001f;
        this.f3467n[1] = 0.001f;
        this.f3466m = f3453r;
        this.f3454a.f3471a = 500;
        this.f3454a.f3472b = 500;
    }

    /* renamed from: a */
    private float m3181a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f3465l) {
            case 0:
            case 1:
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (!this.f3458e || this.f3465l != 1) {
                        return 0.0f;
                    }
                    return 1.0f;
                }
                break;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                break;
        }
        return 0.0f;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f3459f) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f3457d = true;
                this.f3470q = false;
                break;
            case 1:
            case 3:
                m3186b();
                break;
            case 2:
                break;
        }
        float a = m3184a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f3455b.getWidth());
        float a2 = m3184a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f3455b.getHeight());
        C1093a aVar = this.f3454a;
        aVar.f3473c = a;
        aVar.f3474d = a2;
        if (!this.f3458e && mo3486a()) {
            if (this.f3462i == null) {
                this.f3462i = new C1094b();
            }
            this.f3458e = true;
            this.f3456c = true;
            if (this.f3470q || this.f3466m <= 0) {
                this.f3462i.run();
            } else {
                C1056u.m3035a(this.f3455b, this.f3462i, (long) this.f3466m);
            }
            this.f3470q = true;
        }
        if (!this.f3460g || !this.f3458e) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private float m3183a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m3182a(f * f2, 0.0f, f3);
        float a2 = m3181a(f2 - f4, a) - m3181a(f4, a);
        if (a2 < 0.0f) {
            f5 = -this.f3461h.getInterpolation(-a2);
        } else if (a2 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f3461h.getInterpolation(a2);
        }
        return m3182a(f5, -1.0f, 1.0f);
    }

    /* renamed from: a */
    private float m3184a(int i, float f, float f2, float f3) {
        float a = m3183a(this.f3463j[i], f2, this.f3464k[i], f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f3467n[i];
        float f5 = this.f3468o[i];
        float f6 = this.f3469p[i];
        float f7 = f4 * f3;
        if (a > 0.0f) {
            return m3182a(a * f7, f5, f6);
        }
        return -m3182a((-a) * f7, f5, f6);
    }
}
