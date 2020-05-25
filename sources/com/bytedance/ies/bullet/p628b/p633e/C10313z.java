package com.bytedance.ies.bullet.p628b.p633e;

import com.bytedance.ies.bullet.p628b.C10250d;
import com.bytedance.ies.bullet.p628b.p633e.C10284d.C10285a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p637g.p640c.C10333d;
import java.util.List;
import p2628d.C52803m;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.e.z */
public final class C10313z implements C10284d<C10294m, C10286e, C10290i, C10288g> {

    /* renamed from: a */
    private final Class<C10290i> f27716a = C10290i.class;

    /* renamed from: com.bytedance.ies.bullet.b.e.z$a */
    public static final class C10314a implements C10333d<C10310w> {

        /* renamed from: a */
        final /* synthetic */ C10313z f27717a;

        C10314a(C10313z zVar) {
            this.f27717a = zVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18267a(Object obj, C52671b bVar, C52671b bVar2) {
            C10310w wVar = (C10310w) obj;
            C52711k.m112240b(wVar, "input");
            C52711k.m112240b(bVar, "resolve");
            C52711k.m112240b(bVar2, "reject");
            if (C52711k.m112239a((Object) wVar.f27712a.getScheme(), (Object) "react-native")) {
                bVar2.invoke(new Exception("fallback"));
                return;
            }
            C10306s sVar = new C10306s(this.f27717a, wVar.f27712a, null, 4, null);
            bVar2.invoke(sVar);
        }
    }

    public final C10289h<C10288g> convertToGlobalSettingsProvider(Object obj) {
        C52711k.m112240b(obj, "delegate");
        return null;
    }

    public final C10293l<C10294m, C10286e> convertToPackageProviderFactory(Object obj) {
        C52711k.m112240b(obj, "delegate");
        return null;
    }

    public final void ensureKitInitialized() {
    }

    public final C10254a getKitType() {
        return C10254a.NONE;
    }

    public final void onApiMounted(C10290i iVar) {
        C52711k.m112240b(iVar, "kitInstanceApi");
    }

    public final void onInitialized(C10288g gVar, C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
    }

    public final boolean useNewInstance() {
        return false;
    }

    public final String getKitSDKVersion() {
        return C10285a.m20799a(this);
    }

    public final C10333d<C10310w> provideProcessor() {
        return new C10314a<>(this);
    }

    public final C10290i provideInstanceApi(C10277aa aaVar, List<String> list, C10250d dVar, C10326b bVar) {
        C52711k.m112240b(aaVar, "sessionInfo");
        C52711k.m112240b(list, "packageNames");
        C52711k.m112240b(dVar, "kitPackageRegistryBundle");
        C52711k.m112240b(bVar, "providerFactory");
        StringBuilder sb = new StringBuilder("An operation is not implemented: ");
        sb.append("not implemented");
        throw new C52803m(sb.toString());
    }
}
