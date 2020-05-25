package com.bytedance.ies.bullet.p628b.p633e;

import com.bytedance.ies.bullet.p628b.C10250d;
import com.bytedance.ies.bullet.p628b.p633e.C10286e;
import com.bytedance.ies.bullet.p628b.p633e.C10288g;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.C10294m;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p637g.p640c.C10333d;
import java.util.List;

/* renamed from: com.bytedance.ies.bullet.b.e.d */
public interface C10284d<S extends C10294m, T extends C10286e, U extends C10290i, V extends C10288g> {

    /* renamed from: com.bytedance.ies.bullet.b.e.d$a */
    public static final class C10285a {
        /* renamed from: a */
        public static <S extends C10294m, T extends C10286e, U extends C10290i, V extends C10288g> String m20799a(C10284d<S, T, U, V> dVar) {
            return "";
        }
    }

    C10289h<V> convertToGlobalSettingsProvider(Object obj);

    C10293l<S, T> convertToPackageProviderFactory(Object obj);

    void ensureKitInitialized();

    String getKitSDKVersion();

    C10254a getKitType();

    void onApiMounted(U u);

    void onInitialized(V v, C10326b bVar);

    U provideInstanceApi(C10277aa aaVar, List<String> list, C10250d dVar, C10326b bVar);

    C10333d<C10310w> provideProcessor();

    boolean useNewInstance();
}
