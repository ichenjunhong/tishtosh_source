package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.p683ss.android.medialib.camera.ImageFrame;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.e */
public final class C33498e implements SensorEventListener, OnCompletionListener, OnErrorListener {

    /* renamed from: a */
    Context f86796a;

    /* renamed from: b */
    public MediaPlayer f86797b;

    /* renamed from: c */
    public C33510k f86798c;

    /* renamed from: d */
    public C33512m f86799d;

    /* renamed from: e */
    public ExecutorService f86800e;

    /* renamed from: f */
    File f86801f;

    /* renamed from: g */
    volatile boolean f86802g = true;

    /* renamed from: h */
    AudioManager f86803h;

    /* renamed from: i */
    public SensorManager f86804i;

    /* renamed from: j */
    Sensor f86805j;

    /* renamed from: k */
    PowerManager f86806k;

    /* renamed from: l */
    public WakeLock f86807l;

    /* renamed from: m */
    public boolean f86808m;

    /* renamed from: n */
    public OnAudioFocusChangeListener f86809n;

    /* renamed from: o */
    private long f86810o = 60000;

    /* renamed from: p */
    private int f86811p;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* renamed from: a */
    public final void mo70926a() {
        mo70928a(false);
    }

    /* renamed from: e */
    private boolean m76769e() {
        boolean z = false;
        try {
            if (this.f86797b != null && this.f86797b.isPlaying()) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo70929b() {
        if (!this.f86802g) {
            this.f86802g = true;
            if (this.f86807l != null) {
                this.f86807l.setReferenceCounted(false);
                this.f86807l.release();
            }
        }
        mo70932d();
    }

    /* renamed from: d */
    public final void mo70932d() {
        if (this.f86808m && this.f86803h != null) {
            this.f86803h.abandonAudioFocus(this.f86809n);
            this.f86808m = false;
        }
    }

    /* renamed from: c */
    public final void mo70931c() {
        if (this.f86803h == null) {
            this.f86803h = (AudioManager) this.f86796a.getSystemService("audio");
        }
        if (!this.f86808m && this.f86803h != null && this.f86803h.requestAudioFocus(this.f86809n, 3, 2) == 1) {
            this.f86808m = true;
        }
    }

    /* renamed from: c */
    private void m76768c(boolean z) {
        if (z != this.f86802g) {
            this.f86802g = z;
            this.f86811p = 0;
            m76767a(this.f86801f, true);
        }
    }

    /* renamed from: a */
    public final void mo70927a(File file) {
        this.f86811p = 0;
        m76767a(file, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo70930b(final boolean z) {
        this.f86800e.submit(new Runnable() {
            public final void run() {
                try {
                    if (C33498e.this.f86797b != null) {
                        C33498e.this.f86797b.reset();
                        C33498e.this.f86797b.release();
                        C33498e.this.f86797b = null;
                        C33498e.this.f86809n = null;
                    }
                } catch (Exception unused) {
                }
                if (z) {
                    if (C33498e.this.f86804i != null) {
                        C33498e.this.f86804i.unregisterListener(C33498e.this);
                    }
                    if (C33498e.this.f86807l != null && C33498e.this.f86807l.isHeld()) {
                        C33498e.this.f86807l.release();
                        C33498e.this.f86807l = null;
                    }
                    if (C33498e.this.f86800e != null) {
                        C33498e.this.f86800e.shutdown();
                        C33498e.this.f86800e = null;
                    }
                }
            }
        });
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f86799d != null) {
            this.f86799d.mo70921a();
        }
    }

    public C33498e(Context context) {
        this.f86796a = context;
        this.f86800e = C33503f.m76777a();
        this.f86809n = new OnAudioFocusChangeListener() {
            public final void onAudioFocusChange(int i) {
                switch (i) {
                    case ImageFrame.NV21 /*-3*/:
                        C33498e.this.f86808m = false;
                        C33498e.this.mo70926a();
                        break;
                    case -2:
                        C33498e.this.f86808m = false;
                        C33498e.this.mo70926a();
                        return;
                    case -1:
                        C33498e.this.f86808m = false;
                        C33498e.this.mo70926a();
                        return;
                    case 1:
                        C33498e.this.f86808m = true;
                        return;
                    case 2:
                        C33498e.this.f86808m = true;
                        return;
                    case 3:
                        C33498e.this.f86808m = true;
                        return;
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo70928a(boolean z) {
        if (!z || this.f86802g) {
            if (this.f86804i != null) {
                this.f86804i.unregisterListener(this);
            }
            if (!m76769e()) {
                mo70929b();
                return;
            }
            if (this.f86800e == null || this.f86800e.isShutdown() || this.f86800e.isTerminated()) {
                this.f86800e = C33503f.m76777a();
            }
            this.f86800e.submit(new Runnable() {
                public final void run() {
                    try {
                        C33498e.this.f86797b.stop();
                        C33498e.this.f86799d.mo70925b();
                        C33498e.this.mo70929b();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (m76769e()) {
            if (0.0f != sensorEvent.values[0]) {
                m76768c(true);
                if (this.f86807l != null) {
                    this.f86807l.setReferenceCounted(false);
                    this.f86807l.release();
                }
            } else if (this.f86803h == null || !this.f86803h.isWiredHeadsetOn()) {
                m76768c(false);
                if (this.f86807l != null && !this.f86807l.isHeld()) {
                    this.f86807l.acquire(this.f86810o);
                }
            }
        }
    }

    /* renamed from: a */
    private void m76767a(File file, boolean z) {
        m76769e();
        if (file == null || !file.exists() || !file.isFile()) {
            if (this.f86798c != null) {
                this.f86798c.mo70913a(-1);
            }
            return;
        }
        if (!file.equals(this.f86801f)) {
            this.f86811p = 0;
        }
        this.f86801f = file;
        if (this.f86798c != null) {
            this.f86798c.mo70912a();
        }
        if (this.f86800e == null || this.f86800e.isShutdown() || this.f86800e.isTerminated()) {
            this.f86800e = C33503f.m76777a();
        }
        this.f86800e.submit(new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
                r0.mo70930b(false);
             */
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d5 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r5 = this;
                    com.ss.android.ugc.aweme.im.sdk.chat.input.audio.e r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.C33498e.this     // Catch:{ Exception -> 0x00e5 }
                    android.media.AudioManager r1 = r0.f86803h     // Catch:{ Exception -> 0x00e5 }
                    if (r1 != 0) goto L_0x0012
                    android.content.Context r1 = r0.f86796a     // Catch:{ Exception -> 0x00e5 }
                    java.lang.String r2 = "audio"
                    java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Exception -> 0x00e5 }
                    android.media.AudioManager r1 = (android.media.AudioManager) r1     // Catch:{ Exception -> 0x00e5 }
                    r0.f86803h = r1     // Catch:{ Exception -> 0x00e5 }
                L_0x0012:
                    android.hardware.SensorManager r1 = r0.f86804i     // Catch:{ Exception -> 0x00e5 }
                    if (r1 != 0) goto L_0x0022
                    android.content.Context r1 = r0.f86796a     // Catch:{ Exception -> 0x00e5 }
                    java.lang.String r2 = "sensor"
                    java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Exception -> 0x00e5 }
                    android.hardware.SensorManager r1 = (android.hardware.SensorManager) r1     // Catch:{ Exception -> 0x00e5 }
                    r0.f86804i = r1     // Catch:{ Exception -> 0x00e5 }
                L_0x0022:
                    android.hardware.SensorManager r1 = r0.f86804i     // Catch:{ Exception -> 0x00e5 }
                    if (r1 == 0) goto L_0x0034
                    android.hardware.Sensor r1 = r0.f86805j     // Catch:{ Exception -> 0x00e5 }
                    if (r1 != 0) goto L_0x0034
                    android.hardware.SensorManager r1 = r0.f86804i     // Catch:{ Exception -> 0x00e5 }
                    r2 = 8
                    android.hardware.Sensor r1 = r1.getDefaultSensor(r2)     // Catch:{ Exception -> 0x00e5 }
                    r0.f86805j = r1     // Catch:{ Exception -> 0x00e5 }
                L_0x0034:
                    android.os.PowerManager r1 = r0.f86806k     // Catch:{ Exception -> 0x00e5 }
                    if (r1 != 0) goto L_0x0044
                    android.content.Context r1 = r0.f86796a     // Catch:{ Exception -> 0x00e5 }
                    java.lang.String r2 = "power"
                    java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Exception -> 0x00e5 }
                    android.os.PowerManager r1 = (android.os.PowerManager) r1     // Catch:{ Exception -> 0x00e5 }
                    r0.f86806k = r1     // Catch:{ Exception -> 0x00e5 }
                L_0x0044:
                    android.os.PowerManager r1 = r0.f86806k     // Catch:{ Exception -> 0x00e5 }
                    if (r1 == 0) goto L_0x005e
                    android.os.PowerManager$WakeLock r1 = r0.f86807l     // Catch:{ Exception -> 0x00e5 }
                    if (r1 != 0) goto L_0x005e
                    int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00e5 }
                    r2 = 21
                    if (r1 < r2) goto L_0x005e
                    android.os.PowerManager r1 = r0.f86806k     // Catch:{ Exception -> 0x00e5 }
                    r2 = 32
                    java.lang.String r3 = "Aweme-IM:audio_player_lock"
                    android.os.PowerManager$WakeLock r1 = r1.newWakeLock(r2, r3)     // Catch:{ Exception -> 0x00e5 }
                    r0.f86807l = r1     // Catch:{ Exception -> 0x00e5 }
                L_0x005e:
                    android.hardware.SensorManager r1 = r0.f86804i     // Catch:{ Exception -> 0x00e5 }
                    r2 = 3
                    if (r1 == 0) goto L_0x006e
                    android.hardware.Sensor r1 = r0.f86805j     // Catch:{ Exception -> 0x00e5 }
                    if (r1 == 0) goto L_0x006e
                    android.hardware.SensorManager r1 = r0.f86804i     // Catch:{ Exception -> 0x00e5 }
                    android.hardware.Sensor r3 = r0.f86805j     // Catch:{ Exception -> 0x00e5 }
                    r1.registerListener(r0, r3, r2)     // Catch:{ Exception -> 0x00e5 }
                L_0x006e:
                    android.media.AudioManager r1 = r0.f86803h     // Catch:{ Exception -> 0x00e5 }
                    r3 = 0
                    if (r1 == 0) goto L_0x008e
                    boolean r1 = r0.f86802g     // Catch:{ Exception -> 0x00e5 }
                    if (r1 == 0) goto L_0x0083
                    android.media.AudioManager r1 = r0.f86803h     // Catch:{ Exception -> 0x00e5 }
                    r4 = 1
                    r1.setSpeakerphoneOn(r4)     // Catch:{ Exception -> 0x00e5 }
                    android.media.AudioManager r1 = r0.f86803h     // Catch:{ Exception -> 0x00e5 }
                    r1.setMode(r3)     // Catch:{ Exception -> 0x00e5 }
                    goto L_0x008e
                L_0x0083:
                    android.media.AudioManager r1 = r0.f86803h     // Catch:{ Exception -> 0x00e5 }
                    r1.setSpeakerphoneOn(r3)     // Catch:{ Exception -> 0x00e5 }
                    android.media.AudioManager r1 = r0.f86803h     // Catch:{ Exception -> 0x00e5 }
                    r4 = 2
                    r1.setMode(r4)     // Catch:{ Exception -> 0x00e5 }
                L_0x008e:
                    android.media.MediaPlayer r1 = r0.f86797b     // Catch:{ Exception -> 0x00e5 }
                    if (r1 != 0) goto L_0x00b0
                    android.media.MediaPlayer r1 = new android.media.MediaPlayer     // Catch:{ Exception -> 0x00e5 }
                    r1.<init>()     // Catch:{ Exception -> 0x00e5 }
                    r0.f86797b = r1     // Catch:{ Exception -> 0x00e5 }
                    android.media.MediaPlayer r1 = r0.f86797b     // Catch:{ Exception -> 0x00e5 }
                    r4 = 1065353216(0x3f800000, float:1.0)
                    r1.setVolume(r4, r4)     // Catch:{ Exception -> 0x00e5 }
                    android.media.MediaPlayer r1 = r0.f86797b     // Catch:{ Exception -> 0x00e5 }
                    r1.setLooping(r3)     // Catch:{ Exception -> 0x00e5 }
                    android.media.MediaPlayer r1 = r0.f86797b     // Catch:{ Exception -> 0x00e5 }
                    r1.setOnErrorListener(r0)     // Catch:{ Exception -> 0x00e5 }
                    android.media.MediaPlayer r1 = r0.f86797b     // Catch:{ Exception -> 0x00e5 }
                    r1.setOnCompletionListener(r0)     // Catch:{ Exception -> 0x00e5 }
                    goto L_0x00b5
                L_0x00b0:
                    android.media.MediaPlayer r1 = r0.f86797b     // Catch:{ Exception -> 0x00e5 }
                    r1.reset()     // Catch:{ Exception -> 0x00e5 }
                L_0x00b5:
                    android.media.MediaPlayer r1 = r0.f86797b     // Catch:{ Exception -> 0x00d5 }
                    java.io.File r4 = r0.f86801f     // Catch:{ Exception -> 0x00d5 }
                    java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x00d5 }
                    r1.setDataSource(r4)     // Catch:{ Exception -> 0x00d5 }
                    boolean r1 = r0.f86802g     // Catch:{ Exception -> 0x00d5 }
                    if (r1 == 0) goto L_0x00ca
                    android.media.MediaPlayer r1 = r0.f86797b     // Catch:{ Exception -> 0x00d5 }
                    r1.setAudioStreamType(r2)     // Catch:{ Exception -> 0x00d5 }
                    goto L_0x00cf
                L_0x00ca:
                    android.media.MediaPlayer r1 = r0.f86797b     // Catch:{ Exception -> 0x00d5 }
                    r1.setAudioStreamType(r3)     // Catch:{ Exception -> 0x00d5 }
                L_0x00cf:
                    android.media.MediaPlayer r1 = r0.f86797b     // Catch:{ Exception -> 0x00d5 }
                    r1.prepare()     // Catch:{ Exception -> 0x00d5 }
                    goto L_0x00d8
                L_0x00d5:
                    r0.mo70930b(r3)     // Catch:{ Exception -> 0x00e5 }
                L_0x00d8:
                    com.ss.android.ugc.aweme.im.sdk.chat.input.audio.e r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.C33498e.this     // Catch:{ Exception -> 0x00e5 }
                    r0.mo70931c()     // Catch:{ Exception -> 0x00e5 }
                    com.ss.android.ugc.aweme.im.sdk.chat.input.audio.e r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.C33498e.this     // Catch:{ Exception -> 0x00e5 }
                    android.media.MediaPlayer r0 = r0.f86797b     // Catch:{ Exception -> 0x00e5 }
                    r0.start()     // Catch:{ Exception -> 0x00e5 }
                    return
                L_0x00e5:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.C33498e.C335002.run():void");
            }
        });
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.f86811p++;
        if (this.f86811p > 5) {
            onCompletion(mediaPlayer);
        } else {
            mediaPlayer.release();
            this.f86797b = null;
            m76767a(this.f86801f, true);
        }
        return true;
    }
}
