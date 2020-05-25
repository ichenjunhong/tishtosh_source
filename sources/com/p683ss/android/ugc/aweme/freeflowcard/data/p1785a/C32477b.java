package com.p683ss.android.ugc.aweme.freeflowcard.data.p1785a;

import android.arch.p011c.p012a.C0125e;
import android.arch.p011c.p012a.C0126f;
import android.arch.p011c.p014b.C0136c;
import android.arch.p011c.p014b.C0142f;
import android.arch.p011c.p014b.C0150i;
import android.arch.p011c.p014b.C0151j;
import android.database.Cursor;
import com.p683ss.android.ugc.aweme.freeflowcard.data.p1786b.C32488a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.a.b */
public final class C32477b extends C32476a {

    /* renamed from: a */
    private final C0142f f84565a;

    /* renamed from: b */
    private final C0136c f84566b;

    /* renamed from: c */
    private final C0151j f84567c;

    /* renamed from: a */
    public final void mo65797a() {
        C0126f b = this.f84567c.mo264b();
        this.f84565a.mo246c();
        try {
            b.mo204a();
            this.f84565a.mo248e();
        } finally {
            this.f84565a.mo247d();
            this.f84567c.mo263a(b);
        }
    }

    public C32477b(C0142f fVar) {
        this.f84565a = fVar;
        this.f84566b = new C0136c<C32488a>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "INSERT OR ABORT INTO `tb_app_start_mode`(`id`,`time`,`start_mode`) VALUES (nullif(?, 0),?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo231a(C0126f fVar, Object obj) {
                C32488a aVar = (C32488a) obj;
                fVar.mo200a(1, (long) aVar.f84580id);
                fVar.mo200a(2, aVar.time);
                fVar.mo200a(3, (long) aVar.mode);
            }
        };
        this.f84567c = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "delete from tb_app_start_mode";
            }
        };
    }

    /* renamed from: a */
    public final List<C32488a> mo65795a(long j, long j2) {
        C0150i a = C0150i.m334a("select * from tb_app_start_mode where time between ? and ?", 2);
        a.mo200a(1, j);
        a.mo200a(2, j2);
        Cursor a2 = this.f84565a.mo241a((C0125e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("time");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("start_mode");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C32488a aVar = new C32488a();
                aVar.f84580id = a2.getInt(columnIndexOrThrow);
                aVar.time = a2.getLong(columnIndexOrThrow2);
                aVar.mode = a2.getInt(columnIndexOrThrow3);
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo261b();
        }
    }

    /* renamed from: a */
    public final List<C32488a> mo65796a(long j, long j2, int i) {
        C0150i a = C0150i.m334a("select * from tb_app_start_mode where start_mode=? and time between ? and ?", 3);
        a.mo200a(1, (long) i);
        a.mo200a(2, j);
        a.mo200a(3, j2);
        Cursor a2 = this.f84565a.mo241a((C0125e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("time");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("start_mode");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C32488a aVar = new C32488a();
                aVar.f84580id = a2.getInt(columnIndexOrThrow);
                aVar.time = a2.getLong(columnIndexOrThrow2);
                aVar.mode = a2.getInt(columnIndexOrThrow3);
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo261b();
        }
    }
}
