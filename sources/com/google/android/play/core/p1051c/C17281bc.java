package com.google.android.play.core.p1051c;

import com.google.android.play.core.p1056f.C17374l;

/* renamed from: com.google.android.play.core.c.bc */
public abstract class C17281bc implements Runnable {

    /* renamed from: a */
    public final C17374l<?> f48747a;

    C17281bc() {
    }

    public C17281bc(C17374l<?> lVar) {
        this.f48747a = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33509a();

    public final void run() {
        try {
            mo33509a();
        } catch (Exception e) {
            if (this.f48747a != null) {
                this.f48747a.mo33666a(e);
            }
        }
    }
}
