package com.bytedance.p879t.p882c;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.t.c.a */
public final class C13241a {
    /* renamed from: a */
    public static final <T> List<T> m26627a(List<T> list, T t) {
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(t);
        return list;
    }

    /* renamed from: b */
    public static final <T> List<T> m26629b(List<T> list, T t) {
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(0, t);
        return list;
    }

    /* renamed from: a */
    public static final <T> Set<T> m26628a(Set<T> set, T t) {
        if (set == null) {
            set = new HashSet<>();
        }
        set.add(t);
        return set;
    }
}
