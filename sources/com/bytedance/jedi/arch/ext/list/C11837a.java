package com.bytedance.jedi.arch.ext.list;

import com.bytedance.jedi.arch.ext.list.p744a.C11841b;
import com.bytedance.jedi.arch.ext.list.p744a.C11841b.C11842a;
import java.util.List;
import java.util.concurrent.Executor;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.arch.ext.list.a */
public interface C11837a<T> {

    /* renamed from: com.bytedance.jedi.arch.ext.list.a$a */
    public static final class C11838a {
        /* renamed from: a */
        public static <T> List<T> m24188a(C11837a<T> aVar) {
            return aVar.aH_().f31416c;
        }

        /* renamed from: a */
        public static <T> T m24186a(C11837a<T> aVar, int i, boolean z) {
            return aVar.aH_().mo22595a(i, z);
        }

        /* renamed from: a */
        public static <T> void m24189a(C11837a<T> aVar, List<? extends T> list, C52670a<C52860x> aVar2) {
            C52711k.m112240b(list, "list");
            C11841b aH_ = aVar.aH_();
            C52711k.m112240b(list, "newList");
            aH_.f31415b++;
            int i = aH_.f31415b;
            List<? extends T> list2 = aH_.f31416c;
            if (list != list2) {
                if (list.isEmpty()) {
                    int size = list2.size();
                    aH_.f31416c = C52575l.m112097a();
                    aH_.f31417d.mo166b(0, size);
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                } else if (list2.isEmpty()) {
                    aH_.f31416c = list;
                    aH_.f31417d.mo164a(0, list.size());
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                } else {
                    Executor executor = aH_.f31418e.f31428a;
                    C11842a aVar3 = new C11842a(aH_, list2, list, i, aVar2);
                    executor.execute(aVar3);
                }
            }
        }
    }

    /* renamed from: a */
    T mo22589a(int i, boolean z);

    /* renamed from: a */
    void mo22590a(List<? extends T> list, C52670a<C52860x> aVar);

    C11841b<T> aH_();
}
