package com.bytedance.polaris.p822b;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.polaris.C12552a;
import com.bytedance.polaris.p821a.C12558d;
import com.bytedance.polaris.p821a.C12559e;
import com.bytedance.polaris.p821a.C12563i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.b.a */
public class C12571a implements C9382a {

    /* renamed from: e */
    private static volatile C12571a f32980e;

    /* renamed from: a */
    public final C9381g f32981a = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: b */
    public C12559e f32982b = C12563i.m25225g();

    /* renamed from: c */
    public Context f32983c = C12563i.m25215a();

    /* renamed from: d */
    public Map<String, Long> f32984d = new HashMap();

    /* renamed from: com.bytedance.polaris.b.a$a */
    public class C12573a implements Runnable {

        /* renamed from: a */
        public final C12558d<JSONObject> f32989a;

        /* renamed from: c */
        private String f32991c;

        /* renamed from: d */
        private JSONObject f32992d;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(1:4)(1:5)|6|7|8|(1:10)(2:11|(1:13)(2:14|(1:16)(2:17|(1:19)(6:20|(1:22)|23|(1:25)|26|(1:28)(1:29)))))|30|31|(2:33|34)(3:35|(1:37)(1:38)|(2:40|41)(3:42|(1:46)|47))) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00c9 */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00d1 A[Catch:{ Throwable -> 0x011a }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00d9 A[Catch:{ Throwable -> 0x011a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                r0 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x011a }
                java.lang.String r2 = "/luckycat/tiktokm/v1/task/done"
                java.lang.String r2 = com.bytedance.polaris.p821a.C12563i.m25220b(r2)     // Catch:{ Throwable -> 0x011a }
                r1.<init>(r2)     // Catch:{ Throwable -> 0x011a }
                java.lang.String r2 = "/"
                r1.append(r2)     // Catch:{ Throwable -> 0x011a }
                java.lang.String r2 = r13.f32991c     // Catch:{ Throwable -> 0x011a }
                r1.append(r2)     // Catch:{ Throwable -> 0x011a }
                r2 = 1
                com.bytedance.polaris.p826d.C12650p.m25420a(r1, r2)     // Catch:{ Throwable -> 0x011a }
                org.json.JSONObject r3 = r13.f32992d     // Catch:{ Throwable -> 0x011a }
                if (r3 == 0) goto L_0x0021
                org.json.JSONObject r3 = r13.f32992d     // Catch:{ Throwable -> 0x011a }
                goto L_0x0026
            L_0x0021:
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x011a }
                r3.<init>()     // Catch:{ Throwable -> 0x011a }
            L_0x0026:
                java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x011a }
                java.lang.String r4 = "utf-8"
                byte[] r3 = r3.getBytes(r4)     // Catch:{ Throwable -> 0x011a }
                com.bytedance.polaris.b.a r4 = com.bytedance.polaris.p822b.C12571a.this     // Catch:{ Throwable -> 0x011a }
                com.bytedance.polaris.a.e r4 = r4.f32982b     // Catch:{ Throwable -> 0x011a }
                r5 = 20480(0x5000, float:2.8699E-41)
                java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x011a }
                java.lang.String r6 = "application/json; charset=utf-8"
                java.lang.String r1 = r4.mo23609a(r5, r1, r3, r6)     // Catch:{ Throwable -> 0x011a }
                com.bytedance.polaris.b.a r3 = com.bytedance.polaris.p822b.C12571a.this     // Catch:{ Throwable -> 0x011a }
                java.lang.String r4 = r13.f32991c     // Catch:{ Throwable -> 0x011a }
                boolean r5 = com.bytedance.polaris.p822b.C12571a.m25235a()     // Catch:{ Throwable -> 0x00c9 }
                if (r5 != 0) goto L_0x004c
                goto L_0x00c9
            L_0x004c:
                boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x00c9 }
                if (r5 == 0) goto L_0x0054
                goto L_0x00c9
            L_0x0054:
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00c9 }
                r5.<init>(r1)     // Catch:{ Throwable -> 0x00c9 }
                java.lang.String r6 = "data"
                boolean r6 = r5.has(r6)     // Catch:{ Throwable -> 0x00c9 }
                if (r6 != 0) goto L_0x0062
                goto L_0x00c9
            L_0x0062:
                java.lang.String r6 = "data"
                org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch:{ Throwable -> 0x00c9 }
                if (r5 != 0) goto L_0x006b
                goto L_0x00c9
            L_0x006b:
                java.lang.String r6 = "next_req_interval"
                r7 = 0
                long r5 = r5.optLong(r6, r7)     // Catch:{ Throwable -> 0x00c9 }
                com.bytedance.polaris.a r9 = com.bytedance.polaris.C12552a.m25181a()     // Catch:{ Throwable -> 0x00c9 }
                java.lang.String r10 = "next_req_interval"
                long r9 = r9.mo23592a(r10, r7)     // Catch:{ Throwable -> 0x00c9 }
                int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r11 <= 0) goto L_0x0082
                r5 = r9
            L_0x0082:
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 >= 0) goto L_0x0087
                r5 = r7
            L_0x0087:
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00c9 }
                java.util.Calendar r9 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x00c9 }
                r10 = 11
                r11 = 23
                r9.set(r10, r11)     // Catch:{ Throwable -> 0x00c9 }
                r10 = 12
                r11 = 59
                r9.set(r10, r11)     // Catch:{ Throwable -> 0x00c9 }
                r10 = 13
                r9.set(r10, r11)     // Catch:{ Throwable -> 0x00c9 }
                r10 = 14
                r11 = 999(0x3e7, float:1.4E-42)
                r9.set(r10, r11)     // Catch:{ Throwable -> 0x00c9 }
                long r9 = r9.getTimeInMillis()     // Catch:{ Throwable -> 0x00c9 }
                r11 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 * r11
                long r7 = r7 + r5
                int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r5 >= 0) goto L_0x00c0
                java.util.Map<java.lang.String, java.lang.Long> r3 = r3.f32984d     // Catch:{ Throwable -> 0x00c9 }
                java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ Throwable -> 0x00c9 }
                r3.put(r4, r5)     // Catch:{ Throwable -> 0x00c9 }
                goto L_0x00c9
            L_0x00c0:
                java.util.Map<java.lang.String, java.lang.Long> r3 = r3.f32984d     // Catch:{ Throwable -> 0x00c9 }
                java.lang.Long r5 = java.lang.Long.valueOf(r9)     // Catch:{ Throwable -> 0x00c9 }
                r3.put(r4, r5)     // Catch:{ Throwable -> 0x00c9 }
            L_0x00c9:
                boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r1)     // Catch:{ Throwable -> 0x011a }
                r4 = 10002(0x2712, float:1.4016E-41)
                if (r3 == 0) goto L_0x00d9
                com.bytedance.polaris.b.a r1 = com.bytedance.polaris.p822b.C12571a.this     // Catch:{ Throwable -> 0x011a }
                com.bytedance.polaris.a.d<org.json.JSONObject> r2 = r13.f32989a     // Catch:{ Throwable -> 0x011a }
                r1.mo23632a(r4, r0, r2)     // Catch:{ Throwable -> 0x011a }
                return
            L_0x00d9:
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x011a }
                r3.<init>(r1)     // Catch:{ Throwable -> 0x011a }
                java.lang.String r1 = "err_no"
                r5 = -1
                int r1 = r3.optInt(r1, r5)     // Catch:{ Throwable -> 0x011a }
                if (r1 != 0) goto L_0x00e8
                goto L_0x00e9
            L_0x00e8:
                r2 = 0
            L_0x00e9:
                if (r2 != 0) goto L_0x00ff
                java.lang.String r1 = "err_tips"
                java.lang.String r1 = r3.optString(r1)     // Catch:{ Throwable -> 0x011a }
                com.bytedance.polaris.b.a r2 = com.bytedance.polaris.p822b.C12571a.this     // Catch:{ Throwable -> 0x011a }
                java.lang.String r5 = "err_no"
                int r3 = r3.optInt(r5, r4)     // Catch:{ Throwable -> 0x011a }
                com.bytedance.polaris.a.d<org.json.JSONObject> r4 = r13.f32989a     // Catch:{ Throwable -> 0x011a }
                r2.mo23632a(r3, r1, r4)     // Catch:{ Throwable -> 0x011a }
                return
            L_0x00ff:
                java.lang.String r1 = "data"
                org.json.JSONObject r1 = r3.optJSONObject(r1)     // Catch:{ Throwable -> 0x011a }
                if (r1 == 0) goto L_0x0119
                com.bytedance.polaris.b.a r2 = com.bytedance.polaris.p822b.C12571a.this     // Catch:{ Throwable -> 0x011a }
                com.bytedance.common.utility.b.g r2 = r2.f32981a     // Catch:{ Throwable -> 0x011a }
                if (r2 == 0) goto L_0x0119
                com.bytedance.polaris.b.a r2 = com.bytedance.polaris.p822b.C12571a.this     // Catch:{ Throwable -> 0x011a }
                com.bytedance.common.utility.b.g r2 = r2.f32981a     // Catch:{ Throwable -> 0x011a }
                com.bytedance.polaris.b.a$a$1 r3 = new com.bytedance.polaris.b.a$a$1     // Catch:{ Throwable -> 0x011a }
                r3.<init>(r1)     // Catch:{ Throwable -> 0x011a }
                r2.post(r3)     // Catch:{ Throwable -> 0x011a }
            L_0x0119:
                return
            L_0x011a:
                r1 = move-exception
                boolean r1 = r1 instanceof java.io.IOException
                if (r1 == 0) goto L_0x0122
                r1 = 10009(0x2719, float:1.4026E-41)
                goto L_0x0124
            L_0x0122:
                r1 = 10000(0x2710, float:1.4013E-41)
            L_0x0124:
                com.bytedance.polaris.b.a r2 = com.bytedance.polaris.p822b.C12571a.this
                com.bytedance.polaris.a.d<org.json.JSONObject> r3 = r13.f32989a
                r2.mo23632a(r1, r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.p822b.C12571a.C12573a.run():void");
        }

        public C12573a(String str, C12558d<JSONObject> dVar, JSONObject jSONObject) {
            this.f32991c = str;
            this.f32989a = dVar;
            this.f32992d = jSONObject;
        }
    }

    public void handleMsg(Message message) {
    }

    /* renamed from: a */
    public static boolean m25235a() {
        return C12552a.m25181a().mo23594c();
    }

    /* renamed from: b */
    public final void mo23633b() {
        if (this.f32984d != null) {
            this.f32984d.clear();
        }
    }

    /* renamed from: c */
    public static C12571a m25236c() {
        if (f32980e == null) {
            synchronized (C12571a.class) {
                if (f32980e == null) {
                    f32980e = new C12571a();
                }
            }
        }
        return f32980e;
    }

    private C12571a() {
    }

    /* renamed from: a */
    public final void mo23632a(final int i, final String str, final C12558d<JSONObject> dVar) {
        if (dVar != null) {
            this.f32981a.post(new Runnable() {
                public final void run() {
                }
            });
        }
    }
}
