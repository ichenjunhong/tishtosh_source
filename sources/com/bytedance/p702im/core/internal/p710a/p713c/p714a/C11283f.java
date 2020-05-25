package com.bytedance.p702im.core.internal.p710a.p713c.p714a;

import android.content.Context;
import com.bytedance.p702im.core.internal.p710a.p713c.C11299d;
import com.bytedance.p702im.core.internal.p710a.p713c.p715b.p717b.C11295c;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p705b.C11175c;
import com.tencent.wcdb.C51778h;
import com.tencent.wcdb.database.C51766i;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabase.C51753a;
import com.tencent.wcdb.repair.RepairKit;

/* renamed from: com.bytedance.im.core.internal.a.c.a.f */
public final class C11283f extends C51766i implements C11280c {

    /* renamed from: a */
    public static int f30387a;

    /* renamed from: b */
    public static volatile boolean f30388b;

    /* renamed from: e */
    private static final C51778h f30389e = new C51778h() {
        /* renamed from: a */
        public final void mo20973a(SQLiteDatabase sQLiteDatabase) {
        }
    };

    /* renamed from: f */
    private static final C11281d f30390f = new C11281d() {
        /* renamed from: a */
        public final void mo20973a(SQLiteDatabase sQLiteDatabase) {
            if (!C11283f.f30388b) {
                C11283f.f30388b = true;
                boolean d = C11283f.m22929d(sQLiteDatabase);
                StringBuilder sb = new StringBuilder("tryRepair result ");
                sb.append(d);
                C11467e.m23463a("LocalWcdbOpenHelper", sb.toString());
                C11175c a = C11175c.m22624a().mo20526a("core").mo20528b("db_repair").mo20527a("repair_result", String.valueOf(d));
                String str = "repair_count";
                int i = 1000;
                if (C11283f.f30387a < 1000) {
                    i = C11283f.f30387a;
                }
                a.mo20527a(str, Integer.valueOf(i)).mo20530b();
                if (!d) {
                    super.mo20973a(sQLiteDatabase);
                    C11165c.m22588a().mo20518f();
                }
                C11283f.f30388b = false;
            }
        }
    };

    /* renamed from: d */
    private C11278a f30391d;

    /* renamed from: a */
    public final void mo20957a(C11299d dVar) {
    }

    /* renamed from: a */
    public final void mo20958a(C11299d dVar, int i, int i2) {
    }

    /* renamed from: b */
    public final void mo20959b(C11299d dVar, int i, int i2) {
    }

    /* renamed from: c */
    public final C11299d mo20969c() {
        return m22930e(mo107221a());
    }

    /* renamed from: a */
    public final void mo20967a(C11278a aVar) {
        this.f30391d = aVar;
    }

    /* renamed from: e */
    private static C11299d m22930e(SQLiteDatabase sQLiteDatabase) {
        return new C11295c(sQLiteDatabase);
    }

    /* renamed from: b */
    public final void mo20983b(SQLiteDatabase sQLiteDatabase) {
        C11467e.m23462a("LocalWcdbOpenHelper onConfigure");
        m22930e(sQLiteDatabase);
    }

    /* renamed from: a */
    public final void mo20981a(SQLiteDatabase sQLiteDatabase) {
        C11467e.m23462a("LocalWcdbOpenHelper onCreate");
        this.f30391d.mo20957a(m22930e(sQLiteDatabase));
    }

    /* renamed from: c */
    public final void mo20985c(SQLiteDatabase sQLiteDatabase) {
        C11467e.m23462a("LocalWcdbOpenHelper onOpen");
        m22930e(sQLiteDatabase);
        StringBuilder sb = new StringBuilder();
        sb.append(sQLiteDatabase.mo107197o());
        sb.append("-mbak");
        String sb2 = sb.toString();
        long a = sQLiteDatabase.mo107179a("backupMaster", true, false);
        RepairKit.nativeSaveMaster(a, sb2, null);
        sQLiteDatabase.mo107184a(a, (Exception) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2 A[Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3 A[Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013d A[SYNTHETIC, Splitter:B:64:0x013d] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014b A[SYNTHETIC, Splitter:B:73:0x014b] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0151  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m22929d(com.tencent.wcdb.database.SQLiteDatabase r19) {
        /*
            java.lang.Class<com.bytedance.im.core.internal.a.c.a.f> r1 = com.bytedance.p702im.core.internal.p710a.p713c.p714a.C11283f.class
            monitor-enter(r1)
            r0 = 0
            if (r19 != 0) goto L_0x0008
            monitor-exit(r1)
            return r0
        L_0x0008:
            boolean r3 = r19.mo107196n()     // Catch:{ all -> 0x0156 }
            if (r3 == 0) goto L_0x0011
            r19.close()     // Catch:{ all -> 0x0156 }
        L_0x0011:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0156 }
            java.lang.String r2 = r19.mo107197o()     // Catch:{ all -> 0x0156 }
            r3.<init>(r2)     // Catch:{ all -> 0x0156 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0156 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0156 }
            r4.<init>()     // Catch:{ all -> 0x0156 }
            java.lang.String r5 = r3.getPath()     // Catch:{ all -> 0x0156 }
            r4.append(r5)     // Catch:{ all -> 0x0156 }
            java.lang.String r5 = "-mbak"
            r4.append(r5)     // Catch:{ all -> 0x0156 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0156 }
            r2.<init>(r4)     // Catch:{ all -> 0x0156 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0156 }
            java.lang.String r5 = r3.getParent()     // Catch:{ all -> 0x0156 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0156 }
            r6.<init>()     // Catch:{ all -> 0x0156 }
            java.lang.String r7 = r3.getName()     // Catch:{ all -> 0x0156 }
            r6.append(r7)     // Catch:{ all -> 0x0156 }
            java.lang.String r7 = "-recover"
            r6.append(r7)     // Catch:{ all -> 0x0156 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0156 }
            r4.<init>(r5, r6)     // Catch:{ all -> 0x0156 }
            boolean r5 = r2.exists()     // Catch:{ all -> 0x0156 }
            r6 = 0
            r8 = 0
            if (r5 == 0) goto L_0x0091
            java.lang.String r2 = r2.getPath()     // Catch:{ SQLiteException -> 0x0091 }
            if (r2 != 0) goto L_0x0077
            long r9 = com.tencent.wcdb.repair.RepairKit.nativeMakeMaster(r8)     // Catch:{ SQLiteException -> 0x0091 }
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x006f
            com.tencent.wcdb.repair.RepairKit$b r2 = new com.tencent.wcdb.repair.RepairKit$b     // Catch:{ SQLiteException -> 0x0091 }
            r2.<init>(r9, r8)     // Catch:{ SQLiteException -> 0x0091 }
            goto L_0x0092
        L_0x006f:
            com.tencent.wcdb.database.SQLiteException r2 = new com.tencent.wcdb.database.SQLiteException     // Catch:{ SQLiteException -> 0x0091 }
            java.lang.String r5 = "Cannot create MasterInfo."
            r2.<init>(r5)     // Catch:{ SQLiteException -> 0x0091 }
            throw r2     // Catch:{ SQLiteException -> 0x0091 }
        L_0x0077:
            r5 = 16
            byte[] r5 = new byte[r5]     // Catch:{ SQLiteException -> 0x0091 }
            long r9 = com.tencent.wcdb.repair.RepairKit.nativeLoadMaster(r2, r8, r8, r5)     // Catch:{ SQLiteException -> 0x0091 }
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0089
            com.tencent.wcdb.repair.RepairKit$b r2 = new com.tencent.wcdb.repair.RepairKit$b     // Catch:{ SQLiteException -> 0x0091 }
            r2.<init>(r9, r5)     // Catch:{ SQLiteException -> 0x0091 }
            goto L_0x0092
        L_0x0089:
            com.tencent.wcdb.database.SQLiteException r2 = new com.tencent.wcdb.database.SQLiteException     // Catch:{ SQLiteException -> 0x0091 }
            java.lang.String r5 = "Cannot create MasterInfo."
            r2.<init>(r5)     // Catch:{ SQLiteException -> 0x0091 }
            throw r2     // Catch:{ SQLiteException -> 0x0091 }
        L_0x0091:
            r2 = r8
        L_0x0092:
            com.bytedance.im.core.a.c r5 = com.bytedance.p702im.core.p703a.C11165c.m22588a()     // Catch:{ all -> 0x0156 }
            com.bytedance.im.core.a.e r5 = r5.mo20513b()     // Catch:{ all -> 0x0156 }
            java.lang.String r5 = r5.f30161y     // Catch:{ all -> 0x0156 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0156 }
            if (r5 != 0) goto L_0x00b2
            com.bytedance.im.core.a.c r5 = com.bytedance.p702im.core.p703a.C11165c.m22588a()     // Catch:{ all -> 0x0156 }
            com.bytedance.im.core.a.e r5 = r5.mo20513b()     // Catch:{ all -> 0x0156 }
            java.lang.String r5 = r5.f30161y     // Catch:{ all -> 0x0156 }
            byte[] r5 = r5.getBytes()     // Catch:{ all -> 0x0156 }
            r10 = r5
            goto L_0x00b3
        L_0x00b2:
            r10 = r8
        L_0x00b3:
            com.tencent.wcdb.repair.RepairKit r5 = new com.tencent.wcdb.repair.RepairKit     // Catch:{ SQLiteException -> 0x013b, all -> 0x0147 }
            java.lang.String r9 = r3.getPath()     // Catch:{ SQLiteException -> 0x013b, all -> 0x0147 }
            r5.<init>(r9, r10, r8, r2)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0147 }
            boolean r2 = r4.exists()     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            if (r2 == 0) goto L_0x00c5
            r4.delete()     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
        L_0x00c5:
            com.tencent.wcdb.h r14 = f30389e     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            java.lang.String r9 = r4.getPath()     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            r11 = 0
            r12 = 0
            r13 = 268435456(0x10000000, float:2.5243549E-29)
            r15 = 0
            com.tencent.wcdb.database.SQLiteDatabase r2 = com.tencent.wcdb.database.SQLiteDatabase.m110941a(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            f30387a = r0     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            com.bytedance.im.core.internal.a.c.a.f$3 r9 = new com.bytedance.im.core.internal.a.c.a.f$3     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            r9.<init>()     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            r5.f129181d = r9     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            long r9 = r5.f129178a     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x013d
            com.tencent.wcdb.repair.RepairKit$b r9 = r5.f129180c     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            if (r9 != 0) goto L_0x00ea
        L_0x00e7:
            r16 = r6
            goto L_0x00ef
        L_0x00ea:
            com.tencent.wcdb.repair.RepairKit$b r6 = r5.f129180c     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            long r6 = r6.f129184a     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            goto L_0x00e7
        L_0x00ef:
            java.lang.String r6 = "repair"
            long r6 = r2.mo107179a(r6, r0, r0)     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            long r12 = r5.f129178a     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            r18 = 0
            r11 = r5
            r14 = r6
            int r9 = r11.nativeOutput(r12, r14, r16, r18)     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            r2.mo107184a(r6, r8)     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            r5.f129182e = r8     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            long r6 = r5.f129178a     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            int r6 = com.tencent.wcdb.repair.RepairKit.nativeIntegrityFlags(r6)     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            r5.f129179b = r6     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            r6 = 1
            if (r9 == 0) goto L_0x011a
            if (r9 != r6) goto L_0x0112
            goto L_0x011a
        L_0x0112:
            com.tencent.wcdb.database.SQLiteException r2 = new com.tencent.wcdb.database.SQLiteException     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            java.lang.String r3 = "Repair returns failure."
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            throw r2     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
        L_0x011a:
            r7 = 17
            r2.mo107183a(r7)     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            r2.close()     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            r5.mo107252a()     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            boolean r2 = r3.delete()     // Catch:{ SQLiteException -> 0x013b, all -> 0x0147 }
            if (r2 == 0) goto L_0x0133
            boolean r2 = r4.renameTo(r3)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0147 }
            if (r2 == 0) goto L_0x0133
            monitor-exit(r1)
            return r6
        L_0x0133:
            com.tencent.wcdb.database.SQLiteException r2 = new com.tencent.wcdb.database.SQLiteException     // Catch:{ SQLiteException -> 0x013b, all -> 0x0147 }
            java.lang.String r3 = "Cannot rename database."
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0147 }
            throw r2     // Catch:{ SQLiteException -> 0x013b, all -> 0x0147 }
        L_0x013b:
            goto L_0x014f
        L_0x013d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
            throw r2     // Catch:{ SQLiteException -> 0x0145, all -> 0x0143 }
        L_0x0143:
            r0 = move-exception
            goto L_0x0149
        L_0x0145:
            r8 = r5
            goto L_0x014f
        L_0x0147:
            r0 = move-exception
            r5 = r8
        L_0x0149:
            if (r5 == 0) goto L_0x014e
            r5.mo107252a()     // Catch:{ all -> 0x0156 }
        L_0x014e:
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x014f:
            if (r8 == 0) goto L_0x0154
            r8.mo107252a()     // Catch:{ all -> 0x0156 }
        L_0x0154:
            monitor-exit(r1)
            return r0
        L_0x0156:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.p710a.p713c.p714a.C11283f.m22929d(com.tencent.wcdb.database.SQLiteDatabase):boolean");
    }

    /* renamed from: b */
    public final void mo20984b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C11467e.m23472d("LocalWcdbOpenHelper onDowngrade");
        this.f30391d.mo20959b(m22930e(sQLiteDatabase), i, i2);
    }

    /* renamed from: a */
    public final void mo20982a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C11467e.m23462a("LocalWcdbOpenHelper onUpgrade");
        this.f30391d.mo20958a(m22930e(sQLiteDatabase), i, i2);
    }

    public C11283f(Context context, String str, C51753a aVar, int i) {
        super(context, str, null, aVar, i, f30390f);
        C11467e.m23462a("LocalWcdbOpenHelper");
    }

    public C11283f(Context context, String str, byte[] bArr, C51753a aVar, int i) {
        super(context, str, bArr, aVar, i, f30390f);
        C11467e.m23462a("LocalWcdbOpenHelper");
    }
}
