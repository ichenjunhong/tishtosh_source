package com.bytedance.crash.p540b;

import android.content.Context;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.C9598h;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p551k.C9647e;
import com.bytedance.crash.p551k.C9649f;
import com.bytedance.crash.p551k.p552a.C9619b;
import com.bytedance.crash.p555n.C9685a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.a */
public final class C9553a {

    /* renamed from: d */
    static volatile boolean f26033d = false;

    /* renamed from: j */
    static volatile boolean f26034j = true;

    /* renamed from: a */
    public C9555b f26035a;

    /* renamed from: b */
    public final Context f26036b;

    /* renamed from: c */
    public volatile boolean f26037c;

    /* renamed from: e */
    public long f26038e = -1;

    /* renamed from: f */
    final Object f26039f = new Object();

    /* renamed from: g */
    public volatile boolean f26040g;

    /* renamed from: h */
    public long f26041h = -1;

    /* renamed from: i */
    final Runnable f26042i = new Runnable() {
        public final void run() {
            try {
                C9553a.this.mo17357a(200, 25);
            } catch (Throwable th) {
                C9577e.m18999a().mo17384a("NPTH_CATCH", th);
            }
        }
    };

    /* renamed from: k */
    private boolean f26043k = true;

    /* renamed from: l */
    private JSONObject f26044l;

    /* renamed from: m */
    private JSONObject f26045m;

    /* renamed from: n */
    private JSONArray f26046n;

    /* renamed from: o */
    private JSONObject f26047o;

    /* renamed from: p */
    private long f26048p = -1;

    /* renamed from: q */
    private JSONArray f26049q;

    /* renamed from: r */
    private JSONArray f26050r;

    /* renamed from: s */
    private boolean f26051s;

    /* renamed from: a */
    private static String m18951a(float f) {
        return f <= 0.0f ? "0%" : f <= 0.1f ? "0% - 10%" : f <= 0.3f ? "10% - 30%" : f <= 0.6f ? "30% - 60%" : f <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    /* renamed from: a */
    private boolean m18959a() {
        boolean z = !C9685a.m19315a(this.f26036b);
        if (!z) {
            return z;
        }
        if (SystemClock.uptimeMillis() - C9619b.m19170a().f26261q <= 2000) {
            return false;
        }
        return z;
    }

    /* renamed from: a */
    private void m18958a(JSONArray jSONArray) {
        if (jSONArray != null) {
            this.f26044l = null;
            this.f26047o = null;
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            String str = null;
            boolean z = false;
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    switch (z) {
                        case false:
                            if (optString.startsWith("DALVIK THREADS") || optString.startsWith("suspend") || optString.startsWith("\"")) {
                                z = true;
                            }
                            jSONArray3.put(optString);
                            break;
                        case true:
                            if (!optString.contains(" prio=")) {
                                if (!TextUtils.isEmpty(str)) {
                                    jSONArray4.put(optString);
                                    break;
                                } else {
                                    jSONArray3.put(optString);
                                    break;
                                }
                            } else {
                                if (jSONArray4.length() > 0 && !TextUtils.isEmpty(str)) {
                                    if (this.f26044l != null || !"main".equals(str)) {
                                        jSONArray2.put(m18953a(str, jSONArray4));
                                    } else {
                                        this.f26044l = m18961b(jSONArray4);
                                    }
                                }
                                String substring = optString.substring(1, optString.indexOf(34, 1));
                                if (!"main".equals(substring)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(substring);
                                    sb.append("  (");
                                    sb.append(optString.substring(optString.indexOf(34, 2) + 1));
                                    sb.append(" )");
                                    substring = sb.toString();
                                }
                                if (jSONArray4.length() > 0) {
                                    jSONArray4 = new JSONArray();
                                }
                                jSONArray4.put(optString);
                                str = substring;
                                break;
                            }
                    }
                } else {
                    if (jSONArray4.length() > 0 && !TextUtils.isEmpty(str)) {
                        if (this.f26044l != null || !"main".equals(str)) {
                            jSONArray2.put(m18953a(str, jSONArray4));
                        } else {
                            this.f26044l = m18961b(jSONArray4);
                        }
                    }
                    if (jSONArray4.length() > 0) {
                        jSONArray4 = new JSONArray();
                    }
                    str = null;
                }
            }
            if (jSONArray2.length() > 0) {
                this.f26046n = jSONArray3;
                try {
                    this.f26047o = new JSONObject();
                    this.f26047o.put("thread_all_count", jSONArray2.length());
                    this.f26047o.put("thread_stacks", jSONArray2);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x029c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x02f6 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0285 A[Catch:{ Throwable -> 0x0291, Throwable -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0288 A[Catch:{ Throwable -> 0x0291, Throwable -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02d4 A[Catch:{ Throwable -> 0x02f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02d5 A[Catch:{ Throwable -> 0x02f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e4 A[SYNTHETIC, Splitter:B:92:0x01e4] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x025f A[Catch:{ Throwable -> 0x0291, Throwable -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0262 A[Catch:{ Throwable -> 0x0291, Throwable -> 0x029c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo17357a(int r20, int r21) {
        /*
            r19 = this;
            r1 = r19
            boolean r0 = com.bytedance.crash.p540b.C9558d.m18966a()
            long r2 = android.os.SystemClock.uptimeMillis()
            boolean r4 = r1.f26040g
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L_0x007a
            r1.f26040g = r5
            long r7 = r1.f26041h
            r9 = -1
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0077
            long r7 = r1.f26041h
            long r7 = r2 - r7
            r9 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0077
            com.bytedance.crash.C9577e.m18999a()
            java.lang.String r11 = "ANR_SIGNAL_LOSE"
            java.lang.String r10 = "EnsureNotReachHere"
            long r7 = android.os.SystemClock.uptimeMillis()
            long r12 = com.bytedance.crash.C9583f.f26140a     // Catch:{ Throwable -> 0x0077 }
            r4 = 0
            long r12 = r7 - r12
            r14 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x003b
            goto L_0x0077
        L_0x003b:
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ Throwable -> 0x0077 }
            java.lang.Thread r4 = r4.getThread()     // Catch:{ Throwable -> 0x0077 }
            java.lang.StackTraceElement[] r4 = r4.getStackTrace()     // Catch:{ Throwable -> 0x0077 }
            if (r4 == 0) goto L_0x0077
            int r9 = r4.length     // Catch:{ Throwable -> 0x0077 }
            if (r9 != 0) goto L_0x004d
            goto L_0x0077
        L_0x004d:
            android.os.Looper r9 = android.os.Looper.getMainLooper()     // Catch:{ Throwable -> 0x0077 }
            android.os.Looper r12 = android.os.Looper.myLooper()     // Catch:{ Throwable -> 0x0077 }
            if (r9 != r12) goto L_0x005a
            r9 = 5
            r12 = 5
            goto L_0x005b
        L_0x005a:
            r12 = 0
        L_0x005b:
            boolean r9 = com.bytedance.crash.C9583f.m19009b(r11)     // Catch:{ Throwable -> 0x0077 }
            if (r9 == 0) goto L_0x0067
            com.bytedance.crash.C9583f.f26140a = r7     // Catch:{ Throwable -> 0x0077 }
            com.bytedance.crash.p545e.C9578a.m19005a(r4, r6, r11, r10, r12)     // Catch:{ Throwable -> 0x0077 }
            goto L_0x0077
        L_0x0067:
            com.bytedance.crash.k.b r7 = com.bytedance.crash.C9616k.m19156h()     // Catch:{ Throwable -> 0x0077 }
            com.bytedance.services.slardar.config.IConfigManager r7 = r7.mo17477b()     // Catch:{ Throwable -> 0x0077 }
            if (r7 != 0) goto L_0x0077
            r8 = 0
            r7 = r4
            r9 = r11
            com.bytedance.crash.p545e.C9578a.m19006a(r7, r8, r9, r10, r11, r12)     // Catch:{ Throwable -> 0x0077 }
        L_0x0077:
            r1.m18954a(r2)
        L_0x007a:
            android.content.Context r4 = r1.f26036b
            r7 = 1
            java.lang.String r4 = com.bytedance.crash.p540b.C9557c.m18963a(r4, r7)
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r10 = "normal"
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            r12 = 20000(0x4e20, double:9.8813E-320)
            if (r11 != 0) goto L_0x00d0
            java.lang.Object r11 = r1.f26039f
            monitor-enter(r11)
            monitor-exit(r11)     // Catch:{ all -> 0x00cd }
            org.json.JSONObject r8 = r1.f26044l
            if (r8 == 0) goto L_0x00a6
            long r8 = java.lang.System.currentTimeMillis()
            long r14 = r1.f26038e
            long r8 = r8 - r14
            int r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r11 > 0) goto L_0x00a6
            java.lang.String r8 = "trace_last"
        L_0x00a4:
            r10 = r8
            goto L_0x00af
        L_0x00a6:
            boolean r8 = r1.f26040g
            if (r8 == 0) goto L_0x00af
            r1.f26040g = r5
            java.lang.String r8 = "trace_after"
            goto L_0x00a4
        L_0x00af:
            r1.m18954a(r2)
            org.json.JSONObject r8 = r1.f26044l
            org.json.JSONArray r9 = r1.f26046n
            org.json.JSONArray r11 = r1.f26050r
            org.json.JSONArray r14 = r1.f26049q
            org.json.JSONObject r15 = r1.f26045m
            boolean r7 = r1.f26051s
            long r12 = r1.f26048p
            r1.f26044l = r6
            r1.f26046n = r6
            r1.f26049q = r6
            r1.f26045m = r6
            r1.f26050r = r6
            r17 = 1
            goto L_0x00d9
        L_0x00cd:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00cd }
            throw r0
        L_0x00d0:
            r11 = r6
            r14 = r11
            r15 = r14
            r12 = r8
            r7 = 0
            r17 = 0
            r8 = r15
            r9 = r8
        L_0x00d9:
            boolean r18 = android.text.TextUtils.isEmpty(r4)
            if (r18 == 0) goto L_0x00fc
            org.json.JSONObject r0 = r1.f26044l
            if (r0 == 0) goto L_0x00fb
            long r2 = java.lang.System.currentTimeMillis()
            long r7 = r1.f26038e
            long r2 = r2 - r7
            r7 = 20000(0x4e20, double:9.8813E-320)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fb
            r1.f26044l = r6
            r1.f26046n = r6
            r1.f26049q = r6
            r1.f26045m = r6
            r1.f26050r = r6
            return r5
        L_0x00fb:
            return r5
        L_0x00fc:
            if (r8 != 0) goto L_0x011b
            org.json.JSONArray r16 = com.bytedance.crash.p540b.C9560f.m18975b()     // Catch:{ Throwable -> 0x011a }
            r11 = 100
            org.json.JSONArray r11 = com.bytedance.crash.p540b.C9560f.m18971a(r11, r2)     // Catch:{ Throwable -> 0x0115 }
            org.json.JSONObject r2 = com.bytedance.crash.p540b.C9560f.m18972a(r2)     // Catch:{ Throwable -> 0x0114 }
            boolean r3 = f26034j     // Catch:{ Throwable -> 0x0118 }
            org.json.JSONObject r3 = com.bytedance.crash.p540b.C9557c.m18964a(r3)     // Catch:{ Throwable -> 0x0118 }
            r15 = r2
            r8 = r3
        L_0x0114:
            r14 = r11
        L_0x0115:
            r11 = r16
            goto L_0x011b
        L_0x0118:
            r15 = r2
            goto L_0x0114
        L_0x011a:
        L_0x011b:
            if (r8 == 0) goto L_0x0304
            int r2 = r8.length()
            if (r2 <= 0) goto L_0x0304
            com.bytedance.crash.a.a r2 = com.bytedance.crash.p539a.C9545a.m18940a()     // Catch:{ Throwable -> 0x02fa }
            com.bytedance.crash.d r3 = com.bytedance.crash.C9571d.ANR     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r6 = com.bytedance.crash.C9616k.m19152d()     // Catch:{ Throwable -> 0x02fa }
            r2.mo17348a(r3, r12, r6)     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r2 = "pid"
            int r3 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x02fa }
            r8.put(r2, r3)     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r2 = "package"
            android.content.Context r3 = r1.f26036b     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Throwable -> 0x02fa }
            r8.put(r2, r3)     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r2 = "is_remote_process"
            r8.put(r2, r5)     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r2 = "is_new_stack"
            r3 = 10
            r8.put(r2, r3)     // Catch:{ Throwable -> 0x02fa }
            com.bytedance.crash.f.a r2 = new com.bytedance.crash.f.a     // Catch:{ Throwable -> 0x02fa }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x02fa }
            r3.<init>()     // Catch:{ Throwable -> 0x02fa }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r3 = "data"
            java.lang.String r5 = r8.toString()     // Catch:{ Throwable -> 0x02fa }
            r2.mo17395a(r3, r5)     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r3 = "is_anr"
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ Throwable -> 0x02fa }
            r2.mo17395a(r3, r6)     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r3 = "anrType"
            r2.mo17395a(r3, r10)     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r3 = "history_message"
            r2.mo17395a(r3, r11)     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r3 = "current_message"
            r2.mo17395a(r3, r15)     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r3 = "pending_messages"
            r2.mo17395a(r3, r14)     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r3 = "anr_time"
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x02fa }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Throwable -> 0x02fa }
            r2.mo17395a(r3, r5)     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r3 = "crash_time"
            java.lang.Long r5 = java.lang.Long.valueOf(r12)     // Catch:{ Throwable -> 0x02fa }
            r2.mo17395a(r3, r5)     // Catch:{ Throwable -> 0x02fa }
            com.bytedance.crash.p541c.C9570b.m18983b()     // Catch:{ Throwable -> 0x02fa }
            android.content.Context r3 = r1.f26036b     // Catch:{ Throwable -> 0x02fa }
            org.json.JSONObject r5 = r2.f26141a     // Catch:{ Throwable -> 0x02fa }
            com.bytedance.crash.p555n.C9685a.m19312a(r3, r5)     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r3 = "anr_info"
            r2.mo17395a(r3, r4)     // Catch:{ Throwable -> 0x02fa }
            if (r9 == 0) goto L_0x01ad
            java.lang.String r3 = "dump_trace"
            r2.mo17395a(r3, r9)     // Catch:{ Throwable -> 0x02fa }
        L_0x01ad:
            java.lang.String r3 = "all_thread_stacks"
            org.json.JSONObject r5 = r1.f26047o     // Catch:{ Throwable -> 0x02fa }
            if (r5 == 0) goto L_0x01bf
            org.json.JSONObject r5 = r1.f26047o     // Catch:{ Throwable -> 0x02fa }
            int r5 = r5.length()     // Catch:{ Throwable -> 0x02fa }
            if (r5 != 0) goto L_0x01bc
            goto L_0x01bf
        L_0x01bc:
            org.json.JSONObject r5 = r1.f26047o     // Catch:{ Throwable -> 0x02fa }
            goto L_0x01c4
        L_0x01bf:
            r5 = 0
            org.json.JSONObject r5 = com.bytedance.crash.p555n.C9713t.m19444b(r5)     // Catch:{ Throwable -> 0x02fa }
        L_0x01c4:
            r2.mo17395a(r3, r5)     // Catch:{ Throwable -> 0x02fa }
            com.bytedance.crash.k.a.f r3 = com.bytedance.crash.p551k.p552a.C9628f.m19195a()     // Catch:{ Throwable -> 0x02fa }
            com.bytedance.crash.d r5 = com.bytedance.crash.C9571d.ANR     // Catch:{ Throwable -> 0x02fa }
            com.bytedance.crash.f.a r2 = r3.mo17472a(r5, r2)     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r3 = "is_background"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)     // Catch:{ Throwable -> 0x02fa }
            r2.mo17395a(r3, r5)     // Catch:{ Throwable -> 0x02fa }
            org.json.JSONObject r3 = r2.f26141a     // Catch:{ Throwable -> 0x02fa }
            java.lang.String r5 = "filters"
            org.json.JSONObject r3 = r3.optJSONObject(r5)     // Catch:{ Throwable -> 0x02fa }
            if (r3 != 0) goto L_0x01ee
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x029c }
            r3.<init>()     // Catch:{ Throwable -> 0x029c }
            java.lang.String r5 = "filters"
            r2.mo17395a(r5, r3)     // Catch:{ Throwable -> 0x029c }
        L_0x01ee:
            java.lang.String r5 = "anrType"
            r3.put(r5, r10)     // Catch:{ Throwable -> 0x029c }
            java.lang.String r5 = "npth_force_apm_crash"
            boolean r6 = com.bytedance.crash.p541c.C9570b.m18983b()     // Catch:{ Throwable -> 0x029c }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x029c }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x029c }
            java.lang.String r5 = "sdk_version"
            java.lang.String r6 = "3.1.2-rc.1-oversea"
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x029c }
            java.lang.String r5 = "has_logcat"
            boolean r6 = r2.mo17396a()     // Catch:{ Throwable -> 0x029c }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x029c }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x029c }
            java.lang.String r5 = "memory_leak"
            boolean r6 = r2.mo17405d()     // Catch:{ Throwable -> 0x029c }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x029c }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x029c }
            java.lang.String r5 = "is_64_devices"
            boolean r6 = com.bytedance.crash.p546f.C9586c.m19051a()     // Catch:{ Throwable -> 0x029c }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x029c }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x029c }
            java.lang.String r5 = "is_64_runtime"
            boolean r6 = com.bytedance.crash.nativecrash.NativeImpl.m19472b()     // Catch:{ Throwable -> 0x029c }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x029c }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x029c }
            java.lang.String r5 = "is_x86_devices"
            boolean r6 = com.bytedance.crash.p546f.C9586c.m19053b()     // Catch:{ Throwable -> 0x029c }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x029c }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x029c }
            java.lang.String r5 = "has_meminfo_file"
            org.json.JSONObject r6 = r2.f26141a     // Catch:{ Throwable -> 0x029c }
            boolean r6 = com.bytedance.crash.p546f.C9584a.m19017a(r6)     // Catch:{ Throwable -> 0x029c }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x029c }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x029c }
            java.lang.String r5 = "is_root"
            boolean r6 = com.bytedance.crash.nativecrash.C9721c.m19482k()     // Catch:{ Throwable -> 0x029c }
            if (r6 == 0) goto L_0x0262
            java.lang.String r6 = "true"
            goto L_0x0264
        L_0x0262:
            java.lang.String r6 = "false"
        L_0x0264:
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x029c }
            java.lang.String r5 = "anr_normal_trace"
            boolean r6 = r1.f26040g     // Catch:{ Throwable -> 0x029c }
            r7 = 1
            r6 = r6 ^ r7
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x029c }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x029c }
            java.lang.String r5 = "anr_no_run"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x029c }
            r3.put(r5, r0)     // Catch:{ Throwable -> 0x029c }
            java.lang.String r0 = "crash_after_crash"
            boolean r5 = com.bytedance.crash.C9610j.m19139c()     // Catch:{ Throwable -> 0x029c }
            if (r5 == 0) goto L_0x0288
            java.lang.String r5 = "true"
            goto L_0x028a
        L_0x0288:
            java.lang.String r5 = "false"
        L_0x028a:
            r3.put(r0, r5)     // Catch:{ Throwable -> 0x029c }
            r1.m18956a(r4, r3)     // Catch:{ Throwable -> 0x0291 }
            goto L_0x029c
        L_0x0291:
            r0 = move-exception
            r3 = r0
            com.bytedance.crash.f r0 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ Throwable -> 0x029c }
            java.lang.String r5 = "NPTH_CATCH"
            r0.mo17384a(r5, r3)     // Catch:{ Throwable -> 0x029c }
        L_0x029c:
            com.bytedance.crash.m.a r0 = com.bytedance.crash.p554m.C9667a.m19271a()     // Catch:{ Throwable -> 0x02fa }
            org.json.JSONObject r2 = r2.f26141a     // Catch:{ Throwable -> 0x02fa }
            boolean r3 = r1.f26043k     // Catch:{ Throwable -> 0x02fa }
            if (r2 == 0) goto L_0x02f6
            int r5 = r2.length()     // Catch:{ Throwable -> 0x02fa }
            if (r5 > 0) goto L_0x02ad
            goto L_0x02f6
        L_0x02ad:
            com.bytedance.crash.k.a r5 = com.bytedance.crash.C9616k.m19147a()     // Catch:{ Throwable -> 0x02f6 }
            java.util.Map r5 = r5.mo17446a()     // Catch:{ Throwable -> 0x02f6 }
            java.lang.String r5 = com.bytedance.crash.p554m.C9668b.m19285a(r5)     // Catch:{ Throwable -> 0x02f6 }
            java.io.File r6 = new java.io.File     // Catch:{ Throwable -> 0x02f6 }
            android.content.Context r0 = r0.f26377a     // Catch:{ Throwable -> 0x02f6 }
            java.io.File r0 = com.bytedance.crash.p555n.C9705m.m19391a(r0)     // Catch:{ Throwable -> 0x02f6 }
            com.bytedance.crash.d r7 = com.bytedance.crash.C9571d.ANR     // Catch:{ Throwable -> 0x02f6 }
            java.lang.String r7 = com.bytedance.crash.C9616k.m19148a(r12, r7)     // Catch:{ Throwable -> 0x02f6 }
            r6.<init>(r0, r7)     // Catch:{ Throwable -> 0x02f6 }
            java.lang.String r0 = r6.getName()     // Catch:{ Throwable -> 0x02f6 }
            r7 = 1
            com.bytedance.crash.p555n.C9695g.m19349a(r6, r0, r5, r2, r7)     // Catch:{ Throwable -> 0x02f6 }
            if (r3 != 0) goto L_0x02d5
            goto L_0x02f6
        L_0x02d5:
            java.lang.String r0 = "upload_scene"
            java.lang.String r3 = "direct"
            r2.put(r0, r3)     // Catch:{ Throwable -> 0x02f6 }
            java.lang.String r0 = "crash_uuid"
            java.lang.String r3 = r6.getName()     // Catch:{ Throwable -> 0x02f6 }
            r2.put(r0, r3)     // Catch:{ Throwable -> 0x02f6 }
            java.lang.String r0 = r2.toString()     // Catch:{ Throwable -> 0x02f6 }
            com.bytedance.crash.m.j r0 = com.bytedance.crash.p554m.C9668b.m19279a(r5, r0)     // Catch:{ Throwable -> 0x02f6 }
            boolean r0 = r0.mo17529a()     // Catch:{ Throwable -> 0x02f6 }
            if (r0 == 0) goto L_0x02f6
            com.bytedance.crash.p555n.C9695g.m19357a(r6)     // Catch:{ Throwable -> 0x02f6 }
        L_0x02f6:
            m18955a(r4)     // Catch:{ Throwable -> 0x02fa }
            goto L_0x0304
        L_0x02fa:
            r0 = move-exception
            com.bytedance.crash.f r2 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r3 = "NPTH_CATCH"
            r2.mo17384a(r3, r0)
        L_0x0304:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p540b.C9553a.mo17357a(int, int):boolean");
    }

    /* renamed from: b */
    private static String m18960b(float f) {
        return m18951a(f / 100.0f);
    }

    /* renamed from: b */
    private static JSONObject m18961b(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < jSONArray.length(); i++) {
                sb.append(jSONArray.getString(i));
                sb.append(10);
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public C9553a(Context context) {
        this.f26036b = context;
        if (C9560f.f26062a) {
            C9560f.f26063b = 100;
            C9560f.f26066e = 300;
            C9560f.f26064c = new ArrayList();
            C9647e.m19238a().mo17497b();
            C9647e.m19238a().mo17495a((Printer) new Printer() {
                public final void println(String str) {
                    int i;
                    if (C9560f.f26062a) {
                        C9560f.f26074m = str;
                        if (!C9560f.f26073l) {
                            C9560f.f26073l = true;
                            C9560f.f26076o = Process.myTid();
                            C9560f.f26068g = C9649f.m19246a();
                            C9560f.f26067f = SystemClock.uptimeMillis();
                            Handler handler = new Handler(C9560f.f26068g.getLooper());
                            C9560f.f26071j = handler;
                            handler.postDelayed(new Runnable() {
                                public final void run() {
                                    try {
                                        new Thread("npth-tick") {
                                            /* JADX WARNING: Failed to process nested try/catch */
                                            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000d */
                                            /* JADX WARNING: Removed duplicated region for block: B:6:0x0011 A[Catch:{ Throwable -> 0x004f }] */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public final void run() {
                                                /*
                                                    r7 = this;
                                                    super.run()
                                                    java.lang.Class<com.bytedance.services.apm.api.f> r0 = com.bytedance.services.apm.api.C13223f.class
                                                    com.bytedance.crash.b.f$1 r1 = new com.bytedance.crash.b.f$1     // Catch:{ Throwable -> 0x000d }
                                                    r1.<init>()     // Catch:{ Throwable -> 0x000d }
                                                    com.bytedance.news.common.service.manager.C12401c.m24977a(r0, r1)     // Catch:{ Throwable -> 0x000d }
                                                L_0x000d:
                                                    boolean r0 = com.bytedance.crash.p540b.C9560f.f26062a     // Catch:{ Throwable -> 0x004f }
                                                    if (r0 == 0) goto L_0x004e
                                                    long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x004f }
                                                    boolean r2 = com.bytedance.crash.p540b.C9558d.m18966a()     // Catch:{ Throwable -> 0x004f }
                                                    if (r2 != 0) goto L_0x0021
                                                    long r2 = com.bytedance.crash.p540b.C9560f.m18977d()     // Catch:{ Throwable -> 0x004f }
                                                    com.bytedance.crash.p540b.C9560f.f26077p = r2     // Catch:{ Throwable -> 0x004f }
                                                L_0x0021:
                                                    java.util.concurrent.atomic.AtomicLong r2 = com.bytedance.crash.p540b.C9560f.f26065d     // Catch:{ Throwable -> 0x004f }
                                                    long r3 = com.bytedance.crash.p540b.C9560f.f26067f     // Catch:{ Throwable -> 0x004f }
                                                    r5 = 0
                                                    long r3 = r0 - r3
                                                    long r5 = com.bytedance.crash.p540b.C9560f.f26066e     // Catch:{ Throwable -> 0x004f }
                                                    long r3 = r3 / r5
                                                    r2.set(r3)     // Catch:{ Throwable -> 0x004f }
                                                    long r2 = com.bytedance.crash.p540b.C9560f.f26067f     // Catch:{ Throwable -> 0x004f }
                                                    r4 = 0
                                                    long r0 = r0 - r2
                                                    long r2 = com.bytedance.crash.p540b.C9560f.f26066e     // Catch:{ Throwable -> 0x004f }
                                                    long r0 = r0 % r2
                                                    r2 = 95
                                                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                                                    if (r4 < 0) goto L_0x0046
                                                    java.util.concurrent.atomic.AtomicLong r2 = com.bytedance.crash.p540b.C9560f.f26065d     // Catch:{ Throwable -> 0x004f }
                                                    r2.incrementAndGet()     // Catch:{ Throwable -> 0x004f }
                                                    long r2 = com.bytedance.crash.p540b.C9560f.f26066e     // Catch:{ Throwable -> 0x004f }
                                                    r4 = 1
                                                    long r2 = r2 << r4
                                                    long r2 = r2 - r0
                                                    goto L_0x004a
                                                L_0x0046:
                                                    long r2 = com.bytedance.crash.p540b.C9560f.f26066e     // Catch:{ Throwable -> 0x004f }
                                                    r4 = 0
                                                    long r2 = r2 - r0
                                                L_0x004a:
                                                    android.os.SystemClock.sleep(r2)     // Catch:{ Throwable -> 0x004f }
                                                    goto L_0x000d
                                                L_0x004e:
                                                    return
                                                L_0x004f:
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p540b.C9560f.C95644.C95651.run():void");
                                            }
                                        }.start();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }, C9560f.f26066e);
                        }
                        C9560f.f26078q = C9560f.f26065d.get();
                        if (C9560f.f26079r != -1) {
                            long j = C9560f.f26078q - C9560f.f26079r;
                            if (j <= 0) {
                                C9560f.f26072k++;
                                return;
                            }
                            if (j == 1) {
                                if (C9560f.f26072k > 1) {
                                    i = 7;
                                } else if (C9560f.f26072k == 1) {
                                    i = 3;
                                } else {
                                    i = 0;
                                }
                            } else if (C9560f.f26072k > 1) {
                                i = 5;
                            } else if (C9560f.f26072k == 1) {
                                i = 6;
                            } else {
                                i = 1;
                            }
                            long e = C9560f.m18978e();
                            long uptimeMillis = SystemClock.uptimeMillis();
                            if (!C9560f.f26075n) {
                                C9560f.m18974a(C9560f.m18970a(), e - C9560f.f26069h, uptimeMillis - C9560f.f26070i, j, i, C9560f.f26072k, null);
                            }
                            C9560f.f26069h = e;
                            C9560f.f26070i = uptimeMillis;
                            C9560f.f26072k = 1;
                        }
                    }
                }
            });
            C9647e a = C9647e.m19238a();
            a.f26333f.add(new Printer() {
                public final void println(String str) {
                    int i;
                    C9560f.f26079r = C9560f.f26065d.get();
                    C9560f.f26074m = "no message running";
                    if (C9560f.f26078q > 0) {
                        long j = C9560f.f26079r - C9560f.f26078q;
                        if (j > 0) {
                            long e = C9560f.m18978e();
                            long uptimeMillis = SystemClock.uptimeMillis();
                            if (j == 1 && C9560f.f26072k > 1) {
                                i = 9;
                            } else if (j == 1 && C9560f.f26072k == 1) {
                                i = 2;
                            } else if (j > 1 && C9560f.f26072k > 1) {
                                i = 4;
                            } else if (j <= 1 || C9560f.f26072k != 1) {
                                i = 0;
                            } else {
                                i = 8;
                            }
                            if (!C9560f.f26075n) {
                                C9560f.m18974a(C9560f.m18970a(), e - C9560f.f26069h, uptimeMillis - C9560f.f26070i, j, i, C9560f.f26072k, str);
                            }
                            C9560f.f26069h = e;
                            C9560f.f26070i = uptimeMillis;
                            C9560f.f26072k = 0;
                            C9560f.f26078q = -1;
                        }
                    }
                }
            });
            C9560f.f26069h = C9560f.m18978e();
            C9560f.f26070i = SystemClock.uptimeMillis();
            C9560f.m18969a(C9560f.m18976c());
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x002e */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x009c A[Catch:{ Throwable -> 0x008e, Throwable -> 0x00aa }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18954a(long r7) {
        /*
            r6 = this;
            r0 = -1
            r6.f26041h = r0
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x002e }
            android.content.Context r1 = r6.f26036b     // Catch:{ Throwable -> 0x002e }
            java.io.File r1 = r1.getFilesDir()     // Catch:{ Throwable -> 0x002e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x002e }
            java.lang.String r3 = "has_anr_signal_"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x002e }
            android.content.Context r3 = r6.f26036b     // Catch:{ Throwable -> 0x002e }
            java.lang.String r3 = com.bytedance.crash.p555n.C9685a.m19318c(r3)     // Catch:{ Throwable -> 0x002e }
            java.lang.String r4 = ":"
            java.lang.String r5 = "_"
            java.lang.String r3 = r3.replaceAll(r4, r5)     // Catch:{ Throwable -> 0x002e }
            r2.append(r3)     // Catch:{ Throwable -> 0x002e }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x002e }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x002e }
            r0.delete()     // Catch:{ Throwable -> 0x002e }
        L_0x002e:
            org.json.JSONArray r0 = com.bytedance.crash.p540b.C9560f.m18975b()     // Catch:{ Throwable -> 0x00aa }
            r6.f26050r = r0     // Catch:{ Throwable -> 0x00aa }
            r0 = 100
            org.json.JSONArray r0 = com.bytedance.crash.p540b.C9560f.m18971a(r0, r7)     // Catch:{ Throwable -> 0x00aa }
            r6.f26049q = r0     // Catch:{ Throwable -> 0x00aa }
            org.json.JSONObject r7 = com.bytedance.crash.p540b.C9560f.m18972a(r7)     // Catch:{ Throwable -> 0x00aa }
            r6.f26045m = r7     // Catch:{ Throwable -> 0x00aa }
            boolean r7 = r6.m18959a()     // Catch:{ Throwable -> 0x00aa }
            r6.f26051s = r7     // Catch:{ Throwable -> 0x00aa }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00aa }
            r6.f26038e = r7     // Catch:{ Throwable -> 0x00aa }
            long r7 = r6.f26038e     // Catch:{ Throwable -> 0x00aa }
            r6.f26048p = r7     // Catch:{ Throwable -> 0x00aa }
            boolean r7 = com.bytedance.crash.C9610j.m19139c()     // Catch:{ Throwable -> 0x00aa }
            r8 = 1
            r7 = r7 ^ r8
            r6.f26043k = r7     // Catch:{ Throwable -> 0x00aa }
            java.io.File r7 = new java.io.File     // Catch:{ Throwable -> 0x00aa }
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x00aa }
            android.content.Context r1 = r6.f26036b     // Catch:{ Throwable -> 0x00aa }
            java.io.File r1 = com.bytedance.crash.p555n.C9705m.m19391a(r1)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r2 = com.bytedance.crash.p555n.C9705m.m19395b()     // Catch:{ Throwable -> 0x00aa }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r1 = "trace"
            r7.<init>(r0, r1)     // Catch:{ Throwable -> 0x00aa }
            java.io.File r0 = r7.getParentFile()     // Catch:{ Throwable -> 0x00aa }
            r0.mkdirs()     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r0 = r7.getAbsolutePath()     // Catch:{ Throwable -> 0x00aa }
            com.bytedance.crash.nativecrash.NativeImpl.m19474c(r0)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r0 = r7.getAbsolutePath()     // Catch:{ Throwable -> 0x008e }
            org.json.JSONArray r0 = com.bytedance.crash.p555n.C9695g.m19359b(r0)     // Catch:{ Throwable -> 0x008e }
            r6.f26046n = r0     // Catch:{ Throwable -> 0x008e }
            org.json.JSONArray r0 = r6.f26046n     // Catch:{ Throwable -> 0x008e }
            r6.m18958a(r0)     // Catch:{ Throwable -> 0x008e }
            goto L_0x0098
        L_0x008e:
            r0 = move-exception
            com.bytedance.crash.f r1 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r2 = "NPTH_CATCH"
            r1.mo17384a(r2, r0)     // Catch:{ Throwable -> 0x00aa }
        L_0x0098:
            org.json.JSONObject r0 = r6.f26044l     // Catch:{ Throwable -> 0x00aa }
            if (r0 != 0) goto L_0x00a2
            org.json.JSONObject r8 = com.bytedance.crash.p540b.C9557c.m18964a(r8)     // Catch:{ Throwable -> 0x00aa }
            r6.f26044l = r8     // Catch:{ Throwable -> 0x00aa }
        L_0x00a2:
            java.io.File r7 = r7.getParentFile()     // Catch:{ Throwable -> 0x00aa }
            com.bytedance.crash.p555n.C9695g.m19357a(r7)     // Catch:{ Throwable -> 0x00aa }
            return
        L_0x00aa:
            r7 = move-exception
            com.bytedance.crash.f r8 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r0 = "NPTH_CATCH"
            r8.mo17384a(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p540b.C9553a.m18954a(long):void");
    }

    /* renamed from: a */
    private static void m18955a(String str) {
        for (C9598h a : C9616k.m19150b().f26029g) {
            try {
                a.mo17349a(C9571d.ANR, str, null);
            } catch (Throwable th) {
                C9577e.m18999a().mo17384a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: a */
    private static String m18952a(float f, float f2) {
        if (f2 > 0.0f) {
            return m18951a(f / f2);
        }
        if (f > 0.0f) {
            return "100%";
        }
        return "0%";
    }

    /* renamed from: a */
    private static JSONObject m18953a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", jSONArray);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0363, code lost:
        r0 = r5.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x036d, code lost:
        if (r0.startsWith("Load:") == false) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x036f, code lost:
        r0 = r0.replace("Load:", "").trim().split("/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0383, code lost:
        if (3 != r0.length) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0385, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0387, code lost:
        if (r2 >= r0.length) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0389, code lost:
        r6[r2] = java.lang.Float.valueOf(r0[r2]).floatValue();
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0398, code lost:
        r0 = 4;
        r5 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x039b, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0196, code lost:
        if (r4 >= r13.length) goto L_0x0198;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02b1 A[LOOP:3: B:92:0x01ed->B:133:0x02b1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0402 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03f0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02ba A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x02ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18956a(java.lang.String r28, org.json.JSONObject r29) throws org.json.JSONException {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            android.os.SystemClock.uptimeMillis()
            java.lang.String r2 = "\n"
            r3 = r28
            java.lang.String[] r2 = r3.split(r2)
            java.lang.String r3 = "unknown"
            java.lang.String r4 = "unknown"
            r5 = 3
            float[] r6 = new float[r5]
            r6 = {-1082130432, -1082130432, -1082130432} // fill-array
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            int r12 = r2.length
            r14 = r3
            r15 = r4
            r3 = 0
            r4 = 0
            r16 = 0
        L_0x0039:
            if (r3 >= r12) goto L_0x03fe
            r5 = r2[r3]
            boolean r17 = android.text.TextUtils.isEmpty(r5)
            if (r17 != 0) goto L_0x03e1
            r17 = 1
            switch(r4) {
                case 0: goto L_0x03ae;
                case 1: goto L_0x02db;
                case 2: goto L_0x02cd;
                case 3: goto L_0x0057;
                default: goto L_0x0048;
            }
        L_0x0048:
            r20 = r2
            r21 = r4
            r26 = r10
            r23 = r12
            r24 = r15
            r4 = 3
            r18 = 0
            goto L_0x03d9
        L_0x0057:
            java.lang.String r13 = "\\s"
            java.lang.String[] r13 = r5.split(r13)
            r20 = r2
            int r2 = r13.length
            r21 = r4
            r4 = 2
            if (r2 < r4) goto L_0x02c2
            java.lang.String r2 = "CPU"
            r18 = 0
            r4 = r13[r18]
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x00b7
            java.lang.String r2 = "usage"
            r4 = r13[r17]
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x00b7
            java.lang.String r2 = "ago"
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L_0x0085
            r16 = 1
        L_0x0085:
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x00ae
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x00ae
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x00ae
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x00ae
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L_0x00a4
            goto L_0x00ae
        L_0x00a4:
            r26 = r10
            r23 = r12
            r5 = r21
            r0 = 4
            r4 = 3
            goto L_0x03de
        L_0x00ae:
            r26 = r10
            r23 = r12
            r0 = 4
            r4 = 3
            r5 = 4
            goto L_0x03de
        L_0x00b7:
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L_0x00d6
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x00d6
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L_0x00d6
            boolean r2 = r11.isEmpty()
            if (r2 != 0) goto L_0x00d6
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L_0x00d6
            goto L_0x00ae
        L_0x00d6:
            java.lang.String r2 = ""
            boolean r4 = r7.isEmpty()
            r19 = 0
            if (r4 == 0) goto L_0x00f3
            r4 = r13[r17]
            r22 = r2
            java.lang.String r2 = "TOTAL:"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00f5
            r0 = r7
            r23 = r12
        L_0x00ef:
            r2 = r22
            goto L_0x0186
        L_0x00f3:
            r22 = r2
        L_0x00f5:
            android.content.Context r2 = r0.f26036b
            java.lang.String r2 = r2.getPackageName()
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L_0x014e
            r2 = 0
        L_0x0102:
            int r4 = r13.length
            if (r2 >= r4) goto L_0x014a
            r4 = r13[r2]
            android.content.Context r5 = r0.f26036b
            java.lang.String r5 = r5.getPackageName()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0141
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = r13[r2]
            r0 = r13[r2]
            r23 = r12
            r12 = 47
            int r0 = r0.indexOf(r12)
            int r0 = r0 + 1
            r12 = r13[r2]
            int r12 = r12.length()
            int r12 = r12 + -1
            java.lang.String r0 = r5.substring(r0, r12)
            r4.append(r0)
            r0 = 95
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r22 = r0
            goto L_0x0143
        L_0x0141:
            r23 = r12
        L_0x0143:
            int r2 = r2 + 1
            r12 = r23
            r0 = r27
            goto L_0x0102
        L_0x014a:
            r23 = r12
            r0 = r9
            goto L_0x00ef
        L_0x014e:
            r23 = r12
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = "system_server:"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0160
            r0 = r8
            goto L_0x00ef
        L_0x0160:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0171
            java.lang.String r0 = "kswapd"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0171
            r0 = r11
            goto L_0x00ef
        L_0x0171:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0182
            java.lang.String r0 = "dex2oat"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0182
            r0 = r10
            goto L_0x00ef
        L_0x0182:
            r0 = r19
            goto L_0x00ef
        L_0x0186:
            if (r0 == 0) goto L_0x02bd
            r4 = 0
        L_0x0189:
            r5 = r13[r4]
            java.lang.String r12 = "%"
            boolean r5 = r5.contains(r12)
            if (r5 != 0) goto L_0x0198
            int r4 = r4 + 1
            int r5 = r13.length
            if (r4 < r5) goto L_0x0189
        L_0x0198:
            r12 = r13[r4]     // Catch:{ Throwable -> 0x01ce }
            java.lang.String r5 = "%"
            r24 = r15
            java.lang.String r15 = ""
            java.lang.String r5 = r12.replace(r5, r15)     // Catch:{ Throwable -> 0x01d0 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Throwable -> 0x01d0 }
            float r5 = r5.floatValue()     // Catch:{ Throwable -> 0x01d0 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01d0 }
            r12.<init>()     // Catch:{ Throwable -> 0x01d0 }
            r12.append(r2)     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r15 = "total"
            r12.append(r15)     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r12 = r12.toString()     // Catch:{ Throwable -> 0x01d0 }
            if (r0 != r7) goto L_0x01c0
            goto L_0x01c6
        L_0x01c0:
            int r15 = com.bytedance.crash.p555n.C9691d.m19338d()     // Catch:{ Throwable -> 0x01d0 }
            float r15 = (float) r15     // Catch:{ Throwable -> 0x01d0 }
            float r5 = r5 / r15
        L_0x01c6:
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Throwable -> 0x01d0 }
            r0.put(r12, r5)     // Catch:{ Throwable -> 0x01d0 }
            goto L_0x01ea
        L_0x01ce:
            r24 = r15
        L_0x01d0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r12 = "total"
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r15 = java.lang.Float.valueOf(r12)
            r0.put(r5, r15)
        L_0x01ea:
            int r4 = r4 + 3
            r5 = 0
        L_0x01ed:
            int r12 = r13.length
            if (r4 >= r12) goto L_0x02ba
            switch(r5) {
                case 0: goto L_0x01f4;
                case 1: goto L_0x0202;
                case 2: goto L_0x0210;
                case 3: goto L_0x021e;
                case 4: goto L_0x022c;
                case 5: goto L_0x023a;
                default: goto L_0x01f3;
            }
        L_0x01f3:
            goto L_0x0248
        L_0x01f4:
            java.lang.String r15 = "user"
            r12 = r13[r4]
            boolean r12 = r15.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x0202
            java.lang.String r5 = "user"
            r12 = 1
            goto L_0x024b
        L_0x0202:
            java.lang.String r12 = "kernel"
            r15 = r13[r4]
            boolean r12 = r12.equalsIgnoreCase(r15)
            if (r12 == 0) goto L_0x0210
            java.lang.String r5 = "kernel"
            r12 = 2
            goto L_0x024b
        L_0x0210:
            java.lang.String r12 = "iowait"
            r15 = r13[r4]
            boolean r12 = r12.equalsIgnoreCase(r15)
            if (r12 == 0) goto L_0x021e
            java.lang.String r5 = "iowait"
            r12 = 3
            goto L_0x024b
        L_0x021e:
            java.lang.String r12 = "irq"
            r15 = r13[r4]
            boolean r12 = r12.equalsIgnoreCase(r15)
            if (r12 == 0) goto L_0x022c
            java.lang.String r5 = "irq"
            r12 = 4
            goto L_0x024b
        L_0x022c:
            java.lang.String r12 = "softirq"
            r15 = r13[r4]
            boolean r12 = r12.equalsIgnoreCase(r15)
            if (r12 == 0) goto L_0x023a
            java.lang.String r5 = "softirq"
            r12 = 5
            goto L_0x024b
        L_0x023a:
            java.lang.String r12 = "softirq"
            r15 = r13[r4]
            boolean r12 = r12.equalsIgnoreCase(r15)
            if (r12 == 0) goto L_0x0248
            java.lang.String r5 = "softirq"
            r12 = 6
            goto L_0x024b
        L_0x0248:
            r12 = r5
            r5 = r19
        L_0x024b:
            if (r5 == 0) goto L_0x02a8
            int r15 = r4 + -1
            r15 = r13[r15]     // Catch:{ Throwable -> 0x028b }
            r25 = r13
            java.lang.String r13 = "%"
            r26 = r10
            java.lang.String r10 = ""
            java.lang.String r10 = r15.replace(r13, r10)     // Catch:{ Throwable -> 0x028f }
            java.lang.Float r10 = java.lang.Float.valueOf(r10)     // Catch:{ Throwable -> 0x028f }
            float r10 = r10.floatValue()     // Catch:{ Throwable -> 0x028f }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x028f }
            r13.<init>()     // Catch:{ Throwable -> 0x028f }
            r13.append(r2)     // Catch:{ Throwable -> 0x028f }
            r13.append(r5)     // Catch:{ Throwable -> 0x028f }
            java.lang.String r13 = r13.toString()     // Catch:{ Throwable -> 0x028f }
            if (r0 != r7) goto L_0x0277
            goto L_0x027d
        L_0x0277:
            int r15 = com.bytedance.crash.p555n.C9691d.m19338d()     // Catch:{ Throwable -> 0x028f }
            float r15 = (float) r15     // Catch:{ Throwable -> 0x028f }
            float r10 = r10 / r15
        L_0x027d:
            java.lang.Float r10 = java.lang.Float.valueOf(r10)     // Catch:{ Throwable -> 0x028f }
            r0.put(r13, r10)     // Catch:{ Throwable -> 0x028f }
            r5 = 6
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x02af
        L_0x0288:
            r26 = r10
            goto L_0x028f
        L_0x028b:
            r26 = r10
            r25 = r13
        L_0x028f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r13 = java.lang.Float.valueOf(r10)
            r0.put(r5, r13)
            goto L_0x02ae
        L_0x02a8:
            r26 = r10
            r25 = r13
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x02ae:
            r5 = 6
        L_0x02af:
            if (r12 >= r5) goto L_0x02ca
            int r4 = r4 + 3
            r5 = r12
            r13 = r25
            r10 = r26
            goto L_0x01ed
        L_0x02ba:
            r26 = r10
            goto L_0x02ca
        L_0x02bd:
            r26 = r10
            r24 = r15
            goto L_0x02ca
        L_0x02c2:
            r26 = r10
            r23 = r12
            r24 = r15
            r18 = 0
        L_0x02ca:
            r4 = 3
            goto L_0x03d9
        L_0x02cd:
            r20 = r2
            r21 = r4
            r26 = r10
            r23 = r12
            r24 = r15
            r18 = 0
            goto L_0x0363
        L_0x02db:
            r20 = r2
            r21 = r4
            r26 = r10
            r23 = r12
            r24 = r15
            r18 = 0
            java.lang.String r5 = r5.trim()
            java.lang.String r0 = r5.toLowerCase()
            java.lang.String r2 = "shortmsg"
            boolean r2 = r0.startsWith(r2)
            r4 = 58
            if (r2 == 0) goto L_0x0303
            int r2 = r5.indexOf(r4)
            r5.substring(r2)
            r17 = 0
            goto L_0x0312
        L_0x0303:
            java.lang.String r2 = "reason:"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x039f
            int r2 = r5.indexOf(r4)
            r5.substring(r2)
        L_0x0312:
            java.lang.String r2 = "input dispatch"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x031e
            java.lang.String r0 = "Input dispatching timed out"
        L_0x031c:
            r15 = r0
            goto L_0x035c
        L_0x031e:
            java.lang.String r2 = "broadcast of intent"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0329
            java.lang.String r0 = "Broadcast of Intent"
            goto L_0x031c
        L_0x0329:
            java.lang.String r2 = "executing service"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x034e
            java.lang.String r0 = "executing service"
            java.lang.String r2 = "null"
            boolean r2 = r2.equalsIgnoreCase(r14)
            if (r2 == 0) goto L_0x031c
            java.lang.String r2 = "service "
            int r2 = r5.indexOf(r2)
            int r2 = r2 + 8
            java.lang.String r2 = r5.substring(r2)
            java.lang.String r2 = r2.trim()
            r15 = r0
            r14 = r2
            goto L_0x035c
        L_0x034e:
            java.lang.String r2 = "service.startforeground"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0359
            java.lang.String r0 = "not call Service.startForeground"
            goto L_0x031c
        L_0x0359:
            java.lang.String r0 = "unknown"
            goto L_0x031c
        L_0x035c:
            if (r17 == 0) goto L_0x0363
            r0 = 4
            r4 = 3
            r5 = 2
            goto L_0x03de
        L_0x0363:
            java.lang.String r0 = r5.trim()
            java.lang.String r2 = "Load:"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x039b
            java.lang.String r2 = "Load:"
            java.lang.String r4 = ""
            java.lang.String r0 = r0.replace(r2, r4)
            java.lang.String r0 = r0.trim()
            java.lang.String r2 = "/"
            java.lang.String[] r0 = r0.split(r2)
            int r2 = r0.length
            r4 = 3
            if (r4 != r2) goto L_0x0398
            r2 = 0
        L_0x0386:
            int r5 = r0.length
            if (r2 >= r5) goto L_0x0398
            r5 = r0[r2]
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            float r5 = r5.floatValue()
            r6[r2] = r5
            int r2 = r2 + 1
            goto L_0x0386
        L_0x0398:
            r0 = 4
            r5 = 3
            goto L_0x03de
        L_0x039b:
            r4 = 3
            r5 = r21
            goto L_0x03dd
        L_0x039f:
            r4 = 3
            java.lang.String r2 = "appfreeze"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x03d9
            java.lang.String r0 = "AppFreeze"
            r5 = 10
            r15 = r0
            goto L_0x03dd
        L_0x03ae:
            r20 = r2
            r21 = r4
            r26 = r10
            r23 = r12
            r24 = r15
            r4 = 3
            r18 = 0
            java.lang.String r0 = r5.trim()
            java.lang.String r2 = "tag:"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x03d9
            java.lang.String r2 = "tag:"
            java.lang.String r5 = ""
            java.lang.String r0 = r0.replace(r2, r5)
            java.lang.String r0 = r0.trim()
            r14 = r0
            r15 = r24
            r0 = 4
            r5 = 1
            goto L_0x03de
        L_0x03d9:
            r5 = r21
            r15 = r24
        L_0x03dd:
            r0 = 4
        L_0x03de:
            if (r5 >= r0) goto L_0x0402
            goto L_0x03f0
        L_0x03e1:
            r20 = r2
            r21 = r4
            r26 = r10
            r23 = r12
            r24 = r15
            r4 = 3
            r18 = 0
            r5 = r21
        L_0x03f0:
            int r3 = r3 + 1
            r4 = r5
            r2 = r20
            r12 = r23
            r10 = r26
            r0 = r27
            r5 = 3
            goto L_0x0039
        L_0x03fe:
            r26 = r10
            r24 = r15
        L_0x0402:
            java.lang.String r0 = "anr_tag"
            r1.put(r0, r14)
            java.lang.String r0 = "anr_has_ago"
            java.lang.String r2 = java.lang.String.valueOf(r16)
            r1.put(r0, r2)
            java.lang.String r0 = "anr_reason"
            r1.put(r0, r15)
            java.lang.String r0 = "app"
            m18957a(r9, r1, r0)
            java.lang.String r0 = "total"
            m18957a(r7, r1, r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x042d
            java.lang.String r0 = "npth_anr_systemserver_total"
            java.lang.String r2 = "not found"
            r1.put(r0, r2)
            goto L_0x043e
        L_0x042d:
            java.lang.String r0 = "npth_anr_systemserver_total"
            java.lang.Float r2 = com.bytedance.crash.p555n.C9709p.m19414a(r8)
            float r2 = r2.floatValue()
            java.lang.String r2 = m18960b(r2)
            r1.put(r0, r2)
        L_0x043e:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x044c
            java.lang.String r0 = "npth_anr_kswapd_total"
            java.lang.String r2 = "not found"
            r1.put(r0, r2)
            goto L_0x045d
        L_0x044c:
            java.lang.String r0 = "npth_anr_kswapd_total"
            java.lang.Float r2 = com.bytedance.crash.p555n.C9709p.m19414a(r11)
            float r2 = r2.floatValue()
            java.lang.String r2 = m18960b(r2)
            r1.put(r0, r2)
        L_0x045d:
            boolean r0 = r26.isEmpty()
            if (r0 == 0) goto L_0x046b
            java.lang.String r0 = "npth_anr_dex2oat_total"
            java.lang.String r2 = "not found"
            r1.put(r0, r2)
            return
        L_0x046b:
            java.lang.String r0 = "npth_anr_dex2oat_total"
            java.lang.Float r2 = com.bytedance.crash.p555n.C9709p.m19414a(r26)
            float r2 = r2.floatValue()
            java.lang.String r2 = m18960b(r2)
            r1.put(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p540b.C9553a.m18956a(java.lang.String, org.json.JSONObject):void");
    }

    /* renamed from: a */
    private static void m18957a(HashMap<String, Float> hashMap, JSONObject jSONObject, String str) throws JSONException {
        StringBuilder sb = new StringBuilder("npth_anr_");
        sb.append(str);
        String sb2 = sb.toString();
        if (hashMap.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("_total");
            jSONObject.put(sb3.toString(), "not found");
            return;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            if (str2.endsWith("user")) {
                f += ((Float) entry.getValue()).floatValue();
            } else if (str2.endsWith("kernel")) {
                f2 += ((Float) entry.getValue()).floatValue();
            } else if (str2.endsWith("iowait")) {
                f3 += ((Float) entry.getValue()).floatValue();
            } else if (str2.endsWith("irq")) {
                f4 += ((Float) entry.getValue()).floatValue();
            } else if (str2.endsWith("softirq")) {
                f5 += ((Float) entry.getValue()).floatValue();
            }
        }
        float f6 = f + f2 + f3 + f4 + f5;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb2);
        sb4.append("_total");
        jSONObject.put(sb4.toString(), m18960b(f6));
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb2);
        sb5.append("_kernel_user_ratio");
        jSONObject.put(sb5.toString(), m18952a(f2, f6));
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb2);
        sb6.append("_iowait_user_ratio");
        jSONObject.put(sb6.toString(), m18952a(f3, f6));
    }
}
