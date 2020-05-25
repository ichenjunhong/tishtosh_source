package com.p683ss.android.ugc.aweme.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.utils.aw */
public final class C47689aw {

    /* renamed from: a */
    private static final FileFilter f120172a = new FileFilter() {
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

    /* renamed from: com.ss.android.ugc.aweme.utils.aw$a */
    public static class C47691a {

        /* renamed from: a */
        public String f120173a;

        /* renamed from: b */
        public int f120174b;

        /* renamed from: c */
        public int f120175c;
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aw$b */
    public static class C47692b {

        /* renamed from: a */
        public long f120176a;

        /* renamed from: b */
        public long f120177b;
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aw$c */
    public static class C47693c {

        /* renamed from: a */
        public int f120178a;

        /* renamed from: b */
        public int f120179b;

        /* renamed from: c */
        public int f120180c;
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aw$d */
    public static class C47694d {

        /* renamed from: a */
        public long f120181a;

        /* renamed from: b */
        public long f120182b;

        /* renamed from: c */
        public long f120183c;

        /* renamed from: d */
        public long f120184d;

        /* renamed from: e */
        public long f120185e;

        /* renamed from: f */
        public int f120186f;
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aw$e */
    public static class C47695e {

        /* renamed from: a */
        public static final C47696a f120187a;

        /* renamed from: com.ss.android.ugc.aweme.utils.aw$e$a */
        public static class C47696a {
            private C47696a() {
            }

            /* renamed from: a */
            public String mo94983a() {
                StringBuilder sb = new StringBuilder();
                sb.append(Build.CPU_ABI);
                sb.append("_");
                sb.append(Build.CPU_ABI2);
                return sb.toString();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.utils.aw$e$b */
        static class C47697b extends C47696a {
            private C47697b() {
                super();
            }

            /* renamed from: a */
            public final String mo94983a() {
                String[] strArr;
                if (Build.SUPPORTED_ABIS == null) {
                    return "";
                }
                String str = "";
                for (String str2 : Build.SUPPORTED_ABIS) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str2);
                    sb.append("_");
                    str = sb.toString();
                }
                return str;
            }
        }

        static {
            if (VERSION.SDK_INT >= 21) {
                f120187a = new C47697b();
            } else {
                f120187a = new C47696a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aw$f */
    public static class C47698f {

        /* renamed from: a */
        public long f120188a = -1;

        /* renamed from: b */
        public long f120189b = -1;

        /* renamed from: c */
        public long f120190c = -1;

        /* renamed from: d */
        public long f120191d = -1;

        /* renamed from: e */
        public int f120192e = -1;
    }

    /* renamed from: c */
    public static boolean m103219c() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    /* renamed from: a */
    public static int m103208a() {
        if (VERSION.SDK_INT <= 10) {
            return 1;
        }
        int i = -1;
        try {
            int c = m103218c("/sys/devices/system/cpu/possible");
            if (c == -1) {
                c = m103218c("/sys/devices/system/cpu/present");
            }
            if (c == -1) {
                c = new File("/sys/devices/system/cpu/").listFiles(f120172a).length;
            }
            i = c;
        } catch (NullPointerException | SecurityException unused) {
        }
        return i;
    }

    /* renamed from: f */
    public static boolean m103225f() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                return true;
            }
        } catch (Exception unused) {
        }
        if (m103222d("/system/xbin/which su") || m103222d("/system/bin/which su") || m103222d("which su") || m103222d("busybox which su")) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static int m103226g() {
        FileInputStream fileInputStream = null;
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/status");
            FileInputStream fileInputStream2 = new FileInputStream(sb.toString());
            try {
                int a = m103209a("VmPeak", fileInputStream2);
                m103213a((Closeable) fileInputStream2);
                return a;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                m103213a((Closeable) fileInputStream);
                return -1;
            } catch (Throwable th) {
                FileInputStream fileInputStream3 = fileInputStream2;
                th = th;
                fileInputStream = fileInputStream3;
                m103213a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            m103213a((Closeable) fileInputStream);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            m103213a((Closeable) fileInputStream);
            throw th;
        }
    }

    /* renamed from: h */
    private static int m103227h() {
        FileInputStream fileInputStream = null;
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/status");
            FileInputStream fileInputStream2 = new FileInputStream(sb.toString());
            try {
                int a = m103209a("VmSize", fileInputStream2);
                m103213a((Closeable) fileInputStream2);
                return a;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                m103213a((Closeable) fileInputStream);
                return -1;
            } catch (Throwable th) {
                FileInputStream fileInputStream3 = fileInputStream2;
                th = th;
                fileInputStream = fileInputStream3;
                m103213a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            m103213a((Closeable) fileInputStream);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            m103213a((Closeable) fileInputStream);
            throw th;
        }
    }

    /* renamed from: i */
    private static int m103228i() {
        FileInputStream fileInputStream = null;
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/status");
            FileInputStream fileInputStream2 = new FileInputStream(sb.toString());
            try {
                int a = m103209a("Threads", fileInputStream2);
                m103213a((Closeable) fileInputStream2);
                return a;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                m103213a((Closeable) fileInputStream);
                return -1;
            } catch (Throwable th) {
                FileInputStream fileInputStream3 = fileInputStream2;
                th = th;
                fileInputStream = fileInputStream3;
                m103213a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            m103213a((Closeable) fileInputStream);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            m103213a((Closeable) fileInputStream);
            throw th;
        }
    }

    /* renamed from: j */
    private static int m103229j() {
        FileInputStream fileInputStream = null;
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/limits");
            FileInputStream fileInputStream2 = new FileInputStream(sb.toString());
            try {
                int a = m103209a("Max open files", fileInputStream2);
                m103213a((Closeable) fileInputStream2);
                return a;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                m103213a((Closeable) fileInputStream);
                return -1;
            } catch (Throwable th) {
                FileInputStream fileInputStream3 = fileInputStream2;
                th = th;
                fileInputStream = fileInputStream3;
                m103213a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            m103213a((Closeable) fileInputStream);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            m103213a((Closeable) fileInputStream);
            throw th;
        }
    }

    /* renamed from: e */
    public static C47698f m103224e() {
        C47698f fVar = new C47698f();
        try {
            fVar.f120188a = (long) m103226g();
            fVar.f120189b = (long) m103227h();
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/fd");
            File file = new File(sb.toString());
            int i = -1;
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    i = listFiles.length;
                }
            }
            fVar.f120191d = (long) i;
            fVar.f120192e = m103228i();
            fVar.f120190c = (long) m103229j();
            return fVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005a */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m103214b() {
        /*
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = -1
        L_0x0004:
            int r4 = m103208a()     // Catch:{ IOException -> 0x0083 }
            if (r2 >= r4) goto L_0x0066
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0083 }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch:{ IOException -> 0x0083 }
            r4.append(r2)     // Catch:{ IOException -> 0x0083 }
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch:{ IOException -> 0x0083 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0083 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0083 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0083 }
            boolean r4 = r5.exists()     // Catch:{ IOException -> 0x0083 }
            if (r4 == 0) goto L_0x0063
            r4 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r4]     // Catch:{ IOException -> 0x0083 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0083 }
            r7.<init>(r5)     // Catch:{ IOException -> 0x0083 }
            r7.read(r6)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            r5 = 0
        L_0x0035:
            byte r8 = r6[r5]     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            boolean r8 = java.lang.Character.isDigit(r8)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            if (r8 == 0) goto L_0x0042
            if (r5 >= r4) goto L_0x0042
            int r5 = r5 + 1
            goto L_0x0035
        L_0x0042:
            java.lang.String r4 = new java.lang.String     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            r4.<init>(r6, r1, r5)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            int r5 = r4.intValue()     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            if (r5 <= r3) goto L_0x005a
            int r4 = r4.intValue()     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            r3 = r4
        L_0x005a:
            r7.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x0063
        L_0x005e:
            r2 = move-exception
            r7.close()     // Catch:{ IOException -> 0x0083 }
            throw r2     // Catch:{ IOException -> 0x0083 }
        L_0x0063:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0066:
            if (r3 != r0) goto L_0x0084
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0083 }
            java.lang.String r4 = "/proc/cpuinfo"
            r2.<init>(r4)     // Catch:{ IOException -> 0x0083 }
            java.lang.String r4 = "cpu MHz"
            int r4 = m103209a(r4, r2)     // Catch:{ all -> 0x007e }
            int r4 = r4 * 1000
            if (r4 <= r3) goto L_0x007a
            r3 = r4
        L_0x007a:
            r2.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x0084
        L_0x007e:
            r3 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0083 }
            throw r3     // Catch:{ IOException -> 0x0083 }
        L_0x0083:
            r3 = -1
        L_0x0084:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            r2 = 6
            if (r0 < r2) goto L_0x0090
            r1 = 1
        L_0x0090:
            if (r1 == 0) goto L_0x0094
            int r3 = r3 / 1000
        L_0x0094:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47689aw.m103214b():int");
    }

    /* renamed from: d */
    public static String m103221d() {
        BufferedReader bufferedReader;
        String str = ":";
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        m103213a((Closeable) bufferedReader);
                        break;
                    } else if (readLine.contains(str)) {
                        String[] split = readLine.split(str);
                        if (split[0].contains("Hardware")) {
                            String str2 = split[1];
                            m103213a((Closeable) bufferedReader);
                            return str2;
                        }
                    }
                } catch (IOException unused) {
                    bufferedReader2 = bufferedReader;
                    m103213a((Closeable) bufferedReader2);
                    return Build.HARDWARE;
                } catch (Throwable th) {
                    th = th;
                    m103213a((Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (IOException unused2) {
            m103213a((Closeable) bufferedReader2);
            return Build.HARDWARE;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            m103213a((Closeable) bufferedReader);
            throw th;
        }
        return Build.HARDWARE;
    }

    /* renamed from: a */
    private static void m103213a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static int m103217c(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 262144) == 262144) {
                return 1;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: e */
    public static int m103223e(Context context) {
        try {
            return ((ActivityManager) context.getSystemService("activity")).getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static long m103216b(String str) {
        try {
            StatFs statFs = new StatFs(str);
            if (VERSION.SDK_INT >= 18) {
                return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            }
            return ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0032  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m103222d(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x002f, all -> 0x0027 }
            java.lang.Process r4 = r2.exec(r4)     // Catch:{ Exception -> 0x002f, all -> 0x0027 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0030, all -> 0x0025 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0030, all -> 0x0025 }
            java.io.InputStream r3 = r4.getInputStream()     // Catch:{ Exception -> 0x0030, all -> 0x0025 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0030, all -> 0x0025 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0030, all -> 0x0025 }
            java.lang.String r1 = r1.readLine()     // Catch:{ Exception -> 0x0030, all -> 0x0025 }
            if (r1 == 0) goto L_0x001f
            r0 = 1
        L_0x001f:
            if (r4 == 0) goto L_0x0024
            r4.destroy()
        L_0x0024:
            return r0
        L_0x0025:
            r0 = move-exception
            goto L_0x0029
        L_0x0027:
            r0 = move-exception
            r4 = r1
        L_0x0029:
            if (r4 == 0) goto L_0x002e
            r4.destroy()
        L_0x002e:
            throw r0
        L_0x002f:
            r4 = r1
        L_0x0030:
            if (r4 == 0) goto L_0x0035
            r4.destroy()
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47689aw.m103222d(java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m103215b(android.content.Context r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = -1
            r3 = 16
            if (r0 < r3) goto L_0x001d
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            java.lang.String r3 = "activity"
            java.lang.Object r6 = r6.getSystemService(r3)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            if (r6 == 0) goto L_0x001d
            r6.getMemoryInfo(r0)
            long r3 = r0.availMem
            goto L_0x001e
        L_0x001d:
            r3 = r1
        L_0x001e:
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x0048
            r6 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0045, all -> 0x0040 }
            java.lang.String r1 = "/proc/meminfo"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0045, all -> 0x0040 }
            java.lang.String r6 = "MemAvailable"
            int r6 = m103209a(r6, r0)     // Catch:{ Exception -> 0x003e, all -> 0x0039 }
            long r1 = (long) r6
            r3 = 1024(0x400, double:5.06E-321)
            long r3 = r3 * r1
            m103213a(r0)
            goto L_0x0048
        L_0x0039:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L_0x0041
        L_0x003e:
            r6 = r0
            goto L_0x0045
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            m103213a(r6)
            throw r0
        L_0x0045:
            m103213a(r6)
        L_0x0048:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47689aw.m103215b(android.content.Context):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[SYNTHETIC, Splitter:B:21:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0041 A[SYNTHETIC, Splitter:B:27:0x0041] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m103218c(java.lang.String r3) {
        /*
            r0 = -1
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003f, all -> 0x0037 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x003f, all -> 0x0037 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            java.lang.String r3 = r3.readLine()     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            if (r3 == 0) goto L_0x002f
            java.lang.String r1 = "0-[\\d]+$"
            boolean r1 = r3.matches(r1)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            if (r1 != 0) goto L_0x0020
            goto L_0x002f
        L_0x0020:
            r1 = 2
            java.lang.String r3 = r3.substring(r1)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            int r3 = r3.intValue()     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            int r0 = r3 + 1
        L_0x002f:
            r2.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r0
        L_0x0033:
            r3 = move-exception
            goto L_0x0039
        L_0x0035:
            r1 = r2
            goto L_0x003f
        L_0x0037:
            r3 = move-exception
            r2 = r1
        L_0x0039:
            if (r2 == 0) goto L_0x003e
            r2.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            throw r3
        L_0x003f:
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47689aw.m103218c(java.lang.String):int");
    }

    /* renamed from: d */
    public static long m103220d(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                return -1;
            }
            StringBuilder sb = new StringBuilder("/data/data/");
            sb.append(packageName);
            File file = new File(sb.toString());
            if (!file.exists()) {
                return -1;
            }
            long a = m103211a(file);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Environment.getExternalStorageDirectory().getAbsolutePath());
            sb2.append("/Android/data/");
            sb2.append(packageName);
            File file2 = new File(sb2.toString());
            long j = 0;
            if (file2.exists()) {
                j = m103211a(file2);
            }
            return a + j;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m103210a(android.content.Context r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = -1
            r3 = 16
            if (r0 < r3) goto L_0x001d
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            java.lang.String r3 = "activity"
            java.lang.Object r6 = r6.getSystemService(r3)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            if (r6 == 0) goto L_0x001d
            r6.getMemoryInfo(r0)
            long r3 = r0.totalMem
            goto L_0x001e
        L_0x001d:
            r3 = r1
        L_0x001e:
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x0048
            r6 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0045, all -> 0x0040 }
            java.lang.String r1 = "/proc/meminfo"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0045, all -> 0x0040 }
            java.lang.String r6 = "MemTotal"
            int r6 = m103209a(r6, r0)     // Catch:{ Exception -> 0x003e, all -> 0x0039 }
            long r1 = (long) r6
            r3 = 1024(0x400, double:5.06E-321)
            long r3 = r3 * r1
            m103213a(r0)
            goto L_0x0048
        L_0x0039:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L_0x0041
        L_0x003e:
            r6 = r0
            goto L_0x0045
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            m103213a(r6)
            throw r0
        L_0x0045:
            m103213a(r6)
        L_0x0048:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47689aw.m103210a(android.content.Context):long");
    }

    /* renamed from: a */
    private static long m103211a(File file) {
        long j;
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles == null) {
            return 0;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                j = m103211a(file2);
            } else {
                j = file2.length();
            }
            j2 += j;
        }
        return j2;
    }

    /* renamed from: a */
    public static long m103212a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            if (VERSION.SDK_INT >= 18) {
                return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
            }
            return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static int m103209a(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (i2 < read) {
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            continue;
                            break;
                        } else if (i3 == str.length() - 1) {
                            while (i2 < 1024 && bArr[i2] != 10) {
                                if (Character.isDigit(bArr[i2])) {
                                    int i4 = i2 + 1;
                                    while (i4 < 1024 && Character.isDigit(bArr[i4])) {
                                        i4++;
                                    }
                                    return Integer.parseInt(new String(bArr, 0, i2, i4 - i2));
                                }
                                i2++;
                            }
                            return -1;
                        } else {
                            i2++;
                        }
                    }
                    continue;
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }
}
