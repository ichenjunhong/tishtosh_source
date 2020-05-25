package com.bytedance.android.monitor.webview;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.p464a.C8890a;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.f */
public class C8896f implements C8894d {

    /* renamed from: a */
    private static volatile C8896f f24228a;

    private C8896f() {
    }

    /* renamed from: a */
    public static C8896f m17517a() {
        if (f24228a == null) {
            synchronized (C8896f.class) {
                if (f24228a == null) {
                    f24228a = new C8896f();
                }
            }
        }
        return f24228a;
    }

    /* renamed from: a */
    public final void mo15918a(WebView webView) {
        C8898h a = C8898h.m17534a();
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = C8898h.m17535a(webView);
        C8900a aVar = new C8900a();
        aVar.f24253b = -1;
        aVar.f24252a = currentTimeMillis;
        aVar.f24254c = false;
        a.f24235a.put(a2, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0221  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15923b(android.webkit.WebView r27) {
        /*
            r26 = this;
            r0 = r27
            com.bytedance.android.monitor.webview.h r1 = com.bytedance.android.monitor.webview.C8898h.m17534a()
            java.lang.String r2 = com.bytedance.android.monitor.webview.C8898h.m17535a(r27)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.json.JSONObject>> r3 = r1.f24237c
            java.lang.Object r3 = r3.get(r2)
            java.util.Map r3 = (java.util.Map) r3
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.json.JSONObject>> r4 = r1.f24239e
            java.lang.Object r4 = r4.get(r2)
            java.util.Map r4 = (java.util.Map) r4
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.json.JSONArray>> r5 = r1.f24240f
            java.lang.Object r5 = r5.get(r2)
            java.util.Map r5 = (java.util.Map) r5
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.json.JSONArray>>> r6 = r1.f24238d
            java.lang.Object r6 = r6.get(r2)
            java.util.Map r6 = (java.util.Map) r6
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r7 = r1.f24249o
            java.lang.Object r7 = r7.get(r2)
            java.util.Set r7 = (java.util.Set) r7
            java.util.Map<java.lang.String, java.lang.String> r8 = r1.f24250p
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map<java.lang.String, com.bytedance.android.monitor.webview.h$a> r9 = r1.f24235a
            java.lang.Object r9 = r9.get(r2)
            com.bytedance.android.monitor.webview.h$a r9 = (com.bytedance.android.monitor.webview.C8898h.C8900a) r9
            java.util.Map<java.lang.String, com.bytedance.android.monitor.webview.h$a> r10 = r1.f24236b
            java.lang.Object r10 = r10.get(r2)
            com.bytedance.android.monitor.webview.h$a r10 = (com.bytedance.android.monitor.webview.C8898h.C8900a) r10
            java.util.Map<java.lang.String, com.bytedance.android.monitor.webview.h$a> r11 = r1.f24235a
            r11.remove(r2)
            java.util.Map<java.lang.String, com.bytedance.android.monitor.webview.h$a> r11 = r1.f24236b
            r11.remove(r2)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.json.JSONArray>> r11 = r1.f24240f
            r11.remove(r2)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.json.JSONObject>> r11 = r1.f24239e
            r11.remove(r2)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.json.JSONObject>> r11 = r1.f24237c
            r11.remove(r2)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.json.JSONArray>>> r11 = r1.f24238d
            r11.remove(r2)
            java.util.Map<java.lang.String, java.lang.String> r11 = r1.f24243i
            r11.remove(r2)
            java.util.Map<java.lang.String, java.lang.String> r11 = r1.f24246l
            r11.remove(r2)
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r11 = r1.f24249o
            r11.remove(r2)
            java.util.Map<java.lang.String, java.lang.String> r11 = r1.f24250p
            r11.remove(r2)
            if (r3 == 0) goto L_0x02fc
            boolean r11 = r3.isEmpty()
            if (r11 != 0) goto L_0x02fc
            java.util.Set r11 = r3.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x008c:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x02fc
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r3.get(r12)
            org.json.JSONObject r13 = (org.json.JSONObject) r13
            java.lang.String r14 = "service"
            java.lang.String r14 = com.bytedance.android.monitor.webview.C8905k.m17627c(r13, r14)
            if (r6 == 0) goto L_0x01df
            boolean r16 = r6.isEmpty()
            if (r16 != 0) goto L_0x01df
            java.lang.Object r12 = r6.get(r12)
            java.util.Map r12 = (java.util.Map) r12
            if (r13 == 0) goto L_0x01df
            if (r12 == 0) goto L_0x01df
            boolean r16 = r12.isEmpty()
            if (r16 == 0) goto L_0x00be
            goto L_0x01df
        L_0x00be:
            java.lang.String r15 = "client_params"
            org.json.JSONObject r15 = com.bytedance.android.monitor.webview.C8905k.m17628d(r13, r15)
            if (r15 != 0) goto L_0x00cb
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
        L_0x00cb:
            java.util.Set r16 = r12.keySet()
            java.util.Iterator r16 = r16.iterator()
        L_0x00d3:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x01cf
            java.lang.Object r17 = r16.next()
            r2 = r17
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r17 = r12.get(r2)
            r19 = r6
            r6 = r17
            org.json.JSONArray r6 = (org.json.JSONArray) r6
            if (r6 == 0) goto L_0x01cb
            int r17 = r6.length()
            if (r17 == 0) goto L_0x01cb
            r20 = r11
            r21 = r12
            r11 = 0
            java.lang.Object r12 = com.bytedance.android.monitor.webview.C8905k.m17620a(r6, r11)
            boolean r11 = r12 instanceof java.lang.Double
            if (r11 != 0) goto L_0x0176
            boolean r11 = r12 instanceof java.lang.Float
            if (r11 == 0) goto L_0x0106
            goto L_0x0176
        L_0x0106:
            boolean r11 = r12 instanceof java.lang.Integer
            if (r11 != 0) goto L_0x0116
            boolean r11 = r12 instanceof java.lang.Long
            if (r11 == 0) goto L_0x010f
            goto L_0x0116
        L_0x010f:
            r23 = r3
            r24 = r4
            r22 = r5
            goto L_0x0168
        L_0x0116:
            r22 = r5
            r11 = 0
            r12 = 0
            r17 = 0
        L_0x011c:
            int r5 = r6.length()
            if (r11 >= r5) goto L_0x0151
            java.lang.Object r5 = com.bytedance.android.monitor.webview.C8905k.m17620a(r6, r11)
            r23 = r3
            boolean r3 = r5 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x013a
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r3 = r5.intValue()
            r24 = r4
            long r3 = (long) r3
            long r17 = r17 + r3
            int r12 = r12 + 1
            goto L_0x014a
        L_0x013a:
            r24 = r4
            boolean r3 = r5 instanceof java.lang.Long
            if (r3 == 0) goto L_0x014a
            java.lang.Long r5 = (java.lang.Long) r5
            long r3 = r5.longValue()
            long r17 = r17 + r3
            int r12 = r12 + 1
        L_0x014a:
            int r11 = r11 + 1
            r3 = r23
            r4 = r24
            goto L_0x011c
        L_0x0151:
            r23 = r3
            r24 = r4
            if (r12 != 0) goto L_0x0159
            r3 = 1
            goto L_0x015a
        L_0x0159:
            r3 = r12
        L_0x015a:
            long r3 = (long) r3
            long r3 = r17 / r3
            com.bytedance.android.monitor.webview.C8905k.m17621a(r15, r2, r3)
            java.lang.String r2 = com.bytedance.android.monitor.webview.C8898h.m17536a(r2)
            long r3 = (long) r12
            com.bytedance.android.monitor.webview.C8905k.m17621a(r15, r2, r3)
        L_0x0168:
            r6 = r19
            r11 = r20
            r12 = r21
            r5 = r22
            r3 = r23
            r4 = r24
            goto L_0x00d3
        L_0x0176:
            r23 = r3
            r24 = r4
            r22 = r5
            r3 = 0
            r11 = r3
            r3 = 0
            r4 = 0
        L_0x0181:
            int r5 = r6.length()
            if (r3 >= r5) goto L_0x01b1
            java.lang.Object r5 = com.bytedance.android.monitor.webview.C8905k.m17620a(r6, r3)
            r25 = r6
            boolean r6 = r5 instanceof java.lang.Float
            if (r6 == 0) goto L_0x019f
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            double r5 = (double) r5
            java.lang.Double.isNaN(r5)
            double r11 = r11 + r5
            int r4 = r4 + 1
            goto L_0x01ac
        L_0x019f:
            boolean r6 = r5 instanceof java.lang.Double
            if (r6 == 0) goto L_0x01ac
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            double r11 = r11 + r5
            int r4 = r4 + 1
        L_0x01ac:
            int r3 = r3 + 1
            r6 = r25
            goto L_0x0181
        L_0x01b1:
            if (r4 != 0) goto L_0x01b5
            r3 = 1
            goto L_0x01b6
        L_0x01b5:
            r3 = r4
        L_0x01b6:
            double r5 = (double) r3
            java.lang.Double.isNaN(r5)
            double r11 = r11 / r5
            java.lang.Double r3 = java.lang.Double.valueOf(r11)
            com.bytedance.android.monitor.webview.C8905k.m17622a(r15, r2, r3)
            java.lang.String r2 = com.bytedance.android.monitor.webview.C8898h.m17536a(r2)
            long r3 = (long) r4
            com.bytedance.android.monitor.webview.C8905k.m17621a(r15, r2, r3)
            goto L_0x0168
        L_0x01cb:
            r6 = r19
            goto L_0x00d3
        L_0x01cf:
            r23 = r3
            r24 = r4
            r22 = r5
            r19 = r6
            r20 = r11
            java.lang.String r2 = "client_params"
            com.bytedance.android.monitor.webview.C8905k.m17622a(r13, r2, r15)
            goto L_0x01e9
        L_0x01df:
            r23 = r3
            r24 = r4
            r22 = r5
            r19 = r6
            r20 = r11
        L_0x01e9:
            java.lang.String r2 = "client_params"
            org.json.JSONObject r2 = com.bytedance.android.monitor.webview.C8905k.m17628d(r13, r2)
            if (r2 != 0) goto L_0x01f6
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L_0x01f6:
            if (r10 == 0) goto L_0x0214
            long r3 = r10.f24252a
            r5 = 0
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x0214
            boolean r3 = r10.f24254c
            if (r3 != 0) goto L_0x0214
            long r3 = r10.f24253b
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x0214
            java.lang.String r3 = "createTime"
            long r4 = r10.f24253b
            com.bytedance.android.monitor.webview.C8905k.m17621a(r2, r3, r4)
            r3 = 1
            r10.f24254c = r3
        L_0x0214:
            java.lang.String r3 = "client_params"
            com.bytedance.android.monitor.webview.C8905k.m17622a(r13, r3, r2)
            java.lang.String r2 = "client_params"
            org.json.JSONObject r2 = com.bytedance.android.monitor.webview.C8905k.m17628d(r13, r2)
            if (r2 != 0) goto L_0x0226
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L_0x0226:
            if (r9 == 0) goto L_0x024b
            long r3 = r9.f24252a
            r5 = 0
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x024b
            boolean r3 = r9.f24254c
            if (r3 != 0) goto L_0x024b
            long r3 = r9.f24253b
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x024b
            java.lang.String r3 = "initTime"
            long r4 = r9.f24253b
            com.bytedance.android.monitor.webview.C8905k.m17621a(r2, r3, r4)
            java.lang.String r3 = "firstLoadUrl"
            r4 = 1
            com.bytedance.android.monitor.webview.C8905k.m17621a(r2, r3, r4)
            r3 = 1
            r9.f24254c = r3
        L_0x024b:
            java.lang.String r3 = "client_params"
            com.bytedance.android.monitor.webview.C8905k.m17622a(r13, r3, r2)
            r1.mo15945a(r0, r14, r13)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "event"
            org.json.JSONObject r3 = com.bytedance.android.monitor.webview.C8905k.m17628d(r13, r3)
            java.lang.String r4 = "navigation"
            org.json.JSONObject r3 = com.bytedance.android.monitor.webview.C8905k.m17628d(r3, r4)
            java.lang.String r4 = "performanceTiming"
            com.bytedance.android.monitor.webview.C8905k.m17622a(r2, r4, r3)
            java.lang.String r3 = "url"
            java.lang.String r4 = "url"
            java.lang.Object r4 = com.bytedance.android.monitor.webview.C8905k.m17629e(r13, r4)
            com.bytedance.android.monitor.webview.C8905k.m17622a(r2, r3, r4)
            java.lang.String r3 = "bid"
            java.lang.String r4 = "bid"
            java.lang.Object r4 = com.bytedance.android.monitor.webview.C8905k.m17629e(r13, r4)
            com.bytedance.android.monitor.webview.C8905k.m17622a(r2, r3, r4)
            java.lang.String r3 = "pid"
            java.lang.String r4 = "pid"
            java.lang.Object r4 = com.bytedance.android.monitor.webview.C8905k.m17629e(r13, r4)
            com.bytedance.android.monitor.webview.C8905k.m17622a(r2, r3, r4)
            java.lang.String r3 = "ev_type"
            java.lang.String r4 = "custom"
            com.bytedance.android.monitor.webview.C8905k.m17622a(r2, r3, r4)
            org.json.JSONObject r3 = com.bytedance.android.monitor.webview.C8905k.m17626b(r8)
            com.bytedance.android.monitor.webview.C8898h.m17540a(r2, r3)
            if (r24 == 0) goto L_0x02d4
            boolean r3 = r24.isEmpty()
            if (r3 != 0) goto L_0x02d4
            java.lang.String r3 = "url"
            java.lang.String r3 = com.bytedance.android.monitor.webview.C8905k.m17627c(r13, r3)
            java.lang.String r3 = com.bytedance.android.monitor.webview.C8898h.m17542b(r3)
            r4 = r24
            java.lang.Object r3 = r4.get(r3)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.lang.String r5 = "client_metric"
            org.json.JSONObject r3 = com.bytedance.android.monitor.webview.C8905k.m17628d(r3, r5)
            if (r3 == 0) goto L_0x02d6
            if (r7 == 0) goto L_0x02d6
            java.util.Iterator r5 = r7.iterator()
        L_0x02c0:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02d6
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r11 = com.bytedance.android.monitor.webview.C8905k.m17629e(r3, r6)
            com.bytedance.android.monitor.webview.C8905k.m17622a(r2, r6, r11)
            goto L_0x02c0
        L_0x02d4:
            r4 = r24
        L_0x02d6:
            java.lang.String r3 = "url"
            java.lang.String r2 = com.bytedance.android.monitor.webview.C8905k.m17627c(r2, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x02f2
            java.lang.String r3 = "about:blank"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x02eb
            goto L_0x02f2
        L_0x02eb:
            com.bytedance.android.monitor.webview.e r2 = com.bytedance.android.monitor.webview.C8902j.m17574c()
            r2.mo15941h(r0)
        L_0x02f2:
            r6 = r19
            r11 = r20
            r5 = r22
            r3 = r23
            goto L_0x008c
        L_0x02fc:
            r23 = r3
            r22 = r5
            if (r4 == 0) goto L_0x0369
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x0369
            java.util.Set r2 = r4.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0310:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0369
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = com.bytedance.android.monitor.webview.C8898h.m17542b(r3)
            java.lang.Object r5 = r4.get(r5)
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.util.Map<java.lang.String, java.lang.String> r6 = r1.f24244j
            java.lang.String r3 = com.bytedance.android.monitor.webview.C8898h.m17542b(r3)
            java.lang.Object r3 = r6.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r23 == 0) goto L_0x0344
            boolean r6 = r23.isEmpty()
            if (r6 == 0) goto L_0x033b
            goto L_0x0344
        L_0x033b:
            r6 = r23
            java.lang.Object r3 = r6.get(r3)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            goto L_0x034b
        L_0x0344:
            r6 = r23
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        L_0x034b:
            java.lang.String r7 = "bid"
            java.lang.String r7 = com.bytedance.android.monitor.webview.C8905k.m17627c(r3, r7)
            java.lang.String r8 = "pid"
            java.lang.String r3 = com.bytedance.android.monitor.webview.C8905k.m17627c(r3, r8)
            java.lang.String r8 = "bid"
            com.bytedance.android.monitor.webview.C8905k.m17623a(r5, r8, r7)
            java.lang.String r7 = "pid"
            com.bytedance.android.monitor.webview.C8905k.m17623a(r5, r7, r3)
            java.lang.String r3 = "custom"
            r1.mo15945a(r0, r3, r5)
            r23 = r6
            goto L_0x0310
        L_0x0369:
            r6 = r23
            if (r22 == 0) goto L_0x03f0
            boolean r2 = r22.isEmpty()
            if (r2 != 0) goto L_0x03f0
            java.util.Set r2 = r22.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x037b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03f0
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = com.bytedance.android.monitor.webview.C8898h.m17542b(r3)
            r5 = r22
            java.lang.Object r4 = r5.get(r4)
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            java.util.Map<java.lang.String, java.lang.String> r7 = r1.f24244j
            java.lang.String r3 = com.bytedance.android.monitor.webview.C8898h.m17542b(r3)
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r6 == 0) goto L_0x03af
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x03a8
            goto L_0x03af
        L_0x03a8:
            java.lang.Object r3 = r6.get(r3)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            goto L_0x03b4
        L_0x03af:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        L_0x03b4:
            java.lang.String r7 = "bid"
            java.lang.String r7 = com.bytedance.android.monitor.webview.C8905k.m17627c(r3, r7)
            java.lang.String r8 = "pid"
            java.lang.String r3 = com.bytedance.android.monitor.webview.C8905k.m17627c(r3, r8)
            if (r4 == 0) goto L_0x03ef
            int r8 = r4.length()
            if (r8 > 0) goto L_0x03c9
            goto L_0x03ef
        L_0x03c9:
            r8 = 0
        L_0x03ca:
            int r9 = r4.length()
            if (r8 >= r9) goto L_0x03ec
            java.lang.Object r9 = com.bytedance.android.monitor.webview.C8905k.m17620a(r4, r8)
            boolean r10 = r9 instanceof org.json.JSONObject
            if (r10 == 0) goto L_0x03e9
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            java.lang.String r10 = "bid"
            com.bytedance.android.monitor.webview.C8905k.m17623a(r9, r10, r7)
            java.lang.String r10 = "pid"
            com.bytedance.android.monitor.webview.C8905k.m17623a(r9, r10, r3)
            java.lang.String r10 = "custom"
            r1.mo15945a(r0, r10, r9)
        L_0x03e9:
            int r8 = r8 + 1
            goto L_0x03ca
        L_0x03ec:
            r22 = r5
            goto L_0x037b
        L_0x03ef:
            return
        L_0x03f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitor.webview.C8896f.mo15923b(android.webkit.WebView):void");
    }

    /* renamed from: a */
    public final void mo15919a(WebView webView, String str) {
        C8898h a = C8898h.m17534a();
        long a2 = C8905k.m17619a(str);
        String a3 = C8898h.m17535a(webView);
        C8900a aVar = (C8900a) a.f24235a.get(a3);
        if (aVar != null && aVar.f24252a != -1 && !aVar.f24254c && aVar.f24253b == -1) {
            aVar.f24253b = (System.currentTimeMillis() - aVar.f24252a) - a2;
            long j = 0;
            if (aVar.f24253b > 0) {
                j = aVar.f24253b;
            }
            aVar.f24253b = j;
            a.f24235a.put(a3, aVar);
            a.mo15944a(webView, webView.getUrl(), "domContentLoaded");
        }
    }

    /* renamed from: a */
    public final void mo15920a(WebView webView, String str, String str2) {
        C8898h.m17534a().mo15944a(webView, str, str2);
    }

    /* renamed from: d */
    public final void mo15928d(WebView webView, String str, String str2) {
        C8898h.m17534a().mo15945a(webView, str, C8905k.m17626b(str2));
    }

    /* renamed from: f */
    public final void mo15930f(WebView webView, String str, String str2) {
        C8898h.m17534a().mo15945a(webView, str, C8905k.m17626b(str2));
    }

    /* renamed from: b */
    public final void mo15926b(WebView webView, String str, boolean z) {
        C8898h a = C8898h.m17534a();
        String a2 = C8898h.m17535a(webView);
        Map map = (Map) a.f24248n.get(a2);
        if (map == null) {
            map = new C8890a();
        }
        if (z) {
            map.put(C8898h.m17542b(str), Boolean.valueOf(z));
        } else {
            map.remove(C8898h.m17542b(str));
        }
        a.f24248n.put(a2, map);
    }

    /* renamed from: b */
    public final void mo15924b(WebView webView, String str, String str2) {
        C8898h a = C8898h.m17534a();
        String a2 = C8898h.m17535a(webView);
        JSONObject b = C8905k.m17626b(str2);
        String c = C8905k.m17627c(b, "navigation_id");
        if (TextUtils.isEmpty(c)) {
            c = (String) a.f24243i.get(a2);
        } else {
            a.mo15946a(a2, c);
        }
        if (!TextUtils.isEmpty(c)) {
            a.f24244j.put(C8898h.m17542b((String) a.f24246l.get(a2)), a.f24243i.get(a2));
            a.f24245k.put(a.f24243i.get(a2), C8898h.m17542b((String) a.f24246l.get(a2)));
            Map map = (Map) a.f24237c.get(a2);
            if (map == null) {
                map = new C8890a();
            }
            JSONObject jSONObject = (JSONObject) map.get(c);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Iterator keys = b.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                C8905k.m17622a(jSONObject, str3, C8905k.m17629e(b, str3));
            }
            map.put(c, jSONObject);
            a.f24237c.put(a2, map);
        }
    }

    /* renamed from: c */
    public final void mo15927c(WebView webView, String str, String str2) {
        C8898h a = C8898h.m17534a();
        String a2 = C8898h.m17535a(webView);
        JSONObject b = C8905k.m17626b(str2);
        String c = C8905k.m17627c(b, "navigation_id");
        if (TextUtils.isEmpty(c)) {
            c = (String) a.f24243i.get(a2);
        } else {
            a.mo15946a(a2, c);
        }
        if (!TextUtils.isEmpty(c)) {
            a.f24244j.put(C8898h.m17542b((String) a.f24246l.get(a2)), a.f24243i.get(a2));
            a.f24245k.put(a.f24243i.get(a2), C8898h.m17542b((String) a.f24246l.get(a2)));
            JSONObject d = C8905k.m17628d(b, "event");
            if (d != null) {
                Map map = (Map) a.f24237c.get(a2);
                if (map == null) {
                    map = new C8890a();
                }
                JSONObject jSONObject = (JSONObject) map.get(c);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                JSONObject d2 = C8905k.m17628d(jSONObject, "client_params");
                if (d2 == null) {
                    d2 = new JSONObject();
                }
                Iterator keys = d.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    C8905k.m17621a(d2, str3, C8905k.m17625b(d2, str3) + C8905k.m17625b(d, str3));
                }
                C8905k.m17622a(jSONObject, "client_params", (Object) d2);
                map.put(c, jSONObject);
                a.f24237c.put(a2, map);
            }
        }
    }

    /* renamed from: e */
    public final void mo15929e(WebView webView, String str, String str2) {
        C8898h a = C8898h.m17534a();
        String a2 = C8898h.m17535a(webView);
        JSONObject b = C8905k.m17626b(str2);
        String c = C8905k.m17627c(b, "navigation_id");
        if (TextUtils.isEmpty(c)) {
            c = (String) a.f24243i.get(a2);
        } else {
            a.mo15946a(a2, c);
        }
        if (!TextUtils.isEmpty(c)) {
            a.f24244j.put(C8898h.m17542b((String) a.f24246l.get(a2)), a.f24243i.get(a2));
            a.f24245k.put(a.f24243i.get(a2), C8898h.m17542b((String) a.f24246l.get(a2)));
            JSONObject d = C8905k.m17628d(b, "event");
            if (d != null) {
                Map map = (Map) a.f24238d.get(a2);
                if (map == null) {
                    map = new C8890a();
                }
                Map map2 = (Map) map.get(c);
                if (map2 == null) {
                    map2 = new C8890a();
                }
                Iterator keys = d.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    Object e = C8905k.m17629e(d, str3);
                    if (e instanceof Number) {
                        JSONArray jSONArray = (JSONArray) map2.get(str3);
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                        }
                        jSONArray.put(e);
                        map2.put(str3, jSONArray);
                    }
                }
                map.put(c, map2);
                a.f24238d.put(a2, map);
                if (C8902j.m17574c().mo15942i(webView)) {
                    a.mo15945a(webView, str, b);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo15922a(WebView webView, String str, boolean z) {
        C8898h a = C8898h.m17534a();
        String a2 = C8898h.m17535a(webView);
        Map map = (Map) a.f24247m.get(a2);
        if (map == null) {
            map = new C8890a();
        }
        if (z) {
            map.put(C8898h.m17542b(str), Boolean.valueOf(z));
        } else {
            map.remove(C8898h.m17542b(str));
        }
        a.f24247m.put(a2, map);
    }

    /* renamed from: a */
    public final void mo15921a(WebView webView, String str, String str2, String str3, String str4) {
        C8898h a = C8898h.m17534a();
        String a2 = C8898h.m17535a(webView);
        if (TextUtils.isEmpty(str)) {
            str = (String) a.f24246l.get(a2);
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str2)) {
            C8905k.m17622a(jSONObject, "client_category", (Object) C8905k.m17626b(str2));
        }
        if (!TextUtils.isEmpty(str3)) {
            C8905k.m17622a(jSONObject, "client_metric", (Object) C8905k.m17626b(str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            C8905k.m17622a(jSONObject, "client_extra", (Object) C8905k.m17626b(str4));
        }
        JSONObject jSONObject2 = (JSONObject) a.f24241g.get(a2);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        C8905k.m17623a(jSONObject2, "ev_type", "custom");
        if (TextUtils.isEmpty(str)) {
            a.mo15947a(jSONObject2, jSONObject, "client_category");
            a.mo15947a(jSONObject2, jSONObject, "client_metric");
            a.mo15947a(jSONObject2, jSONObject, "client_extra");
            a.f24241g.put(a2, jSONObject2);
            return;
        }
        Map map = (Map) a.f24239e.get(a2);
        if (map == null) {
            map = new C8890a();
        }
        C8905k.m17623a(jSONObject2, "url", str);
        a.mo15947a(jSONObject2, jSONObject, "client_category");
        a.mo15947a(jSONObject2, jSONObject, "client_metric");
        a.mo15947a(jSONObject2, jSONObject, "client_extra");
        map.put(C8898h.m17542b(str), jSONObject2);
        a.f24239e.put(a2, map);
    }

    /* renamed from: b */
    public final void mo15925b(WebView webView, String str, String str2, String str3, String str4) {
        C8898h a = C8898h.m17534a();
        String a2 = C8898h.m17535a(webView);
        if (TextUtils.isEmpty(str)) {
            str = (String) a.f24246l.get(a2);
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str2)) {
            C8905k.m17622a(jSONObject, "client_category", (Object) C8905k.m17626b(str2));
        }
        if (!TextUtils.isEmpty(str3)) {
            C8905k.m17622a(jSONObject, "client_metric", (Object) C8905k.m17626b(str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            C8905k.m17622a(jSONObject, "client_extra", (Object) C8905k.m17626b(str4));
        }
        C8905k.m17623a(jSONObject, "ev_type", "custom");
        if (TextUtils.isEmpty(str)) {
            JSONArray jSONArray = (JSONArray) a.f24242h.get(a2);
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            jSONArray.put(jSONObject);
            a.f24242h.put(a2, jSONArray);
            return;
        }
        C8905k.m17623a(jSONObject, "url", str);
        Map map = (Map) a.f24240f.get(a2);
        if (map == null) {
            map = new C8890a();
        }
        JSONArray jSONArray2 = (JSONArray) map.get(C8898h.m17542b(str));
        if (jSONArray2 == null) {
            jSONArray2 = new JSONArray();
        }
        jSONArray2.put(jSONObject);
        map.put(C8898h.m17542b(str), jSONArray2);
        a.f24240f.put(a2, map);
    }
}
