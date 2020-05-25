package com.google.android.gms.internal.ads;

final class axl {

    /* renamed from: a */
    private static final Class<?> f41519a = m34645c();

    /* renamed from: c */
    private static Class<?> m34645c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static axm m34642a() {
        if (f41519a != null) {
            try {
                return m34643a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return axm.f41520a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.ads.axm m34644b() {
        /*
            java.lang.Class<?> r0 = f41519a
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.ads.axm r0 = m34643a(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x0014
            java.lang.Class<com.google.android.gms.internal.ads.axm> r0 = com.google.android.gms.internal.ads.axm.class
            com.google.android.gms.internal.ads.axm r0 = com.google.android.gms.internal.ads.axx.m34702a(r0)
        L_0x0014:
            if (r0 != 0) goto L_0x001a
            com.google.android.gms.internal.ads.axm r0 = m34642a()
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.axl.m34644b():com.google.android.gms.internal.ads.axm");
    }

    /* renamed from: a */
    private static final axm m34643a(String str) throws Exception {
        return (axm) f41519a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
