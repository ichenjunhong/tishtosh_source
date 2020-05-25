package com.bytedance.android.monitor.webview;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.bytedance.android.monitor.webview.l */
public final class C8906l {

    /* renamed from: a */
    private static String f24268a = "webview_monitor_js_file/slardar_sdk.js";

    /* renamed from: b */
    private static String f24269b = "webview_monitor_js_file/slardar_bridge.js";

    /* renamed from: c */
    private static String f24270c = "";

    /* renamed from: d */
    private static String f24271d = "";

    /* renamed from: e */
    private static String f24272e = "";

    /* renamed from: f */
    private static String f24273f = " javascript:( ";

    /* renamed from: g */
    private static String f24274g = " )() ";

    /* renamed from: h */
    private static String f24275h = " function(){ ";

    /* renamed from: i */
    private static String f24276i = " } ";

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r2 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r2 == null) goto L_0x0039;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m17631a(android.content.Context r3, java.lang.String r4, boolean r5) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            if (r5 == 0) goto L_0x0018
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ IOException -> 0x0036, all -> 0x0016 }
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ IOException -> 0x0036, all -> 0x0016 }
        L_0x0014:
            r2 = r3
            goto L_0x001e
        L_0x0016:
            r3 = move-exception
            goto L_0x0030
        L_0x0018:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0036, all -> 0x0016 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0036, all -> 0x0016 }
            goto L_0x0014
        L_0x001e:
            int r3 = r2.read(r0)     // Catch:{ IOException -> 0x0036, all -> 0x0016 }
            r4 = -1
            if (r3 == r4) goto L_0x002a
            r4 = 0
            r1.write(r0, r4, r3)     // Catch:{ IOException -> 0x0036, all -> 0x0016 }
            goto L_0x001e
        L_0x002a:
            if (r2 == 0) goto L_0x0039
        L_0x002c:
            r2.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0039
        L_0x0030:
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            throw r3
        L_0x0036:
            if (r2 == 0) goto L_0x0039
            goto L_0x002c
        L_0x0039:
            java.lang.String r3 = r1.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitor.webview.C8906l.m17631a(android.content.Context, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: a */
    public static String m17630a(Context context, String str, String str2, boolean z) {
        String str3;
        if (TextUtils.isEmpty(f24270c)) {
            if (TextUtils.isEmpty(str)) {
                f24270c = m17631a(context, f24268a, true);
            } else {
                f24270c = m17631a(context, str, false);
            }
        }
        if (TextUtils.isEmpty(f24271d)) {
            f24271d = m17631a(context, f24269b, true);
        }
        f24272e = str2;
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = f24272e;
        }
        f24272e = str3;
        if (!z) {
            f24270c = "";
            f24272e = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f24273f);
        sb.append(f24275h);
        sb.append(f24270c);
        sb.append(f24271d);
        sb.append(f24272e);
        sb.append(f24276i);
        sb.append(f24274g);
        return sb.toString();
    }
}
