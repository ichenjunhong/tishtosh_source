package com.p683ss.android.p1103ad.p1104a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.C2240a;
import com.bytedance.android.livesdk.chatroom.p325ui.C6162et;
import com.p683ss.android.p1103ad.p1104a.p1105a.C18514a;
import com.p683ss.android.p1103ad.p1104a.p1107b.C18525a;
import com.p683ss.android.p1103ad.p1104a.p1107b.C18526b.C18528a;
import com.p683ss.android.p1103ad.p1104a.p1107b.C18529c;
import com.p683ss.android.p1103ad.p1104a.p1107b.C18530d;
import com.p683ss.android.p1103ad.p1104a.p1108c.C18532a;
import com.p683ss.android.p1103ad.p1104a.p1108c.C18532a.C18535a;
import com.p683ss.android.p1103ad.p1104a.p1108c.C18536b;
import com.p683ss.android.p1103ad.p1104a.p1108c.C18538d;
import com.p683ss.android.p1103ad.p1104a.p1108c.C18541f;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.a.d */
public class C18542d {

    /* renamed from: i */
    private static volatile C18542d f51094i;

    /* renamed from: a */
    C18522b f51095a;

    /* renamed from: b */
    C18530d f51096b;

    /* renamed from: c */
    String f51097c;

    /* renamed from: d */
    public C18525a f51098d = new C18525a();

    /* renamed from: e */
    public C18529c f51099e = new C18529c();

    /* renamed from: f */
    public String f51100f;

    /* renamed from: g */
    private C18511a f51101g;

    /* renamed from: h */
    private Context f51102h;

    private C18542d() {
    }

    /* renamed from: a */
    public static C18542d m44864a() {
        if (f51094i == null) {
            synchronized (C18542d.class) {
                if (f51094i == null) {
                    f51094i = new C18542d();
                }
            }
        }
        return f51094i;
    }

    /* renamed from: b */
    public final void mo37813b() {
        int i;
        if (this.f51095a.f51035c == 0 || TextUtils.isEmpty(this.f51095a.f51034b) || TextUtils.isEmpty(C18531c.m44842a())) {
            if (mo37812a(this.f51097c)) {
                this.f51096b.mo37805b(new C18528a().mo37802a(this.f51097c).mo37801a(1).mo37803a());
            } else {
                this.f51096b.mo37805b(new C18528a().mo37802a(this.f51097c).mo37801a(4).mo37803a());
            }
            this.f51100f = null;
            return;
        }
        String a = C2240a.m6772a("%s/%s?k=%s", new Object[]{C18531c.m44842a(), "tfe/route/clue/meta/smart-phone/get-virtual-number", this.f51095a.f51034b});
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        hashMap.put("Cache-Control", "no-cache");
        hashMap.put("Postman-Token", "ca8e2443-9898-31db-e18f-131e9517cbd1");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt("instance_id", Long.valueOf(this.f51095a.f51035c));
            if (this.f51095a.f51037e > 0) {
                jSONObject.putOpt("scenario", Integer.valueOf(this.f51095a.f51037e));
            }
            jSONObject.putOpt("behaviors", m44865a(this.f51095a.f51038f.longValue()));
            jSONObject.putOpt("log_id", C18541f.m44863a(Long.valueOf(this.f51095a.f51035c)));
            jSONObject2.putOpt("device_id", this.f51101g.mo37773c());
            jSONObject2.putOpt("uid", this.f51101g.mo37774d());
            if (!TextUtils.isEmpty(this.f51101g.mo37775e())) {
                jSONObject2.putOpt("user_id", Long.valueOf(Long.parseLong(this.f51101g.mo37775e())));
            }
            jSONObject2.putOpt("app_version", this.f51101g.mo37772b());
            jSONObject2.putOpt("version_code", this.f51101g.mo37776f());
            jSONObject2.putOpt("app_id", this.f51101g.mo37771a());
            jSONObject2.putOpt("ad_id", this.f51095a.mo37788a());
            jSONObject2.putOpt("short_id", this.f51101g.mo37777g());
            jSONObject2.putOpt("site_id", this.f51095a.mo37792e());
            jSONObject2.putOpt("cid", this.f51095a.mo37789b());
            jSONObject2.putOpt("page_url", this.f51095a.mo37791d());
            jSONObject2.putOpt("page_type", Integer.valueOf(this.f51095a.f51033a));
            jSONObject2.putOpt("os", "android");
            jSONObject2.putOpt("log_extra", this.f51095a.mo37790c());
            if (TextUtils.isEmpty(this.f51095a.f51039g)) {
                jSONObject2.putOpt("caller", "creative");
            } else {
                jSONObject2.putOpt("caller", this.f51095a.f51039g);
            }
            jSONObject.putOpt("convert_data", jSONObject2.toString());
            String jSONObject3 = jSONObject.toString();
            hashMap.put("Agw-Auth", C18536b.m44852a(jSONObject3));
            final long currentTimeMillis = System.currentTimeMillis();
            if (C18531c.m44844b() != null) {
                new Object() {
                };
                return;
            }
            if (C18531c.m44846d() != 0) {
                i = C18531c.m44846d();
            } else {
                i = 2000;
            }
            C18532a.m44850a(a, hashMap, jSONObject3, i, new C18535a() {
                /* JADX WARNING: Removed duplicated region for block: B:29:0x00e7 A[Catch:{ Exception -> 0x012b }] */
                /* JADX WARNING: Removed duplicated region for block: B:30:0x0109 A[Catch:{ Exception -> 0x012b }] */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo37808a(com.p683ss.android.p1103ad.p1104a.p1105a.p1106a.C18515a r9) {
                    /*
                        r8 = this;
                        long r0 = java.lang.System.currentTimeMillis()
                        long r2 = r4
                        long r0 = r0 - r2
                        org.json.JSONObject r2 = new org.json.JSONObject
                        r2.<init>()
                        java.lang.String r3 = "request_time"
                        java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x0015 }
                        r2.putOpt(r3, r0)     // Catch:{ JSONException -> 0x0015 }
                    L_0x0015:
                        com.ss.android.ad.a.a.g r0 = com.p683ss.android.p1103ad.p1104a.C18531c.m44845c()
                        java.lang.String r1 = "service_smartphone_network"
                        r3 = 0
                        r4 = 0
                        r0.mo37787a(r1, r3, r2, r4)
                        com.ss.android.ad.a.d r0 = com.p683ss.android.p1103ad.p1104a.C18542d.this
                        r0.f51100f = r4
                        r1 = 3
                        r2 = 4
                        r5 = 1
                        if (r9 == 0) goto L_0x008b
                        int r6 = r9.f51032b     // Catch:{ Exception -> 0x012b }
                        r7 = 200(0xc8, float:2.8E-43)
                        if (r6 != r7) goto L_0x008b
                        java.lang.String r9 = r9.f51031a     // Catch:{ Exception -> 0x012b }
                        boolean r6 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x012b }
                        if (r6 != 0) goto L_0x00df
                        org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x012b }
                        r6.<init>(r9)     // Catch:{ Exception -> 0x012b }
                        java.lang.String r9 = "status_code"
                        int r9 = r6.optInt(r9)     // Catch:{ Exception -> 0x012b }
                        java.lang.String r7 = "virtual_number"
                        java.lang.String r6 = r6.optString(r7)     // Catch:{ Exception -> 0x012b }
                        if (r9 != 0) goto L_0x00df
                        boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x012b }
                        if (r9 != 0) goto L_0x00df
                        boolean r9 = r0.mo37812a(r6)     // Catch:{ Exception -> 0x012b }
                        if (r9 == 0) goto L_0x00df
                        com.ss.android.ad.a.b.b$a r9 = new com.ss.android.ad.a.b.b$a     // Catch:{ Exception -> 0x012b }
                        r9.<init>()     // Catch:{ Exception -> 0x012b }
                        r9.f51065c = r6     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.b$a r9 = r9.mo37801a(r3)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.b r9 = r9.mo37803a()     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.d r1 = r0.f51096b     // Catch:{ Exception -> 0x012b }
                        r1.mo37804a(r9)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b r9 = r0.f51095a     // Catch:{ Exception -> 0x012b }
                        java.lang.String r9 = r9.mo37789b()     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b r1 = r0.f51095a     // Catch:{ Exception -> 0x012b }
                        java.lang.String r1 = r1.mo37793f()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r2 = "get_number"
                        com.ss.android.ad.a.b r0 = r0.f51095a     // Catch:{ Exception -> 0x012b }
                        java.lang.String r0 = r0.mo37790c()     // Catch:{ Exception -> 0x012b }
                        com.p683ss.android.p1103ad.p1104a.C18531c.m44843a(r9, r1, r2, r0)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.a.g r9 = com.p683ss.android.p1103ad.p1104a.C18531c.m44845c()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r0 = "service_smartphone_type"
                        r9.mo37787a(r0, r3, r4, r4)     // Catch:{ Exception -> 0x012b }
                        return
                    L_0x008b:
                        if (r9 == 0) goto L_0x00df
                        int r9 = r9.f51032b     // Catch:{ Exception -> 0x012b }
                        r3 = -1
                        if (r9 != r3) goto L_0x00df
                        java.lang.String r9 = r0.f51097c     // Catch:{ Exception -> 0x012b }
                        boolean r9 = r0.mo37812a(r9)     // Catch:{ Exception -> 0x012b }
                        if (r9 == 0) goto L_0x00bd
                        com.ss.android.ad.a.b.b$a r9 = new com.ss.android.ad.a.b.b$a     // Catch:{ Exception -> 0x012b }
                        r9.<init>()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r1 = r0.f51097c     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.b$a r9 = r9.mo37802a(r1)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.b$a r9 = r9.mo37801a(r5)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.b r9 = r9.mo37803a()     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.d r0 = r0.f51096b     // Catch:{ Exception -> 0x012b }
                        r0.mo37805b(r9)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.a.g r9 = com.p683ss.android.p1103ad.p1104a.C18531c.m44845c()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r0 = "service_smartphone_type"
                        r1 = 2
                        r9.mo37787a(r0, r1, r4, r4)     // Catch:{ Exception -> 0x012b }
                        goto L_0x012b
                    L_0x00bd:
                        com.ss.android.ad.a.b.b$a r9 = new com.ss.android.ad.a.b.b$a     // Catch:{ Exception -> 0x012b }
                        r9.<init>()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r3 = r0.f51097c     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.b$a r9 = r9.mo37802a(r3)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.b$a r9 = r9.mo37801a(r2)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.b r9 = r9.mo37803a()     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.d r0 = r0.f51096b     // Catch:{ Exception -> 0x012b }
                        r0.mo37805b(r9)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.a.g r9 = com.p683ss.android.p1103ad.p1104a.C18531c.m44845c()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r0 = "service_smartphone_type"
                        r9.mo37787a(r0, r1, r4, r4)     // Catch:{ Exception -> 0x012b }
                        return
                    L_0x00df:
                        java.lang.String r9 = r0.f51097c     // Catch:{ Exception -> 0x012b }
                        boolean r9 = r0.mo37812a(r9)     // Catch:{ Exception -> 0x012b }
                        if (r9 == 0) goto L_0x0109
                        com.ss.android.ad.a.b.b$a r9 = new com.ss.android.ad.a.b.b$a     // Catch:{ Exception -> 0x012b }
                        r9.<init>()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r1 = r0.f51097c     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.b$a r9 = r9.mo37802a(r1)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.b$a r9 = r9.mo37801a(r5)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.b r9 = r9.mo37803a()     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.d r0 = r0.f51096b     // Catch:{ Exception -> 0x012b }
                        r0.mo37805b(r9)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.a.g r9 = com.p683ss.android.p1103ad.p1104a.C18531c.m44845c()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r0 = "service_smartphone_type"
                        r9.mo37787a(r0, r5, r4, r4)     // Catch:{ Exception -> 0x012b }
                        goto L_0x012b
                    L_0x0109:
                        com.ss.android.ad.a.b.b$a r9 = new com.ss.android.ad.a.b.b$a     // Catch:{ Exception -> 0x012b }
                        r9.<init>()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r3 = r0.f51097c     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.b$a r9 = r9.mo37802a(r3)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.b$a r9 = r9.mo37801a(r2)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.b r9 = r9.mo37803a()     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.b.d r0 = r0.f51096b     // Catch:{ Exception -> 0x012b }
                        r0.mo37805b(r9)     // Catch:{ Exception -> 0x012b }
                        com.ss.android.ad.a.a.g r9 = com.p683ss.android.p1103ad.p1104a.C18531c.m44845c()     // Catch:{ Exception -> 0x012b }
                        java.lang.String r0 = "service_smartphone_type"
                        r9.mo37787a(r0, r1, r4, r4)     // Catch:{ Exception -> 0x012b }
                        return
                    L_0x012b:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1103ad.p1104a.C18542d.C185453.mo37808a(com.ss.android.ad.a.a.a.a):void");
                }
            });
        } catch (Exception unused) {
            this.f51100f = null;
        }
    }

    /* renamed from: a */
    private static JSONArray m44865a(long j) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("at", "13");
            jSONObject.putOpt(C6162et.f16534a, "13");
            jSONObject.putOpt("ts", Long.valueOf(j));
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo37812a(String str) {
        if (TextUtils.isEmpty(str) || this.f51102h == null) {
            return false;
        }
        Context context = this.f51102h;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                StringBuilder sb = new StringBuilder("tel:");
                sb.append(Uri.encode(str));
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(sb.toString()));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo37811a(Activity activity, final C18522b bVar, final C18530d dVar) {
        boolean z;
        boolean z2;
        String str;
        if (activity == null || bVar == null) {
            dVar.mo37805b(new C18528a().mo37801a(4).mo37803a());
            this.f51100f = null;
            return;
        }
        String l = Long.toString(bVar.f51035c);
        String f = bVar.mo37793f();
        String a = bVar.mo37788a();
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(f);
        sb.append(a);
        String sb2 = sb.toString();
        if (TextUtils.equals(sb2, this.f51100f)) {
            z = true;
        } else {
            this.f51100f = sb2;
            z = false;
        }
        if (!z) {
            if (this.f51102h == null) {
                this.f51102h = C18531c.m44849g();
            }
            TelephonyManager telephonyManager = (TelephonyManager) this.f51102h.getSystemService("phone");
            if (telephonyManager == null || 1 != telephonyManager.getSimState()) {
                if (System.getInt(C18531c.m44849g().getContentResolver(), "airplane_mode_on", 0) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (C18531c.m44847e() != 0) {
                        C18538d.m44856a(this.f51102h, C18531c.m44847e());
                    } else {
                        C18538d.m44856a(this.f51102h, R.string.dkn);
                    }
                    this.f51100f = null;
                    dVar.mo37805b(new C18528a().mo37801a(2).mo37803a());
                    return;
                }
                this.f51095a = bVar;
                this.f51096b = dVar;
                if (bVar.f51036d != null) {
                    str = bVar.f51036d;
                } else {
                    str = "";
                }
                this.f51097c = str;
                this.f51101g = C18531c.f51069c.mo37780a();
                if (VERSION.SDK_INT < 23) {
                    mo37813b();
                } else if (activity instanceof Activity) {
                    C18531c.f51067a.mo37786a(C18541f.m44861a((Context) activity), new String[]{"android.permission.READ_PHONE_STATE"}, new C18514a() {
                        /* renamed from: a */
                        public final void mo37779a() {
                            C18542d.this.mo37813b();
                        }
                    });
                }
                C18531c.m44843a(bVar.mo37789b(), bVar.mo37793f(), "click_phone", bVar.mo37790c());
                return;
            }
            dVar.mo37805b(new C18528a().mo37801a(3).mo37803a());
            if (C18531c.m44848f() != 0) {
                C18538d.m44856a(this.f51102h, C18531c.m44848f());
            } else {
                C18538d.m44856a(this.f51102h, R.string.dko);
            }
            this.f51100f = null;
        }
    }
}
