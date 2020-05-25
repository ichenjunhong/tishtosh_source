package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.C16658em;
import com.google.android.gms.internal.measurement.C16659en;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.tagmanager.aq */
final class C17179aq implements C17181as {

    /* renamed from: a */
    private final /* synthetic */ Map f48587a;

    /* renamed from: b */
    private final /* synthetic */ Map f48588b;

    /* renamed from: c */
    private final /* synthetic */ Map f48589c;

    /* renamed from: d */
    private final /* synthetic */ Map f48590d;

    C17179aq(C17178ap apVar, Map map, Map map2, Map map3, Map map4) {
        this.f48587a = map;
        this.f48588b = map2;
        this.f48589c = map3;
        this.f48590d = map4;
    }

    /* renamed from: a */
    public final void mo33438a(C16659en enVar, Set<C16658em> set, Set<C16658em> set2, C17176an anVar) {
        List list = (List) this.f48587a.get(enVar);
        this.f48588b.get(enVar);
        if (list != null) {
            set.addAll(list);
            anVar.mo33425c();
        }
        List list2 = (List) this.f48589c.get(enVar);
        this.f48590d.get(enVar);
        if (list2 != null) {
            set2.addAll(list2);
            anVar.mo33426d();
        }
    }
}
