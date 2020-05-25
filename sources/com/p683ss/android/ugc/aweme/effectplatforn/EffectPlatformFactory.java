package com.p683ss.android.ugc.aweme.effectplatforn;

import android.arch.lifecycle.C0184k;
import android.os.Build;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ttve.nativePort.C20129b;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.effectplatform.C29251e;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.effectplatform.C29254h;
import com.p683ss.android.ugc.aweme.effectplatform.C29280z;
import com.p683ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.language.I18nManagerService;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p683ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.p683ss.android.ugc.effectmanager.C48580c;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.C48890g.C48892a;
import com.p683ss.android.ugc.effectmanager.C48893h;
import com.p683ss.android.ugc.effectmanager.common.p2433a.C48593c;
import com.p683ss.android.ugc.effectmanager.common.p2433a.C48593c.C48594a;
import com.p683ss.android.ugc.effectmanager.common.p2433a.C48596d;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48618b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48657k;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p683ss.android.ugc.effectmanager.effect.p2442a.C48693a;
import com.p683ss.android.ugc.effectmanager.effect.p2442a.C48694b;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48697b;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48703h;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48706k;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48708m;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48709n;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48711p;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48714s;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48749e;
import com.p683ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory */
public class EffectPlatformFactory implements IEffectPlatformFactory {
    private static final String AWEME_HOST = "https://effect.snssdk.com";
    public static final C29281a Companion = new C29281a(null);
    private static final String MUSICAL_HOST = "https://api2.musical.ly/effect/api";
    private static final String TIKTOK_HOST = "https://api.tiktokv.com/effect/api";
    public static ArrayList<String> draftEffectList;

    /* renamed from: com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory$a */
    public static final class C29281a {
        private C29281a() {
        }

        public /* synthetic */ C29281a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo59208a(C48890g gVar) {
            File file = gVar.f122964j;
            C52711k.m112236a((Object) file, "configuration.effectDir");
            String absolutePath = file.getAbsolutePath();
            C52711k.m112236a((Object) absolutePath, "dirPath");
            C52711k.m112240b(absolutePath, "dir");
            boolean z = false;
            if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableEffectDiskCache) && C52830p.m112456b((CharSequence) absolutePath, (CharSequence) "files/effect", false, 2, (Object) null)) {
                z = true;
            }
            if (z) {
                if (gVar.f122974t == null) {
                    gVar.f122974t = EffectPlatform.m68837f();
                }
                if (C48594a.m105132a().mo96146a(absolutePath) == null) {
                    try {
                        C48594a.m105132a().mo96147a(absolutePath, new C48596d(gVar));
                    } catch (Exception unused) {
                        C48593c a = C48594a.m105132a();
                        File file2 = gVar.f122964j;
                        C52711k.m112236a((Object) file2, "configuration.effectDir");
                        String absolutePath2 = file2.getAbsolutePath();
                        C52711k.m112236a((Object) absolutePath2, "configuration.effectDir.absolutePath");
                        a.mo96147a(absolutePath, new C48618b(absolutePath2));
                    }
                }
                gVar.f122972r = C48594a.m105132a().mo96146a(absolutePath);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory$b */
    public static final class C29282b implements C48693a {

        /* renamed from: a */
        private final C48693a f76661a = C48580c.m105111c();

        C29282b() {
            C52711k.m112236a((Object) C48580c.m105110b(), "DownloadableModelSupport.getInstance()");
        }

        /* renamed from: a */
        public final C48657k<C48749e> mo59209a(C48694b bVar) {
            C52711k.m112240b(bVar, "arguments");
            C20129b.m49685b();
            C48657k<C48749e> a = this.f76661a.mo59209a(bVar);
            C52711k.m112236a((Object) a, "delegate.fetchEffect(arguments)");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory$c */
    public static final class C29283c implements C29252f {

        /* renamed from: a */
        final /* synthetic */ C29252f f76662a;

        /* renamed from: b */
        private final /* synthetic */ C29252f f76663b;

        /* renamed from: a */
        public final void mo59122a(C0184k kVar) {
            this.f76663b.mo59122a(kVar);
        }

        /* renamed from: a */
        public final void mo59123a(Effect effect, C48705j jVar) {
            this.f76663b.mo59123a(effect, jVar);
        }

        /* renamed from: a */
        public final void mo59124a(ProviderEffect providerEffect, C48697b bVar) {
            C52711k.m112240b(providerEffect, "p0");
            C52711k.m112240b(bVar, "p1");
            this.f76663b.mo59124a(providerEffect, bVar);
        }

        /* renamed from: a */
        public final void mo59125a(String str) {
            C52711k.m112240b(str, "p0");
            this.f76663b.mo59125a(str);
        }

        /* renamed from: a */
        public final void mo59126a(String str, C48702g gVar) {
            C52711k.m112240b(str, "p0");
            C52711k.m112240b(gVar, "p1");
            this.f76663b.mo59126a(str, gVar);
        }

        /* renamed from: a */
        public final void mo59127a(String str, C48706k kVar) {
            this.f76663b.mo59127a(str, kVar);
        }

        /* renamed from: a */
        public final void mo59128a(String str, C48709n nVar) {
            this.f76663b.mo59128a(str, nVar);
        }

        /* renamed from: a */
        public final void mo59129a(String str, String str2, int i, int i2, int i3, String str3, C48701f fVar) {
            String str4 = str;
            C52711k.m112240b(str, "p0");
            C48701f fVar2 = fVar;
            C52711k.m112240b(fVar2, "p6");
            this.f76663b.mo59129a(str4, str2, i, i2, i3, str3, fVar2);
        }

        /* renamed from: a */
        public final void mo59130a(String str, String str2, int i, int i2, C48708m mVar) {
            C52711k.m112240b(str, "p0");
            C52711k.m112240b(mVar, "p4");
            this.f76663b.mo59130a(str, str2, i, i2, mVar);
        }

        /* renamed from: a */
        public final void mo59131a(String str, String str2, int i, int i2, Map<String, String> map, C48714s sVar) {
            this.f76663b.mo59131a(str, str2, i, i2, map, sVar);
        }

        /* renamed from: a */
        public final void mo59132a(String str, String str2, C48705j jVar) {
            C52711k.m112240b(str, "p0");
            this.f76663b.mo59132a(str, str2, jVar);
        }

        /* renamed from: a */
        public final void mo59133a(String str, String str2, C48715t tVar) {
            C52711k.m112240b(tVar, "p2");
            this.f76663b.mo59133a(str, str2, tVar);
        }

        /* renamed from: a */
        public final void mo59134a(String str, String str2, boolean z, int i, int i2, int i3, String str3, C48701f fVar) {
            String str4 = str;
            C52711k.m112240b(str, "p0");
            C48701f fVar2 = fVar;
            C52711k.m112240b(fVar2, "p7");
            this.f76663b.mo59134a(str4, str2, z, i, i2, i3, str3, fVar2);
        }

        /* renamed from: a */
        public final void mo59135a(String str, List<String> list, Boolean bool, C48711p pVar) {
            this.f76663b.mo59135a(str, list, bool, pVar);
        }

        /* renamed from: a */
        public final void mo59136a(String str, List<String> list, String str2, C48710o oVar) {
            C52711k.m112240b(oVar, "p3");
            this.f76663b.mo59136a(str, list, str2, oVar);
        }

        /* renamed from: a */
        public final void mo59137a(String str, boolean z, int i, int i2, C48708m mVar) {
            C52711k.m112240b(mVar, "p4");
            this.f76663b.mo59137a(str, z, i, i2, mVar);
        }

        /* renamed from: a */
        public final void mo59138a(String str, boolean z, C48702g gVar) {
            C52711k.m112240b(str, "p0");
            C52711k.m112240b(gVar, "p2");
            this.f76663b.mo59138a(str, z, gVar);
        }

        /* renamed from: a */
        public final void mo59139a(String str, boolean z, String str2, int i, int i2, C48707l lVar) {
            C52711k.m112240b(str, "p0");
            this.f76663b.mo59139a(str, z, str2, i, i2, lVar);
        }

        /* renamed from: a */
        public final void mo59140a(List<String> list, Map<String, String> map, C48703h hVar) {
            this.f76663b.mo59140a(list, map, hVar);
        }

        /* renamed from: a */
        public final void mo59141a(List<String> list, Map<String, String> map, boolean z, C48704i iVar) {
            this.f76663b.mo59141a(list, map, z, iVar);
        }

        /* renamed from: b */
        public final void mo59143b(String str, boolean z, C48702g gVar) {
            C52711k.m112240b(str, "p0");
            C52711k.m112240b(gVar, "p2");
            this.f76663b.mo59143b(str, z, gVar);
        }

        /* renamed from: b */
        public final void mo59144b(List<String> list, Map<String, String> map, C48703h hVar) {
            C52711k.m112240b(list, "p0");
            C52711k.m112240b(hVar, "p2");
            this.f76663b.mo59144b(list, map, hVar);
        }

        /* renamed from: b */
        public final boolean mo59145b(Effect effect) {
            return this.f76663b.mo59145b(effect);
        }

        /* renamed from: d */
        public final void mo59146d() {
            this.f76663b.mo59146d();
        }

        public final void destroy() {
            this.f76663b.destroy();
        }

        /* renamed from: e */
        public final C48893h mo59148e() {
            return this.f76663b.mo59148e();
        }

        /* renamed from: a */
        public final boolean mo59142a(Effect effect) {
            C20129b.m49685b();
            return this.f76662a.mo59142a(effect);
        }

        C29283c(C29252f fVar) {
            this.f76662a = fVar;
            this.f76663b = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory$d */
    static final class C29284d extends C52712l implements C52671b<C48890g, C52860x> {

        /* renamed from: a */
        public static final C29284d f76664a = new C29284d();

        C29284d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C48890g gVar = (C48890g) obj;
            C52711k.m112240b(gVar, "$receiver");
            EffectPlatformFactory.Companion.mo59208a(gVar);
            return C52860x.f131107a;
        }
    }

    public List<Host> getDefaultHosts() {
        return getHosts();
    }

    public String getDefaultAppId() {
        String b = EffectPlatform.m68835b();
        C52711k.m112236a((Object) b, "EffectPlatform.getAppId()");
        return b;
    }

    public String getDefaultRegon() {
        String a = C39629l.m88232a().mo58590u().mo74214a();
        C52711k.m112236a((Object) a, "CameraClient.getAPI().locationService.region");
        return a;
    }

    public List<Host> getHosts() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Host(TIKTOK_HOST));
        return arrayList;
    }

    public static IEffectPlatformFactory createIEffectPlatformFactorybyMonsterPlugin() {
        Object a = C27991b.m66756a(IEffectPlatformFactory.class);
        if (a != null) {
            return (IEffectPlatformFactory) a;
        }
        if (C27991b.f73447aD == null) {
            synchronized (IEffectPlatformFactory.class) {
                if (C27991b.f73447aD == null) {
                    C27991b.f73447aD = new EffectPlatformFactory();
                }
            }
        }
        return (EffectPlatformFactory) C27991b.f73447aD;
    }

    public C29252f create(EffectPlatformBuilder effectPlatformBuilder) {
        C52711k.m112240b(effectPlatformBuilder, "effectPlatformBuilder");
        C39629l.m88232a().mo58587r();
        C48892a createEffectConfigurationBuilder = createEffectConfigurationBuilder(effectPlatformBuilder);
        if (effectPlatformBuilder.getEffectFetcher() == null) {
            createEffectConfigurationBuilder.mo96661a(new C29282b());
        } else {
            createEffectConfigurationBuilder.mo96661a(effectPlatformBuilder.getEffectFetcher());
        }
        return new C29283c(create(createEffectConfigurationBuilder, C29284d.f76664a));
    }

    public C48892a createEffectConfigurationBuilder(EffectPlatformBuilder effectPlatformBuilder) {
        String str;
        C52711k.m112240b(effectPlatformBuilder, "effectPlatformBuilder");
        addDefaultParams(effectPlatformBuilder);
        C48892a aVar = new C48892a();
        aVar.f122984a = effectPlatformBuilder.getAccessKey();
        aVar.f122988e = effectPlatformBuilder.getChannel();
        aVar.f122985b = effectPlatformBuilder.getSdkVersion();
        aVar.f122986c = effectPlatformBuilder.getAppVersion();
        aVar.f122989f = "android";
        aVar.f122990g = Build.MODEL;
        aVar.f122996m = effectPlatformBuilder.getJsonConverter();
        aVar.f123001r = new C29251e();
        if (AppLog.getServerDeviceId() == null) {
            str = "0";
        } else {
            str = AppLog.getServerDeviceId();
        }
        aVar.f122987d = str;
        aVar.f122994k = effectPlatformBuilder.getAppID();
        aVar.f122999p = effectPlatformBuilder.getAppLanguage();
        effectPlatformBuilder.getSystemLanguage();
        String longitude = effectPlatformBuilder.getLongitude();
        String latitude = effectPlatformBuilder.getLatitude();
        String cityCode = effectPlatformBuilder.getCityCode();
        aVar.f123004u = longitude;
        aVar.f123005v = latitude;
        aVar.f123006w = cityCode;
        Integer retryCount = effectPlatformBuilder.getRetryCount();
        C52711k.m112236a((Object) retryCount, "effectPlatformBuilder.retryCount");
        aVar.f122998o = retryCount.intValue();
        File cacheDir = effectPlatformBuilder.getCacheDir();
        aVar.f122992i = cacheDir;
        if (cacheDir != null && !cacheDir.exists()) {
            cacheDir.mkdirs();
        }
        aVar.f122995l = effectPlatformBuilder.getEffectNetWorker();
        aVar.f122993j = effectPlatformBuilder.getRegion();
        aVar.f122981A = effectPlatformBuilder.getHosts();
        aVar.f123009z = effectPlatformBuilder.getContext().getApplicationContext();
        aVar.f123002s = effectPlatformBuilder.getExecutorService();
        C48892a a = aVar.mo96661a(effectPlatformBuilder.getEffectFetcher());
        Integer requestStrategy = effectPlatformBuilder.getRequestStrategy();
        C52711k.m112236a((Object) requestStrategy, "effectPlatformBuilder.requestStrategy");
        a.f123008y = requestStrategy.intValue();
        a.f122982B = C39618d.f101152P.mo83103a(C40790a.Enable_EffectPlatform_Refactor);
        C52711k.m112236a((Object) a, "configurationBuilder");
        return a;
    }

    private final void addDefaultParams(EffectPlatformBuilder effectPlatformBuilder) {
        boolean z;
        if (effectPlatformBuilder.getContext() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (effectPlatformBuilder.getRegion() == null) {
                effectPlatformBuilder.setRegion(getDefaultRegon());
            }
            if (effectPlatformBuilder.getOkHttpClient() == null) {
                effectPlatformBuilder.setOkHttpClient(C39629l.m88232a().mo58595z().getOKHttpClient());
            }
            if (effectPlatformBuilder.getAccessKey() == null) {
                effectPlatformBuilder.setAccessKey(C39629l.m88232a().mo58575f().mo58630a());
            }
            if (effectPlatformBuilder.getCacheDir() == null) {
                effectPlatformBuilder.setCacheDir(EffectPlatform.f76569a);
            }
            if (effectPlatformBuilder.getSdkVersion() == null) {
                effectPlatformBuilder.setSdkVersion(C39629l.m88232a().mo58575f().mo58631b());
            }
            if (effectPlatformBuilder.getChannel() == null) {
                String j = C39629l.m88232a().mo58588s().mo74164j();
                C52711k.m112236a((Object) j, "channel");
                effectPlatformBuilder.setChannel(j);
            }
            if (effectPlatformBuilder.getAppVersion() == null) {
                effectPlatformBuilder.setAppVersion(C39629l.m88232a().mo58588s().mo74163i());
            }
            if (effectPlatformBuilder.getAppID() == null) {
                effectPlatformBuilder.setAppID(getDefaultAppId());
            }
            if (effectPlatformBuilder.getAppLanguage() == null) {
                I18nManagerService createI18nManagerServicebyMonsterPlugin = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin();
                C52711k.m112236a((Object) createI18nManagerServicebyMonsterPlugin, "ServiceManager.get().get…nagerService::class.java)");
                effectPlatformBuilder.setAppLanguage(createI18nManagerServicebyMonsterPlugin.getAppLanguage());
            }
            if (effectPlatformBuilder.getSystemLanguage() == null) {
                I18nManagerService createI18nManagerServicebyMonsterPlugin2 = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin();
                C52711k.m112236a((Object) createI18nManagerServicebyMonsterPlugin2, "ServiceManager.get().get…nagerService::class.java)");
                effectPlatformBuilder.setSystemLanguage(createI18nManagerServicebyMonsterPlugin2.getSysLanguage());
            }
            if (effectPlatformBuilder.getRetryCount() == null) {
                effectPlatformBuilder.setRetryCount(Integer.valueOf(2));
            }
            if (effectPlatformBuilder.getHosts() == null) {
                effectPlatformBuilder.setHosts(getDefaultHosts());
            }
            if (effectPlatformBuilder.getEffectNetWorker() == null) {
                effectPlatformBuilder.setEffectNetWorker(new C29280z());
            }
            if (effectPlatformBuilder.getExecutorService() == null) {
                effectPlatformBuilder.setExecutorService(C24076h.m58902c());
            }
            C52711k.m112240b(effectPlatformBuilder, "$this$fillLocationIfNeeded");
            if (effectPlatformBuilder.getJsonConverter() == null) {
                effectPlatformBuilder.setJsonConverter(C29254h.m68947a());
            }
            if (effectPlatformBuilder.getRequestStrategy() == null) {
                effectPlatformBuilder.setRequestStrategy(Integer.valueOf(C39629l.m88232a().mo58583n().mo83104b(C40790a.PlatformOptimizeStrategy)));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("context is null.".toString());
    }

    public C29252f create(C48892a aVar, C52671b<? super C48890g, C52860x> bVar) {
        C52711k.m112240b(aVar, "builder");
        C48890g a = aVar.mo96662a();
        if (bVar != null) {
            C52711k.m112236a((Object) a, "effectConfiguration");
            bVar.invoke(a);
        }
        return new EffectPlatform(a);
    }
}
