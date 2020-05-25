package com.tencent.wcdb.database;

import java.io.Closeable;

/* renamed from: com.tencent.wcdb.database.c */
public abstract class C51756c implements Closeable {

    /* renamed from: a */
    private int f129072a = 1;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo107088c();

    public void close() {
        mo107206e();
    }

    /* renamed from: e */
    public final void mo107206e() {
        boolean z;
        synchronized (this) {
            z = true;
            int i = this.f129072a - 1;
            this.f129072a = i;
            if (i != 0) {
                z = false;
            }
        }
        if (z) {
            mo107088c();
        }
    }

    /* renamed from: d */
    public final void mo107205d() {
        synchronized (this) {
            if (this.f129072a > 0) {
                this.f129072a++;
            } else {
                StringBuilder sb = new StringBuilder("attempt to re-open an already-closed object: ");
                sb.append(this);
                throw new IllegalStateException(sb.toString());
            }
        }
    }
}
