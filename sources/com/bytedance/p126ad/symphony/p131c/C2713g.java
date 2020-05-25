package com.bytedance.p126ad.symphony.p131c;

import com.bytedance.p126ad.symphony.p127a.C2673a;
import com.bytedance.p126ad.symphony.p127a.C2679b;
import com.bytedance.p126ad.symphony.p132d.C2718b;
import com.bytedance.p126ad.symphony.p132d.C2719c;
import com.bytedance.p126ad.symphony.p134e.C2729b;
import com.bytedance.p126ad.symphony.p139i.C2742a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.c.g */
public class C2713g {

    /* renamed from: a */
    public static C2718b f8210a = null;

    /* renamed from: b */
    public static C2719c f8211b = null;

    /* renamed from: c */
    private static final String f8212c = "g";

    /* renamed from: a */
    public static boolean m7767a() {
        if (f8210a == null && f8211b == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m7762a(C2673a aVar) {
        if (m7767a() && aVar != null) {
            m7764a("ad_sdk_slot_fill", aVar);
        }
    }

    /* renamed from: a */
    public static void m7763a(String str) {
        if (m7767a()) {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_placement_type_prefix", str);
            m7765a("ad_request_chain_fail_reset", "", 0, null, hashMap);
        }
    }

    /* renamed from: a */
    public static void m7764a(String str, C2673a aVar) {
        if (aVar != null && aVar.mo7232a() != null && !(aVar instanceof C2679b)) {
            C2729b a = aVar.mo7232a();
            a.mo7280a();
            m7765a(str, a.f8256g, a.f8253d, a.f8254e, a.mo7280a());
        }
    }

    /* renamed from: a */
    public static void m7765a(String str, String str2, long j, JSONObject jSONObject, Map<String, Object> map) {
        m7766a(str, str2, j, jSONObject, map, false);
    }

    /* renamed from: a */
    public static void m7766a(String str, String str2, long j, JSONObject jSONObject, Map<String, Object> map, boolean z) {
        if (m7767a()) {
            final String str3 = str;
            final String str4 = str2;
            final long j2 = j;
            final JSONObject jSONObject2 = jSONObject;
            final Map<String, Object> map2 = map;
            final boolean z2 = z;
            C27141 r1 = new Runnable() {
                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0071 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r14 = this;
                        java.lang.String r2 = r2     // Catch:{ Exception -> 0x00b9 }
                        java.lang.String r1 = r3     // Catch:{ Exception -> 0x00b9 }
                        long r8 = r4     // Catch:{ Exception -> 0x00b9 }
                        org.json.JSONObject r10 = r6     // Catch:{ Exception -> 0x00b9 }
                        java.util.Map r11 = r7     // Catch:{ Exception -> 0x00b9 }
                        boolean r12 = r8     // Catch:{ Exception -> 0x00b9 }
                        com.bytedance.ad.symphony.d.b r0 = com.bytedance.p126ad.symphony.p131c.C2713g.f8210a     // Catch:{ Exception -> 0x00b9 }
                        r13 = 1
                        if (r0 == 0) goto L_0x0079
                        org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b9 }
                        r7.<init>()     // Catch:{ Exception -> 0x00b9 }
                        if (r11 == 0) goto L_0x001e
                        java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x00b9 }
                        r0.<init>(r11)     // Catch:{ Exception -> 0x00b9 }
                        goto L_0x0023
                    L_0x001e:
                        java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x00b9 }
                        r0.<init>()     // Catch:{ Exception -> 0x00b9 }
                    L_0x0023:
                        org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0071 }
                        r3.<init>()     // Catch:{ Exception -> 0x0071 }
                        java.util.Set r4 = r0.keySet()     // Catch:{ Exception -> 0x0071 }
                        java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0071 }
                    L_0x0030:
                        boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x0071 }
                        if (r5 == 0) goto L_0x0044
                        java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x0071 }
                        java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0071 }
                        java.lang.Object r6 = r0.get(r5)     // Catch:{ Exception -> 0x0071 }
                        r3.put(r5, r6)     // Catch:{ Exception -> 0x0071 }
                        goto L_0x0030
                    L_0x0044:
                        java.lang.String r0 = "ad_extra_data"
                        java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0071 }
                        r7.put(r0, r3)     // Catch:{ Exception -> 0x0071 }
                        java.lang.String r0 = "is_ad_event"
                        r7.put(r0, r13)     // Catch:{ Exception -> 0x0071 }
                        java.lang.String r0 = "ad_slot_receive"
                        boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0071 }
                        if (r0 != 0) goto L_0x0066
                        java.lang.String r0 = "is_i18n_sdk"
                        r7.put(r0, r13)     // Catch:{ Exception -> 0x0071 }
                        java.lang.String r0 = "refer"
                        java.lang.String r3 = "sdk"
                        r7.put(r0, r3)     // Catch:{ Exception -> 0x0071 }
                    L_0x0066:
                        if (r10 == 0) goto L_0x0071
                        java.lang.String r0 = "log_extra"
                        java.lang.String r3 = r10.toString()     // Catch:{ Exception -> 0x0071 }
                        r7.put(r0, r3)     // Catch:{ Exception -> 0x0071 }
                    L_0x0071:
                        com.bytedance.ad.symphony.d.b r0 = com.bytedance.p126ad.symphony.p131c.C2713g.f8210a     // Catch:{ Exception -> 0x00b9 }
                        r5 = 0
                        r3 = r8
                        r0.mo7273a(r1, r2, r3, r5, r7)     // Catch:{ Exception -> 0x00b9 }
                    L_0x0079:
                        com.bytedance.ad.symphony.d.c r0 = com.bytedance.p126ad.symphony.p131c.C2713g.f8211b     // Catch:{ Exception -> 0x00b9 }
                        if (r0 == 0) goto L_0x00b8
                        if (r12 != 0) goto L_0x00b8
                        if (r11 == 0) goto L_0x0087
                        java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x00b9 }
                        r0.<init>(r11)     // Catch:{ Exception -> 0x00b9 }
                        goto L_0x008c
                    L_0x0087:
                        java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x00b9 }
                        r0.<init>()     // Catch:{ Exception -> 0x00b9 }
                    L_0x008c:
                        java.lang.String r1 = "_ad_flag"
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x00b9 }
                        r0.put(r1, r2)     // Catch:{ Exception -> 0x00b9 }
                        java.lang.String r1 = "ad_id"
                        java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x00b9 }
                        r0.put(r1, r2)     // Catch:{ Exception -> 0x00b9 }
                        if (r10 == 0) goto L_0x00b8
                        java.util.Iterator r1 = r10.keys()     // Catch:{ Exception -> 0x00b9 }
                    L_0x00a4:
                        boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x00b9 }
                        if (r2 == 0) goto L_0x00b8
                        java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x00b9 }
                        java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b9 }
                        java.lang.Object r3 = r10.opt(r2)     // Catch:{ Exception -> 0x00b9 }
                        r0.put(r2, r3)     // Catch:{ Exception -> 0x00b9 }
                        goto L_0x00a4
                    L_0x00b8:
                        return
                    L_0x00b9:
                        r0 = move-exception
                        com.bytedance.p126ad.symphony.C2715d.m7770a(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p126ad.symphony.p131c.C2713g.C27141.run():void");
                }
            };
            C2742a.m7829a((Runnable) r1);
        }
    }
}
