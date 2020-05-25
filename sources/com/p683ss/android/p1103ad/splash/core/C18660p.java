package com.p683ss.android.p1103ad.splash.core;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import com.p683ss.android.p1103ad.splash.C18756h;
import com.p683ss.android.p1103ad.splash.C18760l;
import com.p683ss.android.p1103ad.splash.C18760l.C18763b;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18603c;
import com.p683ss.android.p1103ad.splash.p1110b.C18557b;
import com.p683ss.android.p1103ad.splash.p1123g.C18740f;
import com.p683ss.android.p1103ad.splash.p1123g.C18744j;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import com.p683ss.android.p1103ad.splash.p1123g.C18753q;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.p */
final class C18660p implements C18659o {

    /* renamed from: a */
    private C18756h f51572a;

    /* renamed from: b */
    private volatile boolean f51573b;

    /* renamed from: c */
    private long f51574c;

    /* renamed from: d */
    private View f51575d;

    /* renamed from: c */
    public final void mo38084c() {
        this.f51574c = System.currentTimeMillis();
    }

    /* renamed from: d */
    private void m45305d() {
        this.f51573b = true;
        C18663r.m45318j().f51579a = false;
    }

    /* renamed from: a */
    public final void mo38078a() {
        if (!this.f51573b) {
            m45305d();
            C18557b.m44917a().mo37853d();
            this.f51572a.mo38357a(this.f51575d);
        }
    }

    /* renamed from: b */
    public final void mo38081b() {
        if (!this.f51573b) {
            m45305d();
            C18557b.m44917a().mo37853d();
            this.f51572a.mo38357a(this.f51575d);
        }
    }

    /* renamed from: b */
    public final void mo38082b(C18602b bVar) {
        this.f51572a.mo38356a(bVar.mo37863p(), bVar.mo37864r());
    }

    /* renamed from: a */
    public final void mo38079a(C18602b bVar) {
        if (!this.f51573b) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (bVar.mo37865x() == 0 || bVar.mo37865x() == 4) {
                    jSONObject.putOpt("show_time", Long.valueOf(System.currentTimeMillis() - this.f51574c));
                }
                if (!C18747l.m45742a(bVar.mo37864r())) {
                    jSONObject.putOpt("log_extra", bVar.mo37864r());
                }
                jSONObject.putOpt("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", bVar.mo37862f());
            } catch (Exception unused) {
                jSONObject = null;
            }
            C18642g.m45201a(bVar.mo37863p(), "splash_ad", "skip", jSONObject);
            C18557b.m44917a().mo37853d();
            m45305d();
            this.f51572a.mo38357a(this.f51575d);
        }
    }

    public C18660p(View view, C18756h hVar) {
        this.f51575d = view;
        this.f51572a = hVar;
    }

    /* renamed from: b */
    public final boolean mo38083b(C18602b bVar, C18603c cVar) {
        JSONObject jSONObject;
        String str;
        boolean z = this.f51573b;
        List<C18763b> a = m45304a(bVar.mo37994q(), bVar.f51330d, bVar.mo37995s());
        if (!C18740f.m45692b(a)) {
            return false;
        }
        C18760l F = bVar.mo37970F();
        F.f51858j = a;
        this.f51572a.mo38358a(this.f51575d, F);
        try {
            Point point = cVar.f51355c;
            jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("click_x", Integer.valueOf(point.x));
            jSONObject2.putOpt("click_y", Integer.valueOf(point.y));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.put("ad_fetch_time", bVar.mo37862f());
            if (!C18747l.m45742a(bVar.mo37864r())) {
                jSONObject.put("log_extra", bVar.mo37864r());
            }
            jSONObject.putOpt("is_ad_event", "1");
        } catch (Exception unused) {
            jSONObject = null;
        }
        long p = bVar.mo37863p();
        String str2 = "splash_ad";
        if (cVar.f51354b) {
            str = "click";
        } else {
            str = "banner_click";
        }
        C18642g.m45201a(p, str2, str, jSONObject);
        if (bVar.f51339m != null) {
            C18642g.m45180H().mo38043b(null, bVar.mo37863p(), bVar.mo37855A(), bVar.mo37864r(), true, -1, null);
        }
        m45305d();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38080a(com.p683ss.android.p1103ad.splash.core.p1114c.C18602b r18, com.p683ss.android.p1103ad.splash.core.p1114c.C18603c r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f51573b
            int r3 = r18.mo37865x()
            r4 = 0
            r5 = 4
            r6 = 1
            r7 = 0
            if (r3 != r5) goto L_0x0043
            int r3 = r2.f51353a
            if (r3 < 0) goto L_0x0043
            java.util.List<java.lang.String> r3 = r1.f51343q
            java.util.List<java.lang.String> r8 = r1.f51342p
            if (r3 == 0) goto L_0x002d
            int r9 = r3.size()
            int r10 = r2.f51353a
            if (r9 <= r10) goto L_0x002d
            int r9 = r2.f51353a
            java.lang.Object r3 = r3.get(r9)
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x002e
        L_0x002d:
            r3 = r7
        L_0x002e:
            if (r8 == 0) goto L_0x0041
            int r9 = r8.size()
            int r10 = r2.f51353a
            if (r9 <= r10) goto L_0x0041
            int r9 = r2.f51353a
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0080
        L_0x0041:
            r8 = r7
            goto L_0x0080
        L_0x0043:
            int r3 = r1.f51335i
            r8 = 3
            if (r3 != r8) goto L_0x0078
            int r3 = r2.f51353a
            if (r3 >= 0) goto L_0x0078
            java.lang.String r3 = r18.mo37984g()
            boolean r3 = com.p683ss.android.p1103ad.splash.p1123g.C18744j.m45728b(r3)
            if (r3 == 0) goto L_0x006e
            java.lang.String r3 = r18.mo37984g()
            com.ss.android.ad.splash.core.c.d$a r8 = new com.ss.android.ad.splash.core.c.d$a
            r8.<init>()
            int r9 = r1.f51296E
            if (r9 != r6) goto L_0x0065
            r9 = 1
            goto L_0x0066
        L_0x0065:
            r9 = 0
        L_0x0066:
            r8.f51366a = r9
            com.ss.android.ad.splash.core.c.d r9 = new com.ss.android.ad.splash.core.c.d
            r9.<init>(r8)
            goto L_0x0073
        L_0x006e:
            java.lang.String r3 = r18.mo37994q()
            r9 = r7
        L_0x0073:
            java.lang.String r8 = r18.mo37995s()
            goto L_0x0081
        L_0x0078:
            java.lang.String r3 = r18.mo37994q()
            java.lang.String r8 = r18.mo37995s()
        L_0x0080:
            r9 = r7
        L_0x0081:
            boolean r10 = r2.f51357e
            if (r10 == 0) goto L_0x00b9
            java.lang.String r10 = r2.f51356d
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            java.lang.String r12 = "ad_fetch_time"
            long r13 = r18.mo37862f()     // Catch:{ JSONException -> 0x00b0 }
            r11.put(r12, r13)     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r12 = r18.mo37864r()     // Catch:{ JSONException -> 0x00b0 }
            boolean r12 = com.p683ss.android.p1103ad.splash.p1123g.C18747l.m45742a(r12)     // Catch:{ JSONException -> 0x00b0 }
            if (r12 != 0) goto L_0x00a8
            java.lang.String r12 = "log_extra"
            java.lang.String r13 = r18.mo37864r()     // Catch:{ JSONException -> 0x00b0 }
            r11.put(r12, r13)     // Catch:{ JSONException -> 0x00b0 }
        L_0x00a8:
            java.lang.String r12 = "is_ad_event"
            java.lang.String r13 = "1"
            r11.put(r12, r13)     // Catch:{ JSONException -> 0x00b0 }
            r7 = r11
        L_0x00b0:
            long r11 = r18.mo37863p()
            java.lang.String r13 = "splash_ad"
            com.p683ss.android.p1103ad.splash.core.C18642g.m45201a(r11, r13, r10, r7)
        L_0x00b9:
            java.lang.String r7 = r1.f51330d
            java.util.List r3 = m45304a(r3, r7, r8)
            boolean r7 = com.p683ss.android.p1103ad.splash.p1123g.C18740f.m45692b(r3)
            if (r7 == 0) goto L_0x0171
            com.ss.android.ad.splash.l r7 = r18.mo37970F()
            r7.f51858j = r3
            r7.f51859k = r9
            com.ss.android.ad.splash.h r3 = r0.f51572a
            android.view.View r8 = r0.f51575d
            r3.mo38358a(r8, r7)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            android.graphics.Point r7 = r2.f51355c     // Catch:{ Exception -> 0x014a }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x014a }
            r8.<init>()     // Catch:{ Exception -> 0x014a }
            int r9 = r2.f51353a     // Catch:{ Exception -> 0x014a }
            if (r9 < 0) goto L_0x00f6
            int r9 = r18.mo37865x()     // Catch:{ Exception -> 0x014a }
            if (r9 != r5) goto L_0x00f6
            java.lang.String r5 = "pic_position"
            int r9 = r2.f51353a     // Catch:{ Exception -> 0x014a }
            int r9 = r9 + r6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x014a }
            r8.putOpt(r5, r9)     // Catch:{ Exception -> 0x014a }
        L_0x00f6:
            java.lang.String r5 = "click_x"
            int r9 = r7.x     // Catch:{ Exception -> 0x014a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x014a }
            r8.putOpt(r5, r9)     // Catch:{ Exception -> 0x014a }
            java.lang.String r5 = "click_y"
            int r7 = r7.y     // Catch:{ Exception -> 0x014a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x014a }
            r8.putOpt(r5, r7)     // Catch:{ Exception -> 0x014a }
            java.lang.String r5 = "ad_extra_data"
            r3.putOpt(r5, r8)     // Catch:{ Exception -> 0x014a }
            java.lang.String r5 = "area"
            int r2 = r2.f51353a     // Catch:{ Exception -> 0x014a }
            if (r2 < 0) goto L_0x0118
            goto L_0x0119
        L_0x0118:
            r4 = 1
        L_0x0119:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x014a }
            r3.putOpt(r5, r2)     // Catch:{ Exception -> 0x014a }
            java.lang.String r2 = "log_extra"
            java.lang.String r4 = r18.mo37864r()     // Catch:{ Exception -> 0x014a }
            r3.putOpt(r2, r4)     // Catch:{ Exception -> 0x014a }
            java.lang.String r2 = "is_ad_event"
            java.lang.String r4 = "1"
            r3.putOpt(r2, r4)     // Catch:{ Exception -> 0x014a }
            java.lang.String r2 = "show_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x014a }
            long r6 = r0.f51574c     // Catch:{ Exception -> 0x014a }
            r8 = 0
            long r4 = r4 - r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x014a }
            r3.putOpt(r2, r4)     // Catch:{ Exception -> 0x014a }
            java.lang.String r2 = "ad_fetch_time"
            long r4 = r18.mo37862f()     // Catch:{ Exception -> 0x014a }
            r3.put(r2, r4)     // Catch:{ Exception -> 0x014a }
        L_0x014a:
            long r4 = r18.mo37863p()
            java.lang.String r2 = "splash_ad"
            java.lang.String r6 = "click"
            com.p683ss.android.p1103ad.splash.core.C18642g.m45201a(r4, r2, r6, r3)
            com.ss.android.ad.splash.core.f.b r7 = com.p683ss.android.p1103ad.splash.core.C18642g.m45180H()
            r8 = 0
            long r9 = r18.mo37863p()
            java.util.List r11 = r18.mo37855A()
            java.lang.String r12 = r18.mo37864r()
            r13 = 1
            r14 = -1
            r16 = 0
            r7.mo38043b(r8, r9, r11, r12, r13, r14, r16)
            r17.m45305d()
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1103ad.splash.core.C18660p.mo38080a(com.ss.android.ad.splash.core.c.b, com.ss.android.ad.splash.core.c.c):void");
    }

    /* renamed from: a */
    private static List<C18763b> m45304a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && C18744j.m45728b(str)) {
            int a = C18744j.m45702a(str);
            if (a == 3 || a == 4) {
                if (!TextUtils.isEmpty(str3)) {
                    arrayList.add(new C18763b(str3, a));
                }
            } else if (a != 0) {
                if (a != 5) {
                    arrayList.add(new C18763b(str, a));
                } else if (C18642g.m45251x() != null && C18642g.m45251x().mo38373a()) {
                    arrayList.add(new C18763b(str, 1));
                }
            }
        }
        if (C18753q.m45759b(str2) && C18642g.m45251x() != null && C18642g.m45251x().mo38373a()) {
            arrayList.add(new C18763b(str2, 5));
        }
        if (C18753q.m45758a(str3)) {
            arrayList.add(new C18763b(str3, 2));
        }
        return arrayList;
    }
}
