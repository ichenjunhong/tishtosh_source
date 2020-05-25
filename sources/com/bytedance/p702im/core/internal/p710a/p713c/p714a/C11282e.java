package com.bytedance.p702im.core.internal.p710a.p713c.p714a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.p702im.core.internal.p710a.p713c.C11299d;
import com.bytedance.p702im.core.internal.p710a.p713c.p715b.p716a.C11290c;
import com.bytedance.p702im.core.internal.utils.C11467e;

/* renamed from: com.bytedance.im.core.internal.a.c.a.e */
public final class C11282e extends SQLiteOpenHelper implements C11279b {

    /* renamed from: a */
    private C11278a f30386a;

    /* renamed from: a */
    public final void mo20957a(C11299d dVar) {
    }

    /* renamed from: a */
    public final void mo20958a(C11299d dVar, int i, int i2) {
    }

    /* renamed from: b */
    public final void mo20959b(C11299d dVar, int i, int i2) {
    }

    public final void close() {
        super.close();
    }

    /* renamed from: c */
    public final C11299d mo20969c() {
        return m22923a(getWritableDatabase());
    }

    /* renamed from: a */
    public final void mo20967a(C11278a aVar) {
        this.f30386a = aVar;
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        super.setWriteAheadLoggingEnabled(z);
    }

    /* renamed from: a */
    private static C11299d m22923a(SQLiteDatabase sQLiteDatabase) {
        return new C11290c(sQLiteDatabase);
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" onConfigure");
        C11467e.m23462a(sb.toString());
        m22923a(sQLiteDatabase);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" onOpen");
        C11467e.m23462a(sb.toString());
        m22923a(sQLiteDatabase);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" onCreate");
        C11467e.m23462a(sb.toString());
        this.f30386a.mo20957a(m22923a(sQLiteDatabase));
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" onDowngrade");
        C11467e.m23462a(sb.toString());
        this.f30386a.mo20959b(m22923a(sQLiteDatabase), i, i2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" onUpgrade");
        C11467e.m23462a(sb.toString());
        this.f30386a.mo20958a(m22923a(sQLiteDatabase), i, i2);
    }

    public C11282e(Context context, String str, CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        C11467e.m23462a(getClass().getSimpleName());
    }
}
