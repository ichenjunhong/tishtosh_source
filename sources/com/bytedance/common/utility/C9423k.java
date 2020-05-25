package com.bytedance.common.utility;

import android.util.Pair;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.common.utility.k */
public abstract class C9423k {

    /* renamed from: a */
    private static C9423k f25669a = new C9399e();

    /* renamed from: com.bytedance.common.utility.k$a */
    public static class C9424a {

        /* renamed from: a */
        public boolean f25670a;
    }

    /* renamed from: a */
    public static C9423k m18637a() {
        return f25669a;
    }

    /* renamed from: a */
    public abstract String mo17021a(String str, List<Pair<String, String>> list, Map<String, String> map, C9424a aVar) throws C9374b;

    /* renamed from: a */
    public abstract String mo17022a(String str, Map<String, String> map, C9424a aVar) throws Exception;

    /* renamed from: a */
    public abstract String mo17023a(String str, byte[] bArr, Map<String, String> map, C9424a aVar) throws C9374b;

    /* renamed from: a */
    public static void m18638a(C9423k kVar) {
        if (kVar != null && kVar != f25669a) {
            f25669a = kVar;
        }
    }

    /* renamed from: a */
    public final String mo17060a(String str) throws Exception {
        C9424a aVar = new C9424a();
        aVar.f25670a = true;
        return mo17022a(str, null, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m18639a(byte[] r3) throws java.lang.Exception {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x001b }
            r2 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r2)     // Catch:{ all -> 0x001b }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x001b }
            r2.<init>(r1)     // Catch:{ all -> 0x001b }
            r2.write(r3)     // Catch:{ all -> 0x0018 }
            r2.close()     // Catch:{ all -> 0x0018 }
            byte[] r3 = r1.toByteArray()     // Catch:{ all -> 0x001b }
            return r3
        L_0x0018:
            r3 = move-exception
            r0 = r2
            goto L_0x001c
        L_0x001b:
            r3 = move-exception
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.C9423k.m18639a(byte[]):byte[]");
    }

    /* renamed from: a */
    public final String mo17061a(String str, List<Pair<String, String>> list) throws C9374b {
        C9424a aVar = new C9424a();
        aVar.f25670a = true;
        return mo17021a(str, list, null, aVar);
    }

    /* renamed from: a */
    public final String mo17062a(String str, byte[] bArr, boolean z, String str2, boolean z2) throws C9374b {
        HashMap hashMap = new HashMap();
        if (z) {
            try {
                bArr = m18639a(bArr);
                hashMap.put("Content-Encoding", "gzip");
            } catch (Exception e) {
                throw new C9374b(0, e.getMessage());
            }
        }
        if (!C9431p.m18664a(str2)) {
            hashMap.put("Content-Type", str2);
        }
        C9424a aVar = new C9424a();
        aVar.f25670a = z2;
        return mo17023a(str, bArr, (Map<String, String>) hashMap, aVar);
    }
}
