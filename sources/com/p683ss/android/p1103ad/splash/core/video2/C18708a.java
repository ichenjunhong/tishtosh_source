package com.p683ss.android.p1103ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.p683ss.android.p1103ad.splash.p1123g.C18754r;
import com.p683ss.android.p1103ad.splash.p1123g.C18754r.C18755a;
import com.p683ss.ttvideoengine.TTVideoEngine;
import com.p683ss.ttvideoengine.VideoEngineListener;
import com.p683ss.ttvideoengine.VideoInfoListener;
import com.p683ss.ttvideoengine.model.VideoModel;
import com.p683ss.ttvideoengine.utils.Error;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ad.splash.core.video2.a */
public final class C18708a implements C18715e, C18717g, C18755a, VideoEngineListener, VideoInfoListener {

    /* renamed from: a */
    protected Context f51761a;

    /* renamed from: b */
    protected C18716f f51762b;

    /* renamed from: c */
    protected TTVideoEngine f51763c;

    /* renamed from: d */
    protected C18754r f51764d = new C18754r(this);

    /* renamed from: e */
    private C18710b f51765e;

    /* renamed from: f */
    private boolean f51766f;

    /* renamed from: g */
    private ArrayList<Runnable> f51767g = new ArrayList<>();

    /* renamed from: h */
    private boolean f51768h;

    /* renamed from: i */
    private boolean f51769i = false;

    /* renamed from: j */
    private long f51770j;

    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    public final boolean onFetchedVideoInfo(VideoModel videoModel) {
        return false;
    }

    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    public final void onPrepare(TTVideoEngine tTVideoEngine) {
    }

    public final void onPrepared(TTVideoEngine tTVideoEngine) {
    }

    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
    }

    public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
    }

    /* renamed from: a */
    public final float mo38296a() {
        if (this.f51763c == null) {
            return 0.0f;
        }
        return this.f51763c.getVolume();
    }

    /* renamed from: b */
    public final float mo38302b() {
        if (this.f51763c == null) {
            return 0.0f;
        }
        return this.f51763c.getMaxVolume();
    }

    /* renamed from: e */
    public final int mo38305e() {
        if (this.f51763c != null) {
            return this.f51763c.getCurrentPlaybackTime();
        }
        return 0;
    }

    /* renamed from: f */
    public final int mo38306f() {
        if (this.f51763c != null) {
            return this.f51763c.getDuration();
        }
        return 0;
    }

    /* renamed from: h */
    public final void mo38308h() {
        try {
            this.f51763c.setLooping(false);
            this.f51763c.play();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final void mo38303c() {
        if (this.f51763c != null && !this.f51769i) {
            this.f51763c.stop();
            this.f51769i = true;
            this.f51765e.mo37923a(mo38305e(), mo38306f());
        }
    }

    /* renamed from: d */
    public final boolean mo38304d() {
        if (this.f51763c == null || this.f51763c.getPlaybackState() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void mo38307g() {
        if (this.f51762b != null) {
            this.f51762b.mo38285a(false);
        }
        if (this.f51763c != null) {
            this.f51763c.release();
            this.f51763c = null;
        }
        this.f51765e = null;
    }

    /* renamed from: i */
    private void m45573i() {
        if (!this.f51768h && !this.f51767g.isEmpty()) {
            this.f51768h = true;
            Iterator it = new ArrayList(this.f51767g).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f51767g.clear();
            this.f51768h = false;
        }
    }

    /* renamed from: a */
    public final void mo38299a(C18710b bVar) {
        this.f51765e = bVar;
    }

    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        if (this.f51765e != null) {
            this.f51765e.mo37922a(mo38306f());
        }
    }

    public final void onError(Error error) {
        if (this.f51765e != null) {
            this.f51765e.mo37924b();
        }
    }

    public final void onVideoStatusException(int i) {
        if (this.f51765e != null) {
            this.f51765e.mo37924b();
        }
    }

    public C18708a(C18716f fVar) {
        if (fVar != null) {
            TTVideoEngineLog.turnOn(1, 1);
            this.f51762b = fVar;
            this.f51762b.setVideoViewCallback(this);
            this.f51761a = this.f51762b.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("IBDASplashVideoView can not be null");
    }

    /* renamed from: a */
    public final void mo37892a(Message message) {
        if (message.what == 1000 && this.f51763c != null) {
            if (mo38304d()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = uptimeMillis - this.f51770j;
                long j2 = 100;
                if (this.f51770j != 0 && j > 100) {
                    j2 = 100 - (j % 100);
                }
                this.f51764d.sendMessageDelayed(this.f51764d.obtainMessage(1000), j2);
                this.f51770j = uptimeMillis;
            } else {
                this.f51770j = 0;
            }
            int duration = this.f51763c.getDuration();
            if (duration > 0 && this.f51765e != null) {
                this.f51765e.mo38322e(this.f51763c.getCurrentPlaybackTime(), duration);
            }
        }
    }

    /* renamed from: a */
    public final void mo38300a(boolean z) {
        if (this.f51763c != null) {
            this.f51763c.setIsMute(z);
        }
    }

    /* renamed from: a */
    public final boolean mo38301a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f51763c != null) {
            this.f51763c.release();
        }
        this.f51763c = new TTVideoEngine(this.f51761a, 0);
        this.f51763c.setIsMute(true);
        this.f51763c.setListener(this);
        this.f51763c.setVideoInfoListener(this);
        this.f51763c.setIntOption(4, 2);
        this.f51763c.setLocalURL(str);
        this.f51763c.setStartTime(0);
        Surface surface = this.f51762b.getSurface();
        if (surface == null || !surface.isValid()) {
            this.f51762b.setSurfaceViewVisibility(0);
            C187091 r6 = new Runnable() {
                public final void run() {
                    C18708a.this.mo38308h();
                }
            };
            if (this.f51766f) {
                r6.run();
            } else {
                this.f51767g.add(r6);
            }
        } else {
            this.f51763c.setSurface(surface);
            mo38308h();
        }
        this.f51769i = false;
        return true;
    }

    /* renamed from: a */
    public final void mo38297a(float f, float f2) {
        if (this.f51763c != null) {
            this.f51763c.setVolume(f, f2);
        }
    }

    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        if (i == 1) {
            if (this.f51765e != null) {
                this.f51765e.mo37921a();
            }
            this.f51764d.removeMessages(1000);
            this.f51764d.sendEmptyMessage(1000);
        }
    }

    /* renamed from: a */
    public final void mo38298a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f51766f = true;
        Surface surface = this.f51762b.getSurface();
        if (surface == null) {
            surface = new Surface(surfaceTexture);
        }
        if (this.f51763c != null) {
            this.f51763c.setSurface(surface);
            m45573i();
        }
    }
}
