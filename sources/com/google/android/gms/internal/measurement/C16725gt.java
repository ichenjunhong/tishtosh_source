package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.gt */
final class C16725gt {

    /* renamed from: a */
    private static final C16723gr<?> f47000a = new C16724gs();

    /* renamed from: b */
    private static final C16723gr<?> f47001b = m40241c();

    /* renamed from: c */
    private static C16723gr<?> m40241c() {
        try {
            return (C16723gr) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static C16723gr<?> m40239a() {
        return f47000a;
    }

    /* renamed from: b */
    static C16723gr<?> m40240b() {
        if (f47001b != null) {
            return f47001b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
