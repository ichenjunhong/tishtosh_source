package com.p683ss.android.ugc.aweme.feed.p1719e;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0732g;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.facebook.p987k.p988a.C14460b;
import com.google.gson.C17978g;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.C22930ah;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.audio.AudioUtils;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.comment.abtest.C25069a;
import com.p683ss.android.ugc.aweme.comment.p1524i.C25209c;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25880al;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26033a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26086j;
import com.p683ss.android.ugc.aweme.commercialize.symphony.C26317h;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26432bq;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28220g;
import com.p683ss.android.ugc.aweme.discover.mob.C28423z;
import com.p683ss.android.ugc.aweme.experiment.CellInfoEnableExperiment;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30137am;
import com.p683ss.android.ugc.aweme.feed.C30158b;
import com.p683ss.android.ugc.aweme.feed.C30177d;
import com.p683ss.android.ugc.aweme.feed.C30436k;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.adapter.C30014ae;
import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.cache.C30163b;
import com.p683ss.android.ugc.aweme.feed.experiment.C30227g;
import com.p683ss.android.ugc.aweme.feed.experiment.FeedAdEnableDurationOptimizeSetting;
import com.p683ss.android.ugc.aweme.feed.experiment.FeedPlayerCleanOptimize;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoBufferingThresholdExperiment;
import com.p683ss.android.ugc.aweme.feed.helper.C30367g;
import com.p683ss.android.ugc.aweme.feed.helper.C30389m;
import com.p683ss.android.ugc.aweme.feed.helper.C30396s;
import com.p683ss.android.ugc.aweme.feed.helper.C30398t;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.BitRate;
import com.p683ss.android.ugc.aweme.feed.model.BitRate.ExcludeStrategy;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.feed.monitor.C30514a.C30515a;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30178a;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30308a;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30329at;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30333b;
import com.p683ss.android.ugc.aweme.feed.p1727j.C30434a;
import com.p683ss.android.ugc.aweme.feed.p1729l.C30466a;
import com.p683ss.android.ugc.aweme.feed.p1729l.C30469d;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31124c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31125d;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31134e;
import com.p683ss.android.ugc.aweme.feed.panel.C30597ae;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.feed.param.MobParamProvider;
import com.p683ss.android.ugc.aweme.feed.utils.C31186b;
import com.p683ss.android.ugc.aweme.feed.utils.C31189e;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.feed.utils.C31203o;
import com.p683ss.android.ugc.aweme.feed.utils.OftenWatchReportFastStatsSetting;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31296a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.login.utils.C36330a;
import com.p683ss.android.ugc.aweme.main.C36546c;
import com.p683ss.android.ugc.aweme.main.C36641ei;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.C36649a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1340am.C22572b;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23213as;
import com.p683ss.android.ugc.aweme.p1382aq.C23216au;
import com.p683ss.android.ugc.aweme.p1382aq.C23217av;
import com.p683ss.android.ugc.aweme.p1382aq.C23219ax;
import com.p683ss.android.ugc.aweme.p1382aq.C23221az;
import com.p683ss.android.ugc.aweme.p1382aq.C23240j;
import com.p683ss.android.ugc.aweme.p1382aq.C23252v;
import com.p683ss.android.ugc.aweme.p1382aq.p1384b.C23223a;
import com.p683ss.android.ugc.aweme.p1462bq.C23957c.C23958a;
import com.p683ss.android.ugc.aweme.p1462bq.C23962d;
import com.p683ss.android.ugc.aweme.p1462bq.C23965f;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29924q;
import com.p683ss.android.ugc.aweme.p1963ml.C37120o;
import com.p683ss.android.ugc.aweme.player.C38850c;
import com.p683ss.android.ugc.aweme.player.p2050a.C38828b.C38829a;
import com.p683ss.android.ugc.aweme.player.p2050a.C38828b.C38831c;
import com.p683ss.android.ugc.aweme.player.p2050a.C38840e.C38841a;
import com.p683ss.android.ugc.aweme.player.p2051ab.C38845b;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayerAbBlockReportExp;
import com.p683ss.android.ugc.aweme.player.p2053b.C38848a;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39042b;
import com.p683ss.android.ugc.aweme.requesttask.idle.AVCameraInitManager;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.setting.C41631k;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43893g;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43929l;
import com.p683ss.android.ugc.aweme.utils.C47667ah;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47934o;
import com.p683ss.android.ugc.aweme.video.C47976a;
import com.p683ss.android.ugc.aweme.video.C47981ac;
import com.p683ss.android.ugc.aweme.video.C47990aj;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48039k;
import com.p683ss.android.ugc.aweme.video.C48040l;
import com.p683ss.android.ugc.aweme.video.C48069o;
import com.p683ss.android.ugc.aweme.video.C48114q;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p683ss.android.ugc.aweme.video.experiment.C48017a;
import com.p683ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerUnifiedAbConfigExperiment;
import com.p683ss.android.ugc.aweme.video.p2394c.C48005c;
import com.p683ss.android.ugc.aweme.video.p2395d.C48012b;
import com.p683ss.android.ugc.aweme.video.preload.C48072b;
import com.p683ss.android.ugc.aweme.video.preload.C48075e;
import com.p683ss.android.ugc.aweme.video.preload.C48083f;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.android.ugc.p2454f.C48918e;
import com.p683ss.android.ugc.playerkit.p2493b.C50107b;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.session.C50122a;
import com.p683ss.android.ugc.playerkit.session.C50123b;
import com.p683ss.android.ugc.playerkit.session.Session;
import com.p683ss.android.ugc.playerkit.videoview.C50158g;
import com.p683ss.android.ugc.playerkit.videoview.p2497c.C50141a;
import com.p683ss.ugc.aweme.performance.p2586a.C51521b.C51522a;
import com.ss.android.ugc.trill.R;
import com.toutiao.proxyserver.C51895s;
import com.toutiao.proxyserver.p2614f.C51835a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.C53755c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p089g.C2147b;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.e.o */
public final class C30200o extends C30181a implements C38871j {

    /* renamed from: A */
    public C48021h f78798A;

    /* renamed from: B */
    private final WeakReference<C30597ae> f78799B;

    /* renamed from: C */
    private KeyguardManager f78800C;

    /* renamed from: D */
    private boolean f78801D;

    /* renamed from: E */
    private long f78802E = -1;

    /* renamed from: F */
    private long f78803F = -1;

    /* renamed from: G */
    private long f78804G;

    /* renamed from: H */
    private long f78805H;

    /* renamed from: I */
    private long f78806I = -1;

    /* renamed from: J */
    private int f78807J;

    /* renamed from: K */
    private int f78808K;

    /* renamed from: L */
    private long f78809L = -1;

    /* renamed from: M */
    private long f78810M;

    /* renamed from: N */
    private boolean f78811N;

    /* renamed from: O */
    private boolean f78812O;

    /* renamed from: P */
    private long f78813P;

    /* renamed from: Q */
    private long f78814Q;

    /* renamed from: R */
    private long f78815R = -1;

    /* renamed from: S */
    private int f78816S;

    /* renamed from: T */
    private int f78817T;

    /* renamed from: U */
    private String f78818U;

    /* renamed from: V */
    private String f78819V;

    /* renamed from: W */
    private volatile boolean f78820W;

    /* renamed from: X */
    private long f78821X;

    /* renamed from: Y */
    private BroadcastReceiver f78822Y;

    /* renamed from: Z */
    private C2147b f78823Z;

    /* renamed from: a */
    public boolean f78824a;

    /* renamed from: aa */
    private final int f78825aa = PreloadTask.BYTE_UNIT_NUMBER;

    /* renamed from: ab */
    private final double f78826ab = -0.5d;

    /* renamed from: ac */
    private boolean f78827ac = true;

    /* renamed from: ad */
    private double f78828ad;

    /* renamed from: ae */
    private boolean f78829ae;

    /* renamed from: af */
    private String f78830af;

    /* renamed from: ag */
    private String f78831ag;

    /* renamed from: ah */
    private long f78832ah;

    /* renamed from: ai */
    private boolean f78833ai = true;

    /* renamed from: aj */
    private int f78834aj;

    /* renamed from: ak */
    private boolean f78835ak;

    /* renamed from: al */
    private int f78836al;

    /* renamed from: am */
    private boolean f78837am;

    /* renamed from: an */
    private int f78838an;

    /* renamed from: ao */
    private boolean f78839ao;

    /* renamed from: b */
    public boolean f78840b;

    /* renamed from: j */
    public long f78841j = -1;

    /* renamed from: k */
    public long f78842k = -1;

    /* renamed from: l */
    public long f78843l = -1;

    /* renamed from: m */
    public C30178a f78844m;

    /* renamed from: n */
    public int f78845n;

    /* renamed from: o */
    public Aweme f78846o;

    /* renamed from: p */
    public boolean f78847p;

    /* renamed from: q */
    public Aweme f78848q;

    /* renamed from: r */
    public boolean f78849r;

    /* renamed from: s */
    public String f78850s;

    /* renamed from: t */
    public boolean f78851t;

    /* renamed from: u */
    public boolean f78852u;

    /* renamed from: v */
    public C30208a f78853v;

    /* renamed from: w */
    public String f78854w = "";

    /* renamed from: x */
    public String f78855x;

    /* renamed from: y */
    double f78856y = -0.5d;

    /* renamed from: z */
    public boolean f78857z = true;

    /* renamed from: com.ss.android.ugc.aweme.feed.e.o$7 */
    static /* synthetic */ class C302077 {

        /* renamed from: a */
        static final /* synthetic */ int[] f78870a = new int[C50116c.values().length];

        static {
            try {
                f78870a[C50116c.Ijk.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.e.o$a */
    public interface C30208a {
        /* renamed from: a */
        void mo58364a(long j, String str);
    }

    /* renamed from: a */
    private boolean m70869a(Aweme aweme, boolean z) {
        return true;
    }

    /* renamed from: h */
    public final void mo60543h() {
    }

    /* renamed from: k */
    public final String mo60476k() {
        return this.f78760e;
    }

    /* renamed from: a */
    private static boolean m70867a(C30014ae aeVar) {
        return aeVar.mo60247q() == 2;
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
        String str;
        String str2;
        C50117f fVar2 = fVar;
        this.f78836al = C38850c.m86283a();
        this.f78838an = 0;
        this.f78851t = false;
        C25945k.m62922m().mo53900c(mo60471d(), m70901z());
        C22574a.m55738f().mo46921b("feed_ui_to_video", true);
        C22574a.m55738f().mo46917a("feed_video_duration", true);
        MainServiceImpl.createIMainServicebyMonsterPlugin().trackAppsFlyerEvent("video_view", fVar2.f125563a);
        C30597ae q = m70892q();
        C30016ag h = m70889h(fVar2.f125563a);
        C47718bf.m103288a(new C30333b(C31186b.m72815c(h)));
        if (h == null || h.mo54004j() == null) {
            C30434a.m71359a("1", "view holder is null", fVar2.f125563a, m70896u());
        } else if (!mo60474i() || !m70878c(h.mo53999e())) {
            if (!C48069o.m104087I()) {
                mo60548p().mo95293z();
            } else {
                C50158g m = h.mo60242m();
                if (m != null) {
                    m.mo60215af();
                }
            }
            C48039k.m104036a().mo95304b();
            C30434a.m71359a("2", "view invalid or activity onpause", fVar2.f125563a, m70896u());
        } else {
            Aweme e = h.mo53999e();
            if (e != null && !TextUtils.isEmpty(this.f78850s)) {
                C29924q qVar = new C29924q(this.f78850s, 0, mo60548p().mo95256n(), e.getAid());
                C47718bf.m103288a(qVar);
            }
            if (m70892q().mo55834v()) {
                e.getAuthorUid();
            }
            this.f78801D = true;
            this.f78840b = true;
            if (!mo60474i()) {
                C30434a.m71359a("3", "view invalid", fVar2.f125563a, m70896u());
                return;
            }
            h.mo54004j().mo53525a(fVar2);
            if (m70867a(h.mo54004j())) {
                this.f78818U = h.mo53999e().getAid();
                m70895t();
            }
            if (!C31186b.m72817e(h)) {
                C30434a.m71359a("4", "not video viewholder", fVar2.f125563a, m70896u());
                return;
            }
            if (h.mo53999e() != null && h.mo53999e().isVr() && C47990aj.f120627a) {
                C47990aj.m103825a(false);
                C10691a.m21551c((Context) mo60470c(), C23723j.m58219b(R.string.c7t)).mo19066a();
            }
            if (C31186b.m72811a(h)) {
                C25945k.m62917h().mo52106d(h.mo53999e(), mo60471d(), h.mo54004j().mo60254x(), this.f78845n);
            }
            this.f78841j = System.currentTimeMillis();
            this.f78828ad = AudioUtils.m57293a();
            C25908e a = m70859a(h);
            if (a != null) {
                a.mo53239a(1, this.f78845n + 1);
            }
            if (this.f78803F == -1) {
                this.f78802E = System.currentTimeMillis();
            } else {
                this.f78803F = -1;
                this.f78802E = System.currentTimeMillis();
            }
            this.f78842k = -1;
            m70861a(h, 0);
            if (e != null && e.isAd()) {
                this.f78817T = e.getAwemeRawAd().getShowMaskTimes();
            }
            this.f78816S = 0;
            C30367g.m71282a().f79378g = false;
            C30367g.m71282a().f79377f = 0;
            m70877c(h);
            C30367g.m71282a().f79379h = false;
            int awemeType = h.mo53999e() != null ? h.mo53999e().getAwemeType() : 0;
            if (awemeType == 0) {
                String str3 = fVar2.f125563a;
                if (C30436k.m71369a()) {
                    if (C30436k.f79564h.size() > 0) {
                        int size = C30436k.f79564h.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            } else if (TextUtils.equals(str3, ((Aweme) C30436k.f79564h.get(i)).getAid())) {
                                ((Aweme) C30436k.f79564h.get(i)).setCanCache(false);
                                break;
                            } else {
                                i++;
                            }
                        }
                        str2 = "";
                        for (int size2 = C30436k.f79564h.size() - 1; size2 >= 0; size2--) {
                            Aweme aweme = (Aweme) C30436k.f79564h.get(size2);
                            if (!aweme.getCanCache()) {
                                break;
                            }
                            str2 = aweme.getAid();
                        }
                    } else {
                        str2 = "";
                    }
                    C23542f.m57715a().mo48709b("feed_cached_index", str2);
                }
            }
            String str4 = fVar2.f125563a;
            C30158b.m70764a(this.f78761f, str4, awemeType, e);
            C30158b.m70765a(e);
            if (TextUtils.equals("from_follow_often_watch", mo60473f()) && OftenWatchReportFastStatsSetting.enabled()) {
                C2201v.m6601a((C2205y<T>) new C30177d<T>(this.f78761f, str4, awemeType)).mo6529b(C2168a.m6521b()).mo6551j();
            }
            if (C31186b.m72815c(h)) {
                C26890h.onEvent(MobClick.obtain().setEventName("ad_play").setExtValueString(h.mo53999e().getAid()).setJsonObject(new C23088c().mo47824a("request_id", m70896u().optString("request_id")).mo47825b()));
            }
            int i2 = this.f78761f;
            String str5 = this.f78760e;
            C30219z zVar = r0;
            String str6 = str5;
            C30219z zVar2 = new C30219z(this, i2, h, fVar, q, str5, e);
            C0013i.m18a((Callable<TResult>) zVar, (Executor) C26890h.m65003a());
            String str7 = fVar2.f125563a;
            String str8 = "";
            if (h != null && TextUtils.equals(C23198ae.m56877m(h.mo53999e()), str7)) {
                str8 = C23198ae.m56846a(h.mo53999e());
            }
            this.f78819V = str8;
            Aweme e2 = h.mo53999e();
            Context d = mo60471d();
            if (!this.f78820W) {
                if (d instanceof Activity) {
                    Intent intent = ((Activity) d).getIntent();
                    if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                        str = intent.getStringExtra("rule_id");
                        C30182aa aaVar = new C30182aa(this, e2, str6, q, i2, e, str);
                        C0013i.m18a((Callable<TResult>) aaVar, (Executor) C26890h.m65003a());
                    }
                }
                str = null;
                C30182aa aaVar2 = new C30182aa(this, e2, str6, q, i2, e, str);
                C0013i.m18a((Callable<TResult>) aaVar2, (Executor) C26890h.m65003a());
            }
            if (q != null) {
                q.mo60506Y();
            }
            if (!h.mo53999e().isLive() && q != null && q.mo62788as()) {
                h.mo54004j().mo60256z();
            }
            Video video = h.mo53999e().getVideo();
            if (video != null) {
                C0013i.m18a((Callable<TResult>) new C30183ab<TResult>(video, h, fVar2), (Executor) C26890h.m65003a());
                if (fVar2.f125564b) {
                    m70863a(video, true);
                }
            }
            this.f78844m.f78757a = 2;
            m70864a(new C43893g(0, fVar2.f125565c));
            if (this.f78847p) {
                String str9 = fVar2.f125563a;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("source_id", str9);
                } catch (JSONException unused) {
                }
                C23131p.m57776a("aweme_screen_ad_open_media_error_rate", 0, jSONObject);
            }
            if (q != null) {
                q.ax_();
                q.mo60514af();
            }
            C22574a.m55738f().mo46921b("feed_video_duration", true);
            C22574a.m55738f().mo46917a("feed_video_to_total", true);
            C30367g.m71282a().f79375d = false;
            C36546c.m82442a("video_play");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo60529a(int i, C30016ag agVar, C50117f fVar, C30597ae aeVar, String str, Aweme aweme) throws Exception {
        int i2 = i;
        C50117f fVar2 = fVar;
        C30597ae aeVar2 = aeVar;
        String str2 = str;
        if (i2 == 0) {
            JSONObject d = m70880d(agVar);
            try {
                d.put("feed_count", C22930ah.m56380a().mo47705b());
                d.put("play_order", this.f78836al);
            } catch (Exception unused) {
            }
            C26890h.onEvent(MobClick.obtain().setEventName("video_play").setLabelName("homepage_hot").setValue(fVar2.f125563a).setJsonObject(d));
        } else if (Math.abs(i2 - 1000) < 100) {
            JSONObject u = m70896u();
            u.put("play_order", this.f78836al);
            C26890h.m65006a(mo60471d(), "video_play", "personal_homepage", fVar2.f125563a, 0, u);
        } else if (Math.abs(i2 - 8000) < 100) {
            JSONObject u2 = m70896u();
            u2.put("play_order", this.f78836al);
            C26890h.m65006a(mo60471d(), "video_play", "toplist_friend", fVar2.f125563a, 0, u2);
            C26890h.m65006a(mo60471d(), "show", "toplist_friend", fVar2.f125563a, 0, m70896u());
        } else if (Math.abs(i2 - 2000) < 100) {
            JSONObject u3 = m70896u();
            u3.put("play_order", this.f78836al);
            if (TextUtils.equals("update_tips", mo60476k())) {
                C26890h.m65006a(mo60471d(), "video_play", "update_tips", fVar2.f125563a, 0, u3);
            } else {
                C23088c a = C23088c.m56632a(u3);
                if (aeVar2 != null) {
                    a.mo47824a("enter_from_request", aeVar.mo60490L());
                }
                C26890h.m65006a(mo60471d(), "video_play", "others_homepage", fVar2.f125563a, 0, a.mo47825b());
            }
        } else if (TextUtils.equals(str2, C36649a.m82555a())) {
            MobClick value = MobClick.obtain().setEventName("video_play").setLabelName(this.f78760e).setValue(C23198ae.m56877m(aweme));
            if (aeVar2 != null) {
                String specialTopicRegion = aeVar.mo60501W().getSpecialTopicRegion();
                C23088c c = aeVar2.mo60504c(aweme);
                String str3 = "region";
                if (TextUtils.isEmpty(specialTopicRegion)) {
                    specialTopicRegion = "";
                }
                value.setJsonObject(c.mo47824a(str3, specialTopicRegion).mo47825b());
            }
            C26890h.onEvent(value);
        } else if (TextUtils.equals(str2, "opus")) {
            C30434a.m71359a("6", "page type not match", fVar2.f125563a, m70896u());
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo60532a(Aweme aweme, String str, C30597ae aeVar, int i, Aweme aweme2, String str2) throws Exception {
        if (aweme != null) {
            C23217av c = ((C23217av) new C23217av().mo48022a(this.f78762g).mo48025b(str).mo48100j(aeVar.mo55772A())).mo48026c(aweme, i);
            c.f61820Q = aeVar.mo60501W().getChallengeId();
            c.f61819P = String.valueOf(aeVar.mo60520al());
            C23217av f = ((C23217av) c.mo48027c(aeVar.mo60501W().getProcessId()).mo48098a(Boolean.valueOf(C31190f.m72834b(aweme)))).mo48020a(this.f78836al).mo48032f(C48069o.m104089K().name());
            boolean z = true;
            if (aeVar != null) {
                ((C23217av) ((C23217av) f.mo48029d(aeVar.mo60491M()).mo48100j(aeVar.mo55772A())).mo48101k(C23198ae.m56854b(aweme2, this.f78761f))).mo48021a(aeVar.mo60501W()).mo48035h(aeVar.mo60493O());
                if (!TextUtils.isEmpty(aeVar.mo60494P())) {
                    f.mo48033g(aeVar.mo60494P());
                }
                if ("poi_page".equalsIgnoreCase(str) || "poi_map".equalsIgnoreCase(str)) {
                    f.mo48033g((!aeVar.mo62789at() || this.f78829ae) ? "slide" : "click");
                    this.f78829ae = true;
                }
                f.f61822S = aeVar.mo58359J();
                f.f61823T = aeVar.mo58357H();
                f.f61824U = aeVar.mo58358I();
            }
            if (!(aeVar == null || aeVar.mo60501W() == null)) {
                f.mo48103m(aeVar.mo60501W().getSearchResultId());
                f.mo48105o(aeVar.mo60501W().getListItemId());
                f.mo48104n(aeVar.mo60501W().getListResultType());
                f.mo48106p(aeVar.mo60501W().getSearchThirdItemId());
                f.mo48031e(aeVar.mo60501W().getSearchKeyword());
                f.mo48046q(aeVar.mo60501W().getmImprId());
                f.mo48107r(aeVar.mo60501W().getSearchId());
            }
            f.mo48076e();
            if (!TextUtils.isEmpty(str2)) {
                C23217av avVar = (C23217av) new C23217av("video_play_from_push").mo48025b(str).mo48022a(this.f78762g).mo48020a(this.f78836al).mo48036s(str2).mo48098a(Boolean.valueOf(C31190f.m72834b(aweme2)));
                if (aeVar != null && !TextUtils.isEmpty(aeVar.mo60494P())) {
                    f.mo48033g(aeVar.mo60494P());
                }
                avVar.mo48076e();
            }
            String str3 = "";
            if (aeVar != null) {
                str3 = aeVar.mo60491M();
            }
            if (TextUtils.equals(str3, "search_result") || TextUtils.equals(str3, "general_search") || TextUtils.equals(str3, "search_for_you_list")) {
                C28423z y = C23794bh.m58411y();
                String str4 = "search_video_play";
                if (!TextUtils.equals(str3, "search_result") && !TextUtils.equals(str3, "search_for_you_list")) {
                    z = false;
                }
                y.mo56821a(str4, aweme2, str, z);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        String str2 = str;
        if (mo60474i()) {
            Aweme aweme = null;
            this.f78830af = null;
            C30597ae q = m70892q();
            if (this.f78851t) {
                this.f78803F = -1;
                this.f78842k = -1;
                this.f78802E = System.currentTimeMillis();
            }
            this.f78851t = false;
            this.f78840b = true;
            C23794bh.m58408v().mo49234a(3, false);
            C53755c a = C53755c.m114319a();
            C31134e eVar = new C31134e(m70901z(), this.f78760e, this.f78761f, 2, q);
            a.mo112960d(eVar);
            m70899x();
            this.f78828ad = AudioUtils.m57293a();
            final C30016ag h = m70889h(str);
            if (this.f78837am || mo60470c() == null || !C30398t.m71322b(mo60470c()) || !TextUtils.equals(str2, C30367g.m71282a().f79373b)) {
                this.f78841j = System.currentTimeMillis();
            } else {
                long j = 0;
                if (this.f78841j == -1) {
                    this.f78841j = System.currentTimeMillis();
                    j = Long.MAX_VALUE;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (this.f78841j > 0 && this.f78841j <= currentTimeMillis) {
                        j = currentTimeMillis - this.f78841j;
                    }
                }
                if (m70885f(h)) {
                    if (TextUtils.equals(mo60476k(), "general_search")) {
                        this.f78846o = m70886g(h);
                        m70861a(h, j);
                    }
                    m70877c(h);
                    C31124c cVar = new C31124c(h.mo53999e(), mo60476k(), this.f78761f, null, q);
                    C47718bf.m103288a(cVar);
                    C47718bf.m103288a(new C30329at(h.mo53999e(), mo60476k(), this.f78761f));
                }
            }
            if (!(this.f78846o == null || !this.f78846o.isAd() || this.f78846o.getAwemeRawAd() == null)) {
                this.f78817T = this.f78846o.getAwemeRawAd().getShowMaskTimes();
                this.f78816S = C30367g.m71282a().f79377f;
            }
            if (h != null) {
                aweme = h.mo53999e();
            }
            if (aweme != null && !TextUtils.isEmpty(this.f78850s)) {
                C29924q qVar = new C29924q(this.f78850s, 0, mo60548p().mo95256n(), aweme.getAid());
                C47718bf.m103288a(qVar);
            }
            this.f78837am = true;
            this.f78818U = str2;
            if (m70885f(h)) {
                h.mo54004j().mo53527a(str2);
                if (!this.f78811N && q != null) {
                    q.mo60506Y();
                }
                if (h.mo53999e().isLive()) {
                    m70895t();
                } else if (q != null) {
                    q.mo60508a(new Runnable() {
                        public final void run() {
                            if (C30200o.this.mo60474i()) {
                                h.mo54004j().mo60255y();
                            }
                        }
                    }, 400);
                }
                if (q != null) {
                    q.mo60507Z();
                }
            }
            this.f78844m.f78757a = 2;
            m70864a(new C43893g(3));
            new C23240j().mo48076e();
            C30578o.m71566a(C29988ad.FEED);
            if (this.f78811N) {
                this.f78813P = SystemClock.elapsedRealtime();
            }
            if (this.f78812O) {
                this.f78814Q = SystemClock.elapsedRealtime();
            }
        }
    }

    /* renamed from: a */
    public final C30016ag mo60527a() {
        C30597ae q = m70892q();
        if (q == null) {
            return null;
        }
        return q.mo60518aj();
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        C30515a.m71483b().mo62713c();
        C51522a.m110657b().mo103704b("first_refresh");
        if (mo60471d() != null) {
            C23794bh.m58408v().mo49234a(4, false);
            mo60541f(str);
            this.f78844m.f78757a = 3;
            C30016ag a = mo60527a();
            if (!(a == null || a.mo54004j() == null)) {
                a.mo54004j().mo53531b(str);
                if (!C48069o.m104087I()) {
                    mo60548p().mo95269F();
                } else {
                    C50158g m = a.mo60242m();
                    if (m != null) {
                        m.mo60218ai();
                    }
                }
            }
            Aweme e = a != null ? a.mo53999e() : null;
            if (e != null && !TextUtils.isEmpty(this.f78850s)) {
                C29924q qVar = new C29924q(this.f78850s, 1, mo60548p().mo95256n(), e.getAid());
                C47718bf.m103288a(qVar);
            }
            C43893g gVar = new C43893g(4);
            gVar.f111165f = str;
            m70864a(gVar);
            this.f78842k = System.currentTimeMillis();
            this.f78827ac = false;
        }
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
        String str;
        long j;
        Session c = C50122a.m108112a().mo97902c(dVar.f125523a);
        if (c != null) {
            C50123b c2 = C50141a.m108193a().mo97944c(c.key);
            if (c2 != null) {
                c2.f125610e = true;
            }
        }
        C30016ag h = m70889h(dVar.f125523a);
        if (mo60474i()) {
            if (m70885f(h) && C9431p.m18665a(h.mo53999e().getAid(), dVar.f125523a)) {
                C30014ae j2 = h.mo54004j();
                if (m70867a(j2)) {
                    j2.mo53524a(dVar);
                } else if (C31186b.m72817e(h)) {
                    C25945k.m62923n().mo54136a(h.mo53999e(), dVar);
                    if (dVar.f125525c && h.mo53999e().getVideo().getVideoModelStr() != null) {
                        h.mo53999e().getVideo().setRationAndSourceId(m70890h(h));
                        if (!C48121w.m104087I()) {
                            this.f78801D = false;
                            mo60548p().mo95281a(j2.mo60253w());
                            mo60548p().mo95276a(h.mo53999e().getVideo(), true, 0, true, false);
                            m70865a(dVar, h);
                        }
                    } else if (dVar.f125524b) {
                        h.mo53999e().getVideo().setRationAndSourceId(m70890h(h));
                        m70863a(h.mo53999e().getVideo(), false);
                        if (!C48069o.m104087I()) {
                            this.f78801D = false;
                            mo60548p().mo95281a(j2.mo60253w());
                            mo60548p().mo95278a(h.mo53999e().getVideo().getPlayAddrH264(), true, true, h.mo53999e().getVideo().isNeedSetCookie());
                            m70865a(dVar, h);
                        }
                    } else {
                        if (dVar.f125528f instanceof String) {
                            str = (String) dVar.f125528f;
                        } else {
                            str = C23723j.m58219b(R.string.cpc);
                        }
                        C10691a.m21545b((Context) mo60470c(), str).mo19066a();
                        j2.mo53524a(dVar);
                        C30597ae q = m70892q();
                        if (q != null) {
                            q.mo60506Y();
                        }
                        m70865a(dVar, h);
                        Video video = h.mo53999e().getVideo();
                        if (!(video == null || video.getPlayAddr() == null)) {
                            if (this.f78821X != 0) {
                                j = SystemClock.elapsedRealtime() - this.f78821X;
                                this.f78821X = 0;
                            } else {
                                j = 0;
                            }
                            new C38841a().mo78815a(String.valueOf(j)).mo78812a(mo60472e()).mo78814a(video).mo78813a(h).mo78811a(0).mo78816b(m70897v()).f98898a.mo78810a();
                            C18842a.m45932a(new C30184ac(this, dVar, video, h));
                            if (q != null) {
                                q.mo62790b(0);
                            }
                            this.f78821X = 0;
                        }
                    }
                }
            }
            m70864a(new C43893g(1));
        }
        if (!(h == null || h.mo54004j() == null)) {
            if (!C48069o.m104087I()) {
                mo60548p().mo95269F();
            } else {
                C50158g m = h.mo60242m();
                if (m != null) {
                    m.mo60218ai();
                }
            }
        }
        if (this.f78847p) {
            String str2 = dVar.f125523a;
            int i = dVar.f125526d;
            int i2 = dVar.f125527e;
            Object obj = dVar.f125528f;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("source_id", str2);
            } catch (JSONException unused) {
            }
            C23131p.m57776a("aweme_screen_ad_open_media_error_rate", 1, jSONObject);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo60538a(C50112d dVar, Video video, C30016ag agVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sourceId", dVar.f125523a);
            jSONObject3.put("errorCode", dVar.f125526d);
            jSONObject3.put("errorExtra", dVar.f125527e);
            jSONObject3.put("netWorkQuality", C14460b.m29586a().mo26625b().toString());
            jSONObject3.put("netWorkSpeed", (int) C14460b.m29586a().mo26626c());
            jSONObject3.put("playUrl", JSON.toJSONString(video.getProperPlayAddr()));
            jSONObject3.put("playUrlIsLowBr", video.isLowBr());
            jSONObject3.put("video_duration", video.getDuration());
            C48005c.m103856a(jSONObject3);
            if (dVar.f125528f != null) {
                jSONObject3.put("extraInfo", dVar.f125528f.toString());
            }
            File a = C48016e.m103933a(C48016e.m103940b(), "cache");
            video.getProperPlayAddr();
            String str2 = "file";
            if (a == null) {
                str = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(a.getPath());
                sb.append("/");
                sb.append(C51835a.m111161a(video.getPlayAddr().getBitRatedRatioUri()));
                str = new C43929l("file", sb.toString()).toString();
            }
            jSONObject3.put(str2, str);
            jSONObject = new JSONObject(jSONObject3.toString());
        } catch (JSONException unused) {
            jSONObject = null;
        }
        C26890h.onEvent(MobClick.obtain().setEventName("play_error").setLabelName("perf_monitor").setJsonObject(jSONObject));
        if (C31186b.m72815c(agVar)) {
            try {
                jSONObject2 = new JSONObject(jSONObject3.toString());
                jSONObject2.put("aweme_id", agVar.mo53999e().getAid());
                jSONObject2.put("creative_id", agVar.mo53999e().getAwemeRawAd().getCreativeId());
            } catch (Exception unused2) {
                jSONObject2 = new JSONObject();
            }
            C26086j.m57776a("aweme_ad_media_play_error_rate", 1, jSONObject2);
            C26086j.m57776a("aweme_ad_media_play_error", 1, jSONObject2);
            C25945k.m62911b().mo53148l(mo60471d(), agVar.mo53999e());
        }
        if (C30186ae.m70807a(mo60471d())) {
            C23131p.m57776a("aweme_media_error_rate", 1, jSONObject3);
            if (C31186b.m72816d(agVar)) {
                C26033a.m63093a(agVar.mo53999e(), 1, 1);
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("alarm_reason", "fail_to_play");
                    if (agVar.mo53999e() != null) {
                        jSONObject4.put("group_id", agVar.mo53999e().getAid());
                    }
                } catch (Exception unused3) {
                }
                C26890h.onEvent(MobClick.obtain().setEventName("ad_alarm").setLabelName("homepage_hot").setJsonObject(jSONObject4));
            }
            C23131p.m57776a(VideoBitRateABManager.m103801c().mo95132d() ? "aweme_media_bitrated_error_rate" : "aweme_media_original_error_rate", 1, jSONObject3);
        }
        C23131p.m56692a("aweme_media_play_error_log", "play_error", jSONObject3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo60530a(long j, long j2, boolean z, C30016ag agVar, String str, String str2) throws Exception {
        C26898j a = new C26898j().mo54849a("request_id", m70896u().optString("request_id"));
        String str3 = "duration";
        long j3 = 0;
        if (j > 0) {
            j3 = j2 - j;
        }
        C26898j a2 = a.mo54849a(str3, Long.toString(j3));
        String str4 = "is_first";
        int i = z ? -1 : C23223a.m57037a() ? 1 : 0;
        JSONObject a3 = a2.mo54849a(str4, String.valueOf(i)).mo54849a("group_id", agVar.mo53999e().getAid()).mo54849a("is_from_feed_cache", String.valueOf(z ? 1 : 0)).mo54849a("top_activity", str).mo54849a("feed_tab", str2).mo54850a();
        try {
            a3.put("preloader_type", C48017a.m103960b());
        } catch (Exception e) {
            C9220a.m18311a((Throwable) e);
        }
        C26890h.onEvent(MobClick.obtain().setEventName("video_request").setLabelName("perf_monitor").setValue(agVar.mo53999e().getAid()).setJsonObject(a3));
        C26890h.m65012a("video_request", a3);
        C23223a.m57035a("video_request", a3);
        C22572b.m55734b("video_request", a3);
        return null;
    }

    /* renamed from: a */
    public final void mo53529a(boolean z) {
        m70866a(z, false);
    }

    /* renamed from: a */
    private void m70866a(boolean z, boolean z2) {
        if (this.f78801D) {
            C30016ag a = mo60527a();
            if (C31186b.m72817e(a)) {
                this.f78812O = z;
                if (z) {
                    this.f78808K++;
                    if (this.f78809L == -1) {
                        this.f78809L = SystemClock.elapsedRealtime();
                    }
                } else if (this.f78809L != -1) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.f78809L;
                    this.f78810M += elapsedRealtime;
                    this.f78809L = -1;
                    if (!z2 && elapsedRealtime >= ((long) C10181b.m20511a().mo18168a(VideoBufferingThresholdExperiment.class, true, "video_buffering_threshold", 31744, 0))) {
                        m70871b(a, elapsedRealtime, "resume", false);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
        C30016ag a = mo60527a();
        if (!(a == null || a.mo54004j() == null)) {
            a.mo54004j().mo53532b(z);
        }
        this.f78811N = z;
        m70874b(z, false);
        if (a != null && a.mo54004j() != null && this.f78801D && C31186b.m72811a(a)) {
            if (z) {
                C25945k.m62917h().mo52104b(a.mo53999e(), mo60471d(), a.mo54004j().mo60254x(), this.f78845n);
                return;
            }
            C25945k.m62917h().mo52105c(a.mo53999e(), mo60471d(), a.mo54004j().mo60254x(), this.f78845n);
        }
    }

    /* renamed from: a */
    public final void mo53523a(float f) {
        int i;
        Aweme z = m70901z();
        C30597ae q = m70892q();
        if (z != null) {
            C30016ag a = mo60527a();
            if (!(a == null || a.mo54004j() == null)) {
                a.mo54004j().mo53523a(f);
            }
            if (z.getVideoControl() != null && z.getVideoControl().showProgressBar == 1 && !FeedPlayerCleanOptimize.m70946a()) {
                C53755c a2 = C53755c.m114319a();
                C31125d dVar = new C31125d(z, this.f78760e, this.f78761f, f, q);
                a2.mo112960d(dVar);
            }
            Video video = z.getVideo();
            if (video != null) {
                i = video.getDuration();
                if (i <= 0) {
                    return;
                }
            } else {
                i = 0;
            }
            double d = (double) ((((float) i) * (f / 100.0f)) / 1000.0f);
            if (this.f78856y < Math.floor(d) && q != null) {
                z.getAid();
                Math.floor(d);
            }
            this.f78856y = d;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo60531a(C30016ag agVar, long j, String str, boolean z) throws Exception {
        JSONObject c = m70876c(agVar, j, str, z);
        if (c != null) {
            C22572b.m55734b(z ? "video_block" : "video_decoder_block", c);
            if (!(!z || agVar == null || agVar.mo53999e() == null || agVar.mo53999e().getVideo() == null)) {
                VideoUrlModel playAddr = agVar.mo53999e().getVideo().getPlayAddr();
                if (playAddr != null) {
                    C48075e k = C48107j.m104193f().mo95412k(playAddr);
                    if (k != null) {
                        try {
                            c.put("video_cache_read_time", (double) ((((float) k.f120801a) * 1.0f) / ((float) k.f120803c)));
                            c.put("video_cache_read_size", (double) ((((float) k.f120802b) * 1.0f) / ((float) k.f120803c)));
                            c.put("video_cache_read_cnt", k.f120803c);
                            c.put("video_cache_use_ttnet", C51895s.f129475j);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            C23131p.m57779a(z ? "aweme_block_bitrate_netspeed_log" : "aweme_block_decoder_log", c);
            if (C41631k.m91508c() && z) {
                c.put("traffic_economy_mode", C41631k.f105364a.mo85387d());
            }
            C26890h.m65012a(z ? "video_block" : "video_decoder_block", c);
            String str2 = "block";
            C52711k.m112240b(str2, "type");
            C31296a a = C30199n.m70855a();
            if (a != null) {
                a.mo64182a(str2);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8 A[LOOP:0: B:27:0x00a2->B:29:0x00a8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0126 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0127  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53526a(com.p683ss.android.ugc.playerkit.p2494c.C50118g r35) {
        /*
            r34 = this;
            r0 = r34
            r7 = r35
            boolean r1 = r0.f78852u
            r8 = 1
            if (r1 != 0) goto L_0x0014
            r0.f78852u = r8
            com.ss.android.ugc.aweme.ml.o r1 = com.p683ss.android.ugc.aweme.p1963ml.C37120o.m83349a()
            com.ss.android.ugc.aweme.ml.p r1 = r1.f94768a
            r1.mo40670f()
        L_0x0014:
            r9 = 0
            r11 = 0
            com.p683ss.android.ugc.aweme.comment.p1524i.C25209c.m61303a(r11, r9)
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.f78815R = r1
            com.ss.android.ugc.aweme.al r1 = com.p683ss.android.ugc.aweme.C23794bh.m58409w()
            r1.mo46906b()
            com.ss.android.ugc.aweme.an.a r1 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r2 = "feed_video_to_total"
            r1.mo46921b(r2, r8)
            com.ss.android.ugc.aweme.an.a r1 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r2 = "feed_total"
            r1.mo46921b(r2, r8)
            com.ss.android.ugc.aweme.an.a r1 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            boolean r2 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55736c()
            if (r2 != 0) goto L_0x0071
            boolean r2 = r1.f60703d
            if (r2 == 0) goto L_0x0098
            java.util.Map<java.lang.String, java.lang.Long> r2 = r1.f60701b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0055
            boolean r2 = r1.f60704e
            if (r2 != 0) goto L_0x0055
            r2 = 0
            goto L_0x0059
        L_0x0055:
            boolean r2 = r1.mo46925d()
        L_0x0059:
            if (r2 == 0) goto L_0x0098
            boolean r2 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55737e()
            if (r2 != 0) goto L_0x0098
            boolean r2 = r1.f60704e
            if (r2 == 0) goto L_0x006b
            java.lang.String r2 = "first_feed_show_time_v3_cache"
            r1.mo46923c(r2)
            goto L_0x0083
        L_0x006b:
            java.lang.String r2 = "first_feed_show_time_v3"
            r1.mo46923c(r2)
            goto L_0x0083
        L_0x0071:
            boolean r2 = r1.f60705f
            if (r2 == 0) goto L_0x007b
            java.lang.String r2 = "first_feed_show_time_new_user_v4"
            r1.mo46923c(r2)
            goto L_0x0080
        L_0x007b:
            java.lang.String r2 = "first_feed_show_time_new_user"
            r1.mo46923c(r2)
        L_0x0080:
            com.p683ss.android.ugc.aweme.p1341an.C22574a.m55737e()
        L_0x0083:
            r1.mo46914a()
            r1.mo46919b()
            java.util.Map<java.lang.String, java.lang.Long> r2 = r1.f60700a
            r2.clear()
            java.util.Map<java.lang.String, java.lang.Long> r2 = r1.f60701b
            r2.clear()
            java.util.Map<java.lang.String, java.lang.Long> r1 = r1.f60702c
            r1.clear()
        L_0x0098:
            com.ss.android.ugc.aweme.feed.x r1 = com.p683ss.android.ugc.aweme.feed.C31253x.m72966a()
            java.util.List<java.lang.Object> r1 = r1.f81864a
            java.util.Iterator r1 = r1.iterator()
        L_0x00a2:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ac
            r1.next()
            goto L_0x00a2
        L_0x00ac:
            r0.f78851t = r11
            com.ss.android.ugc.aweme.feed.panel.ae r12 = r34.m70892q()
            com.ss.android.ugc.aweme.feed.ui.seekbar.c r13 = new com.ss.android.ugc.aweme.feed.ui.seekbar.c
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r34.m70901z()
            java.lang.String r3 = r0.f78760e
            int r4 = r0.f78761f
            r1 = r13
            r5 = r35
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r13)
            com.ss.android.ugc.aweme.feed.h.at r1 = new com.ss.android.ugc.aweme.feed.h.at
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r34.m70901z()
            java.lang.String r3 = r0.f78760e
            int r4 = r0.f78761f
            r1.<init>(r2, r3, r4)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r1)
            com.ss.android.ugc.aweme.bd r1 = com.p683ss.android.ugc.aweme.C23794bh.m58408v()
            r2 = 9
            r1.mo49234a(r2, r11)
            java.lang.String r14 = r7.f125566a
            r0.f78831ag = r14
            com.ss.android.ugc.playerkit.session.a r1 = com.p683ss.android.ugc.playerkit.session.C50122a.m108112a()
            com.ss.android.ugc.playerkit.session.Session r1 = r1.mo97900b()
            if (r1 == 0) goto L_0x00ff
            com.ss.android.ugc.playerkit.videoview.c.a r2 = com.p683ss.android.ugc.playerkit.videoview.p2497c.C50141a.m108193a()
            java.lang.String r1 = r1.key
            com.ss.android.ugc.playerkit.session.b r1 = r2.mo97944c(r1)
            if (r1 == 0) goto L_0x00ff
            long r2 = java.lang.System.currentTimeMillis()
            r1.f125606a = r2
        L_0x00ff:
            com.ss.android.ugc.aweme.shortvideo.ao r1 = com.p683ss.android.ugc.aweme.shortvideo.C42424ao.INSTANCE
            r1.setVideoId(r14)
            r34.m70899x()
            com.ss.android.ugc.aweme.feed.adapter.ag r1 = r0.m70889h(r14)
            if (r1 == 0) goto L_0x0396
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r1.mo53999e()
            if (r2 == 0) goto L_0x0396
            com.ss.android.ugc.aweme.feed.adapter.ae r2 = r1.mo54004j()
            if (r2 == 0) goto L_0x0396
            com.ss.android.ugc.aweme.feed.adapter.ae r2 = r1.mo54004j()
            r2.mo53526a(r7)
            boolean r2 = com.p683ss.android.ugc.aweme.feed.utils.C31186b.m72817e(r1)
            if (r2 != 0) goto L_0x0127
            return
        L_0x0127:
            com.ss.android.ugc.aweme.bd r2 = com.p683ss.android.ugc.aweme.C23794bh.m58408v()
            boolean r2 = r2.mo49245b()
            if (r2 == 0) goto L_0x0148
            boolean r2 = com.p683ss.android.ugc.aweme.video.C48069o.m104087I()
            if (r2 != 0) goto L_0x013f
            com.ss.android.ugc.aweme.video.h r2 = r34.mo60548p()
            r2.mo95293z()
            goto L_0x0148
        L_0x013f:
            com.ss.android.ugc.playerkit.videoview.g r2 = r1.mo60242m()
            if (r2 == 0) goto L_0x0148
            r2.mo60215af()
        L_0x0148:
            com.ss.android.ugc.aweme.shortvideo.i.g r2 = new com.ss.android.ugc.aweme.shortvideo.i.g
            r3 = 5
            r2.<init>(r3)
            com.ss.android.ugc.aweme.video.h r3 = r34.mo60548p()
            long r3 = r3.mo95256n()
            java.lang.String r5 = r34.mo60473f()
            boolean r5 = com.p683ss.android.ugc.aweme.detail.C27333f.m65865a(r5)
            if (r5 != 0) goto L_0x016a
            java.lang.String r5 = "from_mix_video"
            java.lang.String r6 = r0.f78762g
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 == 0) goto L_0x0170
        L_0x016a:
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x0170
            r2.f111161b = r3
        L_0x0170:
            r0.m70864a(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r1.mo53999e()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "preloadApi "
            r3.<init>(r4)
            java.lang.String r4 = r2.getAid()
            r3.append(r4)
            com.ss.android.ugc.aweme.feed.model.Preload r3 = r2.getPreload()
            if (r3 != 0) goto L_0x01b0
            com.ss.android.ugc.aweme.ml.d r3 = com.p683ss.android.ugc.aweme.p1963ml.C37105d.m83336a()
            boolean r3 = r3.mo76385b()
            if (r3 != 0) goto L_0x019f
            com.ss.android.ugc.aweme.ml.l r3 = com.p683ss.android.ugc.aweme.p1963ml.C37115l.m83346a()
            boolean r3 = r3.mo76390b()
            if (r3 == 0) goto L_0x01b0
        L_0x019f:
            com.ss.android.ugc.aweme.feed.model.Preload r3 = new com.ss.android.ugc.aweme.feed.model.Preload
            r3.<init>()
            r2.setPreload(r3)
            com.ss.android.ugc.aweme.feed.e.x r3 = new com.ss.android.ugc.aweme.feed.e.x
            r3.<init>(r0, r2)
            p001a.C0013i.m16a(r3)
            goto L_0x01be
        L_0x01b0:
            com.ss.android.ugc.aweme.feed.model.Preload r3 = r2.getPreload()
            if (r3 == 0) goto L_0x01be
            com.ss.android.ugc.aweme.feed.e.o$5 r3 = new com.ss.android.ugc.aweme.feed.e.o$5
            r3.<init>(r2)
            p001a.C0013i.m16a(r3)
        L_0x01be:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r1.mo53999e()
            com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()
            if (r2 == 0) goto L_0x0396
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r3 = r2.getPlayAddr()
            if (r3 == 0) goto L_0x0396
            com.ss.android.ugc.aweme.video.preload.j r4 = com.p683ss.android.ugc.aweme.video.preload.C48107j.m104193f()
            android.util.LruCache<java.lang.String, java.lang.Long> r5 = r4.f120913a
            java.lang.String r6 = r3.getUri()
            java.lang.Object r5 = r5.get(r6)
            if (r5 == 0) goto L_0x01eb
            com.ss.android.ugc.aweme.video.preload.j$1 r5 = new com.ss.android.ugc.aweme.video.preload.j$1
            r5.<init>()
            java.util.concurrent.ExecutorService r4 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r5, r4)
            goto L_0x01f7
        L_0x01eb:
            com.ss.android.ugc.aweme.video.preload.j$2 r5 = new com.ss.android.ugc.aweme.video.preload.j$2
            r5.<init>()
            java.util.concurrent.ExecutorService r4 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r5, r4)
        L_0x01f7:
            long r4 = r0.f78821X
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0396
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r9 = r0.f78821X
            long r4 = r4 - r9
            boolean r6 = com.p683ss.android.ugc.aweme.player.sdk.C38854a.f98960a
            if (r6 == 0) goto L_0x022e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "onRenderFirstFrame aid: "
            r6.<init>(r9)
            r6.append(r14)
            java.lang.String r9 = " ,duration: "
            r6.append(r9)
            r6.append(r4)
            java.lang.String r9 = " ,prepareCacheSize: "
            r6.append(r9)
            int r9 = r0.f78834aj
            r6.append(r9)
            java.lang.String r9 = " ,h265: "
            r6.append(r9)
            boolean r9 = r7.f125567b
            r6.append(r9)
        L_0x022e:
            r0.f78832ah = r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.util.concurrent.Callable r5 = com.p683ss.android.ugc.aweme.feed.p1719e.C30212s.f78884a
            java.util.concurrent.ExecutorService r6 = com.p683ss.android.ugc.aweme.p1468bu.C24076h.m58904e()
            p001a.C0013i.m18a(r5, r6)
            com.ss.android.ugc.aweme.player.a.e$a r5 = new com.ss.android.ugc.aweme.player.a.e$a
            r5.<init>()
            com.ss.android.ugc.aweme.player.a.e$a r5 = r5.mo78815a(r4)
            android.support.v4.app.Fragment r6 = r34.mo60472e()
            com.ss.android.ugc.aweme.player.a.e$a r5 = r5.mo78812a(r6)
            com.ss.android.ugc.aweme.player.a.e$a r2 = r5.mo78814a(r2)
            com.ss.android.ugc.aweme.player.a.e$a r2 = r2.mo78813a(r1)
            com.ss.android.ugc.aweme.player.a.e$a r2 = r2.mo78811a(r8)
            java.lang.String r5 = r34.m70897v()
            com.ss.android.ugc.aweme.player.a.e$a r2 = r2.mo78816b(r5)
            com.ss.android.ugc.aweme.player.a.e r2 = r2.f98898a
            r2.mo78810a()
            com.ss.android.ugc.aweme.player.a.d$a r2 = new com.ss.android.ugc.aweme.player.a.d$a
            r2.<init>()
            com.ss.android.ugc.aweme.feed.adapter.ag r5 = r0.m70889h(r14)
            if (r5 == 0) goto L_0x027c
            com.ss.android.ugc.aweme.feed.helper.e r5 = r5.mo60185J()
            if (r5 == 0) goto L_0x027c
            com.ss.android.ugc.aweme.player.a.d r6 = r2.f98888a
            r6.f98876n = r5
        L_0x027c:
            com.ss.android.ugc.aweme.player.a.d r5 = r2.f98888a
            r5.f98864b = r1
            com.ss.android.ugc.aweme.player.a.d r5 = r2.f98888a
            r5.f98863a = r3
            com.ss.android.ugc.aweme.player.a.d r5 = r2.f98888a
            r5.f98871i = r7
            android.content.Context r5 = r34.mo60471d()
            com.ss.android.ugc.aweme.player.a.d r6 = r2.f98888a
            r6.f98874l = r5
            com.ss.android.ugc.aweme.player.a.d r5 = r2.f98888a
            r5.f98870h = r12
            com.ss.android.ugc.aweme.player.a.d r5 = r2.f98888a
            r5.f98869g = r12
            com.ss.android.ugc.aweme.video.d.b r1 = m70882e(r1)
            com.ss.android.ugc.aweme.player.a.d r5 = r2.f98888a
            r5.f98875m = r1
            int r1 = r0.f78761f
            com.ss.android.ugc.aweme.player.a.d r5 = r2.f98888a
            r5.f98872j = r1
            com.ss.android.ugc.aweme.player.a.d r1 = r2.f98888a
            r1.f98865c = r4
            long r4 = r0.f78821X
            com.ss.android.ugc.aweme.player.a.d r1 = r2.f98888a
            r1.f98866d = r4
            int r1 = r0.f78834aj
            com.ss.android.ugc.aweme.player.a.d r4 = r2.f98888a
            r4.f98867e = r1
            int r1 = r0.f78836al
            com.ss.android.ugc.aweme.player.a.d r4 = r2.f98888a
            r4.f98868f = r1
            android.app.Activity r1 = r0.f78758c
            com.ss.android.ugc.aweme.player.a.d r4 = r2.f98888a
            r4.f98873k = r1
            com.ss.android.ugc.aweme.player.a.d r1 = r2.f98888a
            android.content.Context r2 = r1.f98874l
            if (r2 == 0) goto L_0x030b
            com.ss.android.ugc.playerkit.c.g r2 = r1.f98871i
            if (r2 == 0) goto L_0x030b
            com.ss.android.ugc.aweme.feed.adapter.ag r2 = r1.f98864b
            if (r2 == 0) goto L_0x030b
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r1.f98863a
            if (r2 != 0) goto L_0x02d5
            goto L_0x030b
        L_0x02d5:
            android.content.Context r2 = r1.f98874l
            com.ss.android.ugc.aweme.feed.adapter.ag r4 = r1.f98864b
            int r5 = r1.f98872j
            com.ss.android.ugc.aweme.feed.e.j r6 = r1.f98869g
            java.lang.String r7 = r1.f98865c
            com.ss.android.ugc.playerkit.c.g r9 = r1.f98871i
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r10 = r1.f98863a
            com.ss.android.ugc.aweme.feed.helper.e r12 = r1.f98876n
            r33 = r12
            long r11 = r1.f98866d
            com.ss.android.ugc.aweme.player.a.d$1 r13 = new com.ss.android.ugc.aweme.player.a.d$1
            r21 = r13
            r22 = r1
            r23 = r4
            r24 = r10
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r9
            r29 = r2
            r30 = r33
            r31 = r11
            r21.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            java.util.concurrent.ExecutorService r1 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r13, r1)
        L_0x030b:
            com.ss.android.ugc.aweme.video.h r1 = r34.mo60548p()
            float r1 = r1.mo95250h()
            java.lang.Integer r2 = com.p683ss.android.ugc.aweme.feed.utils.C31189e.m72827a(r3)
            if (r2 == 0) goto L_0x033c
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "play_bitrate"
            double r5 = (double) r1     // Catch:{ JSONException -> 0x0335 }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x0335 }
            java.lang.String r4 = "bitrate"
            r3.put(r4, r2)     // Catch:{ JSONException -> 0x0335 }
            java.lang.String r4 = "bitrate_delta"
            int r5 = r2.intValue()     // Catch:{ JSONException -> 0x0335 }
            float r5 = (float) r5     // Catch:{ JSONException -> 0x0335 }
            float r5 = r5 - r1
            double r5 = (double) r5     // Catch:{ JSONException -> 0x0335 }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x0335 }
        L_0x0335:
            java.lang.String r4 = "http_hijack_info_v2"
            java.lang.String r5 = "http_hijack_info_v2"
            com.p683ss.android.ugc.aweme.app.C23131p.m56692a(r4, r5, r3)
        L_0x033c:
            com.bytedance.ies.abmock.b r21 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.ForceVideoUrlUseHttpsExperiment> r22 = com.p683ss.android.ugc.aweme.feed.experiment.ForceVideoUrlUseHttpsExperiment.class
            r23 = 1
            java.lang.String r24 = "force_video_url_use_https"
            r25 = 31744(0x7c00, float:4.4483E-41)
            r26 = 0
            boolean r3 = r21.mo18172a(r22, r23, r24, r25, r26)
            if (r3 == 0) goto L_0x0392
            if (r2 == 0) goto L_0x0392
            int r3 = r2.intValue()
            if (r3 > 0) goto L_0x0359
            goto L_0x0392
        L_0x0359:
            int r3 = r2.intValue()
            float r3 = (float) r3
            float r3 = r3 - r1
            com.bytedance.ies.abmock.b r21 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.VideoSwitchHttpsThresholdExperiment> r22 = com.p683ss.android.ugc.aweme.feed.experiment.VideoSwitchHttpsThresholdExperiment.class
            r23 = 1
            java.lang.String r24 = "video_switch_https_threshold"
            r25 = 31744(0x7c00, float:4.4483E-41)
            r26 = 0
            int r4 = r21.mo18168a(r22, r23, r24, r25, r26)
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0392
            com.p683ss.android.ugc.aweme.video.C48114q.f120923a = r8
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "play_bitrate"
            double r5 = (double) r1     // Catch:{ JSONException -> 0x038d }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x038d }
            java.lang.String r1 = "hit_bitrate"
            r3.put(r1, r2)     // Catch:{ JSONException -> 0x038d }
            java.lang.String r1 = "is_hijack"
            r3.put(r1, r8)     // Catch:{ JSONException -> 0x038d }
        L_0x038d:
            java.lang.String r1 = "http_hijack_info"
            com.p683ss.android.ugc.aweme.app.C23131p.m57779a(r1, r3)
        L_0x0392:
            r1 = 0
            r0.f78821X = r1
        L_0x0396:
            com.bytedance.gcsuppression.GcSuppression r1 = com.bytedance.gcsuppression.GcSuppression.m20171a()
            java.util.concurrent.atomic.AtomicInteger r2 = r1.f27233a
            int r2 = r2.get()
            r3 = 2
            if (r2 != r3) goto L_0x03ad
            java.util.concurrent.ExecutorService r2 = r1.f27235c
            com.bytedance.gcsuppression.GcSuppression$2 r4 = new com.bytedance.gcsuppression.GcSuppression$2
            r4.<init>()
            r2.execute(r4)
        L_0x03ad:
            com.p683ss.android.ugc.aweme.lego.C35857a.m81008e()
            com.ss.android.ugc.aweme.feed.cache.b r1 = com.p683ss.android.ugc.aweme.feed.cache.C30163b.f78736j
            r1 = r14
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0462
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            java.lang.String r4 = "feed_video_cache"
            r5 = 0
            android.content.SharedPreferences r2 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r2, r4, r5)
            java.lang.String r4 = "feed_video_group_key"
            r5 = 0
            java.lang.String r15 = r2.getString(r4, r5)
            r2 = r15
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x0462
            if (r15 != 0) goto L_0x03db
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x03db:
            if (r14 != 0) goto L_0x03e0
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x03e0:
            r4 = 0
            boolean r1 = p2628d.p2650m.C52830p.m112456b(r2, r1, r4, r3, r5)
            if (r1 == 0) goto L_0x0462
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r2 = 44
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = p2628d.p2650m.C52830p.m112411b(r15, r1, r4, r3, r5)
            if (r1 == 0) goto L_0x041a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r2)
            java.lang.String r16 = r1.toString()
            java.lang.String r17 = ""
            r18 = 0
            r19 = 4
            r20 = 0
            java.lang.String r1 = p2628d.p2650m.C52830p.m112409b(r15, r16, r17, r18, r19, r20)
            goto L_0x044a
        L_0x041a:
            r1 = 0
            boolean r2 = p2628d.p2650m.C52830p.m112411b(r15, r14, r1, r3, r5)
            if (r2 == 0) goto L_0x0430
            java.lang.String r1 = ""
            r16 = 0
            r17 = 4
            r18 = 0
            r13 = r15
            r15 = r1
            java.lang.String r1 = p2628d.p2650m.C52830p.m112409b(r13, r14, r15, r16, r17, r18)
            goto L_0x044a
        L_0x0430:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ","
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r16 = r1.toString()
            java.lang.String r17 = ""
            r18 = 0
            r19 = 4
            r20 = 0
            java.lang.String r1 = p2628d.p2650m.C52830p.m112409b(r15, r16, r17, r18, r19, r20)
        L_0x044a:
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            java.lang.String r4 = "feed_video_cache"
            r5 = 0
            android.content.SharedPreferences r2 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r2, r4, r5)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r4 = "feed_video_group_key"
            android.content.SharedPreferences$Editor r1 = r2.putString(r4, r1)
            r1.apply()
        L_0x0462:
            com.ss.android.ugc.aweme.bu.a.a r1 = com.p683ss.android.ugc.aweme.p1468bu.p1469a.C24058a.f63856d
            int r1 = com.p683ss.android.ugc.aweme.p1468bu.p1469a.C24058a.f63854b
            r2 = 512(0x200, float:7.175E-43)
            if (r1 > r2) goto L_0x0493
            int r1 = com.p683ss.android.ugc.aweme.p1468bu.p1469a.C24058a.f63854b
            int r2 = com.p683ss.android.ugc.aweme.p1468bu.p1469a.C24058a.f63855c
            int r2 = r2 - r8
            r1 = r1 & r2
            if (r1 != 0) goto L_0x048e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1468bu.p1469a.C24058a.f63853a
            r1.append(r2)
            int r2 = com.p683ss.android.ugc.aweme.p1468bu.p1469a.C24058a.f63854b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.ugc.aweme.p1468bu.p1469a.C24058a.m58880a(r1)
            int r1 = com.p683ss.android.ugc.aweme.p1468bu.p1469a.C24058a.f63855c
            int r1 = r1 * 2
            com.p683ss.android.ugc.aweme.p1468bu.p1469a.C24058a.f63855c = r1
        L_0x048e:
            int r1 = com.p683ss.android.ugc.aweme.p1468bu.p1469a.C24058a.f63854b
            int r1 = r1 + r8
            com.p683ss.android.ugc.aweme.p1468bu.p1469a.C24058a.f63854b = r1
        L_0x0493:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1719e.C30200o.mo53526a(com.ss.android.ugc.playerkit.c.g):void");
    }

    /* renamed from: b */
    public final void mo53530b(final C50112d dVar) {
        if (mo60474i()) {
            C30016ag h = m70889h(dVar.f125523a);
            if (h != null && h.mo54004j() != null) {
                h.mo54004j().mo53530b(dVar);
                if (C302077.f78870a[mo60548p().mo95242a().ordinal()] == 1 && ((dVar.f125528f == null || (dVar.f125528f instanceof Integer)) && h.mo53999e() != null)) {
                    final Video video = h.mo53999e().getVideo();
                    if (video != null) {
                        C18842a.m45932a(new Runnable() {
                            public final void run() {
                                String str;
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    if (dVar.f125528f == null) {
                                        dVar.f125528f = Integer.valueOf(1);
                                    }
                                    jSONObject.put("type", dVar.f125528f.toString());
                                    jSONObject.put("sourceId", dVar.f125523a);
                                    jSONObject.put("errorCode", dVar.f125526d);
                                    jSONObject.put("errorExtra", dVar.f125527e);
                                    jSONObject.put("netWorkQuality", C14460b.m29586a().mo26625b().toString());
                                    jSONObject.put("netWorkSpeed", (int) C14460b.m29586a().mo26626c());
                                    jSONObject.put("playUrl", JSON.toJSONString(video.getProperPlayAddr()));
                                    jSONObject.put("playUrlIsLowBr", video.isLowBr());
                                    jSONObject.put("playerType", C30200o.this.mo60548p().mo95242a().toString());
                                    if (dVar.f125528f != null) {
                                        jSONObject.put("extraInfo", dVar.f125528f.toString());
                                    }
                                    File a = C48016e.m103933a(C48016e.m103940b(), "cache");
                                    String str2 = "file";
                                    if (a == null) {
                                        str = "";
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(a.getPath());
                                        sb.append("/");
                                        sb.append(C51835a.m111161a(video.getProperPlayAddr().getUri()));
                                        str = new C43929l("file", sb.toString()).toString();
                                    }
                                    jSONObject.put(str2, str);
                                } catch (JSONException unused) {
                                }
                                C23131p.m57779a("aweme_media_play_retry_on_freezing", jSONObject);
                                C26890h.m65012a("aweme_media_play_retry_on_freezing", jSONObject);
                            }
                        });
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo60534a(Aweme aweme, int i) {
        String str;
        this.f78848q = aweme;
        if (this.f78800C == null) {
            try {
                this.f78800C = (KeyguardManager) mo60471d().getSystemService("keyguard");
            } catch (Exception unused) {
            }
        }
        if (this.f78800C == null || !this.f78800C.inKeyguardRestrictedInputMode()) {
            this.f78849r = false;
            this.f78848q = null;
            C30597ae q = m70892q();
            if (q != null) {
                q.mo62797q(true);
            }
            boolean z = !m70883e(aweme);
            boolean z2 = !m70878c(aweme);
            boolean d = m70881d(aweme);
            boolean a = C36330a.m81964a(aweme);
            if (z || z2 || d || a) {
                if (a) {
                    C10691a.m21551c(mo60471d(), C36330a.m81963a(aweme, R.string.cpc)).mo19066a();
                } else if (d) {
                    C10691a.m21548c(mo60471d(), (int) R.string.fax).mo19066a();
                }
                if (z) {
                    return "32";
                }
                if (z2) {
                    return "42";
                }
                return d ? "43" : "44";
            }
            C26317h.f69457a.mo53101a();
            C30016ag a2 = mo60527a();
            if (C31186b.m72817e(a2)) {
                C25880al r = a2.mo60248r();
                C25908e a3 = m70859a(a2);
                a2.mo54004j().mo60224b(aweme);
                if (a3 != null) {
                    a3.mo53240a(mo60471d(), aweme);
                }
                if (r.mo53063b()) {
                    r.mo53056a(false);
                }
            }
            if (!m70868a(a2, aweme) || (!a2.mo54004j().mo60252v() && !m70900y())) {
                str = "41";
            } else if (m70867a(a2.mo54004j())) {
                if (!C48069o.m104087I()) {
                    mo60548p().mo95293z();
                } else {
                    C50158g m = a2.mo60242m();
                    if (m != null) {
                        m.mo60215af();
                    }
                }
                C30014ae j = a2.mo54004j();
                if (j != null && j.mo60247q() == 2) {
                    j.mo60224b(aweme);
                }
                str = "35";
            } else if (C31186b.m72817e(a2)) {
                Video video = a2.mo53999e().getVideo();
                if (video == null) {
                    return "36";
                }
                if (a2.mo53999e().getVideo().getProperPlayAddr() == null) {
                    return "37";
                }
                video.setRationAndSourceId(m70890h(a2));
                if (!C48069o.m104087I()) {
                    mo60548p().mo95281a(a2.mo54004j().mo60253w());
                    mo60548p().mo95284a((C38871j) this);
                    C31203o.m72864d("tryResumePlay", mo60548p().mo95273a(video, (C38871j) this, i));
                    str = "38";
                } else {
                    C50158g m2 = a2.mo60242m();
                    m2.mo60207a((C38871j) this);
                    m2.mo60204a(video);
                    str = "39";
                }
                if (this.f78811N) {
                    m70874b(true, false);
                }
                if (q != null) {
                    q.mo60507Z();
                }
            } else {
                str = "40";
            }
            if (this.f78843l != -1) {
                this.f78805H += SystemClock.elapsedRealtime() - this.f78843l;
                this.f78843l = -1;
            }
            mo60544l();
            this.f78835ak = false;
            return str;
        }
        if (C18920g.m46047a() || C18920g.m46054c() || "samsung".equalsIgnoreCase(Build.BRAND) || VERSION.SDK_INT >= 28) {
            this.f78849r = true;
        }
        return "31";
    }

    /* renamed from: a */
    private static boolean m70868a(C30016ag agVar, Aweme aweme) {
        return m70885f(agVar) && agVar.mo53999e() == aweme;
    }

    /* renamed from: a */
    public final String mo60535a(Aweme aweme, boolean z, C30016ag agVar) {
        String str;
        C30597ae q = m70892q();
        if (q != null) {
            q.mo60498T();
        }
        if (agVar == null) {
            agVar = mo60527a();
        }
        if (agVar == null || agVar.mo54004j() == null) {
            return "12";
        }
        if (!(agVar == null || agVar.mo54004j() == null || m70900y())) {
            C23729p.m58257a(agVar.mo54004j().mo60254x(), 0);
        }
        if (!m70868a(agVar, aweme) || (!agVar.mo54004j().mo60252v() && !m70900y())) {
            str = "22";
        } else {
            C0013i.m18a(C30213t.f78885a, (Executor) C24076h.m58904e());
            Video video = agVar.mo53999e().getVideo();
            if (m70867a(agVar.mo54004j()) && m70878c(aweme)) {
                m70872b(agVar, aweme);
                this.f78801D = false;
                str = "14";
            } else if (C36330a.m81964a(aweme)) {
                C10691a.m21551c(mo60471d(), C36330a.m81963a(aweme, R.string.fc_)).mo19066a();
                return "15";
            } else if (m70881d(aweme)) {
                C10691a.m21548c(mo60471d(), (int) R.string.fax).mo19066a();
                return "16";
            } else if (video == null) {
                return "17";
            } else {
                VideoUrlModel properPlayAddr = video.getProperPlayAddr();
                if (properPlayAddr == null) {
                    return "18";
                }
                if (!aweme.isLive() && !aweme.isCanPlay()) {
                    return "19";
                }
                C48021h p = mo60548p();
                C48021h p2 = !C48069o.f120792a ? mo60548p() : C47981ac.m103815a().mo95139a(properPlayAddr.getUri());
                p2.mo95281a(agVar.mo54004j().mo60253w());
                video.setRationAndSourceId(m70890h(agVar));
                if (!m70883e(aweme) || !m70878c(aweme)) {
                    str = "21";
                } else {
                    String str2 = "20";
                    p2.mo95284a((C38871j) this);
                    C31203o.m72864d("tryPlay", p2.mo95274a(video, z));
                    if (C48069o.f120792a) {
                        C47981ac.m103815a().mo95140a(p);
                    }
                    if (m70888g(aweme)) {
                        p2.mo95265B();
                        C10691a.m21542b(mo60471d(), (int) R.string.ce6).mo19066a();
                    } else {
                        p2.mo95266C();
                    }
                    this.f78801D = false;
                    str = str2;
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public final void mo60539a(String str, boolean z, C30016ag agVar) {
        mo60544l();
        long n = mo60546n();
        if (agVar == null) {
            agVar = mo60527a();
        }
        if (C31186b.m72817e(agVar)) {
            C25908e a = m70859a(agVar);
            if (a != null && !this.f78851t) {
                if (!z || this.f78846o == null) {
                    a.mo53242a(this.f78846o, str, n, this.f78845n + 1);
                } else {
                    a.mo53242a(this.f78846o, this.f78846o.getAid(), n, this.f78845n + 1);
                }
            }
            this.f78846o = m70886g(agVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo60533a(Aweme aweme, String str, String str2, String str3, C30597ae aeVar, C30016ag agVar, long j, String str4, String str5, double d, String str6, C48021h hVar, String str7, String str8, String str9) throws Exception {
        Aweme aweme2 = aweme;
        String str10 = str2;
        String str11 = str3;
        long j2 = j;
        JSONObject u = m70896u();
        try {
            u.put("author_id", C23198ae.m56846a(aweme));
            if (!TextUtils.isEmpty(str)) {
                String str12 = str;
                u.put("poi_id", str);
            }
            if (C23198ae.m56858c(this.f78760e)) {
                u.put("poi_type", C23198ae.m56867h(aweme));
                u.put("poi_channel", C23198ae.m56852b());
                u.put("city_info", C23198ae.m56845a());
                u.put("distance_info", C23198ae.m56869i(aweme));
            }
            u.put(C22858c.f61208d, m70857A() ? 1 : 0);
            u.put("content_source", str10);
            if (!TextUtils.isEmpty(str3)) {
                u.put("enter_method", str11);
            }
            if (!TextUtils.isEmpty(aeVar.mo60501W().getCarrierType())) {
                u.put("carrier_type", aeVar.mo60501W().getCarrierType());
            }
            if (!TextUtils.isEmpty(aeVar.mo60501W().getFromGroupId())) {
                u.put("from_group_id", aeVar.mo60501W().getFromGroupId());
            }
            if (!TextUtils.isEmpty(aeVar.mo60501W().getReferCommodityId())) {
                u.put("refer_commodity_id", aeVar.mo60501W().getReferCommodityId());
            }
            if (!TextUtils.isEmpty(aeVar.mo60501W().getDataType())) {
                u.put("data_type", aeVar.mo60501W().getDataType());
            }
            if (!TextUtils.isEmpty(aeVar.mo60501W().getSpecialTopicRegion())) {
                u.put("region", aeVar.mo60501W().getSpecialTopicRegion());
            }
        } catch (JSONException unused) {
        }
        if (C31186b.m72815c(agVar)) {
            C26890h.onEvent(MobClick.obtain().setEventName("ad_play_time").setValue(String.valueOf(j)).setExtValueString(C23198ae.m56877m(aweme)).setJsonObject(new C23088c().mo47824a("request_id", m70896u().optString("request_id")).mo47824a("is_photo", C23198ae.m56878n(aweme)).mo47825b()));
        }
        C26890h.m65006a(mo60471d(), "play_time", this.f78760e, str4, j, u);
        C23221az a = new C23221az().mo48052a(this.f78760e);
        a.f61917W = this.f78762g;
        C23221az a2 = ((C23221az) a.mo48055b(str5).mo48098a(Boolean.valueOf(C31190f.m72834b(aweme)))).mo47954f(aweme).mo48049a(j2);
        a2.f61956e = d;
        C23221az azVar = (C23221az) a2.mo48100j(str6);
        azVar.f61915U = aeVar.mo60492N();
        C23221az a3 = azVar.mo48056c(hVar.mo95242a().toString()).mo48057d(C23198ae.m56847a(aweme, this.f78761f)).mo48047a(hVar.mo95249g());
        a3.f61954c = str7;
        a3.f61955d = str8;
        a3.f61953b = str9;
        C23221az e = ((C23221az) a3.mo48101k(C23198ae.m56854b(aweme, this.f78761f))).mo48059e(str10);
        if (this.f78853v != null) {
            this.f78853v.mo58364a(j2, aweme.getAid());
        }
        if (aeVar != null) {
            String C = aeVar.mo55774C();
            if (!TextUtils.isEmpty(C)) {
                try {
                    JSONObject jSONObject = new JSONObject(C);
                    if (jSONObject.has("supplier_id")) {
                        e.mo48069a("supplier_id", jSONObject.getString("supplier_id"));
                    }
                    if (jSONObject.has("product_id")) {
                        e.mo48069a("product_id", jSONObject.getString("product_id"));
                    }
                    if (jSONObject.has("previous_page")) {
                        e.mo48069a("previous_page", jSONObject.getString("previous_page"));
                    }
                } catch (JSONException unused2) {
                }
            }
        }
        if (!(aeVar == null || aeVar.mo60501W() == null)) {
            e.mo48051a(aeVar.mo60501W(), aeVar.mo62787aq());
            e.mo48050a(aeVar.mo60501W());
            e.mo48054b(aeVar.mo60501W());
            e.f61909O = aeVar.mo60501W().getCarrierType();
            e.f61910P = aeVar.mo60501W().getReferSeedId();
            e.f61911Q = aeVar.mo60501W().getReferSeedName();
            e.f61912R = aeVar.mo60501W().getFromGroupId();
            e.f61914T = aeVar.mo60501W().getReferCommodityId();
            e.f61913S = aeVar.mo60501W().getDataType();
            e.mo48060f(aeVar.mo60501W().getCreationId());
            C30669b W = aeVar.mo60501W();
            if (W != null) {
                e.f61916V = W.getPoiPageType();
            }
            e.mo48103m(aeVar.mo60501W().getSearchResultId());
            e.mo48105o(aeVar.mo60501W().getListItemId());
            e.mo48104n(aeVar.mo60501W().getListResultType());
            e.mo48106p(aeVar.mo60501W().getSearchThirdItemId());
            e.mo48046q(aeVar.mo60501W().getmImprId());
            e.mo48107r(aeVar.mo60501W().getSearchId());
            e.f61918X = aeVar.mo60501W().getSpecialTopicRegion();
            e.mo48097a((C23252v) MobParamProvider.m71943a(mo60471d()));
            e.f61919Y = aeVar.mo60501W().getFeedGroupIdForMixVideo();
        }
        if (!TextUtils.isEmpty(str3)) {
            e.f61921a = str11;
        }
        e.mo48076e();
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo60528a(int i, long j, long j2, Video video) throws Exception {
        C23131p.m56692a("aweme_media_block_log1", "video_block", C48005c.m103855a(C23088c.m56631a().mo47821a("count_rate", Float.valueOf((((float) i) * 1000.0f) / ((float) j))).mo47823a("duration_rate", Long.valueOf(j2 / j)).mo47822a("block_count", Integer.valueOf(i)).mo47823a("block_duration", Long.valueOf(j2))).mo47823a("duration", Long.valueOf(j)).mo47822a("video_duration", Integer.valueOf(video != null ? video.getDuration() : 0)).mo47824a("netType", NetworkUtils.getNetworkAccessType(mo60471d())).mo47825b());
        return null;
    }

    /* renamed from: a */
    public final void mo60537a(Aweme aweme, boolean z, boolean z2) {
        C30597ae q = m70892q();
        C30016ag a = mo60527a();
        if (C36330a.m81964a(aweme)) {
            C10691a.m21551c(mo60471d(), C36330a.m81963a(aweme, R.string.fc_)).mo19066a();
        } else if (a != null && a.mo54004j() != null && a.mo53999e() == aweme && !m70881d(aweme)) {
            C23794bh.m58408v().mo49232a();
            if (aweme != null && (aweme.getVideo() != null || aweme.isLive())) {
                int i = this.f78844m.f78757a;
                StringBuilder sb = new StringBuilder("current play status:");
                sb.append(i);
                C32458a.m75141a(3, "PlayerController", sb.toString());
                if (i == 2) {
                    if (!aweme.isLive()) {
                        C26890h.m65005a(mo60471d(), "click", "video_pause", aweme.getAid(), 0);
                        new C23216au().mo48019c(aweme, this.f78761f).mo48018a(this.f78760e).mo48076e();
                        if (!C48069o.m104087I()) {
                            mo60548p().mo95293z();
                        } else {
                            C50158g m = a.mo60242m();
                            if (m != null) {
                                m.mo60215af();
                            }
                        }
                        if (z) {
                            if (q != null) {
                                q.mo60510ab();
                            } else {
                                C32458a.m75143a((Exception) new IllegalStateException("listFragmentPanel is null!"));
                            }
                        }
                        if (z2) {
                            this.f78835ak = true;
                        }
                        C48039k.m104036a().mo95303a((C38871j) this);
                        C31134e eVar = new C31134e(m70901z(), this.f78760e, this.f78761f, 1, q);
                        C47718bf.m103288a(eVar);
                        return;
                    }
                    C32458a.m75141a(6, "PlayerController", "aweme is live aweme,maybe is bug?");
                } else if (i == 3) {
                    C26890h.m65005a(mo60471d(), "click", "video_play", aweme.getAid(), 0);
                    if (aweme.isLive()) {
                        C48039k.m104036a();
                        a.mo54004j().mo60253w();
                        C48039k.m104036a();
                        aweme.getAid();
                        aweme.getStreamUrlModel();
                        if (!C48069o.m104087I()) {
                            mo60548p().mo95293z();
                        } else {
                            C50158g m2 = a.mo60242m();
                            if (m2 != null) {
                                m2.mo60215af();
                            }
                        }
                    } else if (aweme.getVideo().getProperPlayAddr() == null) {
                        C32458a.m75143a((Exception) new IllegalStateException("try resume play,but model is null"));
                        return;
                    } else {
                        mo60536a(aweme);
                    }
                    if (q != null) {
                        q.mo60507Z();
                    } else {
                        C32458a.m75143a((Exception) new IllegalStateException("listFragmentPanel is null!"));
                    }
                } else if (i != 0 || q == null || !q.mo60511ac()) {
                    StringBuilder sb2 = new StringBuilder("status:");
                    sb2.append(i);
                    sb2.append(",don't know how to do in this situation");
                    C32458a.m75141a(6, "PlayerController", sb2.toString());
                } else {
                    m70870b(q.mo60519ak(), true);
                    q.mo60507Z();
                }
            }
        } else if (mo60471d() == null || !m70881d(aweme)) {
            StringBuilder sb3 = new StringBuilder("try to handlePlay, but can't meet the conditions, holder:");
            boolean z3 = false;
            sb3.append(a == null);
            sb3.append(", player:");
            if (a == null || a.mo54004j() == null) {
                z3 = true;
            }
            sb3.append(z3);
            C32458a.m75148a((Throwable) new IllegalStateException(sb3.toString()));
        } else {
            C10691a.m21548c(mo60471d(), (int) R.string.fax).mo19066a();
        }
    }

    /* renamed from: a */
    public final void mo52903a(Activity activity, Fragment fragment) {
        super.mo52903a(activity, fragment);
        if (activity == null) {
            C25069a.m60928b("ATTACH ACTIVITY == NULL");
        }
        this.f78822Y = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && C30200o.this.f78848q != null && C30200o.this.f78849r) {
                    C30200o.this.mo60536a(C30200o.this.f78848q);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C0732g.m2130a((Context) activity).mo2403a(this.f78822Y, intentFilter);
    }

    /* renamed from: a */
    public final void mo53528a(String str, boolean z) {
        m70892q().mo62783b(str, z);
    }

    /* renamed from: y */
    private static boolean m70900y() {
        return C48114q.m104226b();
    }

    /* renamed from: g */
    public final long mo60542g() {
        return m70884f((Aweme) null);
    }

    /* renamed from: A */
    private boolean m70857A() {
        C30597ae q = m70892q();
        if (q == null) {
            return false;
        }
        return q.mo55834v();
    }

    /* renamed from: q */
    private C30597ae m70892q() {
        return (C30597ae) this.f78799B.get();
    }

    /* renamed from: t */
    private void m70895t() {
        C30597ae q = m70892q();
        if (q != null) {
            q.mo62796g(this.f78818U);
        }
    }

    /* renamed from: u */
    private JSONObject m70896u() {
        C30597ae q = m70892q();
        if (q != null) {
            return q.mo60497S();
        }
        return null;
    }

    /* renamed from: v */
    private String m70897v() {
        JSONObject u = m70896u();
        if (u != null) {
            return u.optString("request_id");
        }
        return "";
    }

    /* renamed from: w */
    private void m70898w() {
        if (this.f78823Z != null) {
            this.f78823Z.dispose();
            this.f78823Z = null;
        }
    }

    /* renamed from: z */
    private Aweme m70901z() {
        return m70886g(mo60527a());
    }

    /* renamed from: p */
    public final C48021h mo60548p() {
        if (this.f78798A == null) {
            this.f78798A = C48121w.m104249M();
        }
        return this.f78798A;
    }

    /* renamed from: r */
    private boolean m70893r() {
        Activity c = mo60470c();
        if (c == null || ScrollSwitchStateManager.m75876a((FragmentActivity) c).mo69868b("page_feed")) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private boolean m70894s() {
        if (this.f78799B == null || this.f78799B.get() == null || !((C30597ae) this.f78799B.get()).mo62784bv()) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    private void m70899x() {
        try {
            int intValue = C32816h.m75716b().getVideoPlayProgressCount().intValue();
            if (intValue >= 100 && intValue <= 1000 && mo60542g() > 29000) {
                long g = mo60542g() / ((long) intValue);
                if (g > 50) {
                    mo60548p().mo95280a((int) g);
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        mo60548p().mo95268E();
    }

    /* renamed from: l */
    public void mo60544l() {
        if (this.f78842k != -1) {
            if (this.f78803F == -1) {
                this.f78803F = System.currentTimeMillis() - this.f78842k;
            } else {
                this.f78803F += System.currentTimeMillis() - this.f78842k;
            }
            this.f78842k = -1;
        }
    }

    /* renamed from: m */
    public final void mo60545m() {
        if (!C48069o.m104087I()) {
            mo60548p().mo95293z();
            return;
        }
        if (mo60527a() != null) {
            C50158g m = mo60527a().mo60242m();
            if (m != null) {
                m.mo60215af();
            }
        }
    }

    /* renamed from: o */
    public final void mo60547o() {
        if (!"poi_page".equalsIgnoreCase(this.f78760e)) {
            long currentTimeMillis = System.currentTimeMillis() - this.f78841j;
            C26890h.onEvent(MobClick.obtain().setEventName("stay_time").setLabelName(this.f78760e).setExtValueLong(currentTimeMillis));
            new C23213as().mo48005a(String.valueOf(currentTimeMillis)).mo48006b(this.f78760e).mo48076e();
        }
    }

    /* renamed from: d */
    public final Context mo60471d() {
        C30597ae q = m70892q();
        if (q == null || q.mo62793bw() == null) {
            return super.mo60471d();
        }
        return q.mo62793bw();
    }

    /* renamed from: n */
    public final long mo60546n() {
        long j;
        if (C10193n.m20607a().mo18200a(FeedAdEnableDurationOptimizeSetting.class, "enable_feed_ad_break_duration_optimize", C10181b.m20511a().mo18175c().getEnableFeedAdBreakDurationOptimize(), 0) == 1) {
            long n = mo60548p().mo95256n();
            if (n > 0) {
                return n;
            }
        }
        if (this.f78803F == -1) {
            j = System.currentTimeMillis() - this.f78802E;
        } else {
            j = (System.currentTimeMillis() - this.f78802E) - this.f78803F;
        }
        return j;
    }

    /* renamed from: b */
    public final void mo60468b() {
        if (C48069o.m104087I()) {
            C30016ag a = mo60527a();
            if (C31186b.m72817e(a) && a.mo60242m() != null) {
                a.mo60242m().mo60226b(this);
            }
        }
        super.mo60468b();
        C0732g.m2130a(mo60471d()).mo2402a(this.f78822Y);
        m70898w();
    }

    /* renamed from: c */
    private boolean m70878c(Aweme aweme) {
        return m70879c(true);
    }

    /* renamed from: a */
    public final void mo60536a(Aweme aweme) {
        mo60534a(aweme, 0);
    }

    /* renamed from: e */
    private static boolean m70883e(Aweme aweme) {
        if (aweme == null || !aweme.isCanPlay()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static Aweme m70886g(C30016ag agVar) {
        if (agVar != null) {
            return agVar.mo53999e();
        }
        return null;
    }

    /* renamed from: h */
    private C30016ag m70889h(String str) {
        C30597ae q = m70892q();
        if (q == null) {
            return null;
        }
        return q.mo60523e(str);
    }

    /* renamed from: a */
    public static C25908e m70859a(C30016ag agVar) {
        if (agVar.mo60248r() == null) {
            return null;
        }
        return agVar.mo60248r().mo53064c();
    }

    /* renamed from: d */
    private JSONObject m70880d(C30016ag agVar) {
        JSONObject u = m70896u();
        if (!(u == null || agVar == null || agVar.mo53999e() == null || !C31190f.m72841i(agVar.mo53999e()))) {
            try {
                u.put("is_user_review", "1");
            } catch (JSONException unused) {
            }
        }
        return u;
    }

    /* renamed from: e */
    private static C48012b m70882e(C30016ag agVar) {
        if (agVar.mo54004j() == null) {
            return null;
        }
        return agVar.mo54004j().mo60180D();
    }

    /* renamed from: f */
    private static boolean m70885f(C30016ag agVar) {
        if (agVar == null || agVar.mo53999e() == null || agVar.mo54004j() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private static String m70890h(C30016ag agVar) {
        return agVar.mo60289E().getAid();
    }

    /* renamed from: a */
    private int m70858a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null) {
            return 0;
        }
        double d = (double) this.f78838an;
        double duration = videoUrlModel.getDuration();
        Double.isNaN(d);
        int i = (int) (d * duration);
        long j = 0;
        if (!(videoUrlModel == null || videoUrlModel.getSourceId() == null)) {
            C47976a aVar = (C47976a) C48121w.f120931f.get(videoUrlModel.getSourceId());
            if (aVar != null) {
                j = aVar.f120603a;
            }
        }
        return i + ((int) j);
    }

    /* renamed from: c */
    private boolean m70879c(boolean z) {
        boolean z2;
        if (!z || !m70893r()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.f78759d.getUserVisibleHint() || ((!m70869a((Aweme) null, true) && C36641ei.m82545a().mo75738b()) || !this.f78824a || !z2 || AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().needRestore())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m70881d(Aweme aweme) {
        if (aweme == null || aweme.getStatus() == null) {
            return false;
        }
        return aweme.getStatus().isDelete();
    }

    /* renamed from: g */
    private static boolean m70888g(Aweme aweme) {
        if (aweme == null || aweme.getMusic() == null || aweme.getMusic().getId() == 0 || aweme.getMusic().getMusicStatus() != 0 || C25945k.m62923n().mo54138a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private static void m70891h(Aweme aweme) {
        if (C37120o.m83349a().mo76392b()) {
            C0013i.m12a(0).mo20a((C0011g<TResult, TContinuationResult>) new C30216w<TResult,TContinuationResult>(aweme), (Executor) C30466a.m71397a());
        }
    }

    /* renamed from: b */
    public static void m70873b(Aweme aweme) {
        if (aweme.getPreload().profilePreload >= 0) {
            C23962d.m58765a().mo49548a(new C23965f(aweme, aweme.getPreload().profilePreload, "", C23958a.PROFILE));
            C23962d.m58765a().mo49548a(new C23965f(aweme, aweme.getPreload().profilePreload, "", C23958a.POST));
        }
    }

    /* renamed from: f */
    private long m70884f(Aweme aweme) {
        if (aweme == null) {
            aweme = m70901z();
        }
        if (aweme != null) {
            Video video = aweme.getVideo();
            if (video != null) {
                int duration = video.getDuration();
                if (duration > 0) {
                    return (long) duration;
                }
            }
        }
        long i = mo60548p().mo95251i();
        if (i > 0) {
            return i;
        }
        if (this.f78802E <= 0) {
            return -1;
        }
        if (this.f78803F != -1) {
            return (System.currentTimeMillis() - this.f78802E) - this.f78803F;
        }
        return System.currentTimeMillis() - this.f78802E;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    static final /* synthetic */ Object m70887g(String str) throws Exception {
        C52711k.m112240b(str, "aid");
        C30469d.f79620c.writeLock().lock();
        try {
            if (!C30469d.f79619b.contains(str)) {
                C30469d.f79619b.add(str);
            }
            if (C30469d.f79619b.size() > 100) {
                Object obj = C30469d.f79619b.get(0);
                C52711k.m112236a(obj, "historyAidList[0]");
                C30469d.f79618a.remove((String) obj);
                C30469d.f79619b.remove(0);
            }
            C30469d.f79620c.writeLock().unlock();
            return null;
        } catch (Throwable th) {
            C30469d.f79620c.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: c */
    private void m70877c(C30016ag agVar) {
        if (!C30367g.m71282a().f79378g) {
            if (m70894s()) {
                C32458a.m75141a(4, "PlayerController", "initCommerceCard() return: because needShowFeedHotComment()");
                return;
            }
            Aweme e = agVar.mo53999e();
            C26432bq.m63915a().f69686b = e;
            if (e != null && C26503d.m64083z(e)) {
                if (C47934o.m103707a(e)) {
                    C25539a.m62079a().getECPlayerControllerService().mo52278a(agVar.mo60249s(), e, mo60475j());
                } else {
                    agVar.mo60248r().mo53046a(mo60475j());
                    int i = 0;
                    if (C26503d.m64082y(e)) {
                        i = C26503d.m64076s(e).getShowSeconds();
                    } else if (C26503d.m64081x(e)) {
                        i = e.getAwemeRawAd().getShowButtonSeconds();
                    }
                    if (i > 0 && !m70894s()) {
                        C26432bq.m63915a().mo54159a(i * 1000, new C30209p(agVar));
                    }
                }
            }
            if (!(e == null || e.getFloatingCardInfo() == null || agVar.mo60251u() == null || m70894s())) {
                C26432bq.m63915a().mo54159a(5000, new C30218y(agVar));
            }
        }
    }

    /* renamed from: b */
    private static boolean m70875b(C30016ag agVar) {
        if (agVar.mo54004j() == null || agVar.mo54004j().mo60247q() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo53534d(String str) {
        Aweme aweme;
        if (mo60474i()) {
            C30597ae q = m70892q();
            C30016ag h = m70889h(str);
            if (!(h == null || h.mo54004j() == null)) {
                h.mo54004j().mo53534d(str);
            }
            m70864a(new C43893g(6));
            if (h != null) {
                aweme = h.mo53999e();
            } else {
                aweme = null;
            }
            if (aweme != null && !TextUtils.isEmpty(this.f78850s)) {
                C29924q qVar = new C29924q(this.f78850s, 3, mo60548p().mo95256n(), aweme.getAid());
                C47718bf.m103288a(qVar);
            }
            C28220g.f74083b.mo56651a(aweme, 1);
            if (q != null) {
                try {
                    q.mo60513ae();
                } catch (JSONException unused) {
                }
            }
            JSONObject u = m70896u();
            if (q != null) {
                u.put("enter_from", q.mo60505g(false));
                u.put("content_source", q.mo60493O());
                if (!TextUtils.isEmpty(q.mo60494P())) {
                    u.put("enter_method", q.mo60494P());
                }
            }
            C26890h.m65008a(mo60471d(), "video_play", "finish", str, "0", u);
            if (!this.f78820W) {
                C23219ax e = new C23219ax().mo48039a(this.f78760e).mo47954f(aweme);
                e.f61880S = q.mo60501W().getChallengeId();
                e.f61879R = String.valueOf(q.mo60520al());
                e.f61878Q = q.mo60501W().getProcessId();
                String str2 = this.f78819V;
                e.f61888a = str;
                e.f61904b = str2;
                e.f61905c = C23198ae.m56847a(aweme, this.f78761f);
                C23219ax axVar = (C23219ax) e.mo48046q(q.mo60501W().getmImprId()).mo48098a(Boolean.valueOf(C31190f.m72834b(aweme)));
                if (C30396s.m71317a() && !TextUtils.isEmpty(this.f78760e) && aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
                    C30389m mVar = new C30389m(aweme.getAid(), 0, System.currentTimeMillis(), this.f78760e);
                    C30396s.m71316a(mVar);
                }
                if (q != null) {
                    C23219ax axVar2 = (C23219ax) axVar.mo48041b(q.mo60491M()).mo48100j(q.mo55772A());
                    axVar2.f61876O = q.mo58357H();
                    axVar2.f61877P = q.mo58358I();
                    axVar2.f61907e = q.mo58359J();
                    ((C23219ax) ((C23219ax) axVar2.mo48100j(q.mo55772A())).mo48101k(C23198ae.m56854b(aweme, this.f78761f))).mo48038a(q.mo60501W()).mo48043c(q.mo60493O());
                    if (!TextUtils.isEmpty(q.mo60494P())) {
                        axVar.f61906d = q.mo60494P();
                    }
                }
                if (!(q == null || q.mo60501W() == null)) {
                    axVar.mo48103m(q.mo60501W().getSearchResultId());
                    axVar.mo48105o(q.mo60501W().getListItemId());
                    axVar.mo48104n(q.mo60501W().getListResultType());
                    axVar.mo48106p(q.mo60501W().getSearchThirdItemId());
                    axVar.mo48046q(q.mo60501W().getmImprId());
                    axVar.f61881T = q.mo60501W().getSearchKeyword();
                    axVar.mo48107r(q.mo60501W().getSearchId());
                }
                axVar.mo48076e();
                this.f78820W = true;
            }
            C23794bh.m58408v().mo49241a(TextUtils.equals(mo60476k(), "homepage_hot"));
            Aweme z = m70901z();
            if (z != null) {
                C47718bf.m103288a(new C39042b(C23198ae.m56861e(z)));
            }
        }
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
        C38845b bVar;
        String str2 = str;
        if (C37120o.m83349a().mo76392b()) {
            C0013i.m18a((Callable<TResult>) new C30185ad<TResult>(str2), (Executor) C30466a.m71397a());
        }
        C30597ae q = m70892q();
        if (q != null) {
            q.mo60496R();
        }
        C30016ag h = m70889h(str);
        if (!(h == null || h.mo53999e() == null || h.mo54004j() == null)) {
            h.mo54004j().mo53535e(str2);
            long j = C30436k.f79558b;
            C30436k.f79558b = 0;
            if (C30578o.f79871b < 0) {
                C30578o.f79871b = SystemClock.elapsedRealtime();
            }
            boolean a = C30163b.m70774a(h.mo53999e().getAid());
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C30210q qVar = r0;
            long j2 = elapsedRealtime;
            C30210q qVar2 = new C30210q(this, j, elapsedRealtime, a, h, C30578o.m71570d(), C30578o.m71569c());
            C0013i.m18a((Callable<TResult>) qVar, (Executor) C26890h.m65003a());
            if (q != null) {
                q.mo62790b(j2);
            }
            if (this.f78821X != 0) {
                new C38841a().mo78815a(String.valueOf(j2 - this.f78821X)).mo78812a(mo60472e()).mo78814a(h.mo53999e().getVideo()).mo78813a(h).mo78811a(2).mo78816b(m70897v()).f98898a.mo78810a();
            }
            if (h.mo53999e().getVideo() != null) {
                this.f78834aj = C48107j.m104193f().mo95411j(h.mo53999e().getVideo().getPlayAddr());
            }
            this.f78821X = j2;
            C48107j.m104193f().mo95342a((C48072b) q);
            C48012b e = m70882e(h);
            if (e != null) {
                e.mo95213a();
            }
        }
        this.f78844m.f78757a = 1;
        if (q != null) {
            q.mo60509aa();
        }
        m70864a(new C43893g(2));
        this.f78820W = false;
        if (m70857A() && !this.f78839ao) {
            this.f78839ao = true;
            mo60543h();
        }
        try {
            bVar = (C38845b) C10181b.m20511a().mo18170a(PlayerUnifiedAbConfigExperiment.class, true, "player_unified_ab_config", 31744, C38845b.class);
        } catch (Throwable unused) {
            bVar = null;
        }
        if (bVar != null && bVar.f98937a == 1) {
            this.f78801D = false;
            this.f78806I = -1;
        }
        this.f78815R = 0;
        this.f78811N = false;
        this.f78812O = false;
        this.f78813P = 0;
        this.f78814Q = 0;
    }

    /* renamed from: a */
    private void m70864a(C43893g gVar) {
        int i;
        C30597ae q = m70892q();
        if (q == null || !q.mo55834v()) {
            i = 1;
        } else {
            i = 2;
        }
        gVar.f111164e = i;
        C47718bf.m103288a(gVar);
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
        boolean z;
        if (mo60474i()) {
            C30597ae q = m70892q();
            C30515a.m71483b().mo62713c();
            C51522a.m110657b().mo103704b("first_refresh");
            C23794bh.m58408v().mo49234a(7, false);
            Session b = C50122a.m108112a().mo97900b();
            if (b != null) {
                C50123b c = C50141a.m108193a().mo97944c(b.key);
                if (c != null) {
                    c.f125609d = true;
                }
            }
            C30016ag a = mo60527a();
            if (C31186b.m72815c(a) && TextUtils.equals(mo60476k(), "general_search")) {
                C47718bf.m103288a(new C30308a());
            }
            long f = m70884f(m70886g(a));
            this.f78803F = -1;
            this.f78845n++;
            this.f78816S++;
            C30367g.m71282a().f79377f = this.f78816S;
            try {
                if (C31186b.m72817e(a)) {
                    C25908e c2 = a.mo60248r().mo53064c();
                    if (c2 != null) {
                        int i = this.f78845n;
                        if (c2.f68448c != null) {
                            c2.f68448c.mo53173a(c2.f68447b, c2.f68446a, f, i);
                        }
                    }
                    if (a.mo53999e() != null && a.mo53999e().getVideoControl() != null && a.mo53999e().getVideoControl().showProgressBar == 0 && !FeedPlayerCleanOptimize.m70946a()) {
                        if (!C48069o.m104087I()) {
                            mo60548p().mo95269F();
                        } else if (a.mo60242m() != null) {
                            a.mo60242m().mo60218ai();
                        }
                    }
                    if (C31186b.m72811a(a)) {
                        C25945k.m62917h().mo52102a(a.mo53999e(), mo60471d(), a.mo54004j().mo60254x(), this.f78845n);
                    }
                    a.mo60248r().mo53042a(this.f78845n);
                    if (a.mo53999e() != null && this.f78845n > 0) {
                        Aweme e = a.mo53999e();
                        if (C26503d.m64083z(e) && !m70894s()) {
                            C26432bq.m63915a().mo54158a(this.f78845n);
                        }
                        if (!e.isAd() || TextUtils.isEmpty(e.getAwemeRawAd().getWebUrl()) || this.f78817T <= 0 || this.f78816S < this.f78817T || C30367g.m71282a().f79375d) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            if (a.mo60248r().mo53058a(mo60475j(), a.mo60242m())) {
                                if (C48069o.m104087I() && a.mo60242m() != null) {
                                    a.mo60242m().mo60215af();
                                }
                                this.f78851t = true;
                                C30367g.m71282a().f79375d = true;
                                C30367g.m71282a().f79376e = true;
                                if (!(a == null || a.mo54004j() == null)) {
                                    a.mo54004j().mo53533c(str);
                                }
                                return;
                            }
                            this.f78817T++;
                        }
                    }
                    this.f78802E = System.currentTimeMillis();
                    if (!(c2 == null || q == null || q.mo62791br())) {
                        c2.mo53239a(2, this.f78845n + 1);
                    }
                    if (q != null) {
                        q.mo60512ad();
                        q.mo55809i();
                    }
                    C43893g gVar = new C43893g(7);
                    gVar.f111165f = str;
                    m70864a(gVar);
                    if (TextUtils.equals(this.f78855x, str)) {
                        this.f78838an++;
                    } else {
                        this.f78838an = 1;
                        this.f78855x = str;
                    }
                    if (a.mo54004j().mo60180D() != null) {
                        a.mo54004j().mo60180D().mo95223b(this.f78838an);
                    }
                    if (q != null) {
                        q.mo55792a(str);
                    }
                    C23794bh.m58408v().mo49232a();
                    if (!(a == null || a.mo54004j() == null)) {
                        a.mo54004j().mo53533c(str);
                    }
                    AVCameraInitManager.m90984a(this.f78838an, false);
                    C25209c.m61303a(this.f78838an, mo60542g());
                }
            } finally {
                if (!(a == null || a.mo54004j() == null)) {
                    a.mo54004j().mo53533c(str);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo60541f(String str) {
        String str2;
        long j;
        String str3;
        Video video;
        C30016ag agVar;
        Aweme aweme;
        Video video2;
        boolean z;
        C30200o oVar;
        String str4;
        long j2;
        int i;
        boolean z2 = this.f78811N;
        if (this.f78811N) {
            m70874b(false, true);
            m70866a(false, true);
        }
        C30016ag a = mo60527a();
        if (a != null) {
            Aweme e = a.mo53999e();
            if (e != null) {
                String aid = e.getAid();
                if (!TextUtils.isEmpty(aid)) {
                    if (!TextUtils.isEmpty(str) || m70875b(a)) {
                        str2 = str;
                    } else {
                        str2 = aid;
                    }
                    C30016ag h = m70889h(str2);
                    if (h != null) {
                        Aweme e2 = h.mo53999e();
                        if (e2 != null) {
                            Video video3 = e2.getVideo();
                            if (this.f78821X == 0 || !aid.equals(str2)) {
                                j = this.f78832ah;
                                this.f78832ah = 0;
                            } else {
                                j = SystemClock.elapsedRealtime() - this.f78821X;
                                this.f78821X = 0;
                                C38841a a2 = new C38841a().mo78815a(String.valueOf(j)).mo78812a(mo60472e()).mo78814a(video3).mo78813a(h);
                                if (!C11016e.m22313h()) {
                                    i = 2;
                                } else {
                                    i = 3;
                                }
                                a2.mo78811a(i).mo78816b(m70897v()).f98898a.mo78810a();
                            }
                            C48021h p = mo60548p();
                            float i2 = (float) p.mo95251i();
                            ArrayList arrayList = new ArrayList();
                            C30597ae q = m70892q();
                            if (q != null) {
                                int al = q.mo60520al() + 1;
                                while (al > 0 && al < q.mo60521am() && arrayList.size() <= C38831c.m86264d()) {
                                    Aweme c = q.mo60522c(al);
                                    if (c == null || c.getVideo() == null || c.getVideo().getPlayAddr() == null) {
                                        break;
                                    }
                                    arrayList.add(c);
                                    al++;
                                }
                            }
                            if (TextUtils.equals(this.f78830af, str2) || this.f78835ak) {
                                video = video3;
                                str3 = str2;
                            } else if (video3 != null) {
                                this.f78830af = str2;
                                boolean equals = TextUtils.equals(this.f78830af, this.f78831ag);
                                VideoUrlModel playAddr = video3.getPlayAddr();
                                if (playAddr != null) {
                                    if (i2 <= 0.0f) {
                                        i2 = (float) playAddr.getDuration();
                                    }
                                    List g = C48107j.m104193f().mo95357g(playAddr);
                                    List h2 = C48107j.m104193f().mo95358h(playAddr);
                                    if (g != null) {
                                        video = video3;
                                        str3 = str2;
                                        new C38829a().mo78791a(e2).mo78789a(this.f78761f).mo78796a(playAddr.isH265()).mo78800b(z2).mo78788a(i2).mo78790a((long) m70858a(playAddr)).mo78792a(C48121w.m104249M().mo95262t()).mo78798b((long) C48107j.m104193f().mo95346b(playAddr)).mo78794a(arrayList).mo78797b(this.f78836al).mo78793a(C48107j.m104193f().mo95352d()).mo78795a(g).mo78803d(equals).mo78802c(j).mo78799b(h2).f98826a.mo78787a();
                                    } else {
                                        video = video3;
                                        str3 = str2;
                                        new C38829a().mo78791a(e2).mo78796a(playAddr.isH265()).mo78789a(this.f78761f).mo78800b(z2).mo78788a(i2).mo78790a((long) m70858a(playAddr)).mo78797b(this.f78836al).mo78792a(C48121w.m104249M().mo95262t()).mo78798b((long) C48107j.m104193f().mo95346b(playAddr)).mo78794a(arrayList).mo78793a(C48107j.m104193f().mo95352d()).mo78803d(equals).mo78802c(j).mo78801c(C38831c.m86260a()).f98826a.mo78787a();
                                    }
                                } else {
                                    video = video3;
                                    str3 = str2;
                                    new C38829a().mo78791a(e2).mo78789a(this.f78761f).mo78800b(z2).mo78788a(i2).mo78790a((long) m70858a(playAddr)).mo78797b(this.f78836al).mo78792a(C48121w.m104249M().mo95262t()).mo78798b((long) C48107j.m104193f().mo95346b(playAddr)).mo78794a(arrayList).mo78793a(C48107j.m104193f().mo95352d()).mo78803d(equals ? 1 : 0).mo78802c(j).mo78801c(C38831c.m86262b()).f98826a.mo78787a();
                                }
                            } else {
                                video = video3;
                                str3 = str2;
                                new C38829a().mo78791a(e2).mo78789a(this.f78761f).mo78800b(z2).mo78797b(this.f78836al).mo78788a(i2).mo78792a(C48121w.m104249M().mo95262t()).mo78794a(arrayList).mo78793a(C48107j.m104193f().mo95352d()).mo78801c(C38831c.m86263c()).f98826a.mo78787a();
                            }
                            if ((!C30398t.m71322b(mo60470c()) || mo60470c() == null || !mo60470c().isFinishing()) && this.f78841j != -1) {
                                long currentTimeMillis = System.currentTimeMillis() - this.f78841j;
                                double a3 = AudioUtils.m57293a() - this.f78828ad;
                                if (currentTimeMillis > 0) {
                                    String str5 = "";
                                    String str6 = "";
                                    String str7 = "";
                                    String str8 = "";
                                    String str9 = "";
                                    String str10 = "";
                                    String str11 = "";
                                    String str12 = "";
                                    if (q != null) {
                                        str5 = q.mo60499U();
                                        str6 = q.mo60493O();
                                        str7 = q.mo60494P();
                                        str8 = q.mo60491M();
                                        str9 = q.mo55772A();
                                        str10 = q.mo58357H();
                                        str11 = q.mo58358I();
                                        str12 = q.mo58359J();
                                    }
                                    String str13 = str12;
                                    String str14 = str6;
                                    String str15 = str7;
                                    Aweme aweme2 = e2;
                                    C30214u uVar = r0;
                                    long j3 = currentTimeMillis;
                                    long j4 = j3;
                                    video2 = video;
                                    aweme = e2;
                                    agVar = h;
                                    String str16 = str8;
                                    String str17 = str3;
                                    z = true;
                                    C30214u uVar2 = new C30214u(this, aweme2, str5, str14, str15, q, h, j3, str3, str16, a3, str9, p, str10, str11, str13);
                                    C0013i.m18a((Callable<TResult>) uVar, (Executor) C26890h.m65003a());
                                    if (C31186b.m72817e(agVar)) {
                                        str4 = str17;
                                        Session c2 = C50122a.m108112a().mo97902c(str4);
                                        if (c2 != null) {
                                            oVar = this;
                                            c2.blockTime = (int) oVar.f78804G;
                                            c2.blockCnt = oVar.f78807J;
                                            j2 = j4;
                                            c2.playTime = (int) j2;
                                        } else {
                                            j2 = j4;
                                        }
                                    } else {
                                        j2 = j4;
                                        str4 = str17;
                                    }
                                    oVar = this;
                                } else {
                                    j2 = currentTimeMillis;
                                    aweme = e2;
                                    oVar = this;
                                    video2 = video;
                                    str4 = str3;
                                    z = true;
                                    agVar = h;
                                }
                                if (C37120o.m83349a().mo76392b()) {
                                    C30469d.f79621d.mo60885a(C23198ae.m56877m(aweme), j2);
                                    m70891h(aweme);
                                }
                                long currentTimeMillis2 = (System.currentTimeMillis() - oVar.f78841j) - oVar.f78805H;
                                if (currentTimeMillis2 > 0) {
                                    C30215v vVar = new C30215v(this, oVar.f78807J, currentTimeMillis2, oVar.f78804G, video2);
                                    C0013i.m18a((Callable<TResult>) vVar, (Executor) C26890h.m65003a());
                                }
                                if (C10181b.m20511a().mo18168a(PlayerAbBlockReportExp.class, true, "player_ab_block_type", 31744, 0) != PlayerAbBlockReportExp.m86276a()) {
                                    z = false;
                                }
                                if (oVar.f78807J > 0 && oVar.f78804G > 0) {
                                    if (z) {
                                        m70871b(agVar, oVar.f78804G, "leave", true);
                                    }
                                    Session c3 = C50122a.m108112a().mo97902c(str4);
                                    if (c3 != null) {
                                        C50141a.m108193a().mo97942a(c3.key, oVar.f78807J, (int) oVar.f78804G);
                                    }
                                }
                                if (oVar.f78808K > 0 && oVar.f78810M > 0) {
                                    if (z) {
                                        m70871b(agVar, oVar.f78810M, "leave", false);
                                    }
                                    Session c4 = C50122a.m108112a().mo97902c(str4);
                                    if (c4 != null) {
                                        C50141a.m108193a().mo97942a(c4.key, oVar.f78808K, (int) oVar.f78810M);
                                    }
                                }
                                if (!z) {
                                    if (oVar.f78811N && oVar.f78813P > 0) {
                                        m70871b(agVar, SystemClock.elapsedRealtime() - oVar.f78813P, "leave", true);
                                    }
                                    if (oVar.f78812O && oVar.f78814Q > 0) {
                                        m70871b(agVar, SystemClock.elapsedRealtime() - oVar.f78814Q, "leave", false);
                                    }
                                }
                                oVar.f78841j = -1;
                                oVar.f78828ad = AudioUtils.m57293a();
                                oVar.f78843l = -1;
                                oVar.f78806I = -1;
                                oVar.f78804G = 0;
                                oVar.f78805H = 0;
                                oVar.f78807J = 0;
                                oVar.f78810M = 0;
                                oVar.f78808K = 0;
                                oVar.f78809L = -1;
                                oVar.f78813P = 0;
                                oVar.f78814Q = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private String m70870b(Aweme aweme, boolean z) {
        return mo60535a(aweme, true, (C30016ag) null);
    }

    /* renamed from: a */
    private static void m70863a(final Video video, final boolean z) {
        if (video != null) {
            C18842a.m45932a(new Runnable() {
                public final void run() {
                    String str;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playUrl", JSON.toJSONString(video.getPlayAddrH265()));
                        C48005c.m103856a(jSONObject);
                        File a = C48016e.m103933a(C48016e.m103940b(), "cache");
                        String str2 = "file";
                        if (a == null) {
                            str = "";
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(a.getPath());
                            sb.append("/");
                            sb.append(C51835a.m111161a(video.getProperPlayAddr().getUri()));
                            str = new C43929l("file", sb.toString()).toString();
                        }
                        jSONObject.put(str2, str);
                    } catch (Exception unused) {
                    }
                    C23131p.m57776a("aweme_media_h265_error_rate", z ^ true ? 1 : 0, jSONObject);
                }
            });
        }
    }

    /* renamed from: b */
    private void m70872b(C30016ag agVar, Aweme aweme) {
        if (agVar != null && aweme != null) {
            if (!C30227g.m70973a(mo60476k())) {
                mo60545m();
            }
            C30014ae j = agVar.mo54004j();
            if (j != null && j.mo60247q() == 2) {
                j.mo60224b(aweme);
            }
        }
    }

    /* renamed from: a */
    private static void m70861a(C30016ag agVar, long j) {
        C25908e a = m70859a(agVar);
        if (a != null && a.mo53246b()) {
            agVar.mo60248r().mo53044a(j);
        }
    }

    /* renamed from: a */
    public static void m70862a(Aweme aweme, String str) {
        if (aweme.getPreload().commentPreload >= 0) {
            C23962d.m58765a().mo49548a(new C23965f(aweme, aweme.getPreload().commentPreload * 1000, str, C23958a.COMMENT));
        }
    }

    /* renamed from: b */
    private void m70874b(boolean z, boolean z2) {
        boolean z3 = z;
        if (this.f78801D) {
            final C30597ae q = m70892q();
            C30016ag a = mo60527a();
            if (C31186b.m72817e(a)) {
                int a2 = C10181b.m20511a().mo18168a(VideoBufferingThresholdExperiment.class, true, "video_buffering_threshold", 31744, 0);
                if (z3) {
                    this.f78813P = SystemClock.elapsedRealtime();
                    this.f78807J++;
                    if (this.f78806I == -1) {
                        this.f78806I = SystemClock.elapsedRealtime();
                    }
                    m70898w();
                    this.f78823Z = (C2147b) C2201v.m6592a((long) a2, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6526b(new C2147b<Long>() {
                        public final void onError(Throwable th) {
                        }

                        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                        }

                        public final void onComplete() {
                            if (q != null) {
                                q.mo60509aa();
                            }
                        }
                    });
                    if (a.mo54004j().mo60180D() != null) {
                        a.mo54004j().mo60180D().mo95216a(this.f78807J);
                    }
                } else {
                    if (!z2) {
                        this.f78813P = 0;
                    }
                    if (this.f78806I != -1) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f78806I;
                        this.f78804G += elapsedRealtime;
                        this.f78806I = -1;
                        if (!z2 && elapsedRealtime >= ((long) a2)) {
                            m70871b(a, elapsedRealtime, "resume", true);
                        }
                        if (a.mo54004j().mo60180D() != null) {
                            a.mo54004j().mo60180D().mo95218a(this.f78804G);
                        }
                    }
                    m70898w();
                    if (q != null) {
                        q.mo60506Y();
                    }
                }
                m70864a(new C43893g(8, z3, 0));
            }
        }
    }

    /* renamed from: a */
    private void m70865a(C50112d dVar, C30016ag agVar) {
        String str;
        if (dVar != null && agVar != null && agVar.mo53999e() != null && agVar.mo53999e().getVideo() != null) {
            Video video = agVar.mo53999e().getVideo();
            HashMap hashMap = new HashMap();
            boolean a = C30163b.m70774a(agVar.mo53999e().getAid());
            hashMap.put("error_code", String.valueOf(dVar.f125526d));
            hashMap.put("error_internal_code", String.valueOf(dVar.f125527e));
            hashMap.put("error_info", String.valueOf(dVar.f125528f));
            hashMap.put("group_id", agVar.mo53999e().getAid());
            hashMap.put("video_id", C50107b.f125505b);
            hashMap.put("is_h265", String.valueOf(dVar.f125524b ? 1 : 0));
            hashMap.put("is_dash", String.valueOf(dVar.f125525c ? 1 : 0));
            hashMap.put("is_ad", String.valueOf(C31186b.m72815c(agVar) ? 1 : 0));
            hashMap.put("internet_speed", String.valueOf(C48918e.m105714f()));
            hashMap.put("cache_size", String.valueOf(C48107j.m104193f().mo95411j(video.getPlayAddr())));
            hashMap.put("video_size", String.valueOf(C48107j.m104193f().mo95410i(video.getPlayAddr())));
            String str2 = "play_url";
            if (video.getPlayAddr() == null) {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                str = video.getPlayAddr().toString();
            }
            hashMap.put(str2, str);
            hashMap.put("player_type", mo60548p().mo95242a().toString());
            hashMap.put("is_from_feed_cache", String.valueOf(a ? 1 : 0));
            C22572b.m55732a("video_play_failed", (Map<String, String>) hashMap);
            if (C41631k.m91508c()) {
                hashMap.put("traffic_economy_mode", String.valueOf(C41631k.f105364a.mo85387d()));
            }
            C26890h.m65011a("video_play_failed", (Map<String, String>) hashMap);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_code", String.valueOf(dVar.f125526d));
                jSONObject.put("error_internal_code", String.valueOf(dVar.f125527e));
                jSONObject.put("internet_speed", String.valueOf(C48918e.m105714f()));
                C30199n.m70856a("error", jSONObject.toString());
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo60540b(Aweme aweme, int i) {
        boolean z;
        String str;
        String str2;
        String str3;
        C22574a.m55738f().mo46921b("feed_ui_to_texture_available", false);
        String str4 = "0";
        try {
            C30597ae q = m70892q();
            if (q == null || !q.mo62794bx() || (VERSION.SDK_INT >= 21 && VERSION.SDK_INT <= 22 && (q.aC_() == null || !q.aC_().isResumed()))) {
                z = false;
            } else {
                z = true;
            }
            if (!z || !m70878c(aweme)) {
                str2 = "3";
            } else {
                C30016ag a = mo60527a();
                if (a == null || a.mo54004j() == null) {
                    str3 = "4";
                } else if (m70900y()) {
                    mo60548p().mo95281a(a.mo54004j().mo60253w());
                    C30137am.m70724a("7");
                    C30137am.m70725a(false);
                    return;
                } else if (a.mo53999e() != aweme) {
                    if (C48069o.f120792a) {
                        Video video = aweme.getVideo();
                        if (video != null) {
                            VideoUrlModel properPlayAddr = aweme.getVideo().getProperPlayAddr();
                            if (properPlayAddr != null) {
                                video.setRationAndSourceId(aweme.getAid());
                                C30016ag h = m70889h(aweme.getAid());
                                if (!C48069o.m104087I()) {
                                    C48021h c = C47981ac.m103815a().mo95142c();
                                    if (h != null) {
                                        c.mo95281a(h.mo54004j().mo60253w());
                                    }
                                    c.mo95284a((C38871j) this);
                                    if (TextUtils.isEmpty(aweme.getVideo().getVideoModelStr())) {
                                        c.mo95277a(properPlayAddr, aweme.getVideo().isNeedSetCookie());
                                    } else {
                                        c.mo95283a(aweme.getVideo());
                                    }
                                } else if (C31186b.m72817e(h)) {
                                    C50158g m = h.mo60242m();
                                    m.mo60205a(video, false, C10181b.m20511a().mo18168a(Get265DecodeTypeExperiment.class, true, "decoder_type", 31744, 0));
                                    m.mo60207a((C38871j) this);
                                }
                            }
                        }
                    }
                    str2 = "5";
                } else if (aweme.isLive()) {
                    m70872b(a, aweme);
                    str2 = "6";
                } else if (!mo60548p().mo95287b((C38871j) this)) {
                    mo60548p().mo95284a((C38871j) this);
                    if (mo60548p().mo95258p()) {
                        mo60548p().mo95281a(a.mo54004j().mo60253w());
                        mo60548p().mo95290w();
                        str2 = "8";
                    } else if (C31186b.m72817e(a)) {
                        C31203o.m72862b(aweme.getAid(), "onTextureAvailable2");
                        str2 = m70870b(aweme, true);
                        try {
                            C31203o.m72863c("tryPlay", str2);
                        } catch (Throwable th) {
                            str4 = str2;
                            th = th;
                        }
                    } else {
                        str2 = "9";
                    }
                } else {
                    C31203o.m72862b(aweme.getAid(), "onTextureAvailable");
                    str3 = mo60534a(aweme, i);
                    C30597ae q2 = m70892q();
                    if (q2 != null) {
                        q2.mo60498T();
                    }
                    try {
                        C31203o.m72863c("tryResumePlay", str3);
                        if (m70888g(aweme)) {
                            mo60548p().mo95265B();
                            C10691a.m21542b(mo60471d(), (int) R.string.ce6).mo19066a();
                        } else {
                            mo60548p().mo95266C();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str4 = str3;
                        C30137am.m70724a(str4);
                        C30137am.m70725a(false);
                        throw th;
                    }
                }
                str = str3;
                if (m70879c(false) && !mo60548p().mo95287b((C38871j) this)) {
                    mo60548p().mo95284a((C38871j) this);
                }
                C30137am.m70724a(str);
                C30137am.m70725a(false);
            }
            str = str2;
            mo60548p().mo95284a((C38871j) this);
            C30137am.m70724a(str);
            C30137am.m70725a(false);
        } catch (Throwable th3) {
            th = th3;
            C30137am.m70724a(str4);
            C30137am.m70725a(false);
            throw th;
        }
    }

    public C30200o(String str, int i, C30597ae aeVar) {
        super(str, i);
        this.f78799B = new WeakReference<>(aeVar);
        this.f78841j = -1;
        this.f78802E = -1;
        this.f78803F = -1;
        this.f78842k = -1;
        this.f78828ad = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m70860a(Video video, C30016ag agVar, C50117f fVar) throws Exception {
        String str;
        JSONObject jSONObject;
        String str2;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("netWorkQuality", C14460b.m29586a().mo26625b().toString());
            jSONObject2.put("netWorkSpeed", (int) C14460b.m29586a().mo26626c());
            jSONObject2.put("playUrl", JSON.toJSONString(video.getProperPlayAddr()));
            jSONObject2.put("video_duration", video.getDuration());
            C48005c.m103856a(jSONObject2);
            File a = C48016e.m103933a(C48016e.m103940b(), "cache");
            String str3 = "file";
            if (a == null) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(a.getPath());
                sb.append("/");
                sb.append(C51835a.m111161a(video.getPlayAddr().getBitRatedRatioUri()));
                str2 = new C43929l("file", sb.toString()).toString();
            }
            jSONObject2.put(str3, str2);
        } catch (Exception unused) {
        }
        C23131p.m56692a("type_log_play_succuss", "play_success", jSONObject2);
        C23131p.m57776a("aweme_media_error_rate", 0, jSONObject2);
        if (VideoBitRateABManager.m103801c().mo95132d()) {
            str = "aweme_media_bitrated_error_rate";
        } else {
            str = "aweme_media_original_error_rate";
        }
        C23131p.m57776a(str, 0, jSONObject2);
        if (C31186b.m72815c(agVar)) {
            try {
                jSONObject = new JSONObject(jSONObject2.toString());
                jSONObject.put("aweme_id", agVar.mo53999e().getAid());
                jSONObject.put("creative_id", agVar.mo53999e().getAwemeRawAd().getCreativeId());
            } catch (Exception unused2) {
                jSONObject = new JSONObject();
            }
            C26086j.m57776a("aweme_ad_media_play_error_rate", 0, jSONObject);
            if (C31186b.m72816d(agVar)) {
                C26033a.m63093a(agVar.mo53999e(), 1, 0);
            }
        }
        if (C31186b.m72816d(agVar) && fVar != null) {
            if (fVar.f125565c / 1000 > 60 || fVar.f125565c / 1000 < 7) {
                C26033a.m63093a(agVar.mo53999e(), 4, 1);
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("alarm_reason", "duration_alarm");
                    if (agVar.mo53999e() != null) {
                        jSONObject3.put("group_id", agVar.mo53999e().getAid());
                    }
                } catch (Exception unused3) {
                }
                C26890h.onEvent(MobClick.obtain().setEventName("ad_alarm").setLabelName("homepage_hot").setJsonObject(jSONObject3));
            } else {
                C26033a.m63093a(agVar.mo53999e(), 4, 0);
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m70871b(C30016ag agVar, long j, String str, boolean z) {
        C30211r rVar = new C30211r(this, agVar, j, str, z);
        C0013i.m18a((Callable<TResult>) rVar, (Executor) C26890h.m65003a());
    }

    /* renamed from: c */
    private JSONObject m70876c(C30016ag agVar, long j, String str, boolean z) {
        int i;
        long j2 = j;
        if (agVar == null || agVar.mo53999e() == null) {
            return null;
        }
        Video video = agVar.mo53999e().getVideo();
        if (video == null) {
            return null;
        }
        VideoUrlModel playAddr = video.getPlayAddr();
        if (playAddr == null) {
            return null;
        }
        C30597ae q = m70892q();
        try {
            JSONObject requestIdAndOrderJsonObject = C23325e.m57379a().getRequestIdAndOrderJsonObject(agVar.mo53999e(), this.f78761f);
            if (q != null) {
                requestIdAndOrderJsonObject.put("enter_from", q.mo60505g(true));
            }
            requestIdAndOrderJsonObject.put("duration", j2);
            requestIdAndOrderJsonObject.put("position", mo60548p().mo95256n());
            requestIdAndOrderJsonObject.put("end_type", str);
            requestIdAndOrderJsonObject.put("player_type", mo60548p().mo95242a().toString());
            requestIdAndOrderJsonObject.put("play_order", this.f78836al);
            String str2 = "is_new_user";
            if (C47667ah.m103178a(C11010c.m22280a())) {
                i = 1;
            } else {
                i = 2;
            }
            requestIdAndOrderJsonObject.put(str2, i);
            requestIdAndOrderJsonObject.put("is_ad", C31186b.m72815c(agVar) ? 1 : 0);
            requestIdAndOrderJsonObject.put("is_cache", C48107j.m104193f().mo95344a(playAddr) ? 1 : 0);
            requestIdAndOrderJsonObject.put("is_first", this.f78827ac ? 1 : 0);
            requestIdAndOrderJsonObject.put("video_duration", playAddr.getDuration());
            StringBuilder sb = new StringBuilder("s:");
            sb.append(this.f78806I);
            sb.append(",e:");
            sb.append(this.f78806I + j2);
            sb.append(",f:");
            sb.append(this.f78815R);
            requestIdAndOrderJsonObject.put("timestamps", sb.toString());
            int i2 = -1;
            if (C48107j.m104193f().mo95344a(playAddr)) {
                requestIdAndOrderJsonObject.put("cache_size", C48107j.m104193f().mo95411j(playAddr) / PreloadTask.BYTE_UNIT_NUMBER);
            } else {
                requestIdAndOrderJsonObject.put("cache_size", -1);
            }
            if (VideoBitRateABManager.m103801c().mo95132d()) {
                Integer a = C31189e.m72827a(playAddr);
                int b = C31189e.m72828b(playAddr);
                if (a == null) {
                    List bitRate = video.getBitRate();
                    if (bitRate != null) {
                        Iterator it = bitRate.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            BitRate bitRate2 = (BitRate) it.next();
                            if (bitRate2 != null && bitRate2.getPlayAddr() != null && !TextUtils.isEmpty(bitRate2.getPlayAddr().getUri()) && playAddr.getUri() != null && playAddr.getUri().startsWith(bitRate2.getPlayAddr().getUri())) {
                                a = Integer.valueOf(bitRate2.getBitRate());
                                b = bitRate2.getQualityType();
                                break;
                            }
                        }
                    }
                }
                String str3 = "video_bitrate";
                if (a != null) {
                    i2 = a.intValue();
                }
                requestIdAndOrderJsonObject.put(str3, i2);
                requestIdAndOrderJsonObject.put("video_quality", b);
                List bitRate3 = playAddr.getBitRate();
                if (bitRate3 != null && !bitRate3.isEmpty()) {
                    requestIdAndOrderJsonObject.put("bitrate_set", new JSONArray(new C17978g().mo34897a(new ExcludeStrategy()).mo34900d().mo34889b(bitRate3)));
                }
            }
            Session b2 = C50122a.m108112a().mo97900b();
            if (b2 != null) {
                requestIdAndOrderJsonObject.put("is_h265", b2.h265 ? 1 : 0);
            }
            requestIdAndOrderJsonObject.put("internet_speed", C48918e.m105714f());
            requestIdAndOrderJsonObject.put("group_id", C23198ae.m56877m(agVar.mo53999e()));
            if (!z) {
                requestIdAndOrderJsonObject.put("drop_cnt", mo60548p().mo95253k());
            } else {
                C48083f f = C48107j.m104193f().mo95356f(playAddr);
                if (f != null) {
                    requestIdAndOrderJsonObject.put("request_info", f.toString());
                }
            }
            requestIdAndOrderJsonObject.put("video_size", String.valueOf(C48107j.m104193f().mo95410i(playAddr)));
            boolean a2 = C10181b.m20511a().mo18172a(CellInfoEnableExperiment.class, true, "enable_cellinfo_report", 31744, false);
            if (VERSION.SDK_INT >= 18 && a2) {
                C38848a aVar = C48040l.m104041a(mo60471d()).f120730f;
                if (requestIdAndOrderJsonObject != null) {
                    if (aVar != null) {
                        JSONArray jSONArray = new JSONArray();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("cell_id", aVar.f98944a);
                            jSONObject.put("snr", aVar.f98946c);
                            jSONObject.put("rsrp", aVar.f98945b);
                            jSONObject.put("lac", aVar.f98947d);
                            jSONArray.put(jSONObject);
                            requestIdAndOrderJsonObject.put("cell_infos", jSONArray);
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
            return requestIdAndOrderJsonObject;
        } catch (Exception unused2) {
            return null;
        }
    }
}
