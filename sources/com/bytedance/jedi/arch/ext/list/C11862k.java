package com.bytedance.jedi.arch.ext.list;

import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.jedi.arch.ext.list.k */
public final class C11862k {

    /* renamed from: com.bytedance.jedi.arch.ext.list.k$a */
    static final class C11863a extends C52712l implements C52682m<List<? extends T>, List<? extends T>, List<? extends T>> {

        /* renamed from: a */
        public static final C11863a f31447a = new C11863a();

        C11863a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C52711k.m112240b(list, "list");
            C52711k.m112240b(list2, "loadMore");
            return C52575l.m112133c(list, list2);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.k$b */
    static final class C11864b extends C52712l implements C52682m<List<? extends T>, List<? extends T>, List<? extends T>> {

        /* renamed from: a */
        public static final C11864b f31448a = new C11864b();

        C11864b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C52711k.m112240b(list, "list");
            C52711k.m112240b(list2, "refresh");
            if (!list2.isEmpty()) {
                return list2;
            }
            return list;
        }
    }

    /* renamed from: a */
    public static final <T> C52682m<List<? extends T>, List<? extends T>, List<T>> m24215a() {
        return C11864b.f31448a;
    }

    /* renamed from: b */
    public static final <T> C52682m<List<? extends T>, List<? extends T>, List<T>> m24216b() {
        return C11863a.f31447a;
    }
}
