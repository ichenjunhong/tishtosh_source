package com.google.p997a.p998a.p1015f.p1016a.p1017a.p1018a.p1019a;

/* renamed from: com.google.a.a.f.a.a.a.a.c */
public final class C14781c {
    /* renamed from: a */
    public static RuntimeException m30232a(Throwable th) {
        Throwable th2 = (Throwable) C14780b.m30226a(th);
        m30233a(th2, Error.class);
        m30233a(th2, RuntimeException.class);
        throw new RuntimeException(th);
    }

    /* renamed from: a */
    private static <X extends Throwable> void m30233a(Throwable th, Class<X> cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }
}
