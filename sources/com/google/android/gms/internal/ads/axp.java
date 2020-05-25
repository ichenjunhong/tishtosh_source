package com.google.android.gms.internal.ads;

final class axp {

    /* renamed from: a */
    private static final axn<?> f41526a = new axo();

    /* renamed from: b */
    private static final axn<?> f41527b = m34672c();

    /* renamed from: c */
    private static axn<?> m34672c() {
        try {
            return (axn) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static axn<?> m34670a() {
        return f41526a;
    }

    /* renamed from: b */
    static axn<?> m34671b() {
        if (f41527b != null) {
            return f41527b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
