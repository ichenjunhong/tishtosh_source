package com.p683ss.ugc.live.sdk.p2606b;

import com.p683ss.ugc.live.sdk.p2605a.C51618a;
import com.p683ss.ugc.live.sdk.p2606b.C51627c.C51628a;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.ugc.live.sdk.b.a */
public abstract class C51619a implements C51627c {

    /* renamed from: a */
    private final C51631d f128923a;

    /* renamed from: b */
    private final C51621a f128924b;

    /* renamed from: c */
    private C51618a f128925c;

    /* renamed from: com.ss.ugc.live.sdk.b.a$a */
    static class C51621a implements C51628a {

        /* renamed from: a */
        public C51628a f128927a;

        /* renamed from: b */
        private final C51631d f128928b;

        private C51621a(C51631d dVar) {
            this.f128928b = dVar;
        }

        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo78953a(com.p683ss.ugc.live.sdk.p2606b.C51627c.C51629b r8, int r9, java.lang.String r10) {
            /*
                r7 = this;
                int[] r0 = com.p683ss.ugc.live.sdk.p2606b.C51619a.C516201.f128926a
                int r1 = r8.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L_0x00b9;
                    case 2: goto L_0x00b3;
                    case 3: goto L_0x00a4;
                    case 4: goto L_0x006f;
                    case 5: goto L_0x000d;
                    default: goto L_0x000b;
                }
            L_0x000b:
                goto L_0x00be
            L_0x000d:
                com.ss.ugc.live.sdk.b.d r0 = r7.f128928b
                boolean r1 = android.text.TextUtils.isEmpty(r10)
                if (r1 != 0) goto L_0x00be
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006d }
                r1.<init>(r10)     // Catch:{ JSONException -> 0x006d }
                java.lang.String r2 = "ts"
                boolean r2 = r1.has(r2)     // Catch:{ JSONException -> 0x006d }
                if (r2 != 0) goto L_0x0024
                goto L_0x00be
            L_0x0024:
                java.lang.String r2 = "ts"
                long r2 = r1.getLong(r2)     // Catch:{ JSONException -> 0x006d }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x006d }
                r6 = 0
                long r4 = r4 - r2
                r2 = 0
                int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r6 <= 0) goto L_0x0038
                r0.f128949f = r4     // Catch:{ JSONException -> 0x006d }
            L_0x0038:
                java.lang.String r2 = "source"
                boolean r2 = r1.has(r2)     // Catch:{ JSONException -> 0x006d }
                if (r2 == 0) goto L_0x0064
                java.lang.String r2 = "source"
                java.lang.String r2 = r1.getString(r2)     // Catch:{ JSONException -> 0x006d }
                java.lang.String r3 = "zego"
                boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch:{ JSONException -> 0x006d }
                if (r2 == 0) goto L_0x0057
                java.lang.String r1 = ""
                r0.f128950g = r1     // Catch:{ JSONException -> 0x006d }
                java.lang.String r1 = "zego"
                r0.f128951h = r1     // Catch:{ JSONException -> 0x006d }
                goto L_0x00be
            L_0x0057:
                java.lang.String r2 = "source"
                java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x006d }
                r0.f128950g = r1     // Catch:{ JSONException -> 0x006d }
                java.lang.String r1 = "livesdk"
                r0.f128951h = r1     // Catch:{ JSONException -> 0x006d }
                goto L_0x00be
            L_0x0064:
                java.lang.String r1 = "agora"
                r0.f128951h = r1     // Catch:{ JSONException -> 0x006d }
                java.lang.String r1 = ""
                r0.f128950g = r1     // Catch:{ JSONException -> 0x006d }
                goto L_0x00be
            L_0x006d:
                goto L_0x00be
            L_0x006f:
                com.ss.ugc.live.sdk.b.d r0 = r7.f128928b
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x006d }
                long r3 = r0.f128947d     // Catch:{ JSONException -> 0x006d }
                r5 = 0
                long r1 = r1 - r3
                long r3 = r0.f128948e     // Catch:{ JSONException -> 0x006d }
                r5 = 0
                long r3 = r3 + r1
                r0.f128948e = r3     // Catch:{ JSONException -> 0x006d }
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x006d }
                r0.f128947d = r3     // Catch:{ JSONException -> 0x006d }
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006d }
                r3.<init>()     // Catch:{ JSONException -> 0x006d }
                java.lang.String r4 = "body_type"
                java.lang.String r5 = "onBlock"
                org.json.JSONObject r3 = r3.put(r4, r5)     // Catch:{ JSONException -> 0x006d }
                java.lang.String r4 = "block_index"
                int r5 = r0.f128946c     // Catch:{ JSONException -> 0x006d }
                org.json.JSONObject r3 = r3.put(r4, r5)     // Catch:{ JSONException -> 0x006d }
                java.lang.String r4 = "buffer_time"
                org.json.JSONObject r1 = r3.put(r4, r1)     // Catch:{ JSONException -> 0x006d }
                r0.mo105577a(r1)     // Catch:{ JSONException -> 0x006d }
                goto L_0x00be
            L_0x00a4:
                com.ss.ugc.live.sdk.b.d r0 = r7.f128928b
                int r1 = r0.f128946c
                int r1 = r1 + 1
                r0.f128946c = r1
                long r1 = java.lang.System.currentTimeMillis()
                r0.f128947d = r1
                goto L_0x00be
            L_0x00b3:
                com.ss.ugc.live.sdk.b.d r0 = r7.f128928b
                r0.mo105576a(r9)
                goto L_0x00be
            L_0x00b9:
                com.ss.ugc.live.sdk.b.d r0 = r7.f128928b
                r0.mo105580d()
            L_0x00be:
                com.ss.ugc.live.sdk.b.c$a r0 = r7.f128927a
                if (r0 == 0) goto L_0x00c7
                com.ss.ugc.live.sdk.b.c$a r0 = r7.f128927a
                r0.mo78953a(r8, r9, r10)
            L_0x00c7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ugc.live.sdk.p2606b.C51619a.C51621a.mo78953a(com.ss.ugc.live.sdk.b.c$b, int, java.lang.String):void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo105561a(String str, Map<String, String> map) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo105562b(C51628a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo105563i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo105564j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo105565k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo105566l();

    /* renamed from: a */
    public final void mo78954a() {
        this.f128923a.mo105575a();
        mo105563i();
    }

    /* renamed from: b */
    public final void mo78959b() {
        mo105564j();
        this.f128923a.mo105581e();
    }

    /* renamed from: c */
    public final void mo78960c() {
        mo105565k();
        this.f128923a.mo105578b();
    }

    /* renamed from: d */
    public final void mo78961d() {
        mo105566l();
        this.f128923a.mo105579c();
    }

    /* renamed from: a */
    public final void mo78957a(C51628a aVar) {
        this.f128924b.f128927a = aVar;
    }

    public C51619a(C51631d dVar) {
        this.f128923a = dVar;
        this.f128924b = new C51621a(dVar);
        mo105562b(this.f128924b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ad  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78958a(java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, com.p683ss.ugc.live.sdk.p2606b.C51627c.C51630c r12) throws java.io.IOException {
        /*
            r9 = this;
            com.ss.ugc.live.sdk.a.a r11 = r9.f128925c
            r0 = 0
            if (r11 == 0) goto L_0x00a2
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r10.toLowerCase(r1)
            java.lang.String r2 = "http"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x00a2
            java.lang.String r2 = "://"
            r3 = 4
            int r2 = r1.indexOf(r2, r3)
            int r2 = r2 + 3
            r3 = 7
            if (r2 == r3) goto L_0x0023
            r3 = 8
            if (r2 != r3) goto L_0x00a2
        L_0x0023:
            int r3 = r1.length()
            r4 = -1
            r6 = r2
            r5 = -1
        L_0x002a:
            if (r2 >= r3) goto L_0x0047
            char r7 = r1.charAt(r2)
            r8 = 35
            if (r7 == r8) goto L_0x0047
            r8 = 47
            if (r7 == r8) goto L_0x0047
            r8 = 58
            if (r7 == r8) goto L_0x0043
            switch(r7) {
                case 63: goto L_0x0047;
                case 64: goto L_0x0040;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0044
        L_0x0040:
            int r6 = r2 + 1
            goto L_0x0044
        L_0x0043:
            r5 = r2
        L_0x0044:
            int r2 = r2 + 1
            goto L_0x002a
        L_0x0047:
            if (r5 != r4) goto L_0x004a
            r5 = r2
        L_0x004a:
            java.lang.String r1 = r10.substring(r6, r5)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x00a2
            java.lang.String r11 = r11.mo105560a(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 != 0) goto L_0x00a2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r10.substring(r0, r6)
            r3.append(r4)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            if (r5 >= r2) goto L_0x0086
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            java.lang.String r11 = r10.substring(r5, r2)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
        L_0x0086:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            java.lang.String r11 = "/"
            r3.append(r11)
            r3.append(r1)
            java.lang.String r11 = r10.substring(r2)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            goto L_0x00a3
        L_0x00a2:
            r11 = r10
        L_0x00a3:
            com.ss.ugc.live.sdk.b.d r1 = r9.f128923a
            java.lang.String r2 = r1.f128952i
            boolean r2 = android.text.TextUtils.equals(r2, r10)
            if (r2 != 0) goto L_0x00af
            r1.f128955l = r0
        L_0x00af:
            r1.f128952i = r10
            r1.f128953j = r11
            r1.f128954k = r12
            r10 = 0
            r9.mo105561a(r11, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ugc.live.sdk.p2606b.C51619a.mo78958a(java.lang.String, java.util.Map, com.ss.ugc.live.sdk.b.c$c):void");
    }
}
