package com.p683ss.android.newmedia.redbadge;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Bundle;
import android.text.format.DateUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p523c.C9393e;
import com.p683ss.android.message.C19487k;
import com.p683ss.android.newmedia.redbadge.p1200b.C19598a;
import com.p683ss.android.pushmanager.p1204a.C19664c;
import com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import org.json.JSONObject;

/* renamed from: com.ss.android.newmedia.redbadge.b */
public class C19592b implements C9382a {

    /* renamed from: g */
    private static volatile C19592b f53974g;

    /* renamed from: a */
    public Context f53975a;

    /* renamed from: b */
    public C9381g f53976b;

    /* renamed from: c */
    public boolean f53977c;

    /* renamed from: d */
    public volatile boolean f53978d;

    /* renamed from: e */
    public boolean f53979e;

    /* renamed from: f */
    public Runnable f53980f = new Runnable() {
        public final void run() {
            if (C19592b.this.f53975a != null && C19592b.this.f53979e) {
                C19592b.this.f53979e = false;
                C19592b.this.f53976b.sendEmptyMessage(1);
            }
        }
    };

    /* renamed from: h */
    private String f53981h;

    /* renamed from: i */
    private int f53982i;

    /* renamed from: j */
    private int f53983j;

    /* renamed from: k */
    private C19597a f53984k;

    /* renamed from: l */
    private C19597a f53985l;

    /* renamed from: m */
    private ContentObserver f53986m = new ContentObserver(this.f53976b) {
        public final void onChange(boolean z) {
            C19592b.this.mo40829a();
        }
    };

    /* renamed from: n */
    private ContentObserver f53987n = new ContentObserver(this.f53976b) {
        public final void onChange(boolean z) {
            C19592b.this.mo40829a();
        }
    };

    /* renamed from: com.ss.android.newmedia.redbadge.b$a */
    static class C19597a {

        /* renamed from: a */
        long f53992a;

        /* renamed from: b */
        long f53993b;

        /* renamed from: c */
        long f53994c;

        private C19597a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final JSONObject mo40837a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("launch", this.f53992a);
                jSONObject.put("leave", this.f53993b);
                jSONObject.put("badge", this.f53994c);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }

        /* renamed from: a */
        static C19597a m47922a(String str) {
            C19597a aVar = new C19597a();
            try {
                JSONObject jSONObject = new JSONObject(str);
                aVar.f53992a = jSONObject.optLong("launch", 0);
                aVar.f53993b = jSONObject.optLong("leave", 0);
                aVar.f53994c = jSONObject.optLong("badge", 0);
            } catch (Throwable unused) {
            }
            return aVar;
        }
    }

    /* renamed from: d */
    private boolean m47916d() {
        return this.f53977c;
    }

    /* renamed from: c */
    public final void mo40832c() {
        try {
            C19598a.m47924a(this.f53975a).mo40847c(C19664c.m48034b().mo41014e());
            C9393e.submitRunnable(new Runnable() {
                public final void run() {
                    C19598a.m47924a(C19592b.this.f53975a).mo40849d(C19664c.m48034b().mo41015f());
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo40831b() {
        if (this.f53975a != null && this.f53979e) {
            this.f53976b.postDelayed(this.f53980f, 30000);
            this.f53976b.sendEmptyMessage(2);
        }
    }

    /* renamed from: e */
    private void m47917e() {
        String str;
        String str2;
        try {
            C19598a.m47924a(this.f53975a).mo40843b(this.f53982i);
            C19598a.m47924a(this.f53975a).mo40846c(this.f53983j);
            C19598a a = C19598a.m47924a(this.f53975a);
            if (this.f53984k == null) {
                str = "";
            } else {
                str = this.f53984k.mo40837a().toString();
            }
            a.mo40840a(str);
            C19598a a2 = C19598a.m47924a(this.f53975a);
            if (this.f53985l == null) {
                str2 = "";
            } else {
                str2 = this.f53985l.mo40837a().toString();
            }
            a2.mo40844b(str2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo40829a() {
        this.f53977c = C19598a.m47924a(this.f53975a).mo40841a();
        this.f53981h = C19598a.m47924a(this.f53975a).mo40842b();
    }

    /* renamed from: a */
    public static C19592b m47911a(Context context) {
        if (f53974g == null) {
            synchronized (C19592b.class) {
                if (f53974g == null) {
                    f53974g = new C19592b(context);
                }
            }
        }
        return f53974g;
    }

    /* renamed from: b */
    private static long m47915b(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return new JSONObject(str).optLong("rule_id");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            int r4 = r4.what     // Catch:{ Throwable -> 0x006d }
            r0 = 0
            r1 = 1
            switch(r4) {
                case 0: goto L_0x003e;
                case 1: goto L_0x001b;
                case 2: goto L_0x0017;
                case 3: goto L_0x000b;
                default: goto L_0x000a;
            }     // Catch:{ Throwable -> 0x006d }
        L_0x000a:
            goto L_0x006c
        L_0x000b:
            com.ss.android.newmedia.redbadge.h r4 = com.p683ss.android.newmedia.redbadge.C19611h.m47955a()     // Catch:{ Throwable -> 0x006d }
            android.content.Context r1 = r3.f53975a     // Catch:{ Throwable -> 0x006d }
            r4.mo40865a(r1)     // Catch:{ Throwable -> 0x006d }
            r3.f53978d = r0     // Catch:{ Throwable -> 0x006d }
            goto L_0x006c
        L_0x0017:
            r3.m47912a(r1)     // Catch:{ Throwable -> 0x006d }
            goto L_0x006d
        L_0x001b:
            r3.m47912a(r1)     // Catch:{ Throwable -> 0x006d }
            boolean r4 = r3.m47916d()     // Catch:{ Throwable -> 0x006d }
            if (r4 == 0) goto L_0x006c
            android.content.Intent r4 = new android.content.Intent     // Catch:{ Throwable -> 0x006d }
            android.content.Context r0 = r3.f53975a     // Catch:{ Throwable -> 0x006d }
            com.ss.android.pushmanager.a.c$b r2 = com.p683ss.android.pushmanager.p1204a.C19664c.m48034b()     // Catch:{ Throwable -> 0x006d }
            java.lang.Class r2 = r2.mo41011b()     // Catch:{ Throwable -> 0x006d }
            r4.<init>(r0, r2)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r0 = "app_exit"
            r4.putExtra(r0, r1)     // Catch:{ Throwable -> 0x006d }
            android.content.Context r0 = r3.f53975a     // Catch:{ Throwable -> 0x006d }
            com.p683ss.android.newmedia.redbadge.C19599c.m47942a(r0, r4)     // Catch:{ Throwable -> 0x006d }
            goto L_0x006d
        L_0x003e:
            r3.m47912a(r0)     // Catch:{ Throwable -> 0x006d }
            com.ss.android.newmedia.redbadge.h r4 = com.p683ss.android.newmedia.redbadge.C19611h.m47955a()     // Catch:{ Throwable -> 0x006d }
            android.content.Context r2 = r3.f53975a     // Catch:{ Throwable -> 0x006d }
            r4.mo40865a(r2)     // Catch:{ Throwable -> 0x006d }
            r3.f53978d = r0     // Catch:{ Throwable -> 0x006d }
            boolean r4 = r3.m47916d()     // Catch:{ Throwable -> 0x006d }
            if (r4 == 0) goto L_0x006c
            android.content.Intent r4 = new android.content.Intent     // Catch:{ Throwable -> 0x006d }
            android.content.Context r0 = r3.f53975a     // Catch:{ Throwable -> 0x006d }
            com.ss.android.pushmanager.a.c$b r2 = com.p683ss.android.pushmanager.p1204a.C19664c.m48034b()     // Catch:{ Throwable -> 0x006d }
            java.lang.Class r2 = r2.mo41011b()     // Catch:{ Throwable -> 0x006d }
            r4.<init>(r0, r2)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r0 = "app_entrance"
            r4.putExtra(r0, r1)     // Catch:{ Throwable -> 0x006d }
            android.content.Context r0 = r3.f53975a     // Catch:{ Throwable -> 0x006d }
            com.p683ss.android.newmedia.redbadge.C19599c.m47942a(r0, r4)     // Catch:{ Throwable -> 0x006d }
            goto L_0x006d
        L_0x006c:
            return
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.newmedia.redbadge.C19592b.handleMsg(android.os.Message):void");
    }

    private C19592b(Context context) {
        boolean z;
        this.f53975a = context.getApplicationContext();
        this.f53976b = new C9381g(C19487k.m47712a().f53817a, this);
        try {
            this.f53982i = C19598a.m47924a(this.f53975a).mo40853g();
            this.f53983j = C19598a.m47924a(this.f53975a).mo40854h();
            String e = C19598a.m47924a(this.f53975a).mo40850e();
            if (!C9431p.m18664a(e)) {
                this.f53984k = C19597a.m47922a(e);
            }
            String f = C19598a.m47924a(this.f53975a).mo40852f();
            if (!C9431p.m18664a(f)) {
                this.f53985l = C19597a.m47922a(f);
            }
            if (this.f53984k != null) {
                if (!DateUtils.isToday(this.f53984k.f53992a)) {
                    this.f53982i = 0;
                    z = true;
                } else {
                    z = false;
                }
                if (!DateUtils.isToday(this.f53984k.f53994c)) {
                    this.f53983j = 0;
                    z = true;
                }
                if (z) {
                    m47917e();
                }
            }
        } catch (Throwable unused) {
        }
        if (context != null) {
            try {
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m48145a(context, "is_desktop_red_badge_show", "boolean"), true, this.f53986m);
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m48145a(context, "desktop_red_badge_args", "string"), true, this.f53987n);
            } catch (Throwable unused2) {
            }
        }
        mo40829a();
    }

    /* renamed from: a */
    private void m47912a(int i) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f53984k == null) {
                this.f53984k = new C19597a();
            }
            if (this.f53985l == null) {
                this.f53985l = new C19597a();
            }
            if (!DateUtils.isToday(this.f53984k.f53992a)) {
                this.f53982i = 0;
            }
            if (!DateUtils.isToday(this.f53984k.f53994c)) {
                this.f53983j = 0;
            }
            switch (i) {
                case 0:
                    this.f53985l.f53992a = this.f53984k.f53992a;
                    this.f53985l.f53993b = this.f53984k.f53993b;
                    this.f53984k.f53992a = currentTimeMillis;
                    this.f53984k.f53993b = currentTimeMillis + 900000;
                    this.f53982i++;
                    break;
                case 1:
                    this.f53984k.f53993b = currentTimeMillis;
                    break;
                case 2:
                    this.f53985l.f53994c = this.f53984k.f53994c;
                    this.f53984k.f53994c = currentTimeMillis;
                    this.f53983j++;
                    break;
            }
            m47917e();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1 = new java.util.Random().nextInt(5) + 1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0053 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40830a(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r0 = r6.f53975a
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r6.m47916d()
            if (r0 != 0) goto L_0x000f
            goto L_0x00f3
        L_0x000f:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00f2 }
            r0.<init>(r7)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r1 = "show"
            int r1 = r0.optInt(r1)     // Catch:{ Throwable -> 0x00f2 }
            if (r1 > 0) goto L_0x001d
            return
        L_0x001d:
            java.lang.String r1 = "content_type"
            java.lang.String r1 = r0.optString(r1)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r2 = "content"
            java.lang.String r0 = r0.optString(r2)     // Catch:{ Throwable -> 0x00f2 }
            long r2 = m47915b(r7)     // Catch:{ Throwable -> 0x00f2 }
            boolean r7 = com.bytedance.common.utility.C9431p.m18664a(r1)     // Catch:{ Throwable -> 0x00f2 }
            if (r7 != 0) goto L_0x00f1
            boolean r7 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x00f2 }
            if (r7 != 0) goto L_0x00f1
            com.ss.android.pushmanager.setting.a r7 = com.p683ss.android.pushmanager.setting.C19709a.m48167a()     // Catch:{ Throwable -> 0x00f2 }
            boolean r7 = r7.mo41087c()     // Catch:{ Throwable -> 0x00f2 }
            if (r7 == 0) goto L_0x0045
            goto L_0x00f1
        L_0x0045:
            java.lang.String r7 = "desktop_red_badge"
            boolean r7 = r7.equals(r1)     // Catch:{ Throwable -> 0x00f2 }
            if (r7 == 0) goto L_0x00b1
            r7 = 1
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x0053 }
            goto L_0x005e
        L_0x0053:
            java.util.Random r1 = new java.util.Random     // Catch:{ Throwable -> 0x00f2 }
            r1.<init>()     // Catch:{ Throwable -> 0x00f2 }
            r4 = 5
            int r1 = r1.nextInt(r4)     // Catch:{ Throwable -> 0x00f2 }
            int r1 = r1 + r7
        L_0x005e:
            if (r1 <= 0) goto L_0x00a0
            com.ss.android.newmedia.redbadge.h r4 = com.p683ss.android.newmedia.redbadge.C19611h.m47955a()     // Catch:{ Throwable -> 0x00f2 }
            android.content.Context r5 = r6.f53975a     // Catch:{ Throwable -> 0x00f2 }
            r4.mo40866a(r5, r1)     // Catch:{ Throwable -> 0x00f2 }
            r6.f53978d = r7     // Catch:{ Throwable -> 0x00f2 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00f2 }
            r7.<init>()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r4 = "content"
            r7.put(r4, r0)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "desktop_red_badge"
            long r4 = (long) r1     // Catch:{ Throwable -> 0x00f2 }
            r6.m47913a(r0, r4, r7)     // Catch:{ Throwable -> 0x00f2 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ Throwable -> 0x00f2 }
            r7.<init>()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "badge_number"
            r7.putInt(r0, r1)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "red_badge_is_open"
            boolean r1 = r6.m47916d()     // Catch:{ Throwable -> 0x00f2 }
            r7.putInt(r0, r1)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "show_type"
            java.lang.String r1 = "request"
            r7.putString(r0, r1)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "rule_id"
            r7.putLong(r0, r2)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "red_badge_show"
            r6.m47914a(r0, r7)     // Catch:{ Throwable -> 0x00f2 }
            goto L_0x00ac
        L_0x00a0:
            com.ss.android.newmedia.redbadge.h r7 = com.p683ss.android.newmedia.redbadge.C19611h.m47955a()     // Catch:{ Throwable -> 0x00f2 }
            android.content.Context r0 = r6.f53975a     // Catch:{ Throwable -> 0x00f2 }
            r7.mo40865a(r0)     // Catch:{ Throwable -> 0x00f2 }
            r7 = 0
            r6.f53978d = r7     // Catch:{ Throwable -> 0x00f2 }
        L_0x00ac:
            r7 = 2
            r6.m47912a(r7)     // Catch:{ Throwable -> 0x00f2 }
            goto L_0x00f2
        L_0x00b1:
            java.lang.String r7 = "notification"
            boolean r7 = r7.equals(r1)     // Catch:{ Throwable -> 0x00f2 }
            if (r7 == 0) goto L_0x00f0
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Throwable -> 0x00f2 }
            com.ss.android.pushmanager.a.c$b r1 = com.p683ss.android.pushmanager.p1204a.C19664c.m48034b()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r1 = r1.mo41013d()     // Catch:{ Throwable -> 0x00f2 }
            r7.<init>(r1)     // Catch:{ Throwable -> 0x00f2 }
            com.ss.android.pushmanager.a.c$b r1 = com.p683ss.android.pushmanager.p1204a.C19664c.m48034b()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r1 = r1.mo41012c()     // Catch:{ Throwable -> 0x00f2 }
            r7.putExtra(r1, r0)     // Catch:{ Throwable -> 0x00f2 }
            android.content.Context r1 = r6.f53975a     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Throwable -> 0x00f2 }
            r7.setPackage(r1)     // Catch:{ Throwable -> 0x00f2 }
            android.content.Context r1 = r6.f53975a     // Catch:{ Throwable -> 0x00f2 }
            com.p683ss.android.newmedia.redbadge.C19599c.m47942a(r1, r7)     // Catch:{ Throwable -> 0x00f2 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00f2 }
            r7.<init>()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r1 = "content"
            r7.put(r1, r0)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "notification"
            r1 = 0
            r6.m47913a(r0, r1, r7)     // Catch:{ Throwable -> 0x00f2 }
        L_0x00f0:
            return
        L_0x00f1:
            return
        L_0x00f2:
            return
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.newmedia.redbadge.C19592b.mo40830a(java.lang.String):void");
    }

    /* renamed from: a */
    private void m47914a(String str, Bundle bundle) {
        if (!C9431p.m18664a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                for (String str2 : bundle.keySet()) {
                    jSONObject.put(str2, bundle.get(str2));
                }
            } catch (Throwable unused) {
            }
            C19664c.m48034b().mo41010a(this.f53975a, "event_v3", str, null, 0, 0, jSONObject);
        }
    }

    /* renamed from: a */
    private void m47913a(String str, long j, JSONObject jSONObject) {
        C19664c.m48034b().mo41010a(this.f53975a, "umeng", "red_badge", str, j, 0, jSONObject);
    }
}
