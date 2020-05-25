package androidx.work.impl.p056b;

import android.arch.p011c.p012a.C0125e;
import android.arch.p011c.p012a.C0126f;
import android.arch.p011c.p014b.C0136c;
import android.arch.p011c.p014b.C0142f;
import android.arch.p011c.p014b.C0150i;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.b.l */
public final class C1598l implements C1597k {

    /* renamed from: a */
    private final C0142f f5639a;

    /* renamed from: b */
    private final C0136c f5640b;

    public C1598l(C0142f fVar) {
        this.f5639a = fVar;
        this.f5640b = new C0136c<C1596j>(fVar) {
            /* renamed from: a */
            public final String mo216a() {
                return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo231a(C0126f fVar, Object obj) {
                C1596j jVar = (C1596j) obj;
                if (jVar.f5637a == null) {
                    fVar.mo198a(1);
                } else {
                    fVar.mo201a(1, jVar.f5637a);
                }
                if (jVar.f5638b == null) {
                    fVar.mo198a(2);
                } else {
                    fVar.mo201a(2, jVar.f5638b);
                }
            }
        };
    }

    /* renamed from: a */
    public final List<String> mo6001a(String str) {
        C0150i a = C0150i.m334a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            a.mo198a(1);
        } else {
            a.mo201a(1, str);
        }
        Cursor a2 = this.f5639a.mo241a((C0125e) a);
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
