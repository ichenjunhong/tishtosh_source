package com.p683ss.android.ugc.aweme.bullet.business.p1474a;

import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.a.a */
public final class C24253a {

    /* renamed from: a */
    public long f64367a;

    /* renamed from: b */
    public int f64368b = -1;

    /* renamed from: c */
    public long f64369c;

    /* renamed from: d */
    public boolean f64370d;

    /* renamed from: e */
    public boolean f64371e;

    /* renamed from: f */
    public boolean f64372f;

    /* renamed from: g */
    public String f64373g;

    /* renamed from: h */
    public String f64374h;

    /* renamed from: i */
    public boolean f64375i;

    /* renamed from: a */
    public void mo50024a(String str, long j, JSONObject jSONObject, JSONObject jSONObject2) {
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
                jSONObject2.put("present_url", this.f64374h);
                jSONObject2.put("next_url", str);
                jSONObject2.put("container_type", "bullet");
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (JSONException unused) {
            }
            C26890h.onEvent(MobClick.obtain().setLabelName("jump_page").setEventName("ad_wap_stat").setValue(String.valueOf(j)).setJsonObject(jSONObject));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
        if (r4 < 1) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0079 A[Catch:{ Exception -> 0x00eb }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007a A[Catch:{ Exception -> 0x00eb }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50023a(android.content.Context r9, java.lang.String r10, long r11, org.json.JSONObject r13, org.json.JSONObject r14) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00ec
            long r0 = r8.f64367a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000c
            goto L_0x00ec
        L_0x000c:
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0011
            return
        L_0x0011:
            boolean r0 = r8.f64370d
            if (r0 != 0) goto L_0x0024
            boolean r0 = r8.f64371e
            if (r0 == 0) goto L_0x0024
            boolean r0 = r8.f64372f
            if (r0 == 0) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            java.lang.String r0 = "load_finish"
            com.p683ss.android.ugc.aweme.commercialize.feed.C25867ab.m62599a()
            goto L_0x0026
        L_0x0024:
            java.lang.String r0 = "load"
        L_0x0026:
            com.bytedance.common.utility.l$a r9 = com.bytedance.common.utility.C9425l.m18652c(r9)     // Catch:{ Exception -> 0x00eb }
            com.bytedance.common.utility.l$a r1 = com.bytedance.common.utility.C9425l.C9426a.NONE     // Catch:{ Exception -> 0x00eb }
            if (r9 != r1) goto L_0x002f
            return
        L_0x002f:
            if (r13 != 0) goto L_0x0036
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x00eb }
            r13.<init>()     // Catch:{ Exception -> 0x00eb }
        L_0x0036:
            java.lang.String r1 = "ac"
            java.lang.String r4 = com.bytedance.common.utility.C9425l.m18646a(r9)     // Catch:{ Exception -> 0x00eb }
            r13.put(r1, r4)     // Catch:{ Exception -> 0x00eb }
            boolean r1 = r8.f64372f     // Catch:{ Exception -> 0x00eb }
            if (r1 == 0) goto L_0x0046
            java.lang.String r9 = "load_fail"
            goto L_0x0087
        L_0x0046:
            long r4 = r8.f64369c     // Catch:{ Exception -> 0x00eb }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            java.lang.String r0 = "load"
        L_0x004f:
            long r4 = r8.f64369c     // Catch:{ Exception -> 0x00eb }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x005c
            long r4 = r8.f64369c     // Catch:{ Exception -> 0x00eb }
            long r6 = r8.f64367a     // Catch:{ Exception -> 0x00eb }
            r1 = 0
            long r4 = r4 - r6
            goto L_0x0064
        L_0x005c:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00eb }
            long r6 = r8.f64367a     // Catch:{ Exception -> 0x00eb }
            r1 = 0
            long r4 = r4 - r6
        L_0x0064:
            com.bytedance.common.utility.l$a r1 = com.bytedance.common.utility.C9425l.C9426a.WIFI     // Catch:{ Exception -> 0x00eb }
            r6 = 1
            if (r9 != r1) goto L_0x0070
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0075
        L_0x006e:
            r4 = r2
            goto L_0x0075
        L_0x0070:
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0075
            goto L_0x006e
        L_0x0075:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 > 0) goto L_0x007a
            return
        L_0x007a:
            r1 = 90000(0x15f90, double:4.4466E-319)
            long r1 = java.lang.Math.min(r4, r1)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r9 = "duration"
            r13.put(r9, r1)     // Catch:{ Exception -> 0x00eb }
            r9 = r0
        L_0x0087:
            if (r10 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            java.lang.String r10 = r8.f64373g     // Catch:{ Exception -> 0x00eb }
        L_0x008c:
            if (r10 != 0) goto L_0x008f
            return
        L_0x008f:
            java.lang.String r0 = "is_ad_event"
            java.lang.String r1 = "1"
            r13.put(r0, r1)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r0 = "tag"
            java.lang.String r1 = "draw_ad"
            r13.put(r0, r1)     // Catch:{ Exception -> 0x00eb }
            if (r14 != 0) goto L_0x00a4
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x00eb }
            r14.<init>()     // Catch:{ Exception -> 0x00eb }
        L_0x00a4:
            java.lang.String r0 = "next_url"
            r14.put(r0, r10)     // Catch:{ Exception -> 0x00eb }
            int r10 = r8.f64368b     // Catch:{ Exception -> 0x00eb }
            r0 = -1
            if (r10 == r0) goto L_0x00b5
            java.lang.String r10 = "preload_status"
            int r0 = r8.f64368b     // Catch:{ Exception -> 0x00eb }
            r14.put(r10, r0)     // Catch:{ Exception -> 0x00eb }
        L_0x00b5:
            java.lang.String r10 = "container_type"
            java.lang.String r0 = "bullet"
            r14.put(r10, r0)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r10 = "ad_extra_data"
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x00eb }
            r13.put(r10, r14)     // Catch:{ Exception -> 0x00eb }
            boolean r10 = r8.f64375i     // Catch:{ Exception -> 0x00eb }
            if (r10 == 0) goto L_0x00ca
            return
        L_0x00ca:
            r10 = 1
            r8.f64375i = r10     // Catch:{ Exception -> 0x00eb }
            com.ss.android.ugc.aweme.common.MobClick r10 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x00eb }
            com.ss.android.ugc.aweme.common.MobClick r9 = r10.setLabelName(r9)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r10 = "ad_wap_stat"
            com.ss.android.ugc.aweme.common.MobClick r9 = r9.setEventName(r10)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r10 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x00eb }
            com.ss.android.ugc.aweme.common.MobClick r9 = r9.setValue(r10)     // Catch:{ Exception -> 0x00eb }
            com.ss.android.ugc.aweme.common.MobClick r9 = r9.setJsonObject(r13)     // Catch:{ Exception -> 0x00eb }
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r9)     // Catch:{ Exception -> 0x00eb }
            return
        L_0x00eb:
            return
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.business.p1474a.C24253a.mo50023a(android.content.Context, java.lang.String, long, org.json.JSONObject, org.json.JSONObject):void");
    }
}
