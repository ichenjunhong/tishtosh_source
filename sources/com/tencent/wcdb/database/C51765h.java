package com.tencent.wcdb.database;

import com.tencent.wcdb.database.SQLiteDatabase.C51753a;
import com.tencent.wcdb.support.C51787a;

/* renamed from: com.tencent.wcdb.database.h */
public final class C51765h implements C51763f {

    /* renamed from: f */
    private static C51753a f129129f = C51761e.f129108j;

    /* renamed from: a */
    private final SQLiteDatabase f129130a;

    /* renamed from: b */
    private final String f129131b;

    /* renamed from: c */
    private final String f129132c;

    /* renamed from: d */
    private final C51787a f129133d;

    /* renamed from: e */
    private C51767j f129134e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SQLiteDirectCursorDriver: ");
        sb.append(this.f129132c);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.wcdb.C51775e mo107217a(com.tencent.wcdb.database.SQLiteDatabase.C51753a r5, java.lang.Object[] r6) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0004
            com.tencent.wcdb.database.SQLiteDatabase$a r5 = f129129f
        L_0x0004:
            r0 = 0
            com.tencent.wcdb.database.SQLiteDatabase r1 = r4.f129130a     // Catch:{ RuntimeException -> 0x001d }
            java.lang.String r2 = r4.f129132c     // Catch:{ RuntimeException -> 0x001d }
            com.tencent.wcdb.support.a r3 = r4.f129133d     // Catch:{ RuntimeException -> 0x001d }
            com.tencent.wcdb.database.j r6 = r5.mo20970a(r1, r2, r6, r3)     // Catch:{ RuntimeException -> 0x001d }
            com.tencent.wcdb.database.SQLiteDatabase r0 = r4.f129130a     // Catch:{ RuntimeException -> 0x001a }
            java.lang.String r1 = r4.f129131b     // Catch:{ RuntimeException -> 0x001a }
            com.tencent.wcdb.e r5 = r5.mo20971a(r0, r4, r1, r6)     // Catch:{ RuntimeException -> 0x001a }
            r4.f129134e = r6
            return r5
        L_0x001a:
            r5 = move-exception
            r0 = r6
            goto L_0x001e
        L_0x001d:
            r5 = move-exception
        L_0x001e:
            if (r0 == 0) goto L_0x0023
            r0.close()
        L_0x0023:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.C51765h.mo107217a(com.tencent.wcdb.database.SQLiteDatabase$a, java.lang.Object[]):com.tencent.wcdb.e");
    }

    public C51765h(SQLiteDatabase sQLiteDatabase, String str, String str2, C51787a aVar) {
        this.f129130a = sQLiteDatabase;
        this.f129131b = str2;
        this.f129132c = str;
        this.f129133d = aVar;
    }
}
