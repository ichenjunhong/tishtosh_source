package com.p683ss.android.ugc.aweme.video;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import android.view.Surface;
import com.bytedance.apm.C8936b;
import com.bytedance.falconx.statistic.StatisticData;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.p829r.C12662c;
import com.bytedance.p829r.C12665e;
import com.google.p1057b.p1059b.C17443b;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.symphony.C26317h;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.helper.C30398t;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.player.C38850c;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbDashHijackRetryEnableExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbVIDDashHijackRetryEnableExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayerAbEnablePreCreatePauseExp;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38856b;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38857c;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38858d;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38865f;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38866g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38868g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38869h;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.video.FeedPlayerManagerViewModel.C47974a;
import com.p683ss.android.ugc.aweme.video.experiment.C48017a;
import com.p683ss.android.ugc.aweme.video.experiment.EnableH265BlackListExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerEventLogExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerFramesWaitExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerManagerBackgroundCheckSetting;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerManagerLogExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.TTPlayerAsyncInitExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.H265PlayAddrPolicyUnifyExperiment;
import com.p683ss.android.ugc.playerkit.C50100a;
import com.p683ss.android.ugc.playerkit.C50105b;
import com.p683ss.android.ugc.playerkit.p2492a.C50101a;
import com.p683ss.android.ugc.playerkit.p2492a.C50104d;
import com.p683ss.android.ugc.playerkit.p2493b.C50107b;
import com.p683ss.android.ugc.playerkit.p2494c.C50109a;
import com.p683ss.android.ugc.playerkit.p2494c.C50110b;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;
import com.p683ss.android.ugc.playerkit.p2494c.C50120i;
import com.p683ss.android.ugc.playerkit.p2494c.C50121j;
import com.p683ss.android.ugc.playerkit.session.C50122a;
import com.p683ss.android.ugc.playerkit.session.Session;
import com.p683ss.android.ugc.playerkit.videoview.C50142d;
import com.p683ss.android.ugc.playerkit.videoview.p2497c.C50141a;
import com.p683ss.ttvideoengine.Resolution;
import com.p683ss.ttvideoengine.model.VideoModel;
import com.p683ss.ttvideoengine.model.VideoThumbInfo;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.video.w */
public class C48121w extends C48069o implements C48021h, C50101a {

    /* renamed from: A */
    private static StringBuilder f120929A = null;

    /* renamed from: B */
    private static String f120930B = "_";

    /* renamed from: f */
    public static LruCache<String, C47976a> f120931f = new LruCache<String, C47976a>(100) {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
            return 1;
        }
    };

    /* renamed from: g */
    private static boolean f120932g = true;

    /* renamed from: i */
    private static C48121w f120933i;

    /* renamed from: w */
    private static boolean f120934w;

    /* renamed from: x */
    private static final int f120935x = C10193n.m20607a().mo18200a(PlayerManagerBackgroundCheckSetting.class, "playermanager_background_check", C10181b.m20511a().mo18175c().getPlayermanagerBackgroundCheck(), 0);

    /* renamed from: C */
    private long f120936C;

    /* renamed from: D */
    private Object f120937D;

    /* renamed from: E */
    private volatile boolean f120938E;

    /* renamed from: F */
    private long f120939F;

    /* renamed from: c */
    public volatile boolean f120940c;

    /* renamed from: d */
    public Session f120941d;

    /* renamed from: e */
    C17443b<VideoUrlModel, C50121j> f120942e;

    /* renamed from: h */
    private boolean f120943h;

    /* renamed from: j */
    private C38869h f120944j;

    /* renamed from: k */
    private VideoUrlModel f120945k;

    /* renamed from: l */
    private C50110b f120946l;

    /* renamed from: m */
    private volatile boolean f120947m;

    /* renamed from: n */
    private final C26317h f120948n;

    /* renamed from: o */
    private C50116c f120949o;

    /* renamed from: p */
    private int f120950p;

    /* renamed from: q */
    private boolean f120951q;

    /* renamed from: r */
    private boolean f120952r;

    /* renamed from: s */
    private C38856b f120953s;

    /* renamed from: t */
    private C38858d f120954t;

    /* renamed from: u */
    private boolean f120955u;

    /* renamed from: v */
    private int f120956v;

    /* renamed from: y */
    private C38868g f120957y;

    /* renamed from: z */
    private C38857c f120958z;

    /* renamed from: G */
    public final boolean mo95270G() {
        return this.f120943h;
    }

    /* renamed from: p */
    public final boolean mo95258p() {
        return this.f120947m;
    }

    /* renamed from: q */
    public final VideoUrlModel mo95259q() {
        return this.f120945k;
    }

    /* renamed from: r */
    public final boolean mo95260r() {
        return this.f120940c;
    }

    /* renamed from: a */
    public final void mo95284a(C38871j jVar) {
        this.f120944j.mo78897a(jVar);
    }

    /* renamed from: a */
    public final String mo95274a(Video video, boolean z) {
        return mo95275a(video, z, 0);
    }

    /* renamed from: a */
    public final String mo95275a(Video video, boolean z, int i) {
        return m104258a(video, z, i, true);
    }

    /* renamed from: a */
    public final String mo95276a(Video video, boolean z, int i, boolean z2, boolean z3) {
        C47991b.m103827a(video);
        C47991b.m103828a(this);
        this.f120946l = null;
        if (!TextUtils.isEmpty(video.getVideoId())) {
            return m104259a(video, z, false, C47983ad.Normal, i, z2);
        } else if (TextUtils.isEmpty(video.getVideoModelStr()) || !z3) {
            return m104260a(mo95444b(video), z, false, C47983ad.Normal, i, z2, video.isNeedSetCookie(), false);
        } else {
            return m104266b(video, z, false, C47983ad.Normal, i, z2);
        }
    }

    /* renamed from: a */
    public final String mo95278a(VideoUrlModel videoUrlModel, boolean z, boolean z2, boolean z3) {
        return m104260a(videoUrlModel, true, true, C47983ad.Normal, 0, true, z3, false);
    }

    /* renamed from: a */
    public final String mo95277a(VideoUrlModel videoUrlModel, boolean z) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        this.f120943h = false;
        this.f120945k = videoUrlModel2;
        C50122a.m108112a().mo97903d(videoUrlModel.getUri()).urlModel = videoUrlModel2;
        C50122a.m108112a().mo97899a(videoUrlModel.getUri(), videoUrlModel.getFileCheckSum());
        return m104261a(m104268c(videoUrlModel2, false), m104265b(videoUrlModel), videoUrlModel2, false, C47983ad.Normal, videoUrlModel.isVr(), videoUrlModel.isH265(), m104256a(videoUrlModel), true, false, 0, z, false);
    }

    /* renamed from: a */
    public final void mo95283a(Video video) {
        this.f120943h = false;
        this.f120945k = video.getPlayAddr();
        VideoModel a = C48001c.m103848a(video.getVideoModelStr());
        if (a != null && a.getVideoRef() != null) {
            String str = a.getVideoRef().mVideoId;
            C48001c.m103849a(str, a);
            this.f120945k.setDashVideoId(str);
            this.f120945k.setDashVideoModelStr(video.getVideoModelStr());
            Session d = C50122a.m108112a().mo97903d(str);
            String sourceId = video.getPlayAddr().getSourceId();
            d.urlModel = this.f120945k;
            C50120i iVar = new C50120i(null, null, C11010c.m22280a(), sourceId, false, C47983ad.Normal, false, false, this.f120950p, null, str, false, false, C10181b.m20511a().mo18172a(TTPlayerAsyncInitExperiment.class, true, "is_ttplayer_async_init", 31744, true), C10181b.m20511a().mo18168a(Get265DecodeTypeExperiment.class, true, "decoder_type", 31744, 0));
            iVar.f125580l = C10181b.m20511a().mo18168a(PlayerFramesWaitExperiment.class, true, "player_framews_wait", 31744, 1);
            iVar.f125579k = m104251O();
            iVar.f125590v = C50109a.m108068s().mo95436q() && this.f120952r;
            C50110b bVar = new C50110b();
            bVar.f125512a = a;
            iVar.f125594z = bVar;
            if (f120932g) {
                f120932g = false;
                iVar.f125568A = "nor";
            } else {
                iVar.f125568A = null;
            }
            this.f120944j.mo78899a(iVar);
        }
    }

    /* renamed from: a */
    public final void mo95279a(float f) {
        m104255S();
        this.f120944j.mo78888a(f);
    }

    /* renamed from: a */
    public final String mo95272a(Video video, C38871j jVar) {
        return mo95273a(video, jVar, 0);
    }

    /* renamed from: a */
    public final String mo95273a(Video video, C38871j jVar, int i) {
        if (m104270d("tryResumePlay")) {
            return StatisticData.ERROR_CODE_IO_ERROR;
        }
        this.f120948n.mo53101a();
        if (jVar == null) {
            return "102";
        }
        if (!this.f120944j.mo78906b(jVar)) {
            return "103";
        }
        if (video == null) {
            return "104";
        }
        VideoUrlModel playAddrH265 = video.getPlayAddrH265();
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        if (playAddrH265 == null && playAddrH264 == null && this.f120946l == null) {
            return "105";
        }
        if (i > 0) {
            mo95275a(video, true, i);
            return "106";
        } else if (m104264a(this.f120946l)) {
            this.f120944j.mo78900a(this.f120946l.f125514c);
            this.f120947m = false;
            return "107";
        } else {
            if (m104269c(playAddrH265) || m104269c(playAddrH264)) {
                this.f120944j.mo78900a(playAddrH265 != null ? playAddrH265.getSourceId() : playAddrH264.getSourceId());
                this.f120947m = false;
                return "108";
            } else if (this.f120955u) {
                this.f120955u = false;
                C47976a c = m104267c(playAddrH265 != null ? playAddrH265.getSourceId() : playAddrH264.getSourceId());
                if (c != null) {
                    return m104263a("109", "tryPlayWithInitialStart", m104258a(video, true, (int) c.f120603a, false));
                }
                return m104263a("110", "tryPlay", mo95274a(video, true));
            } else {
                return m104263a("111", "tryPlay", mo95274a(video, true));
            }
        }
    }

    /* renamed from: a */
    public final void mo95281a(Surface surface) {
        this.f120944j.mo78891a(surface);
    }

    /* renamed from: a */
    public final void mo95443a(JSONArray jSONArray, String str) {
        if (jSONArray != null && !TextUtils.isEmpty(str) && C50109a.m108068s().mo95437r()) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    C26890h.m65012a(str, jSONArray.getJSONObject(i));
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo95280a(int i) {
        if (this.f120944j != null) {
            this.f120944j.mo78903b(i);
        }
    }

    /* renamed from: a */
    public final void mo95285a(List<Aweme> list) {
        C0013i.m18a((Callable<TResult>) new C47980ab<TResult>(this, list), (Executor) C0013i.f24a);
    }

    /* renamed from: a */
    public final void mo95243a(String str) {
        this.f120944j.mo78905b(str);
    }

    /* renamed from: a */
    public final void mo95282a(Aweme aweme) {
        mo95289v();
        if (this.f120956v == 2 && aweme != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f120939F = -1;
            Video video = aweme.getVideo();
            mo95444b(video).setSourceId(aweme.getAid());
            mo95274a(video, false);
            this.f120956v = 3;
            f120934w = true;
            if (C10181b.m20511a().mo18168a(PlayerAbEnablePreCreatePauseExp.class, true, "enable_player_pre_create_pause", 31744, 1) == 0) {
                this.f120944j.mo78909e();
            }
            this.f120939F = SystemClock.elapsedRealtime() - elapsedRealtime;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("create_time", this.f120936C);
                jSONObject.put("prepare_time", this.f120939F);
                C26890h.m65012a("pre_create_player", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public C48121w() {
        this(true, false);
    }

    /* renamed from: N */
    public static C48020g m104250N() {
        return m104249M();
    }

    /* renamed from: Q */
    private void m104253Q() {
        this.f120944j.mo78910f();
    }

    /* renamed from: R */
    private int m104254R() {
        return this.f120944j.mo78916l();
    }

    /* renamed from: B */
    public final void mo95265B() {
        this.f120944j.mo78889a(0.0f, 0.0f);
    }

    /* renamed from: C */
    public final void mo95266C() {
        this.f120944j.mo78889a(1.0f, 1.0f);
    }

    /* renamed from: e */
    public final String mo95247e() {
        return this.f120944j.mo78915k();
    }

    /* renamed from: g */
    public final float mo95249g() {
        return this.f120944j.mo78886a(2);
    }

    /* renamed from: i */
    public final long mo95251i() {
        return this.f120944j.mo78913i();
    }

    /* renamed from: j */
    public final boolean mo95252j() {
        return this.f120944j.mo78922r();
    }

    /* renamed from: n */
    public final long mo95256n() {
        return this.f120944j.mo78912h();
    }

    /* renamed from: o */
    public final boolean mo95257o() {
        return this.f120944j.mo78914j();
    }

    /* renamed from: s */
    public final boolean mo95261s() {
        return this.f120944j.mo78926v();
    }

    /* renamed from: t */
    public final C38865f mo95262t() {
        return this.f120944j.mo78924t();
    }

    /* renamed from: w */
    public final void mo95290w() {
        this.f120944j.mo78902b();
    }

    /* renamed from: O */
    private static int m104251O() {
        if (C48017a.m103959a()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: A */
    public final void mo95264A() {
        m104253Q();
        this.f120947m = false;
        this.f120945k = null;
        this.f120956v = 1;
        this.f120946l = null;
    }

    /* renamed from: D */
    public final void mo95267D() {
        this.f120945k = null;
        this.f120946l = null;
        this.f120943h = true;
        this.f120944j.mo78917m();
    }

    /* renamed from: E */
    public final void mo95268E() {
        if (this.f120944j != null) {
            this.f120944j.mo78918n();
        }
    }

    /* renamed from: F */
    public final void mo95269F() {
        if (this.f120944j != null) {
            this.f120944j.mo78919o();
        }
    }

    /* renamed from: H */
    public final long mo95271H() {
        C38865f t = this.f120944j.mo78924t();
        if (t != null) {
            return t.f98975f;
        }
        return 0;
    }

    /* renamed from: b */
    public final String mo95244b() {
        return this.f120944j.mo78925u();
    }

    /* renamed from: c */
    public final int mo95245c() {
        C38865f t = this.f120944j.mo78924t();
        if (t != null) {
            return t.f98970a;
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo95246d() {
        C38865f t = this.f120944j.mo78924t();
        if (t != null) {
            return t.f98971b;
        }
        return -1;
    }

    /* renamed from: f */
    public final float mo95248f() {
        return this.f120944j.mo78886a(10);
    }

    /* renamed from: h */
    public final float mo95250h() {
        return this.f120944j.mo78886a(8);
    }

    /* renamed from: k */
    public final int mo95253k() {
        return (int) this.f120944j.mo78886a(9);
    }

    /* renamed from: l */
    public final int mo95254l() {
        C38865f t = this.f120944j.mo78924t();
        if (t != null) {
            return t.f98973d;
        }
        return 0;
    }

    /* renamed from: m */
    public final int mo95255m() {
        C38865f t = this.f120944j.mo78924t();
        if (t != null) {
            return t.f98974e;
        }
        return 0;
    }

    /* renamed from: u */
    public final int mo95263u() {
        C38865f t = this.f120944j.mo78924t();
        if (t != null) {
            return t.f98972c;
        }
        return -1;
    }

    /* renamed from: z */
    public final void mo95293z() {
        this.f120948n.mo53102b();
        this.f120944j.mo78909e();
        this.f120947m = false;
        m104252P();
        this.f120955u = false;
    }

    /* renamed from: M */
    public static C48021h m104249M() {
        C48021h hVar;
        C48021h a = C30398t.m71321a(C11016e.m22312g());
        if (a != null) {
            return a;
        }
        if (C48069o.m104090L()) {
            Activity g = C11016e.m22312g();
            if (g instanceof FragmentActivity) {
                C47974a aVar = FeedPlayerManagerViewModel.f120595b;
                FragmentActivity fragmentActivity = (FragmentActivity) g;
                C52711k.m112240b(fragmentActivity, "activity");
                hVar = C47974a.m103798a(fragmentActivity).f120596a;
            } else {
                hVar = null;
            }
            if (hVar != null) {
                return hVar;
            }
        }
        if (f120792a) {
            return C47981ac.m103815a().mo95141b();
        }
        if (f120933i == null) {
            synchronized (C48121w.class) {
                if (f120933i == null) {
                    C48121w wVar = new C48121w(false, false);
                    f120933i = wVar;
                    wVar.f120952r = true;
                }
            }
        }
        return f120933i;
    }

    /* renamed from: P */
    private void m104252P() {
        long n = mo95256n();
        if (!this.f120951q && this.f120945k != null && !TextUtils.isEmpty(this.f120945k.getSourceId()) && n >= 0) {
            C47976a aVar = (C47976a) f120931f.get(this.f120945k.getSourceId());
            if (aVar == null) {
                aVar = new C47976a();
            }
            aVar.f120603a = n;
            aVar.f120604b = m104254R();
            f120931f.put(this.f120945k.getSourceId(), aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        return;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95289v() {
        /*
            r9 = this;
            boolean r0 = r9.f120938E
            if (r0 != 0) goto L_0x0054
            java.lang.Object r0 = r9.f120937D
            monitor-enter(r0)
            boolean r1 = r9.f120938E     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x004f
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0051 }
            com.bytedance.ies.abmock.b r3 = com.bytedance.ies.abmock.C10181b.m20511a()     // Catch:{ all -> 0x0051 }
            java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.PlayeAbPrecreateplayerExp> r4 = com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbPrecreateplayerExp.class
            r5 = 1
            java.lang.String r6 = "player_precreateplayer"
            r7 = 31744(0x7c00, float:4.4483E-41)
            r8 = 0
            int r3 = r3.mo18168a(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0051 }
            r4 = 1
            if (r3 == r4) goto L_0x0026
            r9.f120938E = r4     // Catch:{ all -> 0x0051 }
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return
        L_0x0026:
            r5 = -1
            r9.f120936C = r5     // Catch:{ all -> 0x0051 }
            int r3 = r9.f120956v     // Catch:{ all -> 0x0051 }
            if (r3 != r4) goto L_0x0045
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r3 = r9.f120945k     // Catch:{ all -> 0x0051 }
            if (r3 != 0) goto L_0x0045
            boolean r3 = r9.f120947m     // Catch:{ all -> 0x0051 }
            if (r3 != 0) goto L_0x0045
            com.ss.android.ugc.aweme.player.sdk.a.h r3 = r9.f120944j     // Catch:{ all -> 0x0051 }
            com.ss.android.ugc.aweme.player.sdk.a.g r5 = r9.f120957y     // Catch:{ all -> 0x0051 }
            r3.mo78896a(r5)     // Catch:{ all -> 0x0051 }
            com.ss.android.ugc.aweme.player.sdk.a.h r3 = r9.f120944j     // Catch:{ all -> 0x0051 }
            r3.mo78887a()     // Catch:{ all -> 0x0051 }
            r3 = 2
            r9.f120956v = r3     // Catch:{ all -> 0x0051 }
        L_0x0045:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0051 }
            r3 = 0
            long r5 = r5 - r1
            r9.f120936C = r5     // Catch:{ all -> 0x0051 }
            r9.f120938E = r4     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return
        L_0x0051:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r1
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.video.C48121w.mo95289v():void");
    }

    /* renamed from: x */
    public final void mo95291x() {
        if (!m104270d("resumePlay")) {
            this.f120948n.mo53101a();
            if (this.f120946l != null && !TextUtils.isEmpty(this.f120946l.f125514c)) {
                this.f120944j.mo78900a(this.f120946l.f125514c);
            } else if (this.f120945k != null && !this.f120944j.mo78906b((C38871j) null)) {
                this.f120944j.mo78900a(this.f120945k.getSourceId());
            } else {
                return;
            }
            this.f120947m = false;
        }
    }

    /* renamed from: y */
    public final void mo95292y() {
        if (f120934w) {
            f120934w = false;
            return;
        }
        if (this.f120940c && C50105b.m108062a(this.f120944j.mo78921q()) && C10181b.m20511a().mo18172a(EnableH265BlackListExperiment.class, true, "enable_h265_black_list", 31744, false)) {
            this.f120940c = this.f120944j.mo78911g();
            C50142d.f125655a = this.f120940c;
        }
        this.f120944j.mo78908d();
        this.f120947m = false;
        m104252P();
    }

    /* renamed from: S */
    private void m104255S() {
        C38865f t = mo95262t();
        if (t != null) {
            VideoModel videoModel = t.f98977h;
            if (videoModel != null && videoModel.getVideoRef() != null && videoModel.getVideoRef().getThumbInfoList() != null && videoModel.getVideoRef().getThumbInfoList().size() > 0 && mo95251i() > 0) {
                String a = m104257a(C11010c.m22280a());
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append("/");
                sb.append(m104262a((VideoThumbInfo) videoModel.getVideoRef().getThumbInfoList().get(0)));
                if (!new File(sb.toString()).exists()) {
                    Downloader.with(C11010c.m22280a()).url(((VideoThumbInfo) videoModel.getVideoRef().getThumbInfoList().get(0)).mImgUrl).name(m104262a((VideoThumbInfo) videoModel.getVideoRef().getThumbInfoList().get(0))).savePath(m104257a(C11010c.m22280a())).download();
                }
            }
        }
    }

    /* renamed from: a */
    public final C50116c mo95242a() {
        C50116c cVar;
        if (this.f120941d != null) {
            cVar = this.f120941d.playerType;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            return C50116c.TT;
        }
        return cVar;
    }

    /* renamed from: a */
    private static C50104d<Integer> m104256a(VideoUrlModel videoUrlModel) {
        return new C48126y(videoUrlModel);
    }

    /* renamed from: b */
    private static C50104d<Boolean> m104265b(VideoUrlModel videoUrlModel) {
        return new C47979aa(videoUrlModel);
    }

    public C48121w(boolean z) {
        this(true, true);
    }

    /* renamed from: a */
    private static String m104262a(VideoThumbInfo videoThumbInfo) {
        return String.valueOf(videoThumbInfo.mImgUrl.hashCode());
    }

    /* renamed from: c */
    public static C47976a m104267c(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C47976a();
        }
        C47976a aVar = (C47976a) f120931f.get(str);
        if (aVar == null) {
            aVar = new C47976a();
        }
        return aVar;
    }

    /* renamed from: e */
    private static void m104271e(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", str);
            C8936b.m17657a("play_video_in_app_background", (JSONObject) null, (JSONObject) null, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static String m104257a(Context context) {
        File file;
        if (!C48016e.m103957g()) {
            file = context.getCacheDir();
            if (C12662c.m25456a()) {
                file = C12662c.m25458b(context, C12665e.PREFER_PRIVATE);
            }
        } else {
            file = C48016e.m103941b(context);
            if (C12662c.m25456a()) {
                file = C12662c.m25458b(context, C12665e.PREFER_EXTERNAL);
            }
        }
        File file2 = new File(file, "cache/thumbs");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getAbsolutePath();
    }

    /* renamed from: b */
    public final String mo95301b(String str) {
        C38869h hVar = this.f120944j;
        C38866g gVar = null;
        if (hVar != null) {
            C38866g s = hVar.mo78923s();
            if (s != null) {
                gVar = s;
            }
        }
        return C47989ai.m103823a(gVar, str);
    }

    /* renamed from: c */
    public final void mo95288c(C38871j jVar) {
        this.f120948n.mo53102b();
        if (jVar != null && this.f120944j.mo78906b(jVar)) {
            this.f120944j.mo78909e();
            this.f120947m = false;
            m104252P();
        }
    }

    public void onEvent(JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if (C10181b.m20511a().mo18172a(PlayerEventLogExperiment.class, true, "player_event_log_open", 31744, true)) {
                        AppLog.recordMiscLog(C11010c.m22280a(), "video_playq", jSONArray.getJSONObject(i));
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m104269c(VideoUrlModel videoUrlModel) {
        String str;
        if (videoUrlModel != null && this.f120945k != null && TextUtils.equals(videoUrlModel.getUri(), this.f120945k.getUri()) && TextUtils.equals(videoUrlModel.getRatio(), this.f120945k.getRatio())) {
            if (!TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
                str = videoUrlModel.getDashVideoId();
            } else {
                str = videoUrlModel.getBitRatedRatioUri();
            }
            if (!TextUtils.isEmpty(videoUrlModel.getSourceId()) && this.f120944j.mo78901a(videoUrlModel.getSourceId(), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m104270d(String str) {
        if (f120935x == 1 && TextUtils.equals("resumePlay", str)) {
            C32458a.m75141a(4, "PlayerManager", Log.getStackTraceString(new Throwable("resumePlay")));
        }
        if (f120935x != 1 || !C11016e.m22313h()) {
            return false;
        }
        String stackTraceString = Log.getStackTraceString(new Throwable("PlayVideoInAppBackground"));
        m104271e(stackTraceString);
        StringBuilder sb = new StringBuilder("Try play video when app is in background, trace is ");
        sb.append(stackTraceString);
        C32458a.m75141a(4, "PlayerManager", sb.toString());
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public VideoUrlModel mo95444b(Video video) {
        if (C10181b.m20511a().mo18172a(H265PlayAddrPolicyUnifyExperiment.class, true, "h265_play_addr_policy_unify", 31744, true)) {
            VideoUrlModel a = C48070p.m104094a(video, this.f120944j.mo78921q());
            if (a != null) {
                return a;
            }
        } else if (video != null) {
            if (!C50105b.m108061a((UrlModel) video.getPlayAddrH265()) || !C50105b.m108062a(this.f120944j.mo78921q()) || !this.f120940c) {
                return video.getPlayAddrH264();
            }
            return video.getPlayAddrH265();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo95286b(Surface surface) {
        this.f120944j.mo78904b((Surface) null);
    }

    /* renamed from: b */
    public final boolean mo95287b(C38871j jVar) {
        return this.f120944j.mo78906b(jVar);
    }

    /* renamed from: a */
    private boolean m104264a(C50110b bVar) {
        if (bVar == null || TextUtils.isEmpty(bVar.f125514c)) {
            return false;
        }
        return this.f120944j.mo78901a(bVar.f125514c, bVar.f125514c);
    }

    /* renamed from: c */
    private C50104d<C50121j> m104268c(VideoUrlModel videoUrlModel, boolean z) {
        return new C48127z(this, z, videoUrlModel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C50121j mo95445b(VideoUrlModel videoUrlModel, boolean z) {
        return C50141a.m108193a().mo97943b(videoUrlModel.getBitRatedRatioUri()).mo97945a(videoUrlModel, mo95242a(), z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a7, code lost:
        if (com.p683ss.android.ugc.aweme.player.C38850c.m86286c() != false) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C48121w(boolean r11, boolean r12) {
        /*
            r10 = this;
            r10.<init>()
            r0 = 1
            r10.f120940c = r0
            r10.f120943h = r0
            com.ss.android.ugc.aweme.commercialize.symphony.h r1 = com.p683ss.android.ugc.aweme.commercialize.symphony.C26317h.f69457a
            r10.f120948n = r1
            com.ss.android.ugc.aweme.player.sdk.a.b r1 = com.p683ss.android.ugc.aweme.video.C48125x.f120961a
            r10.f120953s = r1
            com.ss.android.ugc.aweme.video.n r1 = new com.ss.android.ugc.aweme.video.n
            r1.<init>()
            r10.f120954t = r1
            r10.f120956v = r0
            com.ss.android.ugc.aweme.video.w$2 r1 = new com.ss.android.ugc.aweme.video.w$2
            r1.<init>()
            r10.f120957y = r1
            com.ss.android.ugc.aweme.video.w$3 r1 = new com.ss.android.ugc.aweme.video.w$3
            r1.<init>()
            r10.f120958z = r1
            r1 = -1
            r10.f120936C = r1
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r10.f120937D = r3
            r3 = 0
            r10.f120938E = r3
            r10.f120939F = r1
            r10.f120951q = r12
            com.ss.android.ugc.playerkit.c.a r12 = com.p683ss.android.ugc.playerkit.p2494c.C50109a.m108068s()
            int r12 = r12.mo95421b()
            r10.f120950p = r12
            com.ss.android.ugc.playerkit.c.a r12 = com.p683ss.android.ugc.playerkit.p2494c.C50109a.m108068s()
            com.ss.android.ugc.playerkit.c.e$c r12 = r12.mo95420a()
            r10.f120949o = r12
            com.p683ss.android.ugc.aweme.player.sdk.C38854a.f98960a = r3
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.v3.PlayeAbV3EnableExp> r5 = com.p683ss.android.ugc.aweme.player.p2051ab.abs.p2052v3.PlayeAbV3EnableExp.class
            java.lang.String r7 = "player_v3_up_enable"
            r6 = 1
            r8 = 31744(0x7c00, float:4.4483E-41)
            r9 = 0
            int r12 = r4.mo18168a(r5, r6, r7, r8, r9)
            if (r12 != r0) goto L_0x0063
            r12 = 1
            goto L_0x0064
        L_0x0063:
            r12 = 0
        L_0x0064:
            if (r12 == 0) goto L_0x0074
            boolean r12 = com.p683ss.android.ugc.aweme.player.C38850c.m86287d()
            if (r12 == 0) goto L_0x0072
            boolean r12 = com.p683ss.android.ugc.aweme.player.C38850c.m86286c()
            if (r12 == 0) goto L_0x0074
        L_0x0072:
            r12 = 1
            goto L_0x0075
        L_0x0074:
            r12 = 0
        L_0x0075:
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.v3.PlayeAbV3ForceEnableExp> r5 = com.p683ss.android.ugc.aweme.player.p2051ab.abs.p2052v3.PlayeAbV3ForceEnableExp.class
            r6 = 1
            java.lang.String r7 = "player_v3_up_force_enable"
            r8 = 31744(0x7c00, float:4.4483E-41)
            r9 = 0
            int r1 = r4.mo18168a(r5, r6, r7, r8, r9)
            if (r1 != r0) goto L_0x0089
            r1 = 1
            goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            if (r1 != 0) goto L_0x00aa
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.v3.PlayeAbV3MTKEnableExp> r5 = com.p683ss.android.ugc.aweme.player.p2051ab.abs.p2052v3.PlayeAbV3MTKEnableExp.class
            r6 = 1
            java.lang.String r7 = "player_v3_up_mtk_enable"
            r8 = 31744(0x7c00, float:4.4483E-41)
            r9 = 0
            int r1 = r4.mo18168a(r5, r6, r7, r8, r9)
            if (r1 != r0) goto L_0x00a0
            r1 = 1
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            if (r1 == 0) goto L_0x00ab
            boolean r1 = com.p683ss.android.ugc.aweme.player.C38850c.m86286c()
            if (r1 != 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r12 = 1
        L_0x00ab:
            if (r12 == 0) goto L_0x010d
            com.ss.android.ugc.aweme.player.sdk.c.c r12 = new com.ss.android.ugc.aweme.player.sdk.c.c
            r12.<init>()
            r12.f99014d = r11
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.v3.PlayeAbV3PoolMaxExp> r5 = com.p683ss.android.ugc.aweme.player.p2051ab.abs.p2052v3.PlayeAbV3PoolMaxExp.class
            r6 = 1
            java.lang.String r7 = "player_v3_pool_max_size"
            r8 = 31744(0x7c00, float:4.4483E-41)
            r9 = 5
            int r11 = r4.mo18168a(r5, r6, r7, r8, r9)
            r12.f99016f = r11
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.v3.PlayeAbV3PoolCoreExp> r5 = com.p683ss.android.ugc.aweme.player.p2051ab.abs.p2052v3.PlayeAbV3PoolCoreExp.class
            java.lang.String r7 = "player_v3_pool_core_size"
            r9 = 3
            int r11 = r4.mo18168a(r5, r6, r7, r8, r9)
            r12.f99017g = r11
            boolean r11 = com.p683ss.android.ugc.aweme.player.C38850c.m86287d()
            if (r11 == 0) goto L_0x00ee
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.v3.PlayeAbV3SessionReuseEnableExp> r5 = com.p683ss.android.ugc.aweme.player.p2051ab.abs.p2052v3.PlayeAbV3SessionReuseEnableExp.class
            r6 = 1
            java.lang.String r7 = "player_v3_session_reuse_enable"
            r8 = 31744(0x7c00, float:4.4483E-41)
            r9 = 0
            int r11 = r4.mo18168a(r5, r6, r7, r8, r9)
            if (r11 != r0) goto L_0x00ee
            goto L_0x00ef
        L_0x00ee:
            r0 = 0
        L_0x00ef:
            r12.f99015e = r0
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.player.ab.abs.v3.PlayeAbV3SessionPoolExp> r2 = com.p683ss.android.ugc.aweme.player.p2051ab.abs.p2052v3.PlayeAbV3SessionPoolExp.class
            r3 = 1
            java.lang.String r4 = "player_v3_session_pool_size"
            r5 = 31744(0x7c00, float:4.4483E-41)
            r6 = 1
            int r11 = r1.mo18168a(r2, r3, r4, r5, r6)
            r12.f99018h = r11
            com.ss.android.ugc.aweme.player.sdk.c.e r11 = new com.ss.android.ugc.aweme.player.sdk.c.e
            com.ss.android.ugc.playerkit.c.e$c r0 = r10.f120949o
            r11.<init>(r0, r12)
            r10.f120944j = r11
            goto L_0x011b
        L_0x010d:
            com.ss.android.ugc.aweme.player.sdk.impl.c r11 = new com.ss.android.ugc.aweme.player.sdk.impl.c
            com.ss.android.ugc.aweme.player.sdk.impl.d r12 = new com.ss.android.ugc.aweme.player.sdk.impl.d
            com.ss.android.ugc.playerkit.c.e$c r0 = r10.f120949o
            r12.<init>(r0)
            r11.<init>(r12)
            r10.f120944j = r11
        L_0x011b:
            com.ss.android.ugc.aweme.player.sdk.a.h r11 = r10.f120944j
            r11.mo78898a(r10)
            com.ss.android.ugc.aweme.player.sdk.a.h r11 = r10.f120944j
            com.ss.android.ugc.aweme.player.sdk.a.b r12 = r10.f120953s
            r11.mo78893a(r12)
            com.ss.android.ugc.aweme.player.sdk.a.h r11 = r10.f120944j
            com.ss.android.ugc.aweme.player.sdk.a.d r12 = r10.f120954t
            r11.mo78895a(r12)
            com.ss.android.ugc.aweme.player.sdk.a.h r11 = r10.f120944j
            com.ss.android.ugc.aweme.player.sdk.a.c r12 = r10.f120958z
            r11.mo78894a(r12)
            com.google.b.b.c r11 = com.google.p1057b.p1059b.C17444c.m42708a()
            r0 = 20
            com.google.b.b.c r11 = r11.mo33776a(r0)
            com.google.b.b.b r11 = r11.mo33781d()
            r10.f120942e = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.video.C48121w.<init>(boolean, boolean):void");
    }

    /* renamed from: a */
    private static String m104263a(String str, String str2, String str3) {
        if (!C10181b.m20511a().mo18172a(PlayerManagerLogExperiment.class, true, "enable_player_manager_log", 31744, true) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        if (f120929A == null) {
            f120929A = new StringBuilder();
        }
        f120929A.setLength(0);
        StringBuilder sb = f120929A;
        sb.append(str);
        sb.append(f120930B);
        sb.append(str2);
        sb.append(f120930B);
        sb.append(str3);
        return f120929A.toString();
    }

    /* renamed from: a */
    private String m104258a(Video video, boolean z, int i, boolean z2) {
        return mo95276a(video, z, i, z2, true);
    }

    /* renamed from: a */
    private String m104259a(Video video, boolean z, boolean z2, C47983ad adVar, int i, boolean z3) {
        boolean z4;
        boolean z5;
        if (m104270d("tryPlayDashWithInitialStart")) {
            return "151";
        }
        if (TextUtils.isEmpty(video.getVideoId()) || TextUtils.isEmpty(video.getVideoIdAuth()) || TextUtils.isEmpty(video.getVideoIdPToken())) {
            return "152";
        }
        String videoId = video.getVideoId();
        if (!this.f120951q && !TextUtils.isEmpty(videoId)) {
            f120931f.put(videoId, new C47976a());
        }
        this.f120941d = C50122a.m108112a().mo97903d(videoId);
        this.f120941d.sourceId = videoId;
        this.f120941d.playerType = this.f120949o;
        C50107b.f125505b = videoId;
        C50107b.m108065a(videoId);
        C50100a.m108056a().mo97880a(videoId, "player_try_play");
        String str = videoId;
        boolean z6 = z;
        C47983ad adVar2 = adVar;
        boolean z7 = z3;
        C50120i iVar = new C50120i(null, null, C11010c.m22280a(), str, z6, adVar2, false, false, this.f120950p, null, videoId, this.f120943h, z7, C10181b.m20511a().mo18172a(TTPlayerAsyncInitExperiment.class, true, "is_ttplayer_async_init", 31744, true), C10181b.m20511a().mo18168a(Get265DecodeTypeExperiment.class, true, "decoder_type", 31744, 0));
        iVar.f125580l = C10181b.m20511a().mo18168a(PlayerFramesWaitExperiment.class, true, "player_framews_wait", 31744, 1);
        iVar.f125589u = i;
        iVar.f125579k = 0;
        if (!C50109a.m108068s().mo95436q() || !this.f120952r) {
            z4 = false;
        } else {
            z4 = true;
        }
        iVar.f125590v = z4;
        C50110b bVar = new C50110b();
        bVar.f125514c = video.getVideoId();
        bVar.f125515d = video.getVideoIdAuth();
        bVar.f125516e = video.getVideoIdPToken();
        bVar.f125513b = video.getVideoIdApiHost();
        bVar.f125517f = String.valueOf(C11010c.m22289j());
        bVar.f125519h = Resolution.SuperHigh;
        if (video.enableIntertrustDrm()) {
            bVar.f125520i = 0;
            bVar.f125521j = 0;
        }
        this.f120946l = bVar;
        iVar.f125594z = bVar;
        if (C10181b.m20511a().mo18168a(PlayeAbVIDDashHijackRetryEnableExp.class, true, "player_vid_dash_enable_hijack_retry", 31744, 1) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        iVar.f125592x = z5;
        if (f120932g) {
            f120932g = false;
            iVar.f125568A = "nor";
        } else {
            iVar.f125568A = null;
        }
        this.f120944j.mo78899a(iVar);
        this.f120947m = true;
        this.f120943h = true;
        return "157";
    }

    /* renamed from: b */
    private String m104266b(Video video, boolean z, boolean z2, C47983ad adVar, int i, boolean z3) {
        boolean z4;
        boolean z5;
        if (m104270d("tryPlayDashWithInitialStart")) {
            return "153";
        }
        VideoModel a = C48001c.m103848a(video.getVideoModelStr());
        if (a == null || a.getVideoRef() == null) {
            return "154";
        }
        String str = a.getVideoRef().mVideoId;
        if (!this.f120951q && !TextUtils.isEmpty(str)) {
            f120931f.put(str, new C47976a());
        }
        C48001c.m103849a(str, a);
        String sourceId = video.getPlayAddr().getSourceId();
        video.getPlayAddr().setDashVideoId(str);
        video.getPlayAddr().setDashVideoModelStr(video.getVideoModelStr());
        this.f120941d = C50122a.m108112a().mo97903d(str);
        this.f120941d.sourceId = sourceId;
        this.f120945k = video.getPlayAddr();
        this.f120941d.urlModel = video.getPlayAddr();
        this.f120941d.playerType = this.f120949o;
        C50107b.f125505b = str;
        C50107b.m108065a(str);
        C50100a.m108056a().mo97880a(str, "player_try_play");
        boolean z6 = z;
        C47983ad adVar2 = adVar;
        boolean z7 = z3;
        C50120i iVar = new C50120i(null, null, C11010c.m22280a(), sourceId, z6, adVar2, false, false, this.f120950p, null, str, this.f120943h, z7, C10181b.m20511a().mo18172a(TTPlayerAsyncInitExperiment.class, true, "is_ttplayer_async_init", 31744, true), C10181b.m20511a().mo18168a(Get265DecodeTypeExperiment.class, true, "decoder_type", 31744, 0));
        iVar.f125580l = C10181b.m20511a().mo18168a(PlayerFramesWaitExperiment.class, true, "player_framews_wait", 31744, 1);
        iVar.f125589u = i;
        iVar.f125579k = m104251O();
        if (!C50109a.m108068s().mo95436q() || !this.f120952r) {
            z4 = false;
        } else {
            z4 = true;
        }
        iVar.f125590v = z4;
        C50110b bVar = new C50110b();
        bVar.f125512a = a;
        bVar.f125522k = C38850c.m86285b();
        iVar.f125594z = bVar;
        if (C10181b.m20511a().mo18168a(PlayeAbDashHijackRetryEnableExp.class, true, "player_dash_enable_hijack_retry", 31744, 0) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        iVar.f125592x = z5;
        if (f120932g) {
            f120932g = false;
            iVar.f125568A = "nor";
        } else {
            iVar.f125568A = null;
        }
        this.f120944j.mo78899a(iVar);
        this.f120947m = true;
        this.f120943h = true;
        return "158";
    }

    /* renamed from: a */
    private String m104260a(VideoUrlModel videoUrlModel, boolean z, boolean z2, C47983ad adVar, int i, boolean z3, boolean z4, boolean z5) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (m104270d("tryPlayWithInitialStart")) {
            return "155";
        }
        if (!C50105b.m108061a((UrlModel) videoUrlModel)) {
            return "156";
        }
        if (!this.f120951q && !TextUtils.isEmpty(videoUrlModel.getSourceId())) {
            f120931f.put(videoUrlModel.getSourceId(), new C47976a());
        }
        String bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
        String uri = videoUrlModel.getUri();
        this.f120941d = C50122a.m108112a().mo97903d(uri);
        this.f120941d.sourceId = videoUrlModel.getSourceId();
        this.f120945k = videoUrlModel2;
        this.f120941d.urlModel = videoUrlModel2;
        this.f120941d.playerType = this.f120949o;
        C50107b.f125505b = bitRatedRatioUri;
        C50107b.m108065a(bitRatedRatioUri);
        C50100a.m108056a().mo97880a(uri, "player_try_play");
        String a = m104261a(m104268c(videoUrlModel2, z2), m104265b(videoUrlModel), videoUrlModel, z, adVar, videoUrlModel.isVr(), videoUrlModel.isH265(), m104256a(videoUrlModel), this.f120943h, z3, i, z4, false);
        this.f120943h = true;
        return m104263a("159", "prepareWithInitialStart", a);
    }

    /* renamed from: a */
    private String m104261a(C50104d<C50121j> dVar, C50104d<Boolean> dVar2, VideoUrlModel videoUrlModel, boolean z, C47983ad adVar, boolean z2, boolean z3, C50104d<Integer> dVar3, boolean z4, boolean z5, int i, boolean z6, boolean z7) {
        boolean z8;
        boolean a = C10181b.m20511a().mo18172a(TTPlayerAsyncInitExperiment.class, true, "is_ttplayer_async_init", 31744, true);
        C50104d<C50121j> dVar4 = dVar;
        C50104d<Boolean> dVar5 = dVar2;
        C50120i iVar = new C50120i(dVar4, dVar5, C11010c.m22280a(), videoUrlModel.getSourceId(), z, adVar, z2, z3, this.f120950p, dVar3, videoUrlModel.getUri(), z4, z5, a, C10181b.m20511a().mo18168a(Get265DecodeTypeExperiment.class, true, "decoder_type", 31744, 0));
        iVar.f125580l = C10181b.m20511a().mo18168a(PlayerFramesWaitExperiment.class, true, "player_framews_wait", 31744, 1);
        iVar.f125589u = i;
        iVar.f125593y = z7;
        iVar.f125583o = videoUrlModel.getBitRatedRatioUri();
        C50122a.m108112a().mo97899a(iVar.f125583o, videoUrlModel.getFileCheckSum());
        iVar.f125579k = m104251O();
        boolean z9 = false;
        if (f120932g) {
            f120932g = false;
            if (this.f120956v == 2) {
                iVar.f125568A = "pre";
            } else {
                iVar.f125568A = "nor";
            }
        } else {
            iVar.f125568A = null;
        }
        if (!C50109a.m108068s().mo95436q() || !this.f120952r) {
            z8 = false;
        } else {
            z8 = true;
        }
        iVar.f125590v = z8;
        if (z6) {
            if (videoUrlModel != null) {
                List urlList = videoUrlModel.getUrlList();
                if (urlList != null && urlList.size() > 0) {
                    Iterator it = urlList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z9 = true;
                            break;
                        }
                        if (!C48070p.m104095a(C11010c.m22280a(), (String) it.next())) {
                            break;
                        }
                    }
                }
            }
            if (z9) {
                iVar.f125591w = true;
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("aid", videoUrlModel.getSourceId());
                } catch (JSONException unused) {
                }
                C23569o.m57779a("need_set_token_exception", jSONObject);
            }
        }
        this.f120946l = null;
        this.f120944j.mo78899a(iVar);
        this.f120947m = true;
        return "201";
    }
}
