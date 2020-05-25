package com.facebook.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.C14533n;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13501b;
import com.facebook.p909a.p910a.p911a.C13522d;
import com.facebook.p909a.p912b.C13563g;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.p */
public final class C14338p {

    /* renamed from: a */
    public static final String f37308a = "p";

    /* renamed from: b */
    public static final Map<String, C14336o> f37309b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final AtomicReference<C14343a> f37310c = new AtomicReference<>(C14343a.NOT_LOADED);

    /* renamed from: d */
    public static boolean f37311d = false;

    /* renamed from: e */
    private static final String[] f37312e = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params"};

    /* renamed from: f */
    private static final ConcurrentLinkedQueue<C14344b> f37313f = new ConcurrentLinkedQueue<>();

    /* renamed from: g */
    private static boolean f37314g = false;

    /* renamed from: h */
    private static JSONArray f37315h = null;

    /* renamed from: com.facebook.internal.p$a */
    public enum C14343a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* renamed from: com.facebook.internal.p$b */
    public interface C14344b {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m29401a() {
        /*
            java.lang.Class<com.facebook.internal.p> r0 = com.facebook.internal.C14338p.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.p$a> r1 = f37310c     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0071 }
            com.facebook.internal.p$a r1 = (com.facebook.internal.C14338p.C14343a) r1     // Catch:{ all -> 0x0071 }
            com.facebook.internal.p$a r2 = com.facebook.internal.C14338p.C14343a.NOT_LOADED     // Catch:{ all -> 0x0071 }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x0071 }
            if (r2 != 0) goto L_0x006f
            com.facebook.internal.p$a r2 = com.facebook.internal.C14338p.C14343a.LOADING     // Catch:{ all -> 0x0071 }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x0071 }
            if (r2 == 0) goto L_0x001c
            goto L_0x006f
        L_0x001c:
            java.lang.String r2 = com.facebook.C14533n.m29777k()     // Catch:{ all -> 0x0071 }
            java.util.Map<java.lang.String, com.facebook.internal.o> r3 = f37309b     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0071 }
            com.facebook.internal.o r2 = (com.facebook.internal.C14336o) r2     // Catch:{ all -> 0x0071 }
            android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x0071 }
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0071 }
            r3.<init>(r4)     // Catch:{ all -> 0x0071 }
            com.facebook.internal.p$a r4 = com.facebook.internal.C14338p.C14343a.ERROR     // Catch:{ all -> 0x0071 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0054
        L_0x0039:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.p$b> r1 = f37313f     // Catch:{ all -> 0x0071 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r1 != 0) goto L_0x0052
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.p$b> r1 = f37313f     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0071 }
            com.facebook.internal.p$b r1 = (com.facebook.internal.C14338p.C14344b) r1     // Catch:{ all -> 0x0071 }
            com.facebook.internal.p$2 r2 = new com.facebook.internal.p$2     // Catch:{ all -> 0x0071 }
            r2.<init>(r1)     // Catch:{ all -> 0x0071 }
            r3.post(r2)     // Catch:{ all -> 0x0071 }
            goto L_0x0039
        L_0x0052:
            monitor-exit(r0)
            return
        L_0x0054:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.p$b> r1 = f37313f     // Catch:{ all -> 0x0071 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r1 != 0) goto L_0x006d
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.p$b> r1 = f37313f     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0071 }
            com.facebook.internal.p$b r1 = (com.facebook.internal.C14338p.C14344b) r1     // Catch:{ all -> 0x0071 }
            com.facebook.internal.p$3 r4 = new com.facebook.internal.p$3     // Catch:{ all -> 0x0071 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0071 }
            r3.post(r4)     // Catch:{ all -> 0x0071 }
            goto L_0x0054
        L_0x006d:
            monitor-exit(r0)
            return
        L_0x006f:
            monitor-exit(r0)
            return
        L_0x0071:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C14338p.m29401a():void");
    }

    /* renamed from: a */
    public static C14336o m29397a(String str) {
        if (str != null) {
            return (C14336o) f37309b.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public static JSONObject m29402b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(f37312e))));
        GraphRequest a = GraphRequest.m27265a((AccessToken) null, str, (C13501b) null);
        a.f35232n = true;
        a.f35228j = bundle;
        return a.mo25312a().f38084b;
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, com.facebook.internal.o$a] */
    /* JADX WARNING: type inference failed for: r6v2, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r7v7, types: [com.facebook.internal.o$a] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], android.net.Uri]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], com.facebook.internal.o$a, java.lang.Object, android.net.Uri]
      mth insns count: 46
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.facebook.internal.C14336o.C14337a>> m29400a(org.json.JSONObject r9) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r9 == 0) goto L_0x0082
            java.lang.String r1 = "data"
            org.json.JSONArray r9 = r9.optJSONArray(r1)
            if (r9 == 0) goto L_0x0082
            r1 = 0
            r2 = 0
        L_0x0011:
            int r3 = r9.length()
            if (r2 >= r3) goto L_0x0082
            org.json.JSONObject r3 = r9.optJSONObject(r2)
            java.lang.String r4 = "name"
            java.lang.String r4 = r3.optString(r4)
            boolean r5 = com.facebook.internal.C14277aa.m29276a(r4)
            r6 = 0
            if (r5 == 0) goto L_0x0029
            goto L_0x0066
        L_0x0029:
            java.lang.String r5 = "\\|"
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            r7 = 2
            if (r5 == r7) goto L_0x0034
            goto L_0x0066
        L_0x0034:
            r5 = r4[r1]
            r7 = 1
            r4 = r4[r7]
            boolean r7 = com.facebook.internal.C14277aa.m29276a(r5)
            if (r7 != 0) goto L_0x0066
            boolean r7 = com.facebook.internal.C14277aa.m29276a(r4)
            if (r7 == 0) goto L_0x0046
            goto L_0x0066
        L_0x0046:
            java.lang.String r7 = "url"
            java.lang.String r7 = r3.optString(r7)
            boolean r8 = com.facebook.internal.C14277aa.m29276a(r7)
            if (r8 != 0) goto L_0x0056
            android.net.Uri r6 = android.net.Uri.parse(r7)
        L_0x0056:
            java.lang.String r7 = "versions"
            org.json.JSONArray r3 = r3.optJSONArray(r7)
            int[] r3 = com.facebook.internal.C14336o.C14337a.m29396a(r3)
            com.facebook.internal.o$a r7 = new com.facebook.internal.o$a
            r7.<init>(r5, r4, r6, r3)
            r6 = r7
        L_0x0066:
            if (r6 == 0) goto L_0x007f
            java.lang.String r3 = r6.f37304a
            java.lang.Object r4 = r0.get(r3)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 != 0) goto L_0x007a
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0.put(r3, r4)
        L_0x007a:
            java.lang.String r3 = r6.f37305b
            r4.put(r3, r6)
        L_0x007f:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C14338p.m29400a(org.json.JSONObject):java.util.Map");
    }

    /* renamed from: a */
    public static C14336o m29399a(String str, boolean z) {
        if (!z && f37309b.containsKey(str)) {
            return (C14336o) f37309b.get(str);
        }
        JSONObject b = m29402b(str);
        if (b == null) {
            return null;
        }
        C14336o a = m29398a(str, b);
        if (str.equals(C14533n.m29777k())) {
            f37310c.set(C14343a.SUCCESS);
            m29401a();
        }
        return a;
    }

    /* renamed from: a */
    public static C14336o m29398a(String str, JSONObject jSONObject) {
        C14320j a;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        final JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("android_sdk_error_categories");
        if (optJSONArray == null) {
            a = C14320j.m29374a();
        } else {
            a = C14320j.m29375a(optJSONArray);
        }
        C14320j jVar = a;
        int optInt = jSONObject2.optInt("app_events_feature_bitmask", 0);
        if ((optInt & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((optInt & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((optInt & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((optInt & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("auto_event_mapping_android");
        f37315h = optJSONArray2;
        if (optJSONArray2 != null && C14346r.m29405a()) {
            C13522d.m27330a(optJSONArray2.toString());
        }
        C14336o oVar = new C14336o(jSONObject2.optBoolean("supports_implicit_sdk_logging", false), jSONObject2.optString("gdpv4_nux_content", ""), jSONObject2.optBoolean("gdpv4_nux_enabled", false), jSONObject2.optInt("app_events_session_timeout", 60), C14367z.parseOptions(jSONObject2.optLong("seamless_login")), m29400a(jSONObject2.optJSONObject("android_dialog_configs")), z, jVar, jSONObject2.optString("smart_login_bookmark_icon_url"), jSONObject2.optString("smart_login_menu_icon_url"), z2, z3, optJSONArray2, jSONObject2.optString("sdk_update_message"), z4);
        f37309b.put(str, oVar);
        C14533n.m29771e().execute(new Runnable() {
            public final void run() {
                C13563g.m27389a(jSONObject2.optString("restrictive_data_filter_params"));
            }
        });
        return oVar;
    }
}
