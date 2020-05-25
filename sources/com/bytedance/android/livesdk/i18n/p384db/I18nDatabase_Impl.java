package com.bytedance.android.livesdk.i18n.p384db;

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
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44576a;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.bytedance.android.livesdk.i18n.db.I18nDatabase_Impl */
public class I18nDatabase_Impl extends I18nDatabase {

    /* renamed from: g */
    private volatile C7689e f21171g;

    /* renamed from: h */
    private volatile C7685b f21172h;

    /* renamed from: a */
    public final C0137d mo240a() {
        return new C0137d(this, "translation", C44576a.f112775o);
    }

    /* renamed from: g */
    public final C7689e mo14044g() {
        C7689e eVar;
        if (this.f21171g != null) {
            return this.f21171g;
        }
        synchronized (this) {
            if (this.f21171g == null) {
                this.f21171g = new C7690f(this);
            }
            eVar = this.f21171g;
        }
        return eVar;
    }

    /* renamed from: h */
    public final C7685b mo14045h() {
        C7685b bVar;
        if (this.f21172h != null) {
            return this.f21172h;
        }
        synchronized (this) {
            if (this.f21172h == null) {
                this.f21172h = new C7686c(this);
            }
            bVar = this.f21172h;
        }
        return bVar;
    }

    /* renamed from: b */
    public final C0119c mo244b(C0127a aVar) {
        return aVar.f294a.mo197a(C0121b.m264a(aVar.f295b).mo211a(aVar.f296c).mo210a((C0120a) new C0148h(aVar, new C0149a(1) {
            /* renamed from: a */
            public final void mo256a(C0118b bVar) {
                bVar.mo180c("DROP TABLE IF EXISTS `translation`");
                bVar.mo180c("DROP TABLE IF EXISTS `information`");
            }

            /* renamed from: b */
            public final void mo257b(C0118b bVar) {
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `translation` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `information` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo180c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"db08c04e8a10c6c1ddb9d9ab384c2f17\")");
            }

            /* renamed from: d */
            public final void mo259d(C0118b bVar) {
                if (I18nDatabase_Impl.this.f354e != null) {
                    int size = I18nDatabase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        I18nDatabase_Impl.this.f354e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo258c(C0118b bVar) {
                I18nDatabase_Impl.this.f350a = bVar;
                I18nDatabase_Impl.this.mo242a(bVar);
                if (I18nDatabase_Impl.this.f354e != null) {
                    int size = I18nDatabase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) I18nDatabase_Impl.this.f354e.get(i)).mo253a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo260e(C0118b bVar) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("key", new C0132a("key", "TEXT", true, 1));
                hashMap.put("value", new C0132a("value", "TEXT", false, 0));
                C0131b bVar2 = new C0131b("translation", hashMap, new HashSet(0), new HashSet(0));
                C0131b a = C0131b.m285a(bVar, "translation");
                if (bVar2.equals(a)) {
                    HashMap hashMap2 = new HashMap(2);
                    hashMap2.put("key", new C0132a("key", "TEXT", true, 1));
                    hashMap2.put("value", new C0132a("value", "TEXT", false, 0));
                    C0131b bVar3 = new C0131b(C44576a.f112775o, hashMap2, new HashSet(0), new HashSet(0));
                    C0131b a2 = C0131b.m285a(bVar, C44576a.f112775o);
                    if (!bVar3.equals(a2)) {
                        StringBuilder sb = new StringBuilder("Migration didn't properly handle information(com.bytedance.android.livesdk.i18n.db.I18nInformation).\n Expected:\n");
                        sb.append(bVar3);
                        sb.append("\n Found:\n");
                        sb.append(a2);
                        throw new IllegalStateException(sb.toString());
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Migration didn't properly handle translation(com.bytedance.android.livesdk.i18n.db.I18nTranslation).\n Expected:\n");
                sb2.append(bVar2);
                sb2.append("\n Found:\n");
                sb2.append(a);
                throw new IllegalStateException(sb2.toString());
            }
        }, "db08c04e8a10c6c1ddb9d9ab384c2f17", "e3af7f9b450df7204a5f65d0fd2a1eaa")).mo212a());
    }
}
