package com.bytedance.apm.p480f;

import android.text.TextUtils;
import com.bytedance.apm.C8994d;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p480f.C9028d;
import com.bytedance.apm.p486i.C9050a;
import com.bytedance.news.common.service.manager.C12401c;
import com.bytedance.services.slardar.config.C13226a;
import com.bytedance.services.slardar.config.IConfigManager;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.a */
public abstract class C9012a<T extends C9028d> implements C9026c, C13226a {

    /* renamed from: b */
    private static int f24575b = 1000;

    /* renamed from: a */
    public C9050a f24576a;

    /* renamed from: c */
    private final LinkedList<T> f24577c = new LinkedList<>();

    /* renamed from: d */
    private volatile boolean f24578d;

    /* renamed from: a */
    public void mo16270a(JSONObject jSONObject, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo16341b(T t) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo16343c(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo16345d(T t);

    protected C9012a() {
    }

    /* renamed from: e */
    public final void mo16224e() {
        LinkedList linkedList;
        this.f24578d = true;
        synchronized (this.f24577c) {
            linkedList = new LinkedList(this.f24577c);
            this.f24577c.clear();
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            mo16345d((C9028d) it.next());
        }
    }

    /* renamed from: a */
    public static void m17812a(int i) {
        f24575b = i;
    }

    /* renamed from: a */
    public final void mo16337a(C9050a aVar) {
        this.f24576a = aVar;
        ((IConfigManager) C12401c.m24975a(IConfigManager.class)).registerConfigListener(this);
    }

    /* renamed from: b */
    public final boolean mo16342b(String str) {
        return ApmDelegate.m17947a().mo16433b(str);
    }

    /* renamed from: a */
    public final boolean mo16339a(String str) {
        return ApmDelegate.m17947a().mo16431a(str);
    }

    /* renamed from: c */
    public final boolean mo16344c(String str) {
        ApmDelegate a = ApmDelegate.m17947a();
        if (!a.f24748h || a.f24747g == null) {
            return false;
        }
        return a.f24747g.getMetricTypeSwitch(str);
    }

    /* renamed from: a */
    public final void mo16336a(T t) {
        if (mo16341b(t)) {
            mo16343c(t);
            if (this.f24578d) {
                mo16345d(t);
            } else if (t != null) {
                synchronized (this.f24577c) {
                    if (this.f24577c.size() > f24575b) {
                        this.f24577c.poll();
                        C8994d.m17799a().mo16326a("apm_cache_buffer_full");
                    }
                    this.f24577c.add(t);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo16338a(String str, String str2, JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        if (str2 == "fps" && z && jSONObject != null) {
            try {
                JSONObject jSONObject2 = (JSONObject) jSONObject.get("extra_values");
                JSONObject jSONObject3 = (JSONObject) jSONObject.get("extra_status");
                if (!(jSONObject2 == null || jSONObject3 == null)) {
                    String string = jSONObject3.getString("scene");
                    double d = jSONObject2.getDouble("fps");
                    if (!TextUtils.isEmpty(string) && d >= ProfileUiInitOptimizeEnterThreshold.DEFAULT && d <= 60.0d) {
                        C26890h.m65012a("ui_sample_report", new C26898j().mo54849a("ui_scene", string).mo54849a("ui_fps", Double.toString(d)).mo54850a());
                    }
                }
            } catch (JSONException unused) {
            }
        }
        mo16340b(str, str2, jSONObject, z, z2, z3);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x007c */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087 A[Catch:{ Exception -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1 A[Catch:{ Exception -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d2 A[Catch:{ Exception -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd A[Catch:{ Exception -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e7 A[Catch:{ Exception -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0104 A[Catch:{ Exception -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0112 A[Catch:{ Exception -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16340b(final java.lang.String r8, final java.lang.String r9, final org.json.JSONObject r10, boolean r11, boolean r12, boolean r13) {
        /*
            r7 = this;
            java.lang.String r0 = "timer"
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 != 0) goto L_0x007c
            if (r10 != 0) goto L_0x0010
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            goto L_0x0011
        L_0x0010:
            r0 = r10
        L_0x0011:
            com.bytedance.apm.core.b r1 = com.bytedance.apm.C8976c.m17754j()     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = r1.mo16302b()     // Catch:{ Exception -> 0x007c }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x007c }
            if (r2 != 0) goto L_0x0024
            java.lang.String r2 = "session_id"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x007c }
        L_0x0024:
            java.lang.String r1 = "network_type"
            boolean r1 = r0.isNull(r1)     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = "network_type"
            android.content.Context r2 = com.bytedance.apm.C8976c.m17736a()     // Catch:{ Exception -> 0x007c }
            com.bytedance.common.utility.l$a r2 = com.bytedance.apm.p501q.C9193j.m18260c(r2)     // Catch:{ Exception -> 0x007c }
            int r2 = r2.getValue()     // Catch:{ Exception -> 0x007c }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x007c }
        L_0x003d:
            android.content.Context r1 = com.bytedance.apm.C8976c.m17736a()     // Catch:{ Exception -> 0x007c }
            int r1 = com.bytedance.apm.p501q.C9193j.m18258a(r1)     // Catch:{ Exception -> 0x007c }
            r2 = -10000(0xffffffffffffd8f0, float:NaN)
            if (r1 == r2) goto L_0x004e
            java.lang.String r2 = "network_type_code"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x007c }
        L_0x004e:
            java.lang.String r1 = "timestamp"
            boolean r1 = r0.isNull(r1)     // Catch:{ Exception -> 0x007c }
            if (r1 != 0) goto L_0x0062
            java.lang.String r1 = "timestamp"
            long r1 = r0.optLong(r1)     // Catch:{ Exception -> 0x007c }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x006b
        L_0x0062:
            java.lang.String r1 = "timestamp"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x007c }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x007c }
        L_0x006b:
            java.lang.String r1 = "sid"
            boolean r1 = r0.isNull(r1)     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x007c
            java.lang.String r1 = "sid"
            long r2 = com.bytedance.apm.C8976c.m17749e()     // Catch:{ Exception -> 0x007c }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x007c }
        L_0x007c:
            com.bytedance.apm.f.e r0 = com.bytedance.apm.p480f.C9029e.m17898a()     // Catch:{ Exception -> 0x011c }
            boolean r1 = com.bytedance.apm.C8976c.m17751g()     // Catch:{ Exception -> 0x011c }
            r2 = 0
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = com.bytedance.apm.p488k.C9074a.f24801i     // Catch:{ Exception -> 0x011c }
            r3 = 8
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x011c }
            java.lang.String r4 = "logType"
            r3[r2] = r4     // Catch:{ Exception -> 0x011c }
            r4 = 1
            r3[r4] = r8     // Catch:{ Exception -> 0x011c }
            r4 = 2
            java.lang.String r5 = "subType"
            r3[r4] = r5     // Catch:{ Exception -> 0x011c }
            r4 = 3
            r3[r4] = r9     // Catch:{ Exception -> 0x011c }
            r4 = 4
            java.lang.String r5 = "data"
            r3[r4] = r5     // Catch:{ Exception -> 0x011c }
            r4 = 5
            r3[r4] = r10     // Catch:{ Exception -> 0x011c }
            r4 = 6
            java.lang.String r5 = "sample"
            r3[r4] = r5     // Catch:{ Exception -> 0x011c }
            r4 = 7
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x011c }
            r3[r4] = r5     // Catch:{ Exception -> 0x011c }
            com.bytedance.apm.p488k.C9079d.m17981a(r1, r3)     // Catch:{ Exception -> 0x011c }
        L_0x00b3:
            boolean r1 = r0.f24628a     // Catch:{ Exception -> 0x011c }
            if (r1 != 0) goto L_0x0122
            if (r11 != 0) goto L_0x00bd
            boolean r1 = r0.f24631d     // Catch:{ Exception -> 0x011c }
            if (r1 == 0) goto L_0x0122
        L_0x00bd:
            java.lang.String r1 = "timestamp"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x011c }
            long r3 = r10.optLong(r1, r3)     // Catch:{ Exception -> 0x011c }
            r1 = -1
            int r5 = r8.hashCode()     // Catch:{ Exception -> 0x011c }
            r6 = -800094724(0xffffffffd04f85fc, float:-1.3926658E10)
            if (r5 == r6) goto L_0x00d2
            goto L_0x00db
        L_0x00d2:
            java.lang.String r5 = "api_all"
            boolean r5 = r8.equals(r5)     // Catch:{ Exception -> 0x011c }
            if (r5 == 0) goto L_0x00db
            r1 = 0
        L_0x00db:
            if (r1 == 0) goto L_0x00e7
            com.bytedance.apm.h.d r1 = new com.bytedance.apm.h.d     // Catch:{ Exception -> 0x011c }
            r1.<init>()     // Catch:{ Exception -> 0x011c }
            com.bytedance.apm.h.d r1 = r1.mo16373a(r8)     // Catch:{ Exception -> 0x011c }
            goto L_0x00f0
        L_0x00e7:
            com.bytedance.apm.h.a r1 = new com.bytedance.apm.h.a     // Catch:{ Exception -> 0x011c }
            r1.<init>()     // Catch:{ Exception -> 0x011c }
            com.bytedance.apm.h.d r1 = r1.mo16373a(r8)     // Catch:{ Exception -> 0x011c }
        L_0x00f0:
            r1.f24683h = r9     // Catch:{ Exception -> 0x011c }
            com.bytedance.apm.h.d r1 = r1.mo16370a(r10)     // Catch:{ Exception -> 0x011c }
            r1.f24687l = r11     // Catch:{ Exception -> 0x011c }
            com.bytedance.frameworks.core.apm.a r11 = com.bytedance.frameworks.core.apm.C9926a.m19912a()     // Catch:{ Exception -> 0x011c }
            long r5 = r11.f27000a     // Catch:{ Exception -> 0x011c }
            r1.f24685j = r5     // Catch:{ Exception -> 0x011c }
            r1.f24686k = r3     // Catch:{ Exception -> 0x011c }
            if (r13 == 0) goto L_0x0112
            com.bytedance.apm.m.c r11 = com.bytedance.apm.p493m.C9139c.m18134a()     // Catch:{ Exception -> 0x011c }
            boolean r11 = r11.mo16512a(r1)     // Catch:{ Exception -> 0x011c }
            if (r11 != 0) goto L_0x0122
            com.bytedance.apm.p480f.C9029e.m17901b(r1)     // Catch:{ Exception -> 0x011c }
            goto L_0x0122
        L_0x0112:
            if (r12 == 0) goto L_0x0118
            com.bytedance.apm.p480f.C9029e.m17901b(r1)     // Catch:{ Exception -> 0x011c }
            goto L_0x0122
        L_0x0118:
            r0.mo16359a(r1)     // Catch:{ Exception -> 0x011c }
            goto L_0x0122
        L_0x011c:
            r11 = move-exception
            java.lang.String r12 = "apm_basepipeline_logSend"
            com.bytedance.p502b.p503a.p506b.p508b.C9220a.m18312a(r11, r12)
        L_0x0122:
            com.bytedance.apm.i.a r11 = r7.f24576a
            if (r11 == 0) goto L_0x0132
            com.bytedance.apm.internal.ApmDelegate r11 = com.bytedance.apm.internal.ApmDelegate.m17947a()
            com.bytedance.apm.f.a$1 r12 = new com.bytedance.apm.f.a$1
            r12.<init>(r8, r9, r10)
            r11.mo16430a(r12)
        L_0x0132:
            java.lang.String r9 = "ui_action"
            boolean r8 = android.text.TextUtils.equals(r8, r9)
            if (r8 == 0) goto L_0x0154
            com.bytedance.apm.f.c.a r8 = com.bytedance.apm.p480f.p483c.C9027a.m17890a()
            com.bytedance.apm.n.a<org.json.JSONObject> r8 = r8.f24627a
            java.util.LinkedList<T> r9 = r8.f25054a
            int r9 = r9.size()
            int r11 = r8.f25055b
            if (r9 <= r11) goto L_0x014f
            java.util.LinkedList<T> r9 = r8.f25054a
            r9.removeFirst()
        L_0x014f:
            java.util.LinkedList<T> r8 = r8.f25054a
            r8.addLast(r10)
        L_0x0154:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p480f.C9012a.mo16340b(java.lang.String, java.lang.String, org.json.JSONObject, boolean, boolean, boolean):void");
    }
}
