package com.facebook.p909a;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.a.m */
final class C13590m implements Serializable {
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: a */
    HashMap<C13509a, List<C13568c>> f35452a = new HashMap<>();

    /* renamed from: com.facebook.a.m$a */
    static class C13592a implements Serializable {
        private static final long serialVersionUID = 20160629001L;

        /* renamed from: a */
        private final HashMap<C13509a, List<C13568c>> f35453a;

        private Object readResolve() {
            return new C13590m(this.f35453a);
        }

        private C13592a(HashMap<C13509a, List<C13568c>> hashMap) {
            this.f35453a = hashMap;
        }
    }

    public C13590m() {
    }

    private Object writeReplace() {
        return new C13592a(this.f35452a);
    }

    /* renamed from: a */
    public final List<C13568c> mo25412a(C13509a aVar) {
        return (List) this.f35452a.get(aVar);
    }

    public C13590m(HashMap<C13509a, List<C13568c>> hashMap) {
        this.f35452a.putAll(hashMap);
    }

    /* renamed from: a */
    public final void mo25413a(C13509a aVar, List<C13568c> list) {
        if (!this.f35452a.containsKey(aVar)) {
            this.f35452a.put(aVar, list);
        } else {
            ((List) this.f35452a.get(aVar)).addAll(list);
        }
    }
}
