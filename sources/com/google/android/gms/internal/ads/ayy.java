package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15675e;

final class ayy implements bac {

    /* renamed from: b */
    private static final azi f41653b = new ayz();

    /* renamed from: a */
    private final azi f41654a;

    public ayy() {
        this(new aza(axy.f41604a, m34824a()));
    }

    private ayy(azi azi) {
        this.f41654a = (azi) ayb.m34770a(azi, "messageInfoFactory");
    }

    /* renamed from: a */
    private static boolean m34825a(azh azh) {
        return azh.mo29889a() == C15675e.f41616h;
    }

    /* renamed from: a */
    private static azi m34824a() {
        try {
            return (azi) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f41653b;
        }
    }

    /* renamed from: a */
    public final <T> bab<T> mo29869a(Class<T> cls) {
        if (axz.class.isAssignableFrom(cls) || bad.f41700a == null || bad.f41700a.isAssignableFrom(cls)) {
            azh b = this.f41654a.mo29819b(cls);
            if (b.mo29890b()) {
                if (axz.class.isAssignableFrom(cls)) {
                    return azq.m34925a(bad.m35030b(), axp.m34670a(), b.mo29891c());
                }
                return azq.m34925a(bad.m35016a(), axp.m34671b(), b.mo29891c());
            } else if (axz.class.isAssignableFrom(cls)) {
                if (m34825a(b)) {
                    return azo.m34881a(cls, b, azu.m34940b(), ayt.m34805b(), bad.m35030b(), axp.m34670a(), azg.m34852b());
                }
                return azo.m34881a(cls, b, azu.m34940b(), ayt.m34805b(), bad.m35030b(), null, azg.m34852b());
            } else if (m34825a(b)) {
                return azo.m34881a(cls, b, azu.m34939a(), ayt.m34804a(), bad.m35016a(), axp.m34671b(), azg.m34851a());
            } else {
                return azo.m34881a(cls, b, azu.m34939a(), ayt.m34804a(), bad.f41701b, null, azg.m34851a());
            }
        } else {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }
}
