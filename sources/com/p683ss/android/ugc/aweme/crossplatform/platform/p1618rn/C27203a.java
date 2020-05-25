package com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.geckoclient.model.C10957d;
import com.bytedance.ies.p688h.C10968a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.web.C48380q;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.a */
public final class C27203a {
    /* renamed from: a */
    public static final File m65625a(C10957d dVar) {
        if (TextUtils.isEmpty(dVar.f29404d) || TextUtils.equals(TEVideoRecorder.FACE_BEAUTY_NULL, dVar.f29404d)) {
            return null;
        }
        String serverDeviceId = AppLog.getServerDeviceId();
        String i = C11010c.m22288i();
        Context a = C11010c.m22280a();
        String[] strArr = new String[1];
        C48380q e = C48380q.m104672e();
        if (e == null) {
            C52711k.m112234a();
        }
        strArr[0] = e.mo41208b();
        C10968a a2 = C10968a.m22224a(a, i, serverDeviceId, strArr);
        C52711k.m112236a((Object) a2, "iesOfflineCache");
        return new File(a2.mo19784a(), dVar.f29404d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041 A[Catch:{ Exception -> 0x0085, Throwable -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.model.RNBundleInfo m65626b(com.bytedance.ies.geckoclient.model.C10957d r7) {
        /*
            java.lang.String r0 = "$this$offlineBundleInfo"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            r0 = 0
            java.io.File r7 = m65625a(r7)     // Catch:{ Throwable -> 0x009d }
            if (r7 == 0) goto L_0x003e
            boolean r1 = r7.exists()     // Catch:{ Throwable -> 0x009d }
            if (r1 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r7 = r0
        L_0x0014:
            if (r7 == 0) goto L_0x003e
            java.io.File[] r7 = r7.listFiles()     // Catch:{ Throwable -> 0x009d }
            if (r7 == 0) goto L_0x003e
            int r1 = r7.length     // Catch:{ Throwable -> 0x009d }
            r2 = 0
        L_0x001e:
            if (r2 >= r1) goto L_0x0036
            r3 = r7[r2]     // Catch:{ Throwable -> 0x009d }
            java.lang.String r4 = "bundle_info.json"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Throwable -> 0x009d }
            java.lang.String r5 = r3.getName()     // Catch:{ Throwable -> 0x009d }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Throwable -> 0x009d }
            boolean r4 = android.text.TextUtils.equals(r4, r5)     // Catch:{ Throwable -> 0x009d }
            if (r4 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x001e
        L_0x0036:
            r3 = r0
        L_0x0037:
            if (r3 == 0) goto L_0x003e
            java.lang.String r7 = r3.getAbsolutePath()     // Catch:{ Throwable -> 0x009d }
            goto L_0x003f
        L_0x003e:
            r7 = r0
        L_0x003f:
            if (r7 == 0) goto L_0x009d
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x009d }
            r1.<init>(r7)     // Catch:{ Throwable -> 0x009d }
            boolean r1 = r1.exists()     // Catch:{ Throwable -> 0x009d }
            if (r1 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r7 = r0
        L_0x004e:
            if (r7 == 0) goto L_0x009d
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x009d }
            r1.<init>(r7)     // Catch:{ Throwable -> 0x009d }
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch:{ Throwable -> 0x009d }
            java.nio.charset.Charset r7 = p2628d.p2650m.C52808d.f131043a     // Catch:{ Throwable -> 0x009d }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x009d }
            r2.<init>(r1, r7)     // Catch:{ Throwable -> 0x009d }
            java.io.Reader r2 = (java.io.Reader) r2     // Catch:{ Throwable -> 0x009d }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x009d }
            r1 = 8192(0x2000, float:1.14794E-41)
            r7.<init>(r2, r1)     // Catch:{ Throwable -> 0x009d }
            java.io.Closeable r7 = (java.io.Closeable) r7     // Catch:{ Throwable -> 0x009d }
            r1 = r7
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            java.io.Reader r1 = (java.io.Reader) r1     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            java.lang.String r1 = p2628d.p2638e.C52666o.m112218b(r1)     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            p2628d.p2638e.C52647c.m112189a(r7, r0)     // Catch:{ Throwable -> 0x009d }
            if (r1 == 0) goto L_0x009d
            com.google.gson.f r7 = new com.google.gson.f     // Catch:{ Exception -> 0x0085 }
            r7.<init>()     // Catch:{ Exception -> 0x0085 }
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo> r2 = com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.model.RNBundleInfo.class
            java.lang.Object r7 = r7.mo34884a(r1, r2)     // Catch:{ Exception -> 0x0085 }
            com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo r7 = (com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.model.RNBundleInfo) r7     // Catch:{ Exception -> 0x0085 }
            goto L_0x008c
        L_0x0085:
            r7 = move-exception
            com.ss.android.ugc.aweme.fe.utils.e r1 = com.p683ss.android.ugc.aweme.p1706fe.utils.C29976e.f78229a     // Catch:{ Throwable -> 0x009d }
            r1.mo60155a(r7)     // Catch:{ Throwable -> 0x009d }
            r7 = r0
        L_0x008c:
            if (r7 == 0) goto L_0x009d
            r0 = r7
            goto L_0x009d
        L_0x0090:
            r1 = move-exception
            r2 = r0
            goto L_0x0099
        L_0x0093:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x0099:
            p2628d.p2638e.C52647c.m112189a(r7, r2)     // Catch:{ Throwable -> 0x009d }
            throw r1     // Catch:{ Throwable -> 0x009d }
        L_0x009d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.C27203a.m65626b(com.bytedance.ies.geckoclient.model.d):com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo");
    }
}
