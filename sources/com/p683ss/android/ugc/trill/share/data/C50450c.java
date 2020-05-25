package com.p683ss.android.ugc.trill.share.data;

import android.arch.p011c.p012a.C0125e;
import android.arch.p011c.p012a.C0126f;
import android.arch.p011c.p014b.C0136c;
import android.arch.p011c.p014b.C0142f;
import android.arch.p011c.p014b.C0150i;
import android.arch.p011c.p014b.C0151j;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.trill.share.data.c */
public final class C50450c implements C50449b {

    /* renamed from: a */
    private final C0142f f126504a;

    /* renamed from: b */
    private final C0136c f126505b;

    /* renamed from: c */
    private final C0151j f126506c;

    public C50450c(C0142f fVar) {
        this.f126504a = fVar;
        this.f126505b = new C0136c<C50448a>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "INSERT OR ABORT INTO `Record`(`rid`,`time`,`channel`,`share_type`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* renamed from: a */
            public final /* synthetic */ void mo231a(C0126f fVar, Object obj) {
                C50448a aVar = (C50448a) obj;
                fVar.mo200a(1, (long) aVar.f126500a);
                if (aVar.f126501b == null) {
                    fVar.mo198a(2);
                } else {
                    fVar.mo200a(2, aVar.f126501b.longValue());
                }
                if (aVar.f126502c == null) {
                    fVar.mo198a(3);
                } else {
                    fVar.mo201a(3, aVar.f126502c);
                }
                if (aVar.f126503d == null) {
                    fVar.mo198a(4);
                } else {
                    fVar.mo200a(4, (long) aVar.f126503d.intValue());
                }
            }
        };
        this.f126506c = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "DELETE FROM record WHERE rid = ?";
            }
        };
    }

    /* renamed from: a */
    public final void mo98362a(C50448a aVar) {
        this.f126504a.mo246c();
        try {
            this.f126505b.mo233a(aVar);
            this.f126504a.mo248e();
        } finally {
            this.f126504a.mo247d();
        }
    }

    /* renamed from: b */
    public final void mo98363b(Integer num) {
        C0126f b = this.f126506c.mo264b();
        this.f126504a.mo246c();
        if (num == null) {
            try {
                b.mo198a(1);
            } catch (Throwable th) {
                this.f126504a.mo247d();
                this.f126506c.mo263a(b);
                throw th;
            }
        } else {
            b.mo200a(1, (long) num.intValue());
        }
        b.mo204a();
        this.f126504a.mo248e();
        this.f126504a.mo247d();
        this.f126506c.mo263a(b);
    }

    /* renamed from: c */
    public final long mo98364c(Integer num) {
        long j;
        C0150i a = C0150i.m334a("SELECT count(*) FROM record WHERE share_type = ?", 1);
        if (num == null) {
            a.mo198a(1);
        } else {
            a.mo200a(1, (long) num.intValue());
        }
        Cursor a2 = this.f126504a.mo241a((C0125e) a);
        try {
            if (a2.moveToFirst()) {
                j = a2.getLong(0);
            } else {
                j = 0;
            }
            return j;
        } finally {
            a2.close();
            a.mo261b();
        }
    }

    /* renamed from: a */
    public final List<C50448a> mo98360a(Integer num) {
        Long l;
        C0150i a = C0150i.m334a("SELECT * FROM record where share_type = ? order by time desc limit 10", 1);
        if (num == null) {
            a.mo198a(1);
        } else {
            a.mo200a(1, (long) num.intValue());
        }
        Cursor a2 = this.f126504a.mo241a((C0125e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("rid");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("time");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("channel");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("share_type");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C50448a aVar = new C50448a();
                aVar.f126500a = a2.getInt(columnIndexOrThrow);
                Integer num2 = null;
                if (a2.isNull(columnIndexOrThrow2)) {
                    l = null;
                } else {
                    l = Long.valueOf(a2.getLong(columnIndexOrThrow2));
                }
                aVar.f126501b = l;
                aVar.f126502c = a2.getString(columnIndexOrThrow3);
                if (!a2.isNull(columnIndexOrThrow4)) {
                    num2 = Integer.valueOf(a2.getInt(columnIndexOrThrow4));
                }
                aVar.f126503d = num2;
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo261b();
        }
    }

    /* renamed from: a */
    public final List<C50448a> mo98361a(Integer num, Integer num2) {
        Long l;
        C0150i a = C0150i.m334a("SELECT * FROM record where share_type = ? order by time desc limit ?", 2);
        if (num == null) {
            a.mo198a(1);
        } else {
            a.mo200a(1, (long) num.intValue());
        }
        if (num2 == null) {
            a.mo198a(2);
        } else {
            a.mo200a(2, (long) num2.intValue());
        }
        Cursor a2 = this.f126504a.mo241a((C0125e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("rid");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("time");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("channel");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("share_type");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C50448a aVar = new C50448a();
                aVar.f126500a = a2.getInt(columnIndexOrThrow);
                Integer num3 = null;
                if (a2.isNull(columnIndexOrThrow2)) {
                    l = null;
                } else {
                    l = Long.valueOf(a2.getLong(columnIndexOrThrow2));
                }
                aVar.f126501b = l;
                aVar.f126502c = a2.getString(columnIndexOrThrow3);
                if (!a2.isNull(columnIndexOrThrow4)) {
                    num3 = Integer.valueOf(a2.getInt(columnIndexOrThrow4));
                }
                aVar.f126503d = num3;
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo261b();
        }
    }
}
