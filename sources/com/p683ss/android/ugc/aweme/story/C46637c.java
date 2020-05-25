package com.p683ss.android.ugc.aweme.story;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.story.c */
public final class C46637c implements C46618a {

    /* renamed from: a */
    private static C46637c f117639a;

    /* renamed from: b */
    private Set<String> f117640b = new HashSet();

    private C46637c() {
    }

    /* renamed from: a */
    public static C46637c m101192a() {
        if (f117639a == null) {
            synchronized (C46637c.class) {
                if (f117639a == null) {
                    f117639a = new C46637c();
                }
            }
        }
        return f117639a;
    }

    /* renamed from: a */
    public final boolean mo93526a(String str) {
        return this.f117640b.contains(str);
    }
}
