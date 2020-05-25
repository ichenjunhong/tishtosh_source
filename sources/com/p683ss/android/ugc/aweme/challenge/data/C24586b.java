package com.p683ss.android.ugc.aweme.challenge.data;

import android.arch.p011c.p012a.C0125e;
import android.arch.p011c.p012a.C0126f;
import android.arch.p011c.p014b.C0129b;
import android.arch.p011c.p014b.C0136c;
import android.arch.p011c.p014b.C0142f;
import android.arch.p011c.p014b.C0150i;
import android.arch.p011c.p014b.C0151j;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.challenge.data.b */
public final class C24586b implements C24585a {

    /* renamed from: a */
    private final C0142f f65049a;

    /* renamed from: b */
    private final C0136c f65050b;

    /* renamed from: c */
    private final C0129b f65051c;

    /* renamed from: d */
    private final C0151j f65052d;

    /* renamed from: b */
    public final int mo50355b() {
        int i = 0;
        C0150i a = C0150i.m334a("SELECT count(*) FROM localHashTag", 0);
        Cursor a2 = this.f65049a.mo241a((C0125e) a);
        try {
            if (a2.moveToFirst()) {
                i = a2.getInt(0);
            }
            return i;
        } finally {
            a2.close();
            a.mo261b();
        }
    }

    /* renamed from: a */
    public final List<C24590c> mo50352a() {
        Long l;
        C0150i a = C0150i.m334a("SELECT * FROM localHashTag order by time desc", 0);
        Cursor a2 = this.f65049a.mo241a((C0125e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow(LeakCanaryFileProvider.f132049i);
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("time");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C24590c cVar = new C24590c();
                cVar.f65056a = a2.getString(columnIndexOrThrow);
                if (a2.isNull(columnIndexOrThrow2)) {
                    l = null;
                } else {
                    l = Long.valueOf(a2.getLong(columnIndexOrThrow2));
                }
                cVar.f65057b = l;
                arrayList.add(cVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo261b();
        }
    }

    public C24586b(C0142f fVar) {
        this.f65049a = fVar;
        this.f65050b = new C0136c<C24590c>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "INSERT OR FAIL INTO `localHashTag`(`name`,`time`) VALUES (?,?)";
            }

            /* renamed from: a */
            public final /* synthetic */ void mo231a(C0126f fVar, Object obj) {
                C24590c cVar = (C24590c) obj;
                if (cVar.f65056a == null) {
                    fVar.mo198a(1);
                } else {
                    fVar.mo201a(1, cVar.f65056a);
                }
                if (cVar.f65057b == null) {
                    fVar.mo198a(2);
                } else {
                    fVar.mo200a(2, cVar.f65057b.longValue());
                }
            }
        };
        this.f65051c = new C0129b<C24590c>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "UPDATE OR FAIL `localHashTag` SET `name` = ?,`time` = ? WHERE `name` = ?";
            }

            /* renamed from: a */
            public final /* synthetic */ void mo217a(C0126f fVar, Object obj) {
                C24590c cVar = (C24590c) obj;
                if (cVar.f65056a == null) {
                    fVar.mo198a(1);
                } else {
                    fVar.mo201a(1, cVar.f65056a);
                }
                if (cVar.f65057b == null) {
                    fVar.mo198a(2);
                } else {
                    fVar.mo200a(2, cVar.f65057b.longValue());
                }
                if (cVar.f65056a == null) {
                    fVar.mo198a(3);
                } else {
                    fVar.mo201a(3, cVar.f65056a);
                }
            }
        };
        this.f65052d = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "DELETE FROM localHashTag WHERE time in(SELECT time FROM localHashTag ORDER BY time ASC LIMIT ?)";
            }
        };
    }

    /* renamed from: a */
    public final void mo50354a(C24590c cVar) {
        this.f65049a.mo246c();
        try {
            this.f65050b.mo233a(cVar);
            this.f65049a.mo248e();
        } finally {
            this.f65049a.mo247d();
        }
    }

    /* renamed from: b */
    public final void mo50356b(C24590c cVar) {
        this.f65049a.mo246c();
        try {
            this.f65051c.mo214a(cVar);
            this.f65049a.mo248e();
        } finally {
            this.f65049a.mo247d();
        }
    }

    /* renamed from: a */
    public final void mo50353a(int i) {
        C0126f b = this.f65052d.mo264b();
        this.f65049a.mo246c();
        try {
            b.mo200a(1, (long) i);
            b.mo204a();
            this.f65049a.mo248e();
        } finally {
            this.f65049a.mo247d();
            this.f65052d.mo263a(b);
        }
    }
}
