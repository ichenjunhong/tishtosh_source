package kotlinx.coroutines;

import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.p2633b.p2634a.C52616d;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.an */
class C53208an<T> extends C53190a<T> implements C53207am<T> {

    @C52618f(mo110254b = "Builders.common.kt", mo110255c = {99}, mo110256d = "await$suspendImpl", mo110257e = "kotlinx.coroutines.DeferredCoroutine")
    /* renamed from: kotlinx.coroutines.an$a */
    static final class C53209a extends C52616d {

        /* renamed from: a */
        /* synthetic */ Object f131783a;

        /* renamed from: b */
        int f131784b;

        /* renamed from: c */
        final /* synthetic */ C53208an f131785c;

        /* renamed from: d */
        Object f131786d;

        C53209a(C53208an anVar, C52625c cVar) {
            this.f131785c = anVar;
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f131783a = obj;
            this.f131784b |= DynamicTabYellowPointVersion.DEFAULT;
            return C53208an.m113043a(this.f131785c, this);
        }
    }

    /* renamed from: a */
    public final Object mo110779a(C52625c<? super T> cVar) {
        return m113043a(this, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo110780h() {
        return true;
    }

    public C53208an(C52628e eVar, boolean z) {
        C52711k.m112240b(eVar, "parentContext");
        super(eVar, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object m113043a(kotlinx.coroutines.C53208an r5, p2628d.p2631c.C52625c r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.C53208an.C53209a
            if (r0 == 0) goto L_0x0014
            r0 = r6
            kotlinx.coroutines.an$a r0 = (kotlinx.coroutines.C53208an.C53209a) r0
            int r1 = r0.f131784b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.f131784b
            int r6 = r6 - r2
            r0.f131784b = r6
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.an$a r0 = new kotlinx.coroutines.an$a
            r0.<init>(r5, r6)
        L_0x0019:
            java.lang.Object r6 = r0.f131783a
            java.lang.Object r1 = p2628d.p2631c.p2632a.C52601b.m112157a()
            int r2 = r0.f131784b
            switch(r2) {
                case 0: goto L_0x0037;
                case 1: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002c:
            boolean r5 = r6 instanceof p2628d.C52848o.C52850b
            if (r5 != 0) goto L_0x0032
            goto L_0x00a0
        L_0x0032:
            d.o$b r6 = (p2628d.C52848o.C52850b) r6
            java.lang.Throwable r5 = r6.exception
            throw r5
        L_0x0037:
            boolean r2 = r6 instanceof p2628d.C52848o.C52850b
            if (r2 != 0) goto L_0x00a1
            r0.f131786d = r5
            r6 = 1
            r0.f131784b = r6
        L_0x0040:
            java.lang.Object r6 = r5.mo110883n()
            boolean r2 = r6 instanceof kotlinx.coroutines.C53258bg
            if (r2 != 0) goto L_0x0069
            boolean r5 = r6 instanceof kotlinx.coroutines.C53354t
            if (r5 == 0) goto L_0x0063
            kotlinx.coroutines.t r6 = (kotlinx.coroutines.C53354t) r6
            java.lang.Throwable r5 = r6.f131987b
            boolean r6 = kotlinx.coroutines.internal.C53331t.m113361b(r5)
            if (r6 != 0) goto L_0x0062
            boolean r6 = r0 instanceof p2628d.p2631c.p2633b.p2634a.C52617e
            if (r6 != 0) goto L_0x005b
            throw r5
        L_0x005b:
            d.c.b.a.e r0 = (p2628d.p2631c.p2633b.p2634a.C52617e) r0
            java.lang.Throwable r5 = kotlinx.coroutines.internal.C53331t.m113354a(r5, r0)
            throw r5
        L_0x0062:
            throw r5
        L_0x0063:
            java.lang.Object r5 = kotlinx.coroutines.C53277bt.m113248b(r6)
        L_0x0067:
            r6 = r5
            goto L_0x009d
        L_0x0069:
            int r6 = super.mo110875a(r6)
            if (r6 >= 0) goto L_0x0070
            goto L_0x0040
        L_0x0070:
            kotlinx.coroutines.bs$a r6 = new kotlinx.coroutines.bs$a
            d.c.c r2 = p2628d.p2631c.p2632a.C52601b.m112154a(r0)
            r6.<init>(r2, r5)
            r2 = r6
            kotlinx.coroutines.j r2 = (kotlinx.coroutines.C53342j) r2
            kotlinx.coroutines.cb r3 = new kotlinx.coroutines.cb
            r4 = r6
            kotlinx.coroutines.k r4 = (kotlinx.coroutines.C53343k) r4
            r3.<init>(r5, r4)
            kotlinx.coroutines.w r3 = (kotlinx.coroutines.C53357w) r3
            d.f.a.b r3 = (p2628d.p2639f.p2640a.C52671b) r3
            kotlinx.coroutines.aw r5 = r5.mo110859a(r3)
            kotlinx.coroutines.C53344l.m113407a(r2, r5)
            java.lang.Object r5 = r6.mo110937b()
            java.lang.Object r6 = p2628d.p2631c.p2632a.C52601b.m112157a()
            if (r5 != r6) goto L_0x0067
            p2628d.p2631c.p2633b.p2634a.C52620h.m112171b(r0)
            goto L_0x0067
        L_0x009d:
            if (r6 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            return r6
        L_0x00a1:
            d.o$b r6 = (p2628d.C52848o.C52850b) r6
            java.lang.Throwable r5 = r6.exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53208an.m113043a(kotlinx.coroutines.an, d.c.c):java.lang.Object");
    }
}
