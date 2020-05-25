package com.p683ss.android.ugc.aweme.tools.foundation;

import com.google.p1057b.p1060c.C17592aq;
import com.google.p1057b.p1060c.C17609au;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.foundation.a */
public final class C47060a {

    /* renamed from: a */
    public static final C47060a f118841a = new C47060a();

    /* renamed from: b */
    private static final C17592aq<String, Object> f118842b;

    private C47060a() {
    }

    static {
        C17592aq<String, Object> c = C17609au.m43298a().mo34188c().mo34186c();
        C52711k.m112236a((Object) c, "MultimapBuilder.hashKeys…inkedListValues().build()");
        f118842b = c;
    }

    /* renamed from: a */
    public static void m102182a(String str, Object obj) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(obj, "value");
        List list = f118842b.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
