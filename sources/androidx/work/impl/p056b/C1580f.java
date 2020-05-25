package androidx.work.impl.p056b;

import android.arch.p011c.p012a.C0125e;
import android.arch.p011c.p012a.C0126f;
import android.arch.p011c.p014b.C0136c;
import android.arch.p011c.p014b.C0142f;
import android.arch.p011c.p014b.C0150i;
import android.arch.p011c.p014b.C0151j;
import android.database.Cursor;

/* renamed from: androidx.work.impl.b.f */
public final class C1580f implements C1579e {

    /* renamed from: a */
    private final C0142f f5596a;

    /* renamed from: b */
    private final C0136c f5597b;

    /* renamed from: c */
    private final C0151j f5598c;

    public C1580f(C0142f fVar) {
        this.f5596a = fVar;
        this.f5597b = new C0136c<C1578d>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo231a(C0126f fVar, Object obj) {
                C1578d dVar = (C1578d) obj;
                if (dVar.f5594a == null) {
                    fVar.mo198a(1);
                } else {
                    fVar.mo201a(1, dVar.f5594a);
                }
                fVar.mo200a(2, (long) dVar.f5595b);
            }
        };
        this.f5598c = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }

    /* renamed from: a */
    public final void mo5980a(C1578d dVar) {
        this.f5596a.mo246c();
        try {
            this.f5597b.mo233a(dVar);
            this.f5596a.mo248e();
        } finally {
            this.f5596a.mo247d();
        }
    }

    /* renamed from: b */
    public final void mo5981b(String str) {
        C0126f b = this.f5598c.mo264b();
        this.f5596a.mo246c();
        if (str == null) {
            try {
                b.mo198a(1);
            } catch (Throwable th) {
                this.f5596a.mo247d();
                this.f5598c.mo263a(b);
                throw th;
            }
        } else {
            b.mo201a(1, str);
        }
        b.mo204a();
        this.f5596a.mo248e();
        this.f5596a.mo247d();
        this.f5598c.mo263a(b);
    }

    /* renamed from: a */
    public final C1578d mo5979a(String str) {
        C1578d dVar;
        C0150i a = C0150i.m334a("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            a.mo198a(1);
        } else {
            a.mo201a(1, str);
        }
        Cursor a2 = this.f5596a.mo241a((C0125e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("work_spec_id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("system_id");
            if (a2.moveToFirst()) {
                dVar = new C1578d(a2.getString(columnIndexOrThrow), a2.getInt(columnIndexOrThrow2));
            } else {
                dVar = null;
            }
            return dVar;
        } finally {
            a2.close();
            a.mo261b();
        }
    }
}
