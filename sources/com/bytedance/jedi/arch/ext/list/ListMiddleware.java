package com.bytedance.jedi.arch.ext.list;

import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11797e;
import com.bytedance.jedi.arch.C11911k;
import com.bytedance.jedi.arch.C11912l;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.p744a.C11839a;
import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C2201v;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.C52862z;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2648k.C52771j;

public final class ListMiddleware<S extends C11932s, T, P extends C11865l> extends C11912l<S, ListState<T, P>> implements C11850b {

    /* renamed from: e */
    private final C52668f<C118151> f31348e;

    /* renamed from: f */
    private final C52671b<S, C2201v<C52847n<List<T>, P>>> f31349f;

    /* renamed from: g */
    private final C52671b<S, C2201v<C52847n<List<T>, P>>> f31350g;

    /* renamed from: h */
    private final C52682m<List<? extends T>, List<? extends T>, List<T>> f31351h;

    /* renamed from: i */
    private final C52682m<List<? extends T>, List<? extends T>, List<T>> f31352i;

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$a */
    static final class C11807a extends C52712l implements C52682m<S, ListState<T, P>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31353a;

        /* renamed from: b */
        final /* synthetic */ C52671b f31354b;

        /* renamed from: c */
        final /* synthetic */ C52682m f31355c;

        C11807a(ListMiddleware listMiddleware, C52671b bVar, C52682m mVar) {
            this.f31353a = listMiddleware;
            this.f31354b = bVar;
            this.f31355c = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11932s sVar = (C11932s) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(sVar, "state");
            C52711k.m112240b(listState, "substate");
            if (listState.getHasMore().f31440a && !(listState.getLoadMore() instanceof C11911k)) {
                this.f31353a.mo22629a((C2201v) this.f31354b.invoke(sVar), (C52682m<? super PROP, ? super C11787a<? extends T>, ? extends PROP>) new C52682m<ListState<T, P>, C11787a<? extends C52847n<? extends List<? extends T>, ? extends P>>, ListState<T, P>>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C11807a f31356a;

                    {
                        this.f31356a = r1;
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0057, code lost:
                        if (r0 == null) goto L_0x0059;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:7:0x006c, code lost:
                        if (r0 == null) goto L_0x006e;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
                        /*
                            r11 = this;
                            com.bytedance.jedi.arch.ext.list.ListState r12 = (com.bytedance.jedi.arch.ext.list.ListState) r12
                            com.bytedance.jedi.arch.a r13 = (com.bytedance.jedi.arch.C11787a) r13
                            java.lang.String r0 = "$receiver"
                            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
                            java.lang.String r0 = "loadMore"
                            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
                            java.lang.Object r0 = r13.mo22538a()
                            d.n r0 = (p2628d.C52847n) r0
                            if (r0 == 0) goto L_0x006e
                            java.lang.Object r1 = r0.component1()
                            r8 = r1
                            java.util.List r8 = (java.util.List) r8
                            java.lang.Object r0 = r0.component2()
                            r1 = r0
                            com.bytedance.jedi.arch.ext.list.l r1 = (com.bytedance.jedi.arch.ext.list.C11865l) r1
                            com.bytedance.jedi.arch.ext.list.ListMiddleware$a r0 = r11.f31356a
                            com.bytedance.jedi.arch.ext.list.ListMiddleware r0 = r0.f31353a
                            int r2 = r8.size()
                            r3 = 0
                            r0.mo22562a(r2, r3)
                            com.bytedance.jedi.arch.ext.list.ListMiddleware$a r0 = r11.f31356a
                            d.f.a.m r0 = r0.f31355c
                            java.util.List r2 = r12.getList()
                            java.lang.Object r0 = r0.invoke(r2, r8)
                            r9 = r0
                            java.util.List r9 = (java.util.List) r9
                            com.bytedance.jedi.arch.ext.list.b r10 = com.bytedance.jedi.arch.ext.list.ListMiddleware.m24162a(r12, r9)
                            if (r1 == 0) goto L_0x0059
                            com.bytedance.jedi.arch.w r0 = new com.bytedance.jedi.arch.w
                            r0.<init>(r8)
                            r4 = r0
                            com.bytedance.jedi.arch.a r4 = (com.bytedance.jedi.arch.C11787a) r4
                            r3 = 0
                            r6 = 4
                            r7 = 0
                            r0 = r12
                            r2 = r9
                            r5 = r10
                            com.bytedance.jedi.arch.ext.list.ListState r0 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                            if (r0 != 0) goto L_0x006c
                        L_0x0059:
                            r1 = 0
                            r3 = 0
                            com.bytedance.jedi.arch.w r0 = new com.bytedance.jedi.arch.w
                            r0.<init>(r8)
                            r4 = r0
                            com.bytedance.jedi.arch.a r4 = (com.bytedance.jedi.arch.C11787a) r4
                            r6 = 5
                            r7 = 0
                            r0 = r12
                            r2 = r9
                            r5 = r10
                            com.bytedance.jedi.arch.ext.list.ListState r0 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                        L_0x006c:
                            if (r0 != 0) goto L_0x00a9
                        L_0x006e:
                            boolean r0 = r13 instanceof com.bytedance.jedi.arch.C11795c
                            if (r0 == 0) goto L_0x0095
                            com.bytedance.jedi.arch.ext.list.ListMiddleware$a r0 = r11.f31356a
                            com.bytedance.jedi.arch.ext.list.ListMiddleware r0 = r0.f31353a
                            r1 = 0
                            com.bytedance.jedi.arch.c r13 = (com.bytedance.jedi.arch.C11795c) r13
                            java.lang.Throwable r2 = r13.f31301a
                            r0.mo22562a(r1, r2)
                            r1 = 0
                            r2 = 0
                            r3 = 0
                            com.bytedance.jedi.arch.c r0 = new com.bytedance.jedi.arch.c
                            java.lang.Throwable r13 = r13.f31301a
                            r0.<init>(r13)
                            r4 = r0
                            com.bytedance.jedi.arch.a r4 = (com.bytedance.jedi.arch.C11787a) r4
                            r5 = 0
                            r6 = 23
                            r7 = 0
                            r0 = r12
                            com.bytedance.jedi.arch.ext.list.ListState r12 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                            return r12
                        L_0x0095:
                            r1 = 0
                            r2 = 0
                            r3 = 0
                            com.bytedance.jedi.arch.k r13 = new com.bytedance.jedi.arch.k
                            r13.<init>()
                            r4 = r13
                            com.bytedance.jedi.arch.a r4 = (com.bytedance.jedi.arch.C11787a) r4
                            r5 = 0
                            r6 = 23
                            r7 = 0
                            r0 = r12
                            com.bytedance.jedi.arch.ext.list.ListState r0 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                        L_0x00a9:
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListMiddleware.C11807a.C118081.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$b */
    static final class C11809b extends C52712l implements C52682m<S, ListState<T, P>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31357a;

        /* renamed from: b */
        final /* synthetic */ C52671b f31358b;

        /* renamed from: c */
        final /* synthetic */ C52682m f31359c;

        C11809b(ListMiddleware listMiddleware, C52671b bVar, C52682m mVar) {
            this.f31357a = listMiddleware;
            this.f31358b = bVar;
            this.f31359c = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11932s sVar = (C11932s) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(sVar, "state");
            C52711k.m112240b(listState, "substate");
            if (!(listState.getRefresh() instanceof C11911k)) {
                this.f31357a.mo22629a((C2201v) this.f31358b.invoke(sVar), (C52682m<? super PROP, ? super C11787a<? extends T>, ? extends PROP>) new C52682m<ListState<T, P>, C11787a<? extends C52847n<? extends List<? extends T>, ? extends P>>, ListState<T, P>>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C11809b f31360a;

                    {
                        this.f31360a = r1;
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004c, code lost:
                        if (r0 == null) goto L_0x004e;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0062, code lost:
                        if (r0 == null) goto L_0x0064;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
                        /*
                            r11 = this;
                            com.bytedance.jedi.arch.ext.list.ListState r12 = (com.bytedance.jedi.arch.ext.list.ListState) r12
                            com.bytedance.jedi.arch.a r13 = (com.bytedance.jedi.arch.C11787a) r13
                            java.lang.String r0 = "$receiver"
                            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
                            java.lang.String r0 = "refresh"
                            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
                            java.lang.Object r0 = r13.mo22538a()
                            d.n r0 = (p2628d.C52847n) r0
                            if (r0 == 0) goto L_0x0064
                            java.lang.Object r1 = r0.component1()
                            r8 = r1
                            java.util.List r8 = (java.util.List) r8
                            java.lang.Object r0 = r0.component2()
                            r1 = r0
                            com.bytedance.jedi.arch.ext.list.l r1 = (com.bytedance.jedi.arch.ext.list.C11865l) r1
                            com.bytedance.jedi.arch.ext.list.ListMiddleware$b r0 = r11.f31360a
                            d.f.a.m r0 = r0.f31359c
                            java.util.List r2 = r12.getList()
                            java.lang.Object r0 = r0.invoke(r2, r8)
                            r9 = r0
                            java.util.List r9 = (java.util.List) r9
                            com.bytedance.jedi.arch.ext.list.b r10 = com.bytedance.jedi.arch.ext.list.ListMiddleware.m24162a(r12, r9)
                            if (r1 == 0) goto L_0x004e
                            com.bytedance.jedi.arch.w r0 = new com.bytedance.jedi.arch.w
                            r0.<init>(r8)
                            r3 = r0
                            com.bytedance.jedi.arch.a r3 = (com.bytedance.jedi.arch.C11787a) r3
                            r4 = 0
                            r6 = 8
                            r7 = 0
                            r0 = r12
                            r2 = r9
                            r5 = r10
                            com.bytedance.jedi.arch.ext.list.ListState r0 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                            if (r0 != 0) goto L_0x0062
                        L_0x004e:
                            r1 = 0
                            com.bytedance.jedi.arch.w r0 = new com.bytedance.jedi.arch.w
                            r0.<init>(r8)
                            r3 = r0
                            com.bytedance.jedi.arch.a r3 = (com.bytedance.jedi.arch.C11787a) r3
                            r4 = 0
                            r6 = 9
                            r7 = 0
                            r0 = r12
                            r2 = r9
                            r5 = r10
                            com.bytedance.jedi.arch.ext.list.ListState r0 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                        L_0x0062:
                            if (r0 != 0) goto L_0x0095
                        L_0x0064:
                            boolean r0 = r13 instanceof com.bytedance.jedi.arch.C11795c
                            if (r0 == 0) goto L_0x0081
                            r1 = 0
                            r2 = 0
                            com.bytedance.jedi.arch.c r0 = new com.bytedance.jedi.arch.c
                            com.bytedance.jedi.arch.c r13 = (com.bytedance.jedi.arch.C11795c) r13
                            java.lang.Throwable r13 = r13.f31301a
                            r0.<init>(r13)
                            r3 = r0
                            com.bytedance.jedi.arch.a r3 = (com.bytedance.jedi.arch.C11787a) r3
                            r4 = 0
                            r5 = 0
                            r6 = 27
                            r7 = 0
                            r0 = r12
                            com.bytedance.jedi.arch.ext.list.ListState r12 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                            return r12
                        L_0x0081:
                            r1 = 0
                            r2 = 0
                            com.bytedance.jedi.arch.k r13 = new com.bytedance.jedi.arch.k
                            r13.<init>()
                            r3 = r13
                            com.bytedance.jedi.arch.a r3 = (com.bytedance.jedi.arch.C11787a) r3
                            r4 = 0
                            r5 = 0
                            r6 = 27
                            r7 = 0
                            r0 = r12
                            com.bytedance.jedi.arch.ext.list.ListState r0 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                        L_0x0095:
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListMiddleware.C11809b.C118101.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$c */
    static final class C11811c extends C52712l implements C52671b<ListState<T, P>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31361a;

        /* renamed from: b */
        final /* synthetic */ int f31362b;

        /* renamed from: c */
        final /* synthetic */ Object f31363c;

        C11811c(ListMiddleware listMiddleware, int i, Object obj) {
            this.f31361a = listMiddleware;
            this.f31362b = i;
            this.f31363c = obj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            ListState listState = (ListState) obj;
            C52711k.m112240b(listState, "it");
            if (this.f31362b < 0 || this.f31362b >= listState.getList().size()) {
                z = false;
            } else {
                z = true;
            }
            if (!C52862z.f131110a || z) {
                List e = C52575l.m112139e((Collection<? extends T>) listState.getList());
                e.add(this.f31362b, this.f31363c);
                this.f31361a.mo22564a(e);
                return C52860x.f131107a;
            }
            throw new AssertionError("Assertion failed");
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$d */
    static final class C11812d extends C52712l implements C52671b<ListState<T, P>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31364a;

        /* renamed from: b */
        final /* synthetic */ int f31365b;

        /* renamed from: c */
        final /* synthetic */ List f31366c;

        C11812d(ListMiddleware listMiddleware, int i, List list) {
            this.f31364a = listMiddleware;
            this.f31365b = i;
            this.f31366c = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            ListState listState = (ListState) obj;
            C52711k.m112240b(listState, "it");
            if (this.f31365b < 0 || this.f31365b >= listState.getList().size()) {
                z = false;
            } else {
                z = true;
            }
            if (!C52862z.f131110a || z) {
                List e = C52575l.m112139e((Collection<? extends T>) listState.getList());
                e.addAll(this.f31365b, this.f31366c);
                this.f31364a.mo22564a(e);
                return C52860x.f131107a;
            }
            throw new AssertionError("Assertion failed");
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$e */
    static final class C11813e extends C52712l implements C52671b<ListState<T, P>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31367a;

        /* renamed from: b */
        final /* synthetic */ int f31368b;

        /* renamed from: c */
        final /* synthetic */ Object f31369c;

        C11813e(ListMiddleware listMiddleware, int i, Object obj) {
            this.f31367a = listMiddleware;
            this.f31368b = i;
            this.f31369c = obj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            ListState listState = (ListState) obj;
            C52711k.m112240b(listState, "it");
            if (this.f31368b < 0 || this.f31368b >= listState.getList().size()) {
                z = false;
            } else {
                z = true;
            }
            if (!C52862z.f131110a || z) {
                List e = C52575l.m112139e((Collection<? extends T>) listState.getList());
                e.set(this.f31368b, this.f31369c);
                this.f31367a.mo22564a(e);
                return C52860x.f131107a;
            }
            throw new AssertionError("Assertion failed");
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$f */
    static final class C11814f extends C52712l implements C52670a<C118151> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31370a;

        C11814f(ListMiddleware listMiddleware) {
            this.f31370a = listMiddleware;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C11839a(this) {

                /* renamed from: a */
                final /* synthetic */ C11814f f31371a;

                /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$f$1$a */
                static final class C11816a extends C52712l implements C52671b<ListState<T, P>, C52860x> {

                    /* renamed from: a */
                    final /* synthetic */ C52671b f31372a;

                    C11816a(C52671b bVar) {
                        this.f31372a = bVar;
                        super(1);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        ListState listState = (ListState) obj;
                        C52711k.m112240b(listState, "it");
                        if (listState.getHasMore().f31440a) {
                            this.f31372a.invoke(Integer.valueOf(listState.getList().size()));
                        }
                        return C52860x.f131107a;
                    }
                }

                /* renamed from: a */
                public final void mo22568a() {
                    this.f31371a.f31370a.mo22567c();
                }

                {
                    this.f31371a = r1;
                }

                /* renamed from: a */
                public final void mo22569a(C52671b<? super Integer, C52860x> bVar) {
                    C52711k.m112240b(bVar, "itemCountSupplier");
                    this.f31371a.f31370a.mo22633a((C52671b<? super PROP, C52860x>) new C11816a<Object,C52860x>(bVar));
                }
            };
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$g */
    public static final class C11817g extends C52712l implements C52671b<ListState<T, P>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31373a;

        /* renamed from: b */
        final /* synthetic */ int f31374b;

        public C11817g(ListMiddleware listMiddleware, int i) {
            this.f31373a = listMiddleware;
            this.f31374b = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            ListState listState = (ListState) obj;
            C52711k.m112240b(listState, "it");
            if (this.f31374b < 0 || this.f31374b >= listState.getList().size()) {
                z = false;
            } else {
                z = true;
            }
            if (!C52862z.f131110a || z) {
                List e = C52575l.m112139e((Collection<? extends T>) listState.getList());
                e.remove(this.f31374b);
                this.f31373a.mo22564a(e);
                return C52860x.f131107a;
            }
            throw new AssertionError("Assertion failed");
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$h */
    static final class C11818h extends C52712l implements C52682m<RECEIVER, List<? extends T>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C11837a f31375a;

        /* renamed from: b */
        final /* synthetic */ ListMiddleware f31376b;

        /* renamed from: c */
        final /* synthetic */ C11797e f31377c;

        /* renamed from: d */
        final /* synthetic */ boolean f31378d;

        /* renamed from: e */
        final /* synthetic */ boolean f31379e;

        /* renamed from: f */
        final /* synthetic */ C52671b f31380f;

        C11818h(C11837a aVar, ListMiddleware listMiddleware, C11797e eVar, boolean z, boolean z2, C52671b bVar) {
            this.f31375a = aVar;
            this.f31376b = listMiddleware;
            this.f31377c = eVar;
            this.f31378d = z;
            this.f31379e = z2;
            this.f31380f = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52670a aVar;
            final C11796d dVar = (C11796d) obj;
            List list = (List) obj2;
            C52711k.m112240b(dVar, "$receiver");
            C52711k.m112240b(list, "it");
            C11837a aVar2 = this.f31375a;
            final C52671b bVar = this.f31380f;
            if (bVar != null) {
                aVar = new C52670a<C52860x>() {
                    public final /* bridge */ /* synthetic */ Object invoke() {
                        bVar.invoke(dVar);
                        return C52860x.f131107a;
                    }
                };
            } else {
                aVar = null;
            }
            aVar2.mo22590a(list, aVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$i */
    static final class C11820i extends C52712l implements C52682m<RECEIVER, P, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52682m f31383a;

        C11820i(C52682m mVar) {
            this.f31383a = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11796d dVar = (C11796d) obj;
            C11865l lVar = (C11865l) obj2;
            C52711k.m112240b(dVar, "$receiver");
            C52711k.m112240b(lVar, "it");
            this.f31383a.invoke(dVar, lVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$j */
    static final class C11821j extends C52712l implements C52682m<RECEIVER, C11853b, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52682m f31384a;

        C11821j(C52682m mVar) {
            this.f31384a = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11796d dVar = (C11796d) obj;
            C11853b bVar = (C11853b) obj2;
            C52711k.m112240b(dVar, "$receiver");
            C52711k.m112240b(bVar, "it");
            this.f31384a.invoke(dVar, Boolean.valueOf(bVar.f31440a));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$k */
    static final class C11822k extends C52712l implements C52682m<RECEIVER, C11853b, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52682m f31385a;

        C11822k(C52682m mVar) {
            this.f31385a = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11796d dVar = (C11796d) obj;
            C11853b bVar = (C11853b) obj2;
            C52711k.m112240b(dVar, "$receiver");
            C52711k.m112240b(bVar, "it");
            this.f31385a.invoke(dVar, Boolean.valueOf(bVar.f31440a));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$l */
    static final class C11823l extends C52712l implements C52682m<RECEIVER, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C11854c f31386a;

        C11823l(C11854c cVar) {
            this.f31386a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11796d dVar = (C11796d) obj;
            Throwable th = (Throwable) obj2;
            C52711k.m112240b(dVar, "$receiver");
            C52711k.m112240b(th, "it");
            this.f31386a.mo22602b().invoke(dVar, th);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$m */
    static final class C11824m extends C52712l implements C52671b<RECEIVER, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C11854c f31387a;

        C11824m(C11854c cVar) {
            this.f31387a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11796d dVar = (C11796d) obj;
            C52711k.m112240b(dVar, "$receiver");
            this.f31387a.mo22601a().invoke(dVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$n */
    static final class C11825n extends C52712l implements C52682m<RECEIVER, List<? extends T>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C11854c f31388a;

        C11825n(C11854c cVar) {
            this.f31388a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11796d dVar = (C11796d) obj;
            List list = (List) obj2;
            C52711k.m112240b(dVar, "$receiver");
            C52711k.m112240b(list, "it");
            this.f31388a.mo22603c().invoke(dVar, list);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$o */
    static final class C11826o extends C52712l implements C52682m<RECEIVER, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C11854c f31389a;

        C11826o(C11854c cVar) {
            this.f31389a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11796d dVar = (C11796d) obj;
            Throwable th = (Throwable) obj2;
            C52711k.m112240b(dVar, "$receiver");
            C52711k.m112240b(th, "it");
            this.f31389a.mo22602b().invoke(dVar, th);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$p */
    static final class C11827p extends C52712l implements C52671b<RECEIVER, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C11854c f31390a;

        C11827p(C11854c cVar) {
            this.f31390a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11796d dVar = (C11796d) obj;
            C52711k.m112240b(dVar, "$receiver");
            this.f31390a.mo22601a().invoke(dVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$q */
    static final class C11828q extends C52712l implements C52682m<RECEIVER, List<? extends T>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C11854c f31391a;

        C11828q(C11854c cVar) {
            this.f31391a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11796d dVar = (C11796d) obj;
            List list = (List) obj2;
            C52711k.m112240b(dVar, "$receiver");
            C52711k.m112240b(list, "it");
            this.f31391a.mo22603c().invoke(dVar, list);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$r */
    static final class C11829r extends C52712l implements C52671b<ListState<T, P>, ListState<T, P>> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31392a;

        /* renamed from: b */
        final /* synthetic */ List f31393b;

        C11829r(ListMiddleware listMiddleware, List list) {
            this.f31392a = listMiddleware;
            this.f31393b = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ListState listState = (ListState) obj;
            C52711k.m112240b(listState, "$receiver");
            return ListState.copy$default(listState, null, this.f31393b, null, null, ListMiddleware.m24162a(listState, this.f31393b), 13, null);
        }
    }

    /* renamed from: b */
    public final void mo22565b() {
        mo22634a((C52682m<? super S, ? super PROP, C52860x>) new C11809b<Object,Object,C52860x>(this, this.f31349f, this.f31351h));
    }

    /* renamed from: c */
    public final void mo22567c() {
        C52671b<S, C2201v<C52847n<List<T>, P>>> bVar = this.f31350g;
        if (bVar != null) {
            mo22634a((C52682m<? super S, ? super PROP, C52860x>) new C11807a<Object,Object,C52860x>(this, bVar, this.f31352i));
        }
    }

    /* renamed from: a */
    public final void mo22560a(int i) {
        ((C118151) this.f31348e.getValue()).mo22560a(i);
    }

    /* renamed from: a */
    public final void mo22564a(List<? extends T> list) {
        C52711k.m112240b(list, "newList");
        mo22636b(new C11829r(this, list));
    }

    /* renamed from: a */
    public static C11853b m24162a(ListState<T, P> listState, List<? extends T> list) {
        boolean isEmpty = list.isEmpty();
        if (isEmpty == listState.isEmpty().f31440a) {
            return listState.isEmpty();
        }
        return new C11853b(isEmpty);
    }

    /* renamed from: b */
    public final void mo22566b(int i, T t) {
        mo22633a((C52671b<? super PROP, C52860x>) new C11811c<Object,C52860x>(this, i, t));
    }

    /* renamed from: a */
    public final void mo22561a(int i, T t) {
        mo22633a((C52671b<? super PROP, C52860x>) new C11813e<Object,C52860x>(this, i, t));
    }

    /* renamed from: a */
    public final void mo22562a(int i, Throwable th) {
        C52668f<C118151> fVar = this.f31348e;
        if (fVar.isInitialized()) {
            ((C118151) fVar.getValue()).mo22592a(i, th);
        }
    }

    /* renamed from: a */
    public final void mo22563a(int i, List<? extends T> list) {
        C52711k.m112240b(list, "data");
        mo22633a((C52671b<? super PROP, C52860x>) new C11812d<Object,C52860x>(this, i, list));
    }

    public ListMiddleware(C52671b<? super S, ? extends C2201v<C52847n<List<T>, P>>> bVar, C52671b<? super S, ? extends C2201v<C52847n<List<T>, P>>> bVar2, C52682m<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> mVar, C52682m<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> mVar2) {
        C52711k.m112240b(bVar, "actualRefresh");
        C52711k.m112240b(mVar, "refreshStrategy");
        C52711k.m112240b(mVar2, "loadMoreStrategy");
        this.f31349f = bVar;
        this.f31350g = bVar2;
        this.f31351h = mVar;
        this.f31352i = mVar2;
        this.f31348e = C52732g.m112285a(new C11814f(this));
    }

    public /* synthetic */ ListMiddleware(C52671b bVar, C52671b bVar2, C52682m mVar, C52682m mVar2, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            bVar2 = null;
        }
        if ((i & 4) != 0) {
            mVar = C11862k.m24215a();
        }
        if ((i & 8) != 0) {
            mVar2 = C11862k.m24216b();
        }
        this(bVar, bVar2, mVar, mVar2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m24163a(ListMiddleware listMiddleware, C11797e eVar, C11837a aVar, boolean z, boolean z2, C11854c cVar, C11854c cVar2, C52682m mVar, C52682m mVar2, C52671b bVar, C52682m mVar3, int i, Object obj) {
        C11837a aVar2;
        boolean z3;
        C11854c cVar3;
        C11854c cVar4;
        C52682m mVar4;
        int i2 = i;
        C52682m mVar5 = null;
        if ((i2 & 2) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if ((i2 & 8) != 0) {
            z3 = eVar.mo22555f();
        } else {
            z3 = z2;
        }
        if ((i2 & 16) != 0) {
            cVar3 = null;
        } else {
            cVar3 = cVar;
        }
        if ((i2 & 32) != 0) {
            cVar4 = null;
        } else {
            cVar4 = cVar2;
        }
        if ((i2 & 64) != 0) {
            mVar4 = null;
        } else {
            mVar4 = mVar;
        }
        if ((i2 & 128) == 0) {
            mVar5 = mVar2;
        }
        C11797e eVar2 = eVar;
        C52711k.m112240b(eVar, "subscriber");
        if (mVar4 != null) {
            listMiddleware.mo22630a(eVar, C11856e.f31442a, z3, false, new C11821j(mVar4));
        }
        if (mVar5 != null) {
            listMiddleware.mo22630a(eVar, C11857f.f31443a, z3, false, new C11822k(mVar5));
        }
        if (cVar3 != null) {
            listMiddleware.mo22631a(eVar, C11858g.f31444a, z3, false, new C11823l(cVar3), new C11824m(cVar3), new C11825n(cVar3));
        }
        if (cVar4 != null) {
            listMiddleware.mo22631a(eVar, C11859h.f31445a, z3, false, new C11826o(cVar4), new C11827p(cVar4), new C11828q(cVar4));
        }
        if (aVar2 != null) {
            C52771j jVar = C11860i.f31446a;
            C11818h hVar = new C11818h(aVar2, listMiddleware, eVar, z3, false, null);
            listMiddleware.mo22630a(eVar, jVar, z3, false, hVar);
        }
    }
}
