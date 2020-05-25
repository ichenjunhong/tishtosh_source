package com.bytedance.p702im.core.internal.p710a.p711a;

import android.content.Context;
import com.C2240a;
import com.bytedance.p702im.core.internal.p710a.p713c.C11299d;
import com.bytedance.p702im.core.internal.p710a.p713c.p714a.C11278a;
import com.bytedance.p702im.core.internal.p710a.p713c.p715b.p717b.C11295c;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.tencent.wcdb.C51779i;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.io.File;

/* renamed from: com.bytedance.im.core.internal.a.a.e */
public final class C11267e extends C11263a {

    /* renamed from: e */
    private Context f30351e;

    /* renamed from: f */
    private String f30352f;

    /* renamed from: a */
    public final C11278a mo20956a() {
        return this;
    }

    /* renamed from: a */
    public final void mo20957a(C11299d dVar) {
        C11467e.m23462a("IMEncryptedDBHelper onCreate");
        File databasePath = this.f30351e.getDatabasePath(this.f30352f);
        if (!databasePath.exists() || !(dVar instanceof C11295c)) {
            super.mo20957a(dVar);
        } else {
            C11467e.m23467b("IMEncryptedDBHelper Migrating old database to encrypted one.");
            C11295c cVar = (C11295c) dVar;
            SQLiteDatabase sQLiteDatabase = cVar.f30399a;
            sQLiteDatabase.mo107190h();
            sQLiteDatabase.mo107186b(C2240a.m6772a("ATTACH DATABASE %s AS old KEY '';", new Object[]{C51779i.m111060a(databasePath.getPath())}));
            sQLiteDatabase.mo107189g();
            C51779i.m111063b(sQLiteDatabase, "SELECT sqlcipher_export('main', 'old');", null);
            sQLiteDatabase.mo107191i();
            sQLiteDatabase.mo107190h();
            int a = (int) C51779i.m111059a(sQLiteDatabase, "PRAGMA old.user_version;", null);
            sQLiteDatabase.mo107186b("DETACH DATABASE old;");
            databasePath.delete();
            sQLiteDatabase.mo107189g();
            if (a > 17) {
                mo20959b(cVar, a, 17);
            } else {
                if (a < 17) {
                    mo20958a(cVar, a, 17);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20958a(C11299d dVar, int i, int i2) {
        super.mo20958a(dVar, i, i2);
    }

    public C11267e(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder("encrypted_");
        sb.append(str);
        super(context, sb.toString(), str2);
        this.f30351e = context;
        this.f30352f = str;
    }
}
