package com.p683ss.android.socialbase.downloader.p1213c;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.p683ss.android.socialbase.downloader.p1221j.C20038i;

/* renamed from: com.ss.android.socialbase.downloader.c.g */
public final class C19818g {

    /* renamed from: a */
    private final SQLiteDatabase f54549a;

    /* renamed from: b */
    private final String f54550b;

    /* renamed from: c */
    private final String[] f54551c;

    /* renamed from: d */
    private final String[] f54552d;

    /* renamed from: e */
    private SQLiteStatement f54553e;

    /* renamed from: f */
    private SQLiteStatement f54554f;

    /* renamed from: g */
    private SQLiteStatement f54555g;

    /* renamed from: a */
    public final SQLiteStatement mo41296a() {
        if (this.f54553e == null) {
            String str = this.f54550b;
            String[] strArr = this.f54551c;
            StringBuilder sb = new StringBuilder("INSERT INTO ");
            sb.append('\"');
            sb.append(str);
            sb.append('\"');
            sb.append(" (");
            C20038i.m49467a(sb, strArr);
            sb.append(") VALUES (");
            C20038i.m49465a(sb, strArr.length);
            sb.append(')');
            SQLiteStatement compileStatement = this.f54549a.compileStatement(sb.toString());
            synchronized (this) {
                if (this.f54553e == null) {
                    this.f54553e = compileStatement;
                }
            }
            if (this.f54553e != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f54553e;
    }

    /* renamed from: b */
    public final SQLiteStatement mo41297b() {
        if (this.f54555g == null) {
            String str = this.f54550b;
            String[] strArr = this.f54552d;
            StringBuilder sb = new StringBuilder("\"");
            sb.append(str);
            sb.append('\"');
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder("DELETE FROM ");
            sb3.append(sb2);
            if (strArr != null && strArr.length > 0) {
                sb3.append(" WHERE ");
                C20038i.m49466a(sb3, sb2, strArr);
            }
            SQLiteStatement compileStatement = this.f54549a.compileStatement(sb3.toString());
            synchronized (this) {
                if (this.f54555g == null) {
                    this.f54555g = compileStatement;
                }
            }
            if (this.f54555g != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f54555g;
    }

    /* renamed from: c */
    public final SQLiteStatement mo41298c() {
        if (this.f54554f == null) {
            String str = this.f54550b;
            String[] strArr = this.f54551c;
            String[] strArr2 = this.f54552d;
            StringBuilder sb = new StringBuilder("\"");
            sb.append(str);
            sb.append('\"');
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder("UPDATE ");
            sb3.append(sb2);
            sb3.append(" SET ");
            C20038i.m49468b(sb3, strArr);
            if (strArr2 != null && strArr2.length > 0) {
                sb3.append(" WHERE ");
                C20038i.m49466a(sb3, sb2, strArr2);
            }
            SQLiteStatement compileStatement = this.f54549a.compileStatement(sb3.toString());
            synchronized (this) {
                if (this.f54554f == null) {
                    this.f54554f = compileStatement;
                }
            }
            if (this.f54554f != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f54554f;
    }

    public C19818g(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        this.f54549a = sQLiteDatabase;
        this.f54550b = str;
        this.f54551c = strArr;
        this.f54552d = strArr2;
    }
}
