package com.bytedance.android.p140a.p151b.p156d.p159c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.p140a.p141a.C2786e;
import com.bytedance.android.p140a.p141a.p143b.C2776a;
import com.bytedance.android.p140a.p141a.p143b.C2777b;
import com.bytedance.android.p140a.p141a.p145d.C2785a;
import com.bytedance.android.p140a.p141a.p146e.C2788b;
import com.bytedance.android.p140a.p151b.p156d.C2828b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.b.d.c.a */
public final class C2830a implements C2828b {

    /* renamed from: a */
    private C2776a f8435a;

    /* renamed from: a */
    public final void mo7421a(int i) {
    }

    /* renamed from: a */
    public final void mo7420a() {
        this.f8435a.mo7371b().mo7372c();
    }

    /* renamed from: d */
    public final void mo7427d() {
        this.f8435a.mo7372c();
        this.f8435a = null;
    }

    public C2830a() {
        Context context = C2786e.m7920d().f8355b;
        this.f8435a = new C2777b(context, "ad_tracker_c2s_store_v2_adym3");
        C2776a aVar = C2786e.m7920d().f8359f;
        if (aVar != null && aVar.mo7370b("sp_c2s_store_version", 0) < 2) {
            m8064a(context);
            aVar.mo7367a("sp_c2s_store_version", 2).mo7372c();
        }
    }

    /* renamed from: c */
    public final List<C2788b> mo7425c() {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<>();
        Map a = this.f8435a.mo7369a();
        for (String str : a.keySet()) {
            Object obj = a.get(str);
            if (obj instanceof String) {
                C2788b a2 = m8063a((String) obj);
                if (a2 == null) {
                    arrayList2.add(str);
                } else if (a2.f8372j > 0) {
                    arrayList.add(a2);
                }
            } else {
                arrayList2.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String a3 : arrayList2) {
                this.f8435a.mo7366a(a3);
            }
            this.f8435a.mo7372c();
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List<C2788b> mo7423b() {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<>();
        Map a = this.f8435a.mo7369a();
        for (String str : a.keySet()) {
            Object obj = a.get(str);
            if (obj instanceof String) {
                C2788b a2 = m8063a((String) obj);
                if (a2 != null) {
                    arrayList.add(a2);
                } else {
                    arrayList2.add(str);
                }
            } else {
                arrayList2.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String a3 : arrayList2) {
                this.f8435a.mo7366a(a3);
            }
            this.f8435a.mo7372c();
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo7426c(C2788b bVar) {
        mo7422a(bVar);
    }

    /* renamed from: b */
    public final void mo7424b(C2788b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.f8363a)) {
            String str = bVar.f8363a;
            if (!TextUtils.isEmpty(str)) {
                this.f8435a.mo7366a(str).mo7372c();
            }
        }
    }

    /* renamed from: a */
    public final List<C2788b> mo7419a(List<C2788b> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (C2788b bVar : list) {
            if (!mo7422a(bVar)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        r7.deleteSharedPreferences("ad_tracker_c2s_store_1c20b");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8064a(android.content.Context r7) {
        /*
            r6 = this;
            r0 = 24
            java.lang.String r1 = "ad_tracker_c2s_store_1c20b"
            r2 = 0
            android.content.SharedPreferences r1 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r7, r1, r2)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            r2.<init>()     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.util.Map r1 = r1.getAll()     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.util.Set r3 = r1.keySet()     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
        L_0x001a:
            boolean r4 = r3.hasNext()     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r3.next()     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            boolean r5 = r4 instanceof java.lang.String     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            if (r5 == 0) goto L_0x001a
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            com.bytedance.android.a.a.e.b r4 = m8065b(r4)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            if (r4 == 0) goto L_0x001a
            r2.add(r4)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            goto L_0x001a
        L_0x003a:
            r6.mo7419a(r2)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L_0x0058
        L_0x0041:
            java.lang.String r0 = "ad_tracker_c2s_store_1c20b"
            r7.deleteSharedPreferences(r0)
            return
        L_0x0047:
            r1 = move-exception
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r0) goto L_0x0051
            java.lang.String r0 = "ad_tracker_c2s_store_1c20b"
            r7.deleteSharedPreferences(r0)
        L_0x0051:
            throw r1
        L_0x0052:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L_0x0058
            goto L_0x0041
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p140a.p151b.p156d.p159c.C2830a.m8064a(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a A[Catch:{ JSONException -> 0x007b }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.android.p140a.p141a.p146e.C2788b m8065b(java.lang.String r15) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x007b }
            r0.<init>(r15)     // Catch:{ JSONException -> 0x007b }
            r15 = 0
            java.lang.String r3 = r0.getString(r15)     // Catch:{ JSONException -> 0x007b }
            r2 = 1
            java.lang.String r4 = r0.getString(r2)     // Catch:{ JSONException -> 0x007b }
            r2 = 2
            long r5 = r0.getLong(r2)     // Catch:{ JSONException -> 0x007b }
            r2 = 3
            r7 = 4
            int r2 = r0.getInt(r2)     // Catch:{ JSONException -> 0x007b }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ JSONException -> 0x007b }
            r8.<init>()     // Catch:{ JSONException -> 0x007b }
        L_0x0027:
            if (r15 >= r2) goto L_0x0036
            int r9 = r7 + 1
            java.lang.String r7 = r0.getString(r7)     // Catch:{ JSONException -> 0x007b }
            r8.add(r7)     // Catch:{ JSONException -> 0x007b }
            int r15 = r15 + 1
            r7 = r9
            goto L_0x0027
        L_0x0036:
            int r15 = r7 + 1
            java.lang.String r12 = r0.getString(r7)     // Catch:{ JSONException -> 0x007b }
            int r2 = r15 + 1
            java.lang.String r15 = r0.getString(r15)     // Catch:{ JSONException -> 0x007b }
            boolean r7 = android.text.TextUtils.isEmpty(r15)     // Catch:{ JSONException -> 0x007b }
            if (r7 != 0) goto L_0x004f
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004f }
            r7.<init>(r15)     // Catch:{ JSONException -> 0x004f }
            r13 = r7
            goto L_0x0050
        L_0x004f:
            r13 = r1
        L_0x0050:
            int r15 = r2 + 1
            int r2 = r0.getInt(r2)     // Catch:{ JSONException -> 0x007b }
            int r7 = r15 + 1
            boolean r9 = r0.getBoolean(r15)     // Catch:{ JSONException -> 0x007b }
            int r15 = r7 + 1
            int r14 = r0.getInt(r7)     // Catch:{ JSONException -> 0x007b }
            r10 = -1
            int r7 = r0.length()     // Catch:{ JSONException -> 0x007b }
            if (r15 >= r7) goto L_0x006e
            long r10 = r0.getLong(r15)     // Catch:{ JSONException -> 0x007b }
        L_0x006e:
            com.bytedance.android.a.a.e.b r15 = new com.bytedance.android.a.a.e.b     // Catch:{ JSONException -> 0x007b }
            java.lang.String r0 = com.bytedance.android.p140a.p141a.p145d.C2785a.m7919a(r2)     // Catch:{ JSONException -> 0x007b }
            r2 = r15
            r7 = r8
            r8 = r0
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ JSONException -> 0x007b }
            return r15
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p140a.p151b.p156d.p159c.C2830a.m8065b(java.lang.String):com.bytedance.android.a.a.e.b");
    }

    /* renamed from: a */
    private static C2788b m8063a(String str) {
        C2788b bVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("uuid");
            String optString2 = jSONObject.optString("tracker_key");
            long optLong = jSONObject.optLong("ad_id");
            boolean optBoolean = jSONObject.optBoolean("is_standard");
            long optLong2 = jSONObject.optLong("non_std_ad_id");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("urls");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            String optString3 = jSONObject.optString("log_extra");
            JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
            try {
                long optLong3 = jSONObject.optLong("create_timestamp");
                String optString4 = jSONObject.optString("track_label");
                if (TextUtils.isEmpty(optString4) && jSONObject.has("track_type")) {
                    optString4 = C2785a.m7919a(jSONObject.optInt("track_type"));
                }
                C2788b bVar2 = new C2788b(optString, optString2, optLong, arrayList, optString4, optBoolean, optLong2, optString3, optJSONObject, jSONObject.optInt("tried_count", 0));
                bVar2.f8371i = optLong3;
                return bVar2;
            } catch (Throwable unused) {
                bVar = null;
                return bVar;
            }
        } catch (Throwable unused2) {
            bVar = null;
            return bVar;
        }
    }

    /* renamed from: d */
    private static String m8066d(C2788b bVar) {
        if (bVar == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uuid", bVar.f8363a).put("tracker_key", bVar.f8364b).put("ad_id", bVar.f8365c).put("is_standard", bVar.f8366d).put("non_std_ad_id", bVar.f8367e);
            JSONArray jSONArray = new JSONArray();
            List<String> list = bVar.f8368f;
            if (list != null) {
                for (String put : list) {
                    jSONArray.put(put);
                }
            }
            jSONObject.put("urls", jSONArray);
            jSONObject.put("log_extra", bVar.f8369g).put("ad_extra_data", bVar.f8370h).put("create_timestamp", bVar.f8371i).put("track_label", bVar.mo7390a()).put("tried_count", bVar.f8372j);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final boolean mo7422a(C2788b bVar) {
        if (bVar == null || TextUtils.isEmpty(bVar.f8363a)) {
            return false;
        }
        String d = m8066d(bVar);
        if (TextUtils.isEmpty(d)) {
            return false;
        }
        this.f8435a.mo7368a(bVar.f8363a, d).mo7372c();
        return true;
    }
}
