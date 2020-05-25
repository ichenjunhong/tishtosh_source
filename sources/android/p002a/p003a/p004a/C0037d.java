package android.p002a.p003a.p004a;

import android.os.Bundle;
import android.p002a.p003a.p004a.C0034b.C0035a;
import android.p002a.p003a.p004a.p005a.C0031a;
import android.p002a.p003a.p004a.p005a.C0032b;
import android.p002a.p003a.p004a.p005a.C0033c;
import android.util.SparseIntArray;

/* renamed from: android.a.a.a.d */
public class C0037d {

    /* renamed from: a */
    private static volatile C0037d f97a;

    /* renamed from: b */
    private SparseIntArray f98b = new SparseIntArray();

    /* renamed from: c */
    private C0033c f99c = new C0032b();

    /* renamed from: a */
    public final C0035a mo51a() {
        try {
            return this.f99c instanceof C0031a ? null : null;
        } catch (Throwable unused) {
        }
    }

    private C0037d() {
    }

    /* renamed from: b */
    public static C0037d m58b() {
        if (f97a == null) {
            synchronized (C0037d.class) {
                if (f97a == null) {
                    f97a = new C0037d();
                }
            }
        }
        return f97a;
    }

    /* renamed from: a */
    public final boolean mo52a(C0036c cVar, C0039f fVar) {
        return m57a(cVar, fVar, null);
    }

    /* renamed from: a */
    private synchronized boolean m57a(C0036c cVar, C0039f fVar, Bundle bundle) {
        if (this.f99c == null) {
            return false;
        }
        try {
            if (this.f98b.get(cVar.mo50a()) != fVar.getStatus()) {
                this.f98b.put(cVar.mo50a(), fVar.getStatus());
                return false;
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
