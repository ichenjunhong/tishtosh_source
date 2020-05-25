package com.p683ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.util.C47641u;
import java.util.Calendar;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.pendant.b */
public final class C38588b {

    /* renamed from: e */
    public static final String f98131e = f98131e;

    /* renamed from: f */
    public static final String f98132f = f98132f;

    /* renamed from: g */
    public static final int f98133g = f98133g;

    /* renamed from: h */
    public static final String f98134h = f98134h;

    /* renamed from: i */
    public static final String f98135i = f98135i;

    /* renamed from: j */
    public static final String f98136j = f98136j;

    /* renamed from: k */
    public static final String f98137k = f98137k;

    /* renamed from: l */
    public static final String f98138l = f98138l;

    /* renamed from: m */
    public static final String f98139m = f98139m;

    /* renamed from: n */
    public static final String f98140n = f98140n;

    /* renamed from: o */
    public static final C38589a f98141o = new C38589a(null);

    /* renamed from: a */
    final C47641u f98142a = new C47641u(f98139m);

    /* renamed from: b */
    int f98143b = -1;

    /* renamed from: c */
    int f98144c = -1;

    /* renamed from: d */
    int f98145d = -1;

    /* renamed from: p */
    private final Keva f98146p = Keva.getRepo(f98131e);

    /* renamed from: com.ss.android.ugc.aweme.pendant.b$a */
    public static final class C38589a {
        private C38589a() {
        }

        /* renamed from: a */
        public static C38588b m85915a() {
            return C38590b.f98147a;
        }

        public /* synthetic */ C38589a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.b$b */
    static final class C38590b {

        /* renamed from: a */
        static final C38588b f98147a = new C38588b();

        /* renamed from: b */
        public static final C38590b f98148b = new C38590b();

        private C38590b() {
        }
    }

    /* renamed from: a */
    public final Keva mo78522a() {
        Keva keva = this.f98146p;
        C52711k.m112236a((Object) keva, "keva");
        return keva;
    }

    /* renamed from: d */
    private final String m85910d() {
        return mo78522a().getString(f98138l, "");
    }

    /* renamed from: b */
    static long m85906b() {
        Calendar instance = Calendar.getInstance();
        C52711k.m112236a((Object) instance, "calendar");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    /* renamed from: c */
    private static String m85908c() {
        Calendar instance = Calendar.getInstance();
        C52711k.m112236a((Object) instance, "calendar");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return String.valueOf(instance.getTimeInMillis());
    }

    /* renamed from: b */
    private final void m85907b(Context context) {
        mo78522a().storeInt(f98137k, 0);
    }

    /* renamed from: c */
    private final boolean m85909c(Context context) {
        return C52711k.m112239a((Object) m85908c(), (Object) m85910d());
    }

    /* renamed from: d */
    private final void m85911d(Context context) {
        mo78522a().storeString(f98138l, m85908c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo78521a(Context context) {
        if (m85909c(context)) {
            return mo78522a().getInt(f98137k, 0);
        }
        m85911d(context);
        m85907b(context);
        return 0;
    }

    /* renamed from: a */
    private static boolean m85905a(Context context, int i) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception unused) {
            packageInfo = null;
        }
        long j = 0;
        if (packageInfo != null) {
            j = packageInfo.firstInstallTime;
        }
        if (System.currentTimeMillis() - j < ((long) (i * f98133g))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo78523a(android.content.Context r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r19
            java.lang.String r1 = "context"
            r2 = r17
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r1)
            boolean r1 = m85905a(r17, r18)
            r2 = 0
            if (r1 != 0) goto L_0x0011
            return r2
        L_0x0011:
            r1 = 0
            com.ss.android.ugc.aweme.bd r3 = com.p683ss.android.ugc.aweme.C23794bh.m58408v()     // Catch:{ all -> 0x00d2 }
            java.lang.String r4 = "LegacyServiceUtils.getUgAllService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ all -> 0x00d2 }
            android.database.sqlite.SQLiteDatabase r3 = r3.mo49250e()     // Catch:{ all -> 0x00d2 }
            r6 = 1
            java.lang.String r7 = f98134h     // Catch:{ all -> 0x00d2 }
            r8 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            r4.<init>()     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = f98135i     // Catch:{ all -> 0x00d2 }
            r4.append(r5)     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = " > ?"
            r4.append(r5)     // Catch:{ all -> 0x00d2 }
            java.lang.String r9 = r4.toString()     // Catch:{ all -> 0x00d2 }
            r4 = 1
            java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ all -> 0x00d2 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d2 }
            int r5 = f98133g     // Catch:{ all -> 0x00d2 }
            int r5 = r5 * r18
            long r13 = (long) r5     // Catch:{ all -> 0x00d2 }
            long r11 = r11 - r13
            java.lang.String r5 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00d2 }
            r10[r2] = r5     // Catch:{ all -> 0x00d2 }
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r5 = r3
            android.database.Cursor r15 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00d2 }
            if (r15 != 0) goto L_0x005a
            if (r15 == 0) goto L_0x0059
            r15.close()
        L_0x0059:
            return r2
        L_0x005a:
            java.util.Calendar r5 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x00d0 }
            java.lang.String r6 = "calendar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)     // Catch:{ all -> 0x00d0 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d0 }
            r5.setTimeInMillis(r6)     // Catch:{ all -> 0x00d0 }
            r6 = 11
            r5.set(r6, r2)     // Catch:{ all -> 0x00d0 }
            r6 = 12
            r5.set(r6, r2)     // Catch:{ all -> 0x00d0 }
            r6 = 13
            r5.set(r6, r2)     // Catch:{ all -> 0x00d0 }
            r6 = 14
            r5.set(r6, r2)     // Catch:{ all -> 0x00d0 }
            r6 = 1
            java.lang.String r7 = f98134h     // Catch:{ all -> 0x00d0 }
            r8 = 0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r9.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r10 = f98135i     // Catch:{ all -> 0x00d0 }
            r9.append(r10)     // Catch:{ all -> 0x00d0 }
            java.lang.String r10 = " = ?"
            r9.append(r10)     // Catch:{ all -> 0x00d0 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00d0 }
            java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ all -> 0x00d0 }
            long r11 = r5.getTimeInMillis()     // Catch:{ all -> 0x00d0 }
            java.lang.String r5 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00d0 }
            r10[r2] = r5     // Catch:{ all -> 0x00d0 }
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r5 = r3
            android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "todayCursor"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r1)     // Catch:{ all -> 0x00cd }
            int r1 = r3.getCount()     // Catch:{ all -> 0x00cd }
            if (r1 <= 0) goto L_0x00bd
            int r1 = r15.getCount()     // Catch:{ all -> 0x00cd }
            if (r1 > r0) goto L_0x00c4
        L_0x00bb:
            r2 = 1
            goto L_0x00c4
        L_0x00bd:
            int r1 = r15.getCount()     // Catch:{ all -> 0x00cd }
            if (r1 >= r0) goto L_0x00c4
            goto L_0x00bb
        L_0x00c4:
            if (r15 == 0) goto L_0x00c9
            r15.close()
        L_0x00c9:
            r3.close()
            return r2
        L_0x00cd:
            r0 = move-exception
            r1 = r3
            goto L_0x00d4
        L_0x00d0:
            r0 = move-exception
            goto L_0x00d4
        L_0x00d2:
            r0 = move-exception
            r15 = r1
        L_0x00d4:
            if (r15 == 0) goto L_0x00d9
            r15.close()
        L_0x00d9:
            if (r1 == 0) goto L_0x00de
            r1.close()
        L_0x00de:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.pendant.C38588b.mo78523a(android.content.Context, int, int):boolean");
    }
}
