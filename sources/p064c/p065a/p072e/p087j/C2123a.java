package p064c.p065a.p072e.p087j;

import org.p2692b.C53695c;
import p064c.p065a.p071d.C1715j;

/* renamed from: c.a.e.j.a */
public final class C2123a<T> {

    /* renamed from: a */
    public final int f6885a = 4;

    /* renamed from: b */
    public final Object[] f6886b = new Object[5];

    /* renamed from: c */
    Object[] f6887c = this.f6886b;

    /* renamed from: d */
    int f6888d;

    /* renamed from: c.a.e.j.a$a */
    public interface C2124a<T> extends C1715j<T> {
        /* renamed from: a */
        boolean mo6207a(T t);
    }

    /* renamed from: b */
    public final void mo6423b(T t) {
        this.f6886b[0] = t;
    }

    public C2123a(int i) {
    }

    /* renamed from: a */
    public final void mo6420a(C2124a<? super T> aVar) {
        int i = this.f6885a;
        for (Object[] objArr = this.f6886b; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!aVar.mo6207a(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6421a(T t) {
        int i = this.f6885a;
        int i2 = this.f6888d;
        if (i2 == i) {
            Object[] objArr = new Object[(i + 1)];
            this.f6887c[i] = objArr;
            this.f6887c = objArr;
            i2 = 0;
        }
        this.f6887c[i2] = t;
        this.f6888d = i2 + 1;
    }

    /* renamed from: a */
    public final <U> boolean mo6422a(C53695c<? super U> cVar) {
        Object[] objArr = this.f6886b;
        int i = this.f6885a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (C2134j.acceptFull((Object) objArr2, cVar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }
}
