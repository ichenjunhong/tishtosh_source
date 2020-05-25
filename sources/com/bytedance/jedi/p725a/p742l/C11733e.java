package com.bytedance.jedi.p725a.p742l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2629a.C52586v.C52588b;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.a.l.e */
public final class C11733e<T> implements C11730b<T> {

    /* renamed from: a */
    public static final C11734a f31186a = new C11734a(null);

    /* renamed from: b */
    private T f31187b;

    /* renamed from: c */
    private final LinkedHashSet<C52847n<C11729a<?>, Long>> f31188c;

    /* renamed from: com.bytedance.jedi.a.l.e$a */
    public static final class C11734a {
        private C11734a() {
        }

        public /* synthetic */ C11734a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static <T> C11730b<T> m24062a(T t, C11730b<?> bVar) {
            C52711k.m112240b(bVar, "parent");
            return bVar.mo22486a(t);
        }
    }

    /* renamed from: a */
    public final T mo22487a() {
        return this.f31187b;
    }

    /* renamed from: b */
    public final C52847n<C11729a<?>, Long> mo22489b() {
        Object obj;
        Object next;
        LinkedHashSet<C52847n<C11729a<?>, Long>> linkedHashSet = this.f31188c;
        if (!(!linkedHashSet.isEmpty())) {
            return null;
        }
        Iterable iterable = linkedHashSet;
        C52711k.m112240b(iterable, "$this$last");
        if (iterable instanceof List) {
            obj = C52575l.m112142g((List) iterable);
        } else {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            } else {
                throw new NoSuchElementException("Collection is empty.");
            }
        }
        return (C52847n) obj;
    }

    /* renamed from: b */
    public final boolean mo22490b(C11729a<T> aVar) {
        C52711k.m112240b(aVar, "point");
        return this.f31188c.add(C52856t.m112465a(aVar, Long.valueOf(System.currentTimeMillis())));
    }

    /* renamed from: a */
    public final boolean mo22488a(C11729a<?> aVar) {
        C52711k.m112240b(aVar, "point");
        Iterable<C52847n> iterable = this.f31188c;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (C52847n first : iterable) {
            arrayList.add((C11729a) first.getFirst());
        }
        return ((List) arrayList).contains(aVar);
    }

    /* renamed from: a */
    public final <V> C11730b<V> mo22486a(V v) {
        Object obj;
        if (C52711k.m112239a((Object) this.f31187b, (Object) v)) {
            return this;
        }
        int size = this.f31188c.size();
        C52847n[] nVarArr = new C52847n[size];
        for (int i = 0; i < size; i++) {
            Iterable iterable = this.f31188c;
            C52711k.m112240b(iterable, "$this$elementAt");
            boolean z = iterable instanceof List;
            if (z) {
                obj = ((List) iterable).get(i);
            } else {
                C52671b bVar = new C52588b(i);
                C52711k.m112240b(iterable, "$this$elementAtOrElse");
                C52711k.m112240b(bVar, "defaultValue");
                if (z) {
                    List list = (List) iterable;
                    if (i < 0 || i > C52575l.m112093a(list)) {
                        obj = bVar.invoke(Integer.valueOf(i));
                    } else {
                        obj = list.get(i);
                    }
                } else {
                    if (i >= 0) {
                        Iterator it = iterable.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i == i2) {
                                obj = next;
                                break;
                            }
                            i2 = i3;
                        }
                    }
                    obj = bVar.invoke(Integer.valueOf(i));
                }
            }
            nVarArr[i] = (C52847n) obj;
        }
        C52711k.m112240b(nVarArr, "elements");
        return new C11733e<>(v, (LinkedHashSet) C52568f.m112081b((Object[]) nVarArr, (Collection) new LinkedHashSet(C52550ab.m112044a(nVarArr.length))));
    }

    private C11733e(T t, LinkedHashSet<C52847n<C11729a<?>, Long>> linkedHashSet) {
        this.f31187b = t;
        this.f31188c = linkedHashSet;
    }

    public /* synthetic */ C11733e(Object obj, LinkedHashSet linkedHashSet, C52707g gVar) {
        this(obj, linkedHashSet);
    }
}
