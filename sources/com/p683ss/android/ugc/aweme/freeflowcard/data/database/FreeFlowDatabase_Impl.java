package com.p683ss.android.ugc.aweme.freeflowcard.data.database;

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
import com.p683ss.android.ugc.aweme.freeflowcard.data.p1785a.C32476a;
import com.p683ss.android.ugc.aweme.freeflowcard.data.p1785a.C32477b;
import com.p683ss.android.ugc.aweme.freeflowcard.data.p1785a.C32480c;
import com.p683ss.android.ugc.aweme.freeflowcard.data.p1785a.C32481d;
import com.p683ss.android.ugc.aweme.freeflowcard.data.p1785a.C32484e;
import com.p683ss.android.ugc.aweme.freeflowcard.data.p1785a.C32485f;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.database.FreeFlowDatabase_Impl */
public class FreeFlowDatabase_Impl extends FreeFlowDatabase {

    /* renamed from: g */
    private volatile C32480c f84583g;

    /* renamed from: h */
    private volatile C32484e f84584h;

    /* renamed from: i */
    private volatile C32476a f84585i;

    /* renamed from: a */
    public final C0137d mo240a() {
        return new C0137d(this, "tb_auto_play_setting", "tb_user_click_event", "tb_app_start_mode");
    }

    /* renamed from: g */
    public final C32480c mo65803g() {
        C32480c cVar;
        if (this.f84583g != null) {
            return this.f84583g;
        }
        synchronized (this) {
            if (this.f84583g == null) {
                this.f84583g = new C32481d(this);
            }
            cVar = this.f84583g;
        }
        return cVar;
    }

    /* renamed from: h */
    public final C32484e mo65804h() {
        C32484e eVar;
        if (this.f84584h != null) {
            return this.f84584h;
        }
        synchronized (this) {
            if (this.f84584h == null) {
                this.f84584h = new C32485f(this);
            }
            eVar = this.f84584h;
        }
        return eVar;
    }

    /* renamed from: i */
    public final C32476a mo65805i() {
        C32476a aVar;
        if (this.f84585i != null) {
            return this.f84585i;
        }
        synchronized (this) {
            if (this.f84585i == null) {
                this.f84585i = new C32477b(this);
            }
            aVar = this.f84585i;
        }
        return aVar;
    }

    /* renamed from: b */
    public final C0119c mo244b(C0127a aVar) {
        return aVar.f294a.mo197a(C0121b.m264a(aVar.f295b).mo211a(aVar.f296c).mo210a((C0120a) new C0148h(aVar, new C0149a(1) {
            /* renamed from: a */
            public final void mo256a(C0118b bVar) {
                bVar.mo180c("DROP TABLE IF EXISTS `tb_auto_play_setting`");
                bVar.mo180c("DROP TABLE IF EXISTS `tb_user_click_event`");
                bVar.mo180c("DROP TABLE IF EXISTS `tb_app_start_mode`");
            }

            /* renamed from: b */
            public final void mo257b(C0118b bVar) {
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `tb_auto_play_setting` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `is_open` INTEGER NOT NULL, `change_type` INTEGER NOT NULL, `reset_time` INTEGER NOT NULL, `monthly_state` INTEGER NOT NULL, `day_open` INTEGER NOT NULL, `day_open_reset_time` INTEGER NOT NULL)");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `tb_user_click_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `click_type` INTEGER NOT NULL, `is_auto_play` INTEGER NOT NULL)");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `tb_app_start_mode` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `start_mode` INTEGER NOT NULL)");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo180c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"1967f4d2e5a4f7e5e76e753b06cafe2b\")");
            }

            /* renamed from: d */
            public final void mo259d(C0118b bVar) {
                if (FreeFlowDatabase_Impl.this.f354e != null) {
                    int size = FreeFlowDatabase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        FreeFlowDatabase_Impl.this.f354e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo258c(C0118b bVar) {
                FreeFlowDatabase_Impl.this.f350a = bVar;
                FreeFlowDatabase_Impl.this.mo242a(bVar);
                if (FreeFlowDatabase_Impl.this.f354e != null) {
                    int size = FreeFlowDatabase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) FreeFlowDatabase_Impl.this.f354e.get(i)).mo253a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo260e(C0118b bVar) {
                HashMap hashMap = new HashMap(7);
                hashMap.put("id", new C0132a("id", "INTEGER", true, 1));
                hashMap.put("is_open", new C0132a("is_open", "INTEGER", true, 0));
                hashMap.put("change_type", new C0132a("change_type", "INTEGER", true, 0));
                hashMap.put("reset_time", new C0132a("reset_time", "INTEGER", true, 0));
                hashMap.put("monthly_state", new C0132a("monthly_state", "INTEGER", true, 0));
                hashMap.put("day_open", new C0132a("day_open", "INTEGER", true, 0));
                hashMap.put("day_open_reset_time", new C0132a("day_open_reset_time", "INTEGER", true, 0));
                C0131b bVar2 = new C0131b("tb_auto_play_setting", hashMap, new HashSet(0), new HashSet(0));
                C0131b a = C0131b.m285a(bVar, "tb_auto_play_setting");
                if (bVar2.equals(a)) {
                    HashMap hashMap2 = new HashMap(4);
                    hashMap2.put("id", new C0132a("id", "INTEGER", true, 1));
                    hashMap2.put("time", new C0132a("time", "INTEGER", true, 0));
                    hashMap2.put("click_type", new C0132a("click_type", "INTEGER", true, 0));
                    hashMap2.put("is_auto_play", new C0132a("is_auto_play", "INTEGER", true, 0));
                    C0131b bVar3 = new C0131b("tb_user_click_event", hashMap2, new HashSet(0), new HashSet(0));
                    C0131b a2 = C0131b.m285a(bVar, "tb_user_click_event");
                    if (bVar3.equals(a2)) {
                        HashMap hashMap3 = new HashMap(3);
                        hashMap3.put("id", new C0132a("id", "INTEGER", true, 1));
                        hashMap3.put("time", new C0132a("time", "INTEGER", true, 0));
                        hashMap3.put("start_mode", new C0132a("start_mode", "INTEGER", true, 0));
                        C0131b bVar4 = new C0131b("tb_app_start_mode", hashMap3, new HashSet(0), new HashSet(0));
                        C0131b a3 = C0131b.m285a(bVar, "tb_app_start_mode");
                        if (!bVar4.equals(a3)) {
                            StringBuilder sb = new StringBuilder("Migration didn't properly handle tb_app_start_mode(com.ss.android.ugc.aweme.freeflowcard.data.entity.AppStartMode).\n Expected:\n");
                            sb.append(bVar4);
                            sb.append("\n Found:\n");
                            sb.append(a3);
                            throw new IllegalStateException(sb.toString());
                        }
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("Migration didn't properly handle tb_user_click_event(com.ss.android.ugc.aweme.freeflowcard.data.entity.UserClickEvent).\n Expected:\n");
                    sb2.append(bVar3);
                    sb2.append("\n Found:\n");
                    sb2.append(a2);
                    throw new IllegalStateException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder("Migration didn't properly handle tb_auto_play_setting(com.ss.android.ugc.aweme.freeflowcard.data.entity.AutoPlaySetting).\n Expected:\n");
                sb3.append(bVar2);
                sb3.append("\n Found:\n");
                sb3.append(a);
                throw new IllegalStateException(sb3.toString());
            }
        }, "1967f4d2e5a4f7e5e76e753b06cafe2b", "b3be3e5c94533db90027e813123cd689")).mo212a());
    }
}
