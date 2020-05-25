package com.tencent.wcdb.database;

import com.C2240a;
import com.tencent.wcdb.C51744b;
import com.tencent.wcdb.C51775e;
import com.tencent.wcdb.C51779i;
import com.tencent.wcdb.database.SQLiteDatabase.C51753a;
import com.tencent.wcdb.support.C51787a;
import com.tencent.wcdb.support.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.wcdb.database.e */
public final class C51761e extends C51744b {

    /* renamed from: j */
    public static final C51753a f129108j = new C51753a() {
        /* renamed from: a */
        public final C51767j mo20970a(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, C51787a aVar) {
            return new C51768k(sQLiteDatabase, str, objArr, aVar);
        }

        /* renamed from: a */
        public final C51775e mo20971a(SQLiteDatabase sQLiteDatabase, C51763f fVar, String str, C51767j jVar) {
            return new C51761e(fVar, str, (C51768k) jVar);
        }
    };

    /* renamed from: k */
    private final String f129109k;

    /* renamed from: l */
    private final String[] f129110l;

    /* renamed from: m */
    private final C51768k f129111m;

    /* renamed from: n */
    private final C51763f f129112n;

    /* renamed from: o */
    private int f129113o = -1;

    /* renamed from: p */
    private int f129114p;

    /* renamed from: q */
    private Map<String, Integer> f129115q;

    /* renamed from: r */
    private final Throwable f129116r;

    public final void deactivate() {
        super.deactivate();
    }

    public final String[] getColumnNames() {
        return this.f129110l;
    }

    /* renamed from: d */
    private SQLiteDatabase m111005d() {
        return this.f129111m.f129149a;
    }

    public final void close() {
        super.close();
        synchronized (this) {
            this.f129111m.close();
        }
    }

    public final void finalize() {
        try {
            if (this.f129007i != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public final int getCount() {
        if (this.f129113o == -1) {
            m111004a(0);
        }
        return this.f129113o;
    }

    public final boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            if (!this.f129111m.f129149a.mo107196n()) {
                return false;
            }
            if (this.f129007i != null) {
                this.f129007i.mo107084a();
            }
            this.f128994b = -1;
            this.f129113o = -1;
            try {
                return super.requery();
            } catch (IllegalStateException e) {
                StringBuilder sb = new StringBuilder("requery() failed ");
                sb.append(e.getMessage());
                Log.m111072a(5, "WCDB.SQLiteCursor", C2240a.m6772a(sb.toString(), new Object[]{e}));
                return false;
            }
        }
    }

    /* renamed from: a */
    private void m111004a(int i) {
        mo107139a(m111005d().mo107197o());
        try {
            if (this.f129113o == -1) {
                this.f129113o = this.f129111m.mo107230a(this.f129007i, C51779i.m111057a(i, 0), i, true);
                this.f129114p = this.f129007i.mo107085b();
                return;
            }
            this.f129111m.mo107230a(this.f129007i, C51779i.m111057a(i, this.f129114p), i, false);
        } catch (RuntimeException e) {
            mo107140c();
            throw e;
        }
    }

    public final int getColumnIndex(String str) {
        if (this.f129115q == null) {
            String[] strArr = this.f129110l;
            int length = strArr.length;
            HashMap hashMap = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                hashMap.put(strArr[i], Integer.valueOf(i));
            }
            this.f129115q = hashMap;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            Exception exc = new Exception();
            StringBuilder sb = new StringBuilder("requesting column name with table name -- ");
            sb.append(str);
            Log.m111074a("WCDB.SQLiteCursor", sb.toString(), exc);
            str = str.substring(lastIndexOf + 1);
        }
        Integer num = (Integer) this.f129115q.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: a */
    public final boolean mo107098a(int i, int i2) {
        if (this.f129007i == null || i2 < this.f129007i.f128991b || i2 >= this.f129007i.f128991b + this.f129007i.mo107085b()) {
            m111004a(i2);
        }
        return true;
    }

    public C51761e(C51763f fVar, String str, C51768k kVar) {
        if (kVar != null) {
            this.f129116r = null;
            this.f129112n = fVar;
            this.f129109k = str;
            this.f129115q = null;
            this.f129111m = kVar;
            this.f129110l = kVar.f129151c;
            this.f128995c = C51779i.m111058a(this.f129110l);
            return;
        }
        throw new IllegalArgumentException("query object cannot be null");
    }
}
