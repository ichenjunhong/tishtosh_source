package android.arch.p011c.p014b;

import android.arch.p011c.p012a.C0126f;

/* renamed from: android.arch.c.b.b */
public abstract class C0129b<T> extends C0151j {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo216a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo217a(C0126f fVar, T t);

    public C0129b(C0142f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public final int mo214a(T t) {
        C0126f b = mo264b();
        try {
            mo217a(b, t);
            return b.mo204a();
        } finally {
            mo263a(b);
        }
    }

    /* renamed from: a */
    public final int mo215a(T[] tArr) {
        C0126f b = mo264b();
        try {
            int i = 0;
            for (T a : tArr) {
                mo217a(b, a);
                i += b.mo204a();
            }
            return i;
        } finally {
            mo263a(b);
        }
    }
}
