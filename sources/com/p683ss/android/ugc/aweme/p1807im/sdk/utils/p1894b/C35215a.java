package com.p683ss.android.ugc.aweme.p1807im.sdk.utils.p1894b;

import com.bytedance.p702im.core.p706c.C11207p;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.b.a */
public final class C35215a {

    /* renamed from: a */
    public static final C35215a f90501a = new C35215a();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, C35217c> f90502b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final ConcurrentHashMap<String, Boolean> f90503c = new ConcurrentHashMap<>();

    private C35215a() {
    }

    /* renamed from: a */
    public static final void m79605a(JSONObject jSONObject, C11207p pVar, long j) {
        C35217c cVar;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(pVar, "message");
        String uuid = pVar.getUuid();
        if (uuid != null) {
            f90503c.put(uuid, Boolean.valueOf(true));
        }
        if (uuid == null) {
            cVar = null;
        } else {
            C35217c cVar2 = (C35217c) f90502b.get(uuid);
            if (cVar2 != null) {
                f90502b.remove(uuid);
            }
            cVar = cVar2;
        }
        if (cVar != null) {
            if (cVar != null) {
                Long l = cVar.f90507c;
                if (l != null) {
                    jSONObject.put("last_network_delay_duration", String.valueOf(l.longValue()));
                }
            }
            if (cVar != null) {
                C35218d dVar = cVar.f90506b;
                if (dVar != null) {
                    jSONObject.put("last_method", dVar.getReportName());
                }
            }
            int i = 0;
            JSONArray jSONArray = new JSONArray();
            long j2 = 0;
            while (cVar != null) {
                Long l2 = cVar.f90507c;
                JSONObject jSONObject2 = new JSONObject();
                String str = "method";
                if (cVar == null) {
                    C52711k.m112234a();
                }
                jSONObject2.put(str, cVar.f90506b.getReportName());
                if (l2 != null) {
                    jSONObject2.put("delay_duration", String.valueOf(l2.longValue()));
                    j2 += l2.longValue();
                }
                jSONArray.put(jSONObject2);
                i++;
                cVar = cVar.f90505a;
            }
            jSONObject.put("retry_cnt", String.valueOf(i));
            jSONObject.put("retry_info", jSONArray);
            if (j > 0) {
                jSONObject.put("sdk_delay_duration", String.valueOf(j - j2));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0165 A[Catch:{ all -> 0x000d }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0170 A[DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void m79604a(java.lang.String r12, java.util.Map<java.lang.String, java.lang.Object> r13, java.util.Map<java.lang.String, java.lang.Object> r14) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.utils.b.a> r14 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.p1894b.C35215a.class
            monitor-enter(r14)
            r0 = 0
            if (r13 == 0) goto L_0x0010
            java.lang.String r1 = "cmd"
            java.lang.Object r1 = r13.get(r1)     // Catch:{ all -> 0x000d }
            goto L_0x0011
        L_0x000d:
            r12 = move-exception
            goto L_0x0172
        L_0x0010:
            r1 = r0
        L_0x0011:
            boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x000d }
            if (r2 != 0) goto L_0x0016
            r1 = r0
        L_0x0016:
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x000d }
            int r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.p1894b.C35216b.f90504a     // Catch:{ all -> 0x000d }
            if (r1 != 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            int r3 = r1.intValue()     // Catch:{ all -> 0x000d }
            if (r3 == r2) goto L_0x0039
        L_0x0023:
            r12 = 2
            java.lang.String r13 = "MessageTimeLogUtil"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x000d }
            java.lang.String r2 = "ignore event:"
            r0.<init>(r2)     // Catch:{ all -> 0x000d }
            r0.append(r1)     // Catch:{ all -> 0x000d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x000d }
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r12, r13, r0)     // Catch:{ all -> 0x000d }
            monitor-exit(r14)
            return
        L_0x0039:
            java.lang.String r1 = "message_uuid"
            java.lang.Object r1 = r13.get(r1)     // Catch:{ all -> 0x000d }
            boolean r2 = r1 instanceof java.lang.String     // Catch:{ all -> 0x000d }
            if (r2 != 0) goto L_0x0044
            r1 = r0
        L_0x0044:
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x000d }
            if (r1 != 0) goto L_0x006a
            java.lang.String r0 = "error_find_send_message"
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x000d }
            r1.<init>()     // Catch:{ all -> 0x000d }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x000d }
            java.lang.String r2 = "error_msg"
            java.lang.String r3 = "no_uuid"
            r1.put(r2, r3)     // Catch:{ all -> 0x000d }
            java.lang.String r2 = "error_desc"
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x000d }
            java.lang.String r12 = p2628d.p2639f.p2641b.C52711k.m112231a(r12, r13)     // Catch:{ all -> 0x000d }
            r1.put(r2, r12)     // Catch:{ all -> 0x000d }
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79731b(r0, r1)     // Catch:{ all -> 0x000d }
            monitor-exit(r14)
            return
        L_0x006a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r2 = f90503c     // Catch:{ all -> 0x000d }
            boolean r2 = r2.contains(r1)     // Catch:{ all -> 0x000d }
            if (r2 == 0) goto L_0x0097
            java.lang.String r2 = "error_find_send_message"
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch:{ all -> 0x000d }
            r3.<init>()     // Catch:{ all -> 0x000d }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x000d }
            java.lang.String r4 = "error_msg"
            java.lang.String r5 = "uuid_already_send"
            r3.put(r4, r5)     // Catch:{ all -> 0x000d }
            java.lang.String r4 = "message_uuid"
            r3.put(r4, r1)     // Catch:{ all -> 0x000d }
            java.lang.String r4 = "error_desc"
            java.lang.String r5 = r13.toString()     // Catch:{ all -> 0x000d }
            java.lang.String r5 = p2628d.p2639f.p2641b.C52711k.m112231a(r12, r5)     // Catch:{ all -> 0x000d }
            r3.put(r4, r5)     // Catch:{ all -> 0x000d }
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79731b(r2, r3)     // Catch:{ all -> 0x000d }
        L_0x0097:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.im.sdk.utils.b.c> r2 = f90502b     // Catch:{ all -> 0x000d }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x000d }
            com.ss.android.ugc.aweme.im.sdk.utils.b.c r2 = (com.p683ss.android.ugc.aweme.p1807im.sdk.utils.p1894b.C35217c) r2     // Catch:{ all -> 0x000d }
            java.lang.String r3 = "error"
            java.lang.Object r3 = r13.get(r3)     // Catch:{ all -> 0x000d }
            if (r3 == 0) goto L_0x00ac
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x000d }
            goto L_0x00ad
        L_0x00ac:
            r3 = r0
        L_0x00ad:
            java.lang.String r4 = "duration"
            java.lang.Object r4 = r13.get(r4)     // Catch:{ all -> 0x000d }
            r7 = r4
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x000d }
            if (r12 != 0) goto L_0x00ba
            goto L_0x013d
        L_0x00ba:
            int r4 = r12.hashCode()     // Catch:{ all -> 0x000d }
            r5 = 3804(0xedc, float:5.33E-42)
            if (r4 == r5) goto L_0x010c
            r3 = 3213448(0x310888, float:4.503E-39)
            if (r4 == r3) goto L_0x00c9
            goto L_0x013d
        L_0x00c9:
            java.lang.String r3 = "http"
            boolean r3 = r12.equals(r3)     // Catch:{ all -> 0x000d }
            if (r3 == 0) goto L_0x013d
            java.lang.String r12 = "success"
            java.lang.Object r12 = r13.get(r12)     // Catch:{ all -> 0x000d }
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x000d }
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r12, r0)     // Catch:{ all -> 0x000d }
            if (r12 == 0) goto L_0x00f7
            com.ss.android.ugc.aweme.im.sdk.utils.b.c r12 = new com.ss.android.ugc.aweme.im.sdk.utils.b.c     // Catch:{ all -> 0x000d }
            com.ss.android.ugc.aweme.im.sdk.utils.b.d r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.p1894b.C35218d.HTTP     // Catch:{ all -> 0x000d }
            r8 = 0
            java.lang.String r0 = "url"
            java.lang.Object r13 = r13.get(r0)     // Catch:{ all -> 0x000d }
            r9 = r13
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x000d }
            r10 = 4
            r11 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x000d }
            goto L_0x0163
        L_0x00f7:
            com.ss.android.ugc.aweme.im.sdk.utils.b.c r12 = new com.ss.android.ugc.aweme.im.sdk.utils.b.c     // Catch:{ all -> 0x000d }
            com.ss.android.ugc.aweme.im.sdk.utils.b.d r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.p1894b.C35218d.HTTP     // Catch:{ all -> 0x000d }
            r8 = 0
            java.lang.String r0 = "url"
            java.lang.Object r13 = r13.get(r0)     // Catch:{ all -> 0x000d }
            r9 = r13
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x000d }
            r10 = 4
            r11 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x000d }
            goto L_0x0163
        L_0x010c:
            java.lang.String r4 = "ws"
            boolean r4 = r12.equals(r4)     // Catch:{ all -> 0x000d }
            if (r4 == 0) goto L_0x013d
            java.lang.String r12 = "retry"
            java.lang.Object r12 = r13.get(r12)     // Catch:{ all -> 0x000d }
            r8 = r12
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x000d }
            boolean r12 = com.p683ss.android.ugc.aweme.utils.C47891fl.m103593a(r3)     // Catch:{ all -> 0x000d }
            if (r12 == 0) goto L_0x0130
            com.ss.android.ugc.aweme.im.sdk.utils.b.c r12 = new com.ss.android.ugc.aweme.im.sdk.utils.b.c     // Catch:{ all -> 0x000d }
            com.ss.android.ugc.aweme.im.sdk.utils.b.d r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.p1894b.C35218d.WS     // Catch:{ all -> 0x000d }
            r9 = 0
            r10 = 8
            r11 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x000d }
            goto L_0x0163
        L_0x0130:
            com.ss.android.ugc.aweme.im.sdk.utils.b.c r12 = new com.ss.android.ugc.aweme.im.sdk.utils.b.c     // Catch:{ all -> 0x000d }
            com.ss.android.ugc.aweme.im.sdk.utils.b.d r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.p1894b.C35218d.WS     // Catch:{ all -> 0x000d }
            r9 = 0
            r10 = 8
            r11 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x000d }
            goto L_0x0163
        L_0x013d:
            java.lang.String r3 = "error_find_send_message"
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ all -> 0x000d }
            r4.<init>()     // Catch:{ all -> 0x000d }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x000d }
            java.lang.String r5 = "error_msg"
            java.lang.String r6 = "name_not_right"
            r4.put(r5, r6)     // Catch:{ all -> 0x000d }
            java.lang.String r5 = "message_uuid"
            r4.put(r5, r1)     // Catch:{ all -> 0x000d }
            java.lang.String r5 = "error_desc"
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x000d }
            java.lang.String r12 = p2628d.p2639f.p2641b.C52711k.m112231a(r12, r13)     // Catch:{ all -> 0x000d }
            r4.put(r5, r12)     // Catch:{ all -> 0x000d }
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79731b(r3, r4)     // Catch:{ all -> 0x000d }
            r12 = r0
        L_0x0163:
            if (r12 == 0) goto L_0x0170
            r12.f90505a = r2     // Catch:{ all -> 0x000d }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.im.sdk.utils.b.c> r13 = f90502b     // Catch:{ all -> 0x000d }
            java.util.Map r13 = (java.util.Map) r13     // Catch:{ all -> 0x000d }
            r13.put(r1, r12)     // Catch:{ all -> 0x000d }
            monitor-exit(r14)
            return
        L_0x0170:
            monitor-exit(r14)
            return
        L_0x0172:
            monitor-exit(r14)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.utils.p1894b.C35215a.m79604a(java.lang.String, java.util.Map, java.util.Map):void");
    }
}
