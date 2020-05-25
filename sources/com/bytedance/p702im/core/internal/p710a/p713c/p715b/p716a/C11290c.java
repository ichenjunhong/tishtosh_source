package com.bytedance.p702im.core.internal.p710a.p713c.p715b.p716a;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.p702im.core.internal.p710a.p713c.C11287b;
import com.bytedance.p702im.core.internal.p710a.p713c.C11299d;
import com.bytedance.p702im.core.internal.p710a.p713c.C11302f;

/* renamed from: com.bytedance.im.core.internal.a.c.b.a.c */
public final class C11290c implements C11299d {

    /* renamed from: a */
    private SQLiteDatabase f30394a;

    /* renamed from: b */
    public final void mo21003b() {
        this.f30394a.close();
    }

    /* renamed from: c */
    public final boolean mo21004c() {
        return this.f30394a.inTransaction();
    }

    /* renamed from: d */
    public final void mo21005d() {
        this.f30394a.beginTransaction();
    }

    /* renamed from: e */
    public final void mo21006e() {
        this.f30394a.setTransactionSuccessful();
    }

    /* renamed from: f */
    public final void mo21007f() {
        this.f30394a.endTransaction();
    }

    /* renamed from: a */
    public final boolean mo21001a() {
        return this.f30394a.isOpen();
    }

    public C11290c(SQLiteDatabase sQLiteDatabase) {
        this.f30394a = sQLiteDatabase;
    }

    /* renamed from: b */
    public final C11302f mo21002b(String str) throws SQLException {
        return new C11292e(this.f30394a.compileStatement(str));
    }

    /* renamed from: a */
    public final void mo21000a(String str) throws SQLException {
        this.f30394a.execSQL(str);
    }

    /* renamed from: a */
    public final C11287b mo20999a(String str, String[] strArr) {
        return new C11288a(this.f30394a.rawQuery(str, strArr));
    }

    /* renamed from: a */
    public final int mo20997a(String str, String str2, String[] strArr) {
        return this.f30394a.delete(str, str2, strArr);
    }

    /* renamed from: a */
    public final long mo20998a(String str, String str2, ContentValues contentValues) {
        return this.f30394a.insert(str, str2, contentValues);
    }

    /* renamed from: a */
    public final int mo20996a(String str, ContentValues contentValues, String str2, String[] strArr) {
        return this.f30394a.update(str, contentValues, str2, strArr);
    }
}
