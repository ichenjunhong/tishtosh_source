package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class apv<P> {

    /* renamed from: a */
    static final Charset f41201a = Charset.forName("UTF-8");

    /* renamed from: b */
    ConcurrentMap<String, List<apw<P>>> f41202b = new ConcurrentHashMap();

    /* renamed from: c */
    public apw<P> f41203c;

    /* renamed from: d */
    public final Class<P> f41204d;

    apv(Class<P> cls) {
        this.f41204d = cls;
    }
}
