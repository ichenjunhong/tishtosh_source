package com.p683ss.android.ugc.aweme.shortvideo.countdown;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.e */
public final class C42509e {

    /* renamed from: a */
    public MediaPlayer f107511a;

    /* renamed from: b */
    public Handler f107512b = new Handler();

    /* renamed from: c */
    public C42511a f107513c;

    /* renamed from: d */
    public boolean f107514d;

    /* renamed from: e */
    private final Context f107515e;

    /* renamed from: f */
    private final Uri f107516f;

    /* renamed from: g */
    private Runnable f107517g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.e$a */
    public interface C42511a {
        /* renamed from: a */
        void mo86732a(int i);
    }

    /* renamed from: a */
    public final void mo86727a() {
        if (this.f107511a != null) {
            try {
                this.f107511a.pause();
                if (this.f107517g != null) {
                    this.f107512b.removeCallbacks(this.f107517g);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo86729b() {
        if (this.f107511a != null) {
            try {
                this.f107511a.start();
                if (this.f107517g != null) {
                    this.f107512b.post(this.f107517g);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public final void mo86730c() {
        if (!this.f107514d) {
            this.f107514d = true;
            if (this.f107511a != null) {
                this.f107511a.release();
                if (this.f107517g != null) {
                    this.f107512b.removeCallbacks(this.f107517g);
                }
            }
        }
    }

    public C42509e(Context context, Uri uri) {
        this.f107515e = context;
        this.f107516f = uri;
        this.f107511a = MediaPlayer.create(context, uri);
    }

    /* renamed from: a */
    public final void mo86728a(int i, final int i2) {
        if (this.f107511a != null) {
            this.f107511a.seekTo(i);
            this.f107511a.start();
            this.f107517g = new Runnable() {
                public final void run() {
                    if (!C42509e.this.f107514d && C42509e.this.f107511a.isPlaying()) {
                        int currentPosition = C42509e.this.f107511a.getCurrentPosition();
                        if (currentPosition < i2) {
                            C42509e eVar = C42509e.this;
                            if (eVar.f107513c != null) {
                                eVar.f107513c.mo86732a(currentPosition);
                            }
                            C42509e.this.f107512b.post(this);
                            return;
                        }
                        C42509e.this.f107511a.stop();
                        C42509e.this.mo86730c();
                    }
                }
            };
            this.f107512b.post(this.f107517g);
        }
    }
}
