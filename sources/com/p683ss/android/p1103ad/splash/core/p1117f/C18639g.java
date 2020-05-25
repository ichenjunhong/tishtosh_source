package com.p683ss.android.p1103ad.splash.core.p1117f;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.p683ss.android.p1103ad.splash.core.p1112a.C18564a;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.core.f.g */
public final class C18639g implements C18638f {

    /* renamed from: a */
    C18564a f51458a;

    /* renamed from: a */
    public final List<C18637e> mo38050a() {
        boolean z;
        LinkedList linkedList = new LinkedList();
        Cursor a = this.f51458a.mo37875a().mo37890a("trackurl", null, null, null, null, null, null);
        while (a.moveToNext()) {
            try {
                String string = a.getString(a.getColumnIndex("id"));
                String string2 = a.getString(a.getColumnIndex("url"));
                if (a.getInt(a.getColumnIndex("replaceholder")) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                C18637e eVar = new C18637e(a.getLong(a.getColumnIndex("cid")), a.getString(a.getColumnIndex("log_extra")), string, string2, z, a.getInt(a.getColumnIndex("retry")), a.getInt(a.getColumnIndex("type")));
                linkedList.add(eVar);
            } catch (Exception unused) {
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }
        a.close();
        return linkedList;
    }

    public C18639g(Context context) {
        this.f51458a = C18564a.m44942a(context.getApplicationContext());
    }

    /* renamed from: c */
    public final void mo38053c(C18637e eVar) {
        this.f51458a.mo37875a().mo37888a("trackurl", "id=?", new String[]{eVar.f51451a});
    }

    /* renamed from: b */
    public final void mo38052b(C18637e eVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", eVar.f51451a);
        contentValues.put("url", eVar.f51452b);
        contentValues.put("replaceholder", Integer.valueOf(eVar.f51453c ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(eVar.f51454d));
        contentValues.put("type", Integer.valueOf(eVar.f51455e));
        contentValues.put("cid", Long.valueOf(eVar.f51456f));
        contentValues.put("log_extra", eVar.f51457g);
        this.f51458a.mo37875a().mo37887a("trackurl", contentValues, "id=?", new String[]{eVar.f51451a});
    }

    /* renamed from: a */
    public final void mo38051a(C18637e eVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", eVar.f51451a);
        contentValues.put("url", eVar.f51452b);
        contentValues.put("replaceholder", Integer.valueOf(eVar.f51453c ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(eVar.f51454d));
        contentValues.put("type", Integer.valueOf(eVar.f51455e));
        contentValues.put("cid", Long.valueOf(eVar.f51456f));
        contentValues.put("log_extra", eVar.f51457g);
        this.f51458a.mo37875a().mo37889a("trackurl", (String) null, contentValues);
    }
}
