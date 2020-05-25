package com.bytedance.ttnet.retrofit;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.p574e.C9916k;
import com.bytedance.frameworks.baselib.network.http.p574e.C9917l;
import com.bytedance.frameworks.baselib.network.http.retrofit.BaseSsInterceptor;
import com.bytedance.frameworks.core.p577a.C9923a;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12686c.C12687a;
import com.bytedance.ttnet.p887e.C13322a;
import com.bytedance.ttnet.p887e.C13331f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public final class SsInterceptor extends BaseSsInterceptor {

    /* renamed from: a */
    private static volatile boolean f34841a;

    /* renamed from: a */
    public static void m26928a(boolean z) {
        f34841a = true;
    }

    /* renamed from: a */
    private static String m26927a(String str) {
        if (C9431p.m18664a(str)) {
            return str;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair b = C9917l.m19878b(str, linkedHashMap);
            if (!linkedHashMap.isEmpty()) {
                for (Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null) {
                        List list = (List) entry.getValue();
                        if (list != null && !list.isEmpty()) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String str2 = (String) it.next();
                                if (linkedHashSet.contains(str2)) {
                                    it.remove();
                                } else {
                                    linkedHashSet.add(str2);
                                }
                            }
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append((String) b.first);
            sb.append((String) b.second);
            C9916k kVar = new C9916k(sb.toString());
            if (!linkedHashMap.isEmpty()) {
                for (Entry entry2 : linkedHashMap.entrySet()) {
                    if (!(entry2 == null || entry2.getKey() == null)) {
                        List<String> list2 = (List) entry2.getValue();
                        if (list2 != null && !list2.isEmpty()) {
                            for (String a : list2) {
                                kVar.mo17852a((String) entry2.getKey(), a);
                            }
                        }
                    }
                }
            }
            return kVar.mo17849a();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    public final C12686c mo17856a(C12686c cVar) {
        C12686c a = super.mo17856a(cVar);
        if (a == null) {
            return a;
        }
        C12687a b = a.mo23858b();
        String a2 = m26927a(a.f33321b);
        b.mo23861a(a2);
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        ArrayList arrayList = new ArrayList();
        if (a.f33322c != null) {
            arrayList.addAll(a.f33322c);
        }
        if (f34841a) {
            try {
                LinkedList<Pair> linkedList = new LinkedList<>();
                String a3 = C9923a.m19898a(a2, (List<Pair<String, String>>) linkedList);
                if (a3 != null) {
                    b.mo23861a(a3);
                }
                if (!linkedList.isEmpty()) {
                    for (Pair pair : linkedList) {
                        if (pair != null) {
                            arrayList.add(new C12685b((String) pair.first, (String) pair.second));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        if (a.f33332m != null) {
            a.f33332m.f33490w = SystemClock.uptimeMillis() - valueOf.longValue();
        }
        Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
        try {
            String a4 = C13331f.m26853a(a2);
            if (!C9431p.m18664a(a4)) {
                arrayList.add(new C12685b("X-SS-REQ-TICKET", a4));
            }
        } catch (Throwable unused2) {
        }
        if (a.f33332m != null) {
            a.f33332m.f33491x = SystemClock.uptimeMillis() - valueOf2.longValue();
        }
        Long valueOf3 = Long.valueOf(SystemClock.uptimeMillis());
        if (C13322a.f34760a) {
            C13322a.m26831a(a2, (List<C12685b>) arrayList);
        }
        if (a.f33332m != null) {
            a.f33332m.f33493z = SystemClock.uptimeMillis() - valueOf3.longValue();
        }
        b.mo23863a((List<C12685b>) arrayList);
        return b.mo23864a();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0178 */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e1 A[Catch:{ Throwable -> 0x01d0 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e2 A[Catch:{ Throwable -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0180 A[Catch:{ Throwable -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018b A[Catch:{ Throwable -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x019f A[Catch:{ Throwable -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ae A[Catch:{ Throwable -> 0x01d0 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17857a(com.bytedance.retrofit2.p830a.C12686c r24, com.bytedance.retrofit2.C12799u r25) throws java.lang.Exception {
        /*
            r23 = this;
            r0 = r24
            r1 = r25
            super.mo17857a(r24, r25)
            if (r0 == 0) goto L_0x0204
            if (r1 != 0) goto L_0x000d
            goto L_0x0204
        L_0x000d:
            com.bytedance.retrofit2.a.d r1 = r1.f33551a
            long r2 = android.os.SystemClock.uptimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.bytedance.frameworks.baselib.network.http.e$f r3 = com.bytedance.frameworks.baselib.network.http.C9894e.m19833g()     // Catch:{ Throwable -> 0x0052 }
            if (r3 == 0) goto L_0x0052
            com.bytedance.frameworks.baselib.network.http.e$f r3 = com.bytedance.frameworks.baselib.network.http.C9894e.m19833g()     // Catch:{ Throwable -> 0x0052 }
            java.lang.String r3 = r3.mo17827a()     // Catch:{ Throwable -> 0x0052 }
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Throwable -> 0x0052 }
            if (r4 != 0) goto L_0x0052
            java.util.List r3 = r1.mo23867b(r3)     // Catch:{ Throwable -> 0x0052 }
            if (r3 == 0) goto L_0x0052
            int r4 = r3.size()     // Catch:{ Throwable -> 0x0052 }
            if (r4 <= 0) goto L_0x0052
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0052 }
            r4.<init>()     // Catch:{ Throwable -> 0x0052 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x0052 }
        L_0x0040:
            boolean r5 = r3.hasNext()     // Catch:{ Throwable -> 0x0052 }
            if (r5 == 0) goto L_0x0052
            java.lang.Object r5 = r3.next()     // Catch:{ Throwable -> 0x0052 }
            com.bytedance.retrofit2.a.b r5 = (com.bytedance.retrofit2.p830a.C12685b) r5     // Catch:{ Throwable -> 0x0052 }
            java.lang.String r5 = r5.f33319b     // Catch:{ Throwable -> 0x0052 }
            r4.add(r5)     // Catch:{ Throwable -> 0x0052 }
            goto L_0x0040
        L_0x0052:
            com.bytedance.retrofit2.s r3 = r0.f33332m
            if (r3 == 0) goto L_0x0063
            com.bytedance.retrofit2.s r3 = r0.f33332m
            long r4 = android.os.SystemClock.uptimeMillis()
            long r6 = r2.longValue()
            long r4 = r4 - r6
            r3.f33467B = r4
        L_0x0063:
            long r2 = android.os.SystemClock.uptimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r3 = r1.f33351f
            boolean r4 = r3 instanceof com.bytedance.ttnet.p885c.C13297b
            r6 = 0
            if (r4 == 0) goto L_0x00c2
            com.bytedance.ttnet.c.b r3 = (com.bytedance.ttnet.p885c.C13297b) r3
            com.bytedance.frameworks.baselib.network.http.b r4 = r3.f26752b
            if (r4 == 0) goto L_0x00c3
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.util.List<com.bytedance.retrofit2.a.b> r7 = r1.f33349d
            r8 = 0
        L_0x0080:
            int r9 = r7.size()
            if (r8 >= r9) goto L_0x00a5
            java.lang.Object r9 = r7.get(r8)     // Catch:{ Exception -> 0x00a2 }
            com.bytedance.retrofit2.a.b r9 = (com.bytedance.retrofit2.p830a.C12685b) r9     // Catch:{ Exception -> 0x00a2 }
            if (r9 == 0) goto L_0x00a2
            java.lang.String r10 = r9.f33318a     // Catch:{ Exception -> 0x00a2 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x00a2 }
            if (r10 == 0) goto L_0x0097
            goto L_0x00a2
        L_0x0097:
            java.lang.String r10 = r9.f33318a     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r10 = r10.toUpperCase()     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r9 = r9.f33319b     // Catch:{ Exception -> 0x00a2 }
            r4.put(r10, r9)     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            int r8 = r8 + 1
            goto L_0x0080
        L_0x00a5:
            com.bytedance.frameworks.baselib.network.http.b r7 = r3.f26752b
            boolean r7 = r7 instanceof com.bytedance.ttnet.p885c.C13302e
            if (r7 == 0) goto L_0x00b1
            com.bytedance.frameworks.baselib.network.http.b r7 = r3.f26752b
            com.bytedance.ttnet.c.e r7 = (com.bytedance.ttnet.p885c.C13302e) r7
            r7.f34697r = r4
        L_0x00b1:
            com.bytedance.frameworks.baselib.network.http.b r4 = r3.f26752b
            com.bytedance.ttnet.c.e r4 = (com.bytedance.ttnet.p885c.C13302e) r4
            int r7 = r1.f33347b
            r4.f26779b = r7
            com.bytedance.frameworks.baselib.network.http.b r4 = r3.f26752b
            com.bytedance.ttnet.c.e r4 = (com.bytedance.ttnet.p885c.C13302e) r4
            java.lang.String r7 = r3.f26751a
            r4.f26778a = r7
            goto L_0x00c3
        L_0x00c2:
            r3 = 0
        L_0x00c3:
            java.lang.String r4 = "X-SS-REQ-TICKET"
            r0.mo23856a(r4)     // Catch:{ Throwable -> 0x00cd }
            java.lang.String r4 = "X-SS-REQ-TICKET"
            r1.mo23865a(r4)     // Catch:{ Throwable -> 0x00cd }
        L_0x00cd:
            java.lang.String r4 = r0.f33321b     // Catch:{ Throwable -> 0x01d0 }
            android.net.Uri r7 = android.net.Uri.parse(r4)     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r8 = r7.getHost()     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r9 = com.bytedance.ttnet.C13257a.m26659b()     // Catch:{ Throwable -> 0x01d0 }
            boolean r8 = r8.endsWith(r9)     // Catch:{ Throwable -> 0x01d0 }
            if (r8 != 0) goto L_0x00e2
            return
        L_0x00e2:
            r8 = 1
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r10 = "Set-Cookie"
            r9[r6] = r10     // Catch:{ Throwable -> 0x01d0 }
            r10 = 2
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r12 = "sessionid"
            r11[r6] = r12     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r12 = "tt_sessionid"
            r11[r8] = r12     // Catch:{ Throwable -> 0x01d0 }
            r12 = 0
        L_0x00f5:
            if (r12 > 0) goto L_0x01d0
            r13 = r9[r12]     // Catch:{ Throwable -> 0x01d0 }
            java.util.List r13 = r1.mo23867b(r13)     // Catch:{ Throwable -> 0x01d0 }
            if (r13 == 0) goto L_0x01c4
            int r14 = r13.size()     // Catch:{ Throwable -> 0x01d0 }
            if (r14 <= 0) goto L_0x01c4
            java.util.Iterator r13 = r13.iterator()     // Catch:{ Throwable -> 0x01d0 }
        L_0x0109:
            boolean r14 = r13.hasNext()     // Catch:{ Throwable -> 0x01d0 }
            if (r14 == 0) goto L_0x01c4
            java.lang.Object r14 = r13.next()     // Catch:{ Throwable -> 0x01d0 }
            com.bytedance.retrofit2.a.b r14 = (com.bytedance.retrofit2.p830a.C12685b) r14     // Catch:{ Throwable -> 0x01d0 }
            r15 = 0
        L_0x0116:
            if (r15 >= r10) goto L_0x0109
            r5 = r11[r15]     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r10 = r14.f33319b     // Catch:{ Throwable -> 0x01d0 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r8 = ".*((("
            r6.<init>(r8)     // Catch:{ Throwable -> 0x01d0 }
            r6.append(r5)     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r8 = "=[^;]*)|("
            r6.append(r8)     // Catch:{ Throwable -> 0x01d0 }
            r6.append(r5)     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r8 = "=\"[\";]*))|("
            r6.append(r8)     // Catch:{ Throwable -> 0x01d0 }
            r6.append(r5)     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r5 = "=.*$)).*"
            r6.append(r5)     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r5 = r6.toString()     // Catch:{ Throwable -> 0x01d0 }
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)     // Catch:{ Throwable -> 0x01d0 }
            java.util.regex.Matcher r5 = r5.matcher(r10)     // Catch:{ Throwable -> 0x01d0 }
            boolean r6 = r5.matches()     // Catch:{ Throwable -> 0x01d0 }
            if (r6 == 0) goto L_0x0153
            r6 = 1
            java.lang.String r5 = r5.group(r6)     // Catch:{ Throwable -> 0x01d0 }
            goto L_0x0155
        L_0x0153:
            r6 = 1
            r5 = 0
        L_0x0155:
            boolean r5 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Throwable -> 0x01d0 }
            if (r5 != 0) goto L_0x01b8
            int r5 = r1.f33347b     // Catch:{ Throwable -> 0x01d0 }
            boolean r8 = r3.f34688C     // Catch:{ Throwable -> 0x01d0 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Throwable -> 0x01d0 }
            r10.<init>()     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r6 = r7.getEncodedQuery()     // Catch:{ Throwable -> 0x0176 }
            boolean r16 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ Throwable -> 0x0176 }
            if (r16 != 0) goto L_0x0176
            r22 = r7
            java.lang.String r7 = "url_query"
            r10.put(r7, r6)     // Catch:{ Throwable -> 0x0178 }
            goto L_0x0178
        L_0x0176:
            r22 = r7
        L_0x0178:
            java.lang.String r6 = r3.f26751a     // Catch:{ Throwable -> 0x01d0 }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ Throwable -> 0x01d0 }
            if (r6 != 0) goto L_0x0187
            java.lang.String r6 = "remote_ip"
            java.lang.String r7 = r3.f26751a     // Catch:{ Throwable -> 0x01d0 }
            r10.put(r6, r7)     // Catch:{ Throwable -> 0x01d0 }
        L_0x0187:
            java.util.List<com.bytedance.retrofit2.a.b> r6 = r1.f33349d     // Catch:{ Throwable -> 0x01d0 }
            if (r6 == 0) goto L_0x0196
            java.lang.String r6 = "header_list"
            java.util.List<com.bytedance.retrofit2.a.b> r7 = r1.f33349d     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x01d0 }
            r10.put(r6, r7)     // Catch:{ Throwable -> 0x01d0 }
        L_0x0196:
            java.lang.String r6 = "?"
            int r6 = r4.indexOf(r6)     // Catch:{ Throwable -> 0x01d0 }
            r7 = -1
            if (r6 != r7) goto L_0x01a3
            int r6 = r4.length()     // Catch:{ Throwable -> 0x01d0 }
        L_0x01a3:
            r7 = 0
            java.lang.String r18 = r4.substring(r7, r6)     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r17 = "set_cookie"
            com.bytedance.ttnet.e.f$a r16 = com.bytedance.ttnet.p887e.C13331f.f34790a     // Catch:{ Throwable -> 0x01d0 }
            if (r16 == 0) goto L_0x01bb
            r19 = r5
            r20 = r8
            r21 = r10
            r16.mo19933a(r17, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x01d0 }
            goto L_0x01bb
        L_0x01b8:
            r22 = r7
            r7 = 0
        L_0x01bb:
            int r15 = r15 + 1
            r7 = r22
            r6 = 0
            r8 = 1
            r10 = 2
            goto L_0x0116
        L_0x01c4:
            r22 = r7
            r7 = 0
            int r12 = r12 + 1
            r7 = r22
            r6 = 0
            r8 = 1
            r10 = 2
            goto L_0x00f5
        L_0x01d0:
            com.bytedance.retrofit2.s r4 = r0.f33332m
            if (r4 == 0) goto L_0x01e1
            com.bytedance.retrofit2.s r4 = r0.f33332m
            long r5 = android.os.SystemClock.uptimeMillis()
            long r7 = r2.longValue()
            long r5 = r5 - r7
            r4.f33492y = r5
        L_0x01e1:
            long r4 = android.os.SystemClock.uptimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            boolean r4 = com.bytedance.ttnet.p887e.C13322a.f34760a
            if (r4 == 0) goto L_0x01f2
            if (r3 == 0) goto L_0x01f2
            com.bytedance.ttnet.p887e.C13322a.m26830a(r0, r1, r3)
        L_0x01f2:
            com.bytedance.retrofit2.s r1 = r0.f33332m
            if (r1 == 0) goto L_0x0203
            com.bytedance.retrofit2.s r0 = r0.f33332m
            long r3 = android.os.SystemClock.uptimeMillis()
            long r1 = r2.longValue()
            long r3 = r3 - r1
            r0.f33466A = r3
        L_0x0203:
            return
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.retrofit.SsInterceptor.mo17857a(com.bytedance.retrofit2.a.c, com.bytedance.retrofit2.u):void");
    }
}
