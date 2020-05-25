package com.p683ss.android.ugc.aweme.festival.p1739a;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.ugc.aweme.festival.a.f */
public final class C31353f extends AnimationDrawable {

    /* renamed from: a */
    public C31354a f82118a;

    /* renamed from: b */
    private Handler f82119b = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.festival.a.f$a */
    public interface C31354a {
        /* renamed from: a */
        void mo64231a();

        /* renamed from: b */
        void mo64232b();
    }

    public C31353f() {
        setOneShot(false);
    }

    public final void stop() {
        super.stop();
        if (this.f82118a != null) {
            this.f82118a.mo64232b();
        }
        if (this.f82119b != null) {
            this.f82119b.removeCallbacksAndMessages(null);
        }
        if (this.f82118a != null) {
            this.f82118a = null;
        }
    }

    public final void start() {
        super.start();
        if (this.f82118a != null) {
            this.f82118a.mo64231a();
        }
        if (getNumberOfFrames() > 0 && getDuration(0) > 0 && this.f82119b != null) {
            this.f82119b.postDelayed(new C31355g(this), (long) (getNumberOfFrames() * getDuration(0) * 4));
        }
    }
}
