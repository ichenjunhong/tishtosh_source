package com.p683ss.android.ugc.trill.share.data;

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

/* renamed from: com.ss.android.ugc.trill.share.data.ShareDatabase_Impl */
public class ShareDatabase_Impl extends ShareDatabase {

    /* renamed from: g */
    private volatile C50449b f126498g;

    /* renamed from: a */
    public final C0137d mo240a() {
        return new C0137d(this, "Record");
    }

    /* renamed from: g */
    public final C50449b mo98359g() {
        C50449b bVar;
        if (this.f126498g != null) {
            return this.f126498g;
        }
        synchronized (this) {
            if (this.f126498g == null) {
                this.f126498g = new C50450c(this);
            }
            bVar = this.f126498g;
        }
        return bVar;
    }

    /* renamed from: b */
    public final C0119c mo244b(C0127a aVar) {
        return aVar.f294a.mo197a(C0121b.m264a(aVar.f295b).mo211a(aVar.f296c).mo210a((C0120a) new C0148h(aVar, new C0149a(3) {
            /* renamed from: a */
            public final void mo256a(C0118b bVar) {
                bVar.mo180c("DROP TABLE IF EXISTS `Record`");
            }

            /* renamed from: b */
            public final void mo257b(C0118b bVar) {
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `Record` (`rid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER, `channel` TEXT, `share_type` INTEGER)");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo180c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"4e670bbb58b1cec9bfaaeb409ecedc0d\")");
            }

            /* renamed from: d */
            public final void mo259d(C0118b bVar) {
                if (ShareDatabase_Impl.this.f354e != null) {
                    int size = ShareDatabase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        ShareDatabase_Impl.this.f354e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo258c(C0118b bVar) {
                ShareDatabase_Impl.this.f350a = bVar;
                ShareDatabase_Impl.this.mo242a(bVar);
                if (ShareDatabase_Impl.this.f354e != null) {
                    int size = ShareDatabase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) ShareDatabase_Impl.this.f354e.get(i)).mo253a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo260e(C0118b bVar) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("rid", new C0132a("rid", "INTEGER", true, 1));
                hashMap.put("time", new C0132a("time", "INTEGER", false, 0));
                hashMap.put("channel", new C0132a("channel", "TEXT", false, 0));
                hashMap.put("share_type", new C0132a("share_type", "INTEGER", false, 0));
                C0131b bVar2 = new C0131b("Record", hashMap, new HashSet(0), new HashSet(0));
                C0131b a = C0131b.m285a(bVar, "Record");
                if (!bVar2.equals(a)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle Record(com.ss.android.ugc.trill.share.data.Record).\n Expected:\n");
                    sb.append(bVar2);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "4e670bbb58b1cec9bfaaeb409ecedc0d", "c53d71306862fad59b3a3fe103512963")).mo212a());
    }
}
