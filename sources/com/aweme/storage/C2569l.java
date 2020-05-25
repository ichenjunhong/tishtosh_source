package com.aweme.storage;

import android.arch.p011c.p012a.C0125e;
import android.arch.p011c.p012a.C0126f;
import android.arch.p011c.p014b.C0129b;
import android.arch.p011c.p014b.C0136c;
import android.arch.p011c.p014b.C0142f;
import android.arch.p011c.p014b.C0150i;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.aweme.storage.l */
public final class C2569l implements C2568k {

    /* renamed from: a */
    private final C0142f f7964a;

    /* renamed from: b */
    private final C0136c f7965b;

    /* renamed from: c */
    private final C0129b f7966c;

    /* renamed from: d */
    private final C0129b f7967d;

    /* renamed from: a */
    public final List<C2575n> mo7077a() {
        C0150i a = C0150i.m334a("select * from black_tb", 0);
        Cursor a2 = this.f7964a.mo241a((C0125e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow(LeakCanaryFileProvider.f132050j);
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("size");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("date");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("count");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C2575n nVar = new C2575n(a2.getString(columnIndexOrThrow2), a2.getLong(columnIndexOrThrow4), a2.getInt(columnIndexOrThrow5));
                nVar.f7972a = a2.getInt(columnIndexOrThrow);
                nVar.f7974c = a2.getLong(columnIndexOrThrow3);
                arrayList.add(nVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo261b();
        }
    }

    public C2569l(C0142f fVar) {
        this.f7964a = fVar;
        this.f7965b = new C0136c<C2575n>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "INSERT OR ROLLBACK INTO `black_tb`(`id`,`path`,`size`,`date`,`count`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo231a(C0126f fVar, Object obj) {
                C2575n nVar = (C2575n) obj;
                fVar.mo200a(1, (long) nVar.f7972a);
                if (nVar.f7973b == null) {
                    fVar.mo198a(2);
                } else {
                    fVar.mo201a(2, nVar.f7973b);
                }
                fVar.mo200a(3, nVar.f7974c);
                fVar.mo200a(4, nVar.f7975d);
                fVar.mo200a(5, (long) nVar.f7976e);
            }
        };
        this.f7966c = new C0129b<C2575n>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "DELETE FROM `black_tb` WHERE `id` = ?";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo217a(C0126f fVar, Object obj) {
                fVar.mo200a(1, (long) ((C2575n) obj).f7972a);
            }
        };
        this.f7967d = new C0129b<C2575n>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "UPDATE OR REPLACE `black_tb` SET `id` = ?,`path` = ?,`size` = ?,`date` = ?,`count` = ? WHERE `id` = ?";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo217a(C0126f fVar, Object obj) {
                C2575n nVar = (C2575n) obj;
                fVar.mo200a(1, (long) nVar.f7972a);
                if (nVar.f7973b == null) {
                    fVar.mo198a(2);
                } else {
                    fVar.mo201a(2, nVar.f7973b);
                }
                fVar.mo200a(3, nVar.f7974c);
                fVar.mo200a(4, nVar.f7975d);
                fVar.mo200a(5, (long) nVar.f7976e);
                fVar.mo200a(6, (long) nVar.f7972a);
            }
        };
    }

    /* renamed from: a */
    public final void mo7078a(C2575n... nVarArr) {
        this.f7964a.mo246c();
        try {
            this.f7965b.mo234a((T[]) nVarArr);
            this.f7964a.mo248e();
        } finally {
            this.f7964a.mo247d();
        }
    }

    /* renamed from: b */
    public final void mo7079b(C2575n... nVarArr) {
        this.f7964a.mo246c();
        try {
            this.f7966c.mo215a((T[]) nVarArr);
            this.f7964a.mo248e();
        } finally {
            this.f7964a.mo247d();
        }
    }
}
