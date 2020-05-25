package com.p683ss.android.ugc.aweme.commercialize.log;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.bb */
public class C26065bb {

    /* renamed from: c */
    private static C26065bb f68835c;

    /* renamed from: a */
    public Set<String> f68836a = new HashSet();

    /* renamed from: b */
    public boolean f68837b = false;

    /* renamed from: d */
    private Set<String> f68838d = new HashSet();

    /* renamed from: a */
    public static C26065bb m63156a() {
        if (f68835c == null) {
            synchronized (C26065bb.class) {
                if (f68835c == null) {
                    f68835c = new C26065bb();
                }
            }
        }
        return f68835c;
    }

    /* renamed from: a */
    public final boolean mo53554a(String str) {
        return this.f68836a.contains(str);
    }

    /* renamed from: b */
    public final void mo53555b(String str) {
        this.f68836a.add(str);
    }
}
