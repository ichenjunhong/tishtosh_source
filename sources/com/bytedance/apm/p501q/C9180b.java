package com.bytedance.apm.p501q;

import android.app.ActivityManager;
import android.content.Context;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import com.C2240a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.apm.q.b */
public final class C9180b {

    /* renamed from: a */
    private static long f25148a = -1;

    /* renamed from: b */
    private static long f25149b = -1;

    /* renamed from: f */
    public static long m18224f() {
        return m18225g() + m18210a(Environment.getRootDirectory());
    }

    /* renamed from: e */
    public static long m18222e() {
        if (f25149b == -1) {
            try {
                f25149b = Runtime.getRuntime().maxMemory();
            } catch (Exception unused) {
            }
        }
        return f25149b;
    }

    /* renamed from: g */
    private static long m18225g() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return m18210a(C9183e.m18228a());
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* renamed from: a */
    public static long m18207a() {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[5]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                C9184f.m18231a(bufferedReader);
                return parseLong;
            } catch (Throwable th2) {
                th = th2;
                C9184f.m18231a(bufferedReader);
                throw th;
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            bufferedReader = null;
            th = th4;
            C9184f.m18231a(bufferedReader);
            throw th;
        }
    }

    /* renamed from: b */
    public static long m18214b() {
        int myPid = Process.myPid();
        BufferedReader bufferedReader = null;
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(myPid);
            sb.append("/stat");
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(sb.toString())), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
                C9184f.m18231a(bufferedReader2);
                return parseLong;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                C9184f.m18231a(bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C9184f.m18231a(bufferedReader);
            throw th;
        }
    }

    /* renamed from: c */
    public static long m18218c() {
        int myPid = Process.myPid();
        BufferedReader bufferedReader = null;
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(myPid);
            sb.append("/stat");
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(sb.toString())), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]);
                C9184f.m18231a(bufferedReader2);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                C9184f.m18231a(bufferedReader);
                return -1;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                C9184f.m18231a(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            C9184f.m18231a(bufferedReader);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            C9184f.m18231a(bufferedReader);
            throw th;
        }
    }

    /* renamed from: d */
    public static long m18220d() {
        try {
            String[] split = m18213a(C2240a.m6772a("/proc/%s/status", new Object[]{Integer.valueOf(Process.myPid())})).trim().split("\n");
            for (String str : split) {
                if (str.startsWith("VmSize")) {
                    Matcher matcher = Pattern.compile("\\d+").matcher(str);
                    if (matcher.find()) {
                        return Long.parseLong(matcher.group());
                    }
                }
            }
            if (split.length > 12) {
                Matcher matcher2 = Pattern.compile("\\d+").matcher(split[12]);
                if (matcher2.find()) {
                    return Long.parseLong(matcher2.group());
                }
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static long m18209a(Context context) {
        if (context == null) {
            return -1;
        }
        return m18221d(context) + m18223e(context);
    }

    /* renamed from: d */
    private static long m18221d(Context context) {
        if (context == null) {
            return -1;
        }
        return TrafficStats.getUidRxBytes(Process.myUid());
    }

    /* renamed from: e */
    private static long m18223e(Context context) {
        if (context == null) {
            return -1;
        }
        return TrafficStats.getUidTxBytes(Process.myUid());
    }

    /* renamed from: a */
    public static long m18208a(long j) {
        long j2;
        if (f25148a == -1) {
            if (VERSION.SDK_INT >= 21) {
                j2 = Os.sysconf(OsConstants._SC_CLK_TCK);
            } else if (VERSION.SDK_INT >= 14) {
                j2 = m18215b(100);
            } else {
                j2 = 100;
            }
            if (j2 <= 0) {
                j2 = 100;
            }
            f25148a = j2;
        }
        return f25148a;
    }

    /* renamed from: b */
    private static long m18217b(File file) {
        long j;
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles == null) {
            return 0;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                j = m18217b(file2);
            } else {
                j = file2.length();
            }
            j2 += j;
        }
        return j2;
    }

    /* renamed from: a */
    private static long m18210a(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (VERSION.SDK_INT >= 18) {
                return statFs.getTotalBytes();
            }
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static long m18215b(long j) {
        try {
            int i = Class.forName("libcore.io.OsConstants").getField("_SC_CLK_TCK").getInt(null);
            Class cls = Class.forName("libcore.io.Libcore");
            Class cls2 = Class.forName("libcore.io.Os");
            Object obj = cls.getField("os").get(null);
            return ((Long) cls2.getMethod("sysconf", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i)})).longValue();
        } catch (Exception unused) {
            return j;
        }
    }

    /* renamed from: c */
    public static long m18219c(Context context) {
        long j;
        if (context == null) {
            return -1;
        }
        try {
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                return -1;
            }
            File cacheDir = context.getCacheDir();
            long j2 = 0;
            if (cacheDir.exists()) {
                j = m18217b(cacheDir);
            } else {
                j = 0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C9183e.m18228a().getAbsolutePath());
            sb.append("/Android/data/");
            sb.append(packageName);
            sb.append("/cache");
            File file = new File(sb.toString());
            if (file.exists()) {
                j2 = m18217b(file);
            }
            return j + j2;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m18212a(java.io.InputStream r4) throws java.lang.Exception {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x002a }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x002a }
            r3.<init>(r4)     // Catch:{ all -> 0x002a }
            r2.<init>(r3)     // Catch:{ all -> 0x002a }
        L_0x0010:
            java.lang.String r4 = r2.readLine()     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x001f
            r0.append(r4)     // Catch:{ all -> 0x0027 }
            r4 = 10
            r0.append(r4)     // Catch:{ all -> 0x0027 }
            goto L_0x0010
        L_0x001f:
            r2.close()
            java.lang.String r4 = r0.toString()
            return r4
        L_0x0027:
            r4 = move-exception
            r1 = r2
            goto L_0x002b
        L_0x002a:
            r4 = move-exception
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p501q.C9180b.m18212a(java.io.InputStream):java.lang.String");
    }

    /* renamed from: b */
    public static long m18216b(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                return -1;
            }
            File file = new File(context.getFilesDir().getParent());
            if (!file.exists()) {
                return -1;
            }
            long b = m18217b(file);
            StringBuilder sb = new StringBuilder();
            sb.append(C9183e.m18228a().getAbsolutePath());
            sb.append("/Android/data/");
            sb.append(packageName);
            File file2 = new File(sb.toString());
            long j = 0;
            if (file2.exists()) {
                j = m18217b(file2);
            }
            return b + j;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m18213a(java.lang.String r2) throws java.lang.Exception {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r2 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0017 }
            r1.<init>(r0)     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = m18212a(r1)     // Catch:{ all -> 0x0013 }
            r1.close()
            return r2
        L_0x0013:
            r2 = move-exception
            r0 = r2
            r2 = r1
            goto L_0x0018
        L_0x0017:
            r0 = move-exception
        L_0x0018:
            if (r2 == 0) goto L_0x001d
            r2.close()
        L_0x001d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p501q.C9180b.m18213a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static MemoryInfo m18211a(int i, Context context) {
        if (context == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            return activityManager.getProcessMemoryInfo(new int[]{i})[0];
        } catch (Exception unused) {
            return null;
        }
    }
}
