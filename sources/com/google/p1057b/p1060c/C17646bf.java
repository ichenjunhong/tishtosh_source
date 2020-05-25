package com.google.p1057b.p1060c;

import com.google.p1057b.p1060c.C17564ai.C17566a;
import com.google.p1057b.p1060c.C17624aw.C17625a;
import com.google.p1057b.p1063f.C17743a;
import java.io.Serializable;

/* renamed from: com.google.b.c.bf */
final class C17646bf<E> extends C17564ai<E> {

    /* renamed from: a */
    static final C17646bf<Object> f49339a = new C17646bf<>(new C17636ba());

    /* renamed from: b */
    final transient C17636ba<E> f49340b;

    /* renamed from: c */
    private final transient int f49341c;

    /* renamed from: d */
    private transient C17570ak<E> f49342d;

    /* renamed from: com.google.b.c.bf$a */
    final class C17648a extends C17572b<E> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33977a() {
            return true;
        }

        public final int size() {
            return C17646bf.this.f49340b.f49313c;
        }

        private C17648a() {
        }

        public final boolean contains(Object obj) {
            return C17646bf.this.contains(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final E mo34031a(int i) {
            return C17646bf.this.f49340b.mo34228b(i);
        }
    }

    /* renamed from: com.google.b.c.bf$b */
    static class C17649b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f49344a;

        /* renamed from: b */
        final int[] f49345b;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            C17566a aVar = new C17566a(this.f49344a.length);
            for (int i = 0; i < this.f49344a.length; i++) {
                aVar.mo34091a(this.f49344a[i], this.f49345b[i]);
            }
            return aVar.mo34092a();
        }

        C17649b(C17624aw<?> awVar) {
            int size = awVar.entrySet().size();
            this.f49344a = new Object[size];
            this.f49345b = new int[size];
            int i = 0;
            for (C17625a aVar : awVar.entrySet()) {
                this.f49344a[i] = aVar.mo34201a();
                this.f49345b[i] = aVar.mo34202b();
                i++;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33977a() {
        return false;
    }

    public final int size() {
        return this.f49341c;
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new C17649b(this);
    }

    public final C17570ak<E> elementSet() {
        C17570ak<E> akVar = this.f49342d;
        if (akVar != null) {
            return akVar;
        }
        C17648a aVar = new C17648a();
        this.f49342d = aVar;
        return aVar;
    }

    /* renamed from: a */
    public final int mo34074a(Object obj) {
        return this.f49340b.mo34227b(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17625a<E> mo34075a(int i) {
        return this.f49340b.mo34230d(i);
    }

    C17646bf(C17636ba<E> baVar) {
        this.f49340b = baVar;
        long j = 0;
        for (int i = 0; i < baVar.f49313c; i++) {
            j += (long) baVar.mo34229c(i);
        }
        this.f49341c = C17743a.m43560a(j);
    }
}
