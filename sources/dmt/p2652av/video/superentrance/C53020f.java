package dmt.p2652av.video.superentrance;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.ValidTimesConfig;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService;
import com.p683ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import dmt.p2652av.video.superentrance.C53015e.C53016a;
import dmt.p2652av.video.superentrance.C53015e.C53017b;
import dmt.p2652av.video.superentrance.C53015e.C53018c;
import java.util.Iterator;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: dmt.av.video.superentrance.f */
public final class C53020f implements ISuperEntranceService {

    /* renamed from: b */
    public static final C52668f f131474b = C52732g.m112285a(C53022b.f131478a);

    /* renamed from: c */
    public static final C53021a f131475c = new C53021a(null);

    /* renamed from: a */
    public final C53006b f131476a = new C53006b();

    /* renamed from: dmt.av.video.superentrance.f$a */
    public static final class C53021a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f131477a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C53021a.class), "INSTANCE", "getINSTANCE()Ldmt/av/video/superentrance/SuperEntranceServiceImpl;"))};

        private C53021a() {
        }

        /* renamed from: a */
        public static C53020f m112748a() {
            return (C53020f) C53020f.f131474b.getValue();
        }

        public /* synthetic */ C53021a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: dmt.av.video.superentrance.f$b */
    static final class C53022b extends C52712l implements C52670a<C53020f> {

        /* renamed from: a */
        public static final C53022b f131478a = new C53022b();

        C53022b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C53020f();
        }
    }

    public final boolean shouldStartSuperEntrance(Context context) {
        C52711k.m112240b(context, "context");
        return false;
    }

    public final void setShowedSuperEntranceTab() {
        this.f131476a.f131448a.storeBoolean("keva_key_showed_superentrance_tab", true);
    }

    public final List<String> getSuperEntranceEffectList() {
        SuperEntranceConfig superEntranceConfig;
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            superEntranceConfig = b.getSuperEntranceConfig();
        } catch (Exception unused) {
            superEntranceConfig = null;
        }
        if (superEntranceConfig != null) {
            List<String> effectIds = superEntranceConfig.getEffectIds();
            if (effectIds != null) {
                return effectIds;
            }
        }
        return C52575l.m112097a();
    }

    public final boolean isNeedShowSuperEntranceTabDirect() {
        if ((this.f131476a.f131448a.getBoolean("showed_superentrance", false) || this.f131476a.f131448a.getBoolean("keva_key_showed_superentrance_tab", false)) && !this.f131476a.mo110560b() && m112747a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m112747a() {
        SuperEntranceConfig superEntranceConfig;
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            superEntranceConfig = b.getSuperEntranceConfig();
        } catch (Exception unused) {
            superEntranceConfig = null;
        }
        boolean z = false;
        if (superEntranceConfig == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = superEntranceConfig.getValidTimes().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ValidTimesConfig validTimesConfig = (ValidTimesConfig) it.next();
            C52711k.m112236a((Object) validTimesConfig, "time");
            Long startTime = validTimesConfig.getStartTime();
            C52711k.m112236a((Object) startTime, "time.startTime");
            if (currentTimeMillis >= startTime.longValue()) {
                Long endTime = validTimesConfig.getEndTime();
                C52711k.m112236a((Object) endTime, "time.endTime");
                if (currentTimeMillis <= endTime.longValue()) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r1 == null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r1 == null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isSuperEntranceResReady() {
        /*
            r2 = this;
            dmt.av.video.superentrance.e r0 = dmt.p2652av.video.superentrance.C53015e.f131470g
            java.lang.String r0 = dmt.p2652av.video.superentrance.C53015e.f131465b
            boolean r0 = com.p683ss.android.ugc.tools.utils.C50200d.m108346a(r0)
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = dmt.p2652av.video.superentrance.C53015e.f131465b
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r1 = dmt.p2652av.video.superentrance.C53015e.m112741a()
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = r1.getVideoMd5()
            if (r1 != 0) goto L_0x001a
        L_0x0018:
            java.lang.String r1 = ""
        L_0x001a:
            boolean r0 = dmt.p2652av.video.superentrance.C53015e.m112742a(r0, r1)
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = dmt.p2652av.video.superentrance.C53015e.f131466c
            boolean r0 = com.p683ss.android.ugc.tools.utils.C50200d.m108346a(r0)
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = dmt.p2652av.video.superentrance.C53015e.f131466c
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r1 = dmt.p2652av.video.superentrance.C53015e.m112741a()
            if (r1 == 0) goto L_0x0036
            java.lang.String r1 = r1.getLoopVideoMd5()
            if (r1 != 0) goto L_0x0038
        L_0x0036:
            java.lang.String r1 = ""
        L_0x0038:
            boolean r0 = dmt.p2652av.video.superentrance.C53015e.m112742a(r0, r1)
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = dmt.p2652av.video.superentrance.C53015e.f131467d
            boolean r0 = com.p683ss.android.ugc.tools.utils.C50200d.m108346a(r0)
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = dmt.p2652av.video.superentrance.C53015e.f131468e
            boolean r0 = com.p683ss.android.ugc.tools.utils.C50200d.m108346a(r0)
            if (r0 == 0) goto L_0x006a
            dmt.av.video.superentrance.b r0 = dmt.p2652av.video.superentrance.C53015e.f131469f
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.mo110558a()
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r0.getUnzipPath()
            java.lang.String r1 = "effect.unzipPath"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            goto L_0x0062
        L_0x0060:
            java.lang.String r0 = ""
        L_0x0062:
            boolean r0 = com.p683ss.android.ugc.tools.utils.C50200d.m108346a(r0)
            if (r0 == 0) goto L_0x006a
            r0 = 1
            return r0
        L_0x006a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p2652av.video.superentrance.C53020f.isSuperEntranceResReady():boolean");
    }

    public final boolean shouldShowSuperEntranceRecord(Context context) {
        C52711k.m112240b(context, "context");
        if (!this.f131476a.mo110560b() && m112747a() && isSuperEntranceResReady()) {
            return true;
        }
        return false;
    }

    public final void preDownloadSuperEntranceRes(Context context) {
        C52711k.m112240b(context, "context");
        C53015e eVar = C53015e.f131470g;
        C52711k.m112240b(context, "context");
        SuperEntranceConfig a = C53015e.m112741a();
        if (a != null) {
            String str = C53015e.f131465b;
            String videoMd5 = a.getVideoMd5();
            C52711k.m112236a((Object) videoMd5, "config.videoMd5");
            String videoUrl = a.getVideoUrl();
            C52711k.m112236a((Object) videoUrl, "config.videoUrl");
            Context context2 = context;
            eVar.mo110566a(context2, str, videoMd5, "babydemo.mp4", videoUrl, false);
            String str2 = C53015e.f131466c;
            String loopVideoMd5 = a.getLoopVideoMd5();
            C52711k.m112236a((Object) loopVideoMd5, "config.loopVideoMd5");
            String loopVideoUrl = a.getLoopVideoUrl();
            C52711k.m112236a((Object) loopVideoUrl, "config.loopVideoUrl");
            eVar.mo110566a(context2, str2, loopVideoMd5, "loop_babydemo.mp4", loopVideoUrl, true);
        }
        C53015e eVar2 = C53015e.f131470g;
        C52711k.m112240b(context, "context");
        SuperEntranceConfig a2 = C53015e.m112741a();
        if (a2 != null) {
            String effectId = a2.getEffectId();
            C53013d dVar = new C53013d(context);
            C52711k.m112236a((Object) effectId, "stickerId");
            C48705j bVar = new C53017b();
            C52711k.m112240b(effectId, "sticker");
            C52711k.m112240b(bVar, "listener");
            if (!TextUtils.isEmpty(effectId)) {
                Application application = C39618d.f101160a;
                C52711k.m112236a((Object) application, "AVEnv.application");
                C29252f a3 = C29242c.m68869a(application, null);
                C39618d.m88216e();
                dVar.f131460a = a3;
                IEffectService a4 = dVar.f131461b.get();
                if (a4 != null) {
                    a4.fetchEffectWithMusicBind(dVar.f131460a, effectId, "", bVar);
                }
            }
        }
        C53015e eVar3 = C53015e.f131470g;
        C52711k.m112240b(context, "context");
        SuperEntranceConfig a5 = C53015e.m112741a();
        if (a5 != null) {
            String plusIconUrl = a5.getPlusIconUrl();
            String plusIconMd5 = a5.getPlusIconMd5();
            String str3 = C53015e.f131467d;
            C52711k.m112236a((Object) plusIconMd5, "iconMd5");
            if (C53015e.m112742a(str3, plusIconMd5)) {
                C26890h.m65011a("super_entrance_download_start", C23089d.m56640a().mo47829a("download_type", "icon").f61491a);
                Downloader.with(context).url(plusIconUrl).name("plusicon.png").savePath(C53015e.f131464a).force(true).mainThreadListener(new C53016a()).download();
            }
        }
        C53015e eVar4 = C53015e.f131470g;
        C52711k.m112240b(context, "context");
        SuperEntranceConfig a6 = C53015e.m112741a();
        if (a6 != null) {
            String videoBackImgUrl = a6.getVideoBackImgUrl();
            String videoBackImgMd5 = a6.getVideoBackImgMd5();
            String str4 = C53015e.f131468e;
            C52711k.m112236a((Object) videoBackImgMd5, "iconMd5");
            if (C53015e.m112742a(str4, videoBackImgMd5)) {
                C26890h.m65011a("super_entrance_download_start", C23089d.m56640a().mo47829a("download_type", "placeholder").f61491a);
                Downloader.with(context).url(videoBackImgUrl).name("videobackimg.png").savePath(C53015e.f131464a).force(true).mainThreadListener(new C53018c()).download();
            }
        }
        C52711k.m112240b(context, "context");
        C52711k.m112240b(context, "context");
    }

    public final void setSuperEntranceRecordClicked(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        this.f131476a.mo110559a(z);
    }
}
