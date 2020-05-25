package com.p683ss.android.p1103ad.splash.core.video.p1119a;

import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ad.splash.core.video.a.b */
public final class C18677b extends C18676a {

    /* renamed from: g */
    public final MediaPlayer f51637g;

    /* renamed from: h */
    private final C18678a f51638h;

    /* renamed from: i */
    private MediaDataSource f51639i;

    /* renamed from: j */
    private final Object f51640j = new Object();

    /* renamed from: k */
    private boolean f51641k;

    /* renamed from: com.ss.android.ad.splash.core.video.a.b$a */
    class C18678a implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnSeekCompleteListener, OnVideoSizeChangedListener {

        /* renamed from: a */
        public final WeakReference<C18677b> f51642a;

        public final void onCompletion(MediaPlayer mediaPlayer) {
            if (((C18677b) this.f51642a.get()) != null) {
                C18677b bVar = C18677b.this;
                if (bVar.f51631b != null) {
                    bVar.f51631b.mo38226a(bVar);
                }
            }
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (((C18677b) this.f51642a.get()) != null) {
                C18677b bVar = C18677b.this;
                if (bVar.f51630a != null) {
                    bVar.f51630a.mo38229b(bVar);
                }
            }
        }

        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            if (((C18677b) this.f51642a.get()) != null) {
                C18677b bVar = C18677b.this;
                if (bVar.f51633d != null) {
                    bVar.f51633d.mo38230c(bVar);
                }
            }
        }

        public C18678a(C18677b bVar) {
            this.f51642a = new WeakReference<>(bVar);
        }

        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            if (((C18677b) this.f51642a.get()) != null) {
                C18677b bVar = C18677b.this;
                if (bVar.f51632c != null) {
                    bVar.f51632c.mo38225a(bVar, i);
                }
            }
        }

        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            if (((C18677b) this.f51642a.get()) != null) {
            }
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (((C18677b) this.f51642a.get()) != null) {
                C18677b bVar = C18677b.this;
                if (bVar.f51634e != null) {
                    bVar.f51634e.mo38227a(bVar, i, i2);
                }
            }
            return false;
        }

        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (((C18677b) this.f51642a.get()) != null) {
                C18677b bVar = C18677b.this;
                if (bVar.f51635f != null) {
                    bVar.f51635f.mo38228b(bVar, i, i2);
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public final void mo38210b() throws IllegalStateException {
        this.f51637g.start();
    }

    /* renamed from: c */
    public final void mo38212c() throws IllegalStateException {
        this.f51637g.stop();
    }

    /* renamed from: d */
    public final void mo38213d() throws IllegalStateException {
        this.f51637g.pause();
    }

    /* renamed from: i */
    private void m45466i() {
        if (this.f51639i != null) {
            try {
                this.f51639i.close();
            } catch (IOException unused) {
            }
            this.f51639i = null;
        }
    }

    /* renamed from: e */
    public final long mo38214e() {
        try {
            return (long) this.f51637g.getCurrentPosition();
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    /* renamed from: f */
    public final long mo38215f() {
        try {
            return (long) this.f51637g.getDuration();
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    /* renamed from: h */
    public final void mo38217h() {
        try {
            this.f51637g.reset();
        } catch (IllegalStateException unused) {
        }
        m45466i();
        mo38196a();
        m45467j();
    }

    /* renamed from: g */
    public final void mo38216g() {
        this.f51641k = true;
        this.f51637g.release();
        m45466i();
        mo38196a();
        m45467j();
    }

    public C18677b() {
        synchronized (this.f51640j) {
            this.f51637g = new MediaPlayer();
        }
        this.f51637g.setAudioStreamType(3);
        this.f51638h = new C18678a(this);
        m45467j();
    }

    /* renamed from: j */
    private void m45467j() {
        this.f51637g.setOnPreparedListener(this.f51638h);
        this.f51637g.setOnBufferingUpdateListener(this.f51638h);
        this.f51637g.setOnCompletionListener(this.f51638h);
        this.f51637g.setOnSeekCompleteListener(this.f51638h);
        this.f51637g.setOnVideoSizeChangedListener(this.f51638h);
        this.f51637g.setOnErrorListener(this.f51638h);
        this.f51637g.setOnInfoListener(this.f51638h);
    }

    /* renamed from: a */
    public final void mo38204a(long j) throws IllegalStateException {
        this.f51637g.seekTo((int) j);
    }

    /* renamed from: b */
    public final void mo38211b(boolean z) {
        this.f51637g.setLooping(z);
    }

    /* renamed from: a */
    public final void mo38206a(Surface surface) {
        this.f51637g.setSurface(surface);
    }

    /* renamed from: a */
    public final void mo38207a(SurfaceHolder surfaceHolder) {
        synchronized (this.f51640j) {
            if (!this.f51641k) {
                this.f51637g.setDisplay(surfaceHolder);
            }
        }
    }

    /* renamed from: a */
    public final void mo38208a(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equalsIgnoreCase("file")) {
            this.f51637g.setDataSource(str);
        } else {
            this.f51637g.setDataSource(parse.getPath());
        }
    }

    /* renamed from: a */
    public final void mo38209a(boolean z) {
        this.f51637g.setScreenOnWhilePlaying(true);
    }

    /* renamed from: a */
    public final void mo38205a(Context context, int i) {
        this.f51637g.setWakeMode(context, 10);
    }

    /* renamed from: a */
    public final void mo38203a(float f, float f2) {
        if (this.f51637g != null && !this.f51641k && this.f51637g.isPlaying()) {
            this.f51637g.setVolume(f, f2);
        }
    }
}
