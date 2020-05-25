package com.p683ss.android.ugc.aweme.challenge.data;

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

/* renamed from: com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase_Impl */
public class LocalHashTagDataBase_Impl extends LocalHashTagDataBase {

    /* renamed from: g */
    private volatile C24585a f65047g;

    /* renamed from: a */
    public final C0137d mo240a() {
        return new C0137d(this, "localHashTag");
    }

    /* renamed from: g */
    public final C24585a mo50351g() {
        C24585a aVar;
        if (this.f65047g != null) {
            return this.f65047g;
        }
        synchronized (this) {
            if (this.f65047g == null) {
                this.f65047g = new C24586b(this);
            }
            aVar = this.f65047g;
        }
        return aVar;
    }

    /* renamed from: b */
    public final C0119c mo244b(C0127a aVar) {
        return aVar.f294a.mo197a(C0121b.m264a(aVar.f295b).mo211a(aVar.f296c).mo210a((C0120a) new C0148h(aVar, new C0149a(1) {
            /* renamed from: a */
            public final void mo256a(C0118b bVar) {
                bVar.mo180c("DROP TABLE IF EXISTS `localHashTag`");
            }

            /* renamed from: b */
            public final void mo257b(C0118b bVar) {
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `localHashTag` (`name` TEXT NOT NULL, `time` INTEGER, PRIMARY KEY(`name`))");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo180c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"0fdb23fe113307f93af74ceea527f0a9\")");
            }

            /* renamed from: d */
            public final void mo259d(C0118b bVar) {
                if (LocalHashTagDataBase_Impl.this.f354e != null) {
                    int size = LocalHashTagDataBase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        LocalHashTagDataBase_Impl.this.f354e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo258c(C0118b bVar) {
                LocalHashTagDataBase_Impl.this.f350a = bVar;
                LocalHashTagDataBase_Impl.this.mo242a(bVar);
                if (LocalHashTagDataBase_Impl.this.f354e != null) {
                    int size = LocalHashTagDataBase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) LocalHashTagDataBase_Impl.this.f354e.get(i)).mo253a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo260e(C0118b bVar) {
                HashMap hashMap = new HashMap(2);
                hashMap.put(LeakCanaryFileProvider.f132049i, new C0132a(LeakCanaryFileProvider.f132049i, "TEXT", true, 1));
                hashMap.put("time", new C0132a("time", "INTEGER", false, 0));
                C0131b bVar2 = new C0131b("localHashTag", hashMap, new HashSet(0), new HashSet(0));
                C0131b a = C0131b.m285a(bVar, "localHashTag");
                if (!bVar2.equals(a)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle localHashTag(com.ss.android.ugc.aweme.challenge.data.LocalHashTagItem).\n Expected:\n");
                    sb.append(bVar2);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "0fdb23fe113307f93af74ceea527f0a9", "606e3395020db78e36e0b235c6657129")).mo212a());
    }
}
