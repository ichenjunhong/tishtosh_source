package com.facebook.p982j;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.j.d */
public abstract class C14450d {

    /* renamed from: a */
    boolean f37534a;

    /* renamed from: b */
    long f37535b;

    /* renamed from: c */
    private final WeakReference<C14453b> f37536c;

    /* renamed from: d */
    private final int f37537d;

    /* renamed from: e */
    private final int f37538e;

    /* renamed from: f */
    private long f37539f;

    /* renamed from: g */
    private int f37540g;

    /* renamed from: h */
    private long f37541h;

    /* renamed from: com.facebook.j.d$a */
    static class C14452a extends C14450d implements FrameCallback {

        /* renamed from: c */
        private final Choreographer f37542c;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26611a() {
            this.f37542c.postFrameCallback(this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo26613b() {
            this.f37542c.removeFrameCallback(this);
        }

        public final void doFrame(long j) {
            mo26612a(j / 1000000);
        }

        private C14452a(C14453b bVar, int i, int i2) {
            super(bVar, i, i2);
            this.f37542c = Choreographer.getInstance();
        }
    }

    /* renamed from: com.facebook.j.d$b */
    public interface C14453b {
        /* renamed from: a */
        void mo26592a(float f);

        /* renamed from: c */
        void mo26595c();
    }

    /* renamed from: com.facebook.j.d$c */
    static class C14454c extends C14450d implements Runnable {

        /* renamed from: c */
        private final Handler f37543c;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26611a() {
            this.f37543c.postDelayed(this, 25);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo26613b() {
            this.f37543c.removeCallbacks(this);
        }

        public final void run() {
            mo26612a(SystemClock.uptimeMillis());
        }

        private C14454c(C14453b bVar, int i, int i2) {
            super(bVar, i, i2);
            this.f37543c = new Handler(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26611a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo26613b();

    /* renamed from: c */
    public final void mo26614c() {
        this.f37534a = false;
        mo26613b();
        mo26611a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26612a(long j) {
        boolean z;
        if (this.f37536c.get() == null) {
            mo26613b();
            this.f37539f = 0;
            this.f37541h = 0;
            this.f37540g = -1;
            return;
        }
        if (this.f37539f == 0) {
            this.f37539f = j;
        }
        boolean z2 = false;
        if (((int) (j - this.f37539f)) / this.f37538e > this.f37540g) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f37534a || !z) {
            long j2 = (j - this.f37539f) % ((long) this.f37538e);
            if (j - this.f37541h >= this.f37535b) {
                this.f37541h = j;
                z2 = true;
            }
            if (z2) {
                ((C14453b) this.f37536c.get()).mo26592a((((float) j2) / ((float) this.f37538e)) * ((float) this.f37537d));
            }
            this.f37540g = ((int) (j - this.f37539f)) / this.f37538e;
            mo26611a();
            return;
        }
        ((C14453b) this.f37536c.get()).mo26592a((float) this.f37537d);
        mo26613b();
        this.f37539f = 0;
        this.f37540g = -1;
        ((C14453b) this.f37536c.get()).mo26595c();
    }

    private C14450d(C14453b bVar, int i, int i2) {
        this.f37535b = -1;
        this.f37536c = new WeakReference<>(bVar);
        this.f37537d = i2;
        this.f37538e = Math.round((((float) i2) / ((float) i)) * 1000.0f);
    }
}
