package androidx.work.impl.p056b;

import android.arch.p011c.p012a.C0125e;
import android.arch.p011c.p012a.C0126f;
import android.arch.p011c.p014b.C0136c;
import android.arch.p011c.p014b.C0142f;
import android.arch.p011c.p014b.C0150i;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.b.c */
public final class C1576c implements C1575b {

    /* renamed from: a */
    private final C0142f f5591a;

    /* renamed from: b */
    private final C0136c f5592b;

    public C1576c(C0142f fVar) {
        this.f5591a = fVar;
        this.f5592b = new C0136c<C1574a>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo231a(C0126f fVar, Object obj) {
                C1574a aVar = (C1574a) obj;
                if (aVar.f5589a == null) {
                    fVar.mo198a(1);
                } else {
                    fVar.mo201a(1, aVar.f5589a);
                }
                if (aVar.f5590b == null) {
                    fVar.mo198a(2);
                } else {
                    fVar.mo201a(2, aVar.f5590b);
                }
            }
        };
    }

    /* renamed from: a */
    public final boolean mo5975a(String str) {
        C0150i a = C0150i.m334a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            a.mo198a(1);
        } else {
            a.mo201a(1, str);
        }
        Cursor a2 = this.f5591a.mo241a((C0125e) a);
        try {
            boolean z = false;
            if (a2.moveToFirst() && a2.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            a2.close();
            a.mo261b();
        }
    }

    /* renamed from: b */
    public final List<String> mo5976b(String str) {
        C0150i a = C0150i.m334a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a.mo198a(1);
        } else {
            a.mo201a(1, str);
        }
        Cursor a2 = this.f5591a.mo241a((C0125e) a);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo261b();
        }
    }
}
