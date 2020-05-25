package com.facebook.common.p920d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.common.d.e */
public final class C13682e<E> extends ArrayList<E> {
    private C13682e(int i) {
        super(i);
    }

    private C13682e(List<E> list) {
        super(list);
    }

    public static <E> C13682e<E> copyOf(List<E> list) {
        return new C13682e<>(list);
    }

    /* renamed from: of */
    public static <E> C13682e<E> m27635of(E... eArr) {
        C13682e<E> eVar = new C13682e<>(eArr.length);
        Collections.addAll(eVar, eArr);
        return eVar;
    }
}
