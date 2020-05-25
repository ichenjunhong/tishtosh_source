package com.bytedance.android.livesdk.i18n.p384db;

import android.arch.p011c.p012a.C0125e;
import android.arch.p011c.p012a.C0126f;
import android.arch.p011c.p014b.C0136c;
import android.arch.p011c.p014b.C0142f;
import android.arch.p011c.p014b.C0150i;
import android.database.Cursor;

/* renamed from: com.bytedance.android.livesdk.i18n.db.c */
public final class C7686c implements C7685b {

    /* renamed from: a */
    private final C0142f f21176a;

    /* renamed from: b */
    private final C0136c f21177b;

    public C7686c(C0142f fVar) {
        this.f21176a = fVar;
        this.f21177b = new C0136c<C7684a>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "INSERT OR REPLACE INTO `information`(`key`,`value`) VALUES (?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo231a(C0126f fVar, Object obj) {
                C7684a aVar = (C7684a) obj;
                if (aVar.f21174a == null) {
                    fVar.mo198a(1);
                } else {
                    fVar.mo201a(1, aVar.f21174a);
                }
                if (aVar.f21175b == null) {
                    fVar.mo198a(2);
                } else {
                    fVar.mo201a(2, aVar.f21175b);
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo14047a(C7684a aVar) {
        this.f21176a.mo246c();
        try {
            this.f21177b.mo233a(aVar);
            this.f21176a.mo248e();
        } finally {
            this.f21176a.mo247d();
        }
    }

    /* renamed from: a */
    public final C7684a mo14046a(String str) {
        C7684a aVar;
        C0150i a = C0150i.m334a("SELECT * FROM information WHERE `key` = ?", 1);
        a.mo201a(1, str);
        Cursor a2 = this.f21176a.mo241a((C0125e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("key");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("value");
            if (a2.moveToFirst()) {
                aVar = new C7684a();
                aVar.f21174a = a2.getString(columnIndexOrThrow);
                aVar.f21175b = a2.getString(columnIndexOrThrow2);
            } else {
                aVar = null;
            }
            return aVar;
        } finally {
            a2.close();
            a.mo261b();
        }
    }
}
