package com.bytedance.android.livesdk.i18n.p384db;

import android.arch.p011c.p012a.C0125e;
import android.arch.p011c.p012a.C0126f;
import android.arch.p011c.p014b.C0136c;
import android.arch.p011c.p014b.C0142f;
import android.arch.p011c.p014b.C0150i;
import android.arch.p011c.p014b.C0151j;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.i18n.db.f */
public final class C7690f implements C7689e {

    /* renamed from: a */
    private final C0142f f21181a;

    /* renamed from: b */
    private final C0136c f21182b;

    /* renamed from: c */
    private final C0151j f21183c;

    /* renamed from: b */
    public final void mo14050b() {
        C0126f b = this.f21183c.mo264b();
        this.f21181a.mo246c();
        try {
            b.mo204a();
            this.f21181a.mo248e();
        } finally {
            this.f21181a.mo247d();
            this.f21183c.mo263a(b);
        }
    }

    /* renamed from: a */
    public final List<C7688d> mo14048a() {
        C0150i a = C0150i.m334a("SELECT * FROM translation", 0);
        Cursor a2 = this.f21181a.mo241a((C0125e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("key");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("value");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C7688d dVar = new C7688d();
                dVar.f21179a = a2.getString(columnIndexOrThrow);
                dVar.f21180b = a2.getString(columnIndexOrThrow2);
                arrayList.add(dVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo261b();
        }
    }

    public C7690f(C0142f fVar) {
        this.f21181a = fVar;
        this.f21182b = new C0136c<C7688d>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "INSERT OR REPLACE INTO `translation`(`key`,`value`) VALUES (?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo231a(C0126f fVar, Object obj) {
                C7688d dVar = (C7688d) obj;
                if (dVar.f21179a == null) {
                    fVar.mo198a(1);
                } else {
                    fVar.mo201a(1, dVar.f21179a);
                }
                if (dVar.f21180b == null) {
                    fVar.mo198a(2);
                } else {
                    fVar.mo201a(2, dVar.f21180b);
                }
            }
        };
        this.f21183c = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "DELETE FROM translation";
            }
        };
    }

    /* renamed from: a */
    public final void mo14049a(List<C7688d> list) {
        this.f21181a.mo246c();
        try {
            this.f21182b.mo232a((Iterable<T>) list);
            this.f21181a.mo248e();
        } finally {
            this.f21181a.mo247d();
        }
    }
}
