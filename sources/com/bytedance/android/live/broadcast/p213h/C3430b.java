package com.bytedance.android.live.broadcast.p213h;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceView;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.api.p196c.C3049b;
import com.bytedance.android.live.broadcast.p213h.p216b.C3440b;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.livepullstream.p249a.C4134a.C4135a;
import com.bytedance.android.live.livepullstream.p249a.C4136b;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.p683ss.avframework.livestreamv2.ILiveStream.CatchVideoCallback;
import com.p683ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener;
import com.p683ss.avframework.livestreamv2.ILiveStream.ILiveStreamInfoListener;
import com.p683ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener;
import com.p683ss.avframework.livestreamv2.LiveStreamReport;
import com.p683ss.avframework.livestreamv2.core.Client;
import com.p683ss.avframework.livestreamv2.core.LiveCore;
import com.p683ss.avframework.livestreamv2.core.LiveCore.Builder;
import com.p683ss.avframework.livestreamv2.core.LiveCore.Builder.ILogMonitor;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.avframework.livestreamv2.filter.IFilterManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.broadcast.h.b */
public final class C3430b implements C3048a {

    /* renamed from: k */
    public static final C3432a f9757k = new C3432a(null);

    /* renamed from: q */
    private static final float[] f9758q = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a */
    public ILiveStreamErrorListener f9759a;

    /* renamed from: b */
    public ILiveStreamInfoListener f9760b;

    /* renamed from: c */
    public final Map<String, String> f9761c = new ConcurrentHashMap();

    /* renamed from: d */
    public LiveCore f9762d;

    /* renamed from: e */
    public C3049b f9763e;

    /* renamed from: f */
    public int f9764f = -1;

    /* renamed from: g */
    public boolean f9765g;

    /* renamed from: h */
    public long f9766h;

    /* renamed from: i */
    public final Handler f9767i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    public final C3441c f9768j;

    /* renamed from: l */
    private boolean f9769l;

    /* renamed from: m */
    private boolean f9770m;

    /* renamed from: n */
    private final Runnable f9771n = new C3433b(this);

    /* renamed from: o */
    private final ILiveStreamErrorListener f9772o = new C3435d(this);

    /* renamed from: p */
    private final ILiveStreamInfoListener f9773p = new C3437e(this);

    /* renamed from: com.bytedance.android.live.broadcast.h.b$a */
    public static final class C3432a {
        private C3432a() {
        }

        public /* synthetic */ C3432a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.h.b$b */
    static final class C3433b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3430b f9775a;

        C3433b(C3430b bVar) {
            this.f9775a = bVar;
        }

        public final void run() {
            this.f9775a.f9764f = 2;
            this.f9775a.mo8293a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.h.b$c */
    static final class C3434c implements ILogMonitor {

        /* renamed from: a */
        final /* synthetic */ C3430b f9776a;

        C3434c(C3430b bVar) {
            this.f9776a = bVar;
        }

        public final void onLogMonitor(String str, JSONObject jSONObject) {
            for (String str2 : this.f9776a.f9761c.keySet()) {
                if (jSONObject != null) {
                    try {
                        jSONObject.put(str2, this.f9776a.f9761c.get(str2));
                    } catch (JSONException unused) {
                    }
                }
            }
            C2952b a = C4116c.m10249a(C4139d.class);
            C52711k.m112236a((Object) a, "ServiceManager.getServic…treamService::class.java)");
            C4136b gpuInfoFetcher = ((C4139d) a).getGpuInfoFetcher();
            if (gpuInfoFetcher != null) {
                String a2 = gpuInfoFetcher.mo9525a(this.f9776a.f9768j.f9794a);
                if (!(a2 == null || jSONObject == null)) {
                    jSONObject.put("gpu_name", a2);
                }
            }
            this.f9776a.f9768j.f9811r.mo8496a(str, jSONObject);
            if (this.f9776a.f9763e != null && this.f9776a.f9762d != null) {
                LiveStreamReport liveStreamReport = new LiveStreamReport();
                LiveCore liveCore = this.f9776a.f9762d;
                if (liveCore == null) {
                    C52711k.m112234a();
                }
                if (liveCore.getLiveStreamInfo(liveStreamReport)) {
                    C3049b bVar = this.f9776a.f9763e;
                    if (bVar != null) {
                        bVar.mo8311a(((float) liveStreamReport.getVideoTransportRealBps()) / 1000.0f);
                    }
                }
                liveStreamReport.release();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.h.b$d */
    static final class C3435d implements ILiveStreamErrorListener {

        /* renamed from: a */
        final /* synthetic */ C3430b f9777a;

        C3435d(C3430b bVar) {
            this.f9777a = bVar;
        }

        public final void onError(int i, int i2, Exception exc) {
            this.f9777a.f9767i.post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C3435d f9778a;

                {
                    this.f9778a = r1;
                }

                public final void run() {
                    if (this.f9778a.f9777a.f9764f == -1) {
                        this.f9778a.f9777a.f9764f = 3;
                    }
                    if (this.f9778a.f9777a.f9763e != null) {
                        this.f9778a.f9777a.mo8813a(this.f9778a.f9777a.f9764f);
                    }
                    this.f9778a.f9777a.f9764f = -1;
                }
            });
            C3440b bVar = this.f9777a.f9768j.f9813t;
            StringBuilder sb = new StringBuilder("code1:");
            sb.append(i);
            sb.append(",code2:");
            sb.append(i2);
            bVar.mo8497a(sb.toString(), exc);
            ILiveStreamErrorListener iLiveStreamErrorListener = this.f9777a.f9759a;
            if (iLiveStreamErrorListener != null) {
                iLiveStreamErrorListener.onError(i, i2, exc);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.h.b$e */
    static final class C3437e implements ILiveStreamInfoListener {

        /* renamed from: a */
        final /* synthetic */ C3430b f9779a;

        C3437e(C3430b bVar) {
            this.f9779a = bVar;
        }

        public final void onInfo(final int i, int i2, int i3) {
            this.f9779a.f9767i.post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C3437e f9780a;

                {
                    this.f9780a = r1;
                }

                public final void run() {
                    int i = i;
                    if (i == 11) {
                        if (this.f9780a.f9779a.f9765g) {
                            this.f9780a.f9779a.f9765g = false;
                            C3049b bVar = this.f9780a.f9779a.f9763e;
                            if (bVar != null) {
                                bVar.mo8315f();
                            }
                        }
                        if (System.currentTimeMillis() - this.f9780a.f9779a.f9766h > 5000) {
                            this.f9780a.f9779a.f9766h = System.currentTimeMillis();
                        }
                    } else if (i != 13) {
                        if (i != 15) {
                            switch (i) {
                                case 2:
                                    C3049b bVar2 = this.f9780a.f9779a.f9763e;
                                    if (bVar2 != null) {
                                        bVar2.mo8313d();
                                        break;
                                    } else {
                                        return;
                                    }
                                case 3:
                                    if (this.f9780a.f9779a.f9764f != -1) {
                                        this.f9780a.f9779a.mo8813a(this.f9780a.f9779a.f9764f);
                                        this.f9780a.f9779a.f9764f = -1;
                                        return;
                                    }
                                    return;
                            }
                        } else {
                            this.f9780a.f9779a.f9765g = true;
                            C3049b bVar3 = this.f9780a.f9779a.f9763e;
                            if (bVar3 != null) {
                                bVar3.mo8314e();
                            }
                        }
                    } else if (System.currentTimeMillis() - this.f9780a.f9779a.f9766h > 5000) {
                        this.f9780a.f9779a.f9766h = System.currentTimeMillis();
                    }
                }
            });
            StringBuilder sb = new StringBuilder("INFO (");
            sb.append(i);
            sb.append(',');
            sb.append(i2);
            sb.append(',');
            sb.append(i3);
            sb.append(") ");
            String sb2 = sb.toString();
            switch (i) {
                case 1:
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("starting_publish");
                    sb3.toString();
                    break;
                case 2:
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb2);
                    sb4.append("started_publish");
                    sb4.toString();
                    break;
                case 3:
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(sb2);
                    sb5.append("stoped_publish");
                    sb5.toString();
                    break;
                case 4:
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sb2);
                    sb6.append("video_starting_capture");
                    sb6.toString();
                    break;
                case 5:
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(sb2);
                    sb7.append("video_started_capture");
                    sb7.toString();
                    break;
                case 6:
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(sb2);
                    sb8.append("video_stoped_capture");
                    sb8.toString();
                    break;
                case 7:
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(sb2);
                    sb9.append("audio_starting_capture");
                    sb9.toString();
                    break;
                case 8:
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(sb2);
                    sb10.append("audio_started_capture");
                    sb10.toString();
                    break;
                case 9:
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(sb2);
                    sb11.append("audio_stoped_capture");
                    sb11.toString();
                    break;
                case 10:
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(sb2);
                    sb12.append("rtmp_connecting");
                    sb12.toString();
                    break;
                case 11:
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append(sb2);
                    sb13.append("rtmp_connected");
                    sb13.toString();
                    break;
                case 12:
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append(sb2);
                    sb14.append("rtmp_connect_fail");
                    sb14.toString();
                    break;
                case 13:
                    StringBuilder sb15 = new StringBuilder();
                    sb15.append(sb2);
                    sb15.append("network too weak");
                    sb15.toString();
                    break;
                case 14:
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append(sb2);
                    sb16.append("rtmp_disconnected");
                    sb16.toString();
                    break;
                case 15:
                    StringBuilder sb17 = new StringBuilder();
                    sb17.append(sb2);
                    sb17.append("rtmp_reconnecting");
                    sb17.toString();
                    break;
                case 16:
                    StringBuilder sb18 = new StringBuilder();
                    sb18.append(sb2);
                    sb18.append("video_encoder_format_changed");
                    sb18.toString();
                    break;
                default:
                    StringBuilder sb19 = new StringBuilder();
                    sb19.append(sb2);
                    sb19.append("UNKONW???");
                    sb19.toString();
                    break;
            }
            ILiveStreamInfoListener iLiveStreamInfoListener = this.f9779a.f9760b;
            if (iLiveStreamInfoListener != null) {
                iLiveStreamInfoListener.onInfo(i, i2, i3);
            }
        }
    }

    /* renamed from: a */
    public final void mo8300a(List<String> list) {
        if (list == null || list.size() <= 0) {
            mo8299a(this.f9768j.f9795b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String b : list) {
            String b2 = m9238b(b);
            if (b2 == null) {
                C52711k.m112234a();
            }
            arrayList.add(b2);
        }
        m9239j();
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            liveCore.start((List<String>) arrayList);
        }
    }

    /* renamed from: a */
    public final void mo8301a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            liveCore.pushVideoFrame(i, false, i3, i4, NormalGiftView.ALPHA_180, f9758q, j * 1000);
        }
    }

    /* renamed from: a */
    public final void mo8302a(boolean z) {
        this.f9769l = z;
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            liveCore.setAudioMute(z);
        }
    }

    /* renamed from: j */
    private final void m9239j() {
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            liveCore.startAudioCapture();
        }
    }

    /* renamed from: e */
    public final void mo8306e() {
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            liveCore.startVideoCapture();
        }
    }

    /* renamed from: f */
    public final void mo8307f() {
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            liveCore.stopVideoCapture();
        }
    }

    /* renamed from: g */
    public final IFilterManager mo8308g() {
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            return liveCore.getVideoFilterMgr();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo8293a() {
        if (this.f9764f != 2) {
            this.f9764f = 0;
        }
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            liveCore.stop();
        }
        LiveCore liveCore2 = this.f9762d;
        if (liveCore2 != null) {
            liveCore2.stopAudioCapture();
        }
    }

    /* renamed from: b */
    public final void mo8303b() {
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            liveCore.resume();
        }
        LiveCore liveCore2 = this.f9762d;
        if (liveCore2 != null) {
            liveCore2.setAudioMute(this.f9769l);
        }
        this.f9767i.removeCallbacks(this.f9771n);
    }

    /* renamed from: c */
    public final void mo8304c() {
        this.f9767i.postDelayed(this.f9771n, this.f9768j.f9808o);
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            liveCore.setAudioMute(true);
        }
        LiveCore liveCore2 = this.f9762d;
        if (liveCore2 != null) {
            liveCore2.pause();
        }
    }

    /* renamed from: h */
    public final void mo8309h() {
        this.f9770m = !this.f9770m;
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            liveCore.enableMirror(this.f9770m, true);
        }
    }

    /* renamed from: i */
    public final void mo8310i() {
        LiveCore liveCore = this.f9762d;
        int i = 1;
        if (liveCore != null) {
            Builder builder = liveCore.getBuilder();
            if (builder != null && builder.getVideoCaptureDevice() == 1) {
                i = 2;
            }
        }
        LiveCore liveCore2 = this.f9762d;
        if (liveCore2 != null) {
            liveCore2.switchVideoCapture(i);
        }
    }

    /* renamed from: d */
    public final void mo8305d() {
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            liveCore.enableMixer(true, false);
        }
        LiveCore liveCore2 = this.f9762d;
        if (liveCore2 != null) {
            liveCore2.enableMixer(false, false);
        }
        LiveCore liveCore3 = this.f9762d;
        if (liveCore3 != null) {
            liveCore3.stop();
        }
        LiveCore liveCore4 = this.f9762d;
        if (liveCore4 != null) {
            liveCore4.release();
        }
        this.f9762d = null;
        this.f9767i.removeCallbacksAndMessages(this);
        this.f9763e = null;
    }

    /* renamed from: a */
    public final void mo8296a(C3049b bVar) {
        this.f9763e = bVar;
    }

    /* renamed from: a */
    public final void mo8297a(ILiveStreamErrorListener iLiveStreamErrorListener) {
        C52711k.m112240b(iLiveStreamErrorListener, "listener");
        this.f9759a = iLiveStreamErrorListener;
    }

    /* renamed from: a */
    public final void mo8813a(int i) {
        this.f9767i.removeCallbacksAndMessages(this);
        C3049b bVar = this.f9763e;
        if (bVar != null) {
            bVar.mo8312a(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m9238b(java.lang.String r5) {
        /*
            if (r5 == 0) goto L_0x009d
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r0 = "/"
            d.m.l r1 = new d.m.l
            r1.<init>(r0)
            r0 = 0
            java.util.List r5 = r1.split(r5, r0)
            boolean r1 = r5.isEmpty()
            r2 = 1
            if (r1 != 0) goto L_0x0044
            int r1 = r5.size()
            java.util.ListIterator r1 = r5.listIterator(r1)
        L_0x001f:
            boolean r3 = r1.hasPrevious()
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r1.previous()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0035
            r3 = 1
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            if (r3 != 0) goto L_0x001f
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            int r1 = r1.nextIndex()
            int r1 = r1 + r2
            java.util.List r5 = p2628d.p2629a.C52575l.m112129b(r5, r1)
            goto L_0x0048
        L_0x0044:
            java.util.List r5 = p2628d.p2629a.C52575l.m112097a()
        L_0x0048:
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x0095
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.Object[] r5 = r5.toArray(r1)
            if (r5 == 0) goto L_0x008d
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            int r3 = r5.length
            r4 = 2
            if (r3 < r4) goto L_0x006f
            int r3 = r5.length     // Catch:{ UnsupportedEncodingException -> 0x006f }
            int r3 = r3 - r2
            r3 = r5[r3]     // Catch:{ UnsupportedEncodingException -> 0x006f }
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch:{ UnsupportedEncodingException -> 0x006f }
            java.lang.String r4 = "URLEncoder.encode(urlPar…Parts.size - 1], \"UTF-8\")"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ UnsupportedEncodingException -> 0x006f }
            r1 = r3
        L_0x006f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r5.length
            int r4 = r4 - r2
        L_0x0076:
            if (r0 >= r4) goto L_0x0085
            r2 = r5[r0]
            r3.append(r2)
            java.lang.String r2 = "/"
            r3.append(r2)
            int r0 = r0 + 1
            goto L_0x0076
        L_0x0085:
            r3.append(r1)
            java.lang.String r5 = r3.toString()
            goto L_0x009e
        L_0x008d:
            d.u r5 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r5.<init>(r0)
            throw r5
        L_0x0095:
            d.u r5 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type java.util.Collection<T>"
            r5.<init>(r0)
            throw r5
        L_0x009d:
            r5 = 0
        L_0x009e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.p213h.C3430b.m9238b(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final void mo8295a(SurfaceView surfaceView) {
        C52711k.m112240b(surfaceView, "surfaceView");
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            liveCore.setDisplay(surfaceView);
        }
    }

    public C3430b(C3441c cVar) {
        int i;
        String str;
        C52711k.m112240b(cVar, "config");
        this.f9768j = cVar;
        C2952b a = C4116c.m10249a(C4139d.class);
        C52711k.m112236a((Object) a, "ServiceManager.getServic…treamService::class.java)");
        String a2 = ((C4139d) a).getCpuInfoFetcher().mo9523a();
        if (a2 != null) {
            this.f9761c.put("cpu_soc", a2);
        } else {
            C2952b a3 = C4116c.m10249a(C4139d.class);
            C52711k.m112236a((Object) a3, "ServiceManager.getServic…treamService::class.java)");
            ((C4139d) a3).getCpuInfoFetcher().mo9524a(new C4135a(this) {

                /* renamed from: a */
                final /* synthetic */ C3430b f9774a;

                {
                    this.f9774a = r1;
                }

                /* renamed from: a */
                public final void mo8814a(String str) {
                    C52711k.m112236a((Object) str, "it");
                    this.f9774a.f9761c.put("cpu_soc", str);
                }
            });
        }
        Builder builder = new Builder();
        builder.setUsingEffectCamera(false);
        builder.setEnableVideoEncodeAccelera(this.f9768j.f9805l);
        builder.setVideoProfile(this.f9768j.f9806m);
        builder.setLogMonitor(new C3434c(this));
        builder.setContext(this.f9768j.f9794a);
        builder.setProjectKey(this.f9768j.f9787F);
        builder.setUploadLogInterval(5000);
        builder.setVideoFps(this.f9768j.f9800g);
        builder.setVideoBitrate(this.f9768j.f9797d * 1000);
        builder.setVideoMaxBitrate(this.f9768j.f9799f * 1000);
        builder.setVideoMinBitrate(this.f9768j.f9798e * 1000);
        builder.setVideoWidth(this.f9768j.f9803j);
        builder.setVideoHeight(this.f9768j.f9804k);
        builder.setVideoCaptureDevice(this.f9768j.f9815v);
        C4097p<Boolean> pVar = LiveConfigSettingKeys.LIVE_ENABLE_VE_CAMERA2;
        C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.LIVE_ENABLE_VE_CAMERA2");
        Object a4 = pVar.mo9431a();
        C52711k.m112236a(a4, "LiveConfigSettingKeys.LIVE_ENABLE_VE_CAMERA2.value");
        builder.setUsingVECamera2API(((Boolean) a4).booleanValue());
        builder.setAudioChannel(2);
        builder.setAudioProfile(this.f9768j.f9810q);
        if (this.f9768j.f9810q == 1) {
            i = 128000;
        } else {
            i = 64000;
        }
        builder.setAudioBitrate(i);
        builder.setAudioCaptureChannel(2);
        builder.setAudioSampleHZ(this.f9768j.f9809p);
        builder.setAudioCaptureDevice(this.f9768j.f9816w);
        builder.setUsingLiveStreamAudioCapture(this.f9768j.f9786E);
        builder.setRtmpReconnectCounts(this.f9768j.f9807n);
        builder.setRtmpReconnectIntervalSeconds(5);
        builder.setVideoEncoder(this.f9768j.f9782A);
        builder.setEnableVideoBFrame(this.f9768j.f9819z);
        builder.setVideoGopSec(this.f9768j.f9818y);
        builder.setBitrateAdaptStrategy(this.f9768j.f9817x);
        builder.setRoiOn(this.f9768j.f9783B ? 1 : 0, true);
        builder.setRoiOn(this.f9768j.f9784C ? 1 : 0, false);
        if (this.f9768j.f9785D == null) {
            str = "";
        } else {
            str = this.f9768j.f9785D;
        }
        builder.setRoiAssetDir(str);
        builder.setBgMode(this.f9768j.f9793L);
        builder.setupSdkParams(this.f9768j.f9788G);
        builder.setAssetManager(this.f9768j.f9789H);
        builder.setEffectModePath(this.f9768j.f9791J);
        builder.setEffectResourceFinder(this.f9768j.f9790I);
        builder.setVideoCaptureWidth(this.f9768j.f9801h);
        builder.setVideoCaptureHeight(this.f9768j.f9802i);
        builder.setEffectAlgorithmAB(this.f9768j.f9792K);
        C4097p<Boolean> pVar2 = LiveConfigSettingKeys.LIVE_ENABLE_FORCE_GL_FINISH;
        C52711k.m112236a((Object) pVar2, "LiveConfigSettingKeys.LIVE_ENABLE_FORCE_GL_FINISH");
        Object a5 = pVar2.mo9431a();
        C52711k.m112236a(a5, "LiveConfigSettingKeys.LI…BLE_FORCE_GL_FINISH.value");
        builder.setEnableForceGlFinish(((Boolean) a5).booleanValue());
        C4097p<Boolean> pVar3 = LiveConfigSettingKeys.LIVE_ENABLE_EFFECT_NEW_ENGINE;
        C52711k.m112236a((Object) pVar3, "LiveConfigSettingKeys.LI…_ENABLE_EFFECT_NEW_ENGINE");
        Object a6 = pVar3.mo9431a();
        C52711k.m112236a(a6, "LiveConfigSettingKeys.LI…E_EFFECT_NEW_ENGINE.value");
        builder.setUseNewEffectEngine(((Boolean) a6).booleanValue());
        C4097p<String> pVar4 = LiveConfigSettingKeys.LIVE_EFFECT_NEW_ENGINE_CONFIG;
        C52711k.m112236a((Object) pVar4, "LiveConfigSettingKeys.LI…_EFFECT_NEW_ENGINE_CONFIG");
        builder.setEffectPlatformConfig((String) pVar4.mo9431a());
        StringBuilder sb = new StringBuilder("builder.isEnableForceGlFinish: ");
        sb.append(builder.isEnableForceGlFinish());
        C3831a.m9716d("LiveStream4", sb.toString());
        if (this.f9768j.f9814u != null) {
            builder.setScreenCaptureIntent(this.f9768j.f9814u);
        }
        this.f9762d = builder.create();
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            liveCore.setErrorListener(this.f9772o);
        }
        LiveCore liveCore2 = this.f9762d;
        if (liveCore2 != null) {
            liveCore2.setInfoListener(this.f9773p);
        }
        LiveCore liveCore3 = this.f9762d;
        if (liveCore3 != null) {
            liveCore3.enableMixer(true, true);
        }
        LiveCore liveCore4 = this.f9762d;
        if (liveCore4 != null) {
            liveCore4.enableMixer(false, true);
        }
        this.f9761c.put("rtmp_type", String.valueOf(this.f9768j.f9796c));
    }

    /* renamed from: a */
    public final void mo8298a(ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        C52711k.m112240b(iTextureFrameAvailableListener, "listener");
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            liveCore.addTextureFrameAvailableListener(iTextureFrameAvailableListener);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 != false) goto L_0x0010;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8299a(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0010
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0014
        L_0x0010:
            com.bytedance.android.live.broadcast.h.c r2 = r1.f9768j
            java.lang.String r2 = r2.f9795b
        L_0x0014:
            r1.m9239j()
            com.ss.avframework.livestreamv2.core.LiveCore r0 = r1.f9762d
            if (r0 == 0) goto L_0x0023
            java.lang.String r2 = m9238b(r2)
            r0.start(r2)
            return
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.p213h.C3430b.mo8299a(java.lang.String):void");
    }

    /* renamed from: a */
    public final /* synthetic */ Client mo8292a(InteractConfig interactConfig, Boolean bool) {
        return mo8812a(interactConfig, bool.booleanValue());
    }

    /* renamed from: a */
    public final Client mo8812a(InteractConfig interactConfig, boolean z) {
        C52711k.m112240b(interactConfig, "config");
        C2952b a = C4116c.m10249a(IHostContext.class);
        C52711k.m112236a((Object) a, "ServiceManager.getServic…IHostContext::class.java)");
        interactConfig.setAppChannel(((IHostContext) a).getChannel());
        C2952b a2 = C4116c.m10249a(IHostContext.class);
        C52711k.m112236a((Object) a2, "ServiceManager.getServic…IHostContext::class.java)");
        interactConfig.setDeviceId(((IHostContext) a2).getServerDeviceId());
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            return liveCore.create(interactConfig, z);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo8294a(Bundle bundle, CatchVideoCallback catchVideoCallback) {
        C52711k.m112240b(bundle, "bundle");
        C52711k.m112240b(catchVideoCallback, "callback");
        LiveCore liveCore = this.f9762d;
        if (liveCore != null) {
            liveCore.catchVideo(bundle, catchVideoCallback);
        }
    }
}
