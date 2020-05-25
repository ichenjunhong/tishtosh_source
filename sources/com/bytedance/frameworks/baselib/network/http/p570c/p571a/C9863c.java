package com.bytedance.frameworks.baselib.network.http.p570c.p571a;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9903i;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad.C53505a;
import okhttp3.C53671s;
import okhttp3.C53676u;

/* renamed from: com.bytedance.frameworks.baselib.network.http.c.a.c */
public final class C9863c implements C53676u {
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0180 A[Catch:{ Throwable -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01cd A[SYNTHETIC, Splitter:B:94:0x01cd] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.C53504ad intercept(okhttp3.C53676u.C53677a r20) throws java.io.IOException {
        /*
            r19 = this;
            r9 = r19
            okhttp3.ab r1 = r20.mo111416a()
            okhttp3.t r0 = r1.f132378a     // Catch:{ Exception -> 0x000d }
            java.net.URI r0 = r0.mo111611b()     // Catch:{ Exception -> 0x000d }
            goto L_0x0017
        L_0x000d:
            okhttp3.t r0 = r1.f132378a
            java.lang.String r0 = r0.toString()
            java.net.URI r0 = com.bytedance.frameworks.baselib.network.http.p574e.C9915j.m19871b(r0)
        L_0x0017:
            r10 = r0
            okhttp3.ab$a r2 = r1.mo111256a()
            if (r10 == 0) goto L_0x007e
            if (r1 == 0) goto L_0x007e
            if (r2 != 0) goto L_0x0023
            goto L_0x007e
        L_0x0023:
            com.bytedance.frameworks.baselib.network.http.e$i r0 = com.bytedance.frameworks.baselib.network.http.C9894e.m19812a()     // Catch:{ Throwable -> 0x007e }
            if (r0 == 0) goto L_0x007e
            boolean r3 = r0.mo17834a(r10)     // Catch:{ Throwable -> 0x007e }
            if (r3 == 0) goto L_0x007e
            java.util.Map r3 = r0.mo17833a()     // Catch:{ Throwable -> 0x007e }
            if (r3 == 0) goto L_0x007e
            java.lang.String r4 = "token"
            java.lang.Object r4 = r3.get(r4)     // Catch:{ Throwable -> 0x007e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x007e }
            boolean r5 = com.bytedance.common.utility.C9431p.m18664a(r4)     // Catch:{ Throwable -> 0x007e }
            if (r5 != 0) goto L_0x0048
            java.lang.String r5 = "tko"
            r2.mo111271b(r5, r4)     // Catch:{ Throwable -> 0x007e }
        L_0x0048:
            java.lang.String r4 = "version"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Throwable -> 0x007e }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Throwable -> 0x007e }
            int r3 = r3.intValue()     // Catch:{ Throwable -> 0x007e }
            if (r3 <= 0) goto L_0x005f
            java.lang.String r4 = "tkv"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x007e }
            r2.mo111271b(r4, r3)     // Catch:{ Throwable -> 0x007e }
        L_0x005f:
            okhttp3.t r3 = r1.f132378a     // Catch:{ Throwable -> 0x007e }
            java.lang.String r3 = r3.mo111621h()     // Catch:{ Throwable -> 0x007e }
            android.util.Pair r0 = r0.mo17831a(r3)     // Catch:{ Throwable -> 0x007e }
            if (r0 == 0) goto L_0x007e
            java.lang.Object r3 = r0.first     // Catch:{ Throwable -> 0x007e }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Throwable -> 0x007e }
            boolean r3 = r3.booleanValue()     // Catch:{ Throwable -> 0x007e }
            if (r3 == 0) goto L_0x007e
            java.lang.String r3 = "thm"
            java.lang.Object r0 = r0.second     // Catch:{ Throwable -> 0x007e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x007e }
            r2.mo111271b(r3, r0)     // Catch:{ Throwable -> 0x007e }
        L_0x007e:
            java.net.CookieHandler r11 = java.net.CookieHandler.getDefault()
            okhttp3.s r3 = r1.f132380c
            r12 = 5
            r4 = 0
            r5 = 1
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x015d }
            r0.<init>()     // Catch:{ Throwable -> 0x015d }
            if (r3 == 0) goto L_0x00b2
            java.util.Set r6 = r3.mo111596b()     // Catch:{ Throwable -> 0x015d }
            if (r6 == 0) goto L_0x00b2
            boolean r7 = r6.isEmpty()     // Catch:{ Throwable -> 0x015d }
            if (r7 != 0) goto L_0x00b2
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Throwable -> 0x015d }
        L_0x009e:
            boolean r7 = r6.hasNext()     // Catch:{ Throwable -> 0x015d }
            if (r7 == 0) goto L_0x00b2
            java.lang.Object r7 = r6.next()     // Catch:{ Throwable -> 0x015d }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x015d }
            java.util.List r8 = r3.mo111595b(r7)     // Catch:{ Throwable -> 0x015d }
            r0.put(r7, r8)     // Catch:{ Throwable -> 0x015d }
            goto L_0x009e
        L_0x00b2:
            r6 = 0
            if (r11 == 0) goto L_0x00d7
            java.util.Map r0 = r11.get(r10, r0)     // Catch:{ IOException -> 0x00ba }
            goto L_0x00d8
        L_0x00ba:
            r0 = move-exception
            r7 = r0
            okhttp3.internal.g.f r0 = okhttp3.internal.p2689g.C53634f.m114048c()     // Catch:{ Throwable -> 0x015d }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x015d }
            java.lang.String r13 = "Loading cookies failed for "
            r8.<init>(r13)     // Catch:{ Throwable -> 0x015d }
            java.lang.String r13 = "/..."
            java.net.URI r13 = r10.resolve(r13)     // Catch:{ Throwable -> 0x015d }
            r8.append(r13)     // Catch:{ Throwable -> 0x015d }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x015d }
            r0.mo111504a(r12, r8, r7)     // Catch:{ Throwable -> 0x015d }
        L_0x00d7:
            r0 = r6
        L_0x00d8:
            if (r0 == 0) goto L_0x014f
            int r6 = r0.size()     // Catch:{ Throwable -> 0x015d }
            if (r6 <= 0) goto L_0x014f
            java.util.Set r0 = r0.entrySet()     // Catch:{ Throwable -> 0x015d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x015d }
        L_0x00e8:
            boolean r6 = r0.hasNext()     // Catch:{ Throwable -> 0x015d }
            if (r6 == 0) goto L_0x015d
            java.lang.Object r6 = r0.next()     // Catch:{ Throwable -> 0x015d }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ Throwable -> 0x015d }
            java.lang.Object r7 = r6.getKey()     // Catch:{ Throwable -> 0x015d }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x015d }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x015d }
            r8.<init>()     // Catch:{ Throwable -> 0x015d }
            java.lang.String r13 = "X-SS-Cookie"
            boolean r13 = r13.equalsIgnoreCase(r7)     // Catch:{ Throwable -> 0x015d }
            if (r13 != 0) goto L_0x0117
            java.lang.String r13 = "Cookie"
            boolean r13 = r13.equalsIgnoreCase(r7)     // Catch:{ Throwable -> 0x015d }
            if (r13 != 0) goto L_0x0117
            java.lang.String r13 = "Cookie2"
            boolean r13 = r13.equalsIgnoreCase(r7)     // Catch:{ Throwable -> 0x015d }
            if (r13 == 0) goto L_0x00e8
        L_0x0117:
            java.lang.Object r13 = r6.getValue()     // Catch:{ Throwable -> 0x015d }
            java.util.List r13 = (java.util.List) r13     // Catch:{ Throwable -> 0x015d }
            boolean r13 = r13.isEmpty()     // Catch:{ Throwable -> 0x015d }
            if (r13 != 0) goto L_0x00e8
            java.lang.Object r6 = r6.getValue()     // Catch:{ Throwable -> 0x015d }
            java.util.List r6 = (java.util.List) r6     // Catch:{ Throwable -> 0x015d }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Throwable -> 0x015d }
            r13 = 0
        L_0x012e:
            boolean r14 = r6.hasNext()     // Catch:{ Throwable -> 0x015d }
            if (r14 == 0) goto L_0x0147
            java.lang.Object r14 = r6.next()     // Catch:{ Throwable -> 0x015d }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Throwable -> 0x015d }
            if (r13 <= 0) goto L_0x0141
            java.lang.String r15 = "; "
            r8.append(r15)     // Catch:{ Throwable -> 0x015d }
        L_0x0141:
            r8.append(r14)     // Catch:{ Throwable -> 0x015d }
            int r13 = r13 + 1
            goto L_0x012e
        L_0x0147:
            java.lang.String r6 = r8.toString()     // Catch:{ Throwable -> 0x015d }
            m19727a(r10, r7, r6, r2)     // Catch:{ Throwable -> 0x015d }
            goto L_0x00e8
        L_0x014f:
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Throwable -> 0x015d }
            java.lang.String r6 = "X-SS-Cookie"
            r0[r4] = r6     // Catch:{ Throwable -> 0x015d }
            java.lang.String r6 = "Cookie"
            r0[r5] = r6     // Catch:{ Throwable -> 0x015d }
            r9.m19728a(r10, r3, r0, r2)     // Catch:{ Throwable -> 0x015d }
        L_0x015d:
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.String r5 = "x-tt-token"
            r0[r4] = r5
            r9.m19728a(r10, r3, r0, r2)
            okhttp3.ab r0 = r2.mo111272c()     // Catch:{ Throwable -> 0x016d }
        L_0x016a:
            r1 = r20
            goto L_0x016f
        L_0x016d:
            r0 = r1
            goto L_0x016a
        L_0x016f:
            okhttp3.ad r13 = r1.mo111417a(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            okhttp3.ad$a r14 = r13.mo111277b()
            okhttp3.s r15 = r13.f132403f     // Catch:{ Throwable -> 0x01cb }
            if (r15 == 0) goto L_0x01cb
            java.lang.String r1 = "tko"
            java.lang.String r16 = r15.mo111593a(r1)     // Catch:{ Throwable -> 0x01cb }
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet     // Catch:{ Throwable -> 0x01cb }
            r8.<init>()     // Catch:{ Throwable -> 0x01cb }
            java.lang.String r1 = "X-SS-Set-Cookie"
            r8.add(r1)     // Catch:{ Throwable -> 0x01cb }
            java.lang.String r1 = "Set-Cookie"
            r8.add(r1)     // Catch:{ Throwable -> 0x01cb }
            java.lang.String r1 = "x-tt-token"
            r8.add(r1)     // Catch:{ Throwable -> 0x01cb }
            java.util.Set r1 = r15.mo111596b()     // Catch:{ Throwable -> 0x01cb }
            if (r1 == 0) goto L_0x01cb
            boolean r2 = r1.isEmpty()     // Catch:{ Throwable -> 0x01cb }
            if (r2 != 0) goto L_0x01cb
            java.util.Iterator r17 = r1.iterator()     // Catch:{ Throwable -> 0x01cb }
        L_0x01aa:
            boolean r1 = r17.hasNext()     // Catch:{ Throwable -> 0x01cb }
            if (r1 == 0) goto L_0x01cb
            java.lang.Object r1 = r17.next()     // Catch:{ Throwable -> 0x01cb }
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x01cb }
            java.util.List r5 = r15.mo111595b(r4)     // Catch:{ Throwable -> 0x01cb }
            r1 = r19
            r2 = r10
            r3 = r16
            r6 = r8
            r7 = r0
            r18 = r8
            r8 = r14
            r1.m19726a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x01cb }
            r8 = r18
            goto L_0x01aa
        L_0x01cb:
            if (r11 == 0) goto L_0x01ee
            r11.put(r10, r0)     // Catch:{ IOException -> 0x01d1 }
            goto L_0x01ee
        L_0x01d1:
            r0 = move-exception
            r1 = r0
            okhttp3.internal.g.f r0 = okhttp3.internal.p2689g.C53634f.m114048c()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Saving cookies failed for "
            r2.<init>(r3)
            java.lang.String r3 = "/..."
            java.net.URI r3 = r10.resolve(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.mo111504a(r12, r2, r1)
        L_0x01ee:
            okhttp3.ad r0 = r14.mo111291a()     // Catch:{ Throwable -> 0x01f3 }
            goto L_0x01f4
        L_0x01f3:
            r0 = r13
        L_0x01f4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9863c.intercept(okhttp3.u$a):okhttp3.ad");
    }

    /* renamed from: a */
    private static boolean m19729a(Set<String> set, String str) {
        if (set == null || TextUtils.isEmpty(str)) {
            return false;
        }
        for (String equalsIgnoreCase : set) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m19727a(URI uri, String str, String str2, C53499a aVar) {
        if (uri != null && !C9431p.m18664a(str) && !C9431p.m18664a(str2) && aVar != null) {
            try {
                C9903i a = C9894e.m19812a();
                if (a != null && a.mo17834a(uri)) {
                    Pair a2 = a.mo17832a(str2.getBytes());
                    if (a2 != null && ((Boolean) a2.first).booleanValue()) {
                        str2 = Base64.encodeToString((byte[]) a2.second, 2);
                    }
                }
            } catch (Throwable unused) {
            }
            aVar.mo111271b(str, str2);
        }
    }

    /* renamed from: a */
    private void m19728a(URI uri, C53671s sVar, String[] strArr, C53499a aVar) {
        if (uri != null && sVar != null && strArr.length > 0 && aVar != null) {
            try {
                for (String str : strArr) {
                    List<String> b = sVar.mo111595b(str);
                    if (b != null && b.size() > 0) {
                        aVar.mo111270b(str);
                        for (String a : b) {
                            m19727a(uri, str, a, aVar);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private void m19726a(URI uri, String str, String str2, List<String> list, Set<String> set, Map<String, List<String>> map, C53505a aVar) {
        if (uri != null && !C9431p.m18664a(str2) && list != null && list.size() > 0) {
            try {
                List<String> linkedList = new LinkedList<>();
                if (!m19729a(set, str2) || !"1".equals(str)) {
                    for (String add : list) {
                        linkedList.add(add);
                    }
                } else {
                    aVar.f132416f.mo111606b(str2);
                    for (String str3 : list) {
                        C9903i a = C9894e.m19812a();
                        if (a != null && a.mo17834a(uri)) {
                            Pair b = a.mo17835b(Base64.decode(str3, 2));
                            if (b != null && ((Boolean) b.first).booleanValue()) {
                                String str4 = new String((byte[]) b.second);
                                linkedList.add(str4);
                                aVar.f132416f.mo111609c(str2, str4);
                            }
                        }
                    }
                }
                list = linkedList;
            } catch (Throwable unused) {
            }
            map.put(str2, list);
        }
    }
}
