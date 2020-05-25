package p2628d.p2650m;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.p2642a.C52695a;
import p2628d.p2647j.C52751c;
import p2628d.p2647j.C52753d;
import p2628d.p2649l.C52785g;

/* renamed from: d.m.e */
final class C52809e implements C52785g<C52751c> {

    /* renamed from: a */
    public final CharSequence f131050a;

    /* renamed from: b */
    public final int f131051b;

    /* renamed from: c */
    public final int f131052c;

    /* renamed from: d */
    public final C52682m<CharSequence, Integer, C52847n<Integer, Integer>> f131053d;

    /* renamed from: d.m.e$a */
    public static final class C52810a implements C52695a, Iterator<C52751c> {

        /* renamed from: a */
        public int f131054a = -1;

        /* renamed from: b */
        public int f131055b;

        /* renamed from: c */
        public int f131056c;

        /* renamed from: d */
        public C52751c f131057d;

        /* renamed from: e */
        public int f131058e;

        /* renamed from: f */
        final /* synthetic */ C52809e f131059f;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f131054a == -1) {
                m112367a();
            }
            if (this.f131054a == 1) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ Object next() {
            if (this.f131054a == -1) {
                m112367a();
            }
            if (this.f131054a != 0) {
                C52751c cVar = this.f131057d;
                if (cVar != null) {
                    this.f131057d = null;
                    this.f131054a = -1;
                    return cVar;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
            if (r6.f131058e < r6.f131059f.f131052c) goto L_0x0020;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m112367a() {
            /*
                r6 = this;
                int r0 = r6.f131056c
                r1 = 0
                if (r0 >= 0) goto L_0x000b
                r6.f131054a = r1
                r0 = 0
                r6.f131057d = r0
                return
            L_0x000b:
                d.m.e r0 = r6.f131059f
                int r0 = r0.f131052c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0020
                int r0 = r6.f131058e
                int r0 = r0 + r3
                r6.f131058e = r0
                int r0 = r6.f131058e
                d.m.e r4 = r6.f131059f
                int r4 = r4.f131052c
                if (r0 >= r4) goto L_0x002c
            L_0x0020:
                int r0 = r6.f131056c
                d.m.e r4 = r6.f131059f
                java.lang.CharSequence r4 = r4.f131050a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0040
            L_0x002c:
                int r0 = r6.f131055b
                d.j.c r1 = new d.j.c
                d.m.e r4 = r6.f131059f
                java.lang.CharSequence r4 = r4.f131050a
                int r4 = p2628d.p2650m.C52830p.m112461f(r4)
                r1.<init>(r0, r4)
                r6.f131057d = r1
                r6.f131056c = r2
                goto L_0x0091
            L_0x0040:
                d.m.e r0 = r6.f131059f
                d.f.a.m<java.lang.CharSequence, java.lang.Integer, d.n<java.lang.Integer, java.lang.Integer>> r0 = r0.f131053d
                d.m.e r4 = r6.f131059f
                java.lang.CharSequence r4 = r4.f131050a
                int r5 = r6.f131056c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                d.n r0 = (p2628d.C52847n) r0
                if (r0 != 0) goto L_0x006a
                int r0 = r6.f131055b
                d.j.c r1 = new d.j.c
                d.m.e r4 = r6.f131059f
                java.lang.CharSequence r4 = r4.f131050a
                int r4 = p2628d.p2650m.C52830p.m112461f(r4)
                r1.<init>(r0, r4)
                r6.f131057d = r1
                r6.f131056c = r2
                goto L_0x0091
            L_0x006a:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f131055b
                d.j.c r4 = p2628d.p2647j.C52753d.m112320b(r4, r2)
                r6.f131057d = r4
                int r2 = r2 + r0
                r6.f131055b = r2
                int r2 = r6.f131055b
                if (r0 != 0) goto L_0x008e
                r1 = 1
            L_0x008e:
                int r2 = r2 + r1
                r6.f131056c = r2
            L_0x0091:
                r6.f131054a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p2628d.p2650m.C52809e.C52810a.m112367a():void");
        }

        C52810a(C52809e eVar) {
            this.f131059f = eVar;
            this.f131055b = C52753d.m112315a(eVar.f131051b, 0, eVar.f131050a.length());
            this.f131056c = this.f131055b;
        }
    }

    /* renamed from: a */
    public final Iterator<C52751c> mo110157a() {
        return new C52810a<>(this);
    }

    public C52809e(CharSequence charSequence, int i, int i2, C52682m<? super CharSequence, ? super Integer, C52847n<Integer, Integer>> mVar) {
        C52711k.m112240b(charSequence, "input");
        C52711k.m112240b(mVar, "getNextMatch");
        this.f131050a = charSequence;
        this.f131051b = i;
        this.f131052c = i2;
        this.f131053d = mVar;
    }
}
