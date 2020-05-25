package com.p683ss.android.ugc.aweme.port.p2082in;

import com.bef.effectsdk.C2592c;
import com.bytedance.common.utility.p523c.C9389c;
import com.bytedance.ies.C10174a;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.asve.C20370d;
import com.p683ss.android.ugc.asve.C20377e;
import com.p683ss.android.ugc.asve.C20377e.C20378a;
import com.p683ss.android.ugc.asve.context.C20358e;
import com.p683ss.android.ugc.asve.context.C20358e.C20360b;
import com.p683ss.android.ugc.asve.context.PreviewSize;
import com.p683ss.android.ugc.asve.p1238b.C20328i;
import com.p683ss.android.ugc.asve.recorder.C20483d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.C31416aq;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.property.C40769ag;
import com.p683ss.android.ugc.aweme.property.C40773ai;
import com.p683ss.android.ugc.aweme.property.C40789h;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.setting.EnableH264HWDecoder;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.utils.C47804db;
import com.p683ss.android.ugc.aweme.utils.C47926h;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.C50702h;
import com.p683ss.android.vesdk.VEListener.C50538b;
import dmt.p2652av.video.p2655c.C52952f;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52775l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.port.in.b */
public final class C39579b implements C20358e {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f101114b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C39579b.class), "logger", "getLogger()Lcom/ss/android/ugc/asve/IASLogger;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C39579b.class), "pathAdaptor", "getPathAdaptor()Lcom/ss/android/ugc/asve/IASPathAdaptor;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C39579b.class), "presenterMonitor", "getPresenterMonitor()Lcom/ss/android/ugc/asve/recorder/IRecordPresenterMonitor;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C39579b.class), "applogPresenter", "getApplogPresenter()Lcom/ss/android/vesdk/VEListener$VEApplogListener;"))};

    /* renamed from: c */
    private final ExecutorService f101115c;

    /* renamed from: d */
    private final String f101116d = "asve";

    /* renamed from: e */
    private final C52668f f101117e = C52732g.m112285a(C39581b.f101128a);

    /* renamed from: f */
    private final C52668f f101118f = C52732g.m112285a(C39583c.f101129a);

    /* renamed from: g */
    private final C52668f f101119g = C52732g.m112285a(C39585d.f101130a);

    /* renamed from: h */
    private final C52668f f101120h = C52732g.m112285a(new C39580a(this));

    /* renamed from: i */
    private final C20328i f101121i = C20328i.AS_SERVER_LOCATION_OVERSEA;

    /* renamed from: j */
    private final File f101122j = new File(C20315a.m50093b().getFilesDir(), "vesdk");

    /* renamed from: k */
    private final File f101123k = new File(C31416aq.m73202a());

    /* renamed from: l */
    private final C2592c f101124l;

    /* renamed from: m */
    private final boolean f101125m;

    /* renamed from: n */
    private final C50702h f101126n;

    /* renamed from: com.ss.android.ugc.aweme.port.in.b$a */
    static final class C39580a extends C52712l implements C52670a<C52952f> {

        /* renamed from: a */
        final /* synthetic */ C39579b f101127a;

        C39580a(C39579b bVar) {
            this.f101127a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (!C39618d.f101152P.mo83103a(C40790a.EnableVEUploadApplog) || !this.f101127a.mo43154h()) {
                return null;
            }
            return new C52952f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.b$b */
    static final class C39581b extends C52712l implements C52670a<C395821> {

        /* renamed from: a */
        public static final C39581b f101128a = new C39581b();

        C39581b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20370d() {
                /* renamed from: b */
                public final void mo42961b(String str) {
                    C52711k.m112240b(str, "message");
                    C45407ay.m98971b(str);
                }

                /* renamed from: a */
                public final void mo42960a(String str) {
                    C52711k.m112240b(str, "message");
                    if (!C39618d.f101152P.mo83103a(C40790a.DisableUploadALog)) {
                        C45407ay.m98972c(str);
                    }
                }

                /* renamed from: c */
                public final void mo42962c(String str) {
                    C52711k.m112240b(str, "message");
                    if (!C39618d.f101152P.mo83103a(C40790a.DisableUploadALog)) {
                        C45407ay.m98968a(str);
                    }
                }

                /* renamed from: d */
                public final void mo42963d(String str) {
                    C52711k.m112240b(str, "message");
                    if (!C39618d.f101152P.mo83103a(C40790a.DisableUploadALog)) {
                        C45407ay.m98973d(str);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.b$c */
    static final class C39583c extends C52712l implements C52670a<C395841> {

        /* renamed from: a */
        public static final C39583c f101129a = new C39583c();

        C39583c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20377e() {
                /* renamed from: a */
                public final String mo43206a(String str, C20378a aVar) {
                    C47804db dbVar;
                    C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
                    C52711k.m112240b(aVar, "type");
                    switch (C39617c.f101136a[aVar.ordinal()]) {
                        case 1:
                            dbVar = C47804db.AUDIO;
                            break;
                        case 2:
                            dbVar = C47804db.IMAGE;
                            break;
                        case 3:
                            dbVar = C47804db.VIDEO;
                            break;
                        default:
                            throw new C52775l();
                    }
                    return C47926h.m103696a(str, dbVar);
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.b$d */
    static final class C39585d extends C52712l implements C52670a<C395861> {

        /* renamed from: a */
        public static final C39585d f101130a = new C39585d();

        C39585d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20483d() {
                /* renamed from: a */
                public final void mo43439a(String str, Map<String, String> map) {
                    C52711k.m112240b(str, "key");
                    C52711k.m112240b(map, "map");
                    C26890h.m65011a(str, map);
                }

                /* renamed from: a */
                public final void mo43741a(String str, JSONObject jSONObject) {
                    C52711k.m112240b(str, "logType");
                    C52711k.m112240b(jSONObject, "logExtra");
                    C23569o.m57779a(str, jSONObject);
                }

                /* renamed from: a */
                public final void mo43440a(Throwable th, String str) {
                    C52711k.m112240b(th, "throwable");
                    C52711k.m112240b(str, "key");
                    C9220a.m18312a(th, str);
                }

                /* renamed from: a */
                public final void mo43438a(String str, String str2, String str3, String str4) {
                    JSONObject jSONObject;
                    JSONObject jSONObject2;
                    if (str3 != null) {
                        jSONObject = new JSONObject(str3);
                    } else {
                        jSONObject = (JSONObject) str3;
                    }
                    if (str4 != null) {
                        jSONObject2 = new JSONObject(str4);
                    } else {
                        jSONObject2 = (JSONObject) str4;
                    }
                    C9951d.m19999a(str, new JSONObject(str2), jSONObject, jSONObject2);
                }
            };
        }
    }

    /* renamed from: a */
    public final ExecutorService mo43147a() {
        return this.f101115c;
    }

    /* renamed from: b */
    public final C20370d mo43148b() {
        return (C20370d) this.f101117e.getValue();
    }

    /* renamed from: c */
    public final C20377e mo43149c() {
        return (C20377e) this.f101118f.getValue();
    }

    /* renamed from: d */
    public final C20483d mo43150d() {
        return (C20483d) this.f101119g.getValue();
    }

    /* renamed from: e */
    public final C50538b mo43151e() {
        return (C50538b) this.f101120h.getValue();
    }

    /* renamed from: f */
    public final C2592c mo43152f() {
        return this.f101124l;
    }

    /* renamed from: h */
    public final boolean mo43154h() {
        return true;
    }

    /* renamed from: i */
    public final C20328i mo43155i() {
        return this.f101121i;
    }

    /* renamed from: j */
    public final boolean mo43156j() {
        return false;
    }

    /* renamed from: l */
    public final File mo43158l() {
        return this.f101122j;
    }

    /* renamed from: q */
    public final File mo43163q() {
        return this.f101123k;
    }

    /* renamed from: w */
    public final boolean mo43169w() {
        return this.f101125m;
    }

    /* renamed from: x */
    public final C50702h mo43170x() {
        return this.f101126n;
    }

    /* renamed from: g */
    public final String mo43153g() {
        return C20360b.m50449a(this);
    }

    /* renamed from: n */
    public final boolean mo43160n() {
        return EnableH264HWDecoder.INSTANCE.enable();
    }

    /* renamed from: A */
    public final boolean mo43144A() {
        return C39618d.f101152P.mo83103a(C40790a.EnableEffectAsyncAPI);
    }

    /* renamed from: B */
    public final boolean mo43145B() {
        if (C39618d.f101152P.mo83104b(C40790a.EffectSDKInfoStickerUseAmazing) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo43157k() {
        return C39618d.f101152P.mo83103a(C40790a.OpenCameraFrameOptimizeSDK);
    }

    /* renamed from: p */
    public final boolean mo43162p() {
        return C39618d.f101152P.mo83103a(C40790a.EnableTT265Decoder);
    }

    /* renamed from: r */
    public final boolean mo43164r() {
        return C39618d.f101152P.mo83103a(C40790a.EnableNewEffectEngineForBuiltInEffect);
    }

    /* renamed from: s */
    public final boolean mo43165s() {
        return C39618d.f101152P.mo83103a(C40790a.VEUseNewEffectAlgorithmApi);
    }

    /* renamed from: t */
    public final int mo43166t() {
        return C39618d.f101151O.mo83118b(C40796a.WideCameraInfo);
    }

    /* renamed from: u */
    public final boolean mo43167u() {
        return C39618d.f101151O.mo83117a(C40796a.DefaultWideMode);
    }

    /* renamed from: v */
    public final int mo43168v() {
        return C39618d.f101152P.mo83104b(C40790a.RecordOutputCategory);
    }

    /* renamed from: z */
    public final String mo43172z() {
        String e = C39618d.f101151O.mo83121e(C40796a.VERuntimeConfig);
        C52711k.m112236a((Object) e, "AVEnv.SETTINGS.getString…Property.VERuntimeConfig)");
        return e;
    }

    /* renamed from: m */
    public final int mo43159m() {
        return C39618d.f101151O.mo83118b(C40796a.EnableVESingleGL) | C39618d.f101152P.mo83104b(C40790a.EnableVECacheGLContext) | C39618d.f101152P.mo83104b(C40790a.EnableImportAvSync) | C39618d.f101152P.mo83104b(C40790a.EnableOpenGLResourceReuse) | C39618d.f101152P.mo83104b(C40790a.EnableSdkInputCrossPlatForm) | C39618d.f101152P.mo83104b(C40790a.EnableGLBase);
    }

    /* renamed from: o */
    public final int mo43161o() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Integer hdHwDecoderMinSideSize = b.getHdHwDecoderMinSideSize();
            C52711k.m112236a((Object) hdHwDecoderMinSideSize, "SettingsReader.get().hdHwDecoderMinSideSize");
            int intValue = hdHwDecoderMinSideSize.intValue();
            if (intValue <= 720 || intValue >= 2200) {
                return 1090;
            }
            return intValue;
        } catch (C10174a unused) {
            return 1090;
        }
    }

    /* renamed from: C */
    public final Map<String, Object> mo43146C() {
        C40789h hVar = C39618d.f101152P;
        C52711k.m112236a((Object) hVar, "AVEnv.AB");
        C40769ag agVar = hVar.f103907a;
        HashMap hashMap = new HashMap();
        for (Entry entry : agVar.mo83091a().entrySet()) {
            Map map = hashMap;
            Object key = entry.getKey();
            Object defValue = ((C40773ai) entry.getValue()).defValue();
            C52711k.m112236a(defValue, "it.value.defValue()");
            map.put(key, defValue);
        }
        return hashMap;
    }

    /* renamed from: y */
    public final PreviewSize mo43171y() {
        boolean z;
        C40790a aVar = C40790a.VECameraPreviewSize;
        String e = C39618d.f101152P.mo83107e(aVar);
        CharSequence charSequence = e;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (!z) {
            try {
                obj = C39618d.f101161b.mo34884a(e, PreviewSize.class);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder("Json AB 配置错误，AB:");
                sb.append(aVar.name());
                sb.append(" 配置:");
                sb.append(e);
                C50203g.m108361b(sb.toString());
            }
        }
        return (PreviewSize) obj;
    }

    public C39579b(C2592c cVar, boolean z, C50702h hVar) {
        C52711k.m112240b(hVar, "veAppField");
        this.f101124l = cVar;
        this.f101125m = z;
        this.f101126n = hVar;
        ExecutorService a = C9389c.m18568a();
        C52711k.m112236a((Object) a, "TTExecutors.getNormalExecutor()");
        this.f101115c = a;
    }
}
