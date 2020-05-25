package com.bytedance.p582g.p583a.p585b.p590e;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.g.a.b.e.b */
public final class C9979b {

    /* renamed from: com.bytedance.g.a.b.e.b$a */
    public interface C9980a<A, B> {
        /* renamed from: a */
        boolean mo17947a(A a, B b);
    }

    /* renamed from: a */
    public static boolean m20068a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <L, O> boolean m20067a(Collection<L> collection, O o, C9980a<? super L, O> aVar) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (aVar.mo17947a(it.next(), o)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
