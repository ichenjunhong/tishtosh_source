package com.p683ss.android.deviceregister.p1155b;

/* renamed from: com.ss.android.deviceregister.b.a */
public final class C19008a {

    /* renamed from: a */
    public static String[] f52335a = null;

    /* renamed from: b */
    public static String[] f52336b = null;

    /* renamed from: c */
    public static C19009a f52337c = null;

    /* renamed from: d */
    static String f52338d = "ib.snssdk.com";

    /* renamed from: e */
    public static boolean f52339e;

    /* renamed from: f */
    public static boolean f52340f;

    /* renamed from: com.ss.android.deviceregister.b.a$a */
    public interface C19009a {
        boolean getEncryptSwitch();
    }

    /* renamed from: b */
    public static boolean m46194b() {
        if (f52337c != null) {
            return f52337c.getEncryptSwitch();
        }
        return true;
    }

    /* renamed from: a */
    public static String[] m46193a() {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(f52338d);
        sb.append("/service/2/device_sdk/stats_collect/");
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(f52338d);
        sb2.append("/service/2/device_sdk/stats_collect/");
        String[] strArr = {sb.toString(), sb2.toString()};
        if (f52336b != null && f52336b.length > 0) {
            strArr = new String[f52336b.length];
            for (int i = 0; i < f52336b.length; i++) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(f52336b[i]);
                sb3.append("/service/2/device_sdk/stats_collect/");
                strArr[i] = sb3.toString();
            }
        }
        return strArr;
    }
}
