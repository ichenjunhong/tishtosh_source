package android.arch.p011c.p014b;

import android.arch.p011c.p012a.C0109a;
import android.arch.p011c.p012a.C0118b;
import android.arch.p011c.p012a.C0119c.C0120a;
import android.arch.p011c.p012a.C0125e;
import android.database.Cursor;

/* renamed from: android.arch.c.b.h */
public final class C0148h extends C0120a {

    /* renamed from: b */
    private C0127a f370b;

    /* renamed from: c */
    private final C0149a f371c;

    /* renamed from: d */
    private final String f372d;

    /* renamed from: e */
    private final String f373e;

    /* renamed from: android.arch.c.b.h$a */
    public static abstract class C0149a {

        /* renamed from: a */
        public final int f374a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo256a(C0118b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo257b(C0118b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo258c(C0118b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo259d(C0118b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract void mo260e(C0118b bVar);

        public C0149a(int i) {
            this.f374a = i;
        }
    }

    /* renamed from: d */
    private static void m323d(C0118b bVar) {
        bVar.mo180c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: c */
    private void m322c(C0118b bVar) {
        m323d(bVar);
        bVar.mo180c(C0147g.m321a(this.f372d));
    }

    /* renamed from: a */
    public final void mo206a(C0118b bVar) {
        m322c(bVar);
        this.f371c.mo257b(bVar);
        this.f371c.mo259d(bVar);
    }

    /* renamed from: e */
    private static boolean m324e(C0118b bVar) {
        Cursor b = bVar.mo177b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (b.moveToFirst() && b.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            b.close();
        }
    }

    /* renamed from: b */
    public final void mo208b(C0118b bVar) {
        Object obj;
        super.mo208b(bVar);
        if (m324e(bVar)) {
            Cursor a = bVar.mo175a((C0125e) new C0109a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (a.moveToFirst()) {
                    obj = a.getString(0);
                } else {
                    obj = null;
                }
            } finally {
                a.close();
            }
        } else {
            obj = null;
        }
        if (this.f372d.equals(obj) || this.f373e.equals(obj)) {
            this.f371c.mo258c(bVar);
            this.f370b = null;
            return;
        }
        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
    }

    /* renamed from: b */
    public final void mo209b(C0118b bVar, int i, int i2) {
        mo207a(bVar, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0096 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo207a(android.arch.p011c.p012a.C0118b r6, int r7, int r8) {
        /*
            r5 = this;
            android.arch.c.b.a r0 = r5.f370b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003f
            android.arch.c.b.a r0 = r5.f370b
            android.arch.c.b.f$d r0 = r0.f297d
            if (r7 != r8) goto L_0x0011
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x001f
        L_0x0011:
            if (r8 <= r7) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r0 = r0.mo254a(r4, r3, r7, r8)
        L_0x001f:
            if (r0 == 0) goto L_0x003f
            java.util.Iterator r0 = r0.iterator()
        L_0x0025:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0035
            java.lang.Object r3 = r0.next()
            android.arch.c.b.a.a r3 = (android.arch.p011c.p014b.p015a.C0128a) r3
            r3.mo213a(r6)
            goto L_0x0025
        L_0x0035:
            android.arch.c.b.h$a r0 = r5.f371c
            r0.mo260e(r6)
            r5.m322c(r6)
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 != 0) goto L_0x0096
            android.arch.c.b.a r0 = r5.f370b
            if (r0 == 0) goto L_0x006b
            android.arch.c.b.a r0 = r5.f370b
            boolean r3 = r0.f301h
            if (r3 == 0) goto L_0x005d
            java.util.Set<java.lang.Integer> r3 = r0.f302i
            if (r3 == 0) goto L_0x005e
            java.util.Set<java.lang.Integer> r0 = r0.f302i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            android.arch.c.b.h$a r7 = r5.f371c
            r7.mo256a(r6)
            android.arch.c.b.h$a r7 = r5.f371c
            r7.mo257b(r6)
            return
        L_0x006b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "A migration from "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = " to "
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = " was required but not found. Please provide the necessary Migration path via "
            r0.append(r7)
            java.lang.String r7 = "RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the "
            r0.append(r7)
            java.lang.String r7 = "RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.arch.p011c.p014b.C0148h.mo207a(android.arch.c.a.b, int, int):void");
    }

    public C0148h(C0127a aVar, C0149a aVar2, String str, String str2) {
        super(aVar2.f374a);
        this.f370b = aVar;
        this.f371c = aVar2;
        this.f372d = str;
        this.f373e = str2;
    }
}
