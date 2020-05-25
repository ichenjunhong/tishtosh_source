package android.arch.p010b;

import java.util.Collections;
import java.util.List;

/* renamed from: android.arch.b.g */
final class C0080g<T> {

    /* renamed from: a */
    static final C0080g f193a = new C0080g(Collections.EMPTY_LIST, 0);

    /* renamed from: b */
    public final List<T> f194b;

    /* renamed from: c */
    public final int f195c;

    /* renamed from: d */
    public final int f196d;

    /* renamed from: e */
    public final int f197e;

    /* renamed from: android.arch.b.g$a */
    static abstract class C0081a<T> {
        C0081a() {
        }

        /* renamed from: a */
        public abstract void mo102a(int i, C0080g<T> gVar);
    }

    /* renamed from: a */
    public final boolean mo120a() {
        if (this == f193a) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result ");
        sb.append(this.f195c);
        sb.append(", ");
        sb.append(this.f194b);
        sb.append(", ");
        sb.append(this.f196d);
        sb.append(", offset ");
        sb.append(this.f197e);
        return sb.toString();
    }

    private C0080g(List<T> list, int i) {
        this.f194b = list;
        this.f197e = 0;
    }

    C0080g(List<T> list, int i, int i2, int i3) {
        this.f194b = list;
        this.f195c = 0;
        this.f196d = 0;
        this.f197e = i3;
    }
}
