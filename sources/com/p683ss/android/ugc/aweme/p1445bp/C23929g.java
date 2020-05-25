package com.p683ss.android.ugc.aweme.p1445bp;

import android.app.Application;
import com.p683ss.android.ugc.aweme.p1445bp.p1448c.C23886b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23908c;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23937d;
import com.p683ss.android.ugc.aweme.p1445bp.p1458i.p1459a.C23944a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.tools.policysecurity.C47332a.C47333a;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.g */
public final class C23929g implements C23937d {

    /* renamed from: a */
    private final ConcurrentHashMap<String, C23944a> f63590a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final Set<String> mo49522a() {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Collection<C23944a> values = this.f63590a.values();
        C52711k.m112236a((Object) values, "mWhiteListHolder.values");
        for (C23944a aVar : values) {
            if (!aVar.f63607b.get()) {
                C23937d d = C39629l.m88232a().mo58577h().mo49490d();
                String name = aVar.getClass().getName();
                C52711k.m112236a((Object) name, "javaClass.name");
                if (d.mo49524a(name) || !C23908c.f63580a.mo49511b()) {
                    aVar.mo49539a();
                    aVar.f63607b.set(true);
                } else {
                    throw new C23886b(null, 1, null);
                }
            }
            linkedHashSet.addAll(aVar.f63608c);
        }
        Application application = C39618d.f101160a;
        C52711k.m112236a((Object) application, "context");
        String[] a = C47333a.m102700a(application);
        linkedHashSet.addAll(C52575l.m112099b((Object[]) (String[]) Arrays.copyOf(a, a.length)));
        return linkedHashSet;
    }

    /* renamed from: a */
    public final boolean mo49524a(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        return this.f63590a.containsKey(str);
    }

    /* renamed from: a */
    public final void mo49523a(C23944a aVar) {
        C52711k.m112240b(aVar, "whiteList");
        Map map = this.f63590a;
        String name = aVar.getClass().getName();
        C52711k.m112236a((Object) name, "whiteList.javaClass.name");
        map.put(name, aVar);
    }
}
