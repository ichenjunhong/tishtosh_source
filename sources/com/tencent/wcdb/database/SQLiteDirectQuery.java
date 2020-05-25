package com.tencent.wcdb.database;

import com.tencent.wcdb.support.C51787a;

public class SQLiteDirectQuery extends C51767j {

    /* renamed from: g */
    private static final int[] f129069g = {3, 1, 2, 3, 4, 0};

    /* renamed from: f */
    private final C51787a f129070f;

    private static native byte[] nativeGetBlob(long j, int i);

    private static native double nativeGetDouble(long j, int i);

    private static native long nativeGetLong(long j, int i);

    private static native String nativeGetString(long j, int i);

    private static native int nativeGetType(long j, int i);

    private static native int nativeStep(long j, int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo107088c() {
        synchronized (this) {
            if (this.f129153e != null) {
                C51750c cVar = this.f129153e;
                C51787a aVar = this.f129070f;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) cVar.f129045a.get();
                if (sQLiteConnection != null) {
                    sQLiteConnection.mo107153a(aVar);
                }
                C51750c cVar2 = this.f129153e;
                if (cVar2.f129054j != null) {
                    SQLiteConnection sQLiteConnection2 = (SQLiteConnection) cVar2.f129045a.get();
                    if (sQLiteConnection2 != null) {
                        if (sQLiteConnection2.f129016f.mo107174b(cVar2.f129054j.f129038h)) {
                            sQLiteConnection2.f129016f.mo107173a(cVar2.f129054j.f129038h, (String) null);
                        }
                        cVar2.f129054j = null;
                    }
                }
            }
        }
        super.mo107088c();
    }
}
