package android.arch.p011c.p014b;

import android.arch.p011c.p012a.C0126f;

/* renamed from: android.arch.c.b.c */
public abstract class C0136c<T> extends C0151j {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo231a(C0126f fVar, T t);

    public C0136c(C0142f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public final void mo233a(T t) {
        C0126f b = mo264b();
        try {
            mo231a(b, t);
            b.mo205b();
        } finally {
            mo263a(b);
        }
    }

    /* renamed from: a */
    public final void mo232a(Iterable<T> iterable) {
        C0126f b = mo264b();
        try {
            for (T a : iterable) {
                mo231a(b, a);
                b.mo205b();
            }
        } finally {
            mo263a(b);
        }
    }

    /* renamed from: a */
    public final void mo234a(T[] tArr) {
        C0126f b = mo264b();
        try {
            for (T a : tArr) {
                mo231a(b, a);
                b.mo205b();
            }
        } finally {
            mo263a(b);
        }
    }
}
