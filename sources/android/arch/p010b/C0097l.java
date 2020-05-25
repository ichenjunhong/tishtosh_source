package android.arch.p010b;

import android.arch.p010b.C0065d.C0067b;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: android.arch.b.l */
public abstract class C0097l<T> extends C0065d<Integer, T> {

    /* renamed from: android.arch.b.l$a */
    static class C0098a<Value> extends C0060b<Integer, Value> {

        /* renamed from: a */
        final C0097l<Value> f252a;

        /* renamed from: b */
        public final void mo106b() {
            this.f252a.mo106b();
        }

        /* renamed from: c */
        public final boolean mo108c() {
            return this.f252a.mo108c();
        }

        C0098a(C0097l<Value> lVar) {
            this.f252a = lVar;
        }

        /* renamed from: b */
        public final void mo107b(C0067b bVar) {
            this.f252a.mo107b(bVar);
        }

        /* renamed from: a */
        public final void mo105a(C0067b bVar) {
            this.f252a.mo105a(bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo87a(int i, Object obj) {
            return Integer.valueOf(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo88a(int i, Value value, int i2, Executor executor, C0081a<Value> aVar) {
            this.f252a.mo168a(1, i + 1, i2, executor, aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo91b(int i, Value value, int i2, Executor executor, C0081a<Value> aVar) {
            int i3 = i - 1;
            if (i3 < 0) {
                this.f252a.mo168a(2, i3, 0, executor, aVar);
                return;
            }
            int min = Math.min(i2, i3 + 1);
            this.f252a.mo168a(2, (i3 - min) + 1, min, executor, aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo89a(Object obj, int i, int i2, boolean z, Executor executor, C0081a aVar) {
            int i3;
            Integer num = (Integer) obj;
            if (num == null) {
                i3 = 0;
            } else {
                i3 = num.intValue();
            }
            this.f252a.mo169a(false, i3, i, i2, executor, aVar);
        }
    }

    /* renamed from: android.arch.b.l$b */
    public static abstract class C0099b<T> {
    }

    /* renamed from: android.arch.b.l$c */
    static class C0100c<T> extends C0099b<T> {

        /* renamed from: a */
        final C0068c<T> f253a;

        /* renamed from: b */
        private final boolean f254b;

        /* renamed from: c */
        private final int f255c;

        C0100c(C0097l lVar, boolean z, int i, C0081a<T> aVar) {
            this.f253a = new C0068c<>(lVar, 0, null, aVar);
            this.f254b = z;
            this.f255c = i;
            if (this.f255c <= 0) {
                throw new IllegalArgumentException("Page size must be non-negative");
            }
        }
    }

    /* renamed from: android.arch.b.l$d */
    public static class C0101d {

        /* renamed from: a */
        public final int f256a;

        /* renamed from: b */
        public final int f257b;

        /* renamed from: c */
        public final int f258c;

        /* renamed from: d */
        public final boolean f259d;

        public C0101d(int i, int i2, int i3, boolean z) {
            this.f256a = i;
            this.f257b = i2;
            this.f258c = i3;
            this.f259d = z;
        }
    }

    /* renamed from: android.arch.b.l$e */
    public static abstract class C0102e<T> {
        /* renamed from: a */
        public abstract void mo170a(List<T> list);
    }

    /* renamed from: android.arch.b.l$f */
    static class C0103f<T> extends C0102e<T> {

        /* renamed from: a */
        private C0068c<T> f260a;

        /* renamed from: b */
        private final int f261b;

        /* renamed from: a */
        public final void mo170a(List<T> list) {
            if (!this.f260a.mo113a()) {
                this.f260a.mo111a(new C0080g<>(list, 0, 0, this.f261b));
            }
        }

        C0103f(C0097l lVar, int i, int i2, Executor executor, C0081a<T> aVar) {
            this.f260a = new C0068c<>(lVar, i, executor, aVar);
            this.f261b = i2;
        }
    }

    /* renamed from: android.arch.b.l$g */
    public static class C0104g {

        /* renamed from: a */
        public final int f262a;

        /* renamed from: b */
        public final int f263b;

        public C0104g(int i, int i2) {
            this.f262a = i;
            this.f263b = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo168a(int i, int i2, int i3, Executor executor, C0081a<T> aVar) {
        C0103f fVar = new C0103f(this, i, i2, executor, aVar);
        if (i3 == 0) {
            fVar.mo170a(Collections.emptyList());
        } else {
            new C0104g(i2, i3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo169a(boolean z, int i, int i2, int i3, Executor executor, C0081a<T> aVar) {
        C0100c cVar = new C0100c(this, z, i3, aVar);
        new C0101d(i, i2, i3, z);
        cVar.f253a.mo112a(executor);
    }
}
