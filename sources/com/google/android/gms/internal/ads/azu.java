package com.google.android.gms.internal.ads;

final class azu {

    /* renamed from: a */
    private static final azs f41688a = m34941c();

    /* renamed from: b */
    private static final azs f41689b = new azt();

    /* renamed from: a */
    static azs m34939a() {
        return f41688a;
    }

    /* renamed from: b */
    static azs m34940b() {
        return f41689b;
    }

    /* renamed from: c */
    private static azs m34941c() {
        try {
            return (azs) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
