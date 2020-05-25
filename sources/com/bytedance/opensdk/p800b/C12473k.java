package com.bytedance.opensdk.p800b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.opensdk.core.base.C12497a;
import com.bytedance.opensdk.core.base.p808c.C12502a;
import com.google.gson.p1077b.C17956a;
import java.util.HashMap;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.opensdk.b.k */
public final class C12473k {

    /* renamed from: a */
    public static final C12473k f32778a = new C12473k();

    /* renamed from: com.bytedance.opensdk.b.k$a */
    public static final class C12474a extends C17956a<HashMap<String, String>> {
    }

    private C12473k() {
    }

    /* renamed from: a */
    public static C12502a m25068a() {
        return C12497a.f32821b.mo23522b().f32841d;
    }

    /* renamed from: b */
    private static NetworkInfo m25073b(Context context) {
        C52711k.m112240b(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            try {
                return C12476m.m25076a((ConnectivityManager) systemService);
            } catch (Exception unused) {
                return null;
            }
        } else {
            throw new C52857u("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m25072a(com.bytedance.opensdk.core.C12480a r6) {
        /*
            java.lang.String r0 = "apiInfo"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            int[] r0 = com.bytedance.opensdk.p800b.C12475l.f32779a
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0012
            return r2
        L_0x0012:
            java.lang.String r0 = "app.buzz.share"
            com.bytedance.opensdk.core.base.a r3 = com.bytedance.opensdk.core.base.C12497a.f32821b
            android.content.Context r3 = r3.mo23519a()
            boolean r3 = com.bytedance.opensdk.p800b.C12459a.m25047a(r3, r0)
            com.bytedance.opensdk.core.base.a r4 = com.bytedance.opensdk.core.base.C12497a.f32821b     // Catch:{ Exception -> 0x002f }
            android.content.Context r4 = r4.mo23519a()     // Catch:{ Exception -> 0x002f }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ Exception -> 0x002f }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = com.bytedance.opensdk.p800b.C12476m.m25075a(r4, r0, r5)     // Catch:{ Exception -> 0x002f }
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0045
            android.os.Bundle r0 = r0.metaData
            if (r0 == 0) goto L_0x0045
            java.lang.String r4 = "com.ss.android.openplatform.version"
            r5 = -1
            int r0 = r0.getInt(r4, r5)
            int r6 = r6.getApiSupportVersion()
            if (r0 < r6) goto L_0x0045
            r6 = 1
            goto L_0x0046
        L_0x0045:
            r6 = 0
        L_0x0046:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 < r4) goto L_0x004e
            r0 = 1
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r3 == 0) goto L_0x0056
            if (r6 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0056
            return r1
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.opensdk.p800b.C12473k.m25072a(com.bytedance.opensdk.core.a):boolean");
    }

    /* renamed from: a */
    public final boolean mo23507a(Context context) {
        C52711k.m112240b(context, "context");
        try {
            NetworkInfo b = m25073b(context);
            if (b == null || !b.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m25071a(String str, Map<String, String> map) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(map, "params");
        C12497a.f32821b.mo23522b().f32842e.mo23518a(str, map);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m25070a(String str, Map<String, String> map, Map<String, String> map2) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(map, "requestHeaderMap");
        C52711k.m112240b(map2, "respHeaderMap");
        return m25068a().mo23527a(str, map, map2);
    }
}
