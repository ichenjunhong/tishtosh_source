package com.airbnb.lottie.p114f;

import android.animation.Animator.AnimatorListener;
import android.os.Build.VERSION;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.C2240a;
import com.airbnb.lottie.C2408e;

/* renamed from: com.airbnb.lottie.f.c */
public final class C2451c extends C2449a implements FrameCallback {

    /* renamed from: b */
    public float f7552b = 1.0f;

    /* renamed from: c */
    public long f7553c;

    /* renamed from: d */
    public float f7554d;

    /* renamed from: e */
    public float f7555e = -2.14748365E9f;

    /* renamed from: f */
    public float f7556f = 2.14748365E9f;

    /* renamed from: g */
    public C2408e f7557g;

    /* renamed from: h */
    protected boolean f7558h;

    /* renamed from: i */
    private boolean f7559i;

    /* renamed from: j */
    private int f7560j;

    /* renamed from: f */
    public final void mo6810f() {
        m7156m();
    }

    public final boolean isRunning() {
        return this.f7558h;
    }

    /* renamed from: j */
    private void m7153j() {
        this.f7552b = -this.f7552b;
    }

    /* renamed from: m */
    private void m7156m() {
        m7152b(true);
    }

    /* renamed from: k */
    private boolean m7154k() {
        if (this.f7552b < 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo6804c() {
        this.f7557g = null;
        this.f7555e = -2.14748365E9f;
        this.f7556f = 2.14748365E9f;
    }

    /* renamed from: e */
    public final void mo6809e() {
        m7156m();
        mo6789a(m7154k());
    }

    public final Object getAnimatedValue() {
        return Float.valueOf(mo6802b());
    }

    public final long getDuration() {
        if (this.f7557g == null) {
            return 0;
        }
        return (long) this.f7557g.mo6777a();
    }

    /* renamed from: l */
    private void m7155l() {
        if (isRunning()) {
            m7152b(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: b */
    public final float mo6802b() {
        if (this.f7557g == null) {
            return 0.0f;
        }
        return (this.f7554d - this.f7557g.f7523i) / (this.f7557g.f7524j - this.f7557g.f7523i);
    }

    public final void cancel() {
        for (AnimatorListener onAnimationCancel : this.f7550a) {
            onAnimationCancel.onAnimationCancel(this);
        }
        m7156m();
    }

    /* renamed from: h */
    public final float mo6815h() {
        if (this.f7557g == null) {
            return 0.0f;
        }
        if (this.f7555e == -2.14748365E9f) {
            return this.f7557g.f7523i;
        }
        return this.f7555e;
    }

    /* renamed from: i */
    public final float mo6816i() {
        if (this.f7557g == null) {
            return 0.0f;
        }
        if (this.f7556f == 2.14748365E9f) {
            return this.f7557g.f7524j;
        }
        return this.f7556f;
    }

    /* renamed from: g */
    public final void mo6811g() {
        this.f7558h = true;
        m7155l();
        this.f7553c = System.nanoTime();
        if (!m7154k() || this.f7554d != mo6815h()) {
            if (!m7154k() && this.f7554d == mo6816i()) {
                this.f7554d = mo6815h();
            }
            return;
        }
        this.f7554d = mo6816i();
    }

    public final float getAnimatedFraction() {
        if (this.f7557g == null) {
            return 0.0f;
        }
        if (m7154k()) {
            return (mo6816i() - this.f7554d) / (mo6816i() - mo6815h());
        }
        return (this.f7554d - mo6815h()) / (mo6816i() - mo6815h());
    }

    /* renamed from: d */
    public final void mo6807d() {
        float f;
        this.f7558h = true;
        boolean k = m7154k();
        for (AnimatorListener animatorListener : this.f7550a) {
            if (VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, k);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
        if (m7154k()) {
            f = mo6816i();
        } else {
            f = mo6815h();
        }
        mo6800a((int) f);
        this.f7553c = System.nanoTime();
        this.f7560j = 0;
        m7155l();
    }

    /* renamed from: b */
    public final void mo6803b(int i) {
        mo6801a(i, (int) this.f7556f);
    }

    /* renamed from: c */
    public final void mo6805c(int i) {
        mo6801a((int) this.f7555e, i);
    }

    /* renamed from: b */
    private void m7152b(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f7558h = false;
        }
    }

    /* renamed from: a */
    public final void mo6800a(int i) {
        float f = (float) i;
        if (this.f7554d != f) {
            this.f7554d = C2453e.m7175b(f, mo6815h(), mo6816i());
            this.f7553c = System.nanoTime();
            mo6788a();
        }
    }

    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f7559i) {
            this.f7559i = false;
            m7153j();
        }
    }

    public final void doFrame(long j) {
        float f;
        boolean z;
        float f2;
        m7155l();
        if (this.f7557g != null && isRunning()) {
            long nanoTime = System.nanoTime();
            long j2 = nanoTime - this.f7553c;
            if (this.f7557g == null) {
                f = Float.MAX_VALUE;
            } else {
                f = (1.0E9f / this.f7557g.f7525k) / Math.abs(this.f7552b);
            }
            float f3 = ((float) j2) / f;
            float f4 = this.f7554d;
            if (m7154k()) {
                f3 = -f3;
            }
            this.f7554d = f4 + f3;
            float f5 = this.f7554d;
            float h = mo6815h();
            float i = mo6816i();
            if (f5 < h || f5 > i) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = !z;
            this.f7554d = C2453e.m7175b(this.f7554d, mo6815h(), mo6816i());
            this.f7553c = nanoTime;
            mo6788a();
            if (z2) {
                if (getRepeatCount() == -1 || this.f7560j < getRepeatCount()) {
                    for (AnimatorListener onAnimationRepeat : this.f7550a) {
                        onAnimationRepeat.onAnimationRepeat(this);
                    }
                    this.f7560j++;
                    if (getRepeatMode() == 2) {
                        this.f7559i = !this.f7559i;
                        m7153j();
                    } else {
                        if (m7154k()) {
                            f2 = mo6816i();
                        } else {
                            f2 = mo6815h();
                        }
                        this.f7554d = f2;
                    }
                    this.f7553c = nanoTime;
                } else {
                    this.f7554d = mo6816i();
                    m7156m();
                    mo6789a(m7154k());
                }
            }
            if (this.f7557g != null && (this.f7554d < this.f7555e || this.f7554d > this.f7556f)) {
                throw new IllegalStateException(C2240a.m6772a("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f7555e), Float.valueOf(this.f7556f), Float.valueOf(this.f7554d)}));
            }
        }
    }

    /* renamed from: a */
    public final void mo6801a(int i, int i2) {
        float f;
        float f2;
        if (this.f7557g == null) {
            f = -3.4028235E38f;
        } else {
            f = this.f7557g.f7523i;
        }
        if (this.f7557g == null) {
            f2 = Float.MAX_VALUE;
        } else {
            f2 = this.f7557g.f7524j;
        }
        float f3 = (float) i;
        this.f7555e = C2453e.m7175b(f3, f, f2);
        float f4 = (float) i2;
        this.f7556f = C2453e.m7175b(f4, f, f2);
        mo6800a((int) C2453e.m7175b(this.f7554d, f3, f4));
    }
}
