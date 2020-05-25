package com.google.firebase.components;

import com.C2240a;
import com.google.android.gms.common.internal.C15464q;
import com.google.firebase.components.C17863a.C178641;
import com.google.firebase.p1072a.C17847c;
import com.google.firebase.p1072a.C17848d;
import com.google.firebase.p1073b.C17860a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.m */
public final class C17877m extends C17873i {

    /* renamed from: a */
    private final List<C17863a<?>> f49666a;

    /* renamed from: b */
    private final Map<Class<?>, C17881q<?>> f49667b = new HashMap();

    /* renamed from: c */
    private final C17879o f49668c;

    /* renamed from: a */
    private void m43825a() {
        boolean z;
        for (C17863a aVar : this.f49666a) {
            Iterator it = aVar.f49650b.iterator();
            while (true) {
                if (it.hasNext()) {
                    C17869e eVar = (C17869e) it.next();
                    if (eVar.f49662b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && !this.f49667b.containsKey(eVar.f49661a)) {
                        throw new C17872h(C2240a.m6772a("Unsatisfied dependency for component %s: %s", new Object[]{aVar, eVar.f49661a}));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo34699a(Class cls) {
        return super.mo34699a(cls);
    }

    /* renamed from: b */
    public final <T> C17860a<T> mo34700b(Class<T> cls) {
        C15464q.m32124a(cls, (Object) "Null interface requested.");
        return (C17860a) this.f49667b.get(cls);
    }

    /* renamed from: a */
    private <T> void m43826a(C17863a<T> aVar) {
        C17881q qVar = new C17881q(aVar.f49651c, new C17883s(aVar, this));
        for (Class put : aVar.f49649a) {
            this.f49667b.put(put, qVar);
        }
    }

    /* renamed from: a */
    public final void mo34707a(boolean z) {
        for (C17863a aVar : this.f49666a) {
            if (aVar.mo34692a() || (aVar.mo34693b() && z)) {
                mo34699a((Class) aVar.f49649a.iterator().next());
            }
        }
        this.f49668c.mo34709a();
    }

    public C17877m(Executor executor, Iterable<C17868d> iterable, C17863a<?>... aVarArr) {
        this.f49668c = new C17879o(executor);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C17863a.m43804a(this.f49668c, C17879o.class, C17848d.class, C17847c.class));
        for (C17868d components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        Collections.addAll(arrayList, aVarArr);
        this.f49666a = Collections.unmodifiableList(C178641.m43809b(arrayList));
        for (C17863a a : this.f49666a) {
            m43826a(a);
        }
        m43825a();
    }
}
