package com.bytedance.jedi.arch.ext.list;

import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11911k;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.p744a.C11839a;
import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import java.util.List;
import p064c.p065a.C2201v;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

public abstract class ListViewModel<T, P extends C11865l, S extends IListState<T, P>> extends JediViewModel<S> implements C11850b {

    /* renamed from: d */
    public final C52682m<List<? extends T>, List<? extends T>, List<T>> f31394d = C11862k.m24215a();

    /* renamed from: e */
    private final C52671b<S, C2201v<C52847n<List<T>, P>>> f31395e;

    /* renamed from: f */
    private final C52682m<List<? extends T>, List<? extends T>, List<T>> f31396f = C11862k.m24216b();

    /* renamed from: g */
    private final C52668f<C118351> f31397g = C52732g.m112285a(new C11834c(this));

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$a */
    static final class C11830a extends C52712l implements C52671b<S, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f31398a;

        /* renamed from: b */
        final /* synthetic */ C52671b f31399b;

        /* renamed from: c */
        final /* synthetic */ C52682m f31400c;

        C11830a(ListViewModel listViewModel, C52671b bVar, C52682m mVar) {
            this.f31398a = listViewModel;
            this.f31399b = bVar;
            this.f31400c = mVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IListState iListState = (IListState) obj;
            C52711k.m112240b(iListState, "rawState");
            ListState listState = (ListState) iListState.getSubstate();
            if (listState.getHasMore().f31440a && !(listState.getLoadMore() instanceof C11911k)) {
                this.f31398a.mo22523a((C2201v) this.f31399b.invoke(iListState), (C52682m<? super S, ? super C11787a<? extends T>, ? extends S>) new C52682m<S, C11787a<? extends C52847n<? extends List<? extends T>, ? extends P>>, S>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C11830a f31401a;

                    {
                        this.f31401a = r1;
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:5:0x006c, code lost:
                        if (r2 == null) goto L_0x006e;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
                        /*
                            r12 = this;
                            com.bytedance.jedi.arch.ext.list.IListState r13 = (com.bytedance.jedi.arch.ext.list.IListState) r13
                            com.bytedance.jedi.arch.a r14 = (com.bytedance.jedi.arch.C11787a) r14
                            java.lang.String r0 = "$receiver"
                            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
                            java.lang.String r0 = "loadMore"
                            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r0)
                            java.lang.Object r0 = r14.mo22538a()
                            d.n r0 = (p2628d.C52847n) r0
                            if (r0 == 0) goto L_0x009d
                            java.lang.Object r1 = r0.component1()
                            java.util.List r1 = (java.util.List) r1
                            java.lang.Object r0 = r0.component2()
                            r3 = r0
                            com.bytedance.jedi.arch.ext.list.l r3 = (com.bytedance.jedi.arch.ext.list.C11865l) r3
                            com.bytedance.jedi.arch.ext.list.ListViewModel$a r0 = r12.f31401a
                            com.bytedance.jedi.arch.ext.list.ListViewModel r0 = r0.f31398a
                            int r2 = r1.size()
                            r4 = 0
                            r0.mo22585a(r2, r4)
                            com.bytedance.jedi.arch.ext.list.ListViewModel$a r0 = r12.f31401a
                            d.f.a.m r0 = r0.f31400c
                            com.bytedance.jedi.arch.s r2 = r13.getSubstate()
                            com.bytedance.jedi.arch.ext.list.ListState r2 = (com.bytedance.jedi.arch.ext.list.ListState) r2
                            java.util.List r2 = r2.getList()
                            java.lang.Object r0 = r0.invoke(r2, r1)
                            java.util.List r0 = (java.util.List) r0
                            com.bytedance.jedi.arch.s r2 = r13.getSubstate()
                            com.bytedance.jedi.arch.ext.list.ListState r2 = (com.bytedance.jedi.arch.ext.list.ListState) r2
                            com.bytedance.jedi.arch.ext.list.b r10 = com.bytedance.jedi.arch.ext.list.ListViewModel.m24174a(r2, r0)
                            if (r3 == 0) goto L_0x006e
                            com.bytedance.jedi.arch.s r2 = r13.getSubstate()
                            com.bytedance.jedi.arch.ext.list.ListState r2 = (com.bytedance.jedi.arch.ext.list.ListState) r2
                            com.bytedance.jedi.arch.w r4 = new com.bytedance.jedi.arch.w
                            r4.<init>(r1)
                            r6 = r4
                            com.bytedance.jedi.arch.a r6 = (com.bytedance.jedi.arch.C11787a) r6
                            r5 = 0
                            r8 = 4
                            r9 = 0
                            r4 = r0
                            r7 = r10
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9)
                            com.bytedance.jedi.arch.s r2 = (com.bytedance.jedi.arch.C11932s) r2
                            com.bytedance.jedi.arch.NestedState r2 = r13.newSubstate(r2)
                            if (r2 != 0) goto L_0x008e
                        L_0x006e:
                            com.bytedance.jedi.arch.s r2 = r13.getSubstate()
                            r4 = r2
                            com.bytedance.jedi.arch.ext.list.ListState r4 = (com.bytedance.jedi.arch.ext.list.ListState) r4
                            r5 = 0
                            r7 = 0
                            com.bytedance.jedi.arch.w r2 = new com.bytedance.jedi.arch.w
                            r2.<init>(r1)
                            r8 = r2
                            com.bytedance.jedi.arch.a r8 = (com.bytedance.jedi.arch.C11787a) r8
                            r1 = 5
                            r11 = 0
                            r6 = r0
                            r9 = r10
                            r10 = r1
                            com.bytedance.jedi.arch.ext.list.ListState r0 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11)
                            com.bytedance.jedi.arch.s r0 = (com.bytedance.jedi.arch.C11932s) r0
                            com.bytedance.jedi.arch.NestedState r2 = r13.newSubstate(r0)
                        L_0x008e:
                            if (r2 == 0) goto L_0x0095
                            com.bytedance.jedi.arch.ext.list.IListState r2 = (com.bytedance.jedi.arch.ext.list.IListState) r2
                            if (r2 != 0) goto L_0x00f5
                            goto L_0x009d
                        L_0x0095:
                            d.u r13 = new d.u
                            java.lang.String r14 = "null cannot be cast to non-null type S"
                            r13.<init>(r14)
                            throw r13
                        L_0x009d:
                            boolean r0 = r14 instanceof com.bytedance.jedi.arch.C11795c
                            if (r0 == 0) goto L_0x00d0
                            com.bytedance.jedi.arch.ext.list.ListViewModel$a r0 = r12.f31401a
                            com.bytedance.jedi.arch.ext.list.ListViewModel r0 = r0.f31398a
                            r1 = 0
                            com.bytedance.jedi.arch.c r14 = (com.bytedance.jedi.arch.C11795c) r14
                            java.lang.Throwable r2 = r14.f31301a
                            r0.mo22585a(r1, r2)
                            com.bytedance.jedi.arch.s r0 = r13.getSubstate()
                            r1 = r0
                            com.bytedance.jedi.arch.ext.list.ListState r1 = (com.bytedance.jedi.arch.ext.list.ListState) r1
                            r2 = 0
                            r3 = 0
                            r4 = 0
                            com.bytedance.jedi.arch.c r0 = new com.bytedance.jedi.arch.c
                            java.lang.Throwable r14 = r14.f31301a
                            r0.<init>(r14)
                            r5 = r0
                            com.bytedance.jedi.arch.a r5 = (com.bytedance.jedi.arch.C11787a) r5
                            r6 = 0
                            r7 = 23
                            r8 = 0
                            com.bytedance.jedi.arch.ext.list.ListState r14 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r1, r2, r3, r4, r5, r6, r7, r8)
                            com.bytedance.jedi.arch.s r14 = (com.bytedance.jedi.arch.C11932s) r14
                            com.bytedance.jedi.arch.NestedState r13 = r13.newSubstate(r14)
                            goto L_0x00f0
                        L_0x00d0:
                            com.bytedance.jedi.arch.s r14 = r13.getSubstate()
                            r0 = r14
                            com.bytedance.jedi.arch.ext.list.ListState r0 = (com.bytedance.jedi.arch.ext.list.ListState) r0
                            r1 = 0
                            r2 = 0
                            r3 = 0
                            com.bytedance.jedi.arch.k r14 = new com.bytedance.jedi.arch.k
                            r14.<init>()
                            r4 = r14
                            com.bytedance.jedi.arch.a r4 = (com.bytedance.jedi.arch.C11787a) r4
                            r5 = 0
                            r6 = 23
                            r7 = 0
                            com.bytedance.jedi.arch.ext.list.ListState r14 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                            com.bytedance.jedi.arch.s r14 = (com.bytedance.jedi.arch.C11932s) r14
                            com.bytedance.jedi.arch.NestedState r13 = r13.newSubstate(r14)
                        L_0x00f0:
                            if (r13 == 0) goto L_0x00f6
                            r2 = r13
                            com.bytedance.jedi.arch.ext.list.IListState r2 = (com.bytedance.jedi.arch.ext.list.IListState) r2
                        L_0x00f5:
                            return r2
                        L_0x00f6:
                            d.u r13 = new d.u
                            java.lang.String r14 = "null cannot be cast to non-null type S"
                            r13.<init>(r14)
                            throw r13
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListViewModel.C11830a.C118311.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$b */
    static final class C11832b extends C52712l implements C52671b<S, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f31402a;

        /* renamed from: b */
        final /* synthetic */ C52671b f31403b;

        /* renamed from: c */
        final /* synthetic */ C52682m f31404c;

        C11832b(ListViewModel listViewModel, C52671b bVar, C52682m mVar) {
            this.f31402a = listViewModel;
            this.f31403b = bVar;
            this.f31404c = mVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IListState iListState = (IListState) obj;
            C52711k.m112240b(iListState, "rawState");
            if (!(((ListState) iListState.getSubstate()).getRefresh() instanceof C11911k)) {
                this.f31402a.mo22523a((C2201v) this.f31403b.invoke(iListState), (C52682m<? super S, ? super C11787a<? extends T>, ? extends S>) new C52682m<S, C11787a<? extends C52847n<? extends List<? extends T>, ? extends P>>, S>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C11832b f31405a;

                    {
                        this.f31405a = r1;
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0061, code lost:
                        if (r2 == null) goto L_0x0063;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
                        /*
                            r12 = this;
                            com.bytedance.jedi.arch.ext.list.IListState r13 = (com.bytedance.jedi.arch.ext.list.IListState) r13
                            com.bytedance.jedi.arch.a r14 = (com.bytedance.jedi.arch.C11787a) r14
                            java.lang.String r0 = "$receiver"
                            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
                            java.lang.String r0 = "refresh"
                            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r0)
                            java.lang.Object r0 = r14.mo22538a()
                            d.n r0 = (p2628d.C52847n) r0
                            if (r0 == 0) goto L_0x0093
                            java.lang.Object r1 = r0.component1()
                            java.util.List r1 = (java.util.List) r1
                            java.lang.Object r0 = r0.component2()
                            r3 = r0
                            com.bytedance.jedi.arch.ext.list.l r3 = (com.bytedance.jedi.arch.ext.list.C11865l) r3
                            com.bytedance.jedi.arch.ext.list.ListViewModel$b r0 = r12.f31405a
                            d.f.a.m r0 = r0.f31404c
                            com.bytedance.jedi.arch.s r2 = r13.getSubstate()
                            com.bytedance.jedi.arch.ext.list.ListState r2 = (com.bytedance.jedi.arch.ext.list.ListState) r2
                            java.util.List r2 = r2.getList()
                            java.lang.Object r0 = r0.invoke(r2, r1)
                            java.util.List r0 = (java.util.List) r0
                            com.bytedance.jedi.arch.s r2 = r13.getSubstate()
                            com.bytedance.jedi.arch.ext.list.ListState r2 = (com.bytedance.jedi.arch.ext.list.ListState) r2
                            com.bytedance.jedi.arch.ext.list.b r10 = com.bytedance.jedi.arch.ext.list.ListViewModel.m24174a(r2, r0)
                            if (r3 == 0) goto L_0x0063
                            com.bytedance.jedi.arch.s r2 = r13.getSubstate()
                            com.bytedance.jedi.arch.ext.list.ListState r2 = (com.bytedance.jedi.arch.ext.list.ListState) r2
                            com.bytedance.jedi.arch.w r4 = new com.bytedance.jedi.arch.w
                            r4.<init>(r1)
                            r5 = r4
                            com.bytedance.jedi.arch.a r5 = (com.bytedance.jedi.arch.C11787a) r5
                            r6 = 0
                            r8 = 8
                            r9 = 0
                            r4 = r0
                            r7 = r10
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9)
                            com.bytedance.jedi.arch.s r2 = (com.bytedance.jedi.arch.C11932s) r2
                            com.bytedance.jedi.arch.NestedState r2 = r13.newSubstate(r2)
                            if (r2 != 0) goto L_0x0084
                        L_0x0063:
                            com.bytedance.jedi.arch.s r2 = r13.getSubstate()
                            r4 = r2
                            com.bytedance.jedi.arch.ext.list.ListState r4 = (com.bytedance.jedi.arch.ext.list.ListState) r4
                            r5 = 0
                            com.bytedance.jedi.arch.w r2 = new com.bytedance.jedi.arch.w
                            r2.<init>(r1)
                            r7 = r2
                            com.bytedance.jedi.arch.a r7 = (com.bytedance.jedi.arch.C11787a) r7
                            r8 = 0
                            r1 = 9
                            r11 = 0
                            r6 = r0
                            r9 = r10
                            r10 = r1
                            com.bytedance.jedi.arch.ext.list.ListState r0 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11)
                            com.bytedance.jedi.arch.s r0 = (com.bytedance.jedi.arch.C11932s) r0
                            com.bytedance.jedi.arch.NestedState r2 = r13.newSubstate(r0)
                        L_0x0084:
                            if (r2 == 0) goto L_0x008b
                            com.bytedance.jedi.arch.ext.list.IListState r2 = (com.bytedance.jedi.arch.ext.list.IListState) r2
                            if (r2 != 0) goto L_0x00e1
                            goto L_0x0093
                        L_0x008b:
                            d.u r13 = new d.u
                            java.lang.String r14 = "null cannot be cast to non-null type S"
                            r13.<init>(r14)
                            throw r13
                        L_0x0093:
                            boolean r0 = r14 instanceof com.bytedance.jedi.arch.C11795c
                            if (r0 == 0) goto L_0x00bc
                            com.bytedance.jedi.arch.s r0 = r13.getSubstate()
                            r1 = r0
                            com.bytedance.jedi.arch.ext.list.ListState r1 = (com.bytedance.jedi.arch.ext.list.ListState) r1
                            r2 = 0
                            r3 = 0
                            com.bytedance.jedi.arch.c r0 = new com.bytedance.jedi.arch.c
                            com.bytedance.jedi.arch.c r14 = (com.bytedance.jedi.arch.C11795c) r14
                            java.lang.Throwable r14 = r14.f31301a
                            r0.<init>(r14)
                            r4 = r0
                            com.bytedance.jedi.arch.a r4 = (com.bytedance.jedi.arch.C11787a) r4
                            r5 = 0
                            r6 = 0
                            r7 = 27
                            r8 = 0
                            com.bytedance.jedi.arch.ext.list.ListState r14 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r1, r2, r3, r4, r5, r6, r7, r8)
                            com.bytedance.jedi.arch.s r14 = (com.bytedance.jedi.arch.C11932s) r14
                            com.bytedance.jedi.arch.NestedState r13 = r13.newSubstate(r14)
                            goto L_0x00dc
                        L_0x00bc:
                            com.bytedance.jedi.arch.s r14 = r13.getSubstate()
                            r0 = r14
                            com.bytedance.jedi.arch.ext.list.ListState r0 = (com.bytedance.jedi.arch.ext.list.ListState) r0
                            r1 = 0
                            r2 = 0
                            com.bytedance.jedi.arch.k r14 = new com.bytedance.jedi.arch.k
                            r14.<init>()
                            r3 = r14
                            com.bytedance.jedi.arch.a r3 = (com.bytedance.jedi.arch.C11787a) r3
                            r4 = 0
                            r5 = 0
                            r6 = 27
                            r7 = 0
                            com.bytedance.jedi.arch.ext.list.ListState r14 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                            com.bytedance.jedi.arch.s r14 = (com.bytedance.jedi.arch.C11932s) r14
                            com.bytedance.jedi.arch.NestedState r13 = r13.newSubstate(r14)
                        L_0x00dc:
                            if (r13 == 0) goto L_0x00e2
                            r2 = r13
                            com.bytedance.jedi.arch.ext.list.IListState r2 = (com.bytedance.jedi.arch.ext.list.IListState) r2
                        L_0x00e1:
                            return r2
                        L_0x00e2:
                            d.u r13 = new d.u
                            java.lang.String r14 = "null cannot be cast to non-null type S"
                            r13.<init>(r14)
                            throw r13
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListViewModel.C11832b.C118331.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$c */
    static final class C11834c extends C52712l implements C52670a<C118351> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f31406a;

        C11834c(ListViewModel listViewModel) {
            this.f31406a = listViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C11839a(this) {

                /* renamed from: a */
                final /* synthetic */ C11834c f31407a;

                /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$c$1$a */
                static final class C11836a extends C52712l implements C52671b<S, C52860x> {

                    /* renamed from: a */
                    final /* synthetic */ C52671b f31408a;

                    C11836a(C52671b bVar) {
                        this.f31408a = bVar;
                        super(1);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        IListState iListState = (IListState) obj;
                        C52711k.m112240b(iListState, "it");
                        if (((ListState) iListState.getSubstate()).getHasMore().f31440a) {
                            this.f31408a.invoke(Integer.valueOf(((ListState) iListState.getSubstate()).getList().size()));
                        }
                        return C52860x.f131107a;
                    }
                }

                /* renamed from: a */
                public final void mo22568a() {
                    this.f31407a.f31406a.mo22588k();
                }

                {
                    this.f31407a = r1;
                }

                /* renamed from: a */
                public final void mo22569a(C52671b<? super Integer, C52860x> bVar) {
                    C52711k.m112240b(bVar, "itemCountSupplier");
                    this.f31407a.f31406a.mo22527b(new C11836a(bVar));
                }
            };
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C52671b<S, C2201v<C52847n<List<T>, P>>> mo22558g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C52671b<S, C2201v<C52847n<List<T>, P>>> mo22559h() {
        return this.f31395e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C52682m<List<? extends T>, List<? extends T>, List<T>> mo22586i() {
        return this.f31396f;
    }

    /* renamed from: j */
    public final void mo22587j() {
        C52682m<List<? extends T>, List<? extends T>, List<T>> mVar = this.f31394d;
        C52671b g = mo22558g();
        C52711k.m112240b(mVar, "refreshStrategy");
        C52711k.m112240b(g, "refreshCall");
        mo22527b(new C11832b(this, g, mVar));
    }

    /* renamed from: k */
    public final void mo22588k() {
        C52671b h = mo22559h();
        if (h != null) {
            C52682m i = mo22586i();
            C52711k.m112240b(i, "loadMoreStrategy");
            C52711k.m112240b(h, "loadMoreCall");
            mo22527b(new C11830a(this, h, i));
        }
    }

    /* renamed from: a */
    public final void mo22560a(int i) {
        ((C118351) this.f31397g.getValue()).mo22560a(i);
    }

    /* renamed from: a */
    public static C11853b m24174a(ListState<T, P> listState, List<? extends T> list) {
        boolean isEmpty = list.isEmpty();
        if (isEmpty == listState.isEmpty().f31440a) {
            return listState.isEmpty();
        }
        return new C11853b(isEmpty);
    }

    /* renamed from: a */
    public final void mo22585a(int i, Throwable th) {
        C52668f<C118351> fVar = this.f31397g;
        if (fVar.isInitialized()) {
            ((C118351) fVar.getValue()).mo22592a(i, th);
        }
    }
}
