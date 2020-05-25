package com.bytedance.android.p161c.p172j;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import com.bytedance.android.p161c.p167f.C2852b;
import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.c.j.c */
public final class C2880c {

    /* renamed from: a */
    private static final FileFilter f8547a = new FileFilter() {
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    /* renamed from: a */
    private static String m8178a() {
        if (VERSION.SDK_INT < 23) {
            if (VERSION.SDK_INT >= 21) {
                String property = System.getProperty("os.arch");
                if (property != null && property.contains("64")) {
                    return "arm64-v8a";
                }
            }
            return "armeabi-v7a";
        } else if (Process.is64Bit()) {
            return "arm64-v8a";
        } else {
            return "armeabi-v7a";
        }
    }

    /* renamed from: b */
    private static String m8182b() {
        String str;
        if (VERSION.SDK_INT >= 21) {
            str = Build.SUPPORTED_ABIS[0];
        } else if (C2886h.m8192a(Build.CPU_ABI)) {
            str = Build.CPU_ABI2;
        } else {
            str = Build.CPU_ABI;
        }
        StringBuilder sb = new StringBuilder("Get abi ");
        sb.append(str);
        sb.append(" from spare.");
        C2852b.m8148b("DeviceInfo", sb.toString());
        return str;
    }

    /* renamed from: a */
    public static String m8179a(Context context) {
        return m8181a(context.getApplicationInfo(), context);
    }

    /* renamed from: a */
    private static String m8180a(ApplicationInfo applicationInfo) {
        String str;
        String str2 = "";
        try {
            Field declaredField = ApplicationInfo.class.getDeclaredField("primaryCpuAbi");
            declaredField.setAccessible(true);
            str = (String) declaredField.get(applicationInfo);
            try {
                if (C2886h.m8192a(str)) {
                    str2 = m8182b();
                    str = str2;
                }
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
        } catch (IllegalAccessException | NoSuchFieldException unused2) {
        }
        if (C2886h.m8192a(str)) {
            str = m8182b();
        }
        StringBuilder sb = new StringBuilder("get abi ");
        sb.append(str);
        sb.append(" before backup.");
        C2852b.m8149c("DeviceInfo", sb.toString());
        if ("armeabi".equals(str) || "aarch".equals(str)) {
            str = "armeabi-v7a";
        }
        if ("arm64".equals(str) || "aarch64".equals(str)) {
            str = "arm64-v8a";
        }
        if (!"".equals(str) && ("armeabi-v7a".equals(str) || "arm64-v8a".equals(str))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder("unknown abi: ");
        sb2.append(str);
        C2852b.m8150d("DeviceInfo", sb2.toString());
        return m8178a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.equals("armeabi-v7a") != false) goto L_0x007f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m8181a(android.content.pm.ApplicationInfo r5, android.content.Context r6) {
        /*
            java.lang.ClassLoader r0 = r6.getClassLoader()
            dalvik.system.PathClassLoader r0 = (dalvik.system.PathClassLoader) r0
            java.lang.String r1 = "xz"
            java.lang.String r0 = r0.findLibrary(r1)
            boolean r1 = com.bytedance.android.p161c.p172j.C2886h.m8192a(r0)
            if (r1 == 0) goto L_0x001e
            java.lang.ClassLoader r6 = r6.getClassLoader()
            dalvik.system.PathClassLoader r6 = (dalvik.system.PathClassLoader) r6
            java.lang.String r0 = "zstd-jni"
            java.lang.String r0 = r6.findLibrary(r0)
        L_0x001e:
            boolean r6 = com.bytedance.android.p161c.p172j.C2886h.m8192a(r0)
            if (r6 == 0) goto L_0x0029
            java.lang.String r5 = m8180a(r5)
            return r5
        L_0x0029:
            java.lang.String r6 = ""
            java.lang.String r1 = "/"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 1
            if (r1 <= r2) goto L_0x0088
            int r1 = r0.length
            r3 = 2
            int r1 = r1 - r3
            r0 = r0[r1]
            r1 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case -1221096139: goto L_0x0074;
                case 96860: goto L_0x006a;
                case 92583991: goto L_0x0060;
                case 93084186: goto L_0x0056;
                case 145444210: goto L_0x004d;
                case 1431565292: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x007e
        L_0x0043:
            java.lang.String r2 = "arm64-v8a"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007e
            r2 = 4
            goto L_0x007f
        L_0x004d:
            java.lang.String r3 = "armeabi-v7a"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x007e
            goto L_0x007f
        L_0x0056:
            java.lang.String r2 = "arm64"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007e
            r2 = 3
            goto L_0x007f
        L_0x0060:
            java.lang.String r2 = "aarch"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007e
            r2 = 2
            goto L_0x007f
        L_0x006a:
            java.lang.String r2 = "arm"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007e
            r2 = 0
            goto L_0x007f
        L_0x0074:
            java.lang.String r2 = "aarch64"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007e
            r2 = 5
            goto L_0x007f
        L_0x007e:
            r2 = -1
        L_0x007f:
            switch(r2) {
                case 0: goto L_0x0086;
                case 1: goto L_0x0086;
                case 2: goto L_0x0086;
                case 3: goto L_0x0083;
                case 4: goto L_0x0083;
                case 5: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0088
        L_0x0083:
            java.lang.String r6 = "arm64-v8a"
            goto L_0x0088
        L_0x0086:
            java.lang.String r6 = "armeabi-v7a"
        L_0x0088:
            boolean r0 = com.bytedance.android.p161c.p172j.C2886h.m8192a(r6)
            if (r0 == 0) goto L_0x0092
            java.lang.String r6 = m8180a(r5)
        L_0x0092:
            java.lang.String r5 = "armeabi"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x009c
            java.lang.String r6 = "armeabi-v7a"
        L_0x009c:
            java.lang.String r5 = "DeviceInfo"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "final use abi: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = ", but if use backup is "
            r0.append(r1)
            java.lang.String r1 = m8178a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.android.p161c.p167f.C2852b.m8149c(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p161c.p172j.C2880c.m8181a(android.content.pm.ApplicationInfo, android.content.Context):java.lang.String");
    }
}
