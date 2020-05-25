package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.iu */
final class C16785iu {

    /* renamed from: a */
    private static final C16783is f47169a = m40470c();

    /* renamed from: b */
    private static final C16783is f47170b = new C16784it();

    /* renamed from: a */
    static C16783is m40468a() {
        return f47169a;
    }

    /* renamed from: b */
    static C16783is m40469b() {
        return f47170b;
    }

    /* renamed from: c */
    private static C16783is m40470c() {
        try {
            return (C16783is) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
