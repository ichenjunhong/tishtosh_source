package com.tencent.wcdb.database;

import android.database.sqlite.SQLiteTransactionListener;
import android.os.Process;
import com.tencent.wcdb.C51779i;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.support.C51787a;

/* renamed from: com.tencent.wcdb.database.l */
public final class C51769l {

    /* renamed from: c */
    static final /* synthetic */ boolean f129158c = (!C51769l.class.desiredAssertionStatus());

    /* renamed from: a */
    SQLiteConnection f129159a;

    /* renamed from: b */
    C51771a f129160b;

    /* renamed from: d */
    private final C51757d f129161d;

    /* renamed from: e */
    private int f129162e;

    /* renamed from: f */
    private int f129163f;

    /* renamed from: g */
    private C51771a f129164g;

    /* renamed from: com.tencent.wcdb.database.l$a */
    static final class C51771a {

        /* renamed from: a */
        public C51771a f129165a;

        /* renamed from: b */
        public int f129166b;

        /* renamed from: c */
        public SQLiteTransactionListener f129167c;

        /* renamed from: d */
        public boolean f129168d;

        /* renamed from: e */
        public boolean f129169e;

        private C51771a() {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo107239a(String str, int i, C51787a aVar) {
        if (this.f129159a == null) {
            this.f129159a = this.f129161d.mo107208a(str, i, aVar);
            this.f129162e = i;
            this.f129159a.mo107157a(Thread.currentThread(), Process.myTid());
        }
        this.f129163f++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107238a(Exception exc) {
        if (this.f129159a != null) {
            this.f129159a.mo107154a(exc);
        }
        mo107241b();
    }

    /* renamed from: c */
    private void m111035c() {
        if (this.f129160b == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    /* renamed from: d */
    private void m111036d() {
        if (this.f129160b != null && this.f129160b.f129168d) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo107241b() {
        int i = this.f129163f - 1;
        this.f129163f = i;
        if (i == 0) {
            try {
                this.f129159a.mo107157a((Thread) null, 0);
                this.f129161d.mo107210a(this.f129159a);
            } finally {
                this.f129159a = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo107235a() {
        m111035c();
        m111036d();
        this.f129160b.f129168d = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final SQLiteConnection mo107234a(int i) {
        mo107239a(null, i, null);
        return this.f129159a;
    }

    public C51769l(C51757d dVar) {
        if (dVar != null) {
            this.f129161d = dVar;
            return;
        }
        throw new IllegalArgumentException("connectionPool must not be null");
    }

    /* renamed from: a */
    private void m111032a(C51771a aVar) {
        aVar.f129165a = this.f129164g;
        aVar.f129167c = null;
        this.f129164g = aVar;
    }

    /* renamed from: a */
    public final void mo107237a(C51787a aVar) {
        m111035c();
        if (f129158c || this.f129159a != null) {
            m111033a(aVar, false);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private C51771a m111031a(int i, SQLiteTransactionListener sQLiteTransactionListener) {
        C51771a aVar = this.f129164g;
        if (aVar != null) {
            this.f129164g = aVar.f129165a;
            aVar.f129165a = null;
            aVar.f129168d = false;
            aVar.f129169e = false;
        } else {
            aVar = new C51771a();
        }
        aVar.f129166b = i;
        aVar.f129167c = sQLiteTransactionListener;
        return aVar;
    }

    /* renamed from: a */
    private void m111033a(C51787a aVar, boolean z) {
        boolean z2;
        Throwable th;
        if (aVar != null) {
            aVar.mo107262a();
        }
        C51771a aVar2 = this.f129160b;
        if (!aVar2.f129168d || aVar2.f129169e) {
            z2 = false;
        } else {
            z2 = true;
        }
        SQLiteTransactionListener sQLiteTransactionListener = aVar2.f129167c;
        if (sQLiteTransactionListener != null) {
            if (z2) {
                try {
                    sQLiteTransactionListener.onCommit();
                } catch (RuntimeException e) {
                    th = e;
                    z2 = false;
                }
            } else {
                sQLiteTransactionListener.onRollback();
            }
        }
        th = null;
        this.f129160b = aVar2.f129165a;
        m111032a(aVar2);
        if (this.f129160b == null) {
            if (z2) {
                try {
                    this.f129159a.mo107156a("COMMIT;", null, aVar);
                } catch (Throwable th2) {
                    mo107241b();
                    throw th2;
                }
            } else {
                this.f129159a.mo107156a("ROLLBACK;", null, aVar);
            }
            mo107241b();
        } else if (!z2) {
            this.f129160b.f129169e = true;
        }
        if (th != null) {
            throw th;
        }
    }

    /* renamed from: e */
    private boolean m111037e(String str, Object[] objArr, int i, C51787a aVar) {
        if (aVar != null) {
            aVar.mo107262a();
        }
        switch (C51779i.m111062b(str)) {
            case 4:
                mo107236a(2, (SQLiteTransactionListener) null, i, aVar);
                return true;
            case 5:
                mo107235a();
                mo107237a(aVar);
                return true;
            case 6:
                mo107237a(aVar);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final long mo107233a(String str, Object[] objArr, int i, C51787a aVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (m111037e(str, objArr, i, aVar)) {
            return 0;
        } else {
            mo107239a(str, i, aVar);
            try {
                return this.f129159a.mo107158b(str, objArr, aVar);
            } finally {
                mo107241b();
            }
        }
    }

    /* renamed from: b */
    public final String mo107240b(String str, Object[] objArr, int i, C51787a aVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (m111037e(str, objArr, i, aVar)) {
            return null;
        } else {
            mo107239a(str, i, aVar);
            try {
                return this.f129159a.mo107163c(str, objArr, aVar);
            } finally {
                mo107241b();
            }
        }
    }

    /* renamed from: c */
    public final int mo107242c(String str, Object[] objArr, int i, C51787a aVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (m111037e(str, objArr, i, aVar)) {
            return 0;
        } else {
            mo107239a(str, i, aVar);
            try {
                return this.f129159a.mo107164d(str, objArr, aVar);
            } finally {
                mo107241b();
            }
        }
    }

    /* renamed from: d */
    public final long mo107243d(String str, Object[] objArr, int i, C51787a aVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (m111037e(str, objArr, i, aVar)) {
            return 0;
        } else {
            mo107239a(str, i, aVar);
            try {
                return this.f129159a.mo107165e(str, objArr, aVar);
            } finally {
                mo107241b();
            }
        }
    }

    /* renamed from: b */
    private void m111034b(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, C51787a aVar) {
        if (aVar != null) {
            aVar.mo107262a();
        }
        if (this.f129160b == null) {
            mo107239a(null, i2, aVar);
        }
        try {
            if (this.f129160b == null) {
                switch (i) {
                    case 1:
                        this.f129159a.mo107156a("BEGIN IMMEDIATE;", null, aVar);
                        break;
                    case 2:
                        this.f129159a.mo107156a("BEGIN EXCLUSIVE;", null, aVar);
                        break;
                    default:
                        this.f129159a.mo107156a("BEGIN;", null, aVar);
                        break;
                }
            }
            if (sQLiteTransactionListener != null) {
                sQLiteTransactionListener.onBegin();
            }
            C51771a a = m111031a(i, sQLiteTransactionListener);
            a.f129165a = this.f129160b;
            this.f129160b = a;
            if (this.f129160b == null) {
                mo107241b();
            }
        } catch (RuntimeException e) {
            if (this.f129160b == null) {
                this.f129159a.mo107156a("ROLLBACK;", null, aVar);
            }
            throw e;
        } catch (Throwable th) {
            if (this.f129160b == null) {
                mo107241b();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo107236a(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, C51787a aVar) {
        m111036d();
        m111034b(i, sQLiteTransactionListener, i2, aVar);
    }

    /* renamed from: a */
    public final int mo107232a(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, int i3, C51787a aVar) {
        int i4 = i3;
        C51787a aVar2 = aVar;
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (cursorWindow != null) {
            Object[] objArr2 = objArr;
            if (m111037e(str, objArr, i4, aVar2)) {
                cursorWindow.mo107084a();
                return 0;
            }
            mo107239a(str, i4, aVar2);
            try {
                return this.f129159a.mo107148a(str, objArr, cursorWindow, i, i2, z, aVar);
            } finally {
                mo107241b();
            }
        } else {
            throw new IllegalArgumentException("window must not be null.");
        }
    }
}
