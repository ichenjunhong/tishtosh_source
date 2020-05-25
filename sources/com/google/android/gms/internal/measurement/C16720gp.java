package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.gp */
final class C16720gp {

    /* renamed from: a */
    private static final Class<?> f46993a = m40215c();

    /* renamed from: c */
    private static Class<?> m40215c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C16721gq m40212a() {
        if (f46993a != null) {
            try {
                return m40213a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C16721gq.f46994a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.measurement.C16721gq m40214b() {
        /*
            java.lang.Class<?> r0 = f46993a
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.measurement.gq r0 = m40213a(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x0014
            java.lang.Class<com.google.android.gms.internal.measurement.gq> r0 = com.google.android.gms.internal.measurement.C16721gq.class
            com.google.android.gms.internal.measurement.gq r0 = com.google.android.gms.internal.measurement.C16734hb.m40272a(r0)
        L_0x0014:
            if (r0 != 0) goto L_0x001a
            com.google.android.gms.internal.measurement.gq r0 = m40212a()
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16720gp.m40214b():com.google.android.gms.internal.measurement.gq");
    }

    /* renamed from: a */
    private static final C16721gq m40213a(String str) throws Exception {
        return (C16721gq) f46993a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
