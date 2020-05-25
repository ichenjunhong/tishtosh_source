package com.p683ss.android.ugc.aweme.filter;

import com.google.p1057b.p1060c.C17592aq;
import com.google.p1057b.p1060c.C17609au;
import com.google.p1057b.p1060c.C17720u;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.ar */
public final class C31417ar<K, V> extends C17720u<K, V> {

    /* renamed from: a */
    private final C17592aq<K, V> f82252a = C17609au.m43299b().mo34187b().mo34186c();

    /* renamed from: a */
    public final C17592aq<K, V> delegate() {
        return this.f82252a;
    }

    /* renamed from: c */
    public static <K, V> C31417ar<K, V> m73204c() {
        return new C31417ar<>();
    }

    C31417ar() {
    }

    public final boolean put(K k, V v) {
        List list = get((Object) k);
        if (!list.contains(v)) {
            return list.add(v);
        }
        return false;
    }
}
