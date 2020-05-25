package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import java.io.Serializable;

/* renamed from: com.google.b.c.ay */
final class C17631ay extends C17638bb<Comparable> implements Serializable {

    /* renamed from: a */
    static final C17631ay f49302a = new C17631ay();
    private static final long serialVersionUID = 0;

    private C17631ay() {
    }

    private Object readResolve() {
        return f49302a;
    }

    /* renamed from: a */
    public final <S extends Comparable> C17638bb<S> mo34218a() {
        return C17652bi.f49354a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        C17421k.m42653a(comparable);
        C17421k.m42653a(comparable2);
        return comparable.compareTo(comparable2);
    }
}
