package com.p683ss.android.ugc.aweme.port.p2082in;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.bef.effectsdk.C2592c;
import com.bytedance.p560f.C9751a;
import com.bytedance.p560f.C9754d;
import com.google.gson.C17971f;
import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1058a.C17422l;
import com.p683ss.android.ttve.nativePort.C20129b;
import com.p683ss.android.ttve.nativePort.C20129b.C20131b;
import com.p683ss.android.ttve.nativePort.C20129b.C20133d;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.effect.C29125b;
import com.p683ss.android.ugc.aweme.effectplatform.C29251e;
import com.p683ss.android.ugc.aweme.effectplatform.C29254h;
import com.p683ss.android.ugc.aweme.effectplatform.C29280z;
import com.p683ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p683ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31501n;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.port.internal.C39658g;
import com.p683ss.android.ugc.aweme.port.internal.C39664m;
import com.p683ss.android.ugc.aweme.port.internal.C39665n;
import com.p683ss.android.ugc.aweme.property.C40789h;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40794k;
import com.p683ss.android.ugc.aweme.property.C40795l;
import com.p683ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieServiceProvider;
import com.p683ss.android.ugc.aweme.services.photomovie.PhotoMovieServiceLoadCallback;
import com.p683ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2243a.C44939a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.effectmanager.C48566b.C48568a;
import com.p683ss.android.ugc.effectmanager.C48566b.C48569b;
import com.p683ss.android.ugc.effectmanager.C48580c;
import com.p683ss.android.ugc.effectmanager.C48580c.C48586a;
import com.p683ss.android.ugc.effectmanager.C48580c.C48587b;
import com.p683ss.android.ugc.effectmanager.C48901i;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48640a;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48642c;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.model.ModelInfo;
import com.p683ss.android.vesdk.C50702h;
import dmt.p2652av.video.p2654b.C52938f;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.port.in.d */
public final class C39618d {

    /* renamed from: A */
    public static C39560am f101137A = f101145I.mo58617o();

    /* renamed from: B */
    public static C39593bd f101138B = f101145I.mo58622t();

    /* renamed from: C */
    public static C39576ax f101139C = f101144H.mo58595z();

    /* renamed from: D */
    public static C39638t f101140D = f101145I.mo58614l();

    /* renamed from: E */
    public static C39544ae f101141E = f101145I.mo58615m();

    /* renamed from: F */
    public static C39647x f101142F = f101145I.mo58603a();

    /* renamed from: G */
    public static C39596bf f101143G = f101145I.mo58601E();

    /* renamed from: H */
    public static C39639u f101144H;

    /* renamed from: I */
    public static C39553ak f101145I;

    /* renamed from: J */
    public static C39599bh f101146J = f101144H.mo58563A();

    /* renamed from: K */
    public static C39552aj f101147K = f101144H.mo58592w();

    /* renamed from: L */
    public static C39610bo f101148L = f101144H.mo58565C();

    /* renamed from: M */
    public static C39577ay f101149M = f101145I.mo58620r();

    /* renamed from: N */
    public static C39597bg f101150N = f101145I.mo58628z();

    /* renamed from: O */
    public static C40795l f101151O = f101144H.mo58574e();

    /* renamed from: P */
    public static C40789h f101152P = f101144H.mo58583n();

    /* renamed from: Q */
    public static C40794k f101153Q = new C40794k();

    /* renamed from: R */
    private static C39627k f101154R;

    /* renamed from: S */
    private static volatile boolean f101155S;

    /* renamed from: T */
    private static volatile C39620a f101156T = C39625i.f101193a;

    /* renamed from: U */
    private static final Object f101157U = new Object();

    /* renamed from: V */
    private static ReentrantLock f101158V = new ReentrantLock();

    /* renamed from: W */
    private static IPhotoMovieServiceProvider f101159W = f101145I.mo58599C();

    /* renamed from: a */
    public static Application f101160a;

    /* renamed from: b */
    public static C17971f f101161b;

    /* renamed from: c */
    public static C39541ac f101162c = f101145I.mo58608f();

    /* renamed from: d */
    public static C39554al f101163d = f101145I.mo58611i();

    /* renamed from: e */
    public static C39575aw f101164e = f101145I.mo58619q();

    /* renamed from: f */
    public static C39604bk f101165f = f101145I.mo58625w();

    /* renamed from: g */
    public static C39545af f101166g = ((C39545af) C17421k.m42653a(f101145I.mo58616n()));

    /* renamed from: h */
    public static C39566ar f101167h = f101145I.mo58598B();

    /* renamed from: i */
    public static C39529ab f101168i = f101145I.mo58604b();

    /* renamed from: j */
    public static C39631n f101169j = f101145I.mo58607e();

    /* renamed from: k */
    public static C39562ao f101170k = f101145I.mo58618p();

    /* renamed from: l */
    public static C39605bl f101171l = f101145I.mo58626x();

    /* renamed from: m */
    public static C39588bb f101172m = f101145I.mo58621s();

    /* renamed from: n */
    public static C39548ah f101173n = f101145I.mo58597A();

    /* renamed from: o */
    public static C39594be f101174o = f101145I.mo58623u();

    /* renamed from: p */
    public static C39611bp f101175p = new C39665n();

    /* renamed from: q */
    public static IVideoConfigService f101176q = new C39664m();

    /* renamed from: r */
    public static IVideoConfigService f101177r = new C39658g();

    /* renamed from: s */
    public static C39608bm f101178s = f101145I.mo58627y();

    /* renamed from: t */
    public static C39591bc f101179t = f101145I.mo58613k();

    /* renamed from: u */
    public static C39564aq f101180u = f101145I.mo58612j();

    /* renamed from: v */
    public static C39550ai f101181v = f101145I.mo58600D();

    /* renamed from: w */
    public static C39543ad f101182w = f101145I.mo58610h();

    /* renamed from: x */
    public static C39527aa f101183x = f101144H.mo58593x();

    /* renamed from: y */
    public static C39600bi f101184y = f101145I.mo58624v();

    /* renamed from: z */
    public static C39603bj f101185z = f101145I.mo58609g();

    /* renamed from: com.ss.android.ugc.aweme.port.in.d$a */
    public interface C39620a {
        /* renamed from: a */
        C50702h mo80692a();
    }

    /* renamed from: g */
    public static String m88218g() {
        return "6.7.0";
    }

    /* renamed from: i */
    private static C48569b m88220i() {
        return C48569b.ONLINE;
    }

    /* renamed from: c */
    public static boolean m88214c() {
        return f101154R.f101196a;
    }

    /* renamed from: a */
    public static boolean m88212a() {
        return f101154R.mo80697a(C39621e.f101189a);
    }

    /* renamed from: h */
    static final /* synthetic */ Void m88219h() throws Exception {
        if (!f101155S) {
            m88210a(f101156T.mo80692a());
        }
        return null;
    }

    /* renamed from: b */
    public static String m88213b() {
        StringBuilder sb = new StringBuilder();
        f101154R.mo80697a((C17422l<Activity>) new C39622f<Activity>(sb));
        return sb.toString();
    }

    /* renamed from: d */
    public static synchronized C31501n m88215d() {
        C31501n e;
        synchronized (C39618d.class) {
            e = C39629l.m88232a().mo58584o().mo64334d().mo64415e();
        }
        return e;
    }

    /* renamed from: f */
    public static void m88217f() {
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableAsyncInitVesdk)) {
            if (!f101155S) {
                m88210a(f101156T.mo80692a());
            }
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                C0013i.m18a(C39624h.f101192a, C0013i.f25b).mo36g();
            } catch (InterruptedException unused) {
            }
        } else if (!f101155S) {
            m88210a(f101156T.mo80692a());
        }
    }

    /* renamed from: e */
    public static void m88216e() {
        ExecutorService executorService;
        synchronized (f101157U) {
            if (!C48580c.m105108a()) {
                final boolean a = f101152P.mo83103a(C40790a.UseNewEffectExecutorType);
                final boolean a2 = f101152P.mo83103a(C40790a.PreFetchPopEffectModel);
                final int b = f101152P.mo83104b(C40790a.FetchEffectModelType);
                C48568a a3 = new C48568a().mo96086a(f101160a.getAssets()).mo96090a((C48641b) C29254h.m68947a()).mo96091a((C48642c) new C29251e()).mo96100d(EffectPlatform.m68835b()).mo96101e("142710f02c3a11e8b42429f14557854a").mo96098b(Build.MODEL).mo96095a(EffectPlatformFactory.createIEffectPlatformFactorybyMonsterPlugin().getHosts()).mo96099c(m88218g()).mo96102f(f101152P.mo83107e(C40790a.EffectExclusionPattern)).mo96094a(new File(f101160a.getFilesDir(), "effectmodel").getPath()).mo96089a((C48640a) new C29280z()).mo96092a(EffectPlatformFactory.createIEffectPlatformFactorybyMonsterPlugin().createEffectConfigurationBuilder(new EffectPlatformBuilder().setContext(f101160a)).mo96662a());
                if (a) {
                    executorService = C24076h.m58902c();
                } else {
                    executorService = C0013i.f24a;
                }
                C48580c.m105105a(a3.mo96096a((Executor) executorService).mo96088a((C48586a) new C48587b() {
                    /* renamed from: a */
                    public final void mo80688a(Effect effect, ModelInfo modelInfo) {
                        new C29125b().startDownloadEffectModelAlog(effect, modelInfo);
                    }

                    /* renamed from: a */
                    public final void mo80691a(Effect effect, Exception exc) {
                        StringBuilder sb = new StringBuilder("onModelNotFound");
                        sb.append(Log.getStackTraceString(exc));
                        C45407ay.m98971b(sb.toString());
                        C23569o.m57776a("model_not_found_rate", 1, C42437ay.m93202a().mo86521a("errorDesc", Log.getStackTraceString(exc)).mo86519a("executor_type", Integer.valueOf(a ? 1 : 0)).mo86519a("prefetch_model", Integer.valueOf(a2 ? 1 : 0)).mo86519a("zip_model", Integer.valueOf(b)).mo86522b());
                    }

                    /* renamed from: a */
                    public final void mo80689a(Effect effect, ModelInfo modelInfo, long j) {
                        StringBuilder sb = new StringBuilder("onModelDownloadSuccess ");
                        sb.append(effect.getName());
                        sb.append(" requirements ");
                        sb.append(modelInfo.getName());
                        C45407ay.m98968a(sb.toString());
                        C23569o.m57776a("model_download_time", 0, C42437ay.m93202a().mo86520a("duration", Long.valueOf(j)).mo86522b());
                        C23569o.m57776a("service_model_download_error_rate", 0, C42437ay.m93202a().mo86519a("executor_type", Integer.valueOf(a ? 1 : 0)).mo86519a("prefetch_model", Integer.valueOf(a2 ? 1 : 0)).mo86519a("zipModel", Integer.valueOf(b)).mo86522b());
                        new C29125b().endDownloadEffectModelAlog(effect, modelInfo, j, 0, null);
                    }

                    /* renamed from: a */
                    public final void mo80690a(Effect effect, ModelInfo modelInfo, Exception exc) {
                        StringBuilder sb = new StringBuilder("onModelDownloadError ");
                        sb.append(effect.getName());
                        sb.append(" requirements ");
                        sb.append(modelInfo.getName());
                        C45407ay.m98971b(sb.toString());
                        C23569o.m57776a("service_model_download_error_rate", 1, C42437ay.m93202a().mo86521a("errorDesc", Log.getStackTraceString(exc)).mo86519a("executor_type", Integer.valueOf(a ? 1 : 0)).mo86519a("prefetch_model", Integer.valueOf(a2 ? 1 : 0)).mo86519a("zip_model", Integer.valueOf(b)).mo86522b());
                        new C29125b().endDownloadEffectModelAlog(effect, modelInfo, -1, -1, exc);
                    }
                }).mo96087a(m88220i()).mo96093a(C48901i.fromValue(b)).mo96097a());
                C48580c.m105106a(C39623g.f101191a);
            }
        }
    }

    static {
        Application application = C39629l.f101204a;
        C39639u uVar = C39629l.f101205b;
        C39553ak akVar = C39630m.f101206a;
        f101160a = application;
        f101144H = uVar;
        f101145I = akVar;
        f101161b = uVar.mo58566D();
        f101154R = new C39627k(application);
        if (f101152P.mo83103a(C40790a.LoadLibraryFromExternal)) {
            C20129b.m49682a((C20133d) new C9751a(new C20131b(), new C9754d(application)));
        }
    }

    /* renamed from: a */
    public static void m88210a(C50702h hVar) {
        C45407ay.m98973d("AVEnv initVESDK start");
        if (!f101155S) {
            try {
                f101158V.lock();
                if (!f101155S) {
                    C52938f.f131308b.mo110535a();
                    m88216e();
                    m88209a(C48580c.m105110b().mo96136e(), hVar);
                    C39615bs.m88207a(f101160a);
                    f101155S = true;
                }
            } finally {
                f101158V.unlock();
            }
        }
        C45407ay.m98973d("AVEnv initVESDK end");
    }

    /* renamed from: a */
    public static void m88211a(Class<?> cls) {
        for (Activity activity : f101154R.f101197b) {
            if (cls.isInstance(activity)) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    private static void m88209a(C2592c cVar, C50702h hVar) {
        C20315a.f55813c.mo42958a(new C39579b(cVar, C44939a.m98279a(f101160a), hVar));
    }

    /* renamed from: a */
    public static void m88208a(Context context, String str, PhotoMovieServiceLoadCallback photoMovieServiceLoadCallback) {
        f101159W.get(context, str, photoMovieServiceLoadCallback);
    }
}
