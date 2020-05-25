package com.facebook.p909a;

import android.content.Context;
import com.facebook.C14533n;
import com.facebook.internal.C14295b;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.facebook.a.d */
final class C13572d {

    /* renamed from: a */
    private final HashMap<C13509a, C13593n> f35420a = new HashMap<>();

    /* renamed from: a */
    public final synchronized Set<C13509a> mo25397a() {
        return this.f35420a.keySet();
    }

    /* renamed from: a */
    public final synchronized C13593n mo25396a(C13509a aVar) {
        return (C13593n) this.f35420a.get(aVar);
    }

    /* renamed from: b */
    private synchronized C13593n m27404b(C13509a aVar) {
        C13593n nVar;
        nVar = (C13593n) this.f35420a.get(aVar);
        if (nVar == null) {
            Context g = C14533n.m29773g();
            nVar = new C13593n(C14295b.m29331a(g), C13581g.m27416b(g));
        }
        this.f35420a.put(aVar, nVar);
        return nVar;
    }

    /* renamed from: a */
    public final synchronized void mo25398a(C13590m mVar) {
        if (mVar != null) {
            for (C13509a aVar : mVar.f35452a.keySet()) {
                C13593n b = m27404b(aVar);
                for (C13568c a : mVar.mo25412a(aVar)) {
                    b.mo25416a(a);
                }
            }
        }
    }
}
