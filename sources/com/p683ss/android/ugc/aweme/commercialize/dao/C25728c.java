package com.p683ss.android.ugc.aweme.commercialize.dao;

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

/* renamed from: com.ss.android.ugc.aweme.commercialize.dao.c */
public final class C25728c implements C25727b {

    /* renamed from: a */
    private final C0142f f68043a;

    /* renamed from: b */
    private final C0136c f68044b;

    /* renamed from: c */
    private final C0129b f68045c;

    /* renamed from: d */
    private final C0151j f68046d;

    /* renamed from: a */
    public final void mo52920a() {
        C0126f b = this.f68046d.mo264b();
        this.f68043a.mo246c();
        try {
            b.mo204a();
            this.f68043a.mo248e();
        } finally {
            this.f68043a.mo247d();
            this.f68046d.mo263a(b);
        }
    }

    public C25728c(C0142f fVar) {
        this.f68043a = fVar;
        this.f68044b = new C0136c<C25726a>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "INSERT OR ABORT INTO `showAd`(`awemeId`) VALUES (?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo231a(C0126f fVar, Object obj) {
                C25726a aVar = (C25726a) obj;
                if (aVar.f68042a == null) {
                    fVar.mo198a(1);
                } else {
                    fVar.mo201a(1, aVar.f68042a);
                }
            }
        };
        this.f68045c = new C0129b<C25726a>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "DELETE FROM `showAd` WHERE `awemeId` = ?";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo217a(C0126f fVar, Object obj) {
                C25726a aVar = (C25726a) obj;
                if (aVar.f68042a == null) {
                    fVar.mo198a(1);
                } else {
                    fVar.mo201a(1, aVar.f68042a);
                }
            }
        };
        this.f68046d = new C0151j(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "delete from showAd";
            }
        };
    }

    /* renamed from: a */
    public final void mo52921a(C25726a aVar) {
        this.f68043a.mo246c();
        try {
            this.f68044b.mo233a(aVar);
            this.f68043a.mo248e();
        } finally {
            this.f68043a.mo247d();
        }
    }

    /* renamed from: a */
    public final List<C25726a> mo52919a(String str) {
        C0150i a = C0150i.m334a("SELECT * FROM showAd where awemeId = ?", 1);
        if (str == null) {
            a.mo198a(1);
        } else {
            a.mo201a(1, str);
        }
        Cursor a2 = this.f68043a.mo241a((C0125e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("awemeId");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(new C25726a(a2.getString(columnIndexOrThrow)));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo261b();
        }
    }
}
