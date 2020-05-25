package com.p683ss.android.pushmanager;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.message.C19408a;
import com.p683ss.android.pushmanager.setting.C19710b;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.ss.android.pushmanager.h */
public class C19702h {

    /* renamed from: j */
    private static C19702h f54220j;

    /* renamed from: l */
    private static final Set<Integer> f54221l = new CopyOnWriteArraySet();

    /* renamed from: a */
    private boolean f54222a = true;

    /* renamed from: b */
    private boolean f54223b = true;

    /* renamed from: c */
    private boolean f54224c = true;

    /* renamed from: d */
    private boolean f54225d = true;

    /* renamed from: e */
    private boolean f54226e = true;

    /* renamed from: f */
    private boolean f54227f = true;

    /* renamed from: g */
    private boolean f54228g = true;

    /* renamed from: h */
    private boolean f54229h = true;

    /* renamed from: i */
    private boolean f54230i = true;

    /* renamed from: k */
    private boolean f54231k;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.f54222a = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r5.f54226e = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r5.f54227f = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r5.f54228g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r5.f54229h = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r5.f54230i = false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x004c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0069 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0090 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00b0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x00d6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x00f6 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m48133b() {
        /*
            r5 = this;
            boolean r0 = r5.f54231k
            if (r0 != 0) goto L_0x00ff
            monitor-enter(r5)
            boolean r0 = r5.f54231k     // Catch:{ all -> 0x00fc }
            if (r0 != 0) goto L_0x00fa
            android.app.Application r0 = com.p683ss.android.message.C19408a.m47500a()     // Catch:{ all -> 0x00fc }
            r1 = 1
            r2 = 0
            java.lang.String r3 = "com.xiaomi.MiPushAdapter"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Throwable -> 0x002a }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ Throwable -> 0x002a }
            boolean r3 = r3 instanceof com.p683ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x002a }
            if (r3 == 0) goto L_0x0026
            com.ss.android.pushmanager.e r3 = com.p683ss.android.pushmanager.C19700f.m48124a()     // Catch:{ Throwable -> 0x002a }
            r3.mo41058b()     // Catch:{ Throwable -> 0x002a }
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            r5.f54222a = r3     // Catch:{ Throwable -> 0x002a }
            goto L_0x002c
        L_0x002a:
            r5.f54222a = r2     // Catch:{ all -> 0x00fc }
        L_0x002c:
            java.lang.String r3 = "com.umeng.UmengPushAdapter"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Throwable -> 0x003b }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ Throwable -> 0x003b }
            boolean r3 = r3 instanceof com.p683ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x003b }
            r5.f54224c = r3     // Catch:{ Throwable -> 0x003b }
            goto L_0x003d
        L_0x003b:
            r5.f54224c = r2     // Catch:{ all -> 0x00fc }
        L_0x003d:
            java.lang.String r3 = "com.huawei.HWPushAdapter"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Throwable -> 0x004c }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ Throwable -> 0x004c }
            boolean r3 = r3 instanceof com.p683ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x004c }
            r5.f54225d = r3     // Catch:{ Throwable -> 0x004c }
            goto L_0x004e
        L_0x004c:
            r5.f54225d = r2     // Catch:{ all -> 0x00fc }
        L_0x004e:
            java.lang.String r3 = "com.meizu.MzPushAdapter"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Throwable -> 0x0069 }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ Throwable -> 0x0069 }
            boolean r3 = r3 instanceof com.p683ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x0069 }
            if (r3 == 0) goto L_0x0065
            com.ss.android.pushmanager.e r3 = com.p683ss.android.pushmanager.C19700f.m48124a()     // Catch:{ Throwable -> 0x0069 }
            r3.mo41059c()     // Catch:{ Throwable -> 0x0069 }
            r3 = 1
            goto L_0x0066
        L_0x0065:
            r3 = 0
        L_0x0066:
            r5.f54226e = r3     // Catch:{ Throwable -> 0x0069 }
            goto L_0x006b
        L_0x0069:
            r5.f54226e = r2     // Catch:{ all -> 0x00fc }
        L_0x006b:
            java.lang.String r3 = "com.coloros.OppoPushAdapter"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Throwable -> 0x0090 }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ Throwable -> 0x0090 }
            boolean r4 = r3 instanceof com.p683ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x0090 }
            if (r4 == 0) goto L_0x008c
            com.ss.android.pushmanager.e r4 = com.p683ss.android.pushmanager.C19700f.m48124a()     // Catch:{ Throwable -> 0x0090 }
            r4.mo41060d()     // Catch:{ Throwable -> 0x0090 }
            com.ss.android.pushmanager.thirdparty.IPushAdapter r3 = (com.p683ss.android.pushmanager.thirdparty.IPushAdapter) r3     // Catch:{ Throwable -> 0x0090 }
            r4 = 10
            boolean r3 = r3.isPushAvailable(r0, r4)     // Catch:{ Throwable -> 0x0090 }
            if (r3 == 0) goto L_0x008c
            r3 = 1
            goto L_0x008d
        L_0x008c:
            r3 = 0
        L_0x008d:
            r5.f54227f = r3     // Catch:{ Throwable -> 0x0090 }
            goto L_0x0092
        L_0x0090:
            r5.f54227f = r2     // Catch:{ all -> 0x00fc }
        L_0x0092:
            java.lang.String r3 = "com.vivo.VivoPushAdapter"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Throwable -> 0x00b0 }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ Throwable -> 0x00b0 }
            boolean r4 = r3 instanceof com.p683ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x00b0 }
            if (r4 == 0) goto L_0x00ac
            com.ss.android.pushmanager.thirdparty.IPushAdapter r3 = (com.p683ss.android.pushmanager.thirdparty.IPushAdapter) r3     // Catch:{ Throwable -> 0x00b0 }
            r4 = 11
            boolean r3 = r3.isPushAvailable(r0, r4)     // Catch:{ Throwable -> 0x00b0 }
            if (r3 == 0) goto L_0x00ac
            r3 = 1
            goto L_0x00ad
        L_0x00ac:
            r3 = 0
        L_0x00ad:
            r5.f54228g = r3     // Catch:{ Throwable -> 0x00b0 }
            goto L_0x00b2
        L_0x00b0:
            r5.f54228g = r2     // Catch:{ all -> 0x00fc }
        L_0x00b2:
            java.lang.String r3 = "com.fcm.FcmPushAdapter"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ Throwable -> 0x00d6 }
            boolean r3 = r3 instanceof com.p683ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x00d6 }
            if (r3 == 0) goto L_0x00d2
            java.lang.String r3 = "com.android.vending"
            boolean r3 = com.p683ss.android.common.util.C18920g.m46052b(r0, r3)     // Catch:{ Throwable -> 0x00d6 }
            if (r3 == 0) goto L_0x00d2
            java.lang.String r3 = "com.google.android.gms"
            boolean r3 = com.p683ss.android.common.util.C18920g.m46052b(r0, r3)     // Catch:{ Throwable -> 0x00d6 }
            if (r3 == 0) goto L_0x00d2
            r3 = 1
            goto L_0x00d3
        L_0x00d2:
            r3 = 0
        L_0x00d3:
            r5.f54229h = r3     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d8
        L_0x00d6:
            r5.f54229h = r2     // Catch:{ all -> 0x00fc }
        L_0x00d8:
            java.lang.String r3 = "com.adm.push.AdmPushAdapter"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Throwable -> 0x00f6 }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ Throwable -> 0x00f6 }
            boolean r4 = r3 instanceof com.p683ss.android.pushmanager.thirdparty.IPushAdapter     // Catch:{ Throwable -> 0x00f6 }
            if (r4 == 0) goto L_0x00f2
            com.ss.android.pushmanager.thirdparty.IPushAdapter r3 = (com.p683ss.android.pushmanager.thirdparty.IPushAdapter) r3     // Catch:{ Throwable -> 0x00f6 }
            r4 = 14
            boolean r0 = r3.isPushAvailable(r0, r4)     // Catch:{ Throwable -> 0x00f6 }
            if (r0 == 0) goto L_0x00f2
            r0 = 1
            goto L_0x00f3
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            r5.f54230i = r0     // Catch:{ Throwable -> 0x00f6 }
            goto L_0x00f8
        L_0x00f6:
            r5.f54230i = r2     // Catch:{ all -> 0x00fc }
        L_0x00f8:
            r5.f54231k = r1     // Catch:{ all -> 0x00fc }
        L_0x00fa:
            monitor-exit(r5)     // Catch:{ all -> 0x00fc }
            return
        L_0x00fc:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00fc }
            throw r0
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.pushmanager.C19702h.m48133b():void");
    }

    /* renamed from: a */
    public final JSONArray mo41062a() {
        m48133b();
        JSONArray jSONArray = new JSONArray();
        if (this.f54222a) {
            jSONArray.put(1);
        }
        if (this.f54223b) {
            jSONArray.put(2);
        }
        if (this.f54224c) {
            jSONArray.put(6);
        }
        if (this.f54225d) {
            jSONArray.put(7);
        }
        if (this.f54226e) {
            jSONArray.put(8);
        }
        if (this.f54227f) {
            jSONArray.put(10);
        }
        if (this.f54228g) {
            jSONArray.put(11);
        }
        if (this.f54229h) {
            jSONArray.put(5);
        }
        if (this.f54230i) {
            jSONArray.put(14);
        }
        return jSONArray;
    }

    private C19702h(Context context) {
        C19408a.m47501a((Application) context.getApplicationContext());
    }

    /* renamed from: a */
    public static C19702h m48130a(Context context) {
        if (f54220j == null) {
            synchronized (C19702h.class) {
                if (f54220j == null) {
                    f54220j = new C19702h(context);
                }
            }
        }
        return f54220j;
    }

    /* renamed from: a */
    public static boolean m48132a(int i) {
        if (f54221l.isEmpty()) {
            m48131a(C19710b.m48173a().mo41103l(), false);
        }
        return f54221l.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final boolean mo41063a(String str) {
        m48133b();
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!"[]".equals(str)) {
                    JSONArray jSONArray = new JSONArray(str);
                    if (jSONArray.length() <= 0) {
                        return false;
                    }
                    if (jSONArray.optInt(0) == -9307) {
                        return true;
                    }
                    String jSONArray2 = mo41062a().toString();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        int optInt = jSONArray.optInt(i);
                        StringBuilder sb = new StringBuilder();
                        sb.append(optInt);
                        if (jSONArray2.contains(sb.toString())) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m48131a(String str, boolean z) {
        if (z) {
            C19710b.m48173a().f54262b.mo41080a().mo41074a("push_channels_json_array", str).mo41076a();
        }
        if (!TextUtils.isEmpty(str)) {
            JSONArray jSONArray = null;
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException unused) {
            }
            if (jSONArray != null) {
                f54221l.clear();
                int length = jSONArray.length();
                boolean z2 = false;
                for (int i = 0; i < length; i++) {
                    int optInt = jSONArray.optInt(i);
                    if (optInt > 0) {
                        f54221l.add(Integer.valueOf(optInt));
                        if (optInt == 2) {
                            z2 = true;
                        }
                    }
                }
                C19710b.m48173a().f54262b.mo41080a().mo41075a("allow_self_push_enable", z2).mo41076a();
            }
        }
    }
}
