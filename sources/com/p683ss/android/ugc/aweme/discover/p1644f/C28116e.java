package com.p683ss.android.ugc.aweme.discover.p1644f;

import com.p683ss.android.ugc.aweme.search.model.C41440e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.f.e */
public final class C28116e {

    /* renamed from: a */
    public static final Map<Integer, C28114c> f73839a = new LinkedHashMap();

    /* renamed from: b */
    public static C28114c f73840b;

    /* renamed from: c */
    public static final C28116e f73841c = new C28116e();

    /* renamed from: d */
    private static long f73842d;

    private C28116e() {
    }

    /* renamed from: a */
    public static C28114c m66923a(C41440e eVar) {
        if (eVar == null) {
            return C28115d.m66921a();
        }
        C28114c cVar = (C28114c) f73839a.get(Integer.valueOf(eVar.getId()));
        if (cVar == null) {
            cVar = C28115d.m66921a();
        }
        return cVar;
    }

    /* renamed from: a */
    private static void m66924a(JSONObject jSONObject) {
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj = jSONObject.get((String) keys.next());
            if (((obj instanceof Integer) && ((Number) obj).intValue() < 0) || ((obj instanceof Long) && ((Number) obj).longValue() < 0)) {
                keys.remove();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c9 A[Catch:{ Exception -> 0x021e, all -> 0x022e }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e4 A[Catch:{ Exception -> 0x021e, all -> 0x022e }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ff A[Catch:{ Exception -> 0x021e, all -> 0x022e }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011a A[Catch:{ Exception -> 0x021e, all -> 0x022e }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0135 A[Catch:{ Exception -> 0x021e, all -> 0x022e }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0150 A[Catch:{ Exception -> 0x021e, all -> 0x022e }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56523b(com.p683ss.android.ugc.aweme.search.model.C41440e r15) {
        /*
            r14 = this;
            if (r15 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<java.lang.Integer, com.ss.android.ugc.aweme.discover.f.c> r0 = f73839a
            int r1 = r15.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.discover.f.c r0 = (com.p683ss.android.ugc.aweme.discover.p1644f.C28114c) r0
            if (r0 == 0) goto L_0x023f
            long r1 = r0.f73820a
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x023f
            int r1 = r0.f73831l
            r2 = -1
            if (r1 != r2) goto L_0x0024
            goto L_0x023f
        L_0x0024:
            r1 = 0
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            long r7 = r0.f73820a     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r9 = 0
            long r7 = r5 - r7
            int r7 = (int) r7     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r0.f73828i = r7     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.<init>()     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r8 = "tabType"
            int r9 = r0.f73824e     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r8 = "trigger"
            int r9 = r0.f73825f     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r8 = "displayType"
            int r9 = r0.f73826g     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r8 = "itemCount"
            int r9 = r0.f73827h     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r8 = "cost"
            int r9 = r0.f73828i     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r8 = "netCost"
            int r9 = r0.f73829j     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r8 = "netLogId"
            java.lang.String r9 = r0.f73830k     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r8 = "status"
            int r9 = r0.f73831l     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r8 = "errorMsg"
            java.lang.String r9 = r0.f73832m     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r8 = "errorCode"
            int r9 = r0.f73833n     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r8 = "triggerNetStart"
            long r9 = r0.f73821b     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r8 = "triggerStart"
            long r9 = r0.f73820a     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            com.ss.android.ugc.aweme.app.api.h r8 = r0.f73823d     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r8 == 0) goto L_0x01eb
            com.ss.android.ugc.aweme.app.api.h r8 = r0.f73823d     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r8 != 0) goto L_0x0095
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x021e, all -> 0x022e }
        L_0x0095:
            com.ss.android.ugc.aweme.app.api.j r8 = r8.getRequestLog()     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r8 == 0) goto L_0x0165
            java.lang.String r9 = "libcore"
            com.ss.android.ugc.aweme.app.api.j$b r10 = r8.f61325a     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x00a4
            java.lang.String r10 = r10.f61335a     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            goto L_0x00a5
        L_0x00a4:
            r10 = r1
        L_0x00a5:
            r7.put(r9, r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r9 = "body_recv"
            com.ss.android.ugc.aweme.app.api.j$c r10 = r8.f61326b     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x00bf
            com.ss.android.ugc.aweme.app.api.j$a r10 = r10.f61336a     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x00bf
            java.lang.String r10 = r10.f61327a     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x00bf
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            goto L_0x00c0
        L_0x00bf:
            r10 = r1
        L_0x00c0:
            r7.put(r9, r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r9 = "dns"
            com.ss.android.ugc.aweme.app.api.j$c r10 = r8.f61326b     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.app.api.j$a r10 = r10.f61336a     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x00da
            java.lang.String r10 = r10.f61328b     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x00da
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            goto L_0x00db
        L_0x00da:
            r10 = r1
        L_0x00db:
            r7.put(r9, r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r9 = "inner"
            com.ss.android.ugc.aweme.app.api.j$c r10 = r8.f61326b     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.app.api.j$a r10 = r10.f61336a     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x00f5
            java.lang.String r10 = r10.f61329c     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x00f5
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            goto L_0x00f6
        L_0x00f5:
            r10 = r1
        L_0x00f6:
            r7.put(r9, r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r9 = "rtt"
            com.ss.android.ugc.aweme.app.api.j$c r10 = r8.f61326b     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x0110
            com.ss.android.ugc.aweme.app.api.j$a r10 = r10.f61336a     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x0110
            java.lang.String r10 = r10.f61330d     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x0110
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            goto L_0x0111
        L_0x0110:
            r10 = r1
        L_0x0111:
            r7.put(r9, r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r9 = "send"
            com.ss.android.ugc.aweme.app.api.j$c r10 = r8.f61326b     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x012b
            com.ss.android.ugc.aweme.app.api.j$a r10 = r10.f61336a     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x012b
            java.lang.String r10 = r10.f61331e     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x012b
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            goto L_0x012c
        L_0x012b:
            r10 = r1
        L_0x012c:
            r7.put(r9, r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r9 = "tcp"
            com.ss.android.ugc.aweme.app.api.j$c r10 = r8.f61326b     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x0146
            com.ss.android.ugc.aweme.app.api.j$a r10 = r10.f61336a     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x0146
            java.lang.String r10 = r10.f61333g     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r10 == 0) goto L_0x0146
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            goto L_0x0147
        L_0x0146:
            r10 = r1
        L_0x0147:
            r7.put(r9, r10)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r9 = "ttfb"
            com.ss.android.ugc.aweme.app.api.j$c r8 = r8.f61326b     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r8 == 0) goto L_0x0161
            com.ss.android.ugc.aweme.app.api.j$a r8 = r8.f61336a     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r8 == 0) goto L_0x0161
            java.lang.String r8 = r8.f61334h     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r8 == 0) goto L_0x0161
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            goto L_0x0162
        L_0x0161:
            r8 = r1
        L_0x0162:
            r7.put(r9, r8)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
        L_0x0165:
            com.ss.android.ugc.aweme.app.api.h r8 = r0.f73823d     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r8 != 0) goto L_0x016c
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x021e, all -> 0x022e }
        L_0x016c:
            com.bytedance.frameworks.baselib.network.http.a r8 = r8.getRequestInfo()     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r8 == 0) goto L_0x01eb
            long r9 = r8.f26768r     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x01eb
            java.lang.String r3 = "timing_total"
            long r9 = r8.f26768r     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r3, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r3 = "requestStart"
            long r9 = r8.f26755e     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r3, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r3 = "appLevelRequestStart"
            long r9 = r8.f26753c     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r3, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r3 = "inner"
            int r3 = r7.optInt(r3)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r3 <= 0) goto L_0x01d6
            long r9 = r8.f26768r     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            long r9 = r9 - r3
            long r3 = r0.f73821b     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            long r11 = r0.f73820a     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r13 = 0
            long r3 = r3 - r11
            java.lang.String r11 = "triggerNetCost"
            r7.put(r11, r3)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r3 = "timing_net"
            r7.put(r3, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            long r3 = r8.f26755e     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            long r9 = r8.f26753c     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r11 = 0
            long r3 = r3 - r9
            java.lang.String r9 = "timing_retrofit"
            r7.put(r9, r3)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r3 = "timing_gap"
            int r4 = r0.f73829j     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            long r9 = (long) r4     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            long r11 = r8.f26768r     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r4 = 0
            long r9 = r9 - r11
            r7.put(r3, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r3 = "timing_gap_start"
            long r9 = r8.f26755e     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            long r11 = r0.f73821b     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r4 = 0
            long r9 = r9 - r11
            r7.put(r3, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r3 = "timing_gap_end"
            long r9 = r0.f73822c     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            long r11 = r8.f26758h     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r4 = 0
            long r9 = r9 - r11
            r7.put(r3, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
        L_0x01d6:
            java.lang.String r3 = "client_cost"
            int r4 = r0.f73828i     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            long r9 = (long) r4     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            long r11 = r8.f26768r     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r4 = 0
            long r9 = r9 - r11
            r7.put(r3, r9)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r3 = "view_draw_cost"
            long r8 = r0.f73822c     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r4 = 0
            long r5 = r5 - r8
            r7.put(r3, r5)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
        L_0x01eb:
            int r3 = r0.f73834o     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r3 == r2) goto L_0x01f6
            java.lang.String r3 = "first_display_card"
            int r4 = r0.f73834o     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r3, r4)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
        L_0x01f6:
            int r3 = r0.f73835p     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            if (r3 == r2) goto L_0x0201
            java.lang.String r2 = "second_display_card"
            int r3 = r0.f73835p     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r2, r3)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
        L_0x0201:
            m66924a(r7)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r2 = "is_first_search"
            int r0 = r0.f73836q     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r2, r0)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r0 = "search_trigger_refresh_monitor"
            com.p683ss.android.common.p1146d.C18894a.m46006a(r0, r7)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r0 = "keyword"
            java.lang.String r2 = r15.getKeyword()     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            r7.put(r0, r2)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
            java.lang.String r0 = "search_trigger_refresh_monitor"
            com.p683ss.android.ugc.aweme.base.C23569o.m57779a(r0, r7)     // Catch:{ Exception -> 0x021e, all -> 0x022e }
        L_0x021e:
            java.util.Map<java.lang.Integer, com.ss.android.ugc.aweme.discover.f.c> r0 = f73839a
            int r15 = r15.getId()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r0.remove(r15)
            f73840b = r1
            return
        L_0x022e:
            r0 = move-exception
            java.util.Map<java.lang.Integer, com.ss.android.ugc.aweme.discover.f.c> r2 = f73839a
            int r15 = r15.getId()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r2.remove(r15)
            f73840b = r1
            throw r0
        L_0x023f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1644f.C28116e.mo56523b(com.ss.android.ugc.aweme.search.model.e):void");
    }

    /* renamed from: a */
    public static C28114c m66922a(int i, C41440e eVar) {
        C52711k.m112240b(eVar, "searchParam");
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - f73842d;
        f73842d = currentTimeMillis;
        if (j < 1000) {
            return null;
        }
        C41440e copy = eVar.copy();
        C52711k.m112236a((Object) copy, "searchParam.copy()");
        C28114c cVar = new C28114c(copy);
        cVar.f73820a = currentTimeMillis;
        cVar.f73821b = 0;
        cVar.f73825f = i;
        f73839a.put(Integer.valueOf(copy.getId()), cVar);
        f73840b = cVar;
        return cVar;
    }
}
