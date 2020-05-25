package com.p683ss.android.ugc.aweme.crossplatform.business.p1614a;

import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.a.a */
public final class C27170a {

    /* renamed from: a */
    public long f71676a;

    /* renamed from: b */
    public int f71677b = -1;

    /* renamed from: c */
    public long f71678c;

    /* renamed from: d */
    public boolean f71679d;

    /* renamed from: e */
    public boolean f71680e;

    /* renamed from: f */
    public String f71681f;

    /* renamed from: g */
    public String f71682g;

    /* renamed from: h */
    public boolean f71683h;

    /* renamed from: i */
    private boolean f71684i;

    /* renamed from: j */
    private boolean f71685j;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.a.a$a */
    public static class C27171a {

        /* renamed from: a */
        public static String f71686a;

        /* renamed from: b */
        public static String f71687b;

        /* renamed from: c */
        public static boolean f71688c;

        /* renamed from: d */
        public static String f71689d;

        /* renamed from: e */
        public static String f71690e;
    }

    /* renamed from: b */
    public static void m65585b() {
        C27171a.f71686a = null;
        C27171a.f71687b = null;
        C27171a.f71688c = false;
        C27171a.f71689d = null;
        C27171a.f71690e = null;
    }

    /* renamed from: a */
    public final void mo55518a() {
        this.f71685j = false;
        this.f71680e = false;
        this.f71684i = false;
        this.f71682g = null;
        this.f71678c = 0;
        this.f71676a = 0;
        this.f71683h = false;
    }

    /* renamed from: a */
    public static void m65583a(String str, String str2) {
        C27171a.f71686a = str;
        C27171a.f71687b = str2;
        C27171a.f71688c = false;
    }

    /* renamed from: a */
    public static void m65584a(String str, String str2, String str3) {
        C27171a.f71686a = str;
        C27171a.f71689d = str2;
        C27171a.f71690e = str3;
        C27171a.f71688c = true;
    }

    /* renamed from: a */
    public void mo55521a(String str, long j, JSONObject jSONObject, JSONObject jSONObject2) {
        if (j > 0) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("tag", "draw_ad");
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                jSONObject2.put("present_url", this.f71682g);
                jSONObject2.put("next_url", str);
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (JSONException unused) {
            }
            C26890h.onEvent(MobClick.obtain().setLabelName("jump_page").setEventName("ad_wap_stat").setValue(String.valueOf(j)).setJsonObject(jSONObject));
        }
    }

    /* renamed from: a */
    public final void mo55520a(WebView webView, String str, long j, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f71684i = true;
        mo55519a(webView.getContext(), str, j, jSONObject, jSONObject2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
        if (r4 < 1) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007d A[Catch:{ Exception -> 0x00e8 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007e A[Catch:{ Exception -> 0x00e8 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55519a(android.content.Context r9, java.lang.String r10, long r11, org.json.JSONObject r13, org.json.JSONObject r14) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00e9
            long r0 = r8.f71676a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000c
            goto L_0x00e9
        L_0x000c:
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0011
            return
        L_0x0011:
            boolean r0 = r8.f71679d
            if (r0 != 0) goto L_0x0028
            boolean r0 = r8.f71680e
            if (r0 == 0) goto L_0x0028
            boolean r0 = r8.f71684i
            if (r0 == 0) goto L_0x001e
            goto L_0x0028
        L_0x001e:
            java.lang.String r0 = "load_finish"
            com.ss.android.ugc.aweme.ap r1 = com.p683ss.android.ugc.aweme.C23794bh.m58383I()
            r1.onLandPageContentLoaded()
            goto L_0x002a
        L_0x0028:
            java.lang.String r0 = "load"
        L_0x002a:
            com.bytedance.common.utility.l$a r9 = com.bytedance.common.utility.C9425l.m18652c(r9)     // Catch:{ Exception -> 0x00e8 }
            com.bytedance.common.utility.l$a r1 = com.bytedance.common.utility.C9425l.C9426a.NONE     // Catch:{ Exception -> 0x00e8 }
            if (r9 != r1) goto L_0x0033
            return
        L_0x0033:
            if (r13 != 0) goto L_0x003a
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e8 }
            r13.<init>()     // Catch:{ Exception -> 0x00e8 }
        L_0x003a:
            java.lang.String r1 = "ac"
            java.lang.String r4 = com.bytedance.common.utility.C9425l.m18646a(r9)     // Catch:{ Exception -> 0x00e8 }
            r13.put(r1, r4)     // Catch:{ Exception -> 0x00e8 }
            boolean r1 = r8.f71684i     // Catch:{ Exception -> 0x00e8 }
            if (r1 == 0) goto L_0x004a
            java.lang.String r9 = "load_fail"
            goto L_0x008b
        L_0x004a:
            long r4 = r8.f71678c     // Catch:{ Exception -> 0x00e8 }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            java.lang.String r0 = "load"
        L_0x0053:
            long r4 = r8.f71678c     // Catch:{ Exception -> 0x00e8 }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0060
            long r4 = r8.f71678c     // Catch:{ Exception -> 0x00e8 }
            long r6 = r8.f71676a     // Catch:{ Exception -> 0x00e8 }
            r1 = 0
            long r4 = r4 - r6
            goto L_0x0068
        L_0x0060:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00e8 }
            long r6 = r8.f71676a     // Catch:{ Exception -> 0x00e8 }
            r1 = 0
            long r4 = r4 - r6
        L_0x0068:
            com.bytedance.common.utility.l$a r1 = com.bytedance.common.utility.C9425l.C9426a.WIFI     // Catch:{ Exception -> 0x00e8 }
            r6 = 1
            if (r9 != r1) goto L_0x0074
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0079
        L_0x0072:
            r4 = r2
            goto L_0x0079
        L_0x0074:
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0079
            goto L_0x0072
        L_0x0079:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 > 0) goto L_0x007e
            return
        L_0x007e:
            r1 = 90000(0x15f90, double:4.4466E-319)
            long r1 = java.lang.Math.min(r4, r1)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r9 = "duration"
            r13.put(r9, r1)     // Catch:{ Exception -> 0x00e8 }
            r9 = r0
        L_0x008b:
            if (r10 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            java.lang.String r10 = r8.f71681f     // Catch:{ Exception -> 0x00e8 }
        L_0x0090:
            if (r10 != 0) goto L_0x0093
            return
        L_0x0093:
            java.lang.String r0 = "is_ad_event"
            java.lang.String r1 = "1"
            r13.put(r0, r1)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r0 = "tag"
            java.lang.String r1 = "draw_ad"
            r13.put(r0, r1)     // Catch:{ Exception -> 0x00e8 }
            if (r14 != 0) goto L_0x00a8
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e8 }
            r14.<init>()     // Catch:{ Exception -> 0x00e8 }
        L_0x00a8:
            java.lang.String r0 = "next_url"
            r14.put(r0, r10)     // Catch:{ Exception -> 0x00e8 }
            int r10 = r8.f71677b     // Catch:{ Exception -> 0x00e8 }
            r0 = -1
            if (r10 == r0) goto L_0x00b9
            java.lang.String r10 = "preload_status"
            int r0 = r8.f71677b     // Catch:{ Exception -> 0x00e8 }
            r14.put(r10, r0)     // Catch:{ Exception -> 0x00e8 }
        L_0x00b9:
            java.lang.String r10 = "ad_extra_data"
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x00e8 }
            r13.put(r10, r14)     // Catch:{ Exception -> 0x00e8 }
            boolean r10 = r8.f71685j     // Catch:{ Exception -> 0x00e8 }
            if (r10 == 0) goto L_0x00c7
            return
        L_0x00c7:
            r10 = 1
            r8.f71685j = r10     // Catch:{ Exception -> 0x00e8 }
            com.ss.android.ugc.aweme.common.MobClick r10 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x00e8 }
            com.ss.android.ugc.aweme.common.MobClick r9 = r10.setLabelName(r9)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r10 = "ad_wap_stat"
            com.ss.android.ugc.aweme.common.MobClick r9 = r9.setEventName(r10)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r10 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x00e8 }
            com.ss.android.ugc.aweme.common.MobClick r9 = r9.setValue(r10)     // Catch:{ Exception -> 0x00e8 }
            com.ss.android.ugc.aweme.common.MobClick r9 = r9.setJsonObject(r13)     // Catch:{ Exception -> 0x00e8 }
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r9)     // Catch:{ Exception -> 0x00e8 }
            return
        L_0x00e8:
            return
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.business.p1614a.C27170a.mo55519a(android.content.Context, java.lang.String, long, org.json.JSONObject, org.json.JSONObject):void");
    }
}
