package com.p683ss.android.ugc.aweme.commercialize.splash.livesplash;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.common.applog.GlobalContext;
import com.p683ss.android.p1103ad.splash.p1111c.C18559a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26426bk;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.livesplash.e */
public class C26237e implements C26230a {

    /* renamed from: a */
    public static volatile boolean f69272a;

    /* renamed from: b */
    public static C26231b f69273b;

    /* renamed from: i */
    private static volatile C26237e f69274i;

    /* renamed from: j */
    private static String f69275j;

    /* renamed from: c */
    public boolean f69276c;

    /* renamed from: d */
    public boolean f69277d = true;

    /* renamed from: e */
    public Aweme f69278e;

    /* renamed from: f */
    public String f69279f;

    /* renamed from: g */
    public boolean f69280g;

    /* renamed from: h */
    public boolean f69281h = true;

    /* renamed from: k */
    private boolean f69282k = true;

    /* renamed from: l */
    private boolean f69283l;

    /* renamed from: m */
    private boolean f69284m;

    /* renamed from: c */
    public final void mo53890c() {
        this.f69278e = null;
    }

    /* renamed from: f */
    private static boolean m63582f() {
        return TimeLockRuler.isTeenModeON();
    }

    private C26237e() {
    }

    /* renamed from: e */
    public static boolean m63581e() {
        if (f69273b != null) {
            return f69273b.mo53886c();
        }
        return false;
    }

    /* renamed from: b */
    public static C26237e m63579b() {
        if (f69274i == null) {
            synchronized (C26237e.class) {
                if (f69274i == null) {
                    Context context = GlobalContext.getContext();
                    StringBuilder sb = new StringBuilder();
                    sb.append(Environment.getExternalStorageDirectory().getPath());
                    sb.append("/Android/data/");
                    sb.append(context.getPackageName());
                    sb.append("/liveSplashCache/");
                    f69275j = sb.toString();
                    f69273b = new C26231b(f69275j);
                    f69274i = new C26237e();
                }
            }
        }
        return f69274i;
    }

    /* renamed from: a */
    public final String mo53880a() {
        if (f69273b == null || m63581e()) {
            return null;
        }
        C26231b bVar = f69273b;
        StringBuilder sb = new StringBuilder();
        for (Aweme aweme : bVar.mo53883a().values()) {
            if (!C26235d.m63574e(aweme) && C26231b.m63559a(aweme)) {
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(",");
                }
                sb.append(aweme.getAid());
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53891d() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()
            java.lang.Boolean r0 = r0.getEnableLiveSplash()
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r0 = m63582f()
            if (r0 == 0) goto L_0x0017
            return r1
        L_0x0017:
            boolean r0 = m63581e()
            if (r0 == 0) goto L_0x001e
            return r1
        L_0x001e:
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.b r0 = f69273b
            com.bytedance.keva.Keva r2 = r0.f69264a
            r3 = 1
            if (r2 == 0) goto L_0x005c
            com.bytedance.keva.Keva r0 = r0.f69264a
            java.lang.String r2 = "live_awesome_splash_last_show_time"
            r4 = 0
            long r6 = r0.getLong(r2, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x005c
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            r0.setTime(r2)
            r2 = 11
            r0.set(r2, r1)
            r2 = 12
            r0.set(r2, r1)
            r2 = 13
            r0.set(r2, r1)
            java.util.Date r0 = r0.getTime()
            long r4 = r0.getTime()
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x005c
            r0 = 1
            goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = "livesdk_topview_show_failed"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "ad_show_fail_type"
            java.lang.String r4 = "12"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r2)
            return r1
        L_0x0073:
            com.ss.android.ugc.aweme.app.AwemeAppData r0 = com.p683ss.android.ugc.aweme.app.AwemeAppData.m47851a()
            boolean r0 = r0.f61129g
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = "livesdk_topview_show_failed"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "ad_show_fail_type"
            java.lang.String r4 = "13"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r2)
            return r1
        L_0x008f:
            boolean r0 = r8.f69280g
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r8.f69283l
            if (r0 != 0) goto L_0x00ab
            java.lang.String r0 = "livesdk_topview_show_failed"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "ad_show_fail_type"
            java.lang.String r4 = "13"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r2)
            return r1
        L_0x00ab:
            boolean r0 = com.p683ss.android.ugc.aweme.main.C36552cc.m82444a()
            if (r0 == 0) goto L_0x00c9
            boolean r0 = f69272a
            if (r0 != 0) goto L_0x00c9
            java.lang.String r0 = "livesdk_topview_show_failed"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "ad_show_fail_type"
            java.lang.String r4 = "9"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r2)
            return r1
        L_0x00c9:
            boolean r0 = r8.f69277d
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = "livesdk_topview_show_failed"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "ad_show_fail_type"
            java.lang.String r4 = "2"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r2)
            return r1
        L_0x00e1:
            boolean r0 = r8.f69280g
            if (r0 != 0) goto L_0x0105
            boolean r0 = r8.f69284m
            if (r0 != 0) goto L_0x0105
            com.ss.android.ugc.aweme.app.AwemeAppData r0 = com.p683ss.android.ugc.aweme.app.AwemeAppData.m47851a()
            boolean r0 = r0.f61135m
            if (r0 != 0) goto L_0x0105
            java.lang.String r0 = "livesdk_topview_show_failed"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "ad_show_fail_type"
            java.lang.String r4 = "2"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r2)
            return r1
        L_0x0105:
            boolean r0 = r8.f69276c
            if (r0 == 0) goto L_0x011d
            java.lang.String r0 = "livesdk_topview_show_failed"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "ad_show_fail_type"
            java.lang.String r4 = "2"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r2)
            return r1
        L_0x011d:
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.b r0 = f69273b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.mo53887d()
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63574e(r0)
            if (r2 == 0) goto L_0x0155
            com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData r2 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63576g(r0)
            if (r2 == 0) goto L_0x0154
            java.lang.String r3 = "livesdk_topview_show_failed"
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "anchor_id"
            long r6 = r2.uid
            com.ss.android.ugc.aweme.app.f.d r2 = r4.mo47827a(r5, r6)
            java.lang.String r4 = "topview_video_id"
            java.lang.String r0 = r0.getAid()
            com.ss.android.ugc.aweme.app.f.d r0 = r2.mo47829a(r4, r0)
            java.lang.String r2 = "ad_show_fail_type"
            java.lang.String r4 = "5"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r0)
        L_0x0154:
            return r1
        L_0x0155:
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26231b.m63559a(r0)
            if (r2 != 0) goto L_0x0187
            com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData r2 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63576g(r0)
            if (r2 == 0) goto L_0x0186
            java.lang.String r3 = "livesdk_topview_show_failed"
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "anchor_id"
            long r6 = r2.uid
            com.ss.android.ugc.aweme.app.f.d r2 = r4.mo47827a(r5, r6)
            java.lang.String r4 = "topview_video_id"
            java.lang.String r0 = r0.getAid()
            com.ss.android.ugc.aweme.app.f.d r0 = r2.mo47829a(r4, r0)
            java.lang.String r2 = "ad_show_fail_type"
            java.lang.String r4 = "1"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r0)
        L_0x0186:
            return r1
        L_0x0187:
            r8.f69278e = r0
            java.lang.String r0 = r0.getAid()
            r8.f69279f = r0
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.b r0 = f69273b
            com.bytedance.keva.Keva r1 = r0.f69264a
            if (r1 == 0) goto L_0x01a0
            com.bytedance.keva.Keva r0 = r0.f69264a
            java.lang.String r1 = "live_awesome_splash_last_show_time"
            long r4 = java.lang.System.currentTimeMillis()
            r0.storeLong(r1, r4)
        L_0x01a0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26237e.mo53891d():boolean");
    }

    /* renamed from: a */
    public final void mo53889a(Intent intent) {
        if (intent == null) {
            this.f69283l = false;
        } else {
            this.f69283l = C26426bk.m63900a(intent);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m63577a(Aweme aweme) throws Exception {
        LiveAwesomeData g = C26235d.m63576g(aweme);
        if (g != null) {
            C26890h.m65011a("livesdk_topview_start_download", C23089d.m56640a().mo47827a("anchor_id", g.uid).mo47829a("topview_video_id", aweme.getAid()).f61491a);
        }
        return null;
    }

    /* renamed from: b */
    static final /* synthetic */ Object m63580b(Aweme aweme) throws Exception {
        LiveAwesomeData g = C26235d.m63576g(aweme);
        if (g != null) {
            C26890h.m65011a("livesdk_topview_receive", C23089d.m56640a().mo47827a("anchor_id", g.uid).mo47829a("topview_video_id", aweme.getAid()).f61491a);
        }
        return null;
    }

    /* renamed from: a */
    public static void m63578a(C18559a aVar) {
        String str;
        StringBuilder sb = new StringBuilder("postSplashShowFailedLog() called with: iSplashAdModel = ");
        if (aVar == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str = "not null";
        }
        sb.append(str);
        if (aVar != null) {
            C0013i.m18a((Callable<TResult>) new C26241h<TResult>(aVar), (Executor) C26890h.m65003a());
        }
    }

    /* renamed from: a */
    public final String mo53881a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f69275j);
        sb.append(str);
        String sb2 = sb.toString();
        if (new File(sb2).exists()) {
            return sb2;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>, for r11v0, types: [java.util.List, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo53888a(java.util.List<com.p683ss.android.ugc.aweme.feed.model.Aweme> r11, final android.content.Context r12) throws java.lang.Exception {
        /*
            r10 = this;
            java.util.Iterator r0 = r11.iterator()
        L_0x0004:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0107
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r1
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.b r3 = f69273b
            if (r3 == 0) goto L_0x0023
            if (r1 != 0) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo r3 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63575f(r1)
            if (r3 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            r4 = 1
            r3.setTopViewData(r4)
        L_0x0023:
            java.lang.String r3 = "ttlive_cny_aweme_receive"
            r4 = 0
            com.p683ss.android.ugc.aweme.feed.utils.C31208r.m72883a(r1, r3, r4, r2)
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.i r3 = new com.ss.android.ugc.aweme.commercialize.splash.livesplash.i
            r3.<init>(r1)
            java.util.concurrent.ExecutorService r5 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r3, r5)
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63574e(r1)
            if (r3 != 0) goto L_0x0004
            com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo r3 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63575f(r1)
            if (r3 == 0) goto L_0x0004
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.e$1 r3 = new com.ss.android.ugc.aweme.commercialize.splash.livesplash.e$1
            r3.<init>(r1, r12)
            com.ss.android.ugc.aweme.feed.model.Video r5 = r1.getVideo()
            if (r5 == 0) goto L_0x0004
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r6 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()
            java.lang.Boolean r6 = r6.getAwesomeSplashForceUseH264()
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r5 = r5.getPlayAddrH264()
            goto L_0x0063
        L_0x005f:
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r5 = r5.getPlayAddr()
        L_0x0063:
            if (r5 == 0) goto L_0x0004
            java.lang.String r6 = r1.getAid()
            r5.setSourceId(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = f69275j
            r6.append(r7)
            java.lang.String r7 = r5.getSourceId()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.io.File r7 = new java.io.File
            r7.<init>(r6)
            boolean r6 = r7.exists()
            if (r6 != 0) goto L_0x0004
            java.util.List r6 = r5.getUrlList()
            boolean r7 = com.bytedance.common.utility.p522b.C9376b.m18558a(r6)
            if (r7 != 0) goto L_0x0004
            java.lang.Object r7 = r6.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x0004
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r6)
            r8.remove(r7)
            java.lang.String r6 = f69275j
            int r6 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48597a(r7, r6)
            com.ss.android.socialbase.downloader.downloader.Downloader r9 = com.p683ss.android.socialbase.downloader.downloader.Downloader.getInstance(r12)
            boolean r9 = r9.isDownloading(r6)
            if (r9 != 0) goto L_0x0004
            com.ss.android.socialbase.downloader.downloader.Downloader r9 = com.p683ss.android.socialbase.downloader.downloader.Downloader.getInstance(r12)
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r9.getDownloadInfo(r6)
            if (r6 == 0) goto L_0x00c7
            r6.getStatus()
        L_0x00c7:
            java.lang.String r5 = r5.getFileHash()
            java.lang.String r6 = "ttlive_cny_aweme_download"
            com.p683ss.android.ugc.aweme.feed.utils.C31208r.m72883a(r1, r6, r4, r2)
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.g r2 = new com.ss.android.ugc.aweme.commercialize.splash.livesplash.g
            r2.<init>(r1)
            java.util.concurrent.ExecutorService r6 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r2, r6)
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = com.p683ss.android.socialbase.downloader.downloader.Downloader.with(r12)
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = r2.url(r7)
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = r2.backUpUrls(r8)
            java.lang.String r6 = f69275j
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = r2.savePath(r6)
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = r2.md5(r5)
            java.lang.String r1 = r1.getAid()
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r2.name(r1)
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r1.showNotification(r4)
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r1.mainThreadListener(r3)
            r1.download()
            goto L_0x0004
        L_0x0107:
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.b r12 = f69273b
            if (r12 == 0) goto L_0x0110
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.b r12 = f69273b
            r12.mo53884a(r11)
        L_0x0110:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26237e.mo53888a(java.util.List, android.content.Context):java.lang.Object");
    }

    /* renamed from: a */
    public final void mo53882a(Context context, List<Aweme> list) {
        if (context != null && !C9376b.m18558a((Collection<T>) list) && !m63582f() && !m63581e() && !C9376b.m18558a((Collection<T>) list)) {
            C0013i.m16a((Callable<TResult>) new C26239f<TResult>(this, list, context));
        }
    }
}
