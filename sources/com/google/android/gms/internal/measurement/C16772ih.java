package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ih */
final class C16772ih {

    /* renamed from: a */
    private static final C16770if f47144a = m40395c();

    /* renamed from: b */
    private static final C16770if f47145b = new C16771ig();

    /* renamed from: a */
    static C16770if m40393a() {
        return f47144a;
    }

    /* renamed from: b */
    static C16770if m40394b() {
        return f47145b;
    }

    /* renamed from: c */
    private static C16770if m40395c() {
        try {
            return (C16770if) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
