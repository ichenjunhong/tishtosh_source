package com.google.android.gms.internal.ads;

final class azg {

    /* renamed from: a */
    private static final aze f41662a = m34853c();

    /* renamed from: b */
    private static final aze f41663b = new azf();

    /* renamed from: a */
    static aze m34851a() {
        return f41662a;
    }

    /* renamed from: b */
    static aze m34852b() {
        return f41663b;
    }

    /* renamed from: c */
    private static aze m34853c() {
        try {
            return (aze) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
