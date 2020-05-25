package com.p683ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.p574e.C9917l;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.p830a.C12685b;
import com.p683ss.android.ugc.aweme.net.CommonApi;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.utils.dg */
public final class C47809dg {

    /* renamed from: a */
    public static final C47809dg f120359a = new C47809dg();

    private C47809dg() {
    }

    /* renamed from: a */
    private static CommonApi m103447a(String str) {
        if (C9431p.m18664a(str)) {
            return null;
        }
        return (CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(str).create(CommonApi.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (r1 == null) goto L_0x0069;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m103448a(java.util.Map<java.lang.String, java.lang.String> r7, org.json.JSONObject r8, java.lang.String r9) throws org.json.JSONException {
        /*
            r6 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Iterator r0 = r8.keys()
        L_0x0007:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x006f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = r9
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0023
            java.lang.String r2 = "key"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = r1
            goto L_0x003c
        L_0x0023:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r3 = 91
            r2.append(r3)
            r2.append(r1)
            r3 = 93
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L_0x003c:
            java.lang.Object r1 = r8.get(r1)
            boolean r3 = r1 instanceof org.json.JSONObject
            if (r3 == 0) goto L_0x004a
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            r6.m103448a(r7, r1, r2)
            goto L_0x0007
        L_0x004a:
            boolean r3 = r1 instanceof org.json.JSONArray
            if (r3 == 0) goto L_0x0061
            r3 = 0
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            int r4 = r1.length()
        L_0x0055:
            if (r3 >= r4) goto L_0x0007
            org.json.JSONObject r5 = r1.getJSONObject(r3)
            r6.m103448a(r7, r5, r2)
            int r3 = r3 + 1
            goto L_0x0055
        L_0x0061:
            if (r1 == 0) goto L_0x0069
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L_0x006b
        L_0x0069:
            java.lang.String r1 = ""
        L_0x006b:
            r7.put(r2, r1)
            goto L_0x0007
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47809dg.m103448a(java.util.Map, org.json.JSONObject, java.lang.String):void");
    }

    /* renamed from: a */
    public final String mo95051a(String str, JSONObject jSONObject, String str2, List<C12685b> list) throws Exception {
        C52711k.m112240b(str, "url");
        byte[] bArr = null;
        Pair a = C9917l.m19876a(str, null);
        String str3 = (String) a.first;
        String str4 = (String) a.second;
        C52711k.m112236a((Object) str3, "baseUrl");
        CommonApi a2 = m103447a(str3);
        if (a2 != null) {
            if (list == null) {
                list = new ArrayList<>();
            }
            if (!TextUtils.isEmpty(str2)) {
                list.add(new C12685b("Content-Type", str2));
            }
            if (jSONObject != null) {
                String jSONObject2 = jSONObject.toString();
                if (jSONObject2 != null) {
                    Charset forName = Charset.forName("UTF-8");
                    C52711k.m112236a((Object) forName, "Charset.forName(charsetName)");
                    if (jSONObject2 != null) {
                        bArr = jSONObject2.getBytes(forName);
                        C52711k.m112236a((Object) bArr, "(this as java.lang.String).getBytes(charset)");
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            T t = a2.putBody(str4, new TypedByteArray(str2, bArr, new String[0]), list).execute().f33552b;
            C52711k.m112236a((Object) t, "api.putBody(relativePath…headers).execute().body()");
            return (String) t;
        }
        StringBuilder sb = new StringBuilder("CommonApi is null,url=");
        sb.append(str);
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: b */
    public final String mo95052b(String str, JSONObject jSONObject, String str2, List<C12685b> list) throws Exception {
        C52711k.m112240b(str, "url");
        byte[] bArr = null;
        Pair a = C9917l.m19876a(str, null);
        String str3 = (String) a.first;
        String str4 = (String) a.second;
        C52711k.m112236a((Object) str3, "baseUrl");
        CommonApi a2 = m103447a(str3);
        if (a2 != null) {
            if (list == null) {
                list = new ArrayList<>();
            }
            if (!TextUtils.isEmpty(str2)) {
                list.add(new C12685b("Content-Type", str2));
            }
            if (str2 == null || !C52830p.m112411b(str2, "application/json", false, 2, null)) {
                Map hashMap = new HashMap();
                m103448a(hashMap, jSONObject, "");
                T t = a2.doPost(str4, hashMap, list).execute().f33552b;
                C52711k.m112236a((Object) t, "api.doPost(relativePath,…headers).execute().body()");
                return (String) t;
            }
            if (jSONObject != null) {
                String jSONObject2 = jSONObject.toString();
                if (jSONObject2 != null) {
                    Charset forName = Charset.forName("UTF-8");
                    C52711k.m112236a((Object) forName, "Charset.forName(charsetName)");
                    if (jSONObject2 != null) {
                        bArr = jSONObject2.getBytes(forName);
                        C52711k.m112236a((Object) bArr, "(this as java.lang.String).getBytes(charset)");
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            T t2 = a2.postBody(str4, new TypedByteArray(str2, bArr, new String[0]), list).execute().f33552b;
            C52711k.m112236a((Object) t2, "api.postBody(relativePat…headers).execute().body()");
            return (String) t2;
        }
        StringBuilder sb = new StringBuilder("CommonApi is null,url=");
        sb.append(str);
        throw new RuntimeException(sb.toString());
    }
}
