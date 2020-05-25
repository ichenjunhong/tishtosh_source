package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;
import android.os.CountDownTimer;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.g */
public final class C33504g implements OnErrorListener {

    /* renamed from: a */
    public MediaRecorder f86817a;

    /* renamed from: b */
    public CountDownTimer f86818b;

    /* renamed from: c */
    public int f86819c = 1000;

    /* renamed from: d */
    public volatile boolean f86820d;

    /* renamed from: e */
    public C33510k f86821e;

    /* renamed from: f */
    ExecutorService f86822f;

    /* renamed from: g */
    public long f86823g;

    /* renamed from: h */
    public File f86824h;

    /* renamed from: i */
    public long f86825i;

    public C33504g() {
        try {
            this.f86822f = C33507h.m76781a();
            this.f86817a = new MediaRecorder();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo70943b(boolean z) {
        try {
            if (this.f86817a != null) {
                this.f86817a.reset();
                this.f86817a.release();
                this.f86817a = null;
            }
        } catch (Exception unused) {
        }
        if (this.f86822f != null && z) {
            this.f86822f.shutdown();
            this.f86822f = null;
        }
    }

    /* renamed from: a */
    public final int mo70941a(int i) {
        int i2;
        int i3 = 0;
        if (this.f86817a == null) {
            i2 = 0;
        } else {
            i2 = this.f86817a.getMaxAmplitude() / 600;
        }
        if (i2 > 1) {
            i3 = (int) (Math.log10((double) i2) * 20.0d);
        }
        if (i3 == 0) {
            return 1;
        }
        return i3 / 5;
    }

    /* renamed from: a */
    public final void mo70942a(final boolean z) {
        if (this.f86820d) {
            if (this.f86822f == null || this.f86822f.isShutdown() || this.f86822f.isTerminated()) {
                this.f86822f = C33507h.m76781a();
            }
            this.f86822f.submit(new Runnable() {
                public final void run() {
                    C33504g.this.f86818b.cancel();
                    try {
                        C33504g.this.f86817a.stop();
                        C33504g.this.f86817a.reset();
                    } catch (Exception unused) {
                    }
                    C33504g.this.f86825i = SystemClock.uptimeMillis() - C33504g.this.f86823g;
                    C33504g.this.f86820d = false;
                    if (C33504g.this.f86825i < ((long) C33504g.this.f86819c)) {
                        if (C33504g.this.f86824h != null) {
                            C33504g.this.f86824h.delete();
                        }
                        if (C33504g.this.f86821e != null) {
                            C33504g.this.f86821e.mo70913a(-1);
                        }
                    } else if (z) {
                        if (C33504g.this.f86824h != null) {
                            C33504g.this.f86824h.delete();
                        }
                        if (C33504g.this.f86821e != null) {
                            C33504g.this.f86821e.mo70915c();
                        }
                    } else if (C33504g.this.f86821e != null) {
                        C33504g.this.f86821e.mo70914b();
                    }
                }
            });
        }
    }

    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        if (this.f86817a != null) {
            try {
                this.f86817a.reset();
            } catch (Exception unused) {
            }
        }
        if (this.f86824h != null) {
            this.f86824h.delete();
        }
        this.f86820d = false;
        if (this.f86821e != null) {
            this.f86821e.mo70913a(i);
        }
    }
}
