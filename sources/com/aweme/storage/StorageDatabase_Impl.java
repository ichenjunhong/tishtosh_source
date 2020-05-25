package com.aweme.storage;

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
import leakcanary.internal.LeakCanaryFileProvider;

public class StorageDatabase_Impl extends StorageDatabase {

    /* renamed from: g */
    private volatile C2568k f7910g;

    /* renamed from: a */
    public final C0137d mo240a() {
        return new C0137d(this, "black_tb");
    }

    /* renamed from: g */
    public final C2568k mo7058g() {
        C2568k kVar;
        if (this.f7910g != null) {
            return this.f7910g;
        }
        synchronized (this) {
            if (this.f7910g == null) {
                this.f7910g = new C2569l(this);
            }
            kVar = this.f7910g;
        }
        return kVar;
    }

    /* renamed from: b */
    public final C0119c mo244b(C0127a aVar) {
        return aVar.f294a.mo197a(C0121b.m264a(aVar.f295b).mo211a(aVar.f296c).mo210a((C0120a) new C0148h(aVar, new C0149a(1) {
            /* renamed from: a */
            public final void mo256a(C0118b bVar) {
                bVar.mo180c("DROP TABLE IF EXISTS `black_tb`");
            }

            /* renamed from: b */
            public final void mo257b(C0118b bVar) {
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `black_tb` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `path` TEXT, `size` INTEGER NOT NULL, `date` INTEGER NOT NULL, `count` INTEGER NOT NULL)");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo180c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"9da1db0d9f35b616dc4fd53e8847a569\")");
            }

            /* renamed from: d */
            public final void mo259d(C0118b bVar) {
                if (StorageDatabase_Impl.this.f354e != null) {
                    int size = StorageDatabase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        StorageDatabase_Impl.this.f354e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo258c(C0118b bVar) {
                StorageDatabase_Impl.this.f350a = bVar;
                StorageDatabase_Impl.this.mo242a(bVar);
                if (StorageDatabase_Impl.this.f354e != null) {
                    int size = StorageDatabase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) StorageDatabase_Impl.this.f354e.get(i)).mo253a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo260e(C0118b bVar) {
                HashMap hashMap = new HashMap(5);
                hashMap.put("id", new C0132a("id", "INTEGER", true, 1));
                hashMap.put(LeakCanaryFileProvider.f132050j, new C0132a(LeakCanaryFileProvider.f132050j, "TEXT", false, 0));
                hashMap.put("size", new C0132a("size", "INTEGER", true, 0));
                hashMap.put("date", new C0132a("date", "INTEGER", true, 0));
                hashMap.put("count", new C0132a("count", "INTEGER", true, 0));
                C0131b bVar2 = new C0131b("black_tb", hashMap, new HashSet(0), new HashSet(0));
                C0131b a = C0131b.m285a(bVar, "black_tb");
                if (!bVar2.equals(a)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle black_tb(com.aweme.storage.StorageItem).\n Expected:\n");
                    sb.append(bVar2);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "9da1db0d9f35b616dc4fd53e8847a569", "49c93119ba969cd899aa69d0a2419483")).mo212a());
    }
}
