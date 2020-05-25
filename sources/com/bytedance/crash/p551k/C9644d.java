package com.bytedance.crash.p551k;

import android.text.TextUtils;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p555n.C9697i;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.k.d */
public final class C9644d {

    /* renamed from: com.bytedance.crash.k.d$a */
    static class C9645a extends Thread {

        /* renamed from: a */
        private InputStream f26322a;

        /* renamed from: b */
        private List<String> f26323b;

        public final void run() {
            BufferedReader bufferedReader;
            Throwable th;
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(this.f26322a));
                int i = 512000;
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else if (!readLine.startsWith("---------")) {
                            i -= readLine.getBytes("UTF-8").length;
                            if (i < 0) {
                                break;
                            }
                            this.f26323b.add(readLine);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C9697i.m19370a((Closeable) bufferedReader);
                        throw th;
                    }
                }
                C9697i.m19370a((Closeable) bufferedReader);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                bufferedReader = null;
                th = th4;
                C9697i.m19370a((Closeable) bufferedReader);
                throw th;
            }
        }

        C9645a(InputStream inputStream, List<String> list) {
            this.f26322a = inputStream;
            this.f26323b = list;
        }
    }

    /* renamed from: com.bytedance.crash.k.d$b */
    static class C9646b extends Thread {

        /* renamed from: a */
        private Process f26324a;

        /* renamed from: b */
        private long f26325b = 3000;

        public final void run() {
            try {
                sleep(this.f26325b);
            } catch (InterruptedException unused) {
            }
            if (this.f26324a != null) {
                this.f26324a.destroy();
            }
        }

        public C9646b(Process process, long j) {
            this.f26324a = process;
        }
    }

    /* renamed from: a */
    public static JSONArray m19235a(File file) {
        int i = C9616k.m19156h().f26294g;
        int i2 = C9616k.m19156h().f26295h;
        JSONArray jSONArray = null;
        try {
            File file2 = new File(file, "logcat.txt");
            if (file2.exists() && file2.length() > 0) {
                JSONArray a = m19236a(file2.getAbsolutePath());
                if (a != null) {
                    try {
                        if (a.length() > 0) {
                            return a;
                        }
                    } catch (Throwable th) {
                        th = th;
                        jSONArray = a;
                        C9577e.m18999a().mo17384a("NPTH_CATCH", th);
                        return jSONArray;
                    }
                }
                jSONArray = a;
            }
            if (jSONArray == null) {
                new JSONArray();
            }
            file2.createNewFile();
            NativeImpl.m19468a(file2.getAbsolutePath(), String.valueOf(i), String.valueOf(i2));
            return m19236a(file2.getAbsolutePath());
        } catch (Throwable th2) {
            th = th2;
            C9577e.m18999a().mo17384a("NPTH_CATCH", th);
            return jSONArray;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|(3:4|(3:6|7|(1:9))|12)|(2:14|15)|16|(2:18|19)|20|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003b */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONArray m19237b(java.io.File r4) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x0044 }
            java.lang.String r2 = "meminfo.txt"
            r1.<init>(r4, r2)     // Catch:{ Throwable -> 0x0044 }
            boolean r4 = r1.exists()     // Catch:{ Throwable -> 0x0044 }
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = r1.getAbsolutePath()     // Catch:{ Throwable -> 0x0044 }
            org.json.JSONArray r4 = m19236a(r4)     // Catch:{ Throwable -> 0x0044 }
            if (r4 == 0) goto L_0x0024
            int r0 = r4.length()     // Catch:{ Throwable -> 0x001f }
            if (r0 <= 0) goto L_0x0024
            return r4
        L_0x001f:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x0045
        L_0x0024:
            r0 = r4
        L_0x0025:
            if (r0 != 0) goto L_0x002d
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Throwable -> 0x0044 }
            r4.<init>()     // Catch:{ Throwable -> 0x0044 }
            r0 = r4
        L_0x002d:
            r1.createNewFile()     // Catch:{ Throwable -> 0x0044 }
            java.lang.String r4 = r1.getAbsolutePath()     // Catch:{ Throwable -> 0x0044 }
            boolean r2 = com.bytedance.crash.nativecrash.NativeImpl.f26446a     // Catch:{ Throwable -> 0x0044 }
            if (r2 == 0) goto L_0x003b
            com.bytedance.crash.nativecrash.NativeImpl.doDumpMemInfo(r4)     // Catch:{ Throwable -> 0x003b }
        L_0x003b:
            java.lang.String r4 = r1.getAbsolutePath()     // Catch:{ Throwable -> 0x0044 }
            org.json.JSONArray r4 = m19236a(r4)     // Catch:{ Throwable -> 0x0044 }
            return r4
        L_0x0044:
            r4 = move-exception
        L_0x0045:
            com.bytedance.crash.f r1 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r2 = "NPTH_CATCH"
            r1.mo17384a(r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p551k.C9644d.m19237b(java.io.File):org.json.JSONArray");
    }

    /* renamed from: a */
    public static JSONArray m19236a(String str) {
        BufferedReader bufferedReader;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            bufferedReader = new BufferedReader(new FileReader(str));
            try {
                File file = new File(str);
                if (file.length() > 512000) {
                    bufferedReader.skip(file.length() - 512000);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        jSONArray.put(readLine);
                    } else {
                        C9697i.m19370a((Closeable) bufferedReader);
                        return jSONArray;
                    }
                }
            } catch (IOException unused) {
                C9697i.m19370a((Closeable) bufferedReader);
                return null;
            } catch (Throwable th) {
                th = th;
                C9697i.m19370a((Closeable) bufferedReader);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
            C9697i.m19370a((Closeable) bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            C9697i.m19370a((Closeable) bufferedReader);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0099  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> m19234a(int r8, int r9) {
        /*
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1 = 6
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "logcat"
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "-t"
            r5 = 1
            r2[r5] = r3
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r3 = 2
            r2[r3] = r8
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r6 = "*:V"
            r8[r4] = r6
            java.lang.String r4 = "*:D"
            r8[r5] = r4
            java.lang.String r4 = "*:I"
            r8[r3] = r4
            java.lang.String r3 = "*:W"
            r4 = 3
            r8[r4] = r3
            java.lang.String r3 = "*:E"
            r5 = 4
            r8[r5] = r3
            java.lang.String r3 = "*:F"
            r6 = 5
            r8[r6] = r3
            if (r9 < 0) goto L_0x003d
            if (r9 >= r1) goto L_0x003d
            r8 = r8[r9]
            goto L_0x003f
        L_0x003d:
            java.lang.String r8 = "*:V"
        L_0x003f:
            r2[r4] = r8
            java.lang.String r8 = "-b"
            r2[r5] = r8
            java.lang.String r8 = "main,system,crash,events"
            r2[r6] = r8
            r8 = 0
            java.lang.Runtime r9 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x0097, all -> 0x008d }
            java.lang.Process r9 = r9.exec(r2)     // Catch:{ Throwable -> 0x0097, all -> 0x008d }
            com.bytedance.crash.k.d$a r8 = new com.bytedance.crash.k.d$a     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            java.io.InputStream r1 = r9.getInputStream()     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            r8.<init>(r1, r0)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            r8.start()     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            com.bytedance.crash.k.d$a r8 = new com.bytedance.crash.k.d$a     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            java.io.InputStream r1 = r9.getErrorStream()     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            r8.<init>(r1, r0)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            r8.start()     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            com.bytedance.crash.k.d$b r8 = new com.bytedance.crash.k.d$b     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            r1 = 3000(0xbb8, double:1.482E-320)
            r8.<init>(r9, r1)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            r8.start()     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            r3 = 26
            if (r8 < r3) goto L_0x0080
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            r9.waitFor(r1, r8)     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
            goto L_0x0083
        L_0x0080:
            r9.waitFor()     // Catch:{ Throwable -> 0x008b, all -> 0x0089 }
        L_0x0083:
            if (r9 == 0) goto L_0x009c
            r9.destroy()
            goto L_0x009c
        L_0x0089:
            r8 = move-exception
            goto L_0x0091
        L_0x008b:
            r8 = r9
            goto L_0x0097
        L_0x008d:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x0091:
            if (r9 == 0) goto L_0x0096
            r9.destroy()
        L_0x0096:
            throw r8
        L_0x0097:
            if (r8 == 0) goto L_0x009c
            r8.destroy()
        L_0x009c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p551k.C9644d.m19234a(int, int):java.util.List");
    }
}
