package com.p683ss.android.ugc.aweme.player.sdk.impl;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.player.sdk.C38854a;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38856b;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38857c;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38860a;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38861b;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38862c;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38863d;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38865f;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38866g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38868g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38870i;
import com.p683ss.android.ugc.aweme.player.sdk.p2055b.C38872a;
import com.p683ss.android.ugc.playerkit.p2492a.C50101a;
import com.p683ss.android.ugc.playerkit.p2494c.C50109a;
import com.p683ss.android.ugc.playerkit.p2494c.C50110b;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e;
import com.p683ss.ttm.player.PlaybackParams;
import com.p683ss.ttm.player.TTPlayer;
import com.p683ss.ttvideoengine.Resolution;
import com.p683ss.ttvideoengine.StreamInfoListener;
import com.p683ss.ttvideoengine.TTVideoEngine;
import com.p683ss.ttvideoengine.VideoBufferListener;
import com.p683ss.ttvideoengine.VideoEngineInfoListener;
import com.p683ss.ttvideoengine.VideoEngineInfos;
import com.p683ss.ttvideoengine.VideoEngineListener;
import com.p683ss.ttvideoengine.VideoInfoListener;
import com.p683ss.ttvideoengine.log.ExternVideoLoggerListener;
import com.p683ss.ttvideoengine.log.VideoEventListener;
import com.p683ss.ttvideoengine.log.VideoEventManager;
import com.p683ss.ttvideoengine.metrics.IMediaMetrics;
import com.p683ss.ttvideoengine.model.VideoModel;
import com.p683ss.ttvideoengine.utils.Error;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.impl.f */
public final class C38907f extends C38888a {

    /* renamed from: R */
    private static VideoEventListener f99107R = new VideoEventListener() {
        public final void onEvent() {
            C50101a aVar;
            if (C38907f.f99109p != null) {
                aVar = (C50101a) C38907f.f99109p.get();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.onEvent(VideoEventManager.instance.popAllEvents());
            }
        }

        public final void onEventV2(String str) {
            C50101a aVar;
            if (!TextUtils.isEmpty(str) && C50109a.m108068s().mo95437r()) {
                JSONArray popAllEventsV2 = VideoEventManager.instance.popAllEventsV2();
                if (popAllEventsV2 != null && popAllEventsV2.length() > 0) {
                    int i = 0;
                    while (i < popAllEventsV2.length()) {
                        try {
                            JSONObject jSONObject = popAllEventsV2.getJSONObject(i);
                            if (jSONObject != null) {
                                jSONObject.put("params_for_special", "videoplayer_monitor");
                            }
                            i++;
                        } catch (JSONException unused) {
                        }
                    }
                    if (C38907f.f99109p != null) {
                        aVar = (C50101a) C38907f.f99109p.get();
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        aVar.mo95443a(popAllEventsV2, str);
                    }
                }
            }
        }
    };

    /* renamed from: l */
    public static boolean f99108l = true;

    /* renamed from: p */
    public static WeakReference<C50101a> f99109p = null;

    /* renamed from: s */
    private static boolean f99110s = true;

    /* renamed from: A */
    private SparseIntArray f99111A;

    /* renamed from: B */
    private ExternVideoLoggerListener f99112B;

    /* renamed from: C */
    private boolean f99113C;

    /* renamed from: D */
    private C38861b f99114D;

    /* renamed from: E */
    private boolean f99115E;

    /* renamed from: F */
    private IMediaMetrics f99116F;

    /* renamed from: G */
    private long f99117G;

    /* renamed from: H */
    private long f99118H;

    /* renamed from: I */
    private long f99119I;

    /* renamed from: J */
    private long f99120J;

    /* renamed from: K */
    private float f99121K;

    /* renamed from: L */
    private PlaybackParams f99122L;

    /* renamed from: M */
    private long f99123M;

    /* renamed from: N */
    private long f99124N;

    /* renamed from: O */
    private long f99125O;

    /* renamed from: P */
    private VideoEngineListener f99126P;

    /* renamed from: Q */
    private C50101a f99127Q;

    /* renamed from: b */
    public long f99128b;

    /* renamed from: c */
    public TTVideoEngine f99129c;

    /* renamed from: d */
    public SparseArray f99130d;

    /* renamed from: e */
    public boolean f99131e;

    /* renamed from: f */
    public volatile String f99132f;

    /* renamed from: g */
    public C38870i f99133g;

    /* renamed from: h */
    public C50113e f99134h;

    /* renamed from: i */
    public volatile VideoModel f99135i;

    /* renamed from: j */
    public boolean f99136j;

    /* renamed from: k */
    public long f99137k;

    /* renamed from: m */
    public long f99138m;

    /* renamed from: n */
    public C38862c f99139n;

    /* renamed from: o */
    public C38856b f99140o;

    /* renamed from: q */
    public C38868g f99141q;

    /* renamed from: r */
    public C38857c f99142r;

    /* renamed from: t */
    private Context f99143t;

    /* renamed from: u */
    private int f99144u;

    /* renamed from: v */
    private int f99145v;

    /* renamed from: w */
    private AtomicReference<TTVideoEngine> f99146w;

    /* renamed from: x */
    private boolean f99147x;

    /* renamed from: y */
    private boolean f99148y;

    /* renamed from: z */
    private int f99149z;

    /* renamed from: g */
    public final boolean mo78861g() {
        return this.f99147x;
    }

    /* renamed from: h */
    public final boolean mo78862h() {
        return this.f99113C;
    }

    /* renamed from: m */
    public final String mo78867m() {
        return this.f99132f;
    }

    /* renamed from: a */
    public final void mo78853a(boolean z) {
        if (C38854a.f98960a) {
            String str = TTPlayer.TAG;
            StringBuilder sb = new StringBuilder("reset  mPlayer = ");
            sb.append(this.f99129c);
            C38854a.m86290a(str, sb.toString());
        }
        this.f99122L.setSpeed(-1.0f);
        this.f99129c.setPlaybackParams(this.f99122L);
        boolean z2 = true;
        if (z || ((this.f99111A == null || this.f99111A.get(34) != 1) && !this.f99115E)) {
            z2 = false;
        }
        if (!z2) {
            this.f99129c.setListener(null);
            this.f99129c.release();
            this.f99129c.setSurface(null);
            this.f99129c = null;
            this.f99146w.set(null);
            m86672s();
        } else {
            this.f99129c.pause();
            this.f99129c.setSurface(null);
        }
        this.f99149z = 0;
        this.f99132f = null;
        this.f99135i = null;
    }

    /* renamed from: a */
    public final void mo78852a(String str, Map<String, Object> map) throws IOException {
        m86670a(null, str, map);
    }

    /* renamed from: a */
    public final void mo78845a(C38862c cVar) {
        if (cVar == null) {
            cVar = new C38860a();
        }
        this.f99139n = cVar;
    }

    /* renamed from: a */
    public final void mo78851a(String str, C38856b bVar) {
        try {
            this.f99140o = bVar;
            TTVideoEngine tTVideoEngine = this.f99129c;
            if (this.f99112B == null) {
                this.f99112B = new ExternVideoLoggerListener() {
                    public final String getLog(String str) {
                        if (C38907f.this.f99140o != null) {
                            return C38907f.this.f99140o.mo78831a(str);
                        }
                        return "";
                    }
                };
            }
            tTVideoEngine.setExternLogListener(this.f99112B, str);
        } catch (Exception e) {
            C9220a.m18312a((Throwable) e, "setLogListener");
        }
    }

    /* renamed from: a */
    public final void mo78846a(C38868g gVar) {
        if (gVar != this.f99141q) {
            this.f99141q = gVar;
            String str = TTPlayer.TAG;
            StringBuilder sb = new StringBuilder("setPrePrepareEventTimeListener listener  = ");
            sb.append(gVar);
            C38854a.m86290a(str, sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo78844a(C38857c cVar) {
        if (cVar != this.f99142r) {
            this.f99142r = cVar;
            String str = TTPlayer.TAG;
            StringBuilder sb = new StringBuilder("setNorPrepareEventTimeListener listener  = ");
            sb.append(cVar);
            C38854a.m86290a(str, sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo78848a(C50101a aVar) {
        if (aVar != this.f99127Q) {
            this.f99127Q = aVar;
            f99109p = new WeakReference<>(this.f99127Q);
            VideoEventManager.instance.setListener(f99107R);
        }
    }

    /* renamed from: a */
    public final void mo78850a(String str) {
        TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f99146w.get();
        if (tTVideoEngine != null) {
            tTVideoEngine.setCustomStr(str);
        }
    }

    /* renamed from: f */
    public final boolean mo78860f() {
        if (VERSION.SDK_INT >= 26 || !this.f99147x) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private static boolean m86673t() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("sony")) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo78863i() {
        try {
            if (this.f99129c != null) {
                return this.f99129c.supportHevcPlayback();
            }
        } catch (Exception e) {
            C9220a.m18312a((Throwable) e, "supportHevcPlayback");
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo78864j() {
        try {
            if (this.f99129c == null || this.f99129c.getPlaybackState() != 1) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C9220a.m18312a((Throwable) e, "isPlaying");
        }
        return false;
    }

    /* renamed from: k */
    public final long mo78865k() {
        try {
            if (this.f99129c != null) {
                return (long) this.f99129c.getCurrentPlaybackTime();
            }
        } catch (Exception e) {
            C9220a.m18312a((Throwable) e, "getCurrentPosition");
        }
        return 0;
    }

    /* renamed from: l */
    public final long mo78866l() {
        try {
            if (this.f99129c != null) {
                return (long) this.f99129c.getDuration();
            }
        } catch (Exception e) {
            C9220a.m18312a((Throwable) e, "getDuration");
        }
        return 1073741823;
    }

    /* renamed from: n */
    public final String mo78868n() {
        TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f99146w.get();
        if (tTVideoEngine != null) {
            return tTVideoEngine.getStringOption(82);
        }
        return "";
    }

    /* renamed from: o */
    public final boolean mo78869o() {
        TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f99146w.get();
        if (tTVideoEngine == null || !tTVideoEngine.isSystemPlayer()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final C38866g mo78870p() {
        String str;
        C38866g gVar = new C38866g();
        TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f99146w.get();
        if (tTVideoEngine != null) {
            str = tTVideoEngine.getStringOption(80);
        } else {
            str = null;
        }
        gVar.f98978a = str;
        return gVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TTPlayer{mPlayer=");
        sb.append(this.f99129c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: r */
    private void m86671r() {
        if (this.f99115E) {
            this.f99136j = true;
            this.f99137k = SystemClock.elapsedRealtime();
            f99108l = false;
        }
        if (f99108l) {
            this.f99138m = SystemClock.elapsedRealtime();
        }
        this.f99115E = false;
        this.f99129c.setCacheControlEnabled(true);
        this.f99129c.setLooping(true);
        this.f99129c.play();
    }

    /* renamed from: a */
    public final void mo78838a() {
        boolean z;
        if (this.f99129c != null && this.f99134h != null) {
            C50113e eVar = this.f99134h;
            boolean z2 = false;
            if ((eVar.f125538i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || eVar.mo97887a()) {
                z2 = true;
            }
            if (z2) {
                this.f99129c.createPlayer();
                this.f99129c.setIntOption(7, 1);
                this.f99129c.setAsyncInit(true, this.f99134h.mo97887a() ? 1 : 0);
                this.f99115E = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo78854b() {
        if (this.f99111A != null && this.f99111A.indexOfKey(7) >= 0) {
            if (this.f99113C) {
                this.f99129c.setIntOption(210, 1);
                this.f99129c.setIntOption(211, this.f99111A.get(9));
                this.f99129c.setIntOption(212, this.f99111A.get(8));
            } else {
                this.f99129c.setIntOption(210, 0);
            }
        }
        new StringBuilder("TTPlayer, start mPlayer = ").append(this.f99129c);
        this.f99129c.play();
        if (this.f99136j) {
            this.f99125O = SystemClock.elapsedRealtime() - this.f99137k;
            if (this.f99141q != null) {
                this.f99141q.mo78882b(this.f99124N);
                this.f99141q.mo78883c(this.f99125O);
            }
        }
    }

    /* renamed from: c */
    public final void mo78856c() {
        if (C38854a.f98960a) {
            String str = TTPlayer.TAG;
            StringBuilder sb = new StringBuilder("pause  mPlayer = ");
            sb.append(this.f99129c);
            C38854a.m86290a(str, sb.toString());
        }
        try {
            if (this.f99129c != null) {
                this.f99129c.pause();
            }
            if (this.f99136j && this.f99123M == 0) {
                this.f99123M = SystemClock.elapsedRealtime() - this.f99137k;
                if (this.f99141q != null) {
                    this.f99141q.mo78881a(this.f99123M);
                }
            }
        } catch (Exception e) {
            C9220a.m18312a((Throwable) e, "pause");
        }
        this.f99131e = false;
    }

    /* renamed from: d */
    public final void mo78858d() {
        this.f99119I = SystemClock.elapsedRealtime();
        if (C38854a.f98960a) {
            String str = TTPlayer.TAG;
            StringBuilder sb = new StringBuilder("stop  mPlayer = ");
            sb.append(this.f99129c);
            C38854a.m86290a(str, sb.toString());
        }
        try {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f99146w.get();
            if (tTVideoEngine != null) {
                this.f99116F = tTVideoEngine.getMetrics(0);
            }
            if (this.f99129c != null) {
                this.f99129c.stop();
                this.f99120J = SystemClock.elapsedRealtime();
            }
        } catch (Exception e) {
            C9220a.m18312a((Throwable) e, "stop");
        }
    }

    /* renamed from: e */
    public final void mo78859e() {
        if (C38854a.f98960a) {
            String str = TTPlayer.TAG;
            StringBuilder sb = new StringBuilder("release  mPlayer = ");
            sb.append(this.f99129c);
            C38854a.m86290a(str, sb.toString());
        }
        try {
            this.f99129c.setListener(null);
            this.f99129c.release();
            this.f99115E = false;
            this.f99136j = false;
            f99108l = false;
        } catch (Exception e) {
            C9220a.m18312a((Throwable) e, "release");
        }
        if (Thread.currentThread().getId() != this.f99128b) {
            C9220a.m18312a((Throwable) new Exception(), "release thread not match");
        }
    }

    /* renamed from: q */
    public final C38865f mo78871q() {
        long j;
        IMediaMetrics iMediaMetrics;
        TTVideoEngine tTVideoEngine = (TTVideoEngine) this.f99146w.get();
        C38865f fVar = this.f99036a;
        if (tTVideoEngine != null) {
            j = tTVideoEngine.getLongOption(315);
        } else {
            j = 0;
        }
        fVar.f98975f = j;
        if (tTVideoEngine != null) {
            if (this.f99116F == null) {
                iMediaMetrics = tTVideoEngine.getMetrics(0);
            } else {
                iMediaMetrics = this.f99116F;
            }
            if (iMediaMetrics != null) {
                C38863d dVar = new C38863d();
                dVar.f98961a = this.f99117G;
                dVar.f98962b = this.f99118H;
                dVar.f98963c = iMediaMetrics.popMetricLong("ffr_read_head_duration");
                dVar.f98964d = iMediaMetrics.popMetricLong("ffr_read_first_data_duration");
                dVar.f98965e = iMediaMetrics.popMetricLong("ffr_decode_duration");
                dVar.f98966f = iMediaMetrics.popMetricLong("ffr_render_duration");
                dVar.f98967g = iMediaMetrics.popMetricLong("ffr_playback_buffering_duration");
                this.f99036a.f98976g = dVar;
            }
        }
        return super.mo78871q();
    }

    /* renamed from: s */
    private void m86672s() {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        float f;
        int i13;
        float f2;
        float f3;
        float f4;
        boolean z3;
        int i14;
        if (this.f99129c == null) {
            if (this.f99111A != null) {
                if (this.f99111A.get(1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i10 = this.f99111A.get(0);
                i9 = this.f99111A.get(2);
                i7 = this.f99111A.get(3);
                i6 = this.f99111A.get(4);
                i5 = this.f99111A.get(5);
                i4 = this.f99111A.get(6);
                if (this.f99111A.get(18) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                i3 = this.f99111A.get(28);
                i2 = this.f99111A.get(23);
                i = this.f99111A.get(26);
                i8 = this.f99111A.get(27);
            } else {
                z2 = false;
                i10 = 0;
                i9 = 1;
                i8 = 0;
                i7 = 1000;
                i6 = 5000;
                i5 = 0;
                i4 = 0;
                z = false;
                i3 = 0;
                i2 = 0;
                i = 0;
            }
            if (this.f99130d == null || this.f99130d.size() <= 0) {
                i12 = i8;
                i11 = i;
                f4 = 0.0f;
                f3 = 0.0f;
                f2 = 0.0f;
                i13 = 1;
                f = 0.0f;
            } else {
                float floatValue = ((Float) this.f99130d.get(29)).floatValue();
                float floatValue2 = ((Float) this.f99130d.get(30)).floatValue();
                i12 = i8;
                f = ((Float) this.f99130d.get(31)).floatValue();
                i11 = i;
                f2 = floatValue2;
                i13 = 1;
                f3 = ((Float) this.f99130d.get(32)).floatValue();
                f4 = floatValue;
            }
            TTVideoEngineLog.turnOn(i13, i4);
            if (i4 == i13) {
                z3 = true;
            } else {
                z3 = false;
            }
            f99110s = z3;
            this.f99129c = new TTVideoEngine(this.f99143t, i10);
            this.f99146w.set(this.f99129c);
            if (i10 == 1) {
                this.f99129c.setIntOption(117, 1);
            }
            if (z) {
                this.f99129c.setIntOption(216, 1);
            }
            this.f99129c.setIntOption(415, 1);
            this.f99129c.setIntOption(4, i9);
            if (m86673t()) {
                this.f99129c.setUnSupportSampleRates(new int[]{44100});
            }
            this.f99129c.setListener(this.f99126P);
            this.f99129c.setStreamInfoListener(new StreamInfoListener() {
                public final void onVideoStreamBitrateChanged(Resolution resolution, int i) {
                    C38907f.this.f99139n.mo78875a(resolution, i);
                }
            });
            this.f99129c.setVideoInfoListener(new VideoInfoListener() {
                public final boolean onFetchedVideoInfo(VideoModel videoModel) {
                    C38907f.this.f99135i = videoModel;
                    C38907f.this.f99036a.f98977h = videoModel;
                    return false;
                }
            });
            if (!z2) {
                if (mo78860f() && this.f99131e && this.f99149z > 0) {
                    this.f99129c.setStartTime(this.f99149z);
                }
                if (this.f99147x) {
                    this.f99129c.setIntOption(7, 1);
                }
                this.f99129c.setIntOption(118, i7);
                this.f99129c.setIntOption(202, i6);
                this.f99129c.setIntOption(206, i5);
                this.f99129c.setIntOption(11, 0);
                this.f99129c.setIntOption(204, 1);
                this.f99129c.setIntOption(12, 0);
                this.f99129c.setIntOption(213, 1);
                this.f99129c.setIntOption(329, i3);
                if (i3 == 1) {
                    this.f99129c.setFloatOption(325, f4);
                    this.f99129c.setFloatOption(326, f2);
                    this.f99129c.setFloatOption(327, f);
                    this.f99129c.setFloatOption(328, f3);
                }
                this.f99129c.setIntOption(322, i2);
                TTVideoEngine tTVideoEngine = this.f99129c;
                boolean z4 = true;
                if (i11 == 1) {
                    i14 = i12;
                } else {
                    i14 = i12;
                    z4 = false;
                }
                tTVideoEngine.setQcomVpp(z4, i14);
                this.f99129c.setVideoBufferListener(new VideoBufferListener() {
                    public final void onBufferEnd(int i) {
                        if (C38907f.this.f99133g == null || i != 1) {
                            if (C38907f.this.f99134h != null && C38907f.this.f99134h.f125541l && C38907f.this.f99139n != null && i == 0) {
                                C38907f.this.f99139n.mo78876a(false);
                            }
                            return;
                        }
                        C38907f.this.f99133g.mo78928b();
                    }

                    public final void onBufferStart(int i) {
                        if (C38907f.this.f99133g == null || i != 1) {
                            if (C38907f.this.f99134h != null && C38907f.this.f99134h.f125541l && C38907f.this.f99139n != null && i == 0) {
                                C38907f.this.f99139n.mo78876a(true);
                            }
                            return;
                        }
                        C38907f.this.f99133g.mo78927a();
                    }
                });
                this.f99129c.setVideoEngineInfoListener(new VideoEngineInfoListener() {
                    public final void onVideoEngineInfos(VideoEngineInfos videoEngineInfos) {
                        if (videoEngineInfos != null && TextUtils.equals(videoEngineInfos.getKey(), "mdlcacheend") && C38907f.this.f99139n != null) {
                            C38907f.this.f99139n.mo78879d();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo78847a(C38870i iVar) {
        this.f99133g = iVar;
    }

    public C38907f(Context context) {
        this(context, false);
    }

    /* renamed from: a */
    public final void mo78841a(long j) {
        if (mo78860f()) {
            this.f99131e = true;
            this.f99149z = (int) j;
        }
    }

    /* renamed from: b */
    public final void mo78855b(boolean z) {
        try {
            if (this.f99129c != null) {
                this.f99129c.setLooping(true);
            }
        } catch (Exception e) {
            C9220a.m18312a((Throwable) e, "setLooping");
        }
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo78837a(int r5) {
        /*
            r4 = this;
            com.ss.ttvideoengine.TTVideoEngine r0 = r4.f99129c
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L_0x0007
            return r1
        L_0x0007:
            switch(r5) {
                case 0: goto L_0x003a;
                case 1: goto L_0x0032;
                case 2: goto L_0x0028;
                case 3: goto L_0x0048;
                case 4: goto L_0x0048;
                case 5: goto L_0x0048;
                case 6: goto L_0x0048;
                case 7: goto L_0x0048;
                case 8: goto L_0x001e;
                case 9: goto L_0x0014;
                case 10: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0048
        L_0x000b:
            com.ss.ttvideoengine.TTVideoEngine r5 = r4.f99129c     // Catch:{ Exception -> 0x0042 }
            r0 = 70
            float r5 = r5.getFloatOption(r0)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0030
        L_0x0014:
            com.ss.ttvideoengine.TTVideoEngine r5 = r4.f99129c     // Catch:{ Exception -> 0x0042 }
            r0 = 42
            int r5 = r5.getIntOption(r0)     // Catch:{ Exception -> 0x0042 }
            float r1 = (float) r5     // Catch:{ Exception -> 0x0042 }
            goto L_0x0048
        L_0x001e:
            com.ss.ttvideoengine.TTVideoEngine r5 = r4.f99129c     // Catch:{ Exception -> 0x0042 }
            r0 = 60
            long r2 = r5.getLongOption(r0)     // Catch:{ Exception -> 0x0042 }
            float r1 = (float) r2     // Catch:{ Exception -> 0x0042 }
            goto L_0x0048
        L_0x0028:
            com.ss.ttvideoengine.TTVideoEngine r5 = r4.f99129c     // Catch:{ Exception -> 0x0042 }
            r0 = 71
            float r5 = r5.getFloatOption(r0)     // Catch:{ Exception -> 0x0042 }
        L_0x0030:
            r1 = r5
            goto L_0x0048
        L_0x0032:
            com.ss.ttvideoengine.TTVideoEngine r5 = r4.f99129c     // Catch:{ Exception -> 0x0042 }
            int r5 = r5.getDuration()     // Catch:{ Exception -> 0x0042 }
            float r1 = (float) r5     // Catch:{ Exception -> 0x0042 }
            goto L_0x0048
        L_0x003a:
            com.ss.ttvideoengine.TTVideoEngine r5 = r4.f99129c     // Catch:{ Exception -> 0x0042 }
            int r5 = r5.getCurrentPlaybackTime()     // Catch:{ Exception -> 0x0042 }
            float r1 = (float) r5
            goto L_0x0048
        L_0x0042:
            r5 = move-exception
            java.lang.String r0 = "getInfo"
            com.bytedance.p502b.p503a.p506b.p508b.C9220a.m18312a(r5, r0)
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.player.sdk.impl.C38907f.mo78837a(int):float");
    }

    /* renamed from: a */
    public final void mo78839a(float f) {
        try {
            if (this.f99129c != null) {
                TTVideoEngine tTVideoEngine = this.f99129c;
                double d = (double) f;
                Double.isNaN(d);
                double d2 = d * 0.01d;
                double duration = (double) this.f99129c.getDuration();
                Double.isNaN(duration);
                tTVideoEngine.seekTo((int) (d2 * duration), null);
            }
        } catch (Exception e) {
            C9220a.m18312a((Throwable) e, "seekTo");
        }
    }

    /* renamed from: c */
    public final boolean mo78857c(boolean z) {
        boolean z2;
        boolean z3;
        if (this.f99111A == null || (this.f99111A.indexOfKey(17) < 0 && this.f99111A.indexOfKey(16) < 0)) {
            return this.f99147x;
        }
        if (this.f99111A.get(17, 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f99111A.get(16, 0) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (C38854a.f98960a) {
            String str = TTPlayer.TAG;
            StringBuilder sb = new StringBuilder("h265:");
            sb.append(z);
            sb.append(", h265DecodeHardare:");
            sb.append(z2);
            sb.append(", h264DecodeHardare:");
            sb.append(z3);
            C38854a.m86290a(str, sb.toString());
        }
        if (z && z2) {
            return true;
        }
        if (z || !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo78842a(Surface surface) {
        try {
            if ((this.f99114D == null || !this.f99114D.mo78880a(surface)) && this.f99129c != null) {
                if (C38854a.f98960a) {
                    String str = TTPlayer.TAG;
                    StringBuilder sb = new StringBuilder("setSurface surface = ");
                    sb.append(surface);
                    sb.append(", this = ");
                    sb.append(this);
                    C38854a.m86290a(str, sb.toString());
                }
                this.f99129c.setSurface(surface);
                if (this.f99136j) {
                    this.f99124N = SystemClock.elapsedRealtime() - this.f99137k;
                }
            }
        } catch (Exception e) {
            C9220a.m18312a((Throwable) e, "setSurface");
        }
    }

    /* renamed from: a */
    public final void mo78843a(SurfaceHolder surfaceHolder) {
        try {
            if (this.f99129c != null) {
                this.f99129c.setSurfaceHolder(surfaceHolder);
            }
        } catch (Exception e) {
            C9220a.m18312a((Throwable) e, "setDisplay");
        }
    }

    /* renamed from: a */
    public final void mo78849a(C50110b bVar, Map<String, Object> map) throws IOException {
        m86670a(bVar, null, map);
    }

    private C38907f(Context context, boolean z) {
        this(context, false, null);
    }

    /* renamed from: a */
    public final void mo78840a(float f, float f2) {
        try {
            if (this.f99129c != null) {
                this.f99129c.setVolume(f, f2);
            }
        } catch (Exception e) {
            C9220a.m18312a((Throwable) e, "setVolume");
        }
    }

    private C38907f(Context context, boolean z, SparseIntArray sparseIntArray) {
        this(context, z, null, null, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0472  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m86670a(com.p683ss.android.ugc.playerkit.p2494c.C50110b r18, java.lang.String r19, java.util.Map<java.lang.String, java.lang.Object> r20) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = com.p683ss.android.ugc.aweme.player.sdk.C38854a.f98960a
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "TTPlayer"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "prepareAsync url:"
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.p683ss.android.ugc.aweme.player.sdk.C38854a.m86290a(r4, r5)
        L_0x001f:
            r4 = 0
            r0.f99117G = r4
            long r6 = r0.f99119I
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x003d
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r8 = r0.f99119I
            long r6 = r6 - r8
            r0.f99117G = r6
            long r6 = r0.f99120J
            long r8 = r0.f99119I
            long r6 = r6 - r8
            r0.f99118H = r6
            r0.f99119I = r4
            r0.f99120J = r4
        L_0x003d:
            r4 = 0
            r0.f99132f = r4
            r5 = -1
            r6 = 0
            if (r3 == 0) goto L_0x014a
            java.lang.String r7 = "vr"
            java.lang.Object r7 = r3.get(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.booleanValue()
            java.lang.String r7 = "h265"
            java.lang.Object r7 = r3.get(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.String r8 = "render_type"
            java.lang.Object r8 = r3.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            r8.intValue()
            java.lang.String r8 = "bitrate"
            java.lang.Object r8 = r3.get(r8)
            if (r8 == 0) goto L_0x007b
            java.lang.String r8 = "bitrate"
            java.lang.Object r8 = r3.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L_0x007c
        L_0x007b:
            r8 = 0
        L_0x007c:
            java.lang.String r9 = "ratio"
            java.lang.Object r9 = r3.get(r9)
            if (r9 == 0) goto L_0x0090
            java.lang.String r5 = "ratio"
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
        L_0x0090:
            java.lang.String r9 = "async_init"
            java.lang.Object r9 = r3.get(r9)
            if (r9 == 0) goto L_0x00af
            java.lang.String r9 = "async_init"
            java.lang.Object r9 = r3.get(r9)
            boolean r9 = r9 instanceof java.lang.Boolean
            if (r9 == 0) goto L_0x00af
            java.lang.String r9 = "async_init"
            java.lang.Object r9 = r3.get(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            goto L_0x00b0
        L_0x00af:
            r9 = 0
        L_0x00b0:
            java.lang.String r10 = "key"
            java.lang.Object r10 = r3.get(r10)
            if (r10 == 0) goto L_0x00c3
            java.lang.String r10 = "key"
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = r10.toString()
            goto L_0x00c4
        L_0x00c3:
            r10 = r4
        L_0x00c4:
            java.lang.String r11 = "set_cookie_token"
            java.lang.Object r11 = r3.get(r11)
            if (r11 == 0) goto L_0x00d9
            java.lang.String r11 = "set_cookie_token"
            java.lang.Object r11 = r3.get(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            goto L_0x00da
        L_0x00d9:
            r11 = 0
        L_0x00da:
            java.lang.String r12 = "dash_hijack_retry"
            java.lang.Object r12 = r3.get(r12)
            if (r12 == 0) goto L_0x00ef
            java.lang.String r12 = "dash_hijack_retry"
            java.lang.Object r12 = r3.get(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            goto L_0x00f0
        L_0x00ef:
            r12 = 0
        L_0x00f0:
            java.lang.String r13 = "enable_alog"
            java.lang.Object r13 = r3.get(r13)
            if (r13 == 0) goto L_0x0115
            java.lang.String r13 = "enable_alog"
            java.lang.Object r13 = r3.get(r13)
            boolean r13 = r13 instanceof java.lang.Integer
            if (r13 == 0) goto L_0x0115
            com.ss.ttvideoengine.TTVideoEngine r13 = r0.f99129c
            r14 = 320(0x140, float:4.48E-43)
            java.lang.String r15 = "enable_alog"
            java.lang.Object r15 = r3.get(r15)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r13.setIntOption(r14, r15)
        L_0x0115:
            java.lang.String r13 = "use_texture_render"
            java.lang.Object r13 = r3.get(r13)
            if (r13 == 0) goto L_0x0130
            com.ss.ttvideoengine.TTVideoEngine r13 = r0.f99129c
            r14 = 199(0xc7, float:2.79E-43)
            java.lang.String r15 = "use_texture_render"
            java.lang.Object r15 = r3.get(r15)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r13.setIntOption(r14, r15)
        L_0x0130:
            java.lang.String r13 = "force_software_decode"
            java.lang.Object r13 = r3.get(r13)
            if (r13 == 0) goto L_0x0147
            java.lang.String r13 = "force_software_decode"
            java.lang.Object r13 = r3.get(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r0.f99148y = r13
            goto L_0x0150
        L_0x0147:
            r0.f99148y = r6
            goto L_0x0150
        L_0x014a:
            r10 = r4
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
        L_0x0150:
            r0.f99113C = r6
            android.util.SparseIntArray r13 = r0.f99111A
            r14 = 7
            r15 = 1
            if (r13 == 0) goto L_0x0162
            android.util.SparseIntArray r13 = r0.f99111A
            int r13 = r13.get(r14)
            if (r13 != r15) goto L_0x0162
            r13 = 1
            goto L_0x0163
        L_0x0162:
            r13 = 0
        L_0x0163:
            if (r13 == 0) goto L_0x01ac
            android.util.SparseIntArray r13 = r0.f99111A
            r14 = 10
            int r13 = r13.get(r14)
            android.util.SparseIntArray r14 = r0.f99111A
            r4 = 11
            int r4 = r14.get(r4)
            android.util.SparseIntArray r14 = r0.f99111A
            r6 = 12
            int r6 = r14.get(r6)
            if (r6 != r15) goto L_0x0181
            r6 = 1
            goto L_0x0182
        L_0x0181:
            r6 = 0
        L_0x0182:
            android.util.SparseIntArray r14 = r0.f99111A
            r15 = 13
            int r14 = r14.get(r15)
            android.util.SparseIntArray r15 = r0.f99111A
            r16 = r11
            r11 = 14
            int r11 = r15.get(r11)
            if (r13 <= 0) goto L_0x01ae
            if (r5 < r13) goto L_0x01ae
            if (r8 <= 0) goto L_0x01ae
            if (r8 > r4) goto L_0x01ae
            if (r7 == 0) goto L_0x01a0
            if (r6 == 0) goto L_0x01ae
        L_0x01a0:
            int r4 = r0.f99144u
            if (r4 <= r14) goto L_0x01ae
            int r4 = r0.f99145v
            if (r4 <= r11) goto L_0x01ae
            r4 = 1
            r0.f99113C = r4
            goto L_0x01ae
        L_0x01ac:
            r16 = r11
        L_0x01ae:
            android.util.SparseIntArray r4 = r0.f99111A
            r5 = 15
            if (r4 == 0) goto L_0x01bf
            android.util.SparseIntArray r4 = r0.f99111A
            int r4 = r4.get(r5)
            r6 = 1
            if (r4 != r6) goto L_0x01bf
            r4 = 1
            goto L_0x01c0
        L_0x01bf:
            r4 = 0
        L_0x01c0:
            com.ss.ttvideoengine.TTVideoEngine r6 = r0.f99129c
            r8 = 34
            r11 = 0
            r6.setIntOption(r8, r11)
            com.ss.ttvideoengine.TTVideoEngine r6 = r0.f99129c
            r13 = 29
            r6.setIntOption(r13, r11)
            boolean r6 = android.text.TextUtils.isEmpty(r19)
            r11 = 203(0xcb, float:2.84E-43)
            r14 = 37
            r15 = 33
            if (r6 != 0) goto L_0x01f9
            java.lang.String r6 = "http"
            boolean r6 = r2.startsWith(r6)
            if (r6 != 0) goto L_0x01f9
            java.lang.String r6 = "mdl:"
            boolean r6 = r2.startsWith(r6)
            if (r6 != 0) goto L_0x01f9
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r4 = 0
            r1.setIntOption(r11, r4)
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r1.setLocalURL(r2)
        L_0x01f6:
            r5 = 1
            goto L_0x02f5
        L_0x01f9:
            com.ss.ttvideoengine.TTVideoEngine r6 = r0.f99129c
            r5 = 1
            r6.setIntOption(r11, r5)
            r6 = 160(0xa0, float:2.24E-43)
            r11 = 17
            if (r1 == 0) goto L_0x02d8
            com.ss.ttvideoengine.model.VideoModel r4 = r1.f125512a
            if (r4 != 0) goto L_0x02a1
            java.lang.String r4 = r1.f125514c
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x02a1
            com.ss.ttvideoengine.TTVideoEngine r4 = r0.f99129c
            r4.setIntOption(r6, r5)
            boolean r4 = r1.f125522k
            if (r4 == 0) goto L_0x0221
            com.ss.ttvideoengine.TTVideoEngine r4 = r0.f99129c
            r4.setIntOption(r13, r5)
            r6 = 1
            goto L_0x0230
        L_0x0221:
            com.ss.ttvideoengine.TTVideoEngine r4 = r0.f99129c
            com.ss.ttvideoengine.Resolution r5 = r1.f125519h
            if (r5 == 0) goto L_0x022a
            com.ss.ttvideoengine.Resolution r5 = r1.f125519h
            goto L_0x022c
        L_0x022a:
            com.ss.ttvideoengine.Resolution r5 = com.p683ss.ttvideoengine.Resolution.SuperHigh
        L_0x022c:
            r4.configResolution(r5)
            r6 = 0
        L_0x0230:
            com.ss.ttvideoengine.TTVideoEngine r4 = r0.f99129c
            java.lang.String r5 = r1.f125514c
            r4.setVideoID(r5)
            int r4 = r1.f125520i
            if (r4 == 0) goto L_0x0243
            com.ss.ttvideoengine.TTVideoEngine r4 = r0.f99129c
            r5 = 1
            r4.setIntOption(r8, r5)
            r10 = 0
            goto L_0x024a
        L_0x0243:
            r5 = 1
            com.ss.ttvideoengine.TTVideoEngine r4 = r0.f99129c
            r10 = 0
            r4.setIntOption(r8, r10)
        L_0x024a:
            int r4 = r1.f125521j
            if (r4 != 0) goto L_0x0254
            com.ss.ttvideoengine.TTVideoEngine r4 = r0.f99129c
            r4.setIntOption(r14, r10)
            goto L_0x0259
        L_0x0254:
            com.ss.ttvideoengine.TTVideoEngine r4 = r0.f99129c
            r4.setIntOption(r14, r5)
        L_0x0259:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "https://i.snssdk.com/video/drm/v1/bdtoken?aid="
            r4.<init>(r5)
            java.lang.String r5 = r1.f125517f
            r4.append(r5)
            java.lang.String r5 = "&vid=%s&kid=%s"
            r4.append(r5)
            com.ss.ttvideoengine.TTVideoEngine r5 = r0.f99129c
            java.lang.String r4 = r4.toString()
            r5.setTokenUrlTemplate(r4)
            com.ss.ttvideoengine.TTVideoEngine r4 = r0.f99129c
            java.lang.String r5 = r1.f125515d
            r8 = 1
            r4.setPlayAPIVersion(r8, r5)
            com.ss.ttvideoengine.TTVideoEngine r4 = r0.f99129c
            com.ss.android.ugc.aweme.player.sdk.impl.f$2 r5 = new com.ss.android.ugc.aweme.player.sdk.impl.f$2
            r5.<init>(r1)
            r4.setDataSource(r5)
            boolean r1 = r1.f125518g
            if (r1 == 0) goto L_0x0294
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r1.setIntOption(r15, r8)
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r1.setIntOption(r11, r8)
            goto L_0x029f
        L_0x0294:
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r4 = 0
            r1.setIntOption(r15, r4)
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r1.setIntOption(r11, r4)
        L_0x029f:
            r5 = 1
            goto L_0x02f6
        L_0x02a1:
            com.ss.ttvideoengine.model.VideoModel r4 = r1.f125512a
            if (r4 == 0) goto L_0x01f6
            com.ss.ttvideoengine.model.VideoModel r4 = r1.f125512a
            r0.f99135i = r4
            com.ss.ttvideoengine.TTVideoEngine r4 = r0.f99129c
            r5 = 1
            r4.setIntOption(r6, r5)
            boolean r1 = r1.f125522k
            if (r1 == 0) goto L_0x02b9
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r1.setIntOption(r13, r5)
            goto L_0x02c6
        L_0x02b9:
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            com.ss.ttvideoengine.model.VideoModel r4 = r0.f99135i
            com.ss.ttvideoengine.Resolution r6 = com.p683ss.ttvideoengine.Resolution.H_High
            com.ss.ttvideoengine.Resolution r4 = com.p683ss.ttvideoengine.TTVideoEngine.findBestResolution(r4, r6, r5)
            r1.configResolution(r4)
        L_0x02c6:
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            com.ss.ttvideoengine.model.VideoModel r4 = r0.f99135i
            r1.setVideoModel(r4)
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r1.setIntOption(r15, r5)
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r1.setIntOption(r11, r5)
            goto L_0x02f5
        L_0x02d8:
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r8 = 0
            r1.setIntOption(r15, r8)
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r1.setIntOption(r11, r8)
            if (r4 == 0) goto L_0x02f0
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r1.setIntOption(r6, r5)
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r1.setDirectUrlUseDataLoader(r2, r10)
            goto L_0x02f5
        L_0x02f0:
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r1.setDirectURL(r2)
        L_0x02f5:
            r6 = 0
        L_0x02f6:
            r0.f99132f = r2
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r2 = 6
            r1.setIntOption(r2, r5)
            com.ss.android.ugc.playerkit.c.e r1 = r0.f99134h
            if (r1 == 0) goto L_0x031d
            com.ss.android.ugc.playerkit.c.e r1 = r0.f99134h
            boolean r1 = r1.f125544o
            if (r1 == 0) goto L_0x031d
            com.ss.android.ugc.playerkit.c.e r1 = r0.f99134h
            com.bytedance.ies.ugc.aweme.network.f r1 = r1.f125546q
            if (r1 == 0) goto L_0x031d
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            com.ss.android.ugc.aweme.player.sdk.impl.e r2 = new com.ss.android.ugc.aweme.player.sdk.impl.e
            com.ss.android.ugc.playerkit.c.e r4 = r0.f99134h
            com.bytedance.ies.ugc.aweme.network.f r4 = r4.f125546q
            r2.<init>(r4)
            r1.setNetworkClient(r2)
            goto L_0x0323
        L_0x031d:
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r2 = 0
            r1.setNetworkClient(r2)
        L_0x0323:
            if (r3 == 0) goto L_0x035a
            java.lang.String r1 = "init_start_time_ms"
            java.lang.Object r1 = r3.get(r1)
            if (r1 == 0) goto L_0x033e
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            java.lang.String r2 = "init_start_time_ms"
            java.lang.Object r2 = r3.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setStartTime(r2)
        L_0x033e:
            java.lang.String r1 = "tag"
            java.lang.Object r1 = r3.get(r1)
            if (r1 == 0) goto L_0x0354
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            java.lang.String r2 = "tag"
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.setTag(r2)
            goto L_0x035a
        L_0x0354:
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r2 = 0
            r1.setTag(r2)
        L_0x035a:
            boolean r1 = r0.mo78857c(r7)
            r0.f99147x = r1
            boolean r1 = r0.f99148y
            if (r1 != 0) goto L_0x0370
            boolean r1 = r0.f99147x
            if (r1 == 0) goto L_0x0370
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r2 = 1
            r3 = 7
            r1.setIntOption(r3, r2)
            goto L_0x0377
        L_0x0370:
            r3 = 7
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r2 = 0
            r1.setIntOption(r3, r2)
        L_0x0377:
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r2 = 332(0x14c, float:4.65E-43)
            com.ss.android.ugc.playerkit.c.e r3 = r0.f99134h
            if (r3 == 0) goto L_0x0387
            com.ss.android.ugc.playerkit.c.e r3 = r0.f99134h
            boolean r3 = r3.f125539j
            if (r3 == 0) goto L_0x0387
            r3 = 1
            goto L_0x0388
        L_0x0387:
            r3 = 0
        L_0x0388:
            r1.setIntOption(r2, r3)
            if (r9 == 0) goto L_0x039e
            boolean r1 = r0.f99147x
            if (r1 == 0) goto L_0x039e
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            if (r7 == 0) goto L_0x0398
            r2 = 1
        L_0x0396:
            r4 = 1
            goto L_0x039a
        L_0x0398:
            r2 = 0
            goto L_0x0396
        L_0x039a:
            r1.setAsyncInit(r4, r2)
            goto L_0x039f
        L_0x039e:
            r4 = 1
        L_0x039f:
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r2 = 110(0x6e, float:1.54E-43)
            r1.setIntOption(r2, r4)
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r2 = 3
            r1.setIntOption(r2, r4)
            if (r6 == 0) goto L_0x03bd
            com.ss.android.ugc.playerkit.c.e r1 = r0.f99134h
            if (r1 == 0) goto L_0x03bd
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            com.ss.android.ugc.playerkit.c.e r2 = r0.f99134h
            int r2 = r2.f125545p
            r3 = 0
            r1.setIntOption(r3, r2)
            goto L_0x03de
        L_0x03bd:
            android.util.SparseIntArray r1 = r0.f99111A
            if (r1 == 0) goto L_0x03d6
            android.util.SparseIntArray r1 = r0.f99111A
            int r1 = r1.indexOfKey(r15)
            if (r1 < 0) goto L_0x03d6
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            android.util.SparseIntArray r2 = r0.f99111A
            int r2 = r2.get(r15)
            r3 = 0
            r1.setIntOption(r3, r2)
            goto L_0x03de
        L_0x03d6:
            r3 = 0
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r2 = 15
            r1.setIntOption(r3, r2)
        L_0x03de:
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r2 = 183(0xb7, float:2.56E-43)
            r1.setIntOption(r2, r3)
            android.util.SparseIntArray r1 = r0.f99111A
            if (r1 == 0) goto L_0x0400
            android.util.SparseIntArray r1 = r0.f99111A
            r2 = 39
            int r1 = r1.indexOfKey(r2)
            if (r1 < 0) goto L_0x0400
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r5 = 301(0x12d, float:4.22E-43)
            android.util.SparseIntArray r6 = r0.f99111A
            int r2 = r6.get(r2)
            r1.setIntOption(r5, r2)
        L_0x0400:
            android.util.SparseIntArray r1 = r0.f99111A
            if (r1 == 0) goto L_0x041b
            android.util.SparseIntArray r1 = r0.f99111A
            r2 = 38
            int r1 = r1.indexOfKey(r2)
            if (r1 < 0) goto L_0x041b
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r5 = 416(0x1a0, float:5.83E-43)
            android.util.SparseIntArray r6 = r0.f99111A
            int r2 = r6.get(r2)
            r1.setIntOption(r5, r2)
        L_0x041b:
            android.util.SparseIntArray r1 = r0.f99111A
            if (r1 == 0) goto L_0x0434
            android.util.SparseIntArray r1 = r0.f99111A
            int r1 = r1.indexOfKey(r14)
            if (r1 < 0) goto L_0x0434
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r2 = 302(0x12e, float:4.23E-43)
            android.util.SparseIntArray r5 = r0.f99111A
            int r5 = r5.get(r14)
            r1.setIntOption(r2, r5)
        L_0x0434:
            android.util.SparseIntArray r1 = r0.f99111A
            if (r1 == 0) goto L_0x0451
            android.util.SparseIntArray r1 = r0.f99111A
            r2 = 41
            int r1 = r1.indexOfKey(r2)
            if (r1 < 0) goto L_0x0451
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r2 = 481(0x1e1, float:6.74E-43)
            android.util.SparseIntArray r5 = r0.f99111A
            r6 = 41
            int r5 = r5.get(r6)
            r1.setIntOption(r2, r5)
        L_0x0451:
            android.util.SparseIntArray r1 = r0.f99111A
            if (r1 == 0) goto L_0x046e
            android.util.SparseIntArray r1 = r0.f99111A
            r2 = 40
            int r1 = r1.indexOfKey(r2)
            if (r1 < 0) goto L_0x046e
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r2 = 479(0x1df, float:6.71E-43)
            android.util.SparseIntArray r5 = r0.f99111A
            r6 = 40
            int r5 = r5.get(r6)
            r1.setIntOption(r2, r5)
        L_0x046e:
            com.ss.android.ugc.playerkit.c.e r1 = r0.f99134h
            if (r1 == 0) goto L_0x0533
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r2 = 402(0x192, float:5.63E-43)
            com.ss.android.ugc.playerkit.c.e r5 = r0.f99134h
            int r5 = r5.f125542m
            r1.setIntOption(r2, r5)
            com.ss.ttvideoengine.TTVideoEngine r1 = r0.f99129c
            r2 = 323(0x143, float:4.53E-43)
            com.ss.android.ugc.playerkit.c.e r5 = r0.f99134h
            int r5 = r5.f125543n
            r1.setIntOption(r2, r5)
            com.ss.android.ugc.playerkit.c.e r1 = r0.f99134h
            com.ss.android.ugc.playerkit.c.e$a r1 = r1.f125537h
            if (r1 == 0) goto L_0x04f2
            com.ss.ttvideoengine.TTVideoEngine r2 = r0.f99129c
            r5 = 473(0x1d9, float:6.63E-43)
            int r6 = r1.f125556j
            r2.setIntOption(r5, r6)
            com.ss.ttvideoengine.TTVideoEngine r2 = r0.f99129c
            r5 = 474(0x1da, float:6.64E-43)
            int r6 = r1.f125557k
            r2.setIntOption(r5, r6)
            com.ss.ttvideoengine.TTVideoEngine r2 = r0.f99129c
            r5 = 475(0x1db, float:6.66E-43)
            int r6 = r1.f125558l
            r2.setIntOption(r5, r6)
            com.ss.ttvideoengine.TTVideoEngine r2 = r0.f99129c
            r5 = 422(0x1a6, float:5.91E-43)
            int r6 = r1.f125549c
            r2.setIntOption(r5, r6)
            com.ss.ttvideoengine.TTVideoEngine r2 = r0.f99129c
            r5 = 423(0x1a7, float:5.93E-43)
            int r6 = r1.f125550d
            r2.setIntOption(r5, r6)
            com.ss.ttvideoengine.TTVideoEngine r2 = r0.f99129c
            r5 = 204(0xcc, float:2.86E-43)
            int r6 = r1.f125551e
            r2.setIntOption(r5, r6)
            com.ss.ttvideoengine.TTVideoEngine r2 = r0.f99129c
            r5 = 313(0x139, float:4.39E-43)
            int r6 = r1.f125552f
            r2.setIntOption(r5, r6)
            com.ss.ttvideoengine.TTVideoEngine r2 = r0.f99129c
            r5 = 424(0x1a8, float:5.94E-43)
            int r6 = r1.f125553g
            r2.setIntOption(r5, r6)
            com.ss.ttvideoengine.TTVideoEngine r2 = r0.f99129c
            r5 = 425(0x1a9, float:5.96E-43)
            int r6 = r1.f125554h
            r2.setIntOption(r5, r6)
            com.ss.ttvideoengine.TTVideoEngine r2 = r0.f99129c
            r5 = 427(0x1ab, float:5.98E-43)
            if (r12 == 0) goto L_0x04e6
            r3 = 1
        L_0x04e6:
            r2.setIntOption(r5, r3)
            com.ss.ttvideoengine.TTVideoEngine r2 = r0.f99129c
            r3 = 471(0x1d7, float:6.6E-43)
            int r1 = r1.f125555i
            r2.setIntOption(r3, r1)
        L_0x04f2:
            com.ss.android.ugc.playerkit.c.e r1 = r0.f99134h
            com.ss.android.ugc.playerkit.c.e$b r1 = r1.f125540k
            if (r1 == 0) goto L_0x0533
            if (r16 == 0) goto L_0x0533
            java.lang.String r2 = r1.f125559a
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0509
            com.ss.ttvideoengine.TTVideoEngine r3 = r0.f99129c
            java.lang.String r4 = "cookie"
            r3.setCustomHeader(r4, r2)
        L_0x0509:
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f125560b
            if (r1 == 0) goto L_0x0533
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x0533
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x051b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0533
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            com.ss.ttvideoengine.TTVideoEngine r5 = r0.f99129c
            r5.setCustomHeader(r3, r4)
            goto L_0x051b
        L_0x0533:
            r17.m86671r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.player.sdk.impl.C38907f.m86670a(com.ss.android.ugc.playerkit.c.b, java.lang.String, java.util.Map):void");
    }

    public C38907f(Context context, boolean z, SparseIntArray sparseIntArray, SparseArray sparseArray, C50113e eVar) {
        this.f99121K = -1.0f;
        this.f99126P = new VideoEngineListener() {
            public final void onPrepare(TTVideoEngine tTVideoEngine) {
                if (C38854a.f98960a) {
                    String str = TTPlayer.TAG;
                    StringBuilder sb = new StringBuilder("onPrepare() called with: engine = [");
                    sb.append(tTVideoEngine);
                    sb.append("]");
                    C38854a.m86290a(str, sb.toString());
                }
            }

            public final void onCompletion(TTVideoEngine tTVideoEngine) {
                if (C38854a.f98960a) {
                    String str = TTPlayer.TAG;
                    StringBuilder sb = new StringBuilder("onCompletion() called with: engine = [");
                    sb.append(tTVideoEngine);
                    sb.append("]");
                    C38854a.m86290a(str, sb.toString());
                }
                C38907f.this.f99139n.mo78878c();
            }

            public final void onError(Error error) {
                if (C38854a.f98960a) {
                    String str = TTPlayer.TAG;
                    StringBuilder sb = new StringBuilder("onError() called with: error = [");
                    sb.append(error);
                    sb.append("]");
                    C38854a.m86290a(str, sb.toString());
                }
                if (Thread.currentThread().getId() != C38907f.this.f99128b) {
                    Exception exc = new Exception();
                    StringBuilder sb2 = new StringBuilder("onError thread not match, error:");
                    sb2.append(error);
                    C9220a.m18312a((Throwable) exc, sb2.toString());
                }
                C38907f.this.f99139n.mo78873a(error.code, error.internalCode, error);
            }

            public final void onPrepared(TTVideoEngine tTVideoEngine) {
                if (C38854a.f98960a) {
                    String str = TTPlayer.TAG;
                    StringBuilder sb = new StringBuilder("onPrepared() called with: engine = [");
                    sb.append(tTVideoEngine);
                    sb.append("]");
                    C38854a.m86290a(str, sb.toString());
                }
                C38907f.this.f99139n.mo78872a();
                if (TextUtils.isEmpty(C38907f.this.f99132f) && C38907f.this.f99129c != null) {
                    C38907f.this.f99132f = C38907f.this.f99129c.getCurrentPlayPath();
                }
                if (C38907f.this.f99136j) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - C38907f.this.f99137k;
                    if (C38907f.this.f99141q != null) {
                        C38907f.this.f99141q.mo78884d(elapsedRealtime);
                    }
                    return;
                }
                if (C38907f.f99108l) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - C38907f.this.f99138m;
                    if (C38907f.this.f99142r != null) {
                        C38907f.this.f99142r.mo78832a(elapsedRealtime2);
                    }
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0022  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onVideoStatusException(int r7) {
                /*
                    r6 = this;
                    r0 = 20
                    if (r7 == r0) goto L_0x001c
                    r0 = 30
                    if (r7 == r0) goto L_0x001c
                    r0 = 40
                    if (r7 == r0) goto L_0x0019
                    r0 = 1000(0x3e8, float:1.401E-42)
                    if (r7 == r0) goto L_0x001c
                    r0 = 1002(0x3ea, float:1.404E-42)
                    if (r7 == r0) goto L_0x0019
                    switch(r7) {
                        case 3: goto L_0x001c;
                        case 4: goto L_0x001c;
                        default: goto L_0x0017;
                    }
                L_0x0017:
                    r0 = 0
                    goto L_0x001e
                L_0x0019:
                    java.lang.String r0 = "视频已删除，无法播放"
                    goto L_0x001e
                L_0x001c:
                    java.lang.String r0 = "转码中，视频暂时无法播放"
                L_0x001e:
                    boolean r1 = com.p683ss.android.ugc.aweme.player.sdk.C38854a.f98960a
                    if (r1 == 0) goto L_0x003a
                    java.lang.String r1 = "TTPlayer"
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "onVideoStatusException() called with: status = ["
                    r2.<init>(r3)
                    r2.append(r7)
                    java.lang.String r3 = "]"
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    com.p683ss.android.ugc.aweme.player.sdk.C38854a.m86290a(r1, r2)
                L_0x003a:
                    java.lang.Thread r1 = java.lang.Thread.currentThread()
                    long r1 = r1.getId()
                    com.ss.android.ugc.aweme.player.sdk.impl.f r3 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38907f.this
                    long r3 = r3.f99128b
                    int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r5 == 0) goto L_0x0060
                    java.lang.Exception r1 = new java.lang.Exception
                    r1.<init>()
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "onVideoStatusException thread not match, status:"
                    r2.<init>(r3)
                    r2.append(r7)
                    java.lang.String r7 = r2.toString()
                    com.bytedance.p502b.p503a.p506b.p508b.C9220a.m18312a(r1, r7)
                L_0x0060:
                    com.ss.android.ugc.aweme.player.sdk.impl.f r7 = com.p683ss.android.ugc.aweme.player.sdk.impl.C38907f.this
                    com.ss.android.ugc.aweme.player.sdk.a.e$c r7 = r7.f99139n
                    r1 = 0
                    r7.mo78873a(r1, r1, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.player.sdk.impl.C38907f.C389081.onVideoStatusException(int):void");
            }

            public final void onRenderStart(TTVideoEngine tTVideoEngine) {
                if (!C38907f.this.f99131e) {
                    if (C38907f.this.f99129c != null) {
                        C38907f.this.f99036a.f98970a = C38907f.this.f99129c.getIntOption(43);
                        C38907f.this.f99036a.f98971b = C38907f.this.f99129c.getIntOption(45);
                        C38907f.this.f99036a.f98972c = C38907f.this.f99129c.getIntOption(47);
                    }
                    if (C38907f.this.f99136j) {
                        C38907f.this.f99136j = false;
                        long elapsedRealtime = SystemClock.elapsedRealtime() - C38907f.this.f99137k;
                        if (C38907f.this.f99141q != null) {
                            C38907f.this.f99141q.mo78885e(elapsedRealtime);
                        }
                    } else if (C38907f.f99108l) {
                        C38907f.f99108l = false;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - C38907f.this.f99138m;
                        if (C38907f.this.f99142r != null) {
                            C38907f.this.f99142r.mo78833b(elapsedRealtime2);
                        }
                    }
                    C38907f.this.f99139n.mo78877b();
                }
            }

            public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
                if (C38854a.f98960a) {
                    String str = TTPlayer.TAG;
                    StringBuilder sb = new StringBuilder("onStreamChanged() called with: type = [");
                    sb.append(i);
                    sb.append("]");
                    C38854a.m86290a(str, sb.toString());
                }
            }

            public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
                if (C38854a.f98960a) {
                    String str = TTPlayer.TAG;
                    StringBuilder sb = new StringBuilder("onBufferingUpdate() called with: engine = [");
                    sb.append(tTVideoEngine);
                    sb.append("], percent = [");
                    sb.append(i);
                    sb.append("]");
                    C38854a.m86290a(str, sb.toString());
                }
                C38907f.this.f99139n.mo78874a((long) (((float) C38907f.this.mo78866l()) * (((float) i) / 100.0f)));
            }

            public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
                if (C38854a.f98960a) {
                    String str = TTPlayer.TAG;
                    StringBuilder sb = new StringBuilder("onPlaybackStateChanged() called with: engine = [");
                    sb.append(tTVideoEngine);
                    sb.append("], playbackState = [");
                    sb.append(i);
                    sb.append("]");
                    C38854a.m86290a(str, sb.toString());
                }
            }

            public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
                if (C38854a.f98960a) {
                    String str = TTPlayer.TAG;
                    StringBuilder sb = new StringBuilder("onLoadStateChanged() called with: engine = [");
                    sb.append(tTVideoEngine);
                    sb.append("], loadState = [");
                    sb.append(i);
                    sb.append("]");
                    C38854a.m86290a(str, sb.toString());
                }
                if (C38907f.this.f99134h != null && !C38907f.this.f99134h.f125541l) {
                    if (i == 2) {
                        C38907f.this.f99139n.mo78876a(true);
                    } else if (i == 1) {
                        C38907f.this.f99139n.mo78876a(false);
                    }
                }
            }

            public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
                if (C38854a.f98960a) {
                    String str = TTPlayer.TAG;
                    StringBuilder sb = new StringBuilder("onVideoSizeChanged() called with: engine = [");
                    sb.append(tTVideoEngine);
                    sb.append("], width = [");
                    sb.append(i);
                    sb.append("], height = [");
                    sb.append(i2);
                    sb.append("]");
                    C38854a.m86290a(str, sb.toString());
                }
                C38907f.this.f99036a.f98973d = i;
                C38907f.this.f99036a.f98974e = i2;
            }
        };
        this.f99139n = new C38860a();
        this.f99143t = context;
        this.f99147x = z;
        this.f99111A = sparseIntArray;
        this.f99130d = sparseArray;
        this.f99144u = C38872a.m86414a();
        this.f99145v = C38872a.m86417b();
        this.f99128b = Thread.currentThread().getId();
        this.f99146w = new AtomicReference<>(null);
        this.f99134h = eVar;
        this.f99122L = new PlaybackParams();
        m86672s();
    }
}
