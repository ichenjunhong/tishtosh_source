package com.bytedance.jedi.p725a.p739i;

import java.util.List;
import p2628d.C52847n;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.jedi.a.i.a */
public abstract class C11682a<K, V, K1, V1> {

    /* renamed from: a */
    public static final C11686b f31134a = new C11686b(null);

    /* renamed from: com.bytedance.jedi.a.i.a$a */
    public static final class C11683a<K, V, K1, V1> extends C11682a<K, V, K1, V1> {

        /* renamed from: b */
        public C52671b<? super V, ? extends List<? extends C52847n<? extends K1, ? extends V1>>> f31135b;

        /* renamed from: c */
        public C52682m<? super V1, ? super V1, ? extends V1> f31136c;

        public C11683a() {
            this(null, null, 3, null);
        }

        /* renamed from: a */
        public final void mo22473a(C52671b<? super V, ? extends List<? extends C52847n<? extends K1, ? extends V1>>> bVar) {
            C52711k.m112240b(bVar, "block");
            this.f31135b = bVar;
        }

        private C11683a(C52671b<? super V, ? extends List<? extends C52847n<? extends K1, ? extends V1>>> bVar, C52682m<? super V1, ? super V1, ? extends V1> mVar) {
            C52711k.m112240b(bVar, "batch");
            C52711k.m112240b(mVar, "merge");
            super(null);
            this.f31135b = bVar;
            this.f31136c = mVar;
        }

        public /* synthetic */ C11683a(C52671b bVar, C52682m mVar, int i, C52707g gVar) {
            this(C116841.f31137a, C116852.f31138a);
        }
    }

    /* renamed from: com.bytedance.jedi.a.i.a$b */
    public static final class C11686b {

        /* renamed from: com.bytedance.jedi.a.i.a$b$a */
        static final class C11687a extends C52712l implements C52682m<K, V, K1> {

            /* renamed from: a */
            public static final C11687a f31139a = new C11687a();

            C11687a() {
                super(2);
            }

            /* JADX WARNING: Incorrect type for immutable var: ssa=K, code=java.lang.Object, for r1v0, types: [java.lang.Object, K] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final K1 invoke(java.lang.Object r1, V r2) {
                /*
                    r0 = this;
                    boolean r2 = r1 instanceof java.lang.Object
                    if (r2 != 0) goto L_0x0005
                    r1 = 0
                L_0x0005:
                    if (r1 == 0) goto L_0x0008
                    return r1
                L_0x0008:
                    java.lang.RuntimeException r1 = new java.lang.RuntimeException
                    r1.<init>()
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.p725a.p739i.C11682a.C11686b.C11687a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: com.bytedance.jedi.a.i.a$b$b */
        static final class C11688b extends C52712l implements C52682m<V, V1, Boolean> {

            /* renamed from: a */
            public static final C11688b f31140a = new C11688b();

            C11688b() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(true);
            }
        }

        private C11686b() {
        }

        public /* synthetic */ C11686b(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ C11682a m24025a(C11686b bVar, C52682m mVar, C52682m mVar2, int i, Object obj) {
            C52682m mVar3 = C11688b.f31140a;
            C52711k.m112240b(mVar3, "predicate");
            C52711k.m112240b(mVar2, "merge");
            return new C11692d(mVar3, mVar2);
        }

        /* renamed from: a */
        public static /* synthetic */ C11682a m24026a(C11686b bVar, C52682m mVar, C52686q qVar, int i, Object obj) {
            C52682m mVar2 = C11687a.f31139a;
            C52711k.m112240b(mVar2, "key");
            C52711k.m112240b(qVar, "merge");
            return new C11689c(mVar2, qVar);
        }
    }

    /* renamed from: com.bytedance.jedi.a.i.a$c */
    public static final class C11689c<K, V, K1, V1> extends C11682a<K, V, K1, V1> {

        /* renamed from: b */
        public C52682m<? super K, ? super V, ? extends K1> f31141b;

        /* renamed from: c */
        public C52686q<? super K, ? super V, ? super V1, ? extends V1> f31142c;

        public C11689c() {
            this(null, null, 3, null);
        }

        /* renamed from: a */
        public final void mo22474a(C52682m<? super K, ? super V, ? extends K1> mVar) {
            C52711k.m112240b(mVar, "block");
            this.f31141b = mVar;
        }

        /* renamed from: a */
        public final void mo22475a(C52686q<? super K, ? super V, ? super V1, ? extends V1> qVar) {
            C52711k.m112240b(qVar, "block");
            this.f31142c = qVar;
        }

        public C11689c(C52682m<? super K, ? super V, ? extends K1> mVar, C52686q<? super K, ? super V, ? super V1, ? extends V1> qVar) {
            C52711k.m112240b(mVar, "key");
            C52711k.m112240b(qVar, "merge");
            super(null);
            this.f31141b = mVar;
            this.f31142c = qVar;
        }

        public /* synthetic */ C11689c(C52682m mVar, C52686q qVar, int i, C52707g gVar) {
            this(C116901.f31143a, C116912.f31144a);
        }
    }

    /* renamed from: com.bytedance.jedi.a.i.a$d */
    public static final class C11692d<K, V, K1, V1> extends C11682a<K, V, K1, V1> {

        /* renamed from: b */
        public C52682m<? super V, ? super V1, Boolean> f31145b;

        /* renamed from: c */
        public C52682m<? super V, ? super V1, ? extends V1> f31146c;

        public C11692d() {
            this(null, null, 3, null);
        }

        /* renamed from: a */
        public final void mo22476a(C52682m<? super V, ? super V1, Boolean> mVar) {
            C52711k.m112240b(mVar, "block");
            this.f31145b = mVar;
        }

        /* renamed from: b */
        public final void mo22477b(C52682m<? super V, ? super V1, ? extends V1> mVar) {
            C52711k.m112240b(mVar, "block");
            this.f31146c = mVar;
        }

        public C11692d(C52682m<? super V, ? super V1, Boolean> mVar, C52682m<? super V, ? super V1, ? extends V1> mVar2) {
            C52711k.m112240b(mVar, "predicate");
            C52711k.m112240b(mVar2, "merge");
            super(null);
            this.f31145b = mVar;
            this.f31146c = mVar2;
        }

        public /* synthetic */ C11692d(C52682m mVar, C52682m mVar2, int i, C52707g gVar) {
            this(C116931.f31147a, C116942.f31148a);
        }
    }

    private C11682a() {
    }

    public /* synthetic */ C11682a(C52707g gVar) {
        this();
    }
}
