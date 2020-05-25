package com.bytedance.crash.p551k;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.C9567c.C9568a;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.C9610j;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.nativecrash.C9721c;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p539a.C9545a;
import com.bytedance.crash.p542d.C9572a;
import com.bytedance.crash.p542d.p543a.C9573a;
import com.bytedance.crash.p546f.C9584a;
import com.bytedance.crash.p546f.C9587d;
import com.bytedance.crash.p547g.C9589a;
import com.bytedance.crash.p547g.C9590b;
import com.bytedance.crash.p547g.C9591c;
import com.bytedance.crash.p548h.C9599a;
import com.bytedance.crash.p554m.C9667a;
import com.bytedance.crash.p554m.C9668b;
import com.bytedance.crash.p554m.C9683j;
import com.bytedance.crash.p555n.C9685a;
import com.bytedance.crash.p555n.C9695g;
import com.bytedance.crash.p555n.C9705m;
import com.bytedance.crash.p555n.C9706n;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.k.c */
public final class C9638c {

    /* renamed from: e */
    private static volatile C9638c f26301e;

    /* renamed from: a */
    public Context f26302a;

    /* renamed from: b */
    public C9643b f26303b;

    /* renamed from: c */
    public HashMap<String, C9643b> f26304c;

    /* renamed from: d */
    public volatile boolean f26305d;

    /* renamed from: f */
    private int f26306f = -1;

    /* renamed from: g */
    private Runnable f26307g = new Runnable() {
        public final void run() {
            C9638c.this.mo17487d();
        }
    };

    /* renamed from: h */
    private Runnable f26308h = new Runnable() {
        public final void run() {
            C9638c.this.mo17485c();
        }
    };

    /* renamed from: com.bytedance.crash.k.c$a */
    static class C9642a {

        /* renamed from: a */
        File f26313a;

        /* renamed from: b */
        long f26314b = -1;

        /* renamed from: c */
        C9571d f26315c;

        C9642a(File file, C9571d dVar) {
            this.f26313a = file;
            this.f26315c = dVar;
        }

        C9642a(File file, long j, C9571d dVar) {
            this.f26313a = file;
            this.f26314b = j;
            this.f26315c = dVar;
        }
    }

    /* renamed from: com.bytedance.crash.k.c$b */
    public static class C9643b {

        /* renamed from: a */
        String f26316a;

        /* renamed from: b */
        List<C9642a> f26317b = new ArrayList();

        /* renamed from: c */
        List<C9642a> f26318c = new ArrayList();

        /* renamed from: d */
        C9642a f26319d;

        /* renamed from: e */
        C9642a f26320e;

        /* renamed from: f */
        boolean f26321f = false;

        public C9643b(String str) {
            this.f26316a = str;
        }
    }

    /* renamed from: a */
    public static C9638c m19220a() {
        if (f26301e == null) {
            synchronized (C9638c.class) {
                if (f26301e == null) {
                    f26301e = new C9638c(C9616k.m19154f());
                }
            }
        }
        return f26301e;
    }

    /* renamed from: b */
    public final void mo17482b() {
        try {
            if (!this.f26305d) {
                if (C9685a.m19317b(C9616k.m19154f())) {
                    C9649f.m19247b().mo17509a(this.f26308h);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public final void mo17487d() {
        if (!this.f26305d) {
            if (System.currentTimeMillis() - C9616k.m19157i() > 300000 || C9616k.m19156h().mo17477b() != null || !C9636b.m19212c() || C9610j.m19139c()) {
                mo17485c();
            } else {
                C9649f.m19247b().mo17510a(this.f26307g, 5000);
            }
        }
    }

    /* renamed from: c */
    public final void mo17485c() {
        if (!this.f26305d && this.f26304c != null) {
            boolean z = false;
            if (this.f26306f == -1) {
                if (C9616k.m19156h().mo17477b() == null || !C9616k.m19156h().mo17477b().getLogTypeSwitch("upload_crash_crash")) {
                    this.f26306f = 0;
                } else {
                    this.f26306f = 1;
                }
            }
            if (this.f26306f == 1) {
                z = true;
            }
            for (C9643b b : this.f26304c.values()) {
                mo17483b(b, z);
            }
            for (C9643b a : this.f26304c.values()) {
                mo17480a(a, z);
            }
            this.f26305d = true;
            this.f26304c = null;
            NativeImpl.m19475d();
        }
    }

    /* renamed from: e */
    public void mo17488e() {
        File[] listFiles = C9705m.m19400e(this.f26302a).listFiles();
        if (listFiles != null) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                if (file.getName().endsWith(".atmp")) {
                    C9545a.m18940a().mo17350a(file.getAbsolutePath());
                } else {
                    try {
                        C9587d e = C9695g.m19365e(file.getAbsolutePath());
                        if (e != null) {
                            if (e.f26152b != null) {
                                e.f26152b.put("upload_scene", "launch_scan");
                            }
                            if (C9668b.m19286a(C9668b.m19283a(), e.f26156f, e.f26155e, e.f26157g, e.f26158h)) {
                                C9695g.m19357a(file);
                                C9695g.m19358a(e.f26153c);
                            }
                        } else {
                            C9695g.m19357a(file);
                        }
                    } catch (Throwable th) {
                        C9577e.m18999a().mo17384a("NPTH_CATCH", th);
                    }
                }
                i++;
            }
        }
    }

    private C9638c(Context context) {
        this.f26302a = context;
    }

    /* renamed from: a */
    private static boolean m19223a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a A[SYNTHETIC, Splitter:B:16:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0097  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject m19221a(com.bytedance.crash.nativecrash.C9721c r4) {
        /*
            org.json.JSONObject r0 = r4.mo17548c()
            if (r0 == 0) goto L_0x000c
            int r1 = r0.length()
            if (r1 != 0) goto L_0x00da
        L_0x000c:
            com.bytedance.crash.k.b r0 = com.bytedance.crash.C9616k.m19156h()
            boolean r0 = r0.f26299l
            r1 = 0
            if (r0 == 0) goto L_0x0036
            com.bytedance.crash.k.a r0 = com.bytedance.crash.C9616k.m19147a()
            java.util.Map r0 = r0.mo17446a()
            java.lang.String r2 = "channel"
            java.lang.Object r0 = r0.get(r2)
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "unknown"
            goto L_0x002c
        L_0x0028:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x002c:
            java.lang.String r2 = "local_test"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r2 = 0
            if (r0 == 0) goto L_0x0097
            com.bytedance.crash.nativecrash.c$b r0 = r4.f26451a     // Catch:{ Throwable -> 0x0089 }
            java.io.File r0 = r0.f26457d     // Catch:{ Throwable -> 0x0089 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Throwable -> 0x0089 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0089 }
            r1.<init>()     // Catch:{ Throwable -> 0x0089 }
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Throwable -> 0x0089 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Throwable -> 0x0089 }
            r1.append(r3)     // Catch:{ Throwable -> 0x0089 }
            java.lang.String r3 = "/localDebug"
            r1.append(r3)     // Catch:{ Throwable -> 0x0089 }
            java.lang.String r3 = "/"
            r1.append(r3)     // Catch:{ Throwable -> 0x0089 }
            android.content.Context r3 = com.bytedance.crash.C9616k.m19154f()     // Catch:{ Throwable -> 0x0089 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Throwable -> 0x0089 }
            r1.append(r3)     // Catch:{ Throwable -> 0x0089 }
            java.lang.String r3 = "/"
            r1.append(r3)     // Catch:{ Throwable -> 0x0089 }
            com.bytedance.crash.nativecrash.c$b r3 = r4.f26451a     // Catch:{ Throwable -> 0x0089 }
            java.io.File r3 = r3.f26457d     // Catch:{ Throwable -> 0x0089 }
            java.lang.String r3 = r3.getName()     // Catch:{ Throwable -> 0x0089 }
            r1.append(r3)     // Catch:{ Throwable -> 0x0089 }
            java.lang.String r3 = ".zip"
            r1.append(r3)     // Catch:{ Throwable -> 0x0089 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0089 }
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x0089 }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x0089 }
            com.bytedance.crash.p555n.C9695g.m19355a(r1, r3)     // Catch:{ Throwable -> 0x0089 }
            goto L_0x0093
        L_0x0089:
            r0 = move-exception
            com.bytedance.crash.f r1 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r3 = "NPTH_CATCH"
            r1.mo17384a(r3, r0)
        L_0x0093:
            r4.mo17554j()
            return r2
        L_0x0097:
            com.bytedance.crash.nativecrash.c$b r0 = r4.f26451a
            if (r0 == 0) goto L_0x00a3
            com.bytedance.crash.nativecrash.c$b r0 = r4.f26451a
            com.bytedance.crash.nativecrash.a r0 = r0.f26455b
            boolean r1 = r0.mo17543a()
        L_0x00a3:
            if (r1 != 0) goto L_0x00ac
            r4.mo17549d()
            r4.mo17554j()
            return r2
        L_0x00ac:
            boolean r0 = r4.mo17551f()
            if (r0 != 0) goto L_0x00b6
            r4.mo17554j()
            return r2
        L_0x00b6:
            com.bytedance.crash.nativecrash.c$b r0 = r4.f26451a
            java.io.File r0 = r0.f26457d
            java.io.File r0 = com.bytedance.crash.p555n.C9705m.m19405h(r0)
            com.bytedance.crash.d.a r1 = com.bytedance.crash.p542d.C9572a.m18984a()
            java.lang.String r0 = r0.getAbsolutePath()
            boolean r0 = r1.mo17370a(r0)
            if (r0 == 0) goto L_0x00d0
            r4.mo17554j()
            return r2
        L_0x00d0:
            r4.mo17549d()
            r4.mo17550e()
            org.json.JSONObject r0 = r4.mo17553i()
        L_0x00da:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p551k.C9638c.m19221a(com.bytedance.crash.nativecrash.c):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0087 A[Catch:{ Throwable -> 0x001f }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0095 A[Catch:{ Throwable -> 0x001f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099 A[Catch:{ Throwable -> 0x001f }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.crash.p546f.C9587d m19224b(java.io.File r12) {
        /*
            r11 = this;
            r0 = 0
            boolean r1 = r12.isFile()     // Catch:{ Throwable -> 0x0193 }
            if (r1 == 0) goto L_0x0022
            com.bytedance.crash.f.d r1 = com.bytedance.crash.p555n.C9695g.m19363d(r12)     // Catch:{ Throwable -> 0x0193 }
            org.json.JSONObject r0 = r1.f26152b     // Catch:{ Throwable -> 0x001f }
            if (r0 == 0) goto L_0x001a
            org.json.JSONObject r0 = r1.f26152b     // Catch:{ Throwable -> 0x001f }
            java.lang.String r2 = "upload_scene"
            java.lang.String r3 = "simple_crash"
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x01a3 }
            goto L_0x01a3
        L_0x001a:
            com.bytedance.crash.p555n.C9695g.m19357a(r12)     // Catch:{ Throwable -> 0x001f }
            goto L_0x01a3
        L_0x001f:
            r0 = move-exception
            goto L_0x0197
        L_0x0022:
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x0193 }
            java.lang.String r2 = r12.getName()     // Catch:{ Throwable -> 0x0193 }
            r1.<init>(r12, r2)     // Catch:{ Throwable -> 0x0193 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Throwable -> 0x0193 }
            com.bytedance.crash.f.d r1 = com.bytedance.crash.p555n.C9695g.m19364d(r1)     // Catch:{ Throwable -> 0x0193 }
            if (r1 != 0) goto L_0x003a
            com.bytedance.crash.f.d r2 = com.bytedance.crash.p555n.C9695g.m19361c(r12)     // Catch:{ Throwable -> 0x001f }
            r1 = r2
        L_0x003a:
            if (r1 == 0) goto L_0x018f
            org.json.JSONObject r2 = r1.f26152b     // Catch:{ Throwable -> 0x001f }
            if (r2 == 0) goto L_0x018f
            org.json.JSONObject r2 = r1.f26152b     // Catch:{ Throwable -> 0x001f }
            java.lang.String r3 = r12.getName()     // Catch:{ Throwable -> 0x001f }
            r4 = 1
            if (r2 != 0) goto L_0x004f
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x001f }
            if (r5 != 0) goto L_0x007b
        L_0x004f:
            java.lang.String r5 = "launch_"
            boolean r5 = r3.contains(r5)     // Catch:{ Throwable -> 0x001f }
            if (r5 == 0) goto L_0x005a
            com.bytedance.crash.d r3 = com.bytedance.crash.C9571d.LAUNCH     // Catch:{ Throwable -> 0x001f }
            goto L_0x007c
        L_0x005a:
            java.lang.String r5 = "anr_"
            boolean r5 = r3.contains(r5)     // Catch:{ Throwable -> 0x001f }
            if (r5 == 0) goto L_0x0065
            com.bytedance.crash.d r3 = com.bytedance.crash.C9571d.ANR     // Catch:{ Throwable -> 0x001f }
            goto L_0x007c
        L_0x0065:
            java.lang.String r5 = "java_"
            boolean r3 = r3.contains(r5)     // Catch:{ Throwable -> 0x001f }
            if (r3 == 0) goto L_0x007b
            java.lang.String r3 = "is_dart"
            int r3 = r2.optInt(r3)     // Catch:{ Throwable -> 0x001f }
            if (r3 != r4) goto L_0x0078
            com.bytedance.crash.d r3 = com.bytedance.crash.C9571d.DART     // Catch:{ Throwable -> 0x001f }
            goto L_0x007c
        L_0x0078:
            com.bytedance.crash.d r3 = com.bytedance.crash.C9571d.JAVA     // Catch:{ Throwable -> 0x001f }
            goto L_0x007c
        L_0x007b:
            r3 = r0
        L_0x007c:
            java.lang.String r5 = "header"
            org.json.JSONObject r5 = r2.optJSONObject(r5)     // Catch:{ Throwable -> 0x001f }
            com.bytedance.crash.d r6 = com.bytedance.crash.C9571d.LAUNCH     // Catch:{ Throwable -> 0x001f }
            r7 = 0
            if (r3 != r6) goto L_0x0093
            java.lang.String r3 = "data"
            java.lang.Object r2 = r2.opt(r3)     // Catch:{ Throwable -> 0x001f }
            org.json.JSONArray r2 = (org.json.JSONArray) r2     // Catch:{ Throwable -> 0x001f }
            org.json.JSONObject r2 = r2.optJSONObject(r7)     // Catch:{ Throwable -> 0x001f }
        L_0x0093:
            if (r2 != 0) goto L_0x0099
            com.bytedance.crash.p555n.C9695g.m19357a(r12)     // Catch:{ Throwable -> 0x001f }
            return r0
        L_0x0099:
            if (r5 != 0) goto L_0x00ab
            android.content.Context r3 = r11.f26302a     // Catch:{ Throwable -> 0x001f }
            java.lang.String r5 = "crash_time"
            r8 = 0
            long r5 = r2.optLong(r5, r8)     // Catch:{ Throwable -> 0x001f }
            com.bytedance.crash.f.c r3 = com.bytedance.crash.p546f.C9586c.m19048a(r3, r5)     // Catch:{ Throwable -> 0x001f }
            org.json.JSONObject r5 = r3.f26149a     // Catch:{ Throwable -> 0x001f }
        L_0x00ab:
            java.lang.String r3 = "sdk_version_name"
            java.lang.String r0 = r5.optString(r3, r0)     // Catch:{ Throwable -> 0x001f }
            java.lang.String r3 = "filters"
            java.lang.String r6 = "sdk_version"
            if (r0 != 0) goto L_0x00b9
            java.lang.String r0 = "3.1.2-rc.1-oversea"
        L_0x00b9:
            com.bytedance.crash.p546f.C9584a.m19013a(r2, r3, r6, r0)     // Catch:{ Throwable -> 0x001f }
            java.lang.String r0 = "logcat"
            org.json.JSONArray r0 = r2.optJSONArray(r0)     // Catch:{ Throwable -> 0x001f }
            if (r0 == 0) goto L_0x00ca
            int r0 = r0.length()     // Catch:{ Throwable -> 0x001f }
            if (r0 != 0) goto L_0x00cb
        L_0x00ca:
            r7 = 1
        L_0x00cb:
            if (r7 == 0) goto L_0x00d6
            java.lang.String r0 = "logcat"
            org.json.JSONArray r3 = com.bytedance.crash.p551k.C9644d.m19235a(r12)     // Catch:{ Throwable -> 0x001f }
            r2.put(r0, r3)     // Catch:{ Throwable -> 0x001f }
        L_0x00d6:
            java.lang.String r0 = "filters"
            java.lang.String r3 = "has_logcat"
            java.lang.String r6 = "logcat"
            boolean r6 = com.bytedance.crash.p555n.C9698j.m19374a(r2, r6)     // Catch:{ Throwable -> 0x001f }
            r4 = r4 ^ r6
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x001f }
            com.bytedance.crash.p546f.C9584a.m19013a(r2, r0, r3, r4)     // Catch:{ Throwable -> 0x001f }
            java.lang.String r0 = "filters"
            java.lang.String r3 = "memory_leak"
            boolean r4 = com.bytedance.crash.p546f.C9584a.m19019b(r2)     // Catch:{ Throwable -> 0x001f }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x001f }
            com.bytedance.crash.p546f.C9584a.m19013a(r2, r0, r3, r4)     // Catch:{ Throwable -> 0x001f }
            java.lang.String r0 = "filters"
            java.lang.String r3 = "is_64_devices"
            boolean r4 = com.bytedance.crash.p546f.C9586c.m19051a()     // Catch:{ Throwable -> 0x001f }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x001f }
            com.bytedance.crash.p546f.C9584a.m19013a(r2, r0, r3, r4)     // Catch:{ Throwable -> 0x001f }
            java.lang.String r0 = "filters"
            java.lang.String r3 = "is_64_runtime"
            boolean r4 = com.bytedance.crash.nativecrash.NativeImpl.m19472b()     // Catch:{ Throwable -> 0x001f }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x001f }
            com.bytedance.crash.p546f.C9584a.m19013a(r2, r0, r3, r4)     // Catch:{ Throwable -> 0x001f }
            java.lang.String r0 = "filters"
            java.lang.String r3 = "is_x86_devices"
            boolean r4 = com.bytedance.crash.p546f.C9586c.m19053b()     // Catch:{ Throwable -> 0x001f }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x001f }
            com.bytedance.crash.p546f.C9584a.m19013a(r2, r0, r3, r4)     // Catch:{ Throwable -> 0x001f }
            java.lang.String r0 = "filters"
            java.lang.String r3 = "has_meminfo_file"
            boolean r4 = com.bytedance.crash.p546f.C9584a.m19017a(r2)     // Catch:{ Throwable -> 0x001f }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x001f }
            com.bytedance.crash.p546f.C9584a.m19013a(r2, r0, r3, r4)     // Catch:{ Throwable -> 0x001f }
            java.lang.String r0 = "filters"
            java.lang.String r3 = "is_root"
            boolean r4 = com.bytedance.crash.nativecrash.C9721c.m19482k()     // Catch:{ Throwable -> 0x001f }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x001f }
            com.bytedance.crash.p546f.C9584a.m19013a(r2, r0, r3, r4)     // Catch:{ Throwable -> 0x001f }
            boolean r0 = com.bytedance.crash.p546f.C9586c.m19055c(r5)     // Catch:{ Throwable -> 0x001f }
            if (r0 == 0) goto L_0x0151
            java.lang.String r0 = "filters"
            java.lang.String r3 = "unauthentic_version"
            java.lang.String r4 = "unauthentic_version"
            com.bytedance.crash.p546f.C9584a.m19013a(r2, r0, r3, r4)     // Catch:{ Throwable -> 0x001f }
        L_0x0151:
            java.lang.String r0 = com.bytedance.crash.p546f.C9586c.m19057d(r5)     // Catch:{ Throwable -> 0x001f }
            if (r0 == 0) goto L_0x015e
            java.lang.String r3 = "filters"
            java.lang.String r4 = "dex_err_manifest"
            com.bytedance.crash.p546f.C9584a.m19013a(r2, r3, r4, r0)     // Catch:{ Throwable -> 0x001f }
        L_0x015e:
            java.lang.String r0 = "launch_did"
            android.content.Context r3 = r11.f26302a     // Catch:{ Throwable -> 0x001f }
            java.lang.String r3 = com.bytedance.crash.p550j.C9613a.m19141a(r3)     // Catch:{ Throwable -> 0x001f }
            r2.put(r0, r3)     // Catch:{ Throwable -> 0x001f }
            java.lang.String r0 = "crash_uuid"
            java.lang.String r3 = r12.getName()     // Catch:{ Throwable -> 0x001f }
            r2.put(r0, r3)     // Catch:{ Throwable -> 0x001f }
            java.lang.String r0 = "storage"
            java.lang.Object r0 = r2.opt(r0)     // Catch:{ Throwable -> 0x001f }
            if (r0 != 0) goto L_0x0185
            android.content.Context r0 = com.bytedance.crash.C9616k.m19154f()     // Catch:{ Throwable -> 0x001f }
            org.json.JSONObject r0 = com.bytedance.crash.p555n.C9715u.m19452a(r0)     // Catch:{ Throwable -> 0x001f }
            com.bytedance.crash.p546f.C9584a.m19016a(r2, r0)     // Catch:{ Throwable -> 0x001f }
        L_0x0185:
            org.json.JSONObject r0 = r1.f26152b     // Catch:{ Throwable -> 0x001f }
            java.lang.String r2 = "upload_scene"
            java.lang.String r3 = "launch_scan"
            r0.put(r2, r3)     // Catch:{ Throwable -> 0x001f }
            goto L_0x01a3
        L_0x018f:
            com.bytedance.crash.p555n.C9695g.m19357a(r12)     // Catch:{ Throwable -> 0x001f }
            goto L_0x01a3
        L_0x0193:
            r1 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
        L_0x0197:
            com.bytedance.crash.p555n.C9695g.m19357a(r12)
            com.bytedance.crash.f r12 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r2 = "NPTH_CATCH"
            r12.mo17384a(r2, r0)
        L_0x01a3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p551k.C9638c.m19224b(java.io.File):com.bytedance.crash.f.d");
    }

    /* renamed from: a */
    public void mo17481a(HashMap<String, C9643b> hashMap, C9643b bVar) {
        File[] listFiles = C9705m.m19396c(this.f26302a).listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                try {
                    if (!file.isDirectory()) {
                        C9695g.m19357a(file);
                    } else if (file.getName().endsWith("U")) {
                        String name = file.getName();
                        C9643b bVar2 = (C9643b) hashMap.get(name);
                        if (bVar2 == null) {
                            bVar2 = new C9643b(name);
                            hashMap.put(name, bVar2);
                        }
                        bVar2.f26318c.add(new C9642a(file, C9571d.NATIVE));
                    } else {
                        bVar.f26318c.add(new C9642a(file, C9571d.NATIVE));
                    }
                } catch (Throwable th) {
                    C9577e.m18999a().mo17384a("NPTH_CATCH", th);
                    C9695g.m19357a(file);
                }
                i++;
            }
        }
    }

    /* renamed from: b */
    public void mo17484b(HashMap<String, C9643b> hashMap, C9643b bVar) {
        File[] listFiles = C9705m.m19391a(this.f26302a).listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles, Collections.reverseOrder());
            for (File file : listFiles) {
                try {
                    if (C9572a.m18984a().mo17370a(file.getAbsolutePath())) {
                        C9695g.m19357a(file);
                    } else if (!C9695g.m19367f(file)) {
                        if (!C9599a.m19103a().f26181c.containsKey(file.getName())) {
                            if (file.isFile()) {
                                C9695g.m19357a(file);
                            } else {
                                m19222a(hashMap, bVar, file, file.getName());
                            }
                        }
                    }
                } catch (Throwable th) {
                    C9577e.m18999a().mo17384a("NPTH_CATCH", th);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo17483b(C9643b bVar, boolean z) {
        if (bVar.f26318c.size() > 1 || !bVar.f26318c.isEmpty()) {
            boolean b = C9706n.m19412b(this.f26302a);
            bVar.f26320e = bVar.f26319d;
            C9721c cVar = new C9721c(this.f26302a);
            for (C9642a aVar : bVar.f26318c) {
                File file = aVar.f26313a;
                try {
                    cVar.mo17546a(file);
                    JSONObject a = m19221a(cVar);
                    if (a != null) {
                        if (a.length() != 0) {
                            if (a.length() != 0) {
                                if (!z) {
                                    long optLong = a.optLong("crash_time");
                                    if (bVar.f26320e == null) {
                                        bVar.f26320e = aVar;
                                        bVar.f26321f = true;
                                    } else if (bVar.f26321f || optLong >= bVar.f26320e.f26314b) {
                                        C9584a.m19013a(a, "filters", "aid", String.valueOf(a.optJSONObject("header").opt("aid")));
                                        a.optJSONObject("header").put("aid", 2010);
                                    } else {
                                        bVar.f26320e = aVar;
                                        m19223a(file);
                                        bVar.f26321f = true;
                                    }
                                }
                                C9584a.m19013a(a, "filters", "start_uuid", bVar.f26316a);
                                if (b) {
                                    File a2 = C9705m.m19392a(file);
                                    C9667a.m19271a();
                                    if (C9667a.m19273a(a, a2) && !cVar.mo17554j()) {
                                        cVar.mo17552g();
                                    }
                                }
                            }
                        }
                    }
                    cVar.mo17554j();
                } catch (Throwable th) {
                    C9577e.m18999a().mo17384a("NPTH_CATCH", th);
                    C9695g.m19357a(file);
                }
            }
            return;
        }
        bVar.f26320e = bVar.f26319d;
    }

    /* renamed from: c */
    public void mo17486c(HashMap<String, C9643b> hashMap, C9643b bVar) {
        File[] listFiles = C9705m.m19393b(this.f26302a).listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File file : listFiles) {
                try {
                    if (file.getName().endsWith("logcat.txt")) {
                        file.delete();
                    } else if (C9572a.m18984a().mo17370a(file.getAbsolutePath())) {
                        C9695g.m19357a(file);
                    } else if (!C9695g.m19367f(file)) {
                        if (!C9599a.m19103a().f26182d.containsKey(file.getName())) {
                            m19222a(hashMap, bVar, file, file.getName().substring(file.getName().indexOf("_") + 1));
                        }
                    }
                } catch (Throwable th) {
                    C9577e.m18999a().mo17384a("NPTH_CATCH", th);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17480a(C9643b bVar, boolean z) {
        JSONObject jSONObject;
        if (!bVar.f26317b.isEmpty()) {
            if (bVar.f26320e == null) {
                bVar.f26320e = bVar.f26319d;
            }
            for (C9642a aVar : bVar.f26317b) {
                try {
                    File file = aVar.f26313a;
                    C9571d dVar = aVar.f26315c;
                    C9587d b = m19224b(file);
                    if (b == null) {
                        C9695g.m19357a(file);
                    } else {
                        JSONObject jSONObject2 = b.f26152b;
                        if (jSONObject2 == null) {
                            C9695g.m19357a(file);
                        } else {
                            JSONObject optJSONObject = jSONObject2.optJSONObject("header");
                            if (optJSONObject == null) {
                                C9695g.m19357a(file);
                            } else {
                                if (dVar == C9571d.LAUNCH) {
                                    jSONObject = ((JSONArray) jSONObject2.opt("data")).optJSONObject(0);
                                } else {
                                    jSONObject = jSONObject2;
                                }
                                if (!z && bVar.f26320e != aVar) {
                                    C9584a.m19013a(jSONObject, "filters", "aid", String.valueOf(String.valueOf(optJSONObject.opt("aid"))));
                                    optJSONObject.put("aid", 2010);
                                }
                                C9584a.m19013a(jSONObject, "filters", "start_uuid", bVar.f26316a);
                                C9589a a = C9590b.m19073a(dVar, C9568a.f26101i, jSONObject2);
                                C9591c.m19083a(a);
                                C9589a eventType = a.clone().eventType(C9568a.f26102j);
                                C9683j a2 = C9668b.m19281a(b.f26151a, jSONObject2.toString(), b.f26154d);
                                if (a2.mo17529a()) {
                                    if (!C9695g.m19357a(file)) {
                                        C9572a.m18984a().mo17369a(C9573a.m18989a(file.getAbsolutePath()));
                                    }
                                    if (eventType != null) {
                                        C9591c.m19083a(eventType.state(0));
                                    }
                                } else if (eventType != null) {
                                    C9591c.m19083a(eventType.state(a2.f26408a).errorInfo(a2.f26409b));
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    C9577e.m18999a().mo17384a("NPTH_CATCH", th);
                    C9695g.m19357a(aVar.f26313a);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
        if (r0.equals("java") == false) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m19222a(java.util.HashMap<java.lang.String, com.bytedance.crash.p551k.C9638c.C9643b> r10, com.bytedance.crash.p551k.C9638c.C9643b r11, java.io.File r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "U"
            boolean r0 = r13.endsWith(r0)
            if (r0 == 0) goto L_0x012d
            java.lang.String r0 = "_"
            java.lang.String[] r0 = r13.split(r0)
            int r1 = r0.length
            r2 = 4
            if (r1 >= r2) goto L_0x003b
            java.util.List<com.bytedance.crash.k.c$a> r10 = r11.f26317b
            com.bytedance.crash.k.c$a r11 = new com.bytedance.crash.k.c$a
            com.bytedance.crash.d r0 = com.bytedance.crash.C9571d.JAVA
            r11.<init>(r12, r0)
            r10.add(r11)
            com.bytedance.crash.f r10 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r11 = "NPTH_CATCH"
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "err format uuid:"
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            r10.mo17384a(r11, r12)
            return
        L_0x003b:
            r1 = 0
            r2 = r0[r1]     // Catch:{ Throwable -> 0x0104 }
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ Throwable -> 0x0104 }
            r4 = 0
            r5 = 2
            r6 = r0[r5]
            java.lang.String r7 = "U"
            boolean r7 = r6.endsWith(r7)
            if (r7 != 0) goto L_0x0077
            java.util.List<com.bytedance.crash.k.c$a> r10 = r11.f26317b
            com.bytedance.crash.k.c$a r11 = new com.bytedance.crash.k.c$a
            com.bytedance.crash.d r0 = com.bytedance.crash.C9571d.JAVA
            r11.<init>(r12, r0)
            r10.add(r11)
            com.bytedance.crash.f r10 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r11 = "NPTH_CATCH"
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "err format nativeUUID:"
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            r10.mo17384a(r11, r12)
            return
        L_0x0077:
            r11 = 1
            r0 = r0[r11]
            r7 = -1
            int r8 = r0.hashCode()
            r9 = -1109843021(0xffffffffbdd923b3, float:-0.10602512)
            if (r8 == r9) goto L_0x00a2
            r1 = 96741(0x179e5, float:1.35563E-40)
            if (r8 == r1) goto L_0x0098
            r1 = 3254818(0x31aa22, float:4.560971E-39)
            if (r8 == r1) goto L_0x008f
            goto L_0x00ac
        L_0x008f:
            java.lang.String r1 = "java"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ac
            goto L_0x00ad
        L_0x0098:
            java.lang.String r11 = "anr"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L_0x00ac
            r11 = 2
            goto L_0x00ad
        L_0x00a2:
            java.lang.String r11 = "launch"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L_0x00ac
            r11 = 0
            goto L_0x00ad
        L_0x00ac:
            r11 = -1
        L_0x00ad:
            switch(r11) {
                case 0: goto L_0x00b7;
                case 1: goto L_0x00b4;
                case 2: goto L_0x00b1;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            goto L_0x00b9
        L_0x00b1:
            com.bytedance.crash.d r4 = com.bytedance.crash.C9571d.ANR
            goto L_0x00b9
        L_0x00b4:
            com.bytedance.crash.d r4 = com.bytedance.crash.C9571d.JAVA
            goto L_0x00b9
        L_0x00b7:
            com.bytedance.crash.d r4 = com.bytedance.crash.C9571d.LAUNCH
        L_0x00b9:
            if (r4 != 0) goto L_0x00d9
            com.bytedance.crash.d r4 = com.bytedance.crash.C9571d.JAVA
            com.bytedance.crash.f r11 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r0 = "NPTH_CATCH"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "err format crashType:"
            r5.<init>(r7)
            r5.append(r13)
            java.lang.String r13 = r5.toString()
            r1.<init>(r13)
            r11.mo17384a(r0, r1)
        L_0x00d9:
            java.lang.Object r11 = r10.get(r6)
            com.bytedance.crash.k.c$b r11 = (com.bytedance.crash.p551k.C9638c.C9643b) r11
            if (r11 != 0) goto L_0x00e9
            com.bytedance.crash.k.c$b r11 = new com.bytedance.crash.k.c$b
            r11.<init>(r6)
            r10.put(r6, r11)
        L_0x00e9:
            com.bytedance.crash.k.c$a r10 = new com.bytedance.crash.k.c$a
            r10.<init>(r12, r2, r4)
            com.bytedance.crash.k.c$a r12 = r11.f26319d
            if (r12 == 0) goto L_0x00fc
            com.bytedance.crash.k.c$a r12 = r11.f26319d
            long r12 = r12.f26314b
            long r0 = r10.f26314b
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00fe
        L_0x00fc:
            r11.f26319d = r10
        L_0x00fe:
            java.util.List<com.bytedance.crash.k.c$a> r11 = r11.f26317b
            r11.add(r10)
            return
        L_0x0104:
            java.util.List<com.bytedance.crash.k.c$a> r10 = r11.f26317b
            com.bytedance.crash.k.c$a r11 = new com.bytedance.crash.k.c$a
            com.bytedance.crash.d r0 = com.bytedance.crash.C9571d.JAVA
            r11.<init>(r12, r0)
            r10.add(r11)
            com.bytedance.crash.f r10 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r11 = "NPTH_CATCH"
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "err format crashTime:"
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            r10.mo17384a(r11, r12)
            return
        L_0x012d:
            java.util.List<com.bytedance.crash.k.c$a> r10 = r11.f26317b
            com.bytedance.crash.k.c$a r11 = new com.bytedance.crash.k.c$a
            com.bytedance.crash.d r13 = com.bytedance.crash.C9571d.JAVA
            r11.<init>(r12, r13)
            r10.add(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p551k.C9638c.m19222a(java.util.HashMap, com.bytedance.crash.k.c$b, java.io.File, java.lang.String):void");
    }
}
