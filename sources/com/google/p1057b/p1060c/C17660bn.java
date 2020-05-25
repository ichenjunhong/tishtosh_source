package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import java.util.NoSuchElementException;

/* renamed from: com.google.b.c.bn */
final class C17660bn<E> extends C17570ak<E> {

    /* renamed from: a */
    final transient E f49357a;

    /* renamed from: b */
    private transient int f49358b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33977a() {
        return false;
    }

    public final int size() {
        return 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo34027c() {
        if (this.f49358b != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final C17530ab<E> mo34098d() {
        return C17530ab.m43057of(this.f49357a);
    }

    public final C17666bt<E> iterator() {
        return new C17666bt<T>(this.f49357a) {

            /* renamed from: a */
            boolean f49266a;

            /* renamed from: b */
            final /* synthetic */ Object f49267b;

            public final boolean hasNext() {
                if (!this.f49266a) {
                    return true;
                }
                return false;
            }

            public final T next() {
                if (!this.f49266a) {
                    this.f49266a = true;
                    return this.f49267b;
                }
                throw new NoSuchElementException();
            }

            {
                this.f49267b = r1;
            }
        };
    }

    public final int hashCode() {
        int i = this.f49358b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f49357a.hashCode();
        this.f49358b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f49357a.toString());
        sb.append(']');
        return sb.toString();
    }

    public final boolean contains(Object obj) {
        return this.f49357a.equals(obj);
    }

    C17660bn(E e) {
        this.f49357a = C17421k.m42653a(e);
    }

    C17660bn(E e, int i) {
        this.f49357a = e;
        this.f49358b = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo33952a(Object[] objArr, int i) {
        objArr[i] = this.f49357a;
        return i + 1;
    }
}
