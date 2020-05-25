package com.p683ss.android.ugc.aweme.history.dao;

import android.arch.p011c.p012a.C0118b;
import android.arch.p011c.p012a.C0119c;
import android.arch.p011c.p012a.C0119c.C0120a;
import android.arch.p011c.p012a.C0119c.C0121b;
import android.arch.p011c.p014b.C0127a;
import android.arch.p011c.p014b.C0137d;
import android.arch.p011c.p014b.C0142f.C0144b;
import android.arch.p011c.p014b.C0148h;
import android.arch.p011c.p014b.C0148h.C0149a;
import android.arch.p011c.p014b.p016b.C0131b;
import android.arch.p011c.p014b.p016b.C0131b.C0132a;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.ss.android.ugc.aweme.history.dao.HistoryDataBase_Impl */
public class HistoryDataBase_Impl extends HistoryDataBase {
    /* renamed from: a */
    public final C0137d mo240a() {
        return new C0137d(this, "historyEntity");
    }

    /* renamed from: b */
    public final C0119c mo244b(C0127a aVar) {
        return aVar.f294a.mo197a(C0121b.m264a(aVar.f295b).mo211a(aVar.f296c).mo210a((C0120a) new C0148h(aVar, new C0149a(1) {
            /* renamed from: a */
            public final void mo256a(C0118b bVar) {
                bVar.mo180c("DROP TABLE IF EXISTS `historyEntity`");
            }

            /* renamed from: b */
            public final void mo257b(C0118b bVar) {
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `historyEntity` (`viewDate` TEXT NOT NULL, `viewTime` INTEGER NOT NULL, `awemeId` TEXT NOT NULL, PRIMARY KEY(`awemeId`))");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo180c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"367b0c8487a9548c2459257784bcde1d\")");
            }

            /* renamed from: d */
            public final void mo259d(C0118b bVar) {
                if (HistoryDataBase_Impl.this.f354e != null) {
                    int size = HistoryDataBase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        HistoryDataBase_Impl.this.f354e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo258c(C0118b bVar) {
                HistoryDataBase_Impl.this.f350a = bVar;
                HistoryDataBase_Impl.this.mo242a(bVar);
                if (HistoryDataBase_Impl.this.f354e != null) {
                    int size = HistoryDataBase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) HistoryDataBase_Impl.this.f354e.get(i)).mo253a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo260e(C0118b bVar) {
                HashMap hashMap = new HashMap(3);
                hashMap.put("viewDate", new C0132a("viewDate", "TEXT", true, 0));
                hashMap.put("viewTime", new C0132a("viewTime", "INTEGER", true, 0));
                hashMap.put("awemeId", new C0132a("awemeId", "TEXT", true, 1));
                C0131b bVar2 = new C0131b("historyEntity", hashMap, new HashSet(0), new HashSet(0));
                C0131b a = C0131b.m285a(bVar, "historyEntity");
                if (!bVar2.equals(a)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle historyEntity(com.ss.android.ugc.aweme.history.dao.HistoryEntity).\n Expected:\n");
                    sb.append(bVar2);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "367b0c8487a9548c2459257784bcde1d", "7fc469ceab793adfa6ce3120fd80e34d")).mo212a());
    }
}
