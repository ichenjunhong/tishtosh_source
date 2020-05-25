package com.bytedance.ies.bullet.kit.web;

import android.os.Build.VERSION;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.p648a.C10489f;
import com.bytedance.ies.bullet.kit.web.p648a.C10490g;
import com.bytedance.ies.bullet.p628b.C10250d;
import com.bytedance.ies.bullet.p628b.p630b.C10243a;
import com.bytedance.ies.bullet.p628b.p633e.C10254a;
import com.bytedance.ies.bullet.p628b.p633e.C10277aa;
import com.bytedance.ies.bullet.p628b.p633e.C10284d.C10285a;
import com.bytedance.ies.bullet.p628b.p633e.C10286e;
import com.bytedance.ies.bullet.p628b.p633e.C10288g;
import com.bytedance.ies.bullet.p628b.p633e.C10289h;
import com.bytedance.ies.bullet.p628b.p633e.C10293l;
import com.bytedance.ies.bullet.p628b.p633e.C10294m;
import com.bytedance.ies.bullet.p628b.p633e.C10306s;
import com.bytedance.ies.bullet.p628b.p633e.C10310w;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p637g.p640c.C10333d;
import com.p683ss.android.ugc.C27991b;
import java.util.List;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class WebKitApi implements IWebKitApi<C10531n> {
    public static final C10475a Companion = new C10475a(null);
    public static final String SCHEME_HTTP = "http";
    public static final String SCHEME_HTTPS = "https";
    private C10326b contextProviderFactory;
    private C10526i globalSettingsProvider;
    private boolean hasInitialized;
    private final Class<C10531n> instanceType = C10531n.class;

    /* renamed from: com.bytedance.ies.bullet.kit.web.WebKitApi$a */
    public static final class C10475a {
        private C10475a() {
        }

        public /* synthetic */ C10475a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.WebKitApi$b */
    public static final class C10476b implements C10289h<C10526i> {

        /* renamed from: a */
        final /* synthetic */ Object f27873a;

        C10476b(Object obj) {
            this.f27873a = obj;
        }

        /* renamed from: a */
        public final /* synthetic */ C10288g mo18340a(C10326b bVar) {
            C52711k.m112240b(bVar, "providerFactory");
            return ((C10489f) this.f27873a).mo18615a(bVar);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.WebKitApi$c */
    public static final class C10477c implements C10293l<C10527j, C10525h> {

        /* renamed from: a */
        final /* synthetic */ Object f27874a;

        C10477c(Object obj) {
            this.f27874a = obj;
        }

        /* renamed from: a */
        public final /* synthetic */ C10294m mo18354a(C10326b bVar) {
            C52711k.m112240b(bVar, "providerFactory");
            return ((C10490g) this.f27874a).mo18616h(bVar);
        }

        /* renamed from: b */
        public final /* synthetic */ C10286e mo18355b(C10326b bVar) {
            C52711k.m112240b(bVar, "providerFactory");
            return ((C10490g) this.f27874a).mo18617i(bVar);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.WebKitApi$d */
    public static final class C10478d implements C10333d<C10310w> {

        /* renamed from: a */
        final /* synthetic */ WebKitApi f27875a;

        C10478d(WebKitApi webKitApi) {
            this.f27875a = webKitApi;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18267a(Object obj, C52671b bVar, C52671b bVar2) {
            C10310w wVar = (C10310w) obj;
            C52711k.m112240b(wVar, "input");
            C52711k.m112240b(bVar, "resolve");
            C52711k.m112240b(bVar2, "reject");
            if (C52711k.m112239a((Object) wVar.f27712a.getScheme(), (Object) WebKitApi.SCHEME_HTTP) || C52711k.m112239a((Object) wVar.f27712a.getScheme(), (Object) WebKitApi.SCHEME_HTTPS)) {
                bVar.invoke(wVar);
                return;
            }
            C10306s sVar = new C10306s(this.f27875a, wVar.f27712a, null, 4, null);
            bVar2.invoke(sVar);
        }
    }

    public final Class<C10531n> getInstanceType() {
        return this.instanceType;
    }

    public final C10254a getKitType() {
        return C10254a.WEB;
    }

    public final void onApiMounted(C10531n nVar) {
        C52711k.m112240b(nVar, "kitInstanceApi");
    }

    public final boolean useNewInstance() {
        return false;
    }

    public final String getKitSDKVersion() {
        return C10285a.m20799a(this);
    }

    public final C10333d<C10310w> provideProcessor() {
        return new C10478d<>(this);
    }

    public static IWebKitApi createIWebKitApibyMonsterPlugin() {
        Object a = C27991b.m66756a(IWebKitApi.class);
        if (a != null) {
            return (IWebKitApi) a;
        }
        return new WebKitApi();
    }

    public final void ensureKitInitialized() {
        if (!this.hasInitialized) {
            if (VERSION.SDK_INT >= 19) {
                C10326b bVar = this.contextProviderFactory;
                if (bVar != null) {
                    C10243a aVar = (C10243a) bVar.mo18401c(C10243a.class);
                    if (aVar != null && aVar.f27637a) {
                        WebView.setWebContentsDebuggingEnabled(true);
                    }
                }
            }
            this.hasInitialized = true;
        }
    }

    public final C10289h<C10526i> convertToGlobalSettingsProvider(Object obj) {
        C52711k.m112240b(obj, "delegate");
        if (obj instanceof C10489f) {
            return new C10476b<>(obj);
        }
        return null;
    }

    public final C10293l<C10527j, C10525h> convertToPackageProviderFactory(Object obj) {
        C52711k.m112240b(obj, "delegate");
        if (obj instanceof C10490g) {
            return new C10477c<>(obj);
        }
        return null;
    }

    public final void onInitialized(C10526i iVar, C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        this.globalSettingsProvider = iVar;
        this.contextProviderFactory = bVar;
    }

    public final C10531n provideInstanceApi(C10277aa aaVar, List<String> list, C10250d dVar, C10326b bVar) {
        C52711k.m112240b(aaVar, "sessionInfo");
        C52711k.m112240b(list, "packageNames");
        C52711k.m112240b(dVar, "kitPackageRegistryBundle");
        C52711k.m112240b(bVar, "providerFactory");
        ensureKitInitialized();
        C10531n nVar = new C10531n(this, aaVar, list, dVar, bVar);
        return nVar;
    }
}
