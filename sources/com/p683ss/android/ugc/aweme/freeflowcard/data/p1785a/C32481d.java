package com.p683ss.android.ugc.aweme.freeflowcard.data.p1785a;

import android.arch.p011c.p012a.C0125e;
import android.arch.p011c.p012a.C0126f;
import android.arch.p011c.p014b.C0136c;
import android.arch.p011c.p014b.C0142f;
import android.arch.p011c.p014b.C0150i;
import android.arch.p011c.p014b.C0151j;
import android.database.Cursor;
import com.p683ss.android.ugc.aweme.freeflowcard.data.p1786b.C32489b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.a.d */
public final class C32481d extends C32480c {

    /* renamed from: a */
    private final C0142f f84570a;

    /* renamed from: b */
    private final C0136c f84571b;

    /* renamed from: c */
    private final C0151j f84572c;

    /* renamed from: b */
    public final void mo65800b() {
        C0126f b = this.f84572c.mo264b();
        this.f84570a.mo246c();
        try {
            b.mo204a();
            this.f84570a.mo248e();
        } finally {
            this.f84570a.mo247d();
            this.f84572c.mo263a(b);
        }
    }

    /* renamed from: a */
    public final List<C32489b> mo65798a() {
        boolean z;
        boolean z2;
        C0150i a = C0150i.m334a("select * from tb_auto_play_setting", 0);
        Cursor a2 = this.f84570a.mo241a((C0125e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("is_open");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("change_type");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("reset_time");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("monthly_state");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("day_open");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("day_open_reset_time");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                if (a2.getInt(columnIndexOrThrow2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i = a2.getInt(columnIndexOrThrow3);
                long j = a2.getLong(columnIndexOrThrow4);
                int i2 = a2.getInt(columnIndexOrThrow5);
                if (a2.getInt(columnIndexOrThrow6) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C32489b bVar = new C32489b(z, i, j, i2, z2, a2.getLong(columnIndexOrThrow7));
                bVar.f84581id = a2.getInt(columnIndexOrThrow);
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo261b();
        }
    }

    public C32481d(C0142f fVar) {
        this.f84570a = fVar;
        this.f84571b = new C0136c<C32489b>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "INSERT OR ABORT INTO `tb_auto_play_setting`(`id`,`is_open`,`change_type`,`reset_time`,`monthly_state`,`day_open`,`day_open_reset_time`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo231a(C0126f fVar, Object obj) {
                C32489b bVar = (C32489b) obj;
                fVar.mo200a(1, (long) bVar.f84581id);
                fVar.mo200a(2, bVar.isOpen ? 1 : 0);
                fVar.mo200a(3, (long) bVar.changeType);
                fVar.mo200a(4, bVar.resetTime);
                fVar.mo200a(5, (long) bVar.monthlyState);
                fVar.mo200a(6, bVar.isDayOpen ? 1 : 0);
                fVar.mo200a(7, bVar.dayOpenResetTime);
            }
        };
        this.f84572c = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "delete from tb_auto_play_setting";
            }
        };
    }

    /* renamed from: a */
    public final void mo65799a(C32489b bVar) {
        this.f84570a.mo246c();
        try {
            this.f84571b.mo233a(bVar);
            this.f84570a.mo248e();
        } finally {
            this.f84570a.mo247d();
        }
    }
}
