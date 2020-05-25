package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import java.io.Serializable;

/* renamed from: com.google.b.c.bi */
final class C17652bi extends C17638bb<Comparable> implements Serializable {

    /* renamed from: a */
    static final C17652bi f49354a = new C17652bi();
    private static final long serialVersionUID = 0;

    private C17652bi() {
    }

    private Object readResolve() {
        return f49354a;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    /* renamed from: a */
    public final <S extends Comparable> C17638bb<S> mo34218a() {
        return C17638bb.m43359b();
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        C17421k.m42653a(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }
}
