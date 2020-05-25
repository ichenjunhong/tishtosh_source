package com.p683ss.android.download;

import android.app.NotificationManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.p683ss.android.download.p1161b.C19096c.C19097a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: com.ss.android.download.c */
public final class C19101c {

    /* renamed from: A */
    public String f52594A;

    /* renamed from: B */
    public String f52595B;

    /* renamed from: C */
    public int f52596C;

    /* renamed from: D */
    public int f52597D;

    /* renamed from: E */
    public List<Pair<String, String>> f52598E;

    /* renamed from: F */
    final Context f52599F;

    /* renamed from: G */
    private Future<?> f52600G;

    /* renamed from: H */
    private C19126l f52601H;

    /* renamed from: I */
    private NotificationManager f52602I;

    /* renamed from: J */
    private final C19138v f52603J;

    /* renamed from: K */
    private final C19136u f52604K;

    /* renamed from: L */
    private final C19109e f52605L;

    /* renamed from: a */
    public long f52606a;

    /* renamed from: b */
    public String f52607b;

    /* renamed from: c */
    public boolean f52608c;

    /* renamed from: d */
    public String f52609d;

    /* renamed from: e */
    public String f52610e;

    /* renamed from: f */
    public String f52611f;

    /* renamed from: g */
    public int f52612g;

    /* renamed from: h */
    public int f52613h;

    /* renamed from: i */
    public int f52614i;

    /* renamed from: j */
    public int f52615j;

    /* renamed from: k */
    public int f52616k;

    /* renamed from: l */
    public int f52617l;

    /* renamed from: m */
    public long f52618m;

    /* renamed from: n */
    public String f52619n;

    /* renamed from: o */
    public String f52620o;

    /* renamed from: p */
    public String f52621p;

    /* renamed from: q */
    public String f52622q;

    /* renamed from: r */
    public String f52623r;

    /* renamed from: s */
    public long f52624s;

    /* renamed from: t */
    public long f52625t;

    /* renamed from: u */
    public String f52626u;

    /* renamed from: v */
    public int f52627v;

    /* renamed from: w */
    public boolean f52628w;

    /* renamed from: x */
    public String f52629x;

    /* renamed from: y */
    public int f52630y;

    /* renamed from: z */
    public boolean f52631z;

    /* renamed from: com.ss.android.download.c$a */
    public enum C19103a {
        OK,
        NO_CONNECTION,
        UNUSABLE_DUE_TO_SIZE,
        RECOMMENDED_UNUSABLE_DUE_TO_SIZE,
        CANNOT_USE_ROAMING,
        TYPE_DISALLOWED_BY_REQUESTOR
    }

    /* renamed from: com.ss.android.download.c$b */
    public static class C19104b {

        /* renamed from: a */
        private C19117g f52634a;

        /* renamed from: b */
        private Cursor f52635b;

        /* renamed from: a */
        private String m46536a(String str) {
            String string = this.f52635b.getString(this.f52635b.getColumnIndexOrThrow(str));
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return string;
        }

        /* renamed from: b */
        private Integer m46538b(String str) {
            return Integer.valueOf(this.f52635b.getInt(this.f52635b.getColumnIndexOrThrow(str)));
        }

        /* renamed from: c */
        private Long m46539c(String str) {
            return Long.valueOf(this.f52635b.getLong(this.f52635b.getColumnIndexOrThrow(str)));
        }

        /* renamed from: a */
        public final void mo39031a(C19101c cVar) {
            boolean z;
            boolean z2;
            cVar.f52606a = m46539c("_id").longValue();
            cVar.f52607b = m46536a("uri");
            boolean z3 = false;
            if (m46538b("no_integrity").intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            cVar.f52608c = z;
            cVar.f52609d = m46536a("hint");
            cVar.f52610e = m46536a("_data");
            cVar.f52611f = m46536a("mimetype");
            cVar.f52612g = m46538b("destination").intValue();
            cVar.f52613h = m46538b("visibility").intValue();
            cVar.f52615j = m46538b("status").intValue();
            cVar.f52616k = m46538b("numfailed").intValue();
            cVar.f52617l = m46538b("method").intValue() & 268435455;
            cVar.f52618m = m46539c("lastmod").longValue();
            cVar.f52619n = m46536a("notificationpackage");
            cVar.f52620o = m46536a("notificationextras");
            cVar.f52621p = m46536a("cookiedata");
            cVar.f52622q = m46536a("useragent");
            cVar.f52623r = m46536a("referer");
            cVar.f52624s = m46539c("total_bytes").longValue();
            cVar.f52625t = m46539c("current_bytes").longValue();
            cVar.f52626u = m46536a("etag");
            cVar.f52627v = m46538b("scanned").intValue();
            if (m46538b("deleted").intValue() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            cVar.f52628w = z2;
            cVar.f52629x = m46536a("mediaprovider_uri");
            cVar.f52630y = m46538b("allowed_network_types").intValue();
            if (m46538b("allow_roaming").intValue() != 0) {
                z3 = true;
            }
            cVar.f52631z = z3;
            cVar.f52594A = m46536a("title");
            cVar.f52595B = m46536a("description");
            cVar.f52596C = m46538b("bypass_recommended_size_limit").intValue();
            synchronized (this) {
                cVar.f52614i = m46538b("control").intValue();
            }
        }

        public C19104b(C19117g gVar, Cursor cursor) {
            this.f52634a = gVar;
            this.f52635b = cursor;
        }

        /* renamed from: a */
        private static void m46537a(C19101c cVar, String str, String str2) {
            cVar.f52598E.add(Pair.create(str, str2));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
            r8.close();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.download.C19101c mo39030a(android.content.Context r8, com.p683ss.android.download.C19138v r9, com.p683ss.android.download.C19136u r10, com.p683ss.android.download.C19109e r11) {
            /*
                r7 = this;
                com.ss.android.download.c r6 = new com.ss.android.download.c
                r5 = 0
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r0.<init>(r1, r2, r3, r4)
                r7.mo39031a(r6)
                java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r8 = r6.f52598E
                r8.clear()
                android.net.Uri r8 = r6.mo39029c()
                java.lang.String r9 = "headers"
                android.net.Uri r1 = android.net.Uri.withAppendedPath(r8, r9)
                com.ss.android.download.g r0 = r7.f52634a
                r2 = 0
                r3 = 0
                r4 = 0
                android.database.Cursor r8 = r0.mo39054a(r1, r2, r3, r4, r5)
                java.lang.String r9 = "header"
                int r9 = r8.getColumnIndexOrThrow(r9)     // Catch:{ Exception -> 0x0059, all -> 0x0052 }
                java.lang.String r10 = "value"
                int r10 = r8.getColumnIndexOrThrow(r10)     // Catch:{ Exception -> 0x0059, all -> 0x0052 }
                r8.moveToFirst()     // Catch:{ Exception -> 0x0059, all -> 0x0052 }
            L_0x0035:
                boolean r11 = r8.isAfterLast()     // Catch:{ Exception -> 0x0059, all -> 0x0052 }
                if (r11 != 0) goto L_0x004a
                java.lang.String r11 = r8.getString(r9)     // Catch:{ Exception -> 0x0059, all -> 0x0052 }
                java.lang.String r0 = r8.getString(r10)     // Catch:{ Exception -> 0x0059, all -> 0x0052 }
                m46537a(r6, r11, r0)     // Catch:{ Exception -> 0x0059, all -> 0x0052 }
                r8.moveToNext()     // Catch:{ Exception -> 0x0059, all -> 0x0052 }
                goto L_0x0035
            L_0x004a:
                if (r8 == 0) goto L_0x005c
            L_0x004c:
                r8.close()     // Catch:{ Exception -> 0x0050 }
                goto L_0x005c
            L_0x0050:
                goto L_0x005c
            L_0x0052:
                r9 = move-exception
                if (r8 == 0) goto L_0x0058
                r8.close()     // Catch:{ Exception -> 0x0058 }
            L_0x0058:
                throw r9
            L_0x0059:
                if (r8 == 0) goto L_0x005c
                goto L_0x004c
            L_0x005c:
                java.lang.String r8 = r6.f52621p
                if (r8 == 0) goto L_0x0067
                java.lang.String r8 = "Cookie"
                java.lang.String r9 = r6.f52621p
                m46537a(r6, r8, r9)
            L_0x0067:
                java.lang.String r8 = r6.f52623r
                if (r8 == 0) goto L_0x0072
                java.lang.String r8 = "Referer"
                java.lang.String r9 = r6.f52623r
                m46537a(r6, r8, r9)
            L_0x0072:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19101c.C19104b.mo39030a(android.content.Context, com.ss.android.download.v, com.ss.android.download.u, com.ss.android.download.e):com.ss.android.download.c");
        }
    }

    /* renamed from: b */
    private static int m46526b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    /* renamed from: c */
    public final Uri mo39029c() {
        return ContentUris.withAppendedId(C19097a.f52584a, this.f52606a);
    }

    /* renamed from: d */
    private boolean m46528d() {
        NetworkInfo b = this.f52603J.mo39072b();
        if (b == null || !b.isConnected() || m46526b(b.getType()) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final C19103a mo39028b() {
        NetworkInfo b = this.f52603J.mo39072b();
        if (b == null || !b.isConnected()) {
            return C19103a.NO_CONNECTION;
        }
        if (!this.f52603J.mo39073c() || this.f52631z) {
            return m46525a(b.getType());
        }
        return C19103a.CANNOT_USE_ROAMING;
    }

    /* renamed from: a */
    public final void mo39024a() {
        if (this.f52619n != null) {
            Intent intent = new Intent("android.ss.intent.action.DOWNLOAD_COMPLETE");
            intent.setPackage(this.f52619n);
            intent.putExtra("extra_download_id", this.f52606a);
            intent.putExtra("extra_download_visibility", this.f52613h);
            this.f52603J.mo39071a(intent);
        }
    }

    /* renamed from: a */
    private C19103a m46525a(int i) {
        boolean z;
        int b = m46526b(i);
        if (this.f52630y == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z || (b & this.f52630y) != 0) {
            return m46527c(i);
        }
        return C19103a.TYPE_DISALLOWED_BY_REQUESTOR;
    }

    /* renamed from: c */
    private C19103a m46527c(int i) {
        if (this.f52624s <= 0) {
            return C19103a.OK;
        }
        if (i == 1) {
            return C19103a.OK;
        }
        Long d = this.f52603J.mo39074d();
        if (d != null && this.f52624s > d.longValue()) {
            return C19103a.UNUSABLE_DUE_TO_SIZE;
        }
        if (this.f52596C == 0) {
            Long e = this.f52603J.mo39075e();
            if (e != null && this.f52624s > e.longValue()) {
                return C19103a.RECOMMENDED_UNUSABLE_DUE_TO_SIZE;
            }
        }
        return C19103a.OK;
    }

    /* renamed from: a */
    public final long mo39023a(long j) {
        if (this.f52616k == 0) {
            return j;
        }
        if (this.f52617l > 0) {
            return this.f52618m + ((long) this.f52617l);
        }
        return this.f52618m + ((long) ((this.f52597D + 1000) * 30 * (1 << (this.f52616k - 1))));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo39025a(boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(mo39029c());
        intent.setClassName(this.f52599F.getPackageName(), SizeLimitActivity.class.getName());
        intent.setFlags(268435456);
        intent.putExtra("isWifiRequired", z);
        this.f52599F.startActivity(intent);
    }

    /* renamed from: a */
    public final boolean mo39026a(C19123j jVar) {
        boolean z;
        synchronized (this) {
            z = true;
            if (this.f52627v != 0 || (!(this.f52612g == 0 || this.f52612g == 1) || !C19097a.m46513a(this.f52615j))) {
                z = false;
            }
            if (z) {
                synchronized (jVar.f52689a) {
                    C19124a aVar = new C19124a(this.f52606a, this.f52610e, this.f52611f);
                    jVar.f52691c.put(aVar.f52694b, aVar);
                    if (jVar.f52689a.isConnected()) {
                        aVar.mo39063a(jVar.f52689a);
                    } else {
                        jVar.f52689a.connect();
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (mo39023a(r4) <= r4) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0060  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo39027a(java.util.concurrent.ExecutorService r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f52614i     // Catch:{ all -> 0x009b }
            r1 = 192(0xc0, float:2.69E-43)
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x004a
            int r0 = r8.f52615j     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0048
            r4 = 190(0xbe, float:2.66E-43)
            if (r0 == r4) goto L_0x0048
            if (r0 == r1) goto L_0x0048
            switch(r0) {
                case 194: goto L_0x0034;
                case 195: goto L_0x0025;
                case 196: goto L_0x0025;
                default: goto L_0x0016;
            }     // Catch:{ all -> 0x009b }
        L_0x0016:
            switch(r0) {
                case 198: goto L_0x004a;
                case 199: goto L_0x001a;
                default: goto L_0x0019;
            }     // Catch:{ all -> 0x009b }
        L_0x0019:
            goto L_0x004a
        L_0x001a:
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch:{ all -> 0x009b }
            java.lang.String r4 = "mounted"
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x009b }
            goto L_0x004b
        L_0x0025:
            boolean r0 = r8.m46528d()     // Catch:{ all -> 0x009b }
            if (r0 != 0) goto L_0x004a
            com.ss.android.download.c$a r0 = r8.mo39028b()     // Catch:{ all -> 0x009b }
            com.ss.android.download.c$a r4 = com.p683ss.android.download.C19101c.C19103a.OK     // Catch:{ all -> 0x009b }
            if (r0 != r4) goto L_0x004a
            goto L_0x0048
        L_0x0034:
            com.ss.android.download.v r0 = r8.f52603J     // Catch:{ all -> 0x009b }
            long r4 = r0.mo39070a()     // Catch:{ all -> 0x009b }
            boolean r0 = r8.m46528d()     // Catch:{ all -> 0x009b }
            if (r0 != 0) goto L_0x004a
            long r6 = r8.mo39023a(r4)     // Catch:{ all -> 0x009b }
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x004a
        L_0x0048:
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            java.util.concurrent.Future<?> r4 = r8.f52600G     // Catch:{ all -> 0x009b }
            if (r4 == 0) goto L_0x0058
            java.util.concurrent.Future<?> r4 = r8.f52600G     // Catch:{ all -> 0x009b }
            boolean r4 = r4.isDone()     // Catch:{ all -> 0x009b }
            if (r4 != 0) goto L_0x0058
            r2 = 1
        L_0x0058:
            if (r0 == 0) goto L_0x0099
            if (r2 != 0) goto L_0x0099
            int r2 = r8.f52615j     // Catch:{ all -> 0x009b }
            if (r2 == r1) goto L_0x0080
            r8.f52615j = r1     // Catch:{ all -> 0x009b }
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x009b }
            r1.<init>()     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "status"
            int r3 = r8.f52615j     // Catch:{ all -> 0x009b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x009b }
            r1.put(r2, r3)     // Catch:{ all -> 0x009b }
            android.content.Context r2 = r8.f52599F     // Catch:{ all -> 0x009b }
            com.ss.android.download.g r2 = com.p683ss.android.download.C19117g.m46591a(r2)     // Catch:{ all -> 0x009b }
            android.net.Uri r3 = r8.mo39029c()     // Catch:{ all -> 0x009b }
            r4 = 0
            r2.mo39052a(r3, r1, r4, r4)     // Catch:{ all -> 0x009b }
        L_0x0080:
            com.ss.android.download.l r7 = new com.ss.android.download.l     // Catch:{ all -> 0x009b }
            android.content.Context r2 = r8.f52599F     // Catch:{ all -> 0x009b }
            com.ss.android.download.v r3 = r8.f52603J     // Catch:{ all -> 0x009b }
            com.ss.android.download.u r5 = r8.f52604K     // Catch:{ all -> 0x009b }
            com.ss.android.download.e r6 = r8.f52605L     // Catch:{ all -> 0x009b }
            r1 = r7
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x009b }
            r8.f52601H = r7     // Catch:{ all -> 0x009b }
            com.ss.android.download.l r1 = r8.f52601H     // Catch:{ all -> 0x009b }
            java.util.concurrent.Future r9 = r9.submit(r1)     // Catch:{ all -> 0x009b }
            r8.f52600G = r9     // Catch:{ all -> 0x009b }
        L_0x0099:
            monitor-exit(r8)     // Catch:{ all -> 0x009b }
            return r0
        L_0x009b:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x009b }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19101c.mo39027a(java.util.concurrent.ExecutorService):boolean");
    }

    /* renamed from: a */
    public static int m46524a(C19117g gVar, long j) {
        boolean a = gVar.mo39054a(ContentUris.withAppendedId(C19097a.f52584a, j), new String[]{"status"}, (String) null, (String[]) null, (String) null);
        try {
            a = a.moveToFirst();
            if (a) {
                int i = a.getInt(0);
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused) {
                    }
                }
                return i;
            }
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused2) {
                }
            }
            return 190;
        } finally {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused3) {
                }
            }
        }
    }

    private C19101c(Context context, C19138v vVar, C19136u uVar, C19109e eVar) {
        this.f52598E = new ArrayList();
        this.f52599F = context;
        this.f52602I = (NotificationManager) this.f52599F.getSystemService("notification");
        this.f52603J = vVar;
        this.f52604K = uVar;
        this.f52605L = eVar;
        this.f52597D = C19129n.f52723a.nextInt(1001);
    }
}
