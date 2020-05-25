package com.bytedance.p836s;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.s.d */
public final class C12826d {

    /* renamed from: a */
    public static String f33585a = "TTVideoSetting";

    /* renamed from: b */
    public static String f33586b = "https://is.snssdk.com";

    /* renamed from: c */
    public static String f33587c = "https://vas-maliva16.byteoversea.com";

    /* renamed from: d */
    public static String f33588d = "https://sgaup.bytedance.com";

    /* renamed from: e */
    public static String f33589e = "https://vas-hl-x.snssdk.com";

    /* renamed from: f */
    private static SharedPreferences f33590f;

    /* renamed from: a */
    public static String m25731a() {
        return "VideoCloud";
    }

    /* renamed from: b */
    public static String m25737b() {
        return VERSION.RELEASE;
    }

    /* renamed from: c */
    public static String m25738c() {
        return Build.BRAND;
    }

    /* renamed from: d */
    public static String m25739d() {
        return Build.MODEL;
    }

    /* renamed from: a */
    public static SharedPreferences m25730a(Context context) {
        if (f33590f == null) {
            f33590f = C35807d.m80935a(context, "com.video.ttvideosetting", 0);
        }
        return f33590f;
    }

    /* renamed from: a */
    private static String m25733a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                byteArrayOutputStream.close();
                return byteArrayOutputStream2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m25734a(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0075
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x000a
            goto L_0x0075
        L_0x000a:
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x006e, all -> 0x0064 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x006e, all -> 0x0064 }
            java.net.URLConnection r6 = r1.openConnection()     // Catch:{ Exception -> 0x006e, all -> 0x0064 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x006e, all -> 0x0064 }
            r1 = 6000(0x1770, float:8.408E-42)
            r6.setReadTimeout(r1)     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            r1 = 11000(0x2af8, float:1.5414E-41)
            r6.setConnectTimeout(r1)     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            java.lang.String r1 = "GET"
            r6.setRequestMethod(r1)     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            int r1 = r6.getResponseCode()     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x004e
            r1 = r6
            java.net.URLConnection r1 = (java.net.URLConnection) r1     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            boolean r2 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r1)     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            if (r2 == 0) goto L_0x0040
            java.net.URL r2 = r1.getURL()     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            java.lang.String r1 = r1.getContentType()     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r2, r0, r0, r1)     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
        L_0x0040:
            java.io.InputStream r1 = r6.getInputStream()     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            java.lang.String r1 = m25733a(r1)     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            if (r6 == 0) goto L_0x004d
            r6.disconnect()
        L_0x004d:
            return r1
        L_0x004e:
            android.accounts.NetworkErrorException r2 = new android.accounts.NetworkErrorException     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            java.lang.String r4 = "response status is "
            r3.<init>(r4)     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            r3.append(r1)     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
            throw r2     // Catch:{ Exception -> 0x006f, all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            goto L_0x0068
        L_0x0064:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
        L_0x0068:
            if (r6 == 0) goto L_0x006d
            r6.disconnect()
        L_0x006d:
            throw r0
        L_0x006e:
            r6 = r0
        L_0x006f:
            if (r6 == 0) goto L_0x0074
            r6.disconnect()
        L_0x0074:
            return r0
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p836s.C12826d.m25734a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m25732a(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return m25730a(context).getString(str, "");
    }

    /* renamed from: a */
    public static void m25736a(String str, String str2) {
        if (!(str == null || str.length() == 0 || str2 == null || str2.length() == 0 || ((long) str2.length()) <= 3072)) {
            while (str2.length() > 3072) {
                str2 = str2.replace(str2.substring(0, 3072), "");
            }
        }
    }

    /* renamed from: a */
    public static void m25735a(Context context, String str, String str2) {
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            Editor edit = m25730a(context).edit();
            edit.putString(str, str2);
            edit.commit();
        }
    }
}
