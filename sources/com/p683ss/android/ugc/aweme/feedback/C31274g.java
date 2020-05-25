package com.p683ss.android.ugc.aweme.feedback;

import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feedback.g */
public final class C31274g {

    /* renamed from: a */
    public long f81948a;

    /* renamed from: b */
    public long f81949b;

    /* renamed from: c */
    public int f81950c;

    /* renamed from: d */
    public long f81951d;

    /* renamed from: e */
    public String f81952e;

    /* renamed from: f */
    public String f81953f;

    /* renamed from: g */
    public String f81954g;

    /* renamed from: h */
    public int f81955h;

    /* renamed from: i */
    public int f81956i;

    /* renamed from: j */
    public int f81957j;

    /* renamed from: k */
    public String f81958k;

    /* renamed from: l */
    public List<C31276b> f81959l;

    /* renamed from: m */
    public List<C31275a> f81960m;

    /* renamed from: n */
    public boolean f81961n;

    /* renamed from: com.ss.android.ugc.aweme.feedback.g$a */
    class C31275a {

        /* renamed from: a */
        public int f81962a;

        /* renamed from: b */
        public int f81963b;

        /* renamed from: c */
        public String f81964c;

        C31275a(String str, int i, int i2) {
            this.f81962a = i;
            this.f81963b = i2;
            this.f81964c = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.g$b */
    public class C31276b {

        /* renamed from: a */
        public int f81966a;

        /* renamed from: b */
        public int f81967b;

        /* renamed from: c */
        public String f81968c;

        public C31276b() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d A[Catch:{ Exception -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64169a() {
        /*
            r8 = this;
            java.lang.String r0 = r8.f81958k
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x0076 }
            java.lang.String r1 = r8.f81958k     // Catch:{ Exception -> 0x0076 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0076 }
            int r1 = r0.length()     // Catch:{ Exception -> 0x0076 }
            if (r1 != 0) goto L_0x0017
            return
        L_0x0017:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0076 }
            r2.<init>()     // Catch:{ Exception -> 0x0076 }
            r8.f81959l = r2     // Catch:{ Exception -> 0x0076 }
            r2 = 0
            r3 = 0
        L_0x0020:
            if (r3 >= r1) goto L_0x0075
            org.json.JSONObject r4 = r0.getJSONObject(r3)     // Catch:{ Exception -> 0x0076 }
            com.ss.android.ugc.aweme.feedback.g$b r5 = new com.ss.android.ugc.aweme.feedback.g$b     // Catch:{ Exception -> 0x0076 }
            r5.<init>()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r6 = "start"
            r7 = -1
            int r6 = r4.optInt(r6, r7)     // Catch:{ Exception -> 0x0076 }
            r5.f81966a = r6     // Catch:{ Exception -> 0x0076 }
            java.lang.String r6 = "length"
            int r6 = r4.optInt(r6, r7)     // Catch:{ Exception -> 0x0076 }
            r5.f81967b = r6     // Catch:{ Exception -> 0x0076 }
            java.lang.String r6 = "url"
            java.lang.String r4 = r4.optString(r6)     // Catch:{ Exception -> 0x0076 }
            r5.f81968c = r4     // Catch:{ Exception -> 0x0076 }
            int r4 = r5.f81966a     // Catch:{ Exception -> 0x0076 }
            if (r4 >= 0) goto L_0x004a
        L_0x0048:
            r4 = 0
            goto L_0x006b
        L_0x004a:
            int r4 = r5.f81967b     // Catch:{ Exception -> 0x0076 }
            if (r4 >= 0) goto L_0x004f
            goto L_0x0048
        L_0x004f:
            com.ss.android.ugc.aweme.feedback.g r4 = com.p683ss.android.ugc.aweme.feedback.C31274g.this     // Catch:{ Exception -> 0x0076 }
            java.lang.String r4 = r4.f81952e     // Catch:{ Exception -> 0x0076 }
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r4)     // Catch:{ Exception -> 0x0076 }
            if (r4 == 0) goto L_0x005a
            goto L_0x0048
        L_0x005a:
            int r4 = r5.f81966a     // Catch:{ Exception -> 0x0076 }
            int r6 = r5.f81967b     // Catch:{ Exception -> 0x0076 }
            int r4 = r4 + r6
            com.ss.android.ugc.aweme.feedback.g r6 = com.p683ss.android.ugc.aweme.feedback.C31274g.this     // Catch:{ Exception -> 0x0076 }
            java.lang.String r6 = r6.f81952e     // Catch:{ Exception -> 0x0076 }
            int r6 = r6.length()     // Catch:{ Exception -> 0x0076 }
            if (r4 <= r6) goto L_0x006a
            goto L_0x0048
        L_0x006a:
            r4 = 1
        L_0x006b:
            if (r4 == 0) goto L_0x0072
            java.util.List<com.ss.android.ugc.aweme.feedback.g$b> r4 = r8.f81959l     // Catch:{ Exception -> 0x0076 }
            r4.add(r5)     // Catch:{ Exception -> 0x0076 }
        L_0x0072:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0075:
            return
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feedback.C31274g.mo64169a():void");
    }

    public C31274g(long j) {
        this(j, j, 0);
    }

    /* renamed from: a */
    private List<C31275a> m73003a(String str) {
        if (C9431p.m18664a(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            this.f81953f = jSONObject.optString("image_url");
            this.f81955h = jSONObject.optInt("image_width", 0);
            this.f81956i = jSONObject.optInt("image_height", 0);
            for (int i = 1; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                arrayList.add(new C31275a(jSONObject2.optString("image_url"), jSONObject2.optInt("image_width", 0), jSONObject2.optInt("image_height", 0)));
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo64170a(JSONObject jSONObject) {
        this.f81951d = jSONObject.optLong("pub_date");
        this.f81952e = jSONObject.optString(C42311c.f106865i);
        this.f81953f = jSONObject.optString("image_url");
        this.f81954g = jSONObject.optString("avatar_url");
        this.f81955h = jSONObject.optInt("image_width", 0);
        this.f81956i = jSONObject.optInt("image_height", 0);
        this.f81957j = jSONObject.optInt("type", 0);
        this.f81958k = jSONObject.optString("links");
        if (jSONObject.optInt("multi_image", 0) == 1) {
            this.f81960m = m73003a(jSONObject.optString("image_list"));
        }
    }

    public C31274g(long j, long j2, int i) {
        this.f81948a = j;
        this.f81949b = j2;
        this.f81950c = i;
    }
}
