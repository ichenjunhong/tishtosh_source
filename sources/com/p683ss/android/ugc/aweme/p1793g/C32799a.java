package com.p683ss.android.ugc.aweme.p1793g;

import com.bytedance.common.utility.p522b.C9376b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.g.a */
public final class C32799a {

    /* renamed from: a */
    public static final C32799a f85400a = new C32799a();

    private C32799a() {
    }

    /* renamed from: a */
    public static final <T> void m75677a(List<T> list, List<? extends T> list2, C52682m<? super T, ? super T, Boolean> mVar) {
        Object obj;
        C52711k.m112240b(list, "originList");
        C52711k.m112240b(list2, "addList");
        C52711k.m112240b(mVar, "isEquals");
        if (!C9376b.m18558a((Collection<T>) list2)) {
            for (Object next : list2) {
                if (next != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((Boolean) mVar.invoke(obj, next)).booleanValue()) {
                            break;
                        }
                    }
                    if (obj == null) {
                        list.add(next);
                    }
                }
            }
        }
    }
}
