package com.bytedance.jedi.p725a.p734g.p737c;

import com.bytedance.jedi.p725a.p734g.p735a.C11605c;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.bytedance.jedi.a.g.c.b */
public final class C11675b {
    /* renamed from: a */
    public static <T> boolean m24016a(Collection<T> collection, Iterator<? extends T> it) {
        C11605c.m23732a(collection);
        C11605c.m23732a(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }
}
