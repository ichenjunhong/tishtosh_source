package com.p683ss.android.ugc.aweme.runtime.behavior;

import android.arch.p011c.p012a.C0125e;
import android.arch.p011c.p012a.C0126f;
import android.arch.p011c.p014b.C0136c;
import android.arch.p011c.p014b.C0142f;
import android.arch.p011c.p014b.C0150i;
import android.arch.p011c.p014b.C0151j;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.runtime.behavior.b */
public final class C41315b implements C41314a {

    /* renamed from: a */
    private final C0142f f104772a;

    /* renamed from: b */
    private final C0136c f104773b;

    /* renamed from: c */
    private final C0151j f104774c;

    /* renamed from: d */
    private final C0151j f104775d;

    public C41315b(C0142f fVar) {
        this.f104772a = fVar;
        this.f104773b = new C0136c<C41319c>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "INSERT OR ABORT INTO `runtimeBehaviorEntity`(`id`,`type`,`time`,`msg`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo231a(C0126f fVar, Object obj) {
                C41319c cVar = (C41319c) obj;
                fVar.mo200a(1, (long) cVar.f104779a);
                if (cVar.f104780b == null) {
                    fVar.mo198a(2);
                } else {
                    fVar.mo201a(2, cVar.f104780b);
                }
                fVar.mo200a(3, cVar.f104781c);
                if (cVar.f104782d == null) {
                    fVar.mo198a(4);
                } else {
                    fVar.mo201a(4, cVar.f104782d);
                }
            }
        };
        this.f104774c = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "DELETE FROM runtimeBehaviorEntity where type = ? and time < ?";
            }
        };
        this.f104775d = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "DELETE FROM runtimeBehaviorEntity";
            }
        };
    }

    /* renamed from: a */
    public final void mo83874a(C41319c cVar) {
        this.f104772a.mo246c();
        try {
            this.f104773b.mo233a(cVar);
            this.f104772a.mo248e();
        } finally {
            this.f104772a.mo247d();
        }
    }

    /* renamed from: b */
    public final void mo83875b(String str, long j) {
        C0126f b = this.f104774c.mo264b();
        this.f104772a.mo246c();
        if (str == null) {
            try {
                b.mo198a(1);
            } catch (Throwable th) {
                this.f104772a.mo247d();
                this.f104774c.mo263a(b);
                throw th;
            }
        } else {
            b.mo201a(1, str);
        }
        b.mo200a(2, j);
        b.mo204a();
        this.f104772a.mo248e();
        this.f104772a.mo247d();
        this.f104774c.mo263a(b);
    }

    /* renamed from: a */
    public final List<C41319c> mo83873a(String str, long j) {
        C0150i a = C0150i.m334a("SELECT * FROM runtimeBehaviorEntity where type = ?  and time > ?", 2);
        if (str == null) {
            a.mo198a(1);
        } else {
            a.mo201a(1, str);
        }
        a.mo200a(2, j);
        Cursor a2 = this.f104772a.mo241a((C0125e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("type");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("time");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("msg");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C41319c cVar = new C41319c();
                cVar.f104779a = a2.getInt(columnIndexOrThrow);
                String string = a2.getString(columnIndexOrThrow2);
                C52711k.m112240b(string, "<set-?>");
                cVar.f104780b = string;
                cVar.f104781c = a2.getLong(columnIndexOrThrow3);
                String string2 = a2.getString(columnIndexOrThrow4);
                C52711k.m112240b(string2, "<set-?>");
                cVar.f104782d = string2;
                arrayList.add(cVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo261b();
        }
    }
}
