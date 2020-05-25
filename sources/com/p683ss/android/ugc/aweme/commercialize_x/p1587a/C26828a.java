package com.p683ss.android.ugc.aweme.commercialize_x.p1587a;

import android.util.SparseArray;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.service.C26827b;

/* renamed from: com.ss.android.ugc.aweme.commercialize_x.a.a */
public final class C26828a {

    /* renamed from: a */
    public static final SparseArray<Class<? extends C26827b>> f70653a = new SparseArray<>();

    /* renamed from: b */
    public static final C26828a f70654b = new C26828a();

    /* renamed from: c */
    private static final SparseArray<C26827b> f70655c = new SparseArray<>();

    private C26828a() {
    }

    /* renamed from: a */
    public static final C26827b m64848a(int i) {
        try {
            C26827b bVar = (C26827b) f70655c.get(i);
            if (bVar == null) {
                Class cls = (Class) f70653a.get(i);
                if (cls != null) {
                    bVar = (C26827b) cls.newInstance();
                    f70655c.put(i, bVar);
                }
            }
            return bVar;
        } catch (Throwable unused) {
            return null;
        }
    }
}
