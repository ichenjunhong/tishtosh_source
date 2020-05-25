package android.arch.p011c.p012a.p013a;

import android.arch.p011c.p012a.C0118b;
import android.arch.p011c.p012a.C0119c;
import android.arch.p011c.p012a.C0119c.C0120a;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: android.arch.c.a.a.b */
final class C0112b implements C0119c {

    /* renamed from: a */
    private final C0113a f279a;

    /* renamed from: android.arch.c.a.a.b$a */
    static class C0113a extends SQLiteOpenHelper {

        /* renamed from: a */
        final C0110a[] f280a;

        /* renamed from: b */
        final C0120a f281b;

        /* renamed from: c */
        private boolean f282c;

        public final synchronized void close() {
            super.close();
            this.f280a[0] = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized C0118b mo189a() {
            this.f282c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f282c) {
                close();
                return mo189a();
            }
            return m236a(writableDatabase);
        }

        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            m236a(sQLiteDatabase);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f281b.mo206a((C0118b) m236a(sQLiteDatabase));
        }

        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f282c) {
                this.f281b.mo208b(m236a(sQLiteDatabase));
            }
        }

        /* renamed from: a */
        private C0110a m236a(SQLiteDatabase sQLiteDatabase) {
            if (this.f280a[0] == null) {
                this.f280a[0] = new C0110a(sQLiteDatabase);
            }
            return this.f280a[0];
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f282c = true;
            this.f281b.mo209b(m236a(sQLiteDatabase), i, i2);
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f282c = true;
            this.f281b.mo207a(m236a(sQLiteDatabase), i, i2);
        }

        C0113a(Context context, String str, final C0110a[] aVarArr, final C0120a aVar) {
            super(context, str, null, aVar.f287a, new DatabaseErrorHandler() {
                /* JADX INFO: used method not loaded: android.arch.c.a.c.a.a(java.lang.String):null, types can be incorrect */
                /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
                    r1 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
                    if (r0 != null) goto L_0x0026;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
                    r3 = r0.iterator();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
                    if (r3.hasNext() != false) goto L_0x0030;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
                    android.arch.p011c.p012a.C0119c.C0120a.m259a((java.lang.String) ((android.util.Pair) r3.next()).second);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
                    android.arch.p011c.p012a.C0119c.C0120a.m259a(r3.mo184f());
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
                    throw r1;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0020 */
                /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[ExcHandler: all (r1v0 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
                  PHI: (r0v10 java.util.List) = (r0v3 java.util.List), (r0v4 java.util.List), (r0v4 java.util.List) binds: [B:7:0x0018, B:11:0x0020, B:12:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:7:0x0018] */
                /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
                /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onCorruption(android.database.sqlite.SQLiteDatabase r3) {
                    /*
                        r2 = this;
                        android.arch.c.a.a.a[] r3 = r9
                        r0 = 0
                        r3 = r3[r0]
                        if (r3 == 0) goto L_0x0069
                        android.arch.c.a.c$a r0 = r10
                        boolean r0 = r3.mo183e()
                        if (r0 != 0) goto L_0x0017
                        java.lang.String r3 = r3.mo184f()
                        android.arch.p011c.p012a.C0119c.C0120a.m259a(r3)
                        return
                    L_0x0017:
                        r0 = 0
                        java.util.List r1 = r3.mo185g()     // Catch:{ SQLiteException -> 0x0020, all -> 0x001e }
                        r0 = r1
                        goto L_0x0020
                    L_0x001e:
                        r1 = move-exception
                        goto L_0x0024
                    L_0x0020:
                        r3.close()     // Catch:{ IOException -> 0x0046, all -> 0x001e }
                        goto L_0x0046
                    L_0x0024:
                        if (r0 == 0) goto L_0x003e
                        java.util.Iterator r3 = r0.iterator()
                    L_0x002a:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L_0x0045
                        java.lang.Object r0 = r3.next()
                        android.util.Pair r0 = (android.util.Pair) r0
                        java.lang.Object r0 = r0.second
                        java.lang.String r0 = (java.lang.String) r0
                        android.arch.p011c.p012a.C0119c.C0120a.m259a(r0)
                        goto L_0x002a
                    L_0x003e:
                        java.lang.String r3 = r3.mo184f()
                        android.arch.p011c.p012a.C0119c.C0120a.m259a(r3)
                    L_0x0045:
                        throw r1
                    L_0x0046:
                        if (r0 == 0) goto L_0x0061
                        java.util.Iterator r3 = r0.iterator()
                    L_0x004c:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L_0x0060
                        java.lang.Object r0 = r3.next()
                        android.util.Pair r0 = (android.util.Pair) r0
                        java.lang.Object r0 = r0.second
                        java.lang.String r0 = (java.lang.String) r0
                        android.arch.p011c.p012a.C0119c.C0120a.m259a(r0)
                        goto L_0x004c
                    L_0x0060:
                        return
                    L_0x0061:
                        java.lang.String r3 = r3.mo184f()
                        android.arch.p011c.p012a.C0119c.C0120a.m259a(r3)
                        return
                    L_0x0069:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: android.arch.p011c.p012a.p013a.C0112b.C0113a.C01141.onCorruption(android.database.sqlite.SQLiteDatabase):void");
                }
            });
            this.f281b = aVar;
            this.f280a = aVarArr;
        }
    }

    /* renamed from: a */
    public final C0118b mo187a() {
        return this.f279a.mo189a();
    }

    /* renamed from: a */
    public final void mo188a(boolean z) {
        this.f279a.setWriteAheadLoggingEnabled(z);
    }

    C0112b(Context context, String str, C0120a aVar) {
        this.f279a = new C0113a(context, str, new C0110a[1], aVar);
    }
}
