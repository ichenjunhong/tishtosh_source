package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16736hd.C16741e;

/* renamed from: com.google.android.gms.internal.measurement.hz */
final class C16763hz implements C16794jc {

    /* renamed from: b */
    private static final C16774ij f47132b = new C16765ia();

    /* renamed from: a */
    private final C16774ij f47133a;

    public C16763hz() {
        this(new C16766ib(C16735hc.f47085a, m40365a()));
    }

    private C16763hz(C16774ij ijVar) {
        this.f47133a = (C16774ij) C16743hf.m40316a(ijVar, "messageInfoFactory");
    }

    /* renamed from: a */
    private static boolean m40366a(C16773ii iiVar) {
        return iiVar.mo32294a() == C16741e.f47097h;
    }

    /* renamed from: a */
    private static C16774ij m40365a() {
        try {
            return (C16774ij) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f47132b;
        }
    }

    /* renamed from: a */
    public final <T> C16793jb<T> mo32273a(Class<T> cls) {
        if (C16736hd.class.isAssignableFrom(cls) || C16795jd.f47184a == null || C16795jd.f47184a.isAssignableFrom(cls)) {
            C16773ii b = this.f47133a.mo32225b(cls);
            if (b.mo32295b()) {
                if (C16736hd.class.isAssignableFrom(cls)) {
                    return C16781iq.m40455a(C16795jd.m40551b(), C16725gt.m40239a(), b.mo32296c());
                }
                return C16781iq.m40455a(C16795jd.m40537a(), C16725gt.m40240b(), b.mo32296c());
            } else if (C16736hd.class.isAssignableFrom(cls)) {
                if (m40366a(b)) {
                    return C16779io.m40415a(cls, b, C16785iu.m40469b(), C16758hu.m40346b(), C16795jd.m40551b(), C16725gt.m40239a(), C16772ih.m40394b());
                }
                return C16779io.m40415a(cls, b, C16785iu.m40469b(), C16758hu.m40346b(), C16795jd.m40551b(), null, C16772ih.m40394b());
            } else if (m40366a(b)) {
                return C16779io.m40415a(cls, b, C16785iu.m40468a(), C16758hu.m40345a(), C16795jd.m40537a(), C16725gt.m40240b(), C16772ih.m40393a());
            } else {
                return C16779io.m40415a(cls, b, C16785iu.m40468a(), C16758hu.m40345a(), C16795jd.f47185b, null, C16772ih.m40393a());
            }
        } else {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }
}
