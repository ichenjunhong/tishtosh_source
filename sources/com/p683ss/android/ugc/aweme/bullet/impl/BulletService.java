package com.p683ss.android.ugc.aweme.bullet.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.bullet.p625a.C10211a;
import com.bytedance.ies.bullet.p625a.C10211a.C10212a;
import com.bytedance.ies.bullet.p625a.C10222b;
import com.bytedance.ies.bullet.p628b.C10228a;
import com.bytedance.ies.bullet.p628b.C10228a.C10229a;
import com.bytedance.ies.bullet.p628b.C10242b;
import com.bytedance.ies.bullet.p628b.C10244c.C10246b;
import com.bytedance.ies.bullet.p628b.C10253e;
import com.bytedance.ies.bullet.p628b.p629a.C10238a;
import com.bytedance.ies.bullet.p628b.p630b.C10243a;
import com.bytedance.ies.bullet.p628b.p631c.C10247a;
import com.bytedance.ies.bullet.p628b.p633e.C10284d;
import com.bytedance.ies.bullet.p628b.p633e.C10286e;
import com.bytedance.ies.bullet.p628b.p633e.C10287f;
import com.bytedance.ies.bullet.p628b.p633e.C10288g;
import com.bytedance.ies.bullet.p628b.p633e.C10289h;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.C10294m;
import com.bytedance.ies.bullet.p628b.p633e.C10296o;
import com.bytedance.ies.bullet.p628b.p633e.C10310w;
import com.bytedance.ies.bullet.p628b.p633e.C10313z;
import com.bytedance.ies.bullet.p628b.p636f.C10321d;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p637g.p640c.C10333d;
import com.bytedance.ies.bullet.p628b.p637g.p640c.C10334e;
import com.bytedance.ies.bullet.p628b.p637g.p640c.C10335f;
import com.bytedance.ies.bullet.p628b.p641h.C10357d;
import com.bytedance.ies.bullet.p628b.p641h.C10358e;
import com.bytedance.ies.bullet.p653ui.common.C10577d;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10573c;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.bullet.api.C24107a;
import com.p683ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p683ss.android.ugc.aweme.bullet.utils.C24348b;
import com.p683ss.android.ugc.aweme.bullet.views.BulletLoadView;
import com.p683ss.android.ugc.aweme.bullet.views.C24356a;
import com.p683ss.android.ugc.aweme.bullet.views.C24363c;
import com.p683ss.android.ugc.aweme.crossplatform.p1617d.C27199a;
import com.p683ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p683ss.android.ugc.aweme.local_test.LocalTest;
import com.p683ss.android.ugc.aweme.p1632di.C27602ap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2639f.p2641b.C52731z;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService */
public final class BulletService implements IBulletService {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BulletService.class), "coreProvider", "getCoreProvider()Lcom/bytedance/ies/bullet/core/IBulletCore$IBulletCoreProvider;"))};
    public final C10212a builder;
    private final C52668f coreProvider$delegate = C52732g.m112285a(new C24280a(this));

    /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$a */
    static final class C24280a extends C52712l implements C52670a<C10211a> {

        /* renamed from: a */
        final /* synthetic */ BulletService f64413a;

        C24280a(BulletService bulletService) {
            this.f64413a = bulletService;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj;
            C10212a aVar = this.f64413a.builder;
            C10212a aVar2 = aVar;
            C10229a aVar3 = aVar2.f27549b;
            for (Entry entry : aVar2.f27551d.entrySet()) {
                if (C52711k.m112239a((Object) (String) entry.getKey(), (Object) "defaultPackageBundle")) {
                    C10253e a = aVar2.mo18246a((C10222b) entry.getValue(), "defaultPackageBundle");
                    C52711k.m112240b(a, "packageRegistry");
                    aVar3.f27587k = a;
                } else {
                    String str = (String) entry.getKey();
                    C10253e a2 = aVar2.mo18246a((C10222b) entry.getValue(), (String) entry.getKey());
                    C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
                    C52711k.m112240b(a2, "packageRegistry");
                    aVar3.f27588l.put(str, a2);
                }
            }
            C10243a aVar4 = aVar2.f27550c;
            C52711k.m112240b(aVar4, "debugConfiguration");
            aVar3.f27583g = aVar4;
            C10326b bVar = aVar3.f27577a;
            C10247a aVar5 = aVar3.f27578b;
            C10357d dVar = aVar3.f27579c;
            C10358e eVar = aVar3.f27580d;
            C10238a aVar6 = aVar3.f27581e;
            C10321d dVar2 = aVar3.f27582f;
            C10243a aVar7 = aVar3.f27583g;
            C52682m<? super Iterable<? extends C10333d<C10310w>>, ? super C10334e<C10310w>, ? extends C10335f<C10310w>> mVar = aVar3.f27584h;
            List<C10284d<?, ?, ?, ?>> list = aVar3.f27585i;
            Map<Class<C10284d<?, ?, ?, ?>>, C10289h<?>> map = aVar3.f27586j;
            C10212a aVar8 = aVar;
            Map<Class<C10284d<?, ?, ?, ?>>, C10289h<?>> map2 = map;
            C10228a aVar9 = new C10228a(bVar, aVar5, dVar, eVar, aVar6, dVar2, aVar7, mVar, list, map2, aVar3.f27587k, aVar3.f27588l, aVar3.f27590n, aVar3.f27589m, null);
            Iterator it = aVar2.f27548a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C10284d) obj) instanceof C10313z) {
                    break;
                }
            }
            if (((C10284d) obj) != null) {
                C10212a aVar10 = aVar8;
                Map<String, C10222b> map3 = aVar10.f27551d;
                if (map3 != null) {
                    aVar9.f27560a = C52731z.m112270f(map3);
                    aVar9.f27561b = aVar10.f27552e;
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
                }
            }
            return new C10211a(aVar9, null);
        }
    }

    private final C10246b getCoreProvider() {
        return (C10246b) this.coreProvider$delegate.getValue();
    }

    public static IBulletService provideBulletService_Monster() {
        if (C27991b.f73425I == null) {
            synchronized (IBulletService.class) {
                if (C27991b.f73425I == null) {
                    C27991b.f73425I = C27602ap.m66281a();
                }
            }
        }
        return (IBulletService) C27991b.f73425I;
    }

    public final C10246b getBulletCoreProvider() {
        return getCoreProvider();
    }

    public static IBulletService createIBulletServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IBulletService.class);
        if (a != null) {
            return (IBulletService) a;
        }
        return new BulletService();
    }

    public BulletService() {
        Object obj;
        C10212a aVar = new C10212a();
        String serverDeviceId = TeaAgent.getServerDeviceId();
        C52711k.m112236a((Object) serverDeviceId, "TeaAgent.getServerDeviceId()");
        C10238a aVar2 = new C10238a(serverDeviceId, C11010c.m22288i(), String.valueOf(C11010c.m22289j()), "douyin");
        C52711k.m112240b(aVar2, "appInfo");
        C10229a aVar3 = aVar.f27549b;
        C52711k.m112240b(aVar2, "appInfo");
        aVar3.f27581e = aVar2;
        aVar.mo18245a(false);
        aVar.f27550c.f27638b = LocalTest.m81850a().shouldBulletShowDebugTagView();
        try {
            obj = C52848o.m114620constructorimpl((C24281a) C10181b.m20511a().mo18170a(BulletExperiments.class, true, "bullet_experiments", 31744, C24281a.class));
        } catch (Throwable th) {
            obj = C52848o.m114620constructorimpl(C52851p.m112464a(th));
        }
        if (C52848o.m114625isFailureimpl(obj)) {
            obj = null;
        }
        C24281a aVar4 = (C24281a) obj;
        if (aVar4 != null) {
            C10242b bVar = new C10242b(aVar4.f64415b, aVar4.f64416c, aVar4.f64417d);
            C52711k.m112240b(bVar, "experiments");
            C10229a aVar5 = aVar.f27549b;
            C52711k.m112240b(bVar, "experiments");
            aVar5.f27590n = bVar;
        }
        this.builder = aVar;
    }

    public final void setDebuggable(boolean z) {
        this.builder.mo18245a(z);
    }

    public final String checkNeedCutOutParam(String str) {
        C52711k.m112240b(str, "url");
        String a = C27199a.m65620a(str);
        if (a == null) {
            return str;
        }
        return a;
    }

    public final View getBulletLoadingView(Context context) {
        C52711k.m112240b(context, "context");
        BulletLoadView bulletLoadView = new BulletLoadView(context, null, 0, 6, null);
        return bulletLoadView;
    }

    public final void registerDefaultPackageBundle(Object obj) {
        C52711k.m112240b(obj, "packageBundle");
        C10212a aVar = this.builder;
        C52711k.m112240b(obj, "packageBundle");
        aVar.f27551d.put("defaultPackageBundle", (C10222b) obj);
    }

    public final void setApplication(Application application) {
        C52711k.m112240b(application, "application");
        C10212a aVar = this.builder;
        C52711k.m112240b(application, "application");
        C10229a aVar2 = aVar.f27549b;
        C10326b bVar = new C10326b();
        bVar.mo18400b(Application.class, application);
        C52711k.m112240b(bVar, "contextProviderFactory");
        aVar2.f27577a = bVar;
    }

    public final void setKitDynamicFeature(C10287f fVar) {
        C52711k.m112240b(fVar, "kitDynamicFeature");
        C10212a aVar = this.builder;
        C52711k.m112240b(fVar, "kitDynamic");
        C10229a aVar2 = aVar.f27549b;
        C52711k.m112240b(fVar, "kitDynamic");
        aVar2.f27589m = fVar;
    }

    public final void setReporter(C10357d dVar) {
        C52711k.m112240b(dVar, "reporter");
        C10212a aVar = this.builder;
        C52711k.m112240b(dVar, "reporter");
        C10229a aVar2 = aVar.f27549b;
        C52711k.m112240b(dVar, "reporter");
        aVar2.f27579c = dVar;
    }

    public final void setResourceLoader(C10247a aVar) {
        C52711k.m112240b(aVar, "resourceLoader");
        C10212a aVar2 = this.builder;
        C52711k.m112240b(aVar, "resourceLoader");
        C10229a aVar3 = aVar2.f27549b;
        C52711k.m112240b(aVar, "resourceLoader");
        aVar3.f27578b = aVar;
    }

    public final void setSettings(C10358e eVar) {
        C52711k.m112240b(eVar, "settings");
        C10212a aVar = this.builder;
        C52711k.m112240b(eVar, "settings");
        C10229a aVar2 = aVar.f27549b;
        C52711k.m112240b(eVar, "settings");
        aVar2.f27580d = eVar;
    }

    public final Activity getActivityById(String str) {
        C52711k.m112240b(str, "reactId");
        C10290i a = getCoreProvider().mo18244a().mo18261a(str);
        if (a != null) {
            if (!(a instanceof C10573c)) {
                a = null;
            }
            C10573c cVar = (C10573c) a;
            if (cVar != null) {
                C10577d y = cVar.mo18755y();
                if (y != null) {
                    return y.mo18708a();
                }
            }
        }
        return null;
    }

    public final void registerGlobalSettingsBundle(Object obj) {
        C52711k.m112240b(obj, "globalSettingsBundle");
        C10212a aVar = this.builder;
        C52711k.m112240b(obj, "globalSettingsBundle");
        for (Entry entry : aVar.f27548a.entrySet()) {
            if (entry.getValue() instanceof C10313z) {
                aVar.f27552e = obj;
            } else {
                Class cls = (Class) entry.getKey();
                C10289h convertToGlobalSettingsProvider = ((C10284d) entry.getValue()).convertToGlobalSettingsProvider(obj);
                if (convertToGlobalSettingsProvider != null) {
                    C10229a aVar2 = aVar.f27549b;
                    C52711k.m112240b(cls, "apiClass");
                    C52711k.m112240b(convertToGlobalSettingsProvider, "globalSettingsProviderFactory");
                    aVar2.f27586j.put(cls, convertToGlobalSettingsProvider);
                }
            }
        }
    }

    public final void open(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "schema");
        open(context, str, null, null);
    }

    public final void registerPackageBundle(String str, Object obj) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(obj, "packageBundle");
        C10212a aVar = this.builder;
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(obj, "packageBundle");
        aVar.f27551d.put(str, (C10222b) obj);
    }

    public final void enableKitApi(Class<?> cls, boolean z) {
        C52711k.m112240b(cls, "kitClass");
        C10212a aVar = this.builder;
        C52711k.m112240b(cls, "kitClass");
        if (!z) {
            Object service = ServiceManager.get().getService(cls);
            if (service != null) {
                Map<Class<? extends C10284d<C10294m, C10286e, C10290i, C10288g>>, C10284d<C10294m, C10286e, C10290i, C10288g>> map = aVar.f27548a;
                Class cls2 = service.getClass();
                if (cls2 == null) {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<out com.bytedance.ies.bullet.core.kit.IKitApiDefault /* = com.bytedance.ies.bullet.core.kit.IKitApi<com.bytedance.ies.bullet.core.kit.IKitSettingsProvider, com.bytedance.ies.bullet.core.kit.IKitDelegatesProvider, com.bytedance.ies.bullet.core.kit.IKitInstanceApi, com.bytedance.ies.bullet.core.kit.IKitGlobalSettingsProvider> */>");
                } else if (service != null) {
                    C10284d dVar = (C10284d) service;
                    map.put(cls2, dVar);
                    aVar.f27549b.mo18266a(dVar);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.IKitApiDefault /* = com.bytedance.ies.bullet.core.kit.IKitApi<com.bytedance.ies.bullet.core.kit.IKitSettingsProvider, com.bytedance.ies.bullet.core.kit.IKitDelegatesProvider, com.bytedance.ies.bullet.core.kit.IKitInstanceApi, com.bytedance.ies.bullet.core.kit.IKitGlobalSettingsProvider> */");
                }
            }
        } else if (C52711k.m112239a((Object) cls.getName(), (Object) "com.bytedance.ies.bullet.kit.rn.IRnKitApi")) {
            C10284d a = C10296o.m20822a("com.bytedance.ies.bullet.kit.rn.IRnKitApi");
            if (a != null) {
                aVar.f27548a.put(a.getClass(), a);
                aVar.f27549b.mo18266a(a);
                return;
            }
            C10313z zVar = new C10313z();
            aVar.f27548a.put(zVar.getClass(), zVar);
            aVar.f27549b.mo18266a(zVar);
        }
    }

    public final void open(Context context, String str, Bundle bundle) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "schema");
        open(context, str, null, bundle);
    }

    public final void directOpen(Context context, String str, Bundle bundle) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "bulletSchema");
        Intent buildIntent = SmartRouter.buildRoute(context, "//bullet").buildIntent();
        buildIntent.setData(Uri.parse(str));
        if (bundle != null) {
            buildIntent.putExtras(bundle);
        }
        if (!(context instanceof Activity)) {
            buildIntent.addFlags(268435456);
        }
        context.startActivity(buildIntent);
    }

    public final void open(Context context, String str, String str2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "schema");
        open(context, str, str2, null);
    }

    public final void open(Context context, String str, String str2, Bundle bundle) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "schema");
        open(context, str, str2, bundle, null);
    }

    public final C24363c showBulletBottomDialog(Context context, String str, String str2, int i, int i2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "url");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "url");
        C24356a aVar = new C24356a(context, str, str2, i);
        aVar.f64668c = i2;
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            aVar.mo50160a(activity);
        }
        return aVar;
    }

    public final void open(Context context, String str, String str2, Bundle bundle, C24107a aVar) {
        List list;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "schema");
        Intent buildIntent = SmartRouter.buildRoute(context, "//bullet").buildIntent();
        if (str2 != null) {
            list = C52575l.m112092a(str2);
        } else {
            list = null;
        }
        buildIntent.setData(C24348b.m59713a(str, list, bundle, aVar));
        if (bundle != null) {
            buildIntent.putExtras(bundle);
        }
        if (!(context instanceof Activity)) {
            buildIntent.addFlags(268435456);
        }
        context.startActivity(buildIntent);
    }
}
