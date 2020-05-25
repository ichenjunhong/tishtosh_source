package com.bytedance.apm.p480f.p481a;

import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.p480f.C9012a;
import com.bytedance.apm.p480f.C9028d;
import com.bytedance.apm.p480f.p482b.C9019a;
import com.bytedance.apm.p501q.C9185g;
import com.bytedance.apm.p501q.C9193j;
import com.bytedance.apm.p501q.C9195l;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.a.b */
public final class C9015b extends C9012a<C9019a> {

    /* renamed from: b */
    public int f24584b;

    /* renamed from: c */
    public boolean f24585c;

    /* renamed from: d */
    private volatile int f24586d;

    /* renamed from: e */
    private volatile List<String> f24587e;

    /* renamed from: f */
    private List<Pattern> f24588f;

    /* renamed from: g */
    private List<String> f24589g;

    /* renamed from: h */
    private List<Pattern> f24590h;

    /* renamed from: i */
    private List<String> f24591i;

    /* renamed from: com.bytedance.apm.f.a.b$a */
    static final class C9017a {

        /* renamed from: a */
        public static final C9015b f24592a = new C9015b();
    }

    /* renamed from: a */
    public static C9015b m17827a() {
        return C9017a.f24592a;
    }

    private C9015b() {
        this.f24585c = true;
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo16341b(C9028d dVar) {
        C9019a aVar = (C9019a) dVar;
        if (aVar == null || TextUtils.isEmpty(aVar.f24596d)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|(2:5|(1:7)(10:8|9|(3:11|(1:13)(1:14)|15)|16|(1:18)(2:19|(1:21)(3:22|23|(1:25)))|(2:27|28)|29|30|(1:32)|33))|4|9|(0)|16|(0)(0)|(0)|29|30|(0)|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0069 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A[Catch:{ JSONException -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034 A[Catch:{ JSONException -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0035 A[Catch:{ JSONException -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054 A[SYNTHETIC, Splitter:B:27:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075 A[Catch:{ JSONException -> 0x007d }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo16343c(com.bytedance.apm.p480f.C9028d r8) {
        /*
            r7 = this;
            com.bytedance.apm.f.b.a r8 = (com.bytedance.apm.p480f.p482b.C9019a) r8
            com.bytedance.apm.core.ActivityLifeObserver r0 = com.bytedance.apm.core.ActivityLifeObserver.getInstance()     // Catch:{ JSONException -> 0x007d }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            r0 = 1
            goto L_0x0018
        L_0x000c:
            com.bytedance.apm.core.ActivityLifeObserver r0 = com.bytedance.apm.core.ActivityLifeObserver.getInstance()     // Catch:{ JSONException -> 0x007d }
            boolean r0 = r0.isForeground()     // Catch:{ JSONException -> 0x007d }
            if (r0 != 0) goto L_0x0017
            goto L_0x000a
        L_0x0017:
            r0 = 0
        L_0x0018:
            r0 = r0 ^ r2
            org.json.JSONObject r3 = r8.f24600h     // Catch:{ JSONException -> 0x007d }
            java.lang.String r4 = "front"
            boolean r3 = r3.isNull(r4)     // Catch:{ JSONException -> 0x007d }
            if (r3 == 0) goto L_0x002f
            org.json.JSONObject r3 = r8.f24600h     // Catch:{ JSONException -> 0x007d }
            java.lang.String r4 = "front"
            if (r0 == 0) goto L_0x002b
            r0 = 1
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r3.put(r4, r0)     // Catch:{ JSONException -> 0x007d }
        L_0x002f:
            int r0 = com.bytedance.apm.p498p.C9171b.f25121d     // Catch:{ JSONException -> 0x007d }
            r0 = r0 & r2
            if (r0 != 0) goto L_0x0035
            goto L_0x0052
        L_0x0035:
            long r3 = com.bytedance.apm.C8976c.m17757m()     // Catch:{ JSONException -> 0x007d }
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            goto L_0x0052
        L_0x0040:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x007d }
            long r5 = com.bytedance.apm.C8976c.m17757m()     // Catch:{ JSONException -> 0x007d }
            r0 = 0
            long r3 = r3 - r5
            long r5 = com.bytedance.apm.p498p.C9171b.f25120c     // Catch:{ JSONException -> 0x007d }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r1 = 1
        L_0x0052:
            if (r1 == 0) goto L_0x0069
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0069 }
            r0.<init>()     // Catch:{ JSONException -> 0x0069 }
            java.lang.String r1 = "trace_base"
            long r2 = com.bytedance.apm.C8976c.m17757m()     // Catch:{ JSONException -> 0x0069 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0069 }
            org.json.JSONObject r1 = r8.f24600h     // Catch:{ JSONException -> 0x0069 }
            java.lang.String r2 = "relate_start_trace"
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x0069 }
        L_0x0069:
            java.lang.String r0 = r8.f24593a     // Catch:{ JSONException -> 0x007d }
            org.json.JSONObject r1 = r8.f24600h     // Catch:{ JSONException -> 0x007d }
            java.lang.String r2 = "net_consume_type"
            boolean r1 = r1.isNull(r2)     // Catch:{ JSONException -> 0x007d }
            if (r1 == 0) goto L_0x007c
            org.json.JSONObject r8 = r8.f24600h     // Catch:{ JSONException -> 0x007d }
            java.lang.String r1 = "net_consume_type"
            r8.put(r1, r0)     // Catch:{ JSONException -> 0x007d }
        L_0x007c:
            return
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p480f.p481a.C9015b.mo16343c(com.bytedance.apm.f.d):void");
    }

    /* renamed from: d */
    public final /* synthetic */ void mo16345d(C9028d dVar) {
        C9019a aVar = (C9019a) dVar;
        String str = aVar.f24596d;
        if (!C9195l.m18265a(str, this.f24587e, this.f24588f) && !C9195l.m18264a(str, this.f24591i) && C9193j.m18259b(C8976c.m17736a())) {
            String str2 = aVar.f24593a;
            JSONObject a = aVar.mo16347a();
            C9185g.m18235a(a, aVar.f24600h);
            if (a != null) {
                String str3 = aVar.f24593a;
                boolean z = true;
                if (TextUtils.equals(str3, "api_all")) {
                    z = m17828a(str, a);
                } else if (!TextUtils.equals(str3, "api_error") || this.f24586d != 1) {
                    z = false;
                }
                mo16338a(str2, str2, a, z, false, aVar.mo16353f());
            }
        }
    }

    /* renamed from: a */
    private boolean m17828a(String str, JSONObject jSONObject) {
        int i;
        int i2;
        if (this.f24584b != 0 || C9195l.m18265a(str, this.f24589g, this.f24590h)) {
            i = 1;
        } else {
            i = 0;
        }
        boolean b = mo16342b("smart_traffic");
        if (b) {
            i2 = i | 4;
        } else {
            i2 = i;
        }
        try {
            jSONObject.put("hit_rules", i2);
        } catch (JSONException unused) {
        }
        if (i != 0 || b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo16270a(JSONObject jSONObject, boolean z) {
        JSONObject a = C9195l.m18263a(jSONObject, "network_image_modules");
        if (a != null) {
            JSONObject a2 = C9195l.m18263a(a, "network");
            if (a2 != null) {
                this.f24587e = C9195l.m18266b(a2, "api_black_list");
                this.f24588f = C9195l.m18268d(a2, "api_black_list");
                this.f24589g = C9195l.m18267c(a2, "api_allow_list");
                this.f24590h = C9195l.m18269e(a2, "api_allow_list");
                this.f24584b = a2.optInt("enable_api_all_upload", 0);
                this.f24585c = a2.optBoolean("enable_trace_log", true);
                this.f24586d = a2.optInt("enable_api_error_upload", 1);
            }
            JSONObject a3 = C9195l.m18263a(a, "image");
            if (a3 != null) {
                this.f24591i = C9195l.m18267c(a3, "image_allow_list");
            }
        }
    }
}
