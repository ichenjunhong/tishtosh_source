package com.p683ss.android.ugc.aweme.music.dislike;

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

/* renamed from: com.ss.android.ugc.aweme.music.dislike.MusicDislikeDataBase_Impl */
public class MusicDislikeDataBase_Impl extends MusicDislikeDataBase {
    /* renamed from: a */
    public final C0137d mo240a() {
        return new C0137d(this, "musicDislikeEntity");
    }

    /* renamed from: b */
    public final C0119c mo244b(C0127a aVar) {
        return aVar.f294a.mo197a(C0121b.m264a(aVar.f295b).mo211a(aVar.f296c).mo210a((C0120a) new C0148h(aVar, new C0149a(1) {
            /* renamed from: a */
            public final void mo256a(C0118b bVar) {
                bVar.mo180c("DROP TABLE IF EXISTS `musicDislikeEntity`");
            }

            /* renamed from: b */
            public final void mo257b(C0118b bVar) {
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `musicDislikeEntity` (`title` TEXT NOT NULL, `iconUrl` TEXT NOT NULL, `author` TEXT NOT NULL, `musicId` TEXT NOT NULL, PRIMARY KEY(`musicId`))");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo180c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"b3035381388715afb9ed2687d4e033b7\")");
            }

            /* renamed from: d */
            public final void mo259d(C0118b bVar) {
                if (MusicDislikeDataBase_Impl.this.f354e != null) {
                    int size = MusicDislikeDataBase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        MusicDislikeDataBase_Impl.this.f354e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo258c(C0118b bVar) {
                MusicDislikeDataBase_Impl.this.f350a = bVar;
                MusicDislikeDataBase_Impl.this.mo242a(bVar);
                if (MusicDislikeDataBase_Impl.this.f354e != null) {
                    int size = MusicDislikeDataBase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) MusicDislikeDataBase_Impl.this.f354e.get(i)).mo253a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo260e(C0118b bVar) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("title", new C0132a("title", "TEXT", true, 0));
                hashMap.put("iconUrl", new C0132a("iconUrl", "TEXT", true, 0));
                hashMap.put("author", new C0132a("author", "TEXT", true, 0));
                hashMap.put("musicId", new C0132a("musicId", "TEXT", true, 1));
                C0131b bVar2 = new C0131b("musicDislikeEntity", hashMap, new HashSet(0), new HashSet(0));
                C0131b a = C0131b.m285a(bVar, "musicDislikeEntity");
                if (!bVar2.equals(a)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle musicDislikeEntity(com.ss.android.ugc.aweme.music.dislike.MusicDislikeEntity).\n Expected:\n");
                    sb.append(bVar2);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "b3035381388715afb9ed2687d4e033b7", "b1ca9817a0a4539270563ec2afdf5dab")).mo212a());
    }
}
