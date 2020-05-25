package com.p683ss.android.ugc.aweme.image;

import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.image.i */
public final class C35497i {

    /* renamed from: a */
    public static final C35497i f91251a = new C35497i();

    /* renamed from: b */
    private static C35496h f91252b = new C35496h();

    private C35497i() {
    }

    /* renamed from: a */
    public final synchronized void mo73891a(JSONObject jSONObject) {
        C52711k.m112240b(jSONObject, "jsonObject");
        if (f91252b.f91243a != 0) {
            jSONObject.put("image_delay_total", f91252b.f91247e);
            jSONObject.put("image_fail_tms", f91252b.f91249g);
            jSONObject.put("image_num", f91252b.f91243a);
            jSONObject.put("image_re_delay_total", f91252b.f91248f);
            jSONObject.put("image_re_fail_tms", f91252b.f91250h);
            jSONObject.put("image_re_size_total", f91252b.f91246d);
            jSONObject.put("image_re_num", f91252b.f91244b);
            jSONObject.put("image_size_total", f91252b.f91245c);
            C35496h hVar = f91252b;
            hVar.f91243a = 0;
            hVar.f91244b = 0;
            hVar.f91245c = 0;
            hVar.f91246d = 0;
            hVar.f91247e = 0;
            hVar.f91248f = 0;
            hVar.f91249g = 0;
            hVar.f91250h = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo73892a(boolean r7, org.json.JSONObject r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "json"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "uri"
            java.lang.String r0 = r8.optString(r0)     // Catch:{ all -> 0x008b }
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x008b }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001c
            int r1 = r1.length()     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r1 = 0
            goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            if (r1 == 0) goto L_0x0021
            monitor-exit(r6)
            return
        L_0x0021:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x008b }
            java.lang.String r1 = "~tplv-tiktok-shrink"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x008b }
            r4 = 2
            r5 = 0
            boolean r0 = p2628d.p2650m.C52830p.m112456b(r0, r1, r2, r4, r5)     // Catch:{ all -> 0x008b }
            if (r7 == 0) goto L_0x0079
            com.ss.android.ugc.aweme.image.h r7 = f91252b     // Catch:{ all -> 0x008b }
            int r1 = r7.f91243a     // Catch:{ all -> 0x008b }
            int r1 = r1 + r3
            r7.f91243a = r1     // Catch:{ all -> 0x008b }
            com.ss.android.ugc.aweme.image.h r7 = f91252b     // Catch:{ all -> 0x008b }
            int r1 = r7.f91245c     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "file_size"
            int r2 = r8.optInt(r2)     // Catch:{ all -> 0x008b }
            int r2 = r2 / 1024
            int r1 = r1 + r2
            r7.f91245c = r1     // Catch:{ all -> 0x008b }
            com.ss.android.ugc.aweme.image.h r7 = f91252b     // Catch:{ all -> 0x008b }
            int r1 = r7.f91247e     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "duration"
            int r2 = r8.optInt(r2)     // Catch:{ all -> 0x008b }
            int r1 = r1 + r2
            r7.f91247e = r1     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.image.h r7 = f91252b     // Catch:{ all -> 0x008b }
            int r0 = r7.f91244b     // Catch:{ all -> 0x008b }
            int r0 = r0 + r3
            r7.f91244b = r0     // Catch:{ all -> 0x008b }
            com.ss.android.ugc.aweme.image.h r7 = f91252b     // Catch:{ all -> 0x008b }
            int r0 = r7.f91246d     // Catch:{ all -> 0x008b }
            java.lang.String r1 = "file_size"
            int r1 = r8.optInt(r1)     // Catch:{ all -> 0x008b }
            int r1 = r1 / 1024
            int r0 = r0 + r1
            r7.f91246d = r0     // Catch:{ all -> 0x008b }
            com.ss.android.ugc.aweme.image.h r7 = f91252b     // Catch:{ all -> 0x008b }
            int r0 = r7.f91248f     // Catch:{ all -> 0x008b }
            java.lang.String r1 = "duration"
            int r8 = r8.optInt(r1)     // Catch:{ all -> 0x008b }
            int r0 = r0 + r8
            r7.f91248f = r0     // Catch:{ all -> 0x008b }
            monitor-exit(r6)
            return
        L_0x0079:
            com.ss.android.ugc.aweme.image.h r7 = f91252b     // Catch:{ all -> 0x008b }
            int r8 = r7.f91249g     // Catch:{ all -> 0x008b }
            int r8 = r8 + r3
            r7.f91249g = r8     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.image.h r7 = f91252b     // Catch:{ all -> 0x008b }
            int r8 = r7.f91250h     // Catch:{ all -> 0x008b }
            int r8 = r8 + r3
            r7.f91250h = r8     // Catch:{ all -> 0x008b }
        L_0x0089:
            monitor-exit(r6)
            return
        L_0x008b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.image.C35497i.mo73892a(boolean, org.json.JSONObject):void");
    }
}
