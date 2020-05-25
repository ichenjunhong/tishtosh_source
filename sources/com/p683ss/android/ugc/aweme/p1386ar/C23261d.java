package com.p683ss.android.ugc.aweme.p1386ar;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.bytedance.apm.C8936b;
import com.p683ss.p2566d.C51295a;
import com.p683ss.p2566d.C51297b;

/* renamed from: com.ss.android.ugc.aweme.ar.d */
public class C23261d {

    /* renamed from: a */
    public long f62202a;

    /* renamed from: b */
    public float f62203b;

    /* renamed from: c */
    public Context f62204c;

    /* renamed from: d */
    public String f62205d;

    /* renamed from: e */
    public boolean f62206e;

    /* renamed from: f */
    private C51297b f62207f = new C51297b() {
        /* renamed from: a */
        public final void mo48202a() {
            C23261d.this.mo48201b();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo48203a(float r5, float r6, long r7) {
            /*
                r4 = this;
                java.lang.Class<com.ss.android.ugc.aweme.ar.d> r6 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.class
                monitor-enter(r6)
                com.ss.android.ugc.aweme.ar.d r7 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                boolean r7 = r7.f62206e     // Catch:{ all -> 0x007d }
                if (r7 != 0) goto L_0x000b
                monitor-exit(r6)     // Catch:{ all -> 0x007d }
                return
            L_0x000b:
                com.ss.android.ugc.aweme.ar.d r7 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                long r0 = r7.f62202a     // Catch:{ all -> 0x007d }
                r2 = 1
                long r0 = r0 + r2
                r7.f62202a = r0     // Catch:{ all -> 0x007d }
                com.ss.android.ugc.aweme.ar.d r7 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                com.ss.android.ugc.aweme.ar.d r8 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                float r8 = r8.f62203b     // Catch:{ all -> 0x007d }
                float r8 = r8 + r5
                r7.f62203b = r8     // Catch:{ all -> 0x007d }
                com.ss.android.ugc.aweme.ar.d r5 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                long r7 = r5.f62202a     // Catch:{ all -> 0x007d }
                r0 = 20
                int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r5 <= 0) goto L_0x007b
                com.ss.android.ugc.aweme.ar.d r5 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                android.content.Context r5 = r5.f62204c     // Catch:{ all -> 0x007d }
                boolean r5 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.m57204a(r5)     // Catch:{ all -> 0x007d }
                if (r5 == 0) goto L_0x004b
                com.ss.android.ugc.aweme.ar.d r5 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                boolean r5 = r5.f62206e     // Catch:{ all -> 0x007d }
                if (r5 == 0) goto L_0x0049
                com.ss.android.ugc.aweme.ar.d r5 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                r7 = 0
                r5.f62206e = r7     // Catch:{ all -> 0x007d }
                com.p683ss.p2566d.C51295a.m110289a()     // Catch:{ all -> 0x007d }
                com.ss.android.ugc.aweme.ar.d r5 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                r5.mo48201b()     // Catch:{ all -> 0x007d }
                com.ss.android.ugc.aweme.ar.d r5 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                r7 = 0
                r5.f62205d = r7     // Catch:{ all -> 0x007d }
            L_0x0049:
                monitor-exit(r6)     // Catch:{ all -> 0x007d }
                return
            L_0x004b:
                com.ss.android.ugc.aweme.ar.d r5 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                float r5 = r5.f62203b     // Catch:{ all -> 0x007d }
                r7 = 0
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 > 0) goto L_0x005b
                com.ss.android.ugc.aweme.ar.d r5 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                r5.mo48201b()     // Catch:{ all -> 0x007d }
                monitor-exit(r6)     // Catch:{ all -> 0x007d }
                return
            L_0x005b:
                com.ss.android.ugc.aweme.ar.d r5 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                float r5 = r5.f62203b     // Catch:{ all -> 0x007d }
                com.ss.android.ugc.aweme.ar.d r7 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                long r7 = r7.f62202a     // Catch:{ all -> 0x007d }
                float r7 = (float) r7     // Catch:{ all -> 0x007d }
                float r5 = r5 / r7
                com.ss.android.ugc.aweme.ar.e r7 = com.p683ss.android.ugc.aweme.p1386ar.C23263e.m57211a()     // Catch:{ all -> 0x007d }
                java.util.Map<java.lang.String, java.lang.Float> r7 = r7.f62210a     // Catch:{ all -> 0x007d }
                com.ss.android.ugc.aweme.ar.d r8 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                java.lang.String r8 = r8.f62205d     // Catch:{ all -> 0x007d }
                java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ all -> 0x007d }
                r7.put(r8, r5)     // Catch:{ all -> 0x007d }
                com.ss.android.ugc.aweme.ar.d r5 = com.p683ss.android.ugc.aweme.p1386ar.C23261d.this     // Catch:{ all -> 0x007d }
                r5.mo48201b()     // Catch:{ all -> 0x007d }
            L_0x007b:
                monitor-exit(r6)     // Catch:{ all -> 0x007d }
                return
            L_0x007d:
                r5 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x007d }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1386ar.C23261d.C232621.mo48203a(float, float, long):void");
        }
    };

    /* renamed from: b */
    public final void mo48201b() {
        this.f62202a = 0;
        this.f62203b = 0.0f;
    }

    /* renamed from: c */
    private static boolean m57205c() {
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        return C8936b.m17658a("report_battery_i");
    }

    /* renamed from: a */
    public final void mo48199a() {
        if (this.f62206e) {
            synchronized (C23261d.class) {
                if (this.f62206e) {
                    this.f62206e = false;
                    C51295a.m110289a();
                    mo48201b();
                    this.f62205d = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m57204a(Context context) {
        int intExtra = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo48200a(Activity activity) {
        if (!this.f62206e && m57205c() && !m57204a((Context) activity)) {
            this.f62204c = activity.getApplicationContext();
            this.f62205d = activity.getClass().getSimpleName();
            C51295a.m110290a(activity, this.f62207f);
            this.f62206e = true;
        }
    }
}
