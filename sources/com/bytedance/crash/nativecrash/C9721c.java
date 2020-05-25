package com.bytedance.crash.nativecrash;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.C9606i;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p542d.C9572a;
import com.bytedance.crash.p542d.p543a.C9573a;
import com.bytedance.crash.p546f.C9584a;
import com.bytedance.crash.p546f.C9586c;
import com.bytedance.crash.p547g.C9589a;
import com.bytedance.crash.p547g.C9590b;
import com.bytedance.crash.p547g.C9591c;
import com.bytedance.crash.p551k.C9652h;
import com.bytedance.crash.p555n.C9695g;
import com.bytedance.crash.p555n.C9697i;
import com.bytedance.crash.p555n.C9705m;
import com.bytedance.crash.p555n.C9709p;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.nativecrash.c */
public final class C9721c {

    /* renamed from: d */
    private static Boolean f26450d;

    /* renamed from: a */
    public C9723b f26451a;

    /* renamed from: b */
    private final Context f26452b;

    /* renamed from: c */
    private JSONObject f26453c;

    /* renamed from: com.bytedance.crash.nativecrash.c$a */
    static class C9722a {
        /* renamed from: a */
        public static String m19493a(File file) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        String str = "";
                        C9697i.m19370a((Closeable) bufferedReader2);
                        return str;
                    } else if (!readLine.startsWith("[FATAL:jni_android.cc") || !readLine.contains("Please include Java exception stack in crash report ttwebview:")) {
                        C9697i.m19370a((Closeable) bufferedReader2);
                        return "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int indexOf = readLine.indexOf(" ttwebview:");
                        sb.append("Caused by: ");
                        sb.append("Please include Java exception stack in crash report");
                        sb.append("\n");
                        sb.append(readLine.substring(indexOf + 11));
                        sb.append("\n");
                        while (true) {
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 != null) {
                                sb.append(readLine2);
                                sb.append("\n");
                            } else {
                                String sb2 = sb.toString();
                                C9697i.m19370a((Closeable) bufferedReader2);
                                return sb2;
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    C9697i.m19370a((Closeable) bufferedReader2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C9577e.m18999a().mo17384a("NPTH_CATCH", th);
                C9697i.m19370a((Closeable) bufferedReader);
                return "";
            }
        }
    }

    /* renamed from: com.bytedance.crash.nativecrash.c$b */
    public class C9723b {

        /* renamed from: a */
        public final C9728d f26454a;

        /* renamed from: b */
        public final C9719a f26455b;

        /* renamed from: c */
        public final C9720b f26456c;

        /* renamed from: d */
        public final File f26457d;

        /* JADX WARNING: Removed duplicated region for block: B:10:0x001a A[Catch:{ Throwable -> 0x0015 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long mo17555a() {
            /*
                r3 = this;
                com.bytedance.crash.nativecrash.a r0 = r3.f26455b
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f26448a
                if (r0 == 0) goto L_0x0017
                boolean r1 = r0.isEmpty()     // Catch:{ Throwable -> 0x0015 }
                if (r1 != 0) goto L_0x0017
                java.lang.String r1 = "start_time"
                java.lang.Object r0 = r0.get(r1)     // Catch:{ Throwable -> 0x0015 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0015 }
                goto L_0x0018
            L_0x0015:
                r0 = move-exception
                goto L_0x001f
            L_0x0017:
                r0 = 0
            L_0x0018:
                if (r0 == 0) goto L_0x0028
                long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Throwable -> 0x0015 }
                return r0
            L_0x001f:
                com.bytedance.crash.f r1 = com.bytedance.crash.C9577e.m18999a()
                java.lang.String r2 = "NPTH_CATCH"
                r1.mo17384a(r2, r0)
            L_0x0028:
                long r0 = java.lang.System.currentTimeMillis()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C9721c.C9723b.mo17555a():long");
        }

        public C9723b(File file) {
            this.f26457d = file;
            this.f26455b = new C9719a(file);
            this.f26456c = new C9720b(file);
            this.f26454a = new C9728d(file);
            if (this.f26455b.mo17543a() && this.f26454a.f26477f == null) {
                C9728d dVar = this.f26454a;
                File d = C9705m.m19399d(file);
                if (d.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(d.getAbsoluteFile());
                    sb.append(".old");
                    d.renameTo(new File(sb.toString()));
                }
                if (NativeImpl.f26446a) {
                    NativeImpl.doRebuildTombstone(C9705m.m19401e(file).getAbsolutePath(), C9705m.m19399d(file).getAbsolutePath(), C9705m.m19402f(file).getAbsolutePath());
                }
                dVar.mo17558a(C9705m.m19399d(file));
            }
        }
    }

    /* renamed from: com.bytedance.crash.nativecrash.c$c */
    public class C9724c extends C9726e {
        C9724c() {
            super();
            this.f26462c = "Total FD Count:";
            this.f26461b = C9705m.m19407j(C9721c.this.f26451a.f26457d);
            this.f26463d = ":";
            this.f26464e = -2;
        }
    }

    /* renamed from: com.bytedance.crash.nativecrash.c$d */
    public class C9725d extends C9726e {
        C9725d() {
            super();
            this.f26462c = "VmSize:";
            this.f26461b = C9705m.m19409l(C9721c.this.f26451a.f26457d);
            this.f26463d = "\\s+";
            this.f26464e = -1;
        }
    }

    /* renamed from: com.bytedance.crash.nativecrash.c$e */
    public class C9726e {

        /* renamed from: b */
        protected File f26461b;

        /* renamed from: c */
        protected String f26462c;

        /* renamed from: d */
        protected String f26463d;

        /* renamed from: e */
        protected int f26464e;

        /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0052  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo17556a() {
            /*
                r5 = this;
                java.io.File r0 = r5.f26461b
                boolean r0 = r0.exists()
                r1 = -1
                if (r0 == 0) goto L_0x0056
                java.io.File r0 = r5.f26461b
                boolean r0 = r0.isFile()
                if (r0 != 0) goto L_0x0012
                goto L_0x0056
            L_0x0012:
                r0 = 0
                java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Throwable -> 0x003f }
                java.io.File r3 = r5.f26461b     // Catch:{ Throwable -> 0x003f }
                r2.<init>(r3)     // Catch:{ Throwable -> 0x003f }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x003f }
                r3.<init>(r2)     // Catch:{ Throwable -> 0x003f }
                r0 = -1
            L_0x0020:
                java.lang.String r2 = r3.readLine()     // Catch:{ Throwable -> 0x0038, all -> 0x0034 }
                if (r2 == 0) goto L_0x0030
                int r2 = r5.m19495a(r2)     // Catch:{ Throwable -> 0x0038, all -> 0x0034 }
                if (r2 == r1) goto L_0x002e
                r0 = r2
                goto L_0x0030
            L_0x002e:
                r0 = r2
                goto L_0x0020
            L_0x0030:
                com.bytedance.crash.p555n.C9697i.m19370a(r3)
                goto L_0x004f
            L_0x0034:
                r0 = move-exception
                r1 = r0
                r0 = r3
                goto L_0x0050
            L_0x0038:
                r1 = move-exception
                r2 = r1
                r1 = r0
                r0 = r3
                goto L_0x0040
            L_0x003d:
                r1 = move-exception
                goto L_0x0050
            L_0x003f:
                r2 = move-exception
            L_0x0040:
                com.bytedance.crash.f r3 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ all -> 0x003d }
                java.lang.String r4 = "NPTH_CATCH"
                r3.mo17384a(r4, r2)     // Catch:{ all -> 0x003d }
                if (r0 == 0) goto L_0x004e
                com.bytedance.crash.p555n.C9697i.m19370a(r0)
            L_0x004e:
                r0 = r1
            L_0x004f:
                return r0
            L_0x0050:
                if (r0 == 0) goto L_0x0055
                com.bytedance.crash.p555n.C9697i.m19370a(r0)
            L_0x0055:
                throw r1
            L_0x0056:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C9721c.C9726e.mo17556a():int");
        }

        public C9726e() {
        }

        /* renamed from: a */
        private int m19495a(String str) {
            int i = this.f26464e;
            if (!str.startsWith(this.f26462c)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f26463d)[1].trim());
            } catch (NumberFormatException e) {
                C9577e.m18999a().mo17384a("NPTH_CATCH", e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* renamed from: com.bytedance.crash.nativecrash.c$f */
    public class C9727f extends C9726e {
        C9727f() {
            super();
            this.f26462c = "Total Threads Count:";
            this.f26461b = C9705m.m19408k(C9721c.this.f26451a.f26457d);
            this.f26463d = ":";
            this.f26464e = -2;
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo17545a() {
        if (this.f26451a != null) {
            return this.f26451a.f26455b.f26448a;
        }
        return null;
    }

    /* renamed from: j */
    public final boolean mo17554j() {
        return C9695g.m19357a(this.f26451a.f26457d);
    }

    /* renamed from: h */
    public static long m19481h() {
        if (NativeImpl.m19472b()) {
            return Long.MAX_VALUE;
        }
        if (C9586c.m19051a()) {
            return 3891200;
        }
        return 2867200;
    }

    /* renamed from: b */
    public final String mo17547b() {
        if (this.f26451a == null) {
            return null;
        }
        String a = this.f26451a.f26454a.mo17557a();
        if (a == null || a.isEmpty()) {
            a = this.f26451a.f26455b.mo17544b();
        }
        return a;
    }

    /* renamed from: g */
    public final void mo17552g() {
        C9572a.m18984a().mo17369a(C9573a.m18989a(C9705m.m19405h(this.f26451a.f26457d).getAbsolutePath()));
    }

    /* renamed from: c */
    public final JSONObject mo17548c() {
        File h = C9705m.m19405h(this.f26451a.f26457d);
        if (!h.exists()) {
            return null;
        }
        try {
            String c = C9695g.m19362c(h.getAbsolutePath());
            if (c != null && !c.isEmpty()) {
                return new JSONObject(c);
            }
        } catch (Throwable th) {
            C9577e.m18999a().mo17384a("NPTH_CATCH", th);
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo17551f() {
        C9606i iVar = C9616k.m19150b().f26031i;
        if (iVar != null) {
            try {
                if (!iVar.mo17442a(mo17547b(), "")) {
                    return false;
                }
            } catch (Throwable th) {
                C9577e.m18999a().mo17384a("NPTH_CATCH", th);
            }
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m19482k() {
        if (f26450d != null) {
            return f26450d.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        int i = 0;
        while (i < 11) {
            try {
                if (new File(strArr[i]).exists()) {
                    Boolean valueOf = Boolean.valueOf(true);
                    f26450d = valueOf;
                    return valueOf.booleanValue();
                }
                i++;
            } catch (Throwable th) {
                C9577e.m18999a().mo17384a("NPTH_CATCH", th);
            }
        }
        Boolean valueOf2 = Boolean.valueOf(false);
        f26450d = valueOf2;
        return valueOf2.booleanValue();
    }

    /* renamed from: d */
    public final void mo17549d() {
        Map map;
        JSONObject a = C9652h.m19252a().mo17502a(this.f26451a.mo17555a());
        ArrayList arrayList = null;
        if (this.f26451a != null) {
            map = this.f26451a.f26456c.f26449a;
        } else {
            map = null;
        }
        if (!(a == null || map == null || map.isEmpty())) {
            C9589a aVar = new C9589a();
            String optString = a.optString("aid");
            String optString2 = a.optString("app_version");
            String optString3 = a.optString("update_version_code");
            String optString4 = a.optString("sdk_version");
            String a2 = C9616k.m19151c().mo17507a();
            if (!TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString4)) {
                aVar.aid = optString;
                aVar.updateVersionCode = optString3;
                aVar.appVersion = optString2;
                aVar.sdkVersion = optString4;
                aVar.deviceId = a2;
                Map a3 = mo17545a();
                if (a3 != null) {
                    long c = C9590b.m19080c((String) a3.get("crash_time"));
                    if (c > 0) {
                        aVar.crashTime = c;
                        aVar.eventTime = c;
                    }
                }
                String b = mo17547b();
                if (!TextUtils.isEmpty(b)) {
                    aVar.crashSummary = b;
                }
                aVar.crashType = C9571d.NATIVE.getName();
                arrayList = new ArrayList();
                for (String str : map.keySet()) {
                    C9589a clone = aVar.clone();
                    clone.event = str;
                    clone.state = C9590b.m19081d((String) map.get(str));
                    arrayList.add(clone);
                }
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            if (C9591c.f26168b && !C9709p.m19415a((List<?>) arrayList)) {
                try {
                    C9591c.f26167a.addAll(arrayList);
                    if (C9591c.f26167a.size() > 5) {
                        C9591c.m19084b();
                    }
                } catch (Throwable unused) {
                }
            }
            C9591c.m19086c();
            File b2 = C9705m.m19394b(this.f26451a.f26457d);
            if (b2.exists()) {
                File c2 = C9705m.m19397c(this.f26451a.f26457d);
                if (c2.exists()) {
                    c2.delete();
                }
                if (!b2.renameTo(c2)) {
                    b2.delete();
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:45|46|49|50|51|52|53|54|55|58|(0)|65) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00c6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0108 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cc A[Catch:{ IOException -> 0x0149 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011f A[Catch:{ IOException -> 0x0149 }, LOOP:2: B:60:0x011f->B:64:0x0145, LOOP_START, PHI: r5 
      PHI: (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:59:0x011d, B:64:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17550e() {
        /*
            r12 = this;
            com.bytedance.crash.nativecrash.c$b r0 = r12.f26451a     // Catch:{ IOException -> 0x0149 }
            java.io.File r0 = r0.f26457d     // Catch:{ IOException -> 0x0149 }
            java.io.File r0 = com.bytedance.crash.p555n.C9705m.m19404g(r0)     // Catch:{ IOException -> 0x0149 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0149 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0149 }
            r2.<init>()     // Catch:{ IOException -> 0x0149 }
            java.lang.String r3 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0149 }
            r2.append(r3)     // Catch:{ IOException -> 0x0149 }
            java.lang.String r3 = ".tmp'"
            r2.append(r3)     // Catch:{ IOException -> 0x0149 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0149 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0149 }
            boolean r2 = r1.exists()     // Catch:{ IOException -> 0x0149 }
            if (r2 == 0) goto L_0x002b
            r1.delete()     // Catch:{ IOException -> 0x0149 }
        L_0x002b:
            boolean r2 = r0.exists()     // Catch:{ IOException -> 0x0149 }
            r3 = 46
            r4 = 6
            r5 = 0
            if (r2 == 0) goto L_0x005e
        L_0x0035:
            if (r5 >= r4) goto L_0x0153
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0149 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0149 }
            r2.<init>()     // Catch:{ IOException -> 0x0149 }
            java.lang.String r6 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0149 }
            r2.append(r6)     // Catch:{ IOException -> 0x0149 }
            r2.append(r3)     // Catch:{ IOException -> 0x0149 }
            r2.append(r5)     // Catch:{ IOException -> 0x0149 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0149 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0149 }
            boolean r2 = r1.exists()     // Catch:{ IOException -> 0x0149 }
            if (r2 == 0) goto L_0x005b
            r1.delete()     // Catch:{ IOException -> 0x0149 }
        L_0x005b:
            int r5 = r5 + 1
            goto L_0x0035
        L_0x005e:
            com.bytedance.crash.f.a r2 = new com.bytedance.crash.f.a     // Catch:{ IOException -> 0x0149 }
            r2.<init>()     // Catch:{ IOException -> 0x0149 }
            r6 = 0
        L_0x0064:
            if (r6 >= r4) goto L_0x00ab
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x0149 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0149 }
            r8.<init>()     // Catch:{ IOException -> 0x0149 }
            java.lang.String r9 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0149 }
            r8.append(r9)     // Catch:{ IOException -> 0x0149 }
            r8.append(r3)     // Catch:{ IOException -> 0x0149 }
            r8.append(r6)     // Catch:{ IOException -> 0x0149 }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x0149 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0149 }
            boolean r8 = r7.exists()     // Catch:{ IOException -> 0x0149 }
            if (r8 == 0) goto L_0x00a8
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ JSONException -> 0x009e }
            java.lang.String r7 = com.bytedance.crash.p555n.C9695g.m19362c(r7)     // Catch:{ JSONException -> 0x009e }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009e }
            r8.<init>(r7)     // Catch:{ JSONException -> 0x009e }
            int r7 = r8.length()     // Catch:{ JSONException -> 0x009e }
            if (r7 <= 0) goto L_0x00a8
            r2.mo17407e(r8)     // Catch:{ JSONException -> 0x009e }
            goto L_0x00a8
        L_0x009e:
            r7 = move-exception
            com.bytedance.crash.f r8 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ IOException -> 0x0149 }
            java.lang.String r9 = "NPTH_CATCH"
            r8.mo17384a(r9, r7)     // Catch:{ IOException -> 0x0149 }
        L_0x00a8:
            int r6 = r6 + 1
            goto L_0x0064
        L_0x00ab:
            org.json.JSONObject r2 = r2.f26141a     // Catch:{ IOException -> 0x0149 }
            int r6 = r2.length()     // Catch:{ Throwable -> 0x00c6 }
            if (r6 == 0) goto L_0x00c6
            java.lang.String r6 = "storage"
            java.lang.Object r6 = r2.opt(r6)     // Catch:{ Throwable -> 0x00c6 }
            if (r6 != 0) goto L_0x00c6
            android.content.Context r6 = com.bytedance.crash.C9616k.m19154f()     // Catch:{ Throwable -> 0x00c6 }
            org.json.JSONObject r6 = com.bytedance.crash.p555n.C9715u.m19452a(r6)     // Catch:{ Throwable -> 0x00c6 }
            com.bytedance.crash.p546f.C9584a.m19016a(r2, r6)     // Catch:{ Throwable -> 0x00c6 }
        L_0x00c6:
            int r6 = r2.length()     // Catch:{ IOException -> 0x0149 }
            if (r6 == 0) goto L_0x0148
            r12.f26453c = r2     // Catch:{ IOException -> 0x0149 }
            if (r2 == 0) goto L_0x0119
            java.io.File r6 = r1.getParentFile()     // Catch:{ IOException -> 0x0149 }
            r6.mkdirs()     // Catch:{ IOException -> 0x0149 }
            r6 = 0
            java.io.BufferedWriter r7 = new java.io.BufferedWriter     // Catch:{ Throwable -> 0x00f3 }
            java.io.FileWriter r8 = new java.io.FileWriter     // Catch:{ Throwable -> 0x00f3 }
            r8.<init>(r1)     // Catch:{ Throwable -> 0x00f3 }
            r7.<init>(r8)     // Catch:{ Throwable -> 0x00f3 }
            com.bytedance.crash.p555n.C9699k.m19382a(r2, r7)     // Catch:{ Throwable -> 0x00ec, all -> 0x00e9 }
            com.bytedance.crash.p555n.C9697i.m19370a(r7)     // Catch:{ IOException -> 0x0149 }
            goto L_0x0119
        L_0x00e9:
            r0 = move-exception
            r6 = r7
            goto L_0x0115
        L_0x00ec:
            r6 = move-exception
            r11 = r7
            r7 = r6
            r6 = r11
            goto L_0x00f4
        L_0x00f1:
            r0 = move-exception
            goto L_0x0115
        L_0x00f3:
            r7 = move-exception
        L_0x00f4:
            java.lang.String r8 = "err_write"
            java.lang.String r9 = r7.toString()     // Catch:{ JSONException -> 0x0108 }
            r2.put(r8, r9)     // Catch:{ JSONException -> 0x0108 }
            java.lang.String r8 = "filters"
            java.lang.String r9 = "err_write"
            java.lang.String r10 = r7.getLocalizedMessage()     // Catch:{ JSONException -> 0x0108 }
            com.bytedance.crash.p546f.C9584a.m19013a(r2, r8, r9, r10)     // Catch:{ JSONException -> 0x0108 }
        L_0x0108:
            com.bytedance.crash.f r2 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ all -> 0x00f1 }
            java.lang.String r8 = "NPTH_CATCH"
            r2.mo17384a(r8, r7)     // Catch:{ all -> 0x00f1 }
            com.bytedance.crash.p555n.C9697i.m19370a(r6)     // Catch:{ IOException -> 0x0149 }
            goto L_0x0119
        L_0x0115:
            com.bytedance.crash.p555n.C9697i.m19370a(r6)     // Catch:{ IOException -> 0x0149 }
            throw r0     // Catch:{ IOException -> 0x0149 }
        L_0x0119:
            boolean r1 = r1.renameTo(r0)     // Catch:{ IOException -> 0x0149 }
            if (r1 == 0) goto L_0x0148
        L_0x011f:
            if (r5 >= r4) goto L_0x0148
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0149 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0149 }
            r2.<init>()     // Catch:{ IOException -> 0x0149 }
            java.lang.String r6 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0149 }
            r2.append(r6)     // Catch:{ IOException -> 0x0149 }
            r2.append(r3)     // Catch:{ IOException -> 0x0149 }
            r2.append(r5)     // Catch:{ IOException -> 0x0149 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0149 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0149 }
            boolean r2 = r1.exists()     // Catch:{ IOException -> 0x0149 }
            if (r2 == 0) goto L_0x0145
            r1.delete()     // Catch:{ IOException -> 0x0149 }
        L_0x0145:
            int r5 = r5 + 1
            goto L_0x011f
        L_0x0148:
            return
        L_0x0149:
            r0 = move-exception
            com.bytedance.crash.f r1 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r2 = "NPTH_CATCH"
            r1.mo17384a(r2, r0)
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C9721c.mo17550e():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01e2 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0261 A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0270 A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x028e A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0291 A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02c8 A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02cb A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02e0 A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02e3 A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02f8 A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02fb A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0310 A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0313 A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0323 A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x034a A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0371 A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f5 A[SYNTHETIC, Splitter:B:80:0x01f5] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x021a A[Catch:{ Throwable -> 0x0094, Throwable -> 0x03b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0240 A[Catch:{ Throwable -> 0x0246 }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo17553i() {
        /*
            r8 = this;
            com.bytedance.crash.f.a r0 = new com.bytedance.crash.f.a     // Catch:{ Throwable -> 0x03b1 }
            r0.<init>()     // Catch:{ Throwable -> 0x03b1 }
            com.bytedance.crash.f.c r1 = new com.bytedance.crash.f.c     // Catch:{ Throwable -> 0x03b1 }
            android.content.Context r2 = r8.f26452b     // Catch:{ Throwable -> 0x03b1 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x03b1 }
            com.bytedance.crash.p546f.C9586c.m19052b(r1)     // Catch:{ Throwable -> 0x03b1 }
            com.bytedance.crash.k.h r2 = com.bytedance.crash.p551k.C9652h.m19252a()     // Catch:{ Throwable -> 0x03b1 }
            com.bytedance.crash.nativecrash.c$b r3 = r8.f26451a     // Catch:{ Throwable -> 0x03b1 }
            long r3 = r3.mo17555a()     // Catch:{ Throwable -> 0x03b1 }
            org.json.JSONObject r2 = r2.mo17502a(r3)     // Catch:{ Throwable -> 0x03b1 }
            if (r2 == 0) goto L_0x0040
            r1.mo17411b(r2)     // Catch:{ Throwable -> 0x03b1 }
            com.bytedance.crash.k.a r2 = com.bytedance.crash.C9616k.m19147a()     // Catch:{ Throwable -> 0x03b1 }
            if (r2 == 0) goto L_0x0040
            com.bytedance.crash.k.i r2 = com.bytedance.crash.C9616k.m19151c()     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r2 = r2.mo17507a()     // Catch:{ Throwable -> 0x03b1 }
            r1.mo17409a(r2)     // Catch:{ Throwable -> 0x03b1 }
            com.bytedance.crash.k.a r2 = com.bytedance.crash.C9616k.m19147a()     // Catch:{ Throwable -> 0x03b1 }
            com.bytedance.crash.g r2 = r2.f26242a     // Catch:{ Throwable -> 0x03b1 }
            long r2 = r2.mo17414c()     // Catch:{ Throwable -> 0x03b1 }
            r1.mo17408a(r2)     // Catch:{ Throwable -> 0x03b1 }
        L_0x0040:
            r0.mo17387a(r1)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r1 = "is_native_crash"
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x03b1 }
            r0.mo17395a(r1, r2)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r1 = "repack_time"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x03b1 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Throwable -> 0x03b1 }
            r0.mo17395a(r1, r2)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r1 = "crash_uuid"
            com.bytedance.crash.nativecrash.c$b r2 = r8.f26451a     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r2 = r2.f26457d     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r2 = r2.getName()     // Catch:{ Throwable -> 0x03b1 }
            r0.mo17395a(r1, r2)     // Catch:{ Throwable -> 0x03b1 }
            java.util.Map r1 = r8.mo17545a()     // Catch:{ Throwable -> 0x03b1 }
            if (r1 != 0) goto L_0x006f
            goto L_0x00f2
        L_0x006f:
            java.lang.String r2 = "process_name"
            java.lang.Object r2 = r1.get(r2)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x03b1 }
            if (r2 == 0) goto L_0x007e
            java.lang.String r3 = "process_name"
            r0.mo17395a(r3, r2)     // Catch:{ Throwable -> 0x03b1 }
        L_0x007e:
            java.lang.String r2 = "start_time"
            java.lang.Object r2 = r1.get(r2)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x03b1 }
            if (r2 == 0) goto L_0x009e
            java.lang.Long r2 = java.lang.Long.decode(r2)     // Catch:{ Throwable -> 0x0094 }
            long r2 = r2.longValue()     // Catch:{ Throwable -> 0x0094 }
            r0.mo17386a(r2)     // Catch:{ Throwable -> 0x0094 }
            goto L_0x009e
        L_0x0094:
            r2 = move-exception
            com.bytedance.crash.f r3 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r4 = "NPTH_CATCH"
            r3.mo17384a(r4, r2)     // Catch:{ Throwable -> 0x03b1 }
        L_0x009e:
            java.lang.String r2 = "pid"
            java.lang.Object r2 = r1.get(r2)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x03b1 }
            if (r2 == 0) goto L_0x00bc
            java.lang.String r3 = "pid"
            java.lang.Long r2 = java.lang.Long.decode(r2)     // Catch:{ Throwable -> 0x00b2 }
            r0.mo17395a(r3, r2)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x00bc
        L_0x00b2:
            r2 = move-exception
            com.bytedance.crash.f r3 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r4 = "NPTH_CATCH"
            r3.mo17384a(r4, r2)     // Catch:{ Throwable -> 0x03b1 }
        L_0x00bc:
            java.lang.String r2 = "crash_thread_name"
            java.lang.Object r2 = r1.get(r2)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x03b1 }
            if (r2 == 0) goto L_0x00cb
            java.lang.String r3 = "crash_thread_name"
            r0.mo17395a(r3, r2)     // Catch:{ Throwable -> 0x03b1 }
        L_0x00cb:
            java.lang.String r2 = "crash_time"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x03b1 }
            if (r1 == 0) goto L_0x00e9
            java.lang.String r2 = "crash_time"
            java.lang.Long r1 = java.lang.Long.decode(r1)     // Catch:{ Throwable -> 0x00df }
            r0.mo17395a(r2, r1)     // Catch:{ Throwable -> 0x00df }
            goto L_0x00e9
        L_0x00df:
            r1 = move-exception
            com.bytedance.crash.f r2 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r3 = "NPTH_CATCH"
            r2.mo17384a(r3, r1)     // Catch:{ Throwable -> 0x03b1 }
        L_0x00e9:
            java.lang.String r1 = "data"
            java.lang.String r2 = r8.mo17547b()     // Catch:{ Throwable -> 0x03b1 }
            r0.mo17395a(r1, r2)     // Catch:{ Throwable -> 0x03b1 }
        L_0x00f2:
            com.bytedance.crash.nativecrash.c$b r1 = r8.f26451a     // Catch:{ Throwable -> 0x03b1 }
            com.bytedance.crash.nativecrash.d r1 = r1.f26454a     // Catch:{ Throwable -> 0x03b1 }
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f26478g     // Catch:{ Throwable -> 0x03b1 }
            boolean r2 = r1.isEmpty()     // Catch:{ Throwable -> 0x03b1 }
            if (r2 != 0) goto L_0x0144
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Throwable -> 0x03b1 }
            r2.<init>()     // Catch:{ Throwable -> 0x03b1 }
            java.util.Set r3 = r1.keySet()     // Catch:{ Throwable -> 0x03b1 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x03b1 }
        L_0x010b:
            boolean r4 = r3.hasNext()     // Catch:{ Throwable -> 0x03b1 }
            if (r4 == 0) goto L_0x013f
            java.lang.Object r4 = r3.next()     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x03b1 }
            java.lang.Object r5 = r1.get(r4)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r5 = m19478a(r5)     // Catch:{ Throwable -> 0x03b1 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0134 }
            r6.<init>()     // Catch:{ JSONException -> 0x0134 }
            java.lang.String r7 = "lib_name"
            r6.put(r7, r4)     // Catch:{ JSONException -> 0x0134 }
            java.lang.String r4 = "lib_uuid"
            r6.put(r4, r5)     // Catch:{ JSONException -> 0x0134 }
            r2.put(r6)     // Catch:{ JSONException -> 0x0134 }
            goto L_0x010b
        L_0x0134:
            r4 = move-exception
            com.bytedance.crash.f r5 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r6 = "NPTH_CATCH"
            r5.mo17384a(r6, r4)     // Catch:{ Throwable -> 0x03b1 }
            goto L_0x010b
        L_0x013f:
            java.lang.String r1 = "crash_lib_uuid"
            r0.mo17395a(r1, r2)     // Catch:{ Throwable -> 0x03b1 }
        L_0x0144:
            com.bytedance.crash.nativecrash.c$b r1 = r8.f26451a     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r1 = r1.f26457d     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r1 = com.bytedance.crash.p555n.C9705m.m19404g(r1)     // Catch:{ Throwable -> 0x03b1 }
            boolean r2 = r1.exists()     // Catch:{ Throwable -> 0x03b1 }
            if (r2 != 0) goto L_0x016a
            org.json.JSONObject r2 = r8.f26453c     // Catch:{ Throwable -> 0x03b1 }
            if (r2 != 0) goto L_0x016a
            android.content.Context r1 = com.bytedance.crash.C9616k.m19154f()     // Catch:{ Throwable -> 0x03b1 }
            org.json.JSONObject r1 = com.bytedance.crash.p555n.C9715u.m19452a(r1)     // Catch:{ Throwable -> 0x03b1 }
            r0.mo17404d(r1)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r1 = "has_callback"
            java.lang.String r2 = "false"
            r0.mo17390a(r1, r2)     // Catch:{ Throwable -> 0x03b1 }
            goto L_0x01e2
        L_0x016a:
            org.json.JSONObject r2 = r8.f26453c     // Catch:{ Throwable -> 0x01a7 }
            if (r2 != 0) goto L_0x017c
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Throwable -> 0x01a7 }
            java.lang.String r1 = com.bytedance.crash.p555n.C9695g.m19362c(r1)     // Catch:{ Throwable -> 0x01a7 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x01a7 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x01a7 }
            goto L_0x017e
        L_0x017c:
            org.json.JSONObject r2 = r8.f26453c     // Catch:{ Throwable -> 0x01a7 }
        L_0x017e:
            r0.mo17407e(r2)     // Catch:{ Throwable -> 0x01a7 }
            java.lang.String r1 = "has_callback"
            java.lang.String r2 = "true"
            r0.mo17390a(r1, r2)     // Catch:{ Throwable -> 0x01a7 }
            org.json.JSONObject r1 = r0.f26141a     // Catch:{ Throwable -> 0x01a7 }
            java.lang.String r2 = "storage"
            java.lang.Object r1 = r1.opt(r2)     // Catch:{ Throwable -> 0x01a7 }
            if (r1 != 0) goto L_0x019d
            android.content.Context r1 = com.bytedance.crash.C9616k.m19154f()     // Catch:{ Throwable -> 0x01a7 }
            org.json.JSONObject r1 = com.bytedance.crash.p555n.C9715u.m19452a(r1)     // Catch:{ Throwable -> 0x01a7 }
            r0.mo17404d(r1)     // Catch:{ Throwable -> 0x01a7 }
        L_0x019d:
            com.bytedance.crash.f.c r1 = r0.mo17406e()     // Catch:{ Throwable -> 0x01a7 }
            com.bytedance.crash.d r2 = com.bytedance.crash.C9571d.NATIVE     // Catch:{ Throwable -> 0x01a7 }
            com.bytedance.crash.p555n.C9710q.m19416a(r0, r1, r2)     // Catch:{ Throwable -> 0x01a7 }
            goto L_0x01b1
        L_0x01a7:
            r1 = move-exception
            com.bytedance.crash.f r2 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r3 = "NPTH_CATCH"
            r2.mo17384a(r3, r1)     // Catch:{ Throwable -> 0x03b1 }
        L_0x01b1:
            org.json.JSONObject r1 = r0.f26141a     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r2 = "crash_time"
            r3 = -1
            long r1 = r1.optLong(r2, r3)     // Catch:{ Throwable -> 0x03b1 }
            org.json.JSONObject r5 = r0.f26141a     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r6 = "java_end"
            long r5 = r5.optLong(r6, r3)     // Catch:{ Throwable -> 0x03b1 }
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x01cd
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x01cd
            long r3 = r5 - r1
        L_0x01cd:
            java.lang.String r1 = "total_cost"
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x01e2 }
            r0.mo17397b(r1, r2)     // Catch:{ Throwable -> 0x01e2 }
            java.lang.String r1 = "total_cost"
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x01e2 }
            r0.mo17390a(r1, r2)     // Catch:{ Throwable -> 0x01e2 }
        L_0x01e2:
            com.bytedance.crash.nativecrash.c$b r1 = r8.f26451a     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r1 = r1.f26457d     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r3 = "javastack.txt"
            r2.<init>(r1, r3)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r1 = ""
            boolean r3 = r2.exists()     // Catch:{ Throwable -> 0x03b1 }
            if (r3 == 0) goto L_0x0209
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Throwable -> 0x01ff }
            java.lang.String r2 = com.bytedance.crash.p555n.C9713t.m19434a(r2)     // Catch:{ Throwable -> 0x01ff }
            r1 = r2
            goto L_0x0209
        L_0x01ff:
            r2 = move-exception
            com.bytedance.crash.f r3 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r4 = "NPTH_CATCH"
            r3.mo17384a(r4, r2)     // Catch:{ Throwable -> 0x03b1 }
        L_0x0209:
            com.bytedance.crash.nativecrash.c$b r2 = r8.f26451a     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r2 = r2.f26457d     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r4 = "abortmsg.txt"
            r3.<init>(r2, r4)     // Catch:{ Throwable -> 0x03b1 }
            boolean r2 = r3.exists()     // Catch:{ Throwable -> 0x03b1 }
            if (r2 == 0) goto L_0x023a
            java.lang.String r2 = com.bytedance.crash.nativecrash.C9721c.C9722a.m19493a(r3)     // Catch:{ Throwable -> 0x03b1 }
            boolean r3 = r1.isEmpty()     // Catch:{ Throwable -> 0x03b1 }
            if (r3 != 0) goto L_0x0239
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03b1 }
            r3.<init>()     // Catch:{ Throwable -> 0x03b1 }
            r3.append(r1)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r1 = "\n"
            r3.append(r1)     // Catch:{ Throwable -> 0x03b1 }
            r3.append(r2)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r1 = r3.toString()     // Catch:{ Throwable -> 0x03b1 }
            goto L_0x023a
        L_0x0239:
            r1 = r2
        L_0x023a:
            boolean r2 = r1.isEmpty()     // Catch:{ Throwable -> 0x0246 }
            if (r2 != 0) goto L_0x0250
            java.lang.String r2 = "java_data"
            r0.mo17395a(r2, r1)     // Catch:{ Throwable -> 0x0246 }
            goto L_0x0250
        L_0x0246:
            r1 = move-exception
            com.bytedance.crash.f r2 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r3 = "NPTH_CATCH"
            r2.mo17384a(r3, r1)     // Catch:{ Throwable -> 0x03b1 }
        L_0x0250:
            r8.m19480b(r0)     // Catch:{ Throwable -> 0x03b1 }
            r8.m19479a(r0)     // Catch:{ Throwable -> 0x03b1 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Throwable -> 0x03b1 }
            r1.<init>()     // Catch:{ Throwable -> 0x03b1 }
            boolean r2 = m19482k()     // Catch:{ Throwable -> 0x03b1 }
            if (r2 == 0) goto L_0x0270
            java.lang.String r2 = "is_root"
            java.lang.String r3 = "true"
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r2 = "is_root"
            java.lang.String r3 = "true"
            r0.mo17395a(r2, r3)     // Catch:{ Throwable -> 0x03b1 }
            goto L_0x027e
        L_0x0270:
            java.lang.String r2 = "is_root"
            java.lang.String r3 = "false"
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r2 = "is_root"
            java.lang.String r3 = "false"
            r0.mo17395a(r2, r3)     // Catch:{ Throwable -> 0x03b1 }
        L_0x027e:
            com.bytedance.crash.nativecrash.c$b r2 = r8.f26451a     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r2 = r2.f26457d     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r2 = com.bytedance.crash.p555n.C9705m.m19407j(r2)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r3 = "has_fds_file"
            boolean r2 = r2.exists()     // Catch:{ Throwable -> 0x03b1 }
            if (r2 == 0) goto L_0x0291
            java.lang.String r2 = "true"
            goto L_0x0293
        L_0x0291:
            java.lang.String r2 = "false"
        L_0x0293:
            r1.put(r3, r2)     // Catch:{ Throwable -> 0x03b1 }
            com.bytedance.crash.nativecrash.c$b r2 = r8.f26451a     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r2 = r2.f26457d     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r2 = com.bytedance.crash.p555n.C9705m.m19406i(r2)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r3 = "has_logcat_file"
            boolean r4 = r2.exists()     // Catch:{ Throwable -> 0x03b1 }
            if (r4 == 0) goto L_0x02b3
            long r4 = r2.length()     // Catch:{ Throwable -> 0x03b1 }
            r6 = 128(0x80, double:6.32E-322)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x02b3
            java.lang.String r2 = "true"
            goto L_0x02b5
        L_0x02b3:
            java.lang.String r2 = "false"
        L_0x02b5:
            r1.put(r3, r2)     // Catch:{ Throwable -> 0x03b1 }
            com.bytedance.crash.nativecrash.c$b r2 = r8.f26451a     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r2 = r2.f26457d     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r2 = com.bytedance.crash.p555n.C9705m.m19402f(r2)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r3 = "has_maps_file"
            boolean r2 = r2.exists()     // Catch:{ Throwable -> 0x03b1 }
            if (r2 == 0) goto L_0x02cb
            java.lang.String r2 = "true"
            goto L_0x02cd
        L_0x02cb:
            java.lang.String r2 = "false"
        L_0x02cd:
            r1.put(r3, r2)     // Catch:{ Throwable -> 0x03b1 }
            com.bytedance.crash.nativecrash.c$b r2 = r8.f26451a     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r2 = r2.f26457d     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r2 = com.bytedance.crash.p555n.C9705m.m19399d(r2)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r3 = "has_tombstone_file"
            boolean r2 = r2.exists()     // Catch:{ Throwable -> 0x03b1 }
            if (r2 == 0) goto L_0x02e3
            java.lang.String r2 = "true"
            goto L_0x02e5
        L_0x02e3:
            java.lang.String r2 = "false"
        L_0x02e5:
            r1.put(r3, r2)     // Catch:{ Throwable -> 0x03b1 }
            com.bytedance.crash.nativecrash.c$b r2 = r8.f26451a     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r2 = r2.f26457d     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r2 = com.bytedance.crash.p555n.C9705m.m19409l(r2)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r3 = "has_meminfo_file"
            boolean r2 = r2.exists()     // Catch:{ Throwable -> 0x03b1 }
            if (r2 == 0) goto L_0x02fb
            java.lang.String r2 = "true"
            goto L_0x02fd
        L_0x02fb:
            java.lang.String r2 = "false"
        L_0x02fd:
            r1.put(r3, r2)     // Catch:{ Throwable -> 0x03b1 }
            com.bytedance.crash.nativecrash.c$b r2 = r8.f26451a     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r2 = r2.f26457d     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r2 = com.bytedance.crash.p555n.C9705m.m19408k(r2)     // Catch:{ Throwable -> 0x03b1 }
            java.lang.String r3 = "has_threads_file"
            boolean r2 = r2.exists()     // Catch:{ Throwable -> 0x03b1 }
            if (r2 == 0) goto L_0x0313
            java.lang.String r2 = "true"
            goto L_0x0315
        L_0x0313:
            java.lang.String r2 = "false"
        L_0x0315:
            r1.put(r3, r2)     // Catch:{ Throwable -> 0x03b1 }
            com.bytedance.crash.nativecrash.c$c r2 = new com.bytedance.crash.nativecrash.c$c     // Catch:{ Throwable -> 0x03b1 }
            r2.<init>()     // Catch:{ Throwable -> 0x03b1 }
            int r2 = r2.mo17556a()     // Catch:{ Throwable -> 0x03b1 }
            if (r2 <= 0) goto L_0x033f
            r3 = 960(0x3c0, float:1.345E-42)
            if (r2 <= r3) goto L_0x032f
            java.lang.String r3 = "fd_leak"
            java.lang.String r4 = "true"
            r1.put(r3, r4)     // Catch:{ Throwable -> 0x03b1 }
            goto L_0x0336
        L_0x032f:
            java.lang.String r3 = "fd_leak"
            java.lang.String r4 = "false"
            r1.put(r3, r4)     // Catch:{ Throwable -> 0x03b1 }
        L_0x0336:
            java.lang.String r3 = "fd_count"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x03b1 }
            r0.mo17395a(r3, r2)     // Catch:{ Throwable -> 0x03b1 }
        L_0x033f:
            com.bytedance.crash.nativecrash.c$f r2 = new com.bytedance.crash.nativecrash.c$f     // Catch:{ Throwable -> 0x03b1 }
            r2.<init>()     // Catch:{ Throwable -> 0x03b1 }
            int r2 = r2.mo17556a()     // Catch:{ Throwable -> 0x03b1 }
            if (r2 <= 0) goto L_0x0366
            r3 = 350(0x15e, float:4.9E-43)
            if (r2 <= r3) goto L_0x0356
            java.lang.String r3 = "threads_leak"
            java.lang.String r4 = "true"
            r1.put(r3, r4)     // Catch:{ Throwable -> 0x03b1 }
            goto L_0x035d
        L_0x0356:
            java.lang.String r3 = "threads_leak"
            java.lang.String r4 = "false"
            r1.put(r3, r4)     // Catch:{ Throwable -> 0x03b1 }
        L_0x035d:
            java.lang.String r3 = "threads_count"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x03b1 }
            r0.mo17395a(r3, r2)     // Catch:{ Throwable -> 0x03b1 }
        L_0x0366:
            com.bytedance.crash.nativecrash.c$d r2 = new com.bytedance.crash.nativecrash.c$d     // Catch:{ Throwable -> 0x03b1 }
            r2.<init>()     // Catch:{ Throwable -> 0x03b1 }
            int r2 = r2.mo17556a()     // Catch:{ Throwable -> 0x03b1 }
            if (r2 <= 0) goto L_0x0392
            long r3 = (long) r2     // Catch:{ Throwable -> 0x03b1 }
            long r5 = m19481h()     // Catch:{ Throwable -> 0x03b1 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0382
            java.lang.String r3 = "memory_leak"
            java.lang.String r4 = "true"
            r1.put(r3, r4)     // Catch:{ Throwable -> 0x03b1 }
            goto L_0x0389
        L_0x0382:
            java.lang.String r3 = "memory_leak"
            java.lang.String r4 = "false"
            r1.put(r3, r4)     // Catch:{ Throwable -> 0x03b1 }
        L_0x0389:
            java.lang.String r3 = "memory_size"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x03b1 }
            r0.mo17395a(r3, r2)     // Catch:{ Throwable -> 0x03b1 }
        L_0x0392:
            java.lang.String r2 = "sdk_version"
            java.lang.String r3 = "3.1.2-rc.1-oversea"
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x03b1 }
            r0.mo17400b()     // Catch:{ Throwable -> 0x03b1 }
            r0.mo17403c()     // Catch:{ Throwable -> 0x03b1 }
            r0.mo17401c(r1)     // Catch:{ Throwable -> 0x03b1 }
            com.bytedance.crash.nativecrash.c$b r1 = r8.f26451a     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r1 = r1.f26457d     // Catch:{ Throwable -> 0x03b1 }
            java.io.File r1 = com.bytedance.crash.p555n.C9705m.m19405h(r1)     // Catch:{ Throwable -> 0x03b1 }
            org.json.JSONObject r0 = r0.f26141a     // Catch:{ Throwable -> 0x03b1 }
            r2 = 0
            com.bytedance.crash.p555n.C9695g.m19353a(r1, r0, r2)     // Catch:{ Throwable -> 0x03b1 }
            return r0
        L_0x03b1:
            r0 = move-exception
            com.bytedance.crash.f r1 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r2 = "NPTH_CATCH"
            r1.mo17384a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C9721c.mo17553i():org.json.JSONObject");
    }

    public C9721c(Context context) {
        this.f26452b = context;
    }

    /* renamed from: a */
    public final void mo17546a(File file) {
        this.f26451a = new C9723b(file);
    }

    /* renamed from: a */
    private void m19479a(C9584a aVar) {
        File c = C9705m.m19397c(this.f26451a.f26457d);
        if (c.exists()) {
            try {
                String a = C9695g.m19350a(c.getAbsolutePath(), "\n");
                String str = "native_log";
                String str2 = "\n";
                JSONArray jSONArray = new JSONArray();
                if (a != null) {
                    for (String put : a.split(str2)) {
                        jSONArray.put(put);
                    }
                }
                aVar.mo17395a(str, (Object) jSONArray);
            } catch (Throwable th) {
                C9577e.m18999a().mo17384a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: a */
    private static String m19478a(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append(str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable th) {
            C9577e.m18999a().mo17384a("NPTH_CATCH", th);
        }
        return sb.toString().toUpperCase();
    }

    /* renamed from: b */
    private void m19480b(C9584a aVar) {
        String str;
        File i = C9705m.m19406i(this.f26451a.f26457d);
        if (!i.exists()) {
            NativeImpl.m19468a(i.getAbsolutePath(), String.valueOf(C9616k.m19156h().f26294g), String.valueOf(C9616k.m19156h().f26295h));
        }
        BufferedReader bufferedReader = null;
        JSONArray jSONArray = new JSONArray();
        StringBuilder sb = new StringBuilder(" ");
        sb.append((String) this.f26451a.f26455b.f26448a.get("pid"));
        sb.append(" ");
        String sb2 = sb.toString();
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(i));
            try {
                if (i.length() > 512000) {
                    bufferedReader2.skip(i.length() - 512000);
                }
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.length() > 32) {
                        str = readLine.substring(0, 31);
                    } else {
                        str = readLine;
                    }
                    if (str.contains(sb2)) {
                        jSONArray.put(readLine);
                    }
                }
                C9697i.m19370a((Closeable) bufferedReader2);
            } catch (Throwable th) {
                th = th;
                C9697i.m19370a((Closeable) bufferedReader2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C9577e.m18999a().mo17384a("NPTH_CATCH", th);
            C9697i.m19370a((Closeable) bufferedReader);
            aVar.mo17395a("logcat", (Object) jSONArray);
        }
        aVar.mo17395a("logcat", (Object) jSONArray);
    }
}
